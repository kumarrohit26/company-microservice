package com.jobs.companyms.company;

import java.util.List;

public interface CompanyService {
    List<Company> getAllCompanies();

    Company getCompanyById(Long id);

    Company updateCompanyById(Long id, Company company);

    Company createCompany(Company company);

    boolean deleteCompanyById(Long id);
}
