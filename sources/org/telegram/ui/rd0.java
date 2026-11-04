package org.telegram.ui;

import android.os.Bundle;
import android.text.TextUtils;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rd0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ wd0 b;

    public /* synthetic */ rd0(wd0 wd0Var, int i3) {
        this.a = i3;
        this.b = wd0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i3 = 0;
                final wd0 wd0Var = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.sd0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i10;
                        ks ksVar;
                        int i11 = i3;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        wd0 wd0Var2 = wd0Var;
                        switch (i11) {
                            case 0:
                                ud0 ud0Var = wd0Var2.a;
                                HashMap hashMap = wd0Var2.J;
                                ArrayList arrayList = wd0Var2.H;
                                HashMap hashMap2 = wd0Var2.I;
                                if (tL_error2 == null) {
                                    arrayList.clear();
                                    hashMap2.clear();
                                    hashMap.clear();
                                    TLRPC.TL_help_countriesList tL_help_countriesList = (TLRPC.TL_help_countriesList) tLObject2;
                                    for (int i12 = 0; i12 < tL_help_countriesList.countries.size(); i12++) {
                                        TLRPC.TL_help_country tL_help_country = tL_help_countriesList.countries.get(i12);
                                        for (int i13 = 0; i13 < tL_help_country.country_codes.size(); i13++) {
                                            TLRPC.TL_help_countryCode tL_help_countryCode = tL_help_country.country_codes.get(i13);
                                            if (tL_help_countryCode != null) {
                                                ks ksVar2 = new ks();
                                                String str = tL_help_country.name;
                                                ksVar2.a = str;
                                                String str2 = tL_help_country.default_name;
                                                ksVar2.b = str2;
                                                if (str == null && str2 != null) {
                                                    ksVar2.a = str2;
                                                }
                                                ksVar2.c = tL_help_countryCode.country_code;
                                                ksVar2.d = tL_help_country.iso2;
                                                arrayList.add(ksVar2);
                                                List list = (List) hashMap2.get(tL_help_countryCode.country_code);
                                                if (list == null) {
                                                    String str3 = tL_help_countryCode.country_code;
                                                    ArrayList arrayList2 = new ArrayList();
                                                    hashMap2.put(str3, arrayList2);
                                                    list = arrayList2;
                                                }
                                                list.add(ksVar2);
                                                if (tL_help_countryCode.patterns.size() > 0) {
                                                    hashMap.put(tL_help_countryCode.country_code, tL_help_countryCode.patterns);
                                                }
                                            }
                                        }
                                    }
                                    xd0 xd0Var = wd0Var2.b0;
                                    if (xd0Var.G == 2) {
                                        i10 = ((org.telegram.ui.ActionBar.d2) xd0Var).currentAccount;
                                        String d = mf.b.d(org.telegram.messenger.h10.i(i10).d(), false);
                                        if (!TextUtils.isEmpty(d)) {
                                            if (d.length() > 4) {
                                                for (int i14 = 4; i14 >= 1; i14--) {
                                                    String substring = d.substring(0, i14);
                                                    List list2 = (List) hashMap2.get(substring);
                                                    if (list2 == null) {
                                                        ksVar = null;
                                                    } else if (list2.size() > 1) {
                                                        String string = org.telegram.messenger.hp.e1().getString("phone_code_last_matched_" + substring, null);
                                                        if (string != null) {
                                                            ksVar = (ks) t4.c.d(1, list2);
                                                            int size = arrayList.size();
                                                            int i15 = 0;
                                                            while (true) {
                                                                if (i15 < size) {
                                                                    Object obj = arrayList.get(i15);
                                                                    i15++;
                                                                    ks ksVar3 = (ks) obj;
                                                                    if (Objects.equals(ksVar3.d, string)) {
                                                                        ksVar = ksVar3;
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            ksVar = (ks) t4.c.d(1, list2);
                                                        }
                                                    } else {
                                                        ksVar = (ks) list2.get(0);
                                                    }
                                                    if (ksVar != null) {
                                                        ud0Var.setText(substring);
                                                        break;
                                                    }
                                                }
                                                ud0Var.setText(d.substring(0, 1));
                                                break;
                                            }
                                        }
                                    }
                                }
                                break;
                            default:
                                wd0Var2.N = false;
                                xd0 xd0Var2 = wd0Var2.b0;
                                xd0Var2.E1(false, true);
                                if (tL_error2 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject2;
                                    if (TwoStepVerificationActivity.n0(password, true)) {
                                        Bundle bundle = new Bundle();
                                        SerializedData serializedData = new SerializedData(password.getObjectSize());
                                        password.serializeToStream(serializedData);
                                        bundle.putString("password", Utilities.f(serializedData.toByteArray()));
                                        xd0Var2.D1(6, true, bundle, false);
                                        break;
                                    } else {
                                        org.telegram.ui.Components.t4.w0(xd0Var2.getParentActivity(), org.telegram.messenger.bd.M0(2131743830, "UpdateAppAlert"), true);
                                        break;
                                    }
                                } else {
                                    xd0Var2.u1(org.telegram.messenger.bd.M0(2131746081, null), tL_error2.text);
                                    break;
                                }
                        }
                    }
                });
                break;
            default:
                final int i10 = 1;
                final wd0 wd0Var2 = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.sd0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i102;
                        ks ksVar;
                        int i11 = i10;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        wd0 wd0Var22 = wd0Var2;
                        switch (i11) {
                            case 0:
                                ud0 ud0Var = wd0Var22.a;
                                HashMap hashMap = wd0Var22.J;
                                ArrayList arrayList = wd0Var22.H;
                                HashMap hashMap2 = wd0Var22.I;
                                if (tL_error2 == null) {
                                    arrayList.clear();
                                    hashMap2.clear();
                                    hashMap.clear();
                                    TLRPC.TL_help_countriesList tL_help_countriesList = (TLRPC.TL_help_countriesList) tLObject2;
                                    for (int i12 = 0; i12 < tL_help_countriesList.countries.size(); i12++) {
                                        TLRPC.TL_help_country tL_help_country = tL_help_countriesList.countries.get(i12);
                                        for (int i13 = 0; i13 < tL_help_country.country_codes.size(); i13++) {
                                            TLRPC.TL_help_countryCode tL_help_countryCode = tL_help_country.country_codes.get(i13);
                                            if (tL_help_countryCode != null) {
                                                ks ksVar2 = new ks();
                                                String str = tL_help_country.name;
                                                ksVar2.a = str;
                                                String str2 = tL_help_country.default_name;
                                                ksVar2.b = str2;
                                                if (str == null && str2 != null) {
                                                    ksVar2.a = str2;
                                                }
                                                ksVar2.c = tL_help_countryCode.country_code;
                                                ksVar2.d = tL_help_country.iso2;
                                                arrayList.add(ksVar2);
                                                List list = (List) hashMap2.get(tL_help_countryCode.country_code);
                                                if (list == null) {
                                                    String str3 = tL_help_countryCode.country_code;
                                                    ArrayList arrayList2 = new ArrayList();
                                                    hashMap2.put(str3, arrayList2);
                                                    list = arrayList2;
                                                }
                                                list.add(ksVar2);
                                                if (tL_help_countryCode.patterns.size() > 0) {
                                                    hashMap.put(tL_help_countryCode.country_code, tL_help_countryCode.patterns);
                                                }
                                            }
                                        }
                                    }
                                    xd0 xd0Var = wd0Var22.b0;
                                    if (xd0Var.G == 2) {
                                        i102 = ((org.telegram.ui.ActionBar.d2) xd0Var).currentAccount;
                                        String d = mf.b.d(org.telegram.messenger.h10.i(i102).d(), false);
                                        if (!TextUtils.isEmpty(d)) {
                                            if (d.length() > 4) {
                                                for (int i14 = 4; i14 >= 1; i14--) {
                                                    String substring = d.substring(0, i14);
                                                    List list2 = (List) hashMap2.get(substring);
                                                    if (list2 == null) {
                                                        ksVar = null;
                                                    } else if (list2.size() > 1) {
                                                        String string = org.telegram.messenger.hp.e1().getString("phone_code_last_matched_" + substring, null);
                                                        if (string != null) {
                                                            ksVar = (ks) t4.c.d(1, list2);
                                                            int size = arrayList.size();
                                                            int i15 = 0;
                                                            while (true) {
                                                                if (i15 < size) {
                                                                    Object obj = arrayList.get(i15);
                                                                    i15++;
                                                                    ks ksVar3 = (ks) obj;
                                                                    if (Objects.equals(ksVar3.d, string)) {
                                                                        ksVar = ksVar3;
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            ksVar = (ks) t4.c.d(1, list2);
                                                        }
                                                    } else {
                                                        ksVar = (ks) list2.get(0);
                                                    }
                                                    if (ksVar != null) {
                                                        ud0Var.setText(substring);
                                                        break;
                                                    }
                                                }
                                                ud0Var.setText(d.substring(0, 1));
                                                break;
                                            }
                                        }
                                    }
                                }
                                break;
                            default:
                                wd0Var22.N = false;
                                xd0 xd0Var2 = wd0Var22.b0;
                                xd0Var2.E1(false, true);
                                if (tL_error2 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject2;
                                    if (TwoStepVerificationActivity.n0(password, true)) {
                                        Bundle bundle = new Bundle();
                                        SerializedData serializedData = new SerializedData(password.getObjectSize());
                                        password.serializeToStream(serializedData);
                                        bundle.putString("password", Utilities.f(serializedData.toByteArray()));
                                        xd0Var2.D1(6, true, bundle, false);
                                        break;
                                    } else {
                                        org.telegram.ui.Components.t4.w0(xd0Var2.getParentActivity(), org.telegram.messenger.bd.M0(2131743830, "UpdateAppAlert"), true);
                                        break;
                                    }
                                } else {
                                    xd0Var2.u1(org.telegram.messenger.bd.M0(2131746081, null), tL_error2.text);
                                    break;
                                }
                        }
                    }
                });
                break;
        }
    }
}
