package org.telegram.ui.web;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.view.View;
import hi.c5;
import hi.p5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.s10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.Components.b41;
import org.telegram.ui.l41;
import org.telegram.ui.qv0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements s10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.messenger.s10
    public final void a(Object obj, Object obj2) {
        int i7 = this.a;
        final int i10 = 1;
        final int i11 = 0;
        Object obj3 = this.b;
        switch (i7) {
            case 0:
                final k kVar = (k) obj3;
                ArrayList arrayList = (ArrayList) obj;
                i iVar = kVar.E;
                ArrayList arrayList2 = kVar.y;
                if (!kVar.b && arrayList2.isEmpty()) {
                    arrayList.add(b41.k(kVar.d));
                }
                SharedPreferences sharedPreferences = kVar.getContext().getSharedPreferences("webhistory", 0);
                ArrayList arrayList3 = new ArrayList();
                String string = sharedPreferences.getString("queries_json", null);
                if (string != null) {
                    try {
                        ArrayList arrayList4 = new ArrayList();
                        int i12 = 0;
                        for (JSONArray jSONArray = new JSONArray(string); i12 < jSONArray.length(); jSONArray = jSONArray) {
                            JSONObject jSONObject = jSONArray.getJSONObject(i12);
                            j jVar = new j(jSONObject.optString("name"), jSONObject.optLong("usage", System.currentTimeMillis()));
                            jVar.c = jSONObject.optDouble("rank", 0.0d);
                            arrayList4.add(jVar);
                            i12++;
                        }
                        Collections.sort(arrayList4, new qv0(8));
                        int size = arrayList4.size();
                        int i13 = 0;
                        while (i13 < size) {
                            Object obj4 = arrayList4.get(i13);
                            i13++;
                            j jVar2 = (j) obj4;
                            if (arrayList3.size() < 20) {
                                arrayList3.add(jVar2.a);
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
                arrayList2.size();
                arrayList3.size();
                if (!arrayList2.isEmpty()) {
                    arrayList.add(b41.k(kVar.w));
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
                    int i15 = d.b;
                    b41 K = b41.K(d.class);
                    K.z = 1;
                    K.l = str;
                    K.D = onClickListener;
                    K.q = z10;
                    K.r = z11;
                    K.G = Boolean.TRUE;
                    K.H = kVar;
                    arrayList.add(K);
                    i14++;
                }
                if (!arrayList3.isEmpty()) {
                    arrayList.add(b41.s(hd.M0(2131742912, null), hd.M0(2131742916, null), new p5(kVar, 26)));
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
                        b41 K2 = b41.K(d.class);
                        K2.z = 0;
                        K2.l = str2;
                        K2.D = onClickListener2;
                        K2.q = z12;
                        K2.r = z13;
                        K2.G = Boolean.TRUE;
                        K2.H = kVar;
                        arrayList.add(K2);
                        i16++;
                    }
                }
                if (iVar != null) {
                    ArrayList arrayList5 = iVar.a;
                    if (!arrayList5.isEmpty()) {
                        arrayList.add(b41.r(hd.M0(2131742913, null)));
                        while (i11 < arrayList5.size()) {
                            gj gjVar = (gj) arrayList5.get(i11);
                            if (!TextUtils.isEmpty(k.a(gjVar))) {
                                int i18 = g.b;
                                b41 K3 = b41.K(g.class);
                                K3.z = 3;
                                K3.q = true;
                                K3.H = gjVar;
                                arrayList.add(K3);
                            }
                            i11++;
                        }
                        if (!iVar.f) {
                            arrayList.add(b41.q(arrayList.size(), 32));
                            arrayList.add(b41.q(arrayList.size(), 32));
                            arrayList.add(b41.q(arrayList.size(), 32));
                            break;
                        }
                    }
                }
                break;
            case 1:
                c5 c5Var = (c5) obj3;
                c5Var.z0 = ((Integer) obj).intValue();
                c5Var.A0 = ((Integer) obj2).intValue();
                org.telegram.messenger.g0.i3(new q2.d(c5Var, 16), 60L);
                break;
            case 2:
                vh.h hVar = (vh.h) obj3;
                ArrayList arrayList6 = (ArrayList) obj;
                ArrayList arrayList7 = hVar.W1;
                if (arrayList7 != null && !arrayList7.isEmpty()) {
                    int L = org.telegram.messenger.g0.L(13.0f) + ((org.telegram.messenger.g0.q.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - org.telegram.messenger.g0.L(68.0f));
                    int L2 = org.telegram.messenger.g0.L(88.0f) + hVar.h2;
                    arrayList6.add(b41.E(0, L2));
                    int i19 = L - L2;
                    int size2 = arrayList7.size();
                    int i20 = 0;
                    while (i20 < size2) {
                        Object obj5 = arrayList7.get(i20);
                        i20++;
                        for (TLRPC.TL_help_country tL_help_country : (List) hVar.V1.get((String) obj5)) {
                            if (TextUtils.isEmpty(hVar.Y1) || wg.u0.g1(tL_help_country, org.telegram.messenger.g0.N3(hVar.Y1).toLowerCase())) {
                                i19 -= org.telegram.messenger.g0.L(44.0f);
                                boolean containsKey = hVar.f2.containsKey(tL_help_country.iso2);
                                int i21 = vh.g.b;
                                b41 K4 = b41.K(vh.g.class);
                                K4.l = tL_help_country.iso2;
                                K4.G = tL_help_country;
                                K4.e = containsKey;
                                arrayList6.add(K4);
                            }
                        }
                    }
                    arrayList6.add(b41.E(1, Math.max(0, i19)));
                    break;
                }
                break;
            case 3:
                ArrayList arrayList8 = (ArrayList) obj;
                l41 l41Var = ((vh.i) obj3).U1;
                if (l41Var != null) {
                    arrayList8.add(b41.D(org.telegram.messenger.g0.L(12.0f)));
                    arrayList8.add(b41.h(0, 0, l41Var));
                    break;
                }
                break;
            default:
                ((li.v) obj3).a((TL_stats.TL_statsPollStats) obj);
                break;
        }
    }
}
