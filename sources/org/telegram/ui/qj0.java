package org.telegram.ui;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Locale;
import org.json.JSONObject;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class qj0 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ hk0 a;

    public qj0(hk0 hk0Var) {
        this.a = hk0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0219  */
    @Override // org.telegram.ui.ActionBar.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(int i7) {
        int i10;
        int i11;
        int i12;
        JSONObject jSONObject;
        HashMap hashMap;
        HashMap hashMap2;
        String str;
        int i13;
        String obj;
        hk0 hk0Var = this.a;
        int i14 = hk0Var.b;
        if (i7 == -1) {
            if (hk0Var.b1(true)) {
                return;
            }
            if (i14 == 0 || i14 == 5) {
                hk0Var.a1(false);
            }
            hk0Var.finishFragment();
            return;
        }
        int i15 = 4;
        if (i7 == 1) {
            if (hk0Var.getParentActivity() == null) {
                return;
            }
            org.telegram.ui.Components.m80 m80Var = new org.telegram.ui.Components.m80(hk0Var.getParentActivity(), null);
            String N0 = org.telegram.messenger.hd.N0(2131747365, null);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(N0);
            int indexOf = N0.indexOf(42);
            int lastIndexOf = N0.lastIndexOf(42);
            if (indexOf != -1 && lastIndexOf != -1) {
                spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
                spannableStringBuilder.replace(indexOf, indexOf + 1, (CharSequence) "");
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.p4(org.telegram.messenger.hd.N0(2131747363, null), i15, this), indexOf, lastIndexOf - 1, 33);
            }
            m80Var.setText(spannableStringBuilder);
            m80Var.setTextSize(1, 16.0f);
            org.telegram.ui.ActionBar.t6.G(m80Var, org.telegram.ui.ActionBar.m6.k5, null);
            org.telegram.ui.ActionBar.t6.C(m80Var, org.telegram.ui.ActionBar.m6.l5, null);
            m80Var.setPadding(org.telegram.messenger.g0.L(23.0f), 0, org.telegram.messenger.g0.L(23.0f), 0);
            m80Var.setMovementMethod(new org.telegram.messenger.c0(false));
            org.telegram.ui.ActionBar.t6.U(m80Var, org.telegram.ui.ActionBar.m6.j5, null);
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(hk0Var.getParentActivity());
            alertDialog$Builder.o(m80Var);
            String N02 = org.telegram.messenger.hd.N0(2131747364, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
            t1Var.S = N02;
            alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752029, null), null);
            hk0Var.showDialog(t1Var);
            return;
        }
        if (i7 == 2) {
            if (i14 == 5) {
                hk0Var.F1(false);
                return;
            }
            if (i14 == 7) {
                hk0Var.K1[hk0Var.J1].h(null);
                return;
            }
            hf0 hf0Var = new hf0(this, 6);
            k8.a aVar = new k8.a(18, this, hf0Var);
            if (i14 == 4) {
                if (hk0Var.f) {
                    obj = hk0Var.e1;
                } else if (hk0.H0(hk0Var)) {
                    return;
                } else {
                    obj = hk0Var.Z[0].getText().toString();
                }
                ((mj0) hk0Var.C1).c(hk0Var.F, obj, null, null, null, null, null, null, null, null, hf0Var, aVar);
            } else if (i14 == 3) {
                if (hk0Var.f) {
                    i13 = ((org.telegram.ui.ActionBar.g2) hk0Var).currentAccount;
                    str = org.telegram.messenger.k10.i(i13).f().phone;
                } else {
                    if (hk0.H0(hk0Var)) {
                        return;
                    }
                    str = hk0Var.Z[1].getText().toString() + hk0Var.Z[2].getText().toString();
                }
                ((mj0) hk0Var.C1).c(hk0Var.F, str, null, null, null, null, null, null, null, null, hf0Var, aVar);
            } else if (i14 == 2) {
                if (!hk0Var.p1.isEmpty() || hk0.H0(hk0Var)) {
                    return;
                }
                if (hk0Var.y1()) {
                    hk0Var.finishFragment();
                    return;
                }
                if (!hk0Var.w0) {
                    jSONObject = new JSONObject();
                    try {
                        jSONObject.put("street_line1", hk0Var.Z[0].getText().toString());
                        jSONObject.put("street_line2", hk0Var.Z[1].getText().toString());
                        jSONObject.put("post_code", hk0Var.Z[2].getText().toString());
                        jSONObject.put("city", hk0Var.Z[3].getText().toString());
                        jSONObject.put("state", hk0Var.Z[4].getText().toString());
                        jSONObject.put("country_code", hk0Var.s);
                    } catch (Exception unused) {
                    }
                    hashMap = hk0Var.x1;
                    if (hashMap != null) {
                        hashMap.clear();
                    }
                    hashMap2 = hk0Var.y1;
                    if (hashMap2 != null) {
                        hashMap2.clear();
                    }
                    ((mj0) hk0Var.C1).c(hk0Var.F, null, jSONObject != null ? jSONObject.toString() : null, hk0Var.G, null, hk0Var.j1, hk0Var.k1, hk0Var.l1, null, null, hf0Var, aVar);
                }
                jSONObject = null;
                hashMap = hk0Var.x1;
                if (hashMap != null) {
                }
                hashMap2 = hk0Var.y1;
                if (hashMap2 != null) {
                }
                ((mj0) hk0Var.C1).c(hk0Var.F, null, jSONObject != null ? jSONObject.toString() : null, hk0Var.G, null, hk0Var.j1, hk0Var.k1, hk0Var.l1, null, null, hf0Var, aVar);
            } else if (i14 == 1) {
                if (!c(hf0Var, aVar)) {
                    return;
                }
            } else if (i14 == 6) {
                TL_account.verifyEmail verifyemail = new TL_account.verifyEmail();
                verifyemail.purpose = new TLRPC.TL_emailVerifyPurposePassport();
                TLRPC.TL_emailVerificationCode tL_emailVerificationCode = new TLRPC.TL_emailVerificationCode();
                tL_emailVerificationCode.code = hk0Var.Z[0].getText().toString();
                verifyemail.verification = tL_emailVerificationCode;
                i10 = ((org.telegram.ui.ActionBar.g2) hk0Var).currentAccount;
                int sendRequest = ConnectionsManager.getInstance(i10).sendRequest(verifyemail, new bi.k2(this, hf0Var, aVar, verifyemail, 16));
                i11 = ((org.telegram.ui.ActionBar.g2) hk0Var).currentAccount;
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
                i12 = ((org.telegram.ui.ActionBar.g2) hk0Var).classGuid;
                connectionsManager.bindRequestToGuid(sendRequest, i12);
            }
            hk0Var.R1(true, true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0309  */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v11 */
    /* JADX WARN: Type inference failed for: r19v2, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(hf0 hf0Var, k8.a aVar) {
        ?? r19;
        int i7;
        char c10;
        int i10;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        HashMap hashMap;
        HashMap hashMap2;
        LinearLayout linearLayout;
        char c11;
        int i11;
        char c12;
        boolean z10;
        int i12;
        hk0 hk0Var = this.a;
        int[] iArr = hk0Var.y;
        boolean[] zArr = hk0Var.u0;
        char c13 = 0;
        if (!hk0Var.p1.isEmpty() || hk0.H0(hk0Var)) {
            return false;
        }
        int i13 = 3;
        char c14 = 2;
        org.telegram.messenger.zv zvVar = null;
        ?? r15 = 1;
        if (hk0Var.v0) {
            hk0Var.v0 = false;
            int i14 = 0;
            boolean z11 = false;
            while (i14 < zArr.length) {
                if (zArr[i14]) {
                    hk0Var.Z[i14].setErrorText(org.telegram.messenger.hd.N0(2131747255, null));
                    if (!z11) {
                        String T0 = zArr[c13] ? org.telegram.messenger.hd.E0().T0(hk0Var.b0[c13].getText().toString(), r15, r15) : hk0Var.Z[c13].getText().toString();
                        String T02 = zArr[r15] ? org.telegram.messenger.hd.E0().T0(hk0Var.b0[r15].getText().toString(), r15, r15) : hk0Var.Z[r15].getText().toString();
                        String T03 = zArr[c14] ? org.telegram.messenger.hd.E0().T0(hk0Var.b0[c14].getText().toString(), r15, r15) : hk0Var.Z[c14].getText().toString();
                        if (TextUtils.isEmpty(T0) || TextUtils.isEmpty(T02) || TextUtils.isEmpty(T03)) {
                            c11 = c13;
                            i11 = i13;
                            c12 = c14;
                            z10 = r15;
                            i12 = i14;
                            hk0Var.D1(hk0Var.Z[i12]);
                        } else {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(hk0Var.getParentActivity());
                            Object[] objArr = new Object[i13];
                            objArr[c13] = T0;
                            objArr[r15] = T02;
                            objArr[c14] = T03;
                            c12 = c14;
                            String a02 = org.telegram.messenger.hd.a0("PassportNameCheckAlert", null, 2131747309, objArr);
                            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                            t1Var.U = a02;
                            t1Var.S = org.telegram.messenger.hd.N0(R.string.AppName, null);
                            c11 = c13;
                            z10 = r15;
                            i12 = i14;
                            i11 = i13;
                            alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131751342, null), new org.telegram.ui.Components.c1(this, T0, T02, T03, hf0Var, aVar, 1));
                            alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131751323, null), new ai.v1(this, i12, 18));
                            hk0Var.showDialog(t1Var);
                        }
                        z11 = z10;
                        i14 = i12 + 1;
                        c14 = c12;
                        i13 = i11;
                        r15 = z10;
                        c13 = c11;
                    }
                }
                c11 = c13;
                i11 = i13;
                c12 = c14;
                z10 = r15;
                i12 = i14;
                i14 = i12 + 1;
                c14 = c12;
                i13 = i11;
                r15 = z10;
                c13 = c11;
            }
            boolean z12 = c13;
            i7 = i13;
            c10 = c14;
            i10 = r15;
            r19 = z12;
            if (z11) {
                return z12;
            }
        } else {
            r19 = 0;
            i7 = 3;
            c10 = 2;
            i10 = 1;
        }
        if (hk0Var.y1()) {
            hk0Var.finishFragment();
            return r19;
        }
        try {
            if (hk0Var.w0) {
                jSONObject = null;
            } else {
                HashMap hashMap3 = new HashMap(hk0Var.t1);
                if (hk0Var.F.native_names) {
                    if (hk0Var.r0.getVisibility() == 0) {
                        hashMap3.put("first_name_native", hk0Var.b0[r19].getText().toString());
                        hashMap3.put("middle_name_native", hk0Var.b0[i10].getText().toString());
                        hashMap3.put("last_name_native", hk0Var.b0[c10].getText().toString());
                    } else {
                        hashMap3.put("first_name_native", hk0Var.Z[r19].getText().toString());
                        hashMap3.put("middle_name_native", hk0Var.Z[i10].getText().toString());
                        hashMap3.put("last_name_native", hk0Var.Z[c10].getText().toString());
                    }
                }
                hashMap3.put("first_name", hk0Var.Z[r19].getText().toString());
                hashMap3.put("middle_name", hk0Var.Z[i10].getText().toString());
                hashMap3.put("last_name", hk0Var.Z[c10].getText().toString());
                hashMap3.put("birth_date", hk0Var.Z[i7].getText().toString());
                hashMap3.put("gender", hk0Var.x);
                hashMap3.put("country_code", hk0Var.s);
                hashMap3.put("residence_country_code", hk0Var.w);
                jSONObject = new JSONObject();
                try {
                    ArrayList arrayList = new ArrayList(hashMap3.keySet());
                    final int i15 = r19;
                    Collections.sort(arrayList, new Comparator(this) { // from class: org.telegram.ui.pj0
                        public final /* synthetic */ qj0 b;

                        {
                            this.b = this;
                        }

                        @Override // java.util.Comparator
                        public final int compare(Object obj, Object obj2) {
                            String str = (String) obj;
                            String str2 = (String) obj2;
                            switch (i15) {
                                case 0:
                                    hk0 hk0Var2 = this.b.a;
                                    int G0 = hk0.G0(hk0Var2, str);
                                    int G02 = hk0.G0(hk0Var2, str2);
                                    if (G0 >= G02) {
                                        if (G0 > G02) {
                                        }
                                    }
                                    break;
                                default:
                                    hk0 hk0Var3 = this.b.a;
                                    int G03 = hk0.G0(hk0Var3, str);
                                    int G04 = hk0.G0(hk0Var3, str2);
                                    if (G03 >= G04) {
                                        if (G03 > G04) {
                                        }
                                    }
                                    break;
                            }
                            return 0;
                        }
                    });
                    int size = arrayList.size();
                    for (int i16 = 0; i16 < size; i16++) {
                        String str = (String) arrayList.get(i16);
                        jSONObject.put(str, hashMap3.get(str));
                    }
                } catch (Exception unused) {
                }
            }
        } catch (Exception unused2) {
            jSONObject = null;
            jSONObject2 = null;
        }
        if (hk0Var.G != null) {
            HashMap hashMap4 = new HashMap(hk0Var.u1);
            hashMap4.put("document_no", hk0Var.Z[7].getText().toString());
            if (iArr[0] != 0) {
                Locale locale = Locale.US;
                Integer valueOf = Integer.valueOf(iArr[c10]);
                Integer valueOf2 = Integer.valueOf(iArr[i10]);
                Integer valueOf3 = Integer.valueOf(iArr[0]);
                Object[] objArr2 = new Object[i7];
                objArr2[0] = valueOf;
                objArr2[i10] = valueOf2;
                objArr2[c10] = valueOf3;
                hashMap4.put("expiry_date", String.format(locale, "%02d.%02d.%d", objArr2));
            } else {
                hashMap4.put("expiry_date", "");
            }
            jSONObject2 = new JSONObject();
            try {
                ArrayList arrayList2 = new ArrayList(hashMap4.keySet());
                final int i17 = i10;
                Collections.sort(arrayList2, new Comparator(this) { // from class: org.telegram.ui.pj0
                    public final /* synthetic */ qj0 b;

                    {
                        this.b = this;
                    }

                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        String str2 = (String) obj;
                        String str22 = (String) obj2;
                        switch (i17) {
                            case 0:
                                hk0 hk0Var2 = this.b.a;
                                int G0 = hk0.G0(hk0Var2, str2);
                                int G02 = hk0.G0(hk0Var2, str22);
                                if (G0 >= G02) {
                                    if (G0 > G02) {
                                    }
                                }
                                break;
                            default:
                                hk0 hk0Var3 = this.b.a;
                                int G03 = hk0.G0(hk0Var3, str2);
                                int G04 = hk0.G0(hk0Var3, str22);
                                if (G03 >= G04) {
                                    if (G03 > G04) {
                                    }
                                }
                                break;
                        }
                        return 0;
                    }
                });
                int size2 = arrayList2.size();
                for (int i18 = 0; i18 < size2; i18++) {
                    String str2 = (String) arrayList2.get(i18);
                    jSONObject2.put(str2, hashMap4.get(str2));
                }
            } catch (Exception unused3) {
            }
            hashMap = hk0Var.x1;
            if (hashMap != null) {
                hashMap.clear();
            }
            hashMap2 = hk0Var.y1;
            if (hashMap2 != null) {
                hashMap2.clear();
            }
            yj0 yj0Var = hk0Var.C1;
            TLRPC.TL_secureRequiredType tL_secureRequiredType = hk0Var.F;
            String jSONObject3 = jSONObject == null ? jSONObject.toString() : null;
            TLRPC.TL_secureRequiredType tL_secureRequiredType2 = hk0Var.G;
            String jSONObject4 = jSONObject2 == null ? jSONObject2.toString() : null;
            org.telegram.messenger.zv zvVar2 = hk0Var.k1;
            ArrayList arrayList3 = hk0Var.l1;
            org.telegram.messenger.zv zvVar3 = hk0Var.m1;
            linearLayout = hk0Var.g0;
            if (linearLayout != null && linearLayout.getVisibility() == 0) {
                zvVar = hk0Var.n1;
            }
            ((mj0) yj0Var).c(tL_secureRequiredType, null, jSONObject3, tL_secureRequiredType2, jSONObject4, null, zvVar2, arrayList3, zvVar3, zvVar, hf0Var, aVar);
            return true;
        }
        jSONObject2 = null;
        hashMap = hk0Var.x1;
        if (hashMap != null) {
        }
        hashMap2 = hk0Var.y1;
        if (hashMap2 != null) {
        }
        yj0 yj0Var2 = hk0Var.C1;
        TLRPC.TL_secureRequiredType tL_secureRequiredType3 = hk0Var.F;
        if (jSONObject == null) {
        }
        TLRPC.TL_secureRequiredType tL_secureRequiredType22 = hk0Var.G;
        if (jSONObject2 == null) {
        }
        org.telegram.messenger.zv zvVar22 = hk0Var.k1;
        ArrayList arrayList32 = hk0Var.l1;
        org.telegram.messenger.zv zvVar32 = hk0Var.m1;
        linearLayout = hk0Var.g0;
        if (linearLayout != null) {
            zvVar = hk0Var.n1;
        }
        ((mj0) yj0Var2).c(tL_secureRequiredType3, null, jSONObject3, tL_secureRequiredType22, jSONObject4, null, zvVar22, arrayList32, zvVar32, zvVar, hf0Var, aVar);
        return true;
    }
}
