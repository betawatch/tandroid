package org.telegram.ui;

import android.os.Bundle;
import android.text.TextUtils;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tg0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ zg0 b;

    public /* synthetic */ tg0(zg0 zg0Var, int i10) {
        this.a = i10;
        this.b = zg0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final zg0 zg0Var = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ug0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i11;
                        au auVar;
                        switch (i10) {
                            case 0:
                                zg0 zg0Var2 = zg0Var;
                                fk0 fk0Var = zg0Var2.a;
                                HashMap hashMap = zg0Var2.G;
                                ArrayList arrayList = zg0Var2.E;
                                HashMap hashMap2 = zg0Var2.F;
                                if (tL_error == null) {
                                    arrayList.clear();
                                    hashMap2.clear();
                                    hashMap.clear();
                                    TLRPC.TL_help_countriesList tL_help_countriesList = (TLRPC.TL_help_countriesList) tLObject;
                                    for (int i12 = 0; i12 < tL_help_countriesList.countries.size(); i12++) {
                                        TLRPC.TL_help_country tL_help_country = tL_help_countriesList.countries.get(i12);
                                        for (int i13 = 0; i13 < tL_help_country.country_codes.size(); i13++) {
                                            TLRPC.TL_help_countryCode tL_help_countryCode = tL_help_country.country_codes.get(i13);
                                            if (tL_help_countryCode != null) {
                                                au auVar2 = new au();
                                                String str = tL_help_country.name;
                                                auVar2.a = str;
                                                String str2 = tL_help_country.default_name;
                                                auVar2.b = str2;
                                                if (str == null && str2 != null) {
                                                    auVar2.a = str2;
                                                }
                                                auVar2.c = tL_help_countryCode.country_code;
                                                auVar2.d = tL_help_country.iso2;
                                                arrayList.add(auVar2);
                                                List list = (List) hashMap2.get(tL_help_countryCode.country_code);
                                                if (list == null) {
                                                    String str3 = tL_help_countryCode.country_code;
                                                    ArrayList arrayList2 = new ArrayList();
                                                    hashMap2.put(str3, arrayList2);
                                                    list = arrayList2;
                                                }
                                                list.add(auVar2);
                                                if (tL_help_countryCode.patterns.size() > 0) {
                                                    hashMap.put(tL_help_countryCode.country_code, tL_help_countryCode.patterns);
                                                }
                                            }
                                        }
                                    }
                                    ah0 ah0Var = zg0Var2.V;
                                    if (ah0Var.F == 2) {
                                        i11 = ((org.telegram.ui.ActionBar.m2) ah0Var).currentAccount;
                                        String d = jf.b.d(UserConfig.getInstance(i11).getClientPhone(), false);
                                        if (!TextUtils.isEmpty(d)) {
                                            if (d.length() > 4) {
                                                for (int i14 = 4; i14 >= 1; i14--) {
                                                    String substring = d.substring(0, i14);
                                                    List list2 = (List) hashMap2.get(substring);
                                                    au auVar3 = null;
                                                    if (list2 != null) {
                                                        if (list2.size() > 1) {
                                                            String string = MessagesController.getGlobalMainSettings().getString("phone_code_last_matched_" + substring, null);
                                                            if (string != null) {
                                                                auVar = (au) t8.b.g(1, list2);
                                                                int size = arrayList.size();
                                                                int i15 = 0;
                                                                while (true) {
                                                                    if (i15 < size) {
                                                                        Object obj = arrayList.get(i15);
                                                                        i15++;
                                                                        au auVar4 = (au) obj;
                                                                        if (Objects.equals(auVar4.d, string)) {
                                                                            auVar = auVar4;
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                auVar = (au) t8.b.g(1, list2);
                                                            }
                                                            auVar3 = auVar;
                                                        } else {
                                                            auVar3 = (au) list2.get(0);
                                                        }
                                                    }
                                                    if (auVar3 != null) {
                                                        fk0Var.setText(substring);
                                                        break;
                                                    }
                                                }
                                                fk0Var.setText(d.substring(0, 1));
                                                break;
                                            }
                                        }
                                    }
                                }
                                break;
                            default:
                                zg0 zg0Var3 = zg0Var;
                                zg0Var3.K = false;
                                ah0 ah0Var2 = zg0Var3.V;
                                ah0Var2.v1(false, true);
                                TLRPC.TL_error tL_error2 = tL_error;
                                if (tL_error2 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject;
                                    if (TwoStepVerificationActivity.i0(password, true)) {
                                        Bundle bundle = new Bundle();
                                        SerializedData serializedData = new SerializedData(password.getObjectSize());
                                        password.serializeToStream(serializedData);
                                        bundle.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                                        ah0Var2.u1(6, true, bundle, false);
                                        break;
                                    } else {
                                        org.telegram.ui.Components.g5.w0(ah0Var2.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                                        break;
                                    }
                                } else {
                                    ah0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                                    break;
                                }
                        }
                    }
                });
                break;
            default:
                final int i11 = 1;
                final zg0 zg0Var2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ug0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i112;
                        au auVar;
                        switch (i11) {
                            case 0:
                                zg0 zg0Var22 = zg0Var2;
                                fk0 fk0Var = zg0Var22.a;
                                HashMap hashMap = zg0Var22.G;
                                ArrayList arrayList = zg0Var22.E;
                                HashMap hashMap2 = zg0Var22.F;
                                if (tL_error == null) {
                                    arrayList.clear();
                                    hashMap2.clear();
                                    hashMap.clear();
                                    TLRPC.TL_help_countriesList tL_help_countriesList = (TLRPC.TL_help_countriesList) tLObject;
                                    for (int i12 = 0; i12 < tL_help_countriesList.countries.size(); i12++) {
                                        TLRPC.TL_help_country tL_help_country = tL_help_countriesList.countries.get(i12);
                                        for (int i13 = 0; i13 < tL_help_country.country_codes.size(); i13++) {
                                            TLRPC.TL_help_countryCode tL_help_countryCode = tL_help_country.country_codes.get(i13);
                                            if (tL_help_countryCode != null) {
                                                au auVar2 = new au();
                                                String str = tL_help_country.name;
                                                auVar2.a = str;
                                                String str2 = tL_help_country.default_name;
                                                auVar2.b = str2;
                                                if (str == null && str2 != null) {
                                                    auVar2.a = str2;
                                                }
                                                auVar2.c = tL_help_countryCode.country_code;
                                                auVar2.d = tL_help_country.iso2;
                                                arrayList.add(auVar2);
                                                List list = (List) hashMap2.get(tL_help_countryCode.country_code);
                                                if (list == null) {
                                                    String str3 = tL_help_countryCode.country_code;
                                                    ArrayList arrayList2 = new ArrayList();
                                                    hashMap2.put(str3, arrayList2);
                                                    list = arrayList2;
                                                }
                                                list.add(auVar2);
                                                if (tL_help_countryCode.patterns.size() > 0) {
                                                    hashMap.put(tL_help_countryCode.country_code, tL_help_countryCode.patterns);
                                                }
                                            }
                                        }
                                    }
                                    ah0 ah0Var = zg0Var22.V;
                                    if (ah0Var.F == 2) {
                                        i112 = ((org.telegram.ui.ActionBar.m2) ah0Var).currentAccount;
                                        String d = jf.b.d(UserConfig.getInstance(i112).getClientPhone(), false);
                                        if (!TextUtils.isEmpty(d)) {
                                            if (d.length() > 4) {
                                                for (int i14 = 4; i14 >= 1; i14--) {
                                                    String substring = d.substring(0, i14);
                                                    List list2 = (List) hashMap2.get(substring);
                                                    au auVar3 = null;
                                                    if (list2 != null) {
                                                        if (list2.size() > 1) {
                                                            String string = MessagesController.getGlobalMainSettings().getString("phone_code_last_matched_" + substring, null);
                                                            if (string != null) {
                                                                auVar = (au) t8.b.g(1, list2);
                                                                int size = arrayList.size();
                                                                int i15 = 0;
                                                                while (true) {
                                                                    if (i15 < size) {
                                                                        Object obj = arrayList.get(i15);
                                                                        i15++;
                                                                        au auVar4 = (au) obj;
                                                                        if (Objects.equals(auVar4.d, string)) {
                                                                            auVar = auVar4;
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                auVar = (au) t8.b.g(1, list2);
                                                            }
                                                            auVar3 = auVar;
                                                        } else {
                                                            auVar3 = (au) list2.get(0);
                                                        }
                                                    }
                                                    if (auVar3 != null) {
                                                        fk0Var.setText(substring);
                                                        break;
                                                    }
                                                }
                                                fk0Var.setText(d.substring(0, 1));
                                                break;
                                            }
                                        }
                                    }
                                }
                                break;
                            default:
                                zg0 zg0Var3 = zg0Var2;
                                zg0Var3.K = false;
                                ah0 ah0Var2 = zg0Var3.V;
                                ah0Var2.v1(false, true);
                                TLRPC.TL_error tL_error2 = tL_error;
                                if (tL_error2 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject;
                                    if (TwoStepVerificationActivity.i0(password, true)) {
                                        Bundle bundle = new Bundle();
                                        SerializedData serializedData = new SerializedData(password.getObjectSize());
                                        password.serializeToStream(serializedData);
                                        bundle.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                                        ah0Var2.u1(6, true, bundle, false);
                                        break;
                                    } else {
                                        org.telegram.ui.Components.g5.w0(ah0Var2.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                                        break;
                                    }
                                } else {
                                    ah0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                                    break;
                                }
                        }
                    }
                });
                break;
        }
    }
}
