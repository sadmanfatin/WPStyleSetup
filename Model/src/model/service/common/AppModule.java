package model.service.common;

import oracle.jbo.ApplicationModule;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Sep 01 11:21:00 BDT 2021
// ---------------------------------------------------------------------
public interface AppModule extends ApplicationModule {
    void setSessionValues(String orgId, String userId, String respId,
                          String respApplId);
}
