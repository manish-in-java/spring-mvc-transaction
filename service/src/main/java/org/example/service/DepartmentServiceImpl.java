/*
 * See the file license.txt in the main project folder
 * for license and other legal information.
 */

package org.example.service;

import org.example.data.DepartmentRepository;
import org.example.domain.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionSynchronizationManager;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class DepartmentServiceImpl implements DepartmentService
{
  @Autowired
  private DepartmentRepository departmentRepository;

  @Transactional
  public List<Department> getAll()
  {
    System.out.println(TransactionSynchronizationManager.isActualTransactionActive());

    return departmentRepository.findAll();
  }
}
