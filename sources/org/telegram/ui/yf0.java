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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yf0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ fg0 b;

    public /* synthetic */ yf0(fg0 fg0Var, int i10) {
        this.a = i10;
        this.b = fg0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final fg0 fg0Var = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.zf0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i11;
                        jt jtVar;
                        switch (i10) {
                            case 0:
                                fg0 fg0Var2 = fg0Var;
                                mj0 mj0Var = fg0Var2.a;
                                HashMap hashMap = fg0Var2.I;
                                ArrayList arrayList = fg0Var2.G;
                                HashMap hashMap2 = fg0Var2.H;
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
                                                jt jtVar2 = new jt();
                                                String str = tL_help_country.name;
                                                jtVar2.a = str;
                                                String str2 = tL_help_country.default_name;
                                                jtVar2.b = str2;
                                                if (str == null && str2 != null) {
                                                    jtVar2.a = str2;
                                                }
                                                jtVar2.c = tL_help_countryCode.country_code;
                                                jtVar2.d = tL_help_country.iso2;
                                                arrayList.add(jtVar2);
                                                List list = (List) hashMap2.get(tL_help_countryCode.country_code);
                                                if (list == null) {
                                                    String str3 = tL_help_countryCode.country_code;
                                                    ArrayList arrayList2 = new ArrayList();
                                                    hashMap2.put(str3, arrayList2);
                                                    list = arrayList2;
                                                }
                                                list.add(jtVar2);
                                                if (tL_help_countryCode.patterns.size() > 0) {
                                                    hashMap.put(tL_help_countryCode.country_code, tL_help_countryCode.patterns);
                                                }
                                            }
                                        }
                                    }
                                    gg0 gg0Var = fg0Var2.a0;
                                    if (gg0Var.F == 2) {
                                        i11 = ((org.telegram.ui.ActionBar.r2) gg0Var).currentAccount;
                                        String d = kf.b.d(UserConfig.getInstance(i11).getClientPhone(), false);
                                        if (!TextUtils.isEmpty(d)) {
                                            if (d.length() > 4) {
                                                for (int i14 = 4; i14 >= 1; i14--) {
                                                    String substring = d.substring(0, i14);
                                                    List list2 = (List) hashMap2.get(substring);
                                                    jt jtVar3 = null;
                                                    if (list2 != null) {
                                                        if (list2.size() > 1) {
                                                            String string = MessagesController.getGlobalMainSettings().getString("phone_code_last_matched_" + substring, null);
                                                            if (string != null) {
                                                                jtVar = (jt) org.telegram.ui.Components.b10.h(1, list2);
                                                                int size = arrayList.size();
                                                                int i15 = 0;
                                                                while (true) {
                                                                    if (i15 < size) {
                                                                        Object obj = arrayList.get(i15);
                                                                        i15++;
                                                                        jt jtVar4 = (jt) obj;
                                                                        if (Objects.equals(jtVar4.d, string)) {
                                                                            jtVar = jtVar4;
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                jtVar = (jt) org.telegram.ui.Components.b10.h(1, list2);
                                                            }
                                                            jtVar3 = jtVar;
                                                        } else {
                                                            jtVar3 = (jt) list2.get(0);
                                                        }
                                                    }
                                                    if (jtVar3 != null) {
                                                        mj0Var.setText(substring);
                                                        break;
                                                    }
                                                }
                                                mj0Var.setText(d.substring(0, 1));
                                                break;
                                            }
                                        }
                                    }
                                }
                                break;
                            default:
                                fg0 fg0Var3 = fg0Var;
                                fg0Var3.M = false;
                                gg0 gg0Var2 = fg0Var3.a0;
                                gg0Var2.A1(false, true);
                                TLRPC.TL_error tL_error2 = tL_error;
                                if (tL_error2 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject;
                                    if (TwoStepVerificationActivity.j0(password, true)) {
                                        Bundle bundle = new Bundle();
                                        SerializedData serializedData = new SerializedData(password.getObjectSize());
                                        password.serializeToStream(serializedData);
                                        bundle.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                                        gg0Var2.z1(6, true, bundle, false);
                                        break;
                                    } else {
                                        org.telegram.ui.Components.g5.w0(gg0Var2.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                                        break;
                                    }
                                } else {
                                    gg0Var2.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                                    break;
                                }
                        }
                    }
                });
                break;
            default:
                final int i11 = 1;
                final fg0 fg0Var2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.zf0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i112;
                        jt jtVar;
                        switch (i11) {
                            case 0:
                                fg0 fg0Var22 = fg0Var2;
                                mj0 mj0Var = fg0Var22.a;
                                HashMap hashMap = fg0Var22.I;
                                ArrayList arrayList = fg0Var22.G;
                                HashMap hashMap2 = fg0Var22.H;
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
                                                jt jtVar2 = new jt();
                                                String str = tL_help_country.name;
                                                jtVar2.a = str;
                                                String str2 = tL_help_country.default_name;
                                                jtVar2.b = str2;
                                                if (str == null && str2 != null) {
                                                    jtVar2.a = str2;
                                                }
                                                jtVar2.c = tL_help_countryCode.country_code;
                                                jtVar2.d = tL_help_country.iso2;
                                                arrayList.add(jtVar2);
                                                List list = (List) hashMap2.get(tL_help_countryCode.country_code);
                                                if (list == null) {
                                                    String str3 = tL_help_countryCode.country_code;
                                                    ArrayList arrayList2 = new ArrayList();
                                                    hashMap2.put(str3, arrayList2);
                                                    list = arrayList2;
                                                }
                                                list.add(jtVar2);
                                                if (tL_help_countryCode.patterns.size() > 0) {
                                                    hashMap.put(tL_help_countryCode.country_code, tL_help_countryCode.patterns);
                                                }
                                            }
                                        }
                                    }
                                    gg0 gg0Var = fg0Var22.a0;
                                    if (gg0Var.F == 2) {
                                        i112 = ((org.telegram.ui.ActionBar.r2) gg0Var).currentAccount;
                                        String d = kf.b.d(UserConfig.getInstance(i112).getClientPhone(), false);
                                        if (!TextUtils.isEmpty(d)) {
                                            if (d.length() > 4) {
                                                for (int i14 = 4; i14 >= 1; i14--) {
                                                    String substring = d.substring(0, i14);
                                                    List list2 = (List) hashMap2.get(substring);
                                                    jt jtVar3 = null;
                                                    if (list2 != null) {
                                                        if (list2.size() > 1) {
                                                            String string = MessagesController.getGlobalMainSettings().getString("phone_code_last_matched_" + substring, null);
                                                            if (string != null) {
                                                                jtVar = (jt) org.telegram.ui.Components.b10.h(1, list2);
                                                                int size = arrayList.size();
                                                                int i15 = 0;
                                                                while (true) {
                                                                    if (i15 < size) {
                                                                        Object obj = arrayList.get(i15);
                                                                        i15++;
                                                                        jt jtVar4 = (jt) obj;
                                                                        if (Objects.equals(jtVar4.d, string)) {
                                                                            jtVar = jtVar4;
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                jtVar = (jt) org.telegram.ui.Components.b10.h(1, list2);
                                                            }
                                                            jtVar3 = jtVar;
                                                        } else {
                                                            jtVar3 = (jt) list2.get(0);
                                                        }
                                                    }
                                                    if (jtVar3 != null) {
                                                        mj0Var.setText(substring);
                                                        break;
                                                    }
                                                }
                                                mj0Var.setText(d.substring(0, 1));
                                                break;
                                            }
                                        }
                                    }
                                }
                                break;
                            default:
                                fg0 fg0Var3 = fg0Var2;
                                fg0Var3.M = false;
                                gg0 gg0Var2 = fg0Var3.a0;
                                gg0Var2.A1(false, true);
                                TLRPC.TL_error tL_error2 = tL_error;
                                if (tL_error2 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject;
                                    if (TwoStepVerificationActivity.j0(password, true)) {
                                        Bundle bundle = new Bundle();
                                        SerializedData serializedData = new SerializedData(password.getObjectSize());
                                        password.serializeToStream(serializedData);
                                        bundle.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                                        gg0Var2.z1(6, true, bundle, false);
                                        break;
                                    } else {
                                        org.telegram.ui.Components.g5.w0(gg0Var2.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                                        break;
                                    }
                                } else {
                                    gg0Var2.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                                    break;
                                }
                        }
                    }
                });
                break;
        }
    }
}
