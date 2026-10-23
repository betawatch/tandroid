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

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wf0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ cg0 b;

    public /* synthetic */ wf0(cg0 cg0Var, int i10) {
        this.a = i10;
        this.b = cg0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final cg0 cg0Var = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.xf0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i11;
                        ht htVar;
                        switch (i10) {
                            case 0:
                                cg0 cg0Var2 = cg0Var;
                                kj0 kj0Var = cg0Var2.a;
                                HashMap hashMap = cg0Var2.G;
                                ArrayList arrayList = cg0Var2.E;
                                HashMap hashMap2 = cg0Var2.F;
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
                                                ht htVar2 = new ht();
                                                String str = tL_help_country.name;
                                                htVar2.a = str;
                                                String str2 = tL_help_country.default_name;
                                                htVar2.b = str2;
                                                if (str == null && str2 != null) {
                                                    htVar2.a = str2;
                                                }
                                                htVar2.c = tL_help_countryCode.country_code;
                                                htVar2.d = tL_help_country.iso2;
                                                arrayList.add(htVar2);
                                                List list = (List) hashMap2.get(tL_help_countryCode.country_code);
                                                if (list == null) {
                                                    String str3 = tL_help_countryCode.country_code;
                                                    ArrayList arrayList2 = new ArrayList();
                                                    hashMap2.put(str3, arrayList2);
                                                    list = arrayList2;
                                                }
                                                list.add(htVar2);
                                                if (tL_help_countryCode.patterns.size() > 0) {
                                                    hashMap.put(tL_help_countryCode.country_code, tL_help_countryCode.patterns);
                                                }
                                            }
                                        }
                                    }
                                    dg0 dg0Var = cg0Var2.V;
                                    if (dg0Var.F == 2) {
                                        i11 = ((org.telegram.ui.ActionBar.n2) dg0Var).currentAccount;
                                        String d = jf.b.d(UserConfig.getInstance(i11).getClientPhone(), false);
                                        if (!TextUtils.isEmpty(d)) {
                                            if (d.length() > 4) {
                                                for (int i14 = 4; i14 >= 1; i14--) {
                                                    String substring = d.substring(0, i14);
                                                    List list2 = (List) hashMap2.get(substring);
                                                    ht htVar3 = null;
                                                    if (list2 != null) {
                                                        if (list2.size() > 1) {
                                                            String string = MessagesController.getGlobalMainSettings().getString("phone_code_last_matched_" + substring, null);
                                                            if (string != null) {
                                                                htVar = (ht) r4.c.f(1, list2);
                                                                int size = arrayList.size();
                                                                int i15 = 0;
                                                                while (true) {
                                                                    if (i15 < size) {
                                                                        Object obj = arrayList.get(i15);
                                                                        i15++;
                                                                        ht htVar4 = (ht) obj;
                                                                        if (Objects.equals(htVar4.d, string)) {
                                                                            htVar = htVar4;
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                htVar = (ht) r4.c.f(1, list2);
                                                            }
                                                            htVar3 = htVar;
                                                        } else {
                                                            htVar3 = (ht) list2.get(0);
                                                        }
                                                    }
                                                    if (htVar3 != null) {
                                                        kj0Var.setText(substring);
                                                        break;
                                                    }
                                                }
                                                kj0Var.setText(d.substring(0, 1));
                                                break;
                                            }
                                        }
                                    }
                                }
                                break;
                            default:
                                cg0 cg0Var3 = cg0Var;
                                cg0Var3.K = false;
                                dg0 dg0Var2 = cg0Var3.V;
                                dg0Var2.v1(false, true);
                                TLRPC.TL_error tL_error2 = tL_error;
                                if (tL_error2 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject;
                                    if (TwoStepVerificationActivity.i0(password, true)) {
                                        Bundle bundle = new Bundle();
                                        SerializedData serializedData = new SerializedData(password.getObjectSize());
                                        password.serializeToStream(serializedData);
                                        bundle.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                                        dg0Var2.u1(6, true, bundle, false);
                                        break;
                                    } else {
                                        org.telegram.ui.Components.f5.w0(dg0Var2.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                                        break;
                                    }
                                } else {
                                    dg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                                    break;
                                }
                        }
                    }
                });
                break;
            default:
                final int i11 = 1;
                final cg0 cg0Var2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.xf0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i112;
                        ht htVar;
                        switch (i11) {
                            case 0:
                                cg0 cg0Var22 = cg0Var2;
                                kj0 kj0Var = cg0Var22.a;
                                HashMap hashMap = cg0Var22.G;
                                ArrayList arrayList = cg0Var22.E;
                                HashMap hashMap2 = cg0Var22.F;
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
                                                ht htVar2 = new ht();
                                                String str = tL_help_country.name;
                                                htVar2.a = str;
                                                String str2 = tL_help_country.default_name;
                                                htVar2.b = str2;
                                                if (str == null && str2 != null) {
                                                    htVar2.a = str2;
                                                }
                                                htVar2.c = tL_help_countryCode.country_code;
                                                htVar2.d = tL_help_country.iso2;
                                                arrayList.add(htVar2);
                                                List list = (List) hashMap2.get(tL_help_countryCode.country_code);
                                                if (list == null) {
                                                    String str3 = tL_help_countryCode.country_code;
                                                    ArrayList arrayList2 = new ArrayList();
                                                    hashMap2.put(str3, arrayList2);
                                                    list = arrayList2;
                                                }
                                                list.add(htVar2);
                                                if (tL_help_countryCode.patterns.size() > 0) {
                                                    hashMap.put(tL_help_countryCode.country_code, tL_help_countryCode.patterns);
                                                }
                                            }
                                        }
                                    }
                                    dg0 dg0Var = cg0Var22.V;
                                    if (dg0Var.F == 2) {
                                        i112 = ((org.telegram.ui.ActionBar.n2) dg0Var).currentAccount;
                                        String d = jf.b.d(UserConfig.getInstance(i112).getClientPhone(), false);
                                        if (!TextUtils.isEmpty(d)) {
                                            if (d.length() > 4) {
                                                for (int i14 = 4; i14 >= 1; i14--) {
                                                    String substring = d.substring(0, i14);
                                                    List list2 = (List) hashMap2.get(substring);
                                                    ht htVar3 = null;
                                                    if (list2 != null) {
                                                        if (list2.size() > 1) {
                                                            String string = MessagesController.getGlobalMainSettings().getString("phone_code_last_matched_" + substring, null);
                                                            if (string != null) {
                                                                htVar = (ht) r4.c.f(1, list2);
                                                                int size = arrayList.size();
                                                                int i15 = 0;
                                                                while (true) {
                                                                    if (i15 < size) {
                                                                        Object obj = arrayList.get(i15);
                                                                        i15++;
                                                                        ht htVar4 = (ht) obj;
                                                                        if (Objects.equals(htVar4.d, string)) {
                                                                            htVar = htVar4;
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                htVar = (ht) r4.c.f(1, list2);
                                                            }
                                                            htVar3 = htVar;
                                                        } else {
                                                            htVar3 = (ht) list2.get(0);
                                                        }
                                                    }
                                                    if (htVar3 != null) {
                                                        kj0Var.setText(substring);
                                                        break;
                                                    }
                                                }
                                                kj0Var.setText(d.substring(0, 1));
                                                break;
                                            }
                                        }
                                    }
                                }
                                break;
                            default:
                                cg0 cg0Var3 = cg0Var2;
                                cg0Var3.K = false;
                                dg0 dg0Var2 = cg0Var3.V;
                                dg0Var2.v1(false, true);
                                TLRPC.TL_error tL_error2 = tL_error;
                                if (tL_error2 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject;
                                    if (TwoStepVerificationActivity.i0(password, true)) {
                                        Bundle bundle = new Bundle();
                                        SerializedData serializedData = new SerializedData(password.getObjectSize());
                                        password.serializeToStream(serializedData);
                                        bundle.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                                        dg0Var2.u1(6, true, bundle, false);
                                        break;
                                    } else {
                                        org.telegram.ui.Components.f5.w0(dg0Var2.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                                        break;
                                    }
                                } else {
                                    dg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                                    break;
                                }
                        }
                    }
                });
                break;
        }
    }
}
