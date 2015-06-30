/**
 * Copyright (C) 2014-2015 Philip Helger (www.helger.com)
 * philip[at]helger[dot]com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.helger.ubl20.codelist;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.helger.commons.annotation.CodingStyleguideUnaware;
import com.helger.commons.annotation.Nonempty;
import com.helger.commons.id.IHasID;
import com.helger.commons.lang.EnumHelper;
import com.helger.commons.name.IHasDisplayName;


/**
 * This file is generated from Genericode file BinaryObjectMimeCode-2.0.gc. Do NOT edit!
 * 
 */
@CodingStyleguideUnaware
public enum EBinaryObjectMimeCode20
    implements IHasID<String> , IHasDisplayName
{
    application_CSTAdata_xml("application/CSTAdata+xml", ""),
    application_EDI_Consent("application/EDI-Consent", ""),
    application_EDI_X12("application/EDI-X12", ""),
    application_EDIFACT("application/EDIFACT", ""),
    application_activemessage("application/activemessage", ""),
    application_andrew_inset("application/andrew-inset", ""),
    application_applefile("application/applefile", ""),
    application_atomicmail("application/atomicmail", ""),
    application_batch_SMTP("application/batch-SMTP", ""),
    application_beep_xml("application/beep+xml", ""),
    application_cals_1840("application/cals-1840", ""),
    application_cnrp_xml("application/cnrp+xml", ""),
    application_commonground("application/commonground", ""),
    application_cpl_xml("application/cpl+xml", ""),
    application_csta_xml("application/csta+xml", ""),
    application_cybercash("application/cybercash", ""),
    application_dca_rft("application/dca-rft", ""),
    application_dec_dx("application/dec-dx", ""),
    application_dialog_info_xml("application/dialog-info+xml", ""),
    application_dicom("application/dicom", ""),
    application_dns("application/dns", ""),
    application_dvcs("application/dvcs", ""),
    application_epp_xml("application/epp+xml", ""),
    application_eshop("application/eshop", ""),
    application_fits("application/fits", ""),
    application_font_tdpfr("application/font-tdpfr", ""),
    application_http("application/http", ""),
    application_hyperstudio("application/hyperstudio", ""),
    application_iges("application/iges", ""),
    application_im_iscomposing_xml("application/im-iscomposing+xml", ""),
    application_index("application/index", ""),
    application_index_cmd("application/index.cmd", ""),
    application_index_obj("application/index.obj", ""),
    application_index_response("application/index.response", ""),
    application_index_vnd("application/index.vnd", ""),
    application_iotp("application/iotp", ""),
    application_ipp("application/ipp", ""),
    application_isup("application/isup", ""),
    application_kpml_request_xml("application/kpml-request+xml", ""),
    application_kpml_response_xml("application/kpml-response+xml", ""),
    application_mac_binhex40("application/mac-binhex40", ""),
    application_macwriteii("application/macwriteii", ""),
    application_marc("application/marc", ""),
    application_mathematica("application/mathematica", ""),
    application_mbox("application/mbox", ""),
    application_mikey("application/mikey", ""),
    application_mpeg4_generic("application/mpeg4-generic", ""),
    application_msword("application/msword", ""),
    application_news_message_id("application/news-message-id", ""),
    application_news_transmission("application/news-transmission", ""),
    application_ocsp_request("application/ocsp-request", ""),
    application_ocsp_response("application/ocsp-response", ""),
    application_octet_stream("application/octet-stream", ""),
    application_oda("application/oda", ""),
    application_ogg("application/ogg", ""),
    application_parityfec("application/parityfec", ""),
    application_pdf("application/pdf", ""),
    application_pgp_encrypted("application/pgp-encrypted", ""),
    application_pgp_keys("application/pgp-keys", ""),
    application_pgp_signature("application/pgp-signature", ""),
    application_pidf_xml("application/pidf+xml", ""),
    application_pkcs10("application/pkcs10", ""),
    application_pkcs7_mime("application/pkcs7-mime", ""),
    application_pkcs7_signature("application/pkcs7-signature", ""),
    application_pkix_cert("application/pkix-cert", ""),
    application_pkix_crl("application/pkix-crl", ""),
    application_pkix_pkipath("application/pkix-pkipath", ""),
    application_pkixcmp("application/pkixcmp", ""),
    application_postscript("application/postscript", ""),
    application_prs_alvestrand_titrax_sheet("application/prs.alvestrand.titrax-sheet", ""),
    application_prs_cww("application/prs.cww", ""),
    application_prs_nprend("application/prs.nprend", ""),
    application_prs_plucker("application/prs.plucker", ""),
    application_qsig("application/qsig", ""),
    application_rdf_xml("application/rdf+xml", ""),
    application_reginfo_xml("application/reginfo+xml", ""),
    application_remote_printing("application/remote-printing", ""),
    application_resource_lists_xml("application/resource-lists+xml", ""),
    application_riscos("application/riscos", ""),
    application_rls_services_xml("application/rls-services+xml", ""),
    application_rtf("application/rtf", ""),
    application_samlassertion_xml("application/samlassertion+xml", ""),
    application_samlmetadata_xml("application/samlmetadata+xml", ""),
    application_sbml_xml("application/sbml+xml", ""),
    application_sdp("application/sdp", ""),
    application_set_payment("application/set-payment", ""),
    application_set_payment_initiation("application/set-payment-initiation", ""),
    application_set_registration("application/set-registration", ""),
    application_set_registration_initiation("application/set-registration-initiation", ""),
    application_sgml("application/sgml", ""),
    application_sgml_open_catalog("application/sgml-open-catalog", ""),
    application_shf_xml("application/shf+xml", ""),
    application_sieve("application/sieve", ""),
    application_simple_filter_xml("application/simple-filter+xml", ""),
    application_simple_message_summary("application/simple-message-summary", ""),
    application_slate("application/slate", ""),
    application_soap_xml("application/soap+xml", ""),
    application_spirits_event_xml("application/spirits-event+xml", ""),
    application_timestamp_query("application/timestamp-query", ""),
    application_timestamp_reply("application/timestamp-reply", ""),
    application_tve_trigger("application/tve-trigger", ""),
    application_vemmi("application/vemmi", ""),
    application_vnd_3M_Post_it_Notes("application/vnd.3M.Post-it-Notes", ""),
    application_vnd_3gpp_pic_bw_large("application/vnd.3gpp.pic-bw-large", ""),
    application_vnd_3gpp_pic_bw_small("application/vnd.3gpp.pic-bw-small", ""),
    application_vnd_3gpp_pic_bw_var("application/vnd.3gpp.pic-bw-var", ""),
    application_vnd_3gpp_sms("application/vnd.3gpp.sms", ""),
    application_vnd_FloGraphIt("application/vnd.FloGraphIt", ""),
    application_vnd_Kinar("application/vnd.Kinar", ""),
    application_vnd_Mobius_DAF("application/vnd.Mobius.DAF", ""),
    application_vnd_Mobius_DIS("application/vnd.Mobius.DIS", ""),
    application_vnd_Mobius_MBK("application/vnd.Mobius.MBK", ""),
    application_vnd_Mobius_MQY("application/vnd.Mobius.MQY", ""),
    application_vnd_Mobius_MSL("application/vnd.Mobius.MSL", ""),
    application_vnd_Mobius_PLC("application/vnd.Mobius.PLC", ""),
    application_vnd_Mobius_TXF("application/vnd.Mobius.TXF", ""),
    application_vnd_Quark_QuarkXPress("application/vnd.Quark.QuarkXPress", ""),
    application_vnd_RenLearn_rlprint("application/vnd.RenLearn.rlprint", ""),
    application_vnd_accpac_simply_aso("application/vnd.accpac.simply.aso", ""),
    application_vnd_accpac_simply_imp("application/vnd.accpac.simply.imp", ""),
    application_vnd_acucobol("application/vnd.acucobol", ""),
    application_vnd_acucorp("application/vnd.acucorp", ""),
    application_vnd_adobe_xfdf("application/vnd.adobe.xfdf", ""),
    application_vnd_aether_imp("application/vnd.aether.imp", ""),
    application_vnd_amiga_ami("application/vnd.amiga.ami", ""),
    application_vnd_anser_web_certificate_issue_initiation("application/vnd.anser-web-certificate-issue-initiation", ""),
    application_vnd_anser_web_funds_transfer_initiation("application/vnd.anser-web-funds-transfer-initiation", ""),
    application_vnd_audiograph("application/vnd.audiograph", ""),
    application_vnd_blueice_multipass("application/vnd.blueice.multipass", ""),
    application_vnd_bmi("application/vnd.bmi", ""),
    application_vnd_businessobjects("application/vnd.businessobjects", ""),
    application_vnd_canon_cpdl("application/vnd.canon-cpdl", ""),
    application_vnd_canon_lips("application/vnd.canon-lips", ""),
    application_vnd_cinderella("application/vnd.cinderella", ""),
    application_vnd_claymore("application/vnd.claymore", ""),
    application_vnd_commerce_battelle("application/vnd.commerce-battelle", ""),
    application_vnd_commonspace("application/vnd.commonspace", ""),
    application_vnd_contact_cmsg("application/vnd.contact.cmsg", ""),
    application_vnd_cosmocaller("application/vnd.cosmocaller", ""),
    application_vnd_criticaltools_wbs_xml("application/vnd.criticaltools.wbs+xml", ""),
    application_vnd_ctc_posml("application/vnd.ctc-posml", ""),
    application_vnd_cups_postscript("application/vnd.cups-postscript", ""),
    application_vnd_cups_raster("application/vnd.cups-raster", ""),
    application_vnd_cups_raw("application/vnd.cups-raw", ""),
    application_vnd_curl("application/vnd.curl", ""),
    application_vnd_cybank("application/vnd.cybank", ""),
    application_vnd_data_vision_rdz("application/vnd.data-vision.rdz", ""),
    application_vnd_dna("application/vnd.dna", ""),
    application_vnd_dpgraph("application/vnd.dpgraph", ""),
    application_vnd_dreamfactory("application/vnd.dreamfactory", ""),
    application_vnd_dxr("application/vnd.dxr", ""),
    application_vnd_ecdis_update("application/vnd.ecdis-update", ""),
    application_vnd_ecowin_chart("application/vnd.ecowin.chart", ""),
    application_vnd_ecowin_filerequest("application/vnd.ecowin.filerequest", ""),
    application_vnd_ecowin_fileupdate("application/vnd.ecowin.fileupdate", ""),
    application_vnd_ecowin_series("application/vnd.ecowin.series", ""),
    application_vnd_ecowin_seriesrequest("application/vnd.ecowin.seriesrequest", ""),
    application_vnd_ecowin_seriesupdate("application/vnd.ecowin.seriesupdate", ""),
    application_vnd_enliven("application/vnd.enliven", ""),
    application_vnd_epson_esf("application/vnd.epson.esf", ""),
    application_vnd_epson_msf("application/vnd.epson.msf", ""),
    application_vnd_epson_quickanime("application/vnd.epson.quickanime", ""),
    application_vnd_epson_salt("application/vnd.epson.salt", ""),
    application_vnd_epson_ssf("application/vnd.epson.ssf", ""),
    application_vnd_ericsson_quickcall("application/vnd.ericsson.quickcall", ""),
    application_vnd_eudora_data("application/vnd.eudora.data", ""),
    application_vnd_fdf("application/vnd.fdf", ""),
    application_vnd_ffsns("application/vnd.ffsns", ""),
    application_vnd_fints("application/vnd.fints", ""),
    application_vnd_framemaker("application/vnd.framemaker", ""),
    application_vnd_fsc_weblaunch("application/vnd.fsc.weblaunch", ""),
    application_vnd_fujitsu_oasys("application/vnd.fujitsu.oasys", ""),
    application_vnd_fujitsu_oasys2("application/vnd.fujitsu.oasys2", ""),
    application_vnd_fujitsu_oasys3("application/vnd.fujitsu.oasys3", ""),
    application_vnd_fujitsu_oasysgp("application/vnd.fujitsu.oasysgp", ""),
    application_vnd_fujitsu_oasysprs("application/vnd.fujitsu.oasysprs", ""),
    application_vnd_fujixerox_ddd("application/vnd.fujixerox.ddd", ""),
    application_vnd_fujixerox_docuworks("application/vnd.fujixerox.docuworks", ""),
    application_vnd_fujixerox_docuworks_binder("application/vnd.fujixerox.docuworks.binder", ""),
    application_vnd_fut_misnet("application/vnd.fut-misnet", ""),
    application_vnd_genomatix_tuxedo("application/vnd.genomatix.tuxedo", ""),
    application_vnd_grafeq("application/vnd.grafeq", ""),
    application_vnd_groove_account("application/vnd.groove-account", ""),
    application_vnd_groove_help("application/vnd.groove-help", ""),
    application_vnd_groove_identity_message("application/vnd.groove-identity-message", ""),
    application_vnd_groove_injector("application/vnd.groove-injector", ""),
    application_vnd_groove_tool_message("application/vnd.groove-tool-message", ""),
    application_vnd_groove_tool_template("application/vnd.groove-tool-template", ""),
    application_vnd_groove_vcard("application/vnd.groove-vcard", ""),
    application_vnd_hbci("application/vnd.hbci", ""),
    application_vnd_hcl_bireports("application/vnd.hcl-bireports", ""),
    application_vnd_hhe_lesson_player("application/vnd.hhe.lesson-player", ""),
    application_vnd_hp_HPGL("application/vnd.hp-HPGL", ""),
    application_vnd_hp_PCL("application/vnd.hp-PCL", ""),
    application_vnd_hp_PCLXL("application/vnd.hp-PCLXL", ""),
    application_vnd_hp_hpid("application/vnd.hp-hpid", ""),
    application_vnd_hp_hps("application/vnd.hp-hps", ""),
    application_vnd_httphone("application/vnd.httphone", ""),
    application_vnd_hzn_3d_crossword("application/vnd.hzn-3d-crossword", ""),
    application_vnd_ibm_MiniPay("application/vnd.ibm.MiniPay", ""),
    application_vnd_ibm_afplinedata("application/vnd.ibm.afplinedata", ""),
    application_vnd_ibm_electronic_media("application/vnd.ibm.electronic-media", ""),
    application_vnd_ibm_modcap("application/vnd.ibm.modcap", ""),
    application_vnd_ibm_rights_management("application/vnd.ibm.rights-management", ""),
    application_vnd_ibm_secure_container("application/vnd.ibm.secure-container", ""),
    application_vnd_informix_visionary("application/vnd.informix-visionary", ""),
    application_vnd_intercon_formnet("application/vnd.intercon.formnet", ""),
    application_vnd_intertrust_digibox("application/vnd.intertrust.digibox", ""),
    application_vnd_intertrust_nncp("application/vnd.intertrust.nncp", ""),
    application_vnd_intu_qbo("application/vnd.intu.qbo", ""),
    application_vnd_intu_qfx("application/vnd.intu.qfx", ""),
    application_vnd_ipunplugged_rcprofile("application/vnd.ipunplugged.rcprofile", ""),
    application_vnd_irepository_package_xml("application/vnd.irepository.package+xml", ""),
    application_vnd_is_xpr("application/vnd.is-xpr", ""),
    application_vnd_japannet_directory_service("application/vnd.japannet-directory-service", ""),
    application_vnd_japannet_jpnstore_wakeup("application/vnd.japannet-jpnstore-wakeup", ""),
    application_vnd_japannet_payment_wakeup("application/vnd.japannet-payment-wakeup", ""),
    application_vnd_japannet_registration("application/vnd.japannet-registration", ""),
    application_vnd_japannet_registration_wakeup("application/vnd.japannet-registration-wakeup", ""),
    application_vnd_japannet_setstore_wakeup("application/vnd.japannet-setstore-wakeup", ""),
    application_vnd_japannet_verification("application/vnd.japannet-verification", ""),
    application_vnd_japannet_verification_wakeup("application/vnd.japannet-verification-wakeup", ""),
    application_vnd_jisp("application/vnd.jisp", ""),
    application_vnd_kde_karbon("application/vnd.kde.karbon", ""),
    application_vnd_kde_kchart("application/vnd.kde.kchart", ""),
    application_vnd_kde_kformula("application/vnd.kde.kformula", ""),
    application_vnd_kde_kivio("application/vnd.kde.kivio", ""),
    application_vnd_kde_kontour("application/vnd.kde.kontour", ""),
    application_vnd_kde_kpresenter("application/vnd.kde.kpresenter", ""),
    application_vnd_kde_kspread("application/vnd.kde.kspread", ""),
    application_vnd_kde_kword("application/vnd.kde.kword", ""),
    application_vnd_kenameaapp("application/vnd.kenameaapp", ""),
    application_vnd_kidspiration("application/vnd.kidspiration", ""),
    application_vnd_koan("application/vnd.koan", ""),
    application_vnd_liberty_request_xml("application/vnd.liberty-request+xml", ""),
    application_vnd_llamagraphics_life_balance_desktop("application/vnd.llamagraphics.life-balance.desktop", ""),
    application_vnd_llamagraphics_life_balance_exchange_xml("application/vnd.llamagraphics.life-balance.exchange+xml", ""),
    application_vnd_lotus_1_2_3("application/vnd.lotus-1-2-3", ""),
    application_vnd_lotus_approach("application/vnd.lotus-approach", ""),
    application_vnd_lotus_freelance("application/vnd.lotus-freelance", ""),
    application_vnd_lotus_notes("application/vnd.lotus-notes", ""),
    application_vnd_lotus_organizer("application/vnd.lotus-organizer", ""),
    application_vnd_lotus_screencam("application/vnd.lotus-screencam", ""),
    application_vnd_lotus_wordpro("application/vnd.lotus-wordpro", ""),
    application_vnd_mcd("application/vnd.mcd", ""),
    application_vnd_mediastation_cdkey("application/vnd.mediastation.cdkey", ""),
    application_vnd_meridian_slingshot("application/vnd.meridian-slingshot", ""),
    application_vnd_mfmp("application/vnd.mfmp", ""),
    application_vnd_micrografx_flo("application/vnd.micrografx.flo", ""),
    application_vnd_micrografx_igx("application/vnd.micrografx.igx", ""),
    application_vnd_mif("application/vnd.mif", ""),
    application_vnd_minisoft_hp3000_save("application/vnd.minisoft-hp3000-save", ""),
    application_vnd_mitsubishi_misty_guard_trustweb("application/vnd.mitsubishi.misty-guard.trustweb", ""),
    application_vnd_mophun_application("application/vnd.mophun.application", ""),
    application_vnd_mophun_certificate("application/vnd.mophun.certificate", ""),
    application_vnd_motorola_flexsuite("application/vnd.motorola.flexsuite", ""),
    application_vnd_motorola_flexsuite_adsi("application/vnd.motorola.flexsuite.adsi", ""),
    application_vnd_motorola_flexsuite_fis("application/vnd.motorola.flexsuite.fis", ""),
    application_vnd_motorola_flexsuite_gotap("application/vnd.motorola.flexsuite.gotap", ""),
    application_vnd_motorola_flexsuite_kmr("application/vnd.motorola.flexsuite.kmr", ""),
    application_vnd_motorola_flexsuite_ttc("application/vnd.motorola.flexsuite.ttc", ""),
    application_vnd_motorola_flexsuite_wem("application/vnd.motorola.flexsuite.wem", ""),
    application_vnd_mozilla_xul_xml("application/vnd.mozilla.xul+xml", ""),
    application_vnd_ms_artgalry("application/vnd.ms-artgalry", ""),
    application_vnd_ms_asf("application/vnd.ms-asf", ""),
    application_vnd_ms_excel("application/vnd.ms-excel", ""),
    application_vnd_ms_lrm("application/vnd.ms-lrm", ""),
    application_vnd_ms_powerpoint("application/vnd.ms-powerpoint", ""),
    application_vnd_ms_project("application/vnd.ms-project", ""),
    application_vnd_ms_tnef("application/vnd.ms-tnef", ""),
    application_vnd_ms_works("application/vnd.ms-works", ""),
    application_vnd_ms_wpl("application/vnd.ms-wpl", ""),
    application_vnd_mseq("application/vnd.mseq", ""),
    application_vnd_msign("application/vnd.msign", ""),
    application_vnd_music_niff("application/vnd.music-niff", ""),
    application_vnd_musician("application/vnd.musician", ""),
    application_vnd_nervana("application/vnd.nervana", ""),
    application_vnd_netfpx("application/vnd.netfpx", ""),
    application_vnd_noblenet_directory("application/vnd.noblenet-directory", ""),
    application_vnd_noblenet_sealer("application/vnd.noblenet-sealer", ""),
    application_vnd_noblenet_web("application/vnd.noblenet-web", ""),
    application_vnd_nokia_landmark_wbxml("application/vnd.nokia.landmark+wbxml", ""),
    application_vnd_nokia_landmark_xml("application/vnd.nokia.landmark+xml", ""),
    application_vnd_nokia_landmarkcollection_xml("application/vnd.nokia.landmarkcollection+xml", ""),
    application_vnd_nokia_radio_preset("application/vnd.nokia.radio-preset", ""),
    application_vnd_nokia_radio_presets("application/vnd.nokia.radio-presets", ""),
    application_vnd_novadigm_EDM("application/vnd.novadigm.EDM", ""),
    application_vnd_novadigm_EDX("application/vnd.novadigm.EDX", ""),
    application_vnd_novadigm_EXT("application/vnd.novadigm.EXT", ""),
    application_vnd_obn("application/vnd.obn", ""),
    application_vnd_omads_email_xml("application/vnd.omads-email+xml", ""),
    application_vnd_omads_file_xml("application/vnd.omads-file+xml", ""),
    application_vnd_omads_folder_xml("application/vnd.omads-folder+xml", ""),
    application_vnd_osa_netdeploy("application/vnd.osa.netdeploy", ""),
    application_vnd_palm("application/vnd.palm", ""),
    application_vnd_paos_xml("application/vnd.paos.xml", ""),
    application_vnd_pg_format("application/vnd.pg.format", ""),
    application_vnd_pg_osasli("application/vnd.pg.osasli", ""),
    application_vnd_picsel("application/vnd.picsel", ""),
    application_vnd_powerbuilder6("application/vnd.powerbuilder6", ""),
    application_vnd_powerbuilder6_s("application/vnd.powerbuilder6-s", ""),
    application_vnd_powerbuilder7("application/vnd.powerbuilder7", ""),
    application_vnd_powerbuilder7_s("application/vnd.powerbuilder7-s", ""),
    application_vnd_powerbuilder75("application/vnd.powerbuilder75", ""),
    application_vnd_powerbuilder75_s("application/vnd.powerbuilder75-s", ""),
    application_vnd_previewsystems_box("application/vnd.previewsystems.box", ""),
    application_vnd_publishare_delta_tree("application/vnd.publishare-delta-tree", ""),
    application_vnd_pvi_ptid1("application/vnd.pvi.ptid1", ""),
    application_vnd_pwg_multiplexed("application/vnd.pwg-multiplexed", ""),
    application_vnd_pwg_xhtml_print_xml("application/vnd.pwg-xhtml-print+xml", ""),
    application_vnd_rapid("application/vnd.rapid", ""),
    application_vnd_s3sms("application/vnd.s3sms", ""),
    application_vnd_sealed_doc("application/vnd.sealed.doc", ""),
    application_vnd_sealed_eml("application/vnd.sealed.eml", ""),
    application_vnd_sealed_mht("application/vnd.sealed.mht", ""),
    application_vnd_sealed_net("application/vnd.sealed.net", ""),
    application_vnd_sealed_ppt("application/vnd.sealed.ppt", ""),
    application_vnd_sealed_xls("application/vnd.sealed.xls", ""),
    application_vnd_sealedmedia_softseal_html("application/vnd.sealedmedia.softseal.html", ""),
    application_vnd_sealedmedia_softseal_pdf("application/vnd.sealedmedia.softseal.pdf", ""),
    application_vnd_seemail("application/vnd.seemail", ""),
    application_vnd_shana_informed_formdata("application/vnd.shana.informed.formdata", ""),
    application_vnd_shana_informed_formtemplate("application/vnd.shana.informed.formtemplate", ""),
    application_vnd_shana_informed_interchange("application/vnd.shana.informed.interchange", ""),
    application_vnd_shana_informed_package("application/vnd.shana.informed.package", ""),
    application_vnd_smaf("application/vnd.smaf", ""),
    application_vnd_sss_cod("application/vnd.sss-cod", ""),
    application_vnd_sss_dtf("application/vnd.sss-dtf", ""),
    application_vnd_sss_ntf("application/vnd.sss-ntf", ""),
    application_vnd_street_stream("application/vnd.street-stream", ""),
    application_vnd_sus_calendar("application/vnd.sus-calendar", ""),
    application_vnd_svd("application/vnd.svd", ""),
    application_vnd_swiftview_ics("application/vnd.swiftview-ics", ""),
    application_vnd_syncml__xml("application/vnd.syncml.+xml", ""),
    application_vnd_syncml_ds_notification("application/vnd.syncml.ds.notification", ""),
    application_vnd_triscape_mxs("application/vnd.triscape.mxs", ""),
    application_vnd_trueapp("application/vnd.trueapp", ""),
    application_vnd_truedoc("application/vnd.truedoc", ""),
    application_vnd_ufdl("application/vnd.ufdl", ""),
    application_vnd_uiq_theme("application/vnd.uiq.theme", ""),
    application_vnd_uplanet_alert("application/vnd.uplanet.alert", ""),
    application_vnd_uplanet_alert_wbxml("application/vnd.uplanet.alert-wbxml", ""),
    application_vnd_uplanet_bearer_choice("application/vnd.uplanet.bearer-choice", ""),
    application_vnd_uplanet_bearer_choice_wbxml("application/vnd.uplanet.bearer-choice-wbxml", ""),
    application_vnd_uplanet_cacheop("application/vnd.uplanet.cacheop", ""),
    application_vnd_uplanet_cacheop_wbxml("application/vnd.uplanet.cacheop-wbxml", ""),
    application_vnd_uplanet_channel("application/vnd.uplanet.channel", ""),
    application_vnd_uplanet_channel_wbxml("application/vnd.uplanet.channel-wbxml", ""),
    application_vnd_uplanet_list("application/vnd.uplanet.list", ""),
    application_vnd_uplanet_list_wbxml("application/vnd.uplanet.list-wbxml", ""),
    application_vnd_uplanet_listcmd("application/vnd.uplanet.listcmd", ""),
    application_vnd_uplanet_listcmd_wbxml("application/vnd.uplanet.listcmd-wbxml", ""),
    application_vnd_uplanet_signal("application/vnd.uplanet.signal", ""),
    application_vnd_vcx("application/vnd.vcx", ""),
    application_vnd_vectorworks("application/vnd.vectorworks", ""),
    application_vnd_vidsoft_vidconference("application/vnd.vidsoft.vidconference", ""),
    application_vnd_visio("application/vnd.visio", ""),
    application_vnd_visionary("application/vnd.visionary", ""),
    application_vnd_vividence_scriptfile("application/vnd.vividence.scriptfile", ""),
    application_vnd_vsf("application/vnd.vsf", ""),
    application_vnd_wap_sic("application/vnd.wap.sic", ""),
    application_vnd_wap_slc("application/vnd.wap.slc", ""),
    application_vnd_wap_wbxml("application/vnd.wap.wbxml", ""),
    application_vnd_wap_wmlc("application/vnd.wap.wmlc", ""),
    application_vnd_wap_wmlscriptc("application/vnd.wap.wmlscriptc", ""),
    application_vnd_webturbo("application/vnd.webturbo", ""),
    application_vnd_wordperfect("application/vnd.wordperfect", ""),
    application_vnd_wqd("application/vnd.wqd", ""),
    application_vnd_wrq_hp3000_labelled("application/vnd.wrq-hp3000-labelled", ""),
    application_vnd_wt_stf("application/vnd.wt.stf", ""),
    application_vnd_wv_csp_wbxml("application/vnd.wv.csp+wbxml", ""),
    application_vnd_wv_csp_xml("application/vnd.wv.csp+xml", ""),
    application_vnd_wv_ssp_xml("application/vnd.wv.ssp+xml", ""),
    application_vnd_xara("application/vnd.xara", ""),
    application_vnd_xfdl("application/vnd.xfdl", ""),
    application_vnd_yamaha_hv_dic("application/vnd.yamaha.hv-dic", ""),
    application_vnd_yamaha_hv_script("application/vnd.yamaha.hv-script", ""),
    application_vnd_yamaha_hv_voice("application/vnd.yamaha.hv-voice", ""),
    application_vnd_yamaha_smaf_audio("application/vnd.yamaha.smaf-audio", ""),
    application_vnd_yamaha_smaf_phrase("application/vnd.yamaha.smaf-phrase", ""),
    application_vnd_yellowriver_custom_menu("application/vnd.yellowriver-custom-menu", ""),
    application_watcherinfo_xml("application/watcherinfo+xml", ""),
    application_whoispp_query("application/whoispp-query", ""),
    application_whoispp_response("application/whoispp-response", ""),
    application_wita("application/wita", ""),
    application_wordperfect5_1("application/wordperfect5.1", ""),
    application_x400_bp("application/x400-bp", ""),
    application_xhtml_xml("application/xhtml+xml", ""),
    application_xml("application/xml", ""),
    application_xml_dtd("application/xml-dtd", ""),
    application_xml_external_parsed_entity("application/xml-external-parsed-entity", ""),
    application_xmpp_xml("application/xmpp+xml", ""),
    application_xop_xml("application/xop+xml", ""),
    application_zip("application/zip", ""),
    audio_32kadpcm("audio/32kadpcm", ""),
    audio_3gpp("audio/3gpp", ""),
    audio_AMR("audio/AMR", ""),
    audio_AMR_WB("audio/AMR-WB", ""),
    audio_BV16("audio/BV16", ""),
    audio_BV32("audio/BV32", ""),
    audio_CN("audio/CN", ""),
    audio_DAT12("audio/DAT12", ""),
    audio_DVI4("audio/DVI4", ""),
    audio_EVRC("audio/EVRC", ""),
    audio_EVRC_QCP("audio/EVRC-QCP", ""),
    audio_EVRC0("audio/EVRC0", ""),
    audio_G_722_1("audio/G.722.1", ""),
    audio_G722("audio/G722", ""),
    audio_G723("audio/G723", ""),
    audio_G726_16("audio/G726-16", ""),
    audio_G726_24("audio/G726-24", ""),
    audio_G726_32("audio/G726-32", ""),
    audio_G726_40("audio/G726-40", ""),
    audio_G728("audio/G728", ""),
    audio_G729("audio/G729", ""),
    audio_G729D("audio/G729D", ""),
    audio_G729E("audio/G729E", ""),
    audio_GSM("audio/GSM", ""),
    audio_GSM_EFR("audio/GSM-EFR", ""),
    audio_L16("audio/L16", ""),
    audio_L20("audio/L20", ""),
    audio_L24("audio/L24", ""),
    audio_L8("audio/L8", ""),
    audio_LPC("audio/LPC", ""),
    audio_MP4A_LATM("audio/MP4A-LATM", ""),
    audio_MPA("audio/MPA", ""),
    audio_PCMA("audio/PCMA", ""),
    audio_PCMU("audio/PCMU", ""),
    audio_QCELP("audio/QCELP", ""),
    audio_RED("audio/RED", ""),
    audio_SMV("audio/SMV", ""),
    audio_SMV_QCP("audio/SMV-QCP", ""),
    audio_SMV0("audio/SMV0", ""),
    audio_VDVI("audio/VDVI", ""),
    audio_basic("audio/basic", ""),
    audio_clearmode("audio/clearmode", ""),
    audio_dsr_es201108("audio/dsr-es201108", ""),
    audio_dsr_es202050("audio/dsr-es202050", ""),
    audio_dsr_es202211("audio/dsr-es202211", ""),
    audio_dsr_es202212("audio/dsr-es202212", ""),
    audio_iLBC("audio/iLBC", ""),
    audio_mpa_robust("audio/mpa-robust", ""),
    audio_mpeg("audio/mpeg", ""),
    audio_mpeg4_generic("audio/mpeg4-generic", ""),
    audio_parityfec("audio/parityfec", ""),
    audio_prs_sid("audio/prs.sid", ""),
    audio_telephone_event("audio/telephone-event", ""),
    audio_tone("audio/tone", ""),
    audio_vnd_3gpp_iufp("audio/vnd.3gpp.iufp", ""),
    audio_vnd_audiokoz("audio/vnd.audiokoz", ""),
    audio_vnd_cisco_nse("audio/vnd.cisco.nse", ""),
    audio_vnd_cns_anp1("audio/vnd.cns.anp1", ""),
    audio_vnd_cns_inf1("audio/vnd.cns.inf1", ""),
    audio_vnd_digital_winds("audio/vnd.digital-winds", ""),
    audio_vnd_everad_plj("audio/vnd.everad.plj", ""),
    audio_vnd_lucent_voice("audio/vnd.lucent.voice", ""),
    audio_vnd_nokia_mobile_xmf("audio/vnd.nokia.mobile-xmf", ""),
    audio_vnd_nortel_vbk("audio/vnd.nortel.vbk", ""),
    audio_vnd_nuera_ecelp4800("audio/vnd.nuera.ecelp4800", ""),
    audio_vnd_nuera_ecelp7470("audio/vnd.nuera.ecelp7470", ""),
    audio_vnd_nuera_ecelp9600("audio/vnd.nuera.ecelp9600", ""),
    audio_vnd_octel_sbc("audio/vnd.octel.sbc", ""),
    audio_vnd_qcelp("audio/vnd.qcelp", ""),
    audio_vnd_rhetorex_32kadpcm("audio/vnd.rhetorex.32kadpcm", ""),
    audio_vnd_sealedmedia_softseal_mpeg("audio/vnd.sealedmedia.softseal.mpeg", ""),
    audio_vnd_vmx_cvsd("audio/vnd.vmx.cvsd", ""),
    image_cgm("image/cgm", ""),
    image_fits("image/fits", ""),
    image_g3fax("image/g3fax", ""),
    image_gif("image/gif", ""),
    image_ief("image/ief", ""),
    image_jp2("image/jp2", ""),
    image_jpeg("image/jpeg", ""),
    image_jpm("image/jpm", ""),
    image_jpx("image/jpx", ""),
    image_naplps("image/naplps", ""),
    image_png("image/png", ""),
    image_prs_btif("image/prs.btif", ""),
    image_prs_pti("image/prs.pti", ""),
    image_t38("image/t38", ""),
    image_tiff("image/tiff", ""),
    image_tiff_fx("image/tiff-fx", ""),
    image_vnd_cns_inf2("image/vnd.cns.inf2", ""),
    image_vnd_djvu("image/vnd.djvu", ""),
    image_vnd_dwg("image/vnd.dwg", ""),
    image_vnd_dxf("image/vnd.dxf", ""),
    image_vnd_fastbidsheet("image/vnd.fastbidsheet", ""),
    image_vnd_fpx("image/vnd.fpx", ""),
    image_vnd_fst("image/vnd.fst", ""),
    image_vnd_fujixerox_edmics_mmr("image/vnd.fujixerox.edmics-mmr", ""),
    image_vnd_fujixerox_edmics_rlc("image/vnd.fujixerox.edmics-rlc", ""),
    image_vnd_globalgraphics_pgb("image/vnd.globalgraphics.pgb", ""),
    image_vnd_microsoft_icon("image/vnd.microsoft.icon", ""),
    image_vnd_mix("image/vnd.mix", ""),
    image_vnd_ms_modi("image/vnd.ms-modi", ""),
    image_vnd_net_fpx("image/vnd.net-fpx", ""),
    image_vnd_sealed_png("image/vnd.sealed.png", ""),
    image_vnd_sealedmedia_softseal_gif("image/vnd.sealedmedia.softseal.gif", ""),
    image_vnd_sealedmedia_softseal_jpg("image/vnd.sealedmedia.softseal.jpg", ""),
    image_vnd_svf("image/vnd.svf", ""),
    image_vnd_wap_wbmp("image/vnd.wap.wbmp", ""),
    image_vnd_xiff("image/vnd.xiff", ""),
    message_CPIM("message/CPIM", ""),
    message_delivery_status("message/delivery-status", ""),
    message_disposition_notification("message/disposition-notification", ""),
    message_external_body("message/external-body", ""),
    message_http("message/http", ""),
    message_news("message/news", ""),
    message_partial("message/partial", ""),
    message_rfc822("message/rfc822", ""),
    message_s_http("message/s-http", ""),
    message_sip("message/sip", ""),
    message_sipfrag("message/sipfrag", ""),
    message_tracking_status("message/tracking-status", ""),
    model_iges("model/iges", ""),
    model_mesh("model/mesh", ""),
    model_vnd_dwf("model/vnd.dwf", ""),
    model_vnd_flatland_3dml("model/vnd.flatland.3dml", ""),
    model_vnd_gdl("model/vnd.gdl", ""),
    model_vnd_gs_gdl("model/vnd.gs-gdl", ""),
    model_vnd_gtw("model/vnd.gtw", ""),
    model_vnd_mts("model/vnd.mts", ""),
    model_vnd_parasolid_transmit_binary("model/vnd.parasolid.transmit.binary", ""),
    model_vnd_parasolid_transmit_text("model/vnd.parasolid.transmit.text", ""),
    model_vnd_vtu("model/vnd.vtu", ""),
    model_vrml("model/vrml", ""),
    multipart_alternative("multipart/alternative", ""),
    multipart_appledouble("multipart/appledouble", ""),
    multipart_byteranges("multipart/byteranges", ""),
    multipart_digest("multipart/digest", ""),
    multipart_encrypted("multipart/encrypted", ""),
    multipart_form_data("multipart/form-data", ""),
    multipart_header_set("multipart/header-set", ""),
    multipart_mixed("multipart/mixed", ""),
    multipart_parallel("multipart/parallel", ""),
    multipart_related("multipart/related", ""),
    multipart_report("multipart/report", ""),
    multipart_signed("multipart/signed", ""),
    multipart_voice_message("multipart/voice-message", ""),
    text_RED("text/RED", ""),
    text_calendar("text/calendar", ""),
    text_css("text/css", ""),
    text_csv("text/csv", ""),
    text_directory("text/directory", ""),
    text_dns("text/dns", ""),
    text_enriched("text/enriched", ""),
    text_html("text/html", ""),
    text_parityfec("text/parityfec", ""),
    text_plain("text/plain", ""),
    text_prs_fallenstein_rst("text/prs.fallenstein.rst", ""),
    text_prs_lines_tag("text/prs.lines.tag", ""),
    text_rfc822_headers("text/rfc822-headers", ""),
    text_richtext("text/richtext", ""),
    text_rtf("text/rtf", ""),
    text_sgml("text/sgml", ""),
    text_t140("text/t140", ""),
    text_tab_separated_values("text/tab-separated-values", ""),
    text_troff("text/troff", ""),
    text_uri_list("text/uri-list", ""),
    text_vnd_DMClientScript("text/vnd.DMClientScript", ""),
    text_vnd_IPTC_NITF("text/vnd.IPTC.NITF", ""),
    text_vnd_IPTC_NewsML("text/vnd.IPTC.NewsML", ""),
    text_vnd_abc("text/vnd.abc", ""),
    text_vnd_curl("text/vnd.curl", ""),
    text_vnd_esmertec_theme_descriptor("text/vnd.esmertec.theme-descriptor", ""),
    text_vnd_fly("text/vnd.fly", ""),
    text_vnd_fmi_flexstor("text/vnd.fmi.flexstor", ""),
    text_vnd_in3d_3dml("text/vnd.in3d.3dml", ""),
    text_vnd_in3d_spot("text/vnd.in3d.spot", ""),
    text_vnd_latex_z("text/vnd.latex-z", ""),
    text_vnd_motorola_reflex("text/vnd.motorola.reflex", ""),
    text_vnd_ms_mediapackage("text/vnd.ms-mediapackage", ""),
    text_vnd_net2phone_commcenter_command("text/vnd.net2phone.commcenter.command", ""),
    text_vnd_sun_j2me_app_descriptor("text/vnd.sun.j2me.app-descriptor", ""),
    text_vnd_wap_si("text/vnd.wap.si", ""),
    text_vnd_wap_sl("text/vnd.wap.sl", ""),
    text_vnd_wap_wml("text/vnd.wap.wml", ""),
    text_vnd_wap_wmlscript("text/vnd.wap.wmlscript", ""),
    text_xml("text/xml", ""),
    text_xml_external_parsed_entity("text/xml-external-parsed-entity", ""),
    video_3gpp("video/3gpp", ""),
    video_BMPEG("video/BMPEG", ""),
    video_BT656("video/BT656", ""),
    video_CelB("video/CelB", ""),
    video_DV("video/DV", ""),
    video_H261("video/H261", ""),
    video_H263("video/H263", ""),
    video_H263_1998("video/H263-1998", ""),
    video_H263_2000("video/H263-2000", ""),
    video_H264("video/H264", ""),
    video_JPEG("video/JPEG", ""),
    video_MJ2("video/MJ2", ""),
    video_MP1S("video/MP1S", ""),
    video_MP2P("video/MP2P", ""),
    video_MP2T("video/MP2T", ""),
    video_MP4V_ES("video/MP4V-ES", ""),
    video_MPV("video/MPV", ""),
    video_SMPTE292M("video/SMPTE292M", ""),
    video_mpeg("video/mpeg", ""),
    video_mpeg4_generic("video/mpeg4-generic", ""),
    video_nv("video/nv", ""),
    video_parityfec("video/parityfec", ""),
    video_pointer("video/pointer", ""),
    video_quicktime("video/quicktime", ""),
    video_raw("video/raw", ""),
    video_vnd_fvt("video/vnd.fvt", ""),
    video_vnd_motorola_video("video/vnd.motorola.video", ""),
    video_vnd_motorola_videop("video/vnd.motorola.videop", ""),
    video_vnd_mpegurl("video/vnd.mpegurl", ""),
    video_vnd_nokia_interleaved_multimedia("video/vnd.nokia.interleaved-multimedia", ""),
    video_vnd_objectvideo("video/vnd.objectvideo", ""),
    video_vnd_sealed_mpeg1("video/vnd.sealed.mpeg1", ""),
    video_vnd_sealed_mpeg4("video/vnd.sealed.mpeg4", ""),
    video_vnd_sealed_swf("video/vnd.sealed.swf", ""),
    video_vnd_sealedmedia_softseal_mov("video/vnd.sealedmedia.softseal.mov", ""),
    video_vnd_vivo("video/vnd.vivo", "");
    private final String m_sID;
    private final String m_sDisplayName;

    private EBinaryObjectMimeCode20(
        @Nonnull
        @Nonempty
        final String sID,
        @Nonnull
        final String sDisplayName) {
        m_sID = sID;
        m_sDisplayName = sDisplayName;
    }

    @Nonnull
    @Nonempty
    public String getID() {
        return m_sID;
    }

    @Nonnull
    public String getDisplayName() {
        return m_sDisplayName;
    }

    @Nullable
    public static EBinaryObjectMimeCode20 getFromIDOrNull(
        @Nullable
        final String sID) {
        return EnumHelper.getFromIDOrNull(EBinaryObjectMimeCode20 .class, sID);
    }

    @Nullable
    public static String getDisplayNameFromIDOrNull(
        @Nullable
        final String sID) {
        final EBinaryObjectMimeCode20 eValue = EBinaryObjectMimeCode20 .getFromIDOrNull(sID);
        return ((eValue == null)?null:eValue.getDisplayName());
    }
}