package org.telegram.ui.web;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.view.View;
import hi.l5;
import hi.z4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import ki.n2;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.p10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.Components.n41;
import org.telegram.ui.ow0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements p10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0274  */
    @Override // org.telegram.messenger.p10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj, Object obj2) {
        ArrayList arrayList;
        boolean z10;
        int size;
        int i7;
        int i10;
        int i11 = this.a;
        boolean z11 = true;
        Object obj3 = this.b;
        switch (i11) {
            case 0:
                final k kVar = (k) obj3;
                ArrayList arrayList2 = (ArrayList) obj;
                i iVar = kVar.E;
                ArrayList arrayList3 = kVar.y;
                if (!kVar.b && arrayList3.isEmpty()) {
                    arrayList2.add(n41.k(kVar.d));
                }
                SharedPreferences sharedPreferences = kVar.getContext().getSharedPreferences("webhistory", 0);
                ArrayList arrayList4 = new ArrayList();
                String string = sharedPreferences.getString("queries_json", null);
                if (string != null) {
                    try {
                        arrayList = new ArrayList();
                        JSONArray jSONArray = new JSONArray(string);
                        int i12 = 0;
                        while (i12 < jSONArray.length()) {
                            JSONObject jSONObject = jSONArray.getJSONObject(i12);
                            z10 = z11;
                            try {
                                j jVar = new j(jSONObject.optString("name"), jSONObject.optLong("usage", System.currentTimeMillis()));
                                jVar.c = jSONObject.optDouble("rank", 0.0d);
                                arrayList.add(jVar);
                                i12++;
                                jSONArray = jSONArray;
                                z11 = z10;
                            } catch (Exception unused) {
                            }
                        }
                        z10 = z11;
                        Collections.sort(arrayList, new ow0(7));
                        size = arrayList.size();
                        i7 = 0;
                    } catch (Exception unused2) {
                    }
                    while (i7 < size) {
                        Object obj4 = arrayList.get(i7);
                        i7++;
                        j jVar2 = (j) obj4;
                        if (arrayList4.size() >= 20) {
                            arrayList3.size();
                            arrayList4.size();
                            if (!arrayList3.isEmpty()) {
                                arrayList2.add(n41.k(kVar.w));
                            }
                            i10 = 0;
                            while (i10 < arrayList3.size()) {
                                final String str = (String) arrayList3.get(i10);
                                boolean z12 = i10 == 0 ? z10 : false;
                                boolean z13 = i10 == arrayList3.size() + (-1) ? z10 : false;
                                final int i13 = 0;
                                View.OnClickListener onClickListener = new View.OnClickListener() { // from class: org.telegram.ui.web.c
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        switch (i13) {
                                            case 0:
                                                org.telegram.ui.q qVar = kVar.N;
                                                if (qVar != null) {
                                                    qVar.a(str);
                                                    break;
                                                }
                                                break;
                                            default:
                                                org.telegram.ui.q qVar2 = kVar.N;
                                                if (qVar2 != null) {
                                                    qVar2.a(str);
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                };
                                int i14 = d.b;
                                n41 K = n41.K(d.class);
                                K.A = z10 ? 1 : 0;
                                K.m = str;
                                K.E = onClickListener;
                                K.r = z12;
                                K.s = z13;
                                K.H = Boolean.TRUE;
                                K.I = kVar;
                                arrayList2.add(K);
                                i10++;
                                z10 = true;
                            }
                            if (!arrayList4.isEmpty()) {
                                arrayList2.add(n41.s(gd.N0(2131742641, null), gd.N0(2131742645, null), new z4(kVar, 27)));
                                int i15 = 0;
                                while (i15 < arrayList4.size()) {
                                    final String str2 = (String) arrayList4.get(i15);
                                    boolean z14 = i15 == 0;
                                    final int i16 = 1;
                                    boolean z15 = i15 == arrayList4.size() - 1;
                                    View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: org.telegram.ui.web.c
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            switch (i16) {
                                                case 0:
                                                    org.telegram.ui.q qVar = kVar.N;
                                                    if (qVar != null) {
                                                        qVar.a(str2);
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    org.telegram.ui.q qVar2 = kVar.N;
                                                    if (qVar2 != null) {
                                                        qVar2.a(str2);
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    };
                                    int i17 = d.b;
                                    n41 K2 = n41.K(d.class);
                                    K2.A = 0;
                                    K2.m = str2;
                                    K2.E = onClickListener2;
                                    K2.r = z14;
                                    K2.s = z15;
                                    K2.H = Boolean.TRUE;
                                    K2.I = kVar;
                                    arrayList2.add(K2);
                                    i15++;
                                }
                            }
                            if (iVar != null) {
                                ArrayList arrayList5 = iVar.a;
                                if (!arrayList5.isEmpty()) {
                                    arrayList2.add(n41.r(gd.N0(2131742642, null)));
                                    for (int i18 = 0; i18 < arrayList5.size(); i18++) {
                                        fj fjVar = (fj) arrayList5.get(i18);
                                        if (!TextUtils.isEmpty(k.a(fjVar))) {
                                            int i19 = g.b;
                                            n41 K3 = n41.K(g.class);
                                            K3.A = 3;
                                            K3.r = true;
                                            K3.I = fjVar;
                                            arrayList2.add(K3);
                                        }
                                    }
                                    if (!iVar.f) {
                                        arrayList2.add(n41.q(arrayList2.size(), 32));
                                        arrayList2.add(n41.q(arrayList2.size(), 32));
                                        arrayList2.add(n41.q(arrayList2.size(), 32));
                                        break;
                                    }
                                }
                            }
                        } else {
                            arrayList4.add(jVar2.a);
                        }
                    }
                    arrayList3.size();
                    arrayList4.size();
                    if (!arrayList3.isEmpty()) {
                    }
                    i10 = 0;
                    while (i10 < arrayList3.size()) {
                    }
                    if (!arrayList4.isEmpty()) {
                    }
                    if (iVar != null) {
                    }
                }
                z10 = z11;
                arrayList3.size();
                arrayList4.size();
                if (!arrayList3.isEmpty()) {
                }
                i10 = 0;
                while (i10 < arrayList3.size()) {
                }
                if (!arrayList4.isEmpty()) {
                }
                if (iVar != null) {
                }
                break;
            case 1:
                l5 l5Var = (l5) obj3;
                l5Var.A0 = ((Integer) obj).intValue();
                l5Var.B0 = ((Integer) obj2).intValue();
                org.telegram.messenger.g0.h3(new z0(l5Var, 20), 60L);
                break;
            case 2:
                vh.g gVar = (vh.g) obj3;
                ArrayList arrayList6 = (ArrayList) obj;
                ArrayList arrayList7 = gVar.W1;
                if (arrayList7 != null && !arrayList7.isEmpty()) {
                    int L = org.telegram.messenger.g0.L(13.0f) + ((org.telegram.messenger.g0.q.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - org.telegram.messenger.g0.L(68.0f));
                    int L2 = org.telegram.messenger.g0.L(88.0f) + gVar.h2;
                    arrayList6.add(n41.E(0, L2));
                    int i20 = L - L2;
                    int size2 = arrayList7.size();
                    int i21 = 0;
                    while (i21 < size2) {
                        Object obj5 = arrayList7.get(i21);
                        i21++;
                        for (TLRPC.TL_help_country tL_help_country : (List) gVar.V1.get((String) obj5)) {
                            if (TextUtils.isEmpty(gVar.Y1) || wg.v0.h1(tL_help_country, org.telegram.messenger.g0.M3(gVar.Y1).toLowerCase())) {
                                i20 -= org.telegram.messenger.g0.L(44.0f);
                                boolean containsKey = gVar.f2.containsKey(tL_help_country.iso2);
                                int i22 = vh.f.b;
                                n41 K4 = n41.K(vh.f.class);
                                K4.m = tL_help_country.iso2;
                                K4.H = tL_help_country;
                                K4.e = containsKey;
                                arrayList6.add(K4);
                            }
                        }
                    }
                    arrayList6.add(n41.E(1, Math.max(0, i20)));
                    break;
                }
                break;
            case 3:
                ArrayList arrayList8 = (ArrayList) obj;
                org.telegram.ui.n41 n41Var = ((vh.h) obj3).U1;
                if (n41Var != null) {
                    arrayList8.add(n41.D(org.telegram.messenger.g0.L(12.0f)));
                    arrayList8.add(n41.h(0, 0, n41Var));
                    break;
                }
                break;
            default:
                ((n2) obj3).a((TL_stats.TL_statsPollStats) obj);
                break;
        }
    }
}
