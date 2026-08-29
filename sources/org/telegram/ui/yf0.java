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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yf0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ eg0 b;

    public /* synthetic */ yf0(eg0 eg0Var, int i10) {
        this.a = i10;
        this.b = eg0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final eg0 eg0Var = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.zf0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i11;
                        lt ltVar;
                        switch (i10) {
                            case 0:
                                eg0 eg0Var2 = eg0Var;
                                ij0 ij0Var = eg0Var2.a;
                                HashMap hashMap = eg0Var2.C;
                                ArrayList arrayList = eg0Var2.A;
                                HashMap hashMap2 = eg0Var2.B;
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
                                                lt ltVar2 = new lt();
                                                String str = tL_help_country.name;
                                                ltVar2.a = str;
                                                String str2 = tL_help_country.default_name;
                                                ltVar2.b = str2;
                                                if (str == null && str2 != null) {
                                                    ltVar2.a = str2;
                                                }
                                                ltVar2.c = tL_help_countryCode.country_code;
                                                ltVar2.d = tL_help_country.iso2;
                                                arrayList.add(ltVar2);
                                                List list = (List) hashMap2.get(tL_help_countryCode.country_code);
                                                if (list == null) {
                                                    String str3 = tL_help_countryCode.country_code;
                                                    ArrayList arrayList2 = new ArrayList();
                                                    hashMap2.put(str3, arrayList2);
                                                    list = arrayList2;
                                                }
                                                list.add(ltVar2);
                                                if (tL_help_countryCode.patterns.size() > 0) {
                                                    hashMap.put(tL_help_countryCode.country_code, tL_help_countryCode.patterns);
                                                }
                                            }
                                        }
                                    }
                                    fg0 fg0Var = eg0Var2.R;
                                    if (fg0Var.B == 2) {
                                        i11 = ((org.telegram.ui.ActionBar.o2) fg0Var).currentAccount;
                                        String d = qe.b.d(UserConfig.getInstance(i11).getClientPhone(), false);
                                        if (!TextUtils.isEmpty(d)) {
                                            if (d.length() > 4) {
                                                for (int i14 = 4; i14 >= 1; i14--) {
                                                    String substring = d.substring(0, i14);
                                                    List list2 = (List) hashMap2.get(substring);
                                                    lt ltVar3 = null;
                                                    if (list2 != null) {
                                                        if (list2.size() > 1) {
                                                            String string = MessagesController.getGlobalMainSettings().getString("phone_code_last_matched_" + substring, null);
                                                            if (string != null) {
                                                                ltVar = (lt) j7.l1.j(1, list2);
                                                                int size = arrayList.size();
                                                                int i15 = 0;
                                                                while (true) {
                                                                    if (i15 < size) {
                                                                        Object obj = arrayList.get(i15);
                                                                        i15++;
                                                                        lt ltVar4 = (lt) obj;
                                                                        if (Objects.equals(ltVar4.d, string)) {
                                                                            ltVar = ltVar4;
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                ltVar = (lt) j7.l1.j(1, list2);
                                                            }
                                                            ltVar3 = ltVar;
                                                        } else {
                                                            ltVar3 = (lt) list2.get(0);
                                                        }
                                                    }
                                                    if (ltVar3 != null) {
                                                        ij0Var.setText(substring);
                                                        break;
                                                    }
                                                }
                                                ij0Var.setText(d.substring(0, 1));
                                                break;
                                            }
                                        }
                                    }
                                }
                                break;
                            default:
                                eg0 eg0Var3 = eg0Var;
                                eg0Var3.G = false;
                                fg0 fg0Var2 = eg0Var3.R;
                                fg0Var2.v1(false, true);
                                TLRPC.TL_error tL_error2 = tL_error;
                                if (tL_error2 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject;
                                    if (TwoStepVerificationActivity.i0(password, true)) {
                                        Bundle bundle = new Bundle();
                                        SerializedData serializedData = new SerializedData(password.getObjectSize());
                                        password.serializeToStream(serializedData);
                                        bundle.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                                        fg0Var2.u1(6, true, bundle, false);
                                        break;
                                    } else {
                                        org.telegram.ui.Components.c5.x0(fg0Var2.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                                        break;
                                    }
                                } else {
                                    fg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                                    break;
                                }
                        }
                    }
                });
                break;
            default:
                final int i11 = 1;
                final eg0 eg0Var2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.zf0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i112;
                        lt ltVar;
                        switch (i11) {
                            case 0:
                                eg0 eg0Var22 = eg0Var2;
                                ij0 ij0Var = eg0Var22.a;
                                HashMap hashMap = eg0Var22.C;
                                ArrayList arrayList = eg0Var22.A;
                                HashMap hashMap2 = eg0Var22.B;
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
                                                lt ltVar2 = new lt();
                                                String str = tL_help_country.name;
                                                ltVar2.a = str;
                                                String str2 = tL_help_country.default_name;
                                                ltVar2.b = str2;
                                                if (str == null && str2 != null) {
                                                    ltVar2.a = str2;
                                                }
                                                ltVar2.c = tL_help_countryCode.country_code;
                                                ltVar2.d = tL_help_country.iso2;
                                                arrayList.add(ltVar2);
                                                List list = (List) hashMap2.get(tL_help_countryCode.country_code);
                                                if (list == null) {
                                                    String str3 = tL_help_countryCode.country_code;
                                                    ArrayList arrayList2 = new ArrayList();
                                                    hashMap2.put(str3, arrayList2);
                                                    list = arrayList2;
                                                }
                                                list.add(ltVar2);
                                                if (tL_help_countryCode.patterns.size() > 0) {
                                                    hashMap.put(tL_help_countryCode.country_code, tL_help_countryCode.patterns);
                                                }
                                            }
                                        }
                                    }
                                    fg0 fg0Var = eg0Var22.R;
                                    if (fg0Var.B == 2) {
                                        i112 = ((org.telegram.ui.ActionBar.o2) fg0Var).currentAccount;
                                        String d = qe.b.d(UserConfig.getInstance(i112).getClientPhone(), false);
                                        if (!TextUtils.isEmpty(d)) {
                                            if (d.length() > 4) {
                                                for (int i14 = 4; i14 >= 1; i14--) {
                                                    String substring = d.substring(0, i14);
                                                    List list2 = (List) hashMap2.get(substring);
                                                    lt ltVar3 = null;
                                                    if (list2 != null) {
                                                        if (list2.size() > 1) {
                                                            String string = MessagesController.getGlobalMainSettings().getString("phone_code_last_matched_" + substring, null);
                                                            if (string != null) {
                                                                ltVar = (lt) j7.l1.j(1, list2);
                                                                int size = arrayList.size();
                                                                int i15 = 0;
                                                                while (true) {
                                                                    if (i15 < size) {
                                                                        Object obj = arrayList.get(i15);
                                                                        i15++;
                                                                        lt ltVar4 = (lt) obj;
                                                                        if (Objects.equals(ltVar4.d, string)) {
                                                                            ltVar = ltVar4;
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                ltVar = (lt) j7.l1.j(1, list2);
                                                            }
                                                            ltVar3 = ltVar;
                                                        } else {
                                                            ltVar3 = (lt) list2.get(0);
                                                        }
                                                    }
                                                    if (ltVar3 != null) {
                                                        ij0Var.setText(substring);
                                                        break;
                                                    }
                                                }
                                                ij0Var.setText(d.substring(0, 1));
                                                break;
                                            }
                                        }
                                    }
                                }
                                break;
                            default:
                                eg0 eg0Var3 = eg0Var2;
                                eg0Var3.G = false;
                                fg0 fg0Var2 = eg0Var3.R;
                                fg0Var2.v1(false, true);
                                TLRPC.TL_error tL_error2 = tL_error;
                                if (tL_error2 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject;
                                    if (TwoStepVerificationActivity.i0(password, true)) {
                                        Bundle bundle = new Bundle();
                                        SerializedData serializedData = new SerializedData(password.getObjectSize());
                                        password.serializeToStream(serializedData);
                                        bundle.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                                        fg0Var2.u1(6, true, bundle, false);
                                        break;
                                    } else {
                                        org.telegram.ui.Components.c5.x0(fg0Var2.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                                        break;
                                    }
                                } else {
                                    fg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                                    break;
                                }
                        }
                    }
                });
                break;
        }
    }
}
