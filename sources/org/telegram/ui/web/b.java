package org.telegram.ui.web;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.view.View;
import gi.c5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.messenger.bd;
import org.telegram.messenger.n10;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.Components.d80;
import org.telegram.ui.Components.r31;
import org.telegram.ui.d41;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements n10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // org.telegram.messenger.n10
    public final void a(Object obj, Object obj2) {
        int i3 = this.a;
        final int i10 = 1;
        final int i11 = 0;
        Object obj3 = this.b;
        switch (i3) {
            case 0:
                final l lVar = (l) obj3;
                ArrayList arrayList = (ArrayList) obj;
                j jVar = lVar.E;
                ArrayList arrayList2 = lVar.y;
                if (!lVar.b && arrayList2.isEmpty()) {
                    arrayList.add(r31.k(lVar.d));
                }
                SharedPreferences sharedPreferences = lVar.getContext().getSharedPreferences("webhistory", 0);
                ArrayList arrayList3 = new ArrayList();
                String string = sharedPreferences.getString("queries_json", null);
                if (string != null) {
                    try {
                        ArrayList arrayList4 = new ArrayList();
                        int i12 = 0;
                        for (JSONArray jSONArray = new JSONArray(string); i12 < jSONArray.length(); jSONArray = jSONArray) {
                            JSONObject jSONObject = jSONArray.getJSONObject(i12);
                            k kVar = new k(jSONObject.optString("name"), jSONObject.optLong("usage", System.currentTimeMillis()));
                            kVar.c = jSONObject.optDouble("rank", 0.0d);
                            arrayList4.add(kVar);
                            i12++;
                        }
                        Collections.sort(arrayList4, new d80(26));
                        int size = arrayList4.size();
                        int i13 = 0;
                        while (i13 < size) {
                            Object obj4 = arrayList4.get(i13);
                            i13++;
                            k kVar2 = (k) obj4;
                            if (arrayList3.size() < 20) {
                                arrayList3.add(kVar2.a);
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
                arrayList2.size();
                arrayList3.size();
                if (!arrayList2.isEmpty()) {
                    arrayList.add(r31.k(lVar.w));
                }
                int i14 = 0;
                while (i14 < arrayList2.size()) {
                    final String str = (String) arrayList2.get(i14);
                    boolean z10 = i14 == 0;
                    boolean z11 = i14 == arrayList2.size() - 1;
                    View.OnClickListener onClickListener = new View.OnClickListener() { // from class: org.telegram.ui.web.c
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i11) {
                                case 0:
                                    org.telegram.ui.q qVar = lVar.N;
                                    if (qVar != null) {
                                        qVar.a(str);
                                        break;
                                    }
                                    break;
                                default:
                                    org.telegram.ui.q qVar2 = lVar.N;
                                    if (qVar2 != null) {
                                        qVar2.a(str);
                                        break;
                                    }
                                    break;
                            }
                        }
                    };
                    int i15 = e.b;
                    r31 K = r31.K(e.class);
                    K.z = 1;
                    K.l = str;
                    K.D = onClickListener;
                    K.q = z10;
                    K.r = z11;
                    K.G = Boolean.TRUE;
                    K.H = lVar;
                    arrayList.add(K);
                    i14++;
                }
                if (!arrayList3.isEmpty()) {
                    arrayList.add(r31.s(bd.M0(2131742922, null), bd.M0(2131742926, null), new ii.m(lVar, 24)));
                    int i16 = 0;
                    while (i16 < arrayList3.size()) {
                        final String str2 = (String) arrayList3.get(i16);
                        boolean z12 = i16 == 0;
                        boolean z13 = i16 == arrayList3.size() - 1;
                        View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: org.telegram.ui.web.c
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i10) {
                                    case 0:
                                        org.telegram.ui.q qVar = lVar.N;
                                        if (qVar != null) {
                                            qVar.a(str2);
                                            break;
                                        }
                                        break;
                                    default:
                                        org.telegram.ui.q qVar2 = lVar.N;
                                        if (qVar2 != null) {
                                            qVar2.a(str2);
                                            break;
                                        }
                                        break;
                                }
                            }
                        };
                        int i17 = e.b;
                        r31 K2 = r31.K(e.class);
                        K2.z = 0;
                        K2.l = str2;
                        K2.D = onClickListener2;
                        K2.q = z12;
                        K2.r = z13;
                        K2.G = Boolean.TRUE;
                        K2.H = lVar;
                        arrayList.add(K2);
                        i16++;
                    }
                }
                if (jVar != null) {
                    ArrayList arrayList5 = jVar.a;
                    if (!arrayList5.isEmpty()) {
                        arrayList.add(r31.r(bd.M0(2131742923, null)));
                        while (i11 < arrayList5.size()) {
                            zi ziVar = (zi) arrayList5.get(i11);
                            if (!TextUtils.isEmpty(l.a(ziVar))) {
                                int i18 = h.b;
                                r31 K3 = r31.K(h.class);
                                K3.z = 3;
                                K3.q = true;
                                K3.H = ziVar;
                                arrayList.add(K3);
                            }
                            i11++;
                        }
                        if (!jVar.f) {
                            arrayList.add(r31.q(arrayList.size(), 32));
                            arrayList.add(r31.q(arrayList.size(), 32));
                            arrayList.add(r31.q(arrayList.size(), 32));
                            break;
                        }
                    }
                }
                break;
            case 1:
                c5 c5Var = (c5) obj3;
                c5Var.z0 = ((Integer) obj).intValue();
                c5Var.A0 = ((Integer) obj2).intValue();
                org.telegram.messenger.g0.i3(new r4.u(c5Var, 14), 60L);
                break;
            case 2:
                wh.h hVar = (wh.h) obj3;
                ArrayList arrayList6 = (ArrayList) obj;
                ArrayList arrayList7 = hVar.T1;
                if (arrayList7 != null && !arrayList7.isEmpty()) {
                    int L = org.telegram.messenger.g0.L(13.0f) + ((org.telegram.messenger.g0.q.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - org.telegram.messenger.g0.L(68.0f));
                    int L2 = org.telegram.messenger.g0.L(88.0f) + hVar.e2;
                    arrayList6.add(r31.E(0, L2));
                    int i19 = L - L2;
                    int size2 = arrayList7.size();
                    int i20 = 0;
                    while (i20 < size2) {
                        Object obj5 = arrayList7.get(i20);
                        i20++;
                        for (TLRPC.TL_help_country tL_help_country : (List) hVar.S1.get((String) obj5)) {
                            if (TextUtils.isEmpty(hVar.V1) || xg.w0.g1(tL_help_country, org.telegram.messenger.g0.O3(hVar.V1).toLowerCase())) {
                                i19 -= org.telegram.messenger.g0.L(44.0f);
                                boolean containsKey = hVar.c2.containsKey(tL_help_country.iso2);
                                int i21 = wh.g.b;
                                r31 K4 = r31.K(wh.g.class);
                                K4.l = tL_help_country.iso2;
                                K4.G = tL_help_country;
                                K4.e = containsKey;
                                arrayList6.add(K4);
                            }
                        }
                    }
                    arrayList6.add(r31.E(1, Math.max(0, i19)));
                    break;
                }
                break;
            case 3:
                ArrayList arrayList8 = (ArrayList) obj;
                d41 d41Var = ((wh.i) obj3).R1;
                if (d41Var != null) {
                    arrayList8.add(r31.D(org.telegram.messenger.g0.L(12.0f)));
                    arrayList8.add(r31.h(0, 0, d41Var));
                    break;
                }
                break;
            default:
                ((mi.f) obj3).a((TL_stats.TL_statsPollStats) obj);
                break;
        }
    }
}
