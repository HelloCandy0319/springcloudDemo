package com.example.demo;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Test4 {
    public static void main(String[] args) {
        String path = "C:\\File\\SVN\\lis_biz_new\\lis_biz\\lis_biz_java\\src\\main\\java\\";
        String newPath = "C:\\File\\lis_biz_new1\\";
//        String oldPath = "com\\sinosoft\\lis\\bq\\GEdorDetail.java";
        List<String> reason = new ArrayList<>();
        String[] strings = {"com\\sinosoft\\lis\\bq\\GEdorDetail.java",
                "com\\sinosoft\\lis\\fininterface\\TransType.java",
                "com\\sinosoft\\ws\\server\\invork\\DQXBiNoRepListDataDeal.java",
                "com\\sinosoft\\ws\\server\\invork\\YBTCalContDataDeal.java",
                "com\\sinosoft\\ws\\server\\invork\\YBTBQReversalDataDeal.java",
                "com\\sinosoft\\ws\\server\\invork\\YBTCURMsgTransmitDataDeal.java",
                "com\\sinosoft\\ws\\server\\invork\\DQXCertifyCX2DataDeal.java",
                "com\\sinosoft\\ws\\server\\invork\\XSGetCusLevelDataDeal.java",
                "com\\sinosoft\\ws\\server\\invork\\YBTTBReconciliationDataDeal.java",
                "com\\sinosoft\\ws\\server\\invork\\WXDATenCalData.java",
                "com\\sinosoft\\ws\\server\\invork\\YBTOldChangeQueryDataDeal.java",
                "com\\sinosoft\\ws\\server\\invork\\YBTPolicyChgStateDataDeal.java",
                "com\\sinosoft\\ws\\server\\invork\\WXZXConfirmDate.java",
                "com\\sinosoft\\ws\\server\\invork\\AbstractBiNoUnnoticeListSyncDataDeal.java",
                "com\\sinosoft\\ws\\server\\invork\\XSAdvancePerfmcDataDeal.java",
                "com\\sinosoft\\ws\\server\\invork\\YBTIndiDueFeeConfirmDataDeal.java",
                "com\\sinosoft\\ws\\server\\invork\\DQXBiNoUnnoticeListSyncDataDeal.java",
                "com\\sinosoft\\ws\\server\\invork\\DQXCertifyCXDataDeal.java",
                "com\\sinosoft\\ws\\server\\invork\\XSPayableRemindDataDeal.java",
                "com\\sinosoft\\ws\\server\\invork\\YBTTransferPolicyConfirm.java",
                "com\\sinosoft\\ws\\server\\invork\\TMGetRenewalByContDataDeal.java",
                "com\\sinosoft\\ws\\server\\invork\\XSPolicyQueryDetailDataDeal.java",
                "com\\sinosoft\\ws\\server\\invork\\XSUnderWPerfmcDataDeal.java",
                "com\\sinosoft\\ws\\server\\invork\\YBTWtCtLgDeal.java",
                "com\\sinosoft\\ws\\server\\invork\\YBTAutoReverseDataDeal.java",
                "com\\sinosoft\\ws\\server\\invork\\POSPolicyCollectionDataDeal.java",
                "com\\sinosoft\\ws\\server\\invork\\XSNewReceiptDetailDataDeal.java",
                "com\\sinosoft\\ws\\server\\invork\\YBTWTBusRetrunDataDeal.java",
                "com\\sinosoft\\ws\\server\\invork\\XSNewProblemDetailDataDeal.java",
                "com\\sinosoft\\ws\\server\\invork\\YBTIndiDueFeeReverseDataDeal.java",
                "com\\sinosoft\\ws\\server\\invork\\DQXCertifyFPCXDataDeal.java",
                "com\\sinosoft\\ws\\server\\invork\\YBTWtCtLgCalDeal.java",
                "com\\sinosoft\\ws\\server\\invork\\TX_ContList_DataDeal.java",
                "com\\sinosoft\\ws\\server\\invork\\XSNewPhyExamDetailDataDeal.java",
                "com\\sinosoft\\ws\\server\\invork\\UnifyPRTDataDeal.java",
                "com\\sinosoft\\ws\\server\\invork\\AbstractBiNoRepListDataDeal.java",
                "com\\sinosoft\\ws\\server\\invork\\XSAdvancePerfmcDetailDataDeal.java",
                "com\\sinosoft\\ws\\server\\invork\\POSPolicyQueryDataDeal.java",
                "com\\sinosoft\\ws\\server\\invork\\WXDAConfirmData.java",
                "com\\sinosoft\\ws\\server\\invork\\GRPBiNoRepListDataDeal.java",
                "com\\sinosoft\\ws\\server\\invork\\YBTCURConfirmDataDeal.java",
                "com\\sinosoft\\ws\\server\\invork\\YBTNonRealTimeRetrunDataDeal.java",
                "com\\sinosoft\\ws\\server\\invork\\GRPBiNoUnnoticeListSyncDataDeal.java",
                "com\\sinosoft\\ws\\server\\invork\\YBTContQueryDataDeal.java",
                "com\\sinosoft\\ws\\server\\invork\\YBTChgAcceptStateDataDeal.java",
                "com\\sinosoft\\ws\\server\\invork\\YBTIndiDueFeeQueryDataDeal.java",
                "com\\sinosoft\\ws\\server\\invork\\YBTWTReversalDataDeal.java",
                "com\\sinosoft\\ws\\server\\invork\\YBTHandOutDataQuery.java",
                "com\\sinosoft\\ws\\server\\invork\\WXGetContInfoByContNoDataDeal.java",
                "com\\sinosoft\\ws\\server\\invork\\YBTIndiDueFeeCheckDataDeal.java",
                "com\\sinosoft\\ws\\server\\invork\\XSNewReceiptDataDeal.java",
                "com\\sinosoft\\ws\\server\\invork\\XSPolicyQueryDataDeal.java",
                "com\\sinosoft\\ws\\server\\invork\\WXDAQueryData.java",
                "com\\sinosoft\\ws\\server\\invork\\XSPayableRemindDetailDataDeal.java",
                "com\\sinosoft\\ws\\server\\invork\\DQXCertifyDZCXDataDeal.java",
                "com\\sinosoft\\ws\\server\\invork\\YBTCTLGReconciliationDataDeal.java",
                "com\\sinosoft\\ws\\server\\invork\\YBTTransferPolicyTrial.java",
                "com\\sinosoft\\ws\\server\\invork\\XSNewPhyExamDataDeal.java",
                "com\\sinosoft\\ws\\server\\invork\\CCGetContInfoByContNoDataDeal.java",
                "com\\sinosoft\\ws\\server\\invork\\YBTModifyContInfoDataDeal.java",
                "com\\sinosoft\\ws\\server\\invork\\XSNewProblemDataDeal.java",
                "com\\sinosoft\\ws\\server\\invork\\YBTWithdrawContDataDeal.java",
                "com\\sinosoft\\lis\\bq\\GrpEdorPTDetailBLF.java",
                "com\\sinosoft\\lis\\bq\\PEdorLiveInquiryBL.java",
                "com\\sinosoft\\lis\\bq\\GrpEdorIODetailBLF.java",
                "com\\sinosoft\\lis\\bq\\PEdorRGDetailBL.java",
                "com\\sinosoft\\lis\\bq\\ContTerm.java",
                "com\\sinosoft\\lis\\bq\\PEdorBPWXPrintBL.java",
                "com\\sinosoft\\lis\\bq\\GrpEdorYCDetailBLF.java",
                "com\\sinosoft\\lis\\bq\\GrpEdorICConfirmBL.java",
                "com\\sinosoft\\lis\\bq\\GrpEdorRFConfirmBL.java",
                "com\\sinosoft\\lis\\bq\\GrpEdorYBDetailBLF.java",
                "com\\sinosoft\\lis\\bq\\GrpEdorBLDetailBLF.java",
                "com\\sinosoft\\lis\\bq\\GrpEdorRECancelBL.java",
                "com\\sinosoft\\lis\\bq\\GrpEdorGRPrintBL.java",
                "com\\sinosoft\\lis\\bq\\PEdorSpotCheckDealBL.java",
                "com\\sinosoft\\lis\\bq\\GrpEdorLNConfirmBL.java",
                "com\\sinosoft\\lis\\bq\\PEdorAPBackConfirmBL.java",
                "com\\sinosoft\\lis\\bq\\GrpEdorGBPrintBL.java",
                "com\\sinosoft\\lis\\bq\\GrpEdorGBDetailBL.java",
                "com\\sinosoft\\lis\\bq\\GrpEdorBCPrintBL.java",
                "com\\sinosoft\\lis\\bq\\GrpEdorANPrintBL.java",
                "com\\sinosoft\\lis\\bq\\GrpEdorIRPrintBL.java",
                "com\\sinosoft\\lis\\bq\\PEdorAPDetailBL.java",
                "com\\sinosoft\\lis\\bq\\PEdorPFConfirmBL.java",
                "com\\sinosoft\\lis\\bq\\GrpEdorEADetailBLF.java",
                "com\\sinosoft\\lis\\bq\\GrpEdorREConfirmBL.java",
                "com\\sinosoft\\lis\\bq\\GrpEdorICDetailBL.java",
                "com\\sinosoft\\lis\\bq\\GrpEdorRDConfirmBL.java",
                "com\\sinosoft\\lis\\bq\\PEdorZBPrintBL.java",
                "com\\sinosoft\\lis\\bq\\GEdorContManuUWBL.java",
                "com\\sinosoft\\lis\\bq\\PEdorWPPrintBL.java",
                "com\\sinosoft\\lis\\bq\\GrpEdorFMConfirmBL.java",
                "com\\sinosoft\\lis\\bq\\GrpEdorLNDetailBL.java",
                "com\\sinosoft\\lis\\bq\\GrpEdorNCPrintBL.java",
                "com\\sinosoft\\lis\\bq\\GrpEdorWSCancelBL.java",
                "com\\sinosoft\\lis\\bq\\PEdorZBWXPrintBL.java",
                "com\\sinosoft\\lis\\bq\\GrpEdorPTDetailBL.java",
                "com\\sinosoft\\lis\\bq\\GrpEdorWSAppConfirmBL.java",
                "com\\sinosoft\\lis\\bq\\GrpEdorBDConfirmBL.java",
                "com\\sinosoft\\lis\\bq\\GrpEdorFMDetailBLF.java",
                "com\\sinosoft\\lis\\bq\\GrpEdorWSConfirmBL.java",
                "com\\sinosoft\\lis\\bq\\PEdorSpotCheckModifyBL.java",
                "com\\sinosoft\\lis\\bq\\BQIEdorPayGetFormChangeDealBL.java",
                "com\\sinosoft\\lis\\bq\\PEdorRGConfirmBL.java",
                "com\\sinosoft\\lis\\bq\\GrpEdorWSDetailBLF.java",
                "com\\sinosoft\\lis\\bq\\GrpEdorGBDetailBLF.java",
                "com\\sinosoft\\lis\\bq\\PEdorWXDetailBLF.java",
                "com\\sinosoft\\lis\\bq\\GrpEdorNIPrintBL.java",
                "com\\sinosoft\\lis\\bq\\GrpEdorGMDetailBLF.java",
                "com\\sinosoft\\lis\\bq\\GrpEdorEAConfirmBL.java",
                "com\\sinosoft\\lis\\bq\\PEdorSpotCheckQueryBL.java",
                "com\\sinosoft\\lis\\bq\\GrpEdorBLDetailBL.java",
                "com\\sinosoft\\lis\\bq\\ContTermNotice.java",
                "com\\sinosoft\\lis\\bq\\GrpEdorBCDetailBLF.java",
                "com\\sinosoft\\lis\\bq\\GrpEdorREPrintBL.java",
                "com\\sinosoft\\lis\\bq\\ContInvaliNotice.java",
                "com\\sinosoft\\lis\\bq\\PEdorSpotCheckQueryUpdMissionBL.java",
                "com\\sinosoft\\lis\\bq\\GrpEdorBLConfirmBL.java",
                "com\\sinosoft\\lis\\bq\\GrpEdorGCConfirmBL.java",
                "com\\sinosoft\\lis\\bq\\GrpEdorAGPrintBL.java",
                "com\\sinosoft\\lis\\bq\\PEdorUWAppConfirmBL.java",
                "com\\sinosoft\\lis\\bq\\PEdorBHWXPrintBL.java",
                "com\\sinosoft\\lis\\bq\\GrpEdorXTPrintBL.java",
                "com\\sinosoft\\lis\\bq\\GrpEdorZTPrintBL.java",
                "com\\sinosoft\\lis\\bq\\GrpEdorWSDetailBL.java",
                "com\\sinosoft\\lis\\bq\\GrpEdorADPrintBL.java",
                "com\\sinosoft\\lis\\bq\\GrpEdorLNDetailBLF.java",
                "com\\sinosoft\\lis\\bq\\GrpEdorYCDetailBL.java",
                "com\\sinosoft\\lis\\bq\\GrpEdorIODetailBL.java",
                "com\\sinosoft\\lis\\bq\\PEdorRBDetailBLF.java",
                "com\\sinosoft\\lis\\bq\\PEdorHJPrintBL.java",
                "com\\sinosoft\\lis\\bq\\PEdorBCConfirmBL.java",
                "com\\sinosoft\\lis\\bq\\GrpEdorFMDetailBL.java",
                "com\\sinosoft\\lis\\bq\\RNMessageDealBL.java",
                "com\\sinosoft\\lis\\bq\\GrpEdorYBConfirmBL.java",
                "com\\sinosoft\\lis\\bq\\PEdorWTWXPrintBL.java",
                "com\\sinosoft\\lis\\bq\\GrpEdorCTConfirmBL.java",
                "com\\sinosoft\\lis\\bq\\InsuAccBalaRollBackBL.java",
                "com\\sinosoft\\lis\\bq\\GrpEdorBDDetailBL.java",
                "com\\sinosoft\\lis\\bq\\GrpEdorAGDetailBL.java",
                "com\\sinosoft\\lis\\bq\\ContInvali.java",
                "com\\sinosoft\\lis\\bq\\GrpEdorPTConfirmBL.java",
                "com\\sinosoft\\lis\\bq\\GrpEdorGMDetailBL.java",
                "com\\sinosoft\\lis\\bq\\PEdorAPConfirmBL.java",
                "com\\sinosoft\\lis\\bq\\PEdorPFBackConfirmBL.java",
                "com\\sinosoft\\lis\\bq\\GrpEdorSDPrintBL.java",
                "com\\sinosoft\\lis\\bq\\GrpEdorBBDetailBL.java",
                "com\\sinosoft\\lis\\bq\\PEdorContPwdBL.java",
                "com\\sinosoft\\lis\\bq\\GrpEdorSDConfirmBL.java",
                "com\\sinosoft\\lis\\bq\\GrpEdorRDDetailBL.java",
                "com\\sinosoft\\lis\\bq\\GrpEdorBCDetailBL.java",
                "com\\sinosoft\\lis\\bq\\PEdorPFDetailBLF.java",
                "com\\sinosoft\\lis\\bq\\GrpEdorGCDetailBLF.java",
                "com\\sinosoft\\lis\\bq\\GrpEdorREDetailBL.java",
                "com\\sinosoft\\lis\\bq\\GrpEdorYCConfirmBL.java",
                "com\\sinosoft\\lis\\bq\\GrpEdorXTDetailBLF.java",
                "com\\sinosoft\\lis\\bq\\GrpEdorWMPrintBL.java",
                "com\\sinosoft\\lis\\bq\\PEdorTSDetailBL.java",
                "com\\sinosoft\\lis\\bq\\GrpEdorRFDetailBL.java",
                "com\\sinosoft\\lis\\bq\\PEdorRGDetailBLF.java",
                "com\\sinosoft\\lis\\bq\\GrpEdorRDDetailBLF.java",
                "com\\sinosoft\\lis\\bq\\GrpEdorPTPrintBL.java",
                "com\\sinosoft\\lis\\bq\\GrpEdorBCConfirmBL.java",
                "com\\sinosoft\\lis\\bq\\PEdorYWDetailBLF.java",
                "com\\sinosoft\\lis\\bq\\PEdorAMWXPrintBL.java",
                "com\\sinosoft\\lis\\bq\\GrpEdorRDPrintBL.java",
                "com\\sinosoft\\lis\\bq\\GrpEdorBDPrintBL.java",
                "com\\sinosoft\\lis\\bq\\GrpEdorIOPrintBL.java",
                "com\\sinosoft\\lis\\bq\\GrpEdorBLPrintBL.java",
                "com\\sinosoft\\lis\\bq\\GrpEdorXTConfirmBL.java",
                "com\\sinosoft\\lis\\bq\\GrpEdorOGDetailBL.java",
                "com\\sinosoft\\lis\\bq\\GrpEdorRFDetailBLF.java",
                "com\\sinosoft\\lis\\bq\\GrpEdorICDetailBLF.java",
                "com\\sinosoft\\lis\\bq\\GrpEdorXSPrintBL.java",
                "com\\sinosoft\\lis\\bq\\GrpEdorBDDetailBLF.java",
                "com\\sinosoft\\lis\\bq\\GrpEdorBBDetailBLF.java",
                "com\\sinosoft\\lis\\bq\\PEdorZXWXPrintBL.java",
                "com\\sinosoft\\lis\\bq\\PEdorAPDetailBLF.java",
                "com\\sinosoft\\lis\\tb\\TransContInfoUI.java",
                "com\\sinosoft\\lis\\tb\\TransContInfoBL.java",
                "com\\sinosoft\\lis\\tb\\DSImpartBL.java",
                "com\\sinosoft\\lis\\tb\\DSGetBL.java",
                "com\\sinosoft\\lis\\tb\\PrepareBOMTBBL.java",
                "com\\sinosoft\\lis\\uw\\FinNoFeeSureBL.java",
                "com\\sinosoft\\lis\\uw\\FinNoFeeSureUI.java",
                "com\\sinosoft\\lis\\acc\\TLReportBoxTransferBL.java",
                "com\\sinosoft\\lis\\acc\\TLTransferMoneyPrint.java",
                "com\\sinosoft\\lis\\acc\\TLReportValueDate2PrintBL.java",
                "com\\sinosoft\\lis\\aml\\ExeSQL1.java",
                "com\\sinosoft\\lis\\aml\\DubitPkgMakeZIPBL.java",
                "com\\sinosoft\\lis\\aml\\DubitMsgMakeDealBL.java",
                "com\\sinosoft\\lis\\aml\\TradeInfoCheck.java",
                "com\\sinosoft\\lis\\aml\\DubitMsgPkgApplyBL.java",
                "com\\sinosoft\\lis\\aml\\AMLXMLUtil.java",
                "com\\sinosoft\\lis\\aml\\RiskCustomerUI.java",
                "com\\sinosoft\\lis\\aml\\DubitMsgMakeXMLBL.java",
                "com\\sinosoft\\lis\\aml\\RiskCustomerBL.java",
                "com\\sinosoft\\lis\\aml\\LXIHTradeInterFaceService.java",
                "com\\sinosoft\\lis\\aml\\DubitPkgMakeDealBL.java",
                "com\\sinosoft\\lis\\aml\\blacklist\\bean\\CountryList.java",
                "com\\sinosoft\\lis\\aml\\blacklist\\bean\\Description2List.java",
                "com\\sinosoft\\lis\\aml\\blacklist\\bean\\DateTypeList.java",
                "com\\sinosoft\\lis\\aml\\blacklist\\bean\\NameTypeList.java",
                "com\\sinosoft\\lis\\aml\\blacklist\\bean\\RoleTypeList.java",
                "com\\sinosoft\\lis\\aml\\blacklist\\bean\\OccupationList.java",
                "com\\sinosoft\\lis\\aml\\blacklist\\bean\\RelationshipList.java",
                "com\\sinosoft\\lis\\aml\\blacklist\\bean\\Description3List.java",
                "com\\sinosoft\\lis\\aml\\blacklist\\bean\\Description1List.java",
                "com\\sinosoft\\lis\\aml\\blacklist\\bean\\SanctionsReferencesList.java",
                "com\\sinosoft\\lis\\aml\\manualcorrection\\MCIHToXml.java",
                "com\\sinosoft\\lis\\get\\BonusPreCountBL.java",
                "com\\sinosoft\\lis\\bank\\LJBankReturnAuditBL.java",
                "com\\sinosoft\\lis\\bank\\WriteToFileFXBLForTTF.java",
                "com\\sinosoft\\lis\\bank\\LJBankPrepidFeeBL.java",
                "com\\sinosoft\\lis\\bank\\BankClaimBL.java",
                "com\\sinosoft\\lis\\page\\MSRCusRiskTargetValPage.java",
                "com\\sinosoft\\lis\\page\\MSRCusAccontPreviousQueryPage.java",
                "com\\sinosoft\\lis\\page\\MSRCusStrSurveyMainPage.java",
                "com\\sinosoft\\lis\\page\\MSRRiskScoreConfigurePage.java",
                "com\\sinosoft\\lis\\page\\MSRCusAreaScoreWarningPage.java",
                "com\\sinosoft\\lis\\page\\MSRCusRiskScoreValPage.java",
                "com\\sinosoft\\lis\\page\\MSRCusStrDueSurveyReportPage.java",
                "com\\sinosoft\\lis\\page\\MSRWorkSysRiskValPage.java",
                "com\\sinosoft\\lis\\page\\MSRAreaRiskLevelWarningPage.java",
                "com\\sinosoft\\lis\\page\\MsrCalcRiskTempPage.java",
                "com\\sinosoft\\lis\\page\\MSRCusStrenDueImgQueryPage.java",
                "com\\sinosoft\\lis\\page\\MSRCusAddSurveyRecordPage.java",
                "com\\sinosoft\\lis\\page\\MSRCusRiskInfoPage.java",
                "com\\sinosoft\\lis\\page\\MSRCusChangeQueryInfoPage.java",
                "com\\sinosoft\\lis\\page\\MSRImpCusAttchListPage.java",
                "com\\sinosoft\\lis\\page\\MSRModifyAppntInfoPage.java",
                "com\\sinosoft\\lis\\page\\MsrRiskQueryPage.java",
                "com\\sinosoft\\lis\\page\\MSRCusSurveyQueryInfoPage.java",
                "com\\sinosoft\\lis\\page\\MSRCusLifeSurveyResultPage.java",
                "com\\sinosoft\\lis\\page\\MSRCusAccontRiskInfoPage.java",
                "com\\sinosoft\\lis\\page\\MSRCusLayerWarningPage.java",
                "com\\sinosoft\\lis\\page\\MSRCusAccontScoreBasePage.java",
                "com\\sinosoft\\lis\\page\\MSRCusNegativeInfoPage.java",
                "com\\sinosoft\\lis\\page\\MSRCalcBatFailPage.java",
                "com\\sinosoft\\lis\\page\\MSRReCheckPage.java",
                "com\\sinosoft\\lis\\page\\MSRCusSurveryStatisticsPage.java",
                "com\\sinosoft\\lis\\page\\MSRCusStrChangeMainPage.java",
                "com\\sinosoft\\lis\\page\\MSRCusAccontScoreRecordPage.java",
                "com\\sinosoft\\lis\\page\\MSRCusRiskGradePrintPage.java",
                "com\\sinosoft\\lis\\page\\MSRCusLevelLineWarningPage.java",
                "com\\sinosoft\\lis\\bqgrp\\GrpEdorRFConfirmBL.java",
                "com\\sinosoft\\lis\\bqgrp\\GrpEdorGMDetailBLOLD.java",
                "com\\sinosoft\\lis\\bqgrp\\GrpEdorLNConfirmBL.java",
                "com\\sinosoft\\lis\\bqgrp\\GrpEdorREConfirmBL.java",
                "com\\sinosoft\\lis\\bqgrp\\GrpReportManualBL.java",
                "com\\sinosoft\\lis\\bqgrp\\GrpEdorLNDetailBLF.java",
                "com\\sinosoft\\lis\\claim\\ClaimUnsuccessfulBL.java",
                "com\\sinosoft\\lis\\claim\\RClaimUnsuccessfulBL.java",
                "com\\sinosoft\\lis\\claim\\LLThirdPartySurveyConfigBL.java",
                "com\\sinosoft\\lis\\claim\\LLSurveyFeeImportInputBL.java",
                "com\\sinosoft\\lis\\claim\\LLClaimRepairBL.java",
                "com\\sinosoft\\lis\\claim\\LLClaimTemplateInputBL.java",
                "com\\sinosoft\\lis\\msrbl\\Snippet.java",
                "com\\sinosoft\\lis\\msrbl\\MSRWorkSysRiskValBL.java",
                "com\\sinosoft\\lis\\tbgrp\\GrpUWFlowBL.java",
                "com\\sinosoft\\lis\\tbgrp\\GrpUWFlowUI.java",
                "com\\sinosoft\\lis\\tbgrp\\GrpUpReportRiskUI.java",
                "com\\sinosoft\\lis\\tbgrp\\GrpUpReportUI.java",
                "com\\sinosoft\\lis\\tbgrp\\ReSplitBL.java",
                "com\\sinosoft\\lis\\finfee\\LJPolFeeWithdrawBL.java",
                "com\\sinosoft\\lis\\finfee\\finpay\\LJTempUrgePayPolicy.java",
                "com\\sinosoft\\lis\\finfee\\finpay\\LJTempContinuePolicy.java",
                "com\\sinosoft\\lis\\llcase\\LLClaimBL.java",
                "com\\sinosoft\\lis\\llcase\\LLRepresentInputBL.java",
                "com\\sinosoft\\lis\\llcase\\OutsourcingCostExportBL.java",
                "com\\sinosoft\\lis\\llcase\\LLPrintSave.java",
                "com\\sinosoft\\lis\\llcase\\OutServiceConfigBL.java",
                "com\\sinosoft\\lis\\llcase\\OutsourcingCostPrintBL.java",
                "com\\sinosoft\\lis\\llcase\\LLCLaimQueryCase.java",
                "com\\sinosoft\\lis\\balance\\BalanceInfoExpBL.java",
                "com\\sinosoft\\lis\\cbcheck\\TransApplyContUI.java",
                "com\\sinosoft\\lis\\cbcheck\\TaxCheckContUI.java",
                "com\\sinosoft\\lis\\cbcheck\\TransApplyContBL.java",
                "com\\sinosoft\\lis\\cbcheck\\TransClaimQueryUI.java",
                "com\\sinosoft\\lis\\cbcheck\\TransClaimQueryBL.java",
                "com\\sinosoft\\lis\\cbcheck\\GetContTaxCodeBL.java",
                "com\\sinosoft\\lis\\cbcheck\\GrpRReportDealSaveBL.java",
                "com\\sinosoft\\lis\\f1print\\PhoneBonusToCncBL.java",
                "com\\sinosoft\\lis\\f1print\\VIPCustomerQueryPrintBL.java",
                "com\\sinosoft\\lis\\f1print\\InvalidPolToPostBL.java",
                "com\\sinosoft\\lis\\f1print\\BankComPremListBL.java",
                "com\\sinosoft\\lis\\f1print\\PersonBonusToPostBL.java",
                "com\\sinosoft\\lis\\f1print\\GrpPayNoticePrintBL.java",
                "com\\sinosoft\\lis\\f1print\\ProxyBonusToPostBL.java",
                "com\\sinosoft\\lis\\f1print\\GrpPaymentListUI.java",
                "com\\sinosoft\\lis\\midplat\\util\\ContextListener.java",
                "com\\sinosoft\\lis\\midplat\\util\\ExportExcel3.java",
                "com\\sinosoft\\lis\\midplat\\util\\ContextListenerForICBC.java",
                "com\\sinosoft\\lis\\midplat\\util\\ZipManager.java",
                "com\\sinosoft\\lis\\midplat\\kernel\\boundary\\IndexNumber.java",
                "com\\sinosoft\\lis\\midplat\\channel\\security\\NothingSecurity.java",
                "com\\sinosoft\\lis\\operfee\\RecalibrationBackBL.java",
                "com\\sinosoft\\lis\\operfee\\ExchangeToReceivedBL.java",
                "com\\sinosoft\\lis\\operfee\\RenewalHangBL.java",
                "com\\sinosoft\\lis\\operfee\\EasyRecalibrationBL.java",
                "com\\sinosoft\\lis\\operfee\\ThirdFilesMake.java",
                "com\\sinosoft\\lis\\claimgrp\\LLClaimTData.java",
                "com\\sinosoft\\lis\\claimgrp\\LLCaseReceiptClassExcel.java",
                "com\\sinosoft\\lis\\claimgrp\\CreateClaimTemplate.java",
                "com\\sinosoft\\lis\\claimgrp\\PublicCreateExcel.java",
                "com\\sinosoft\\lis\\claimgrp\\TemplateToPdf.java",
                "com\\sinosoft\\lis\\claimgrp\\CreateReceiptClassImportTemplate.java",
                "com\\sinosoft\\lis\\claimgrp\\ManagePrtBill.java",
                "com\\sinosoft\\lis\\customer\\FICustomerHB.java",
                "com\\sinosoft\\lis\\customer\\FICustomerZD.java",
                "com\\sinosoft\\lis\\customer\\VIPCustomerAdjustBL.java",
                "com\\sinosoft\\lis\\easyscan\\service\\DocTBRReportWorkFlowService.java",
                "com\\sinosoft\\lis\\easyscan\\service\\DocBQNoticeUpdate2.java",
                "com\\sinosoft\\lis\\easyscan\\service\\DocBQGrpWorkFlowServer.java",
                "com\\sinosoft\\lis\\easyscan\\service\\DocReadmeCheckService.java",
                "com\\sinosoft\\lis\\easyscan\\service\\DocTBCBankInfoRelationService.java",
                "com\\sinosoft\\lis\\easyscan\\service\\DocBQWorkFlowAfterService.java",
                "com\\sinosoft\\lis\\easyscan\\service\\DocTBIssueRelationService.java",
                "com\\sinosoft\\lis\\easyscan\\service\\DocTBYWYWorkFlowService.java",
                "com\\sinosoft\\lis\\easyscan\\service\\DocBQWorkFlowService.java",
                "com\\sinosoft\\lis\\easyscan\\service\\DocTBTZSService.java",
                "com\\sinosoft\\lis\\easyscan\\service\\DocBQGrpWorkFlowAfterServer.java",
                "com\\sinosoft\\lis\\easyscan\\service\\GBQNoticeRelationService.java",
                "com\\sinosoft\\lis\\easyscan\\service\\DocTBYBTCheckService.java",
                "com\\sinosoft\\lis\\easyscan\\service\\GrpInsuCheckService.java",
                "com\\sinosoft\\lis\\easyscan\\service\\DocTBCBankInfoWorkFlowService.java",
                "com\\sinosoft\\lis\\easyscan\\service\\DocTBAfterInputUploadRelationService.java",
                "com\\sinosoft\\lis\\easyscan\\service\\GrpNoticeCheckService.java",
                "com\\sinosoft\\lis\\easyscan\\service\\GrpNoticeRelationService.java",
                "com\\sinosoft\\lis\\easyscan\\service\\DocTBCustomerWorkFlowService.java",
                "com\\sinosoft\\lis\\easyscan\\service\\DocTBGrpOtherCheckService.java",
                "com\\sinosoft\\lis\\easyscan\\service\\GrpInsuRelationService.java",
                "com\\sinosoft\\lis\\easyscan\\service\\DocTBUN113WorkFlowService.java",
                "com\\sinosoft\\lis\\easyscan\\service\\DocTBUn003RelationService.java",
                "com\\sinosoft\\lis\\easyscan\\service\\DocBQXLUploadService.java",
                "com\\sinosoft\\lis\\easyscan\\service\\DocTBDecideWorkFlowService.java",
                "com\\sinosoft\\lis\\easyscan\\service\\DocTBUn113RelationService.java",
                "com\\sinosoft\\lis\\easyscan\\service\\DocBQWTJServer.java",
                "com\\sinosoft\\lis\\easyscan\\service\\DocTBUN003WorkFlowService.java",
                "com\\sinosoft\\lis\\easyscan\\service\\DocTBRReportRelationService.java",
                "com\\sinosoft\\lis\\easyscan\\service\\GrpNoticeUpdateStatusService.java",
                "com\\sinosoft\\lis\\easyscan\\service\\DocLPBankService.java",
                "com\\sinosoft\\lis\\easyscan\\service\\DocLPHBWtjService.java",
                "com\\sinosoft\\lis\\easyscan\\service\\DocTBYWYRelationService.java",
                "com\\sinosoft\\lis\\easyscan\\service\\NoActionService.java",
                "com\\sinosoft\\lis\\easyscan\\service\\DocLPUploadRelationService.java",
                "com\\sinosoft\\lis\\easyscan\\service\\DocTBIssueWorkFlowService.java",
                "com\\sinosoft\\lis\\easyscan\\service\\DocTBBeforeUploadService.java",
                "com\\sinosoft\\lis\\easyscan\\service\\DocBQNoticeUpdate1.java",
                "com\\sinosoft\\lis\\easyscan\\service\\GrpInsuService.java",
                "com\\sinosoft\\lis\\easyscan\\service\\DocUWBQWorkFlowService.java",
                "com\\sinosoft\\lis\\easyscan\\service\\DocTBUploadCheckService.java",
                "com\\sinosoft\\lis\\easyscan\\service\\DocTBDecideNoticeRelationService.java",
                "com\\sinosoft\\lis\\easyscan\\service\\DocXBTzsService.java",
                "com\\sinosoft\\lis\\easyscan\\service\\DocBQBankService.java",
                "com\\sinosoft\\lis\\easyscan\\service\\DocTBCustomerRelationService.java",
                "com\\sinosoft\\lis\\easyscan\\service\\util\\DocPageCheck.java",
                "com\\sinosoft\\lis\\easyscan\\service\\util\\TZSNumCheck.java",
                "com\\sinosoft\\lis\\easyscan\\outsourcing\\EsDocMove.java",
                "com\\sinosoft\\lis\\grpoperfee\\PcproposalPrintUI.java",
                "com\\sinosoft\\lis\\grpoperfee\\PcproposalPrintBL.java",
                "com\\sinosoft\\lis\\taskservice\\taskinstance\\SimpleAgentMsgCSVTask.java",
                "com\\sinosoft\\lis\\taskservice\\taskinstance\\ReinsureAutoTask.java",
                "com\\sinosoft\\lis\\taskservice\\taskinstance\\SignBatchPrintTask.java",
                "com\\sinosoft\\lis\\taskservice\\taskinstance\\RiskAmntCSVTask.java",
                "com\\sinosoft\\lis\\taskservice\\taskinstance\\BQSendMessageTask.java",
                "com\\sinosoft\\lis\\taskservice\\taskinstance\\SysMsgCSVTask.java",
                "com\\sinosoft\\lis\\taskservice\\taskinstance\\LCContModifyTask.java",
                "com\\sinosoft\\lis\\taskservice\\taskinstance\\TaskServiceRSSGenerate.java",
                "com\\sinosoft\\lis\\fininterface\\checkdata\\FIRuleEngineService.java",
                "com\\sinosoft\\workflow\\bq\\PEdorAppUWAutoHealthAfterEndService.java",
                "com\\sinosoft\\workflow\\bq\\ManuUWBeforeInitService.java",
                "com\\sinosoft\\workflow\\bq\\PEdorWaitingForCheckAfterInitService.java",
                "com\\sinosoft\\workflow\\bq\\PEdorCheckingAfterInitService.java",
                "com\\sinosoft\\workflow\\bq\\PEdorCheckModifyAfterInitService.java",
                "com\\sinosoft\\workflow\\bq\\BQUWConfirmAfterInitService.java",
                "com\\sinosoft\\workflow\\aml\\LargeTradeFileMakeAfterInitService.java",
                "com\\sinosoft\\workflow\\aml\\LXIHAffirmAfterInitService.java",
                "com\\sinosoft\\workflow\\aml\\LXISModifyAfterInitService.java",
                "com\\sinosoft\\workflow\\aml\\DeleteLXISAppAfterInitService.java",
                "com\\sinosoft\\workflow\\aml\\CorrectLXISAppAfterInitService.java",
                "com\\sinosoft\\workflow\\aml\\DeleteLXIHAppAfterInitService.java",
                "com\\sinosoft\\workflow\\aml\\DubitPkgMakeAfterInitService.java",
                "com\\sinosoft\\workflow\\aml\\CorrectLXIHAppAfterInitService.java",
                "com\\sinosoft\\workflow\\aml\\DubitMsgMakeAfterInitService.java",
                "com\\sinosoft\\workflow\\aml\\LXIHModifyAfterInitService.java",
                "com\\sinosoft\\workflow\\aml\\LXISAffirmAfterInitService.java",
                "com\\sinosoft\\workflow\\aml\\LargeTradePackageMakeAfterInitService.java",
                "com\\sinosoft\\workflow\\circ\\CWDataFromSqlserverToOracle.java",
                "com\\sinosoft\\workflow\\circ\\ExcelReading.java",
                "com\\sinosoft\\workflow\\circ\\ThreadStart.java",
                "com\\sinosoft\\workflow\\circ\\ZBDataFromSqlserverToOracle.java",
                "com\\sinosoft\\workflow\\askprice\\PrtNoBL.java",
                "com\\sinosoft\\workflow\\askprice\\InterviewPrintBL.java",
                "com\\sinosoft\\workflow\\askprice\\LQCalBL.java",
                "com\\sinosoft\\workflow\\askprice\\SaveJobBL.java",
        };
        System.out.println(strings.length);
        for (String oldPath: strings){
            reason.addAll(CreateFile(path,newPath,oldPath));
        }

        if (reason!=null){
            for (String s:reason){
                System.out.println(s);
            }
            System.out.println(reason.size());
        }

//        List<String> re = getFileName(newPath,reason);
//        for (String res: re){
//            System.out.println(res);
//        }
//        System.out.println(re.size());
    }

    public static List<String> getFileName(String path,List<String> pathNames){
        File file = new File(path);
        File[] files = file.listFiles();
        for (File f: files){
            if (f.isFile()){
                String filePath = f.getName();
                pathNames.add(filePath);
            }else{
                if (f.isDirectory()){
                    getFileName(f.getPath(),pathNames);
                }
            }
        }
        return pathNames;

    }

    /**
     * 根据路径新建文件
     * @param path
     * @param newPath
     * @param oldPath
     * @return
     */

    public static List<String> CreateFile(String path,String newPath,String oldPath){
        List<String> notExistsFiles = new ArrayList<>();
        String realPath = path+oldPath;
        File file = new File(realPath);
        if (!file.exists()){
            notExistsFiles.add(oldPath);
        }else{
            if (!file.isFile()){
                notExistsFiles.add(oldPath);
            }else{
                String newRealPath = newPath+oldPath;
                int index = newRealPath.lastIndexOf("\\");
                String direPath = newRealPath.substring(0,index);
                if (!new File(direPath).exists()){
                    new File(direPath).mkdirs();
                    file.renameTo(new File(newRealPath));
                }else {
                    file.renameTo(new File(newRealPath));
                }
            }
        }
        return notExistsFiles;
    }
}
