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

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class xd0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ de0 b;

    public /* synthetic */ xd0(de0 de0Var, int i7) {
        this.a = i7;
        this.b = de0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i7 = 0;
                final de0 de0Var = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.zd0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i10;
                        os osVar;
                        int i11 = i7;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        de0 de0Var2 = de0Var;
                        switch (i11) {
                            case 0:
                                be0 be0Var = de0Var2.a;
                                HashMap hashMap = de0Var2.I;
                                ArrayList arrayList = de0Var2.G;
                                HashMap hashMap2 = de0Var2.H;
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
                                                os osVar2 = new os();
                                                String str = tL_help_country.name;
                                                osVar2.a = str;
                                                String str2 = tL_help_country.default_name;
                                                osVar2.b = str2;
                                                if (str == null && str2 != null) {
                                                    osVar2.a = str2;
                                                }
                                                osVar2.c = tL_help_countryCode.country_code;
                                                osVar2.d = tL_help_country.iso2;
                                                arrayList.add(osVar2);
                                                List list = (List) hashMap2.get(tL_help_countryCode.country_code);
                                                if (list == null) {
                                                    String str3 = tL_help_countryCode.country_code;
                                                    ArrayList arrayList2 = new ArrayList();
                                                    hashMap2.put(str3, arrayList2);
                                                    list = arrayList2;
                                                }
                                                list.add(osVar2);
                                                if (tL_help_countryCode.patterns.size() > 0) {
                                                    hashMap.put(tL_help_countryCode.country_code, tL_help_countryCode.patterns);
                                                }
                                            }
                                        }
                                    }
                                    ee0 ee0Var = de0Var2.g0;
                                    if (ee0Var.F == 2) {
                                        i10 = ((org.telegram.ui.ActionBar.f2) ee0Var).currentAccount;
                                        String d = pf.b.d(org.telegram.messenger.p10.i(i10).d(), false);
                                        if (!TextUtils.isEmpty(d)) {
                                            if (d.length() > 4) {
                                                for (int i14 = 4; i14 >= 1; i14--) {
                                                    String substring = d.substring(0, i14);
                                                    List list2 = (List) hashMap2.get(substring);
                                                    if (list2 == null) {
                                                        osVar = null;
                                                    } else if (list2.size() > 1) {
                                                        String string = org.telegram.messenger.qp.e1().getString("phone_code_last_matched_" + substring, null);
                                                        if (string != null) {
                                                            osVar = (os) rf.b.g(1, list2);
                                                            int size = arrayList.size();
                                                            int i15 = 0;
                                                            while (true) {
                                                                if (i15 < size) {
                                                                    Object obj = arrayList.get(i15);
                                                                    i15++;
                                                                    os osVar3 = (os) obj;
                                                                    if (Objects.equals(osVar3.d, string)) {
                                                                        osVar = osVar3;
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            osVar = (os) rf.b.g(1, list2);
                                                        }
                                                    } else {
                                                        osVar = (os) list2.get(0);
                                                    }
                                                    if (osVar != null) {
                                                        be0Var.setText(substring);
                                                        break;
                                                    }
                                                }
                                                be0Var.setText(d.substring(0, 1));
                                                break;
                                            }
                                        }
                                    }
                                }
                                break;
                            default:
                                de0Var2.M = false;
                                ee0 ee0Var2 = de0Var2.g0;
                                ee0Var2.N1(false, true);
                                if (tL_error2 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject2;
                                    if (TwoStepVerificationActivity.n0(password, true)) {
                                        Bundle bundle = new Bundle();
                                        SerializedData serializedData = new SerializedData(password.getObjectSize());
                                        password.serializeToStream(serializedData);
                                        bundle.putString("password", Utilities.f(serializedData.toByteArray()));
                                        ee0Var2.M1(6, true, bundle, false);
                                        break;
                                    } else {
                                        org.telegram.ui.Components.v4.u0(ee0Var2.getParentActivity(), org.telegram.messenger.id.M0(2131743820, "UpdateAppAlert"), true);
                                        break;
                                    }
                                } else {
                                    ee0Var2.D1(org.telegram.messenger.id.M0(2131746071, null), tL_error2.text);
                                    break;
                                }
                        }
                    }
                });
                break;
            default:
                final int i10 = 1;
                final de0 de0Var2 = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.zd0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i102;
                        os osVar;
                        int i11 = i10;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        de0 de0Var22 = de0Var2;
                        switch (i11) {
                            case 0:
                                be0 be0Var = de0Var22.a;
                                HashMap hashMap = de0Var22.I;
                                ArrayList arrayList = de0Var22.G;
                                HashMap hashMap2 = de0Var22.H;
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
                                                os osVar2 = new os();
                                                String str = tL_help_country.name;
                                                osVar2.a = str;
                                                String str2 = tL_help_country.default_name;
                                                osVar2.b = str2;
                                                if (str == null && str2 != null) {
                                                    osVar2.a = str2;
                                                }
                                                osVar2.c = tL_help_countryCode.country_code;
                                                osVar2.d = tL_help_country.iso2;
                                                arrayList.add(osVar2);
                                                List list = (List) hashMap2.get(tL_help_countryCode.country_code);
                                                if (list == null) {
                                                    String str3 = tL_help_countryCode.country_code;
                                                    ArrayList arrayList2 = new ArrayList();
                                                    hashMap2.put(str3, arrayList2);
                                                    list = arrayList2;
                                                }
                                                list.add(osVar2);
                                                if (tL_help_countryCode.patterns.size() > 0) {
                                                    hashMap.put(tL_help_countryCode.country_code, tL_help_countryCode.patterns);
                                                }
                                            }
                                        }
                                    }
                                    ee0 ee0Var = de0Var22.g0;
                                    if (ee0Var.F == 2) {
                                        i102 = ((org.telegram.ui.ActionBar.f2) ee0Var).currentAccount;
                                        String d = pf.b.d(org.telegram.messenger.p10.i(i102).d(), false);
                                        if (!TextUtils.isEmpty(d)) {
                                            if (d.length() > 4) {
                                                for (int i14 = 4; i14 >= 1; i14--) {
                                                    String substring = d.substring(0, i14);
                                                    List list2 = (List) hashMap2.get(substring);
                                                    if (list2 == null) {
                                                        osVar = null;
                                                    } else if (list2.size() > 1) {
                                                        String string = org.telegram.messenger.qp.e1().getString("phone_code_last_matched_" + substring, null);
                                                        if (string != null) {
                                                            osVar = (os) rf.b.g(1, list2);
                                                            int size = arrayList.size();
                                                            int i15 = 0;
                                                            while (true) {
                                                                if (i15 < size) {
                                                                    Object obj = arrayList.get(i15);
                                                                    i15++;
                                                                    os osVar3 = (os) obj;
                                                                    if (Objects.equals(osVar3.d, string)) {
                                                                        osVar = osVar3;
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            osVar = (os) rf.b.g(1, list2);
                                                        }
                                                    } else {
                                                        osVar = (os) list2.get(0);
                                                    }
                                                    if (osVar != null) {
                                                        be0Var.setText(substring);
                                                        break;
                                                    }
                                                }
                                                be0Var.setText(d.substring(0, 1));
                                                break;
                                            }
                                        }
                                    }
                                }
                                break;
                            default:
                                de0Var22.M = false;
                                ee0 ee0Var2 = de0Var22.g0;
                                ee0Var2.N1(false, true);
                                if (tL_error2 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject2;
                                    if (TwoStepVerificationActivity.n0(password, true)) {
                                        Bundle bundle = new Bundle();
                                        SerializedData serializedData = new SerializedData(password.getObjectSize());
                                        password.serializeToStream(serializedData);
                                        bundle.putString("password", Utilities.f(serializedData.toByteArray()));
                                        ee0Var2.M1(6, true, bundle, false);
                                        break;
                                    } else {
                                        org.telegram.ui.Components.v4.u0(ee0Var2.getParentActivity(), org.telegram.messenger.id.M0(2131743820, "UpdateAppAlert"), true);
                                        break;
                                    }
                                } else {
                                    ee0Var2.D1(org.telegram.messenger.id.M0(2131746071, null), tL_error2.text);
                                    break;
                                }
                        }
                    }
                });
                break;
        }
    }
}
