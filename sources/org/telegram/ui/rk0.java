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

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class rk0 extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ jl0 a;

    public rk0(jl0 jl0Var) {
        this.a = jl0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0219  */
    @Override // org.telegram.ui.ActionBar.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(int i10) {
        int i11;
        int i12;
        int i13;
        JSONObject jSONObject;
        HashMap hashMap;
        HashMap hashMap2;
        String str;
        int i14;
        String obj;
        jl0 jl0Var = this.a;
        int i15 = jl0Var.b;
        if (i10 == -1) {
            if (jl0Var.b1(true)) {
                return;
            }
            if (i15 == 0 || i15 == 5) {
                jl0Var.a1(false);
            }
            jl0Var.finishFragment();
            return;
        }
        if (i10 == 1) {
            if (jl0Var.getParentActivity() == null) {
                return;
            }
            org.telegram.ui.Components.p80 p80Var = new org.telegram.ui.Components.p80(jl0Var.getParentActivity(), null);
            String L0 = org.telegram.messenger.dd.L0(2131747575, null);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(L0);
            int indexOf = L0.indexOf(42);
            int lastIndexOf = L0.lastIndexOf(42);
            if (indexOf != -1 && lastIndexOf != -1) {
                spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
                spannableStringBuilder.replace(indexOf, indexOf + 1, (CharSequence) "");
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.f4(org.telegram.messenger.dd.L0(2131747573, null), 4, this), indexOf, lastIndexOf - 1, 33);
            }
            p80Var.setText(spannableStringBuilder);
            p80Var.setTextSize(1, 16.0f);
            org.telegram.ui.ActionBar.a7.H(p80Var, org.telegram.ui.ActionBar.t6.k5, null);
            org.telegram.ui.ActionBar.a7.D(p80Var, org.telegram.ui.ActionBar.t6.l5, null);
            p80Var.setPadding(org.telegram.messenger.i0.L(23.0f), 0, org.telegram.messenger.i0.L(23.0f), 0);
            p80Var.setMovementMethod(new org.telegram.messenger.e0(false));
            org.telegram.ui.ActionBar.a7.V(p80Var, org.telegram.ui.ActionBar.t6.j5, null);
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(jl0Var.getParentActivity());
            alertDialog$Builder.o(p80Var);
            String L02 = org.telegram.messenger.dd.L0(2131747574, null);
            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
            x1Var.R = L02;
            alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752041, null), null);
            jl0Var.showDialog(x1Var);
            return;
        }
        if (i10 == 2) {
            if (i15 == 5) {
                jl0Var.F1(false);
                return;
            }
            if (i15 == 7) {
                jl0Var.J1[jl0Var.I1].h(null);
                return;
            }
            kg0 kg0Var = new kg0(this, 6);
            m4.c cVar = new m4.c(18, this, kg0Var);
            if (i15 == 4) {
                if (jl0Var.f) {
                    obj = jl0Var.d1;
                } else if (jl0.H0(jl0Var)) {
                    return;
                } else {
                    obj = jl0Var.Y[0].getText().toString();
                }
                ((nk0) jl0Var.B1).c(jl0Var.E, obj, null, null, null, null, null, null, null, null, kg0Var, cVar);
            } else if (i15 == 3) {
                if (jl0Var.f) {
                    i14 = ((org.telegram.ui.ActionBar.k2) jl0Var).currentAccount;
                    str = org.telegram.messenger.e20.i(i14).f().phone;
                } else {
                    if (jl0.H0(jl0Var)) {
                        return;
                    }
                    str = jl0Var.Y[1].getText().toString() + jl0Var.Y[2].getText().toString();
                }
                ((nk0) jl0Var.B1).c(jl0Var.E, str, null, null, null, null, null, null, null, null, kg0Var, cVar);
            } else if (i15 == 2) {
                if (!jl0Var.o1.isEmpty() || jl0.H0(jl0Var)) {
                    return;
                }
                if (jl0Var.y1()) {
                    jl0Var.finishFragment();
                    return;
                }
                if (!jl0Var.v0) {
                    jSONObject = new JSONObject();
                    try {
                        jSONObject.put("street_line1", jl0Var.Y[0].getText().toString());
                        jSONObject.put("street_line2", jl0Var.Y[1].getText().toString());
                        jSONObject.put("post_code", jl0Var.Y[2].getText().toString());
                        jSONObject.put("city", jl0Var.Y[3].getText().toString());
                        jSONObject.put("state", jl0Var.Y[4].getText().toString());
                        jSONObject.put("country_code", jl0Var.s);
                    } catch (Exception unused) {
                    }
                    hashMap = jl0Var.w1;
                    if (hashMap != null) {
                        hashMap.clear();
                    }
                    hashMap2 = jl0Var.x1;
                    if (hashMap2 != null) {
                        hashMap2.clear();
                    }
                    ((nk0) jl0Var.B1).c(jl0Var.E, null, jSONObject != null ? jSONObject.toString() : null, jl0Var.F, null, jl0Var.i1, jl0Var.j1, jl0Var.k1, null, null, kg0Var, cVar);
                }
                jSONObject = null;
                hashMap = jl0Var.w1;
                if (hashMap != null) {
                }
                hashMap2 = jl0Var.x1;
                if (hashMap2 != null) {
                }
                ((nk0) jl0Var.B1).c(jl0Var.E, null, jSONObject != null ? jSONObject.toString() : null, jl0Var.F, null, jl0Var.i1, jl0Var.j1, jl0Var.k1, null, null, kg0Var, cVar);
            } else if (i15 == 1) {
                if (!c(kg0Var, cVar)) {
                    return;
                }
            } else if (i15 == 6) {
                TL_account.verifyEmail verifyemail = new TL_account.verifyEmail();
                verifyemail.purpose = new TLRPC.TL_emailVerifyPurposePassport();
                TLRPC.TL_emailVerificationCode tL_emailVerificationCode = new TLRPC.TL_emailVerificationCode();
                tL_emailVerificationCode.code = jl0Var.Y[0].getText().toString();
                verifyemail.verification = tL_emailVerificationCode;
                i11 = ((org.telegram.ui.ActionBar.k2) jl0Var).currentAccount;
                int sendRequest = ConnectionsManager.getInstance(i11).sendRequest(verifyemail, new mb(this, kg0Var, cVar, verifyemail, 6));
                i12 = ((org.telegram.ui.ActionBar.k2) jl0Var).currentAccount;
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i12);
                i13 = ((org.telegram.ui.ActionBar.k2) jl0Var).classGuid;
                connectionsManager.bindRequestToGuid(sendRequest, i13);
            }
            jl0Var.R1(true, true);
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
    public final boolean c(kg0 kg0Var, m4.c cVar) {
        ?? r19;
        int i10;
        char c10;
        int i11;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        HashMap hashMap;
        HashMap hashMap2;
        LinearLayout linearLayout;
        char c11;
        int i12;
        char c12;
        boolean z10;
        int i13;
        jl0 jl0Var = this.a;
        int[] iArr = jl0Var.y;
        boolean[] zArr = jl0Var.t0;
        char c13 = 0;
        if (!jl0Var.o1.isEmpty() || jl0.H0(jl0Var)) {
            return false;
        }
        int i14 = 3;
        char c14 = 2;
        org.telegram.messenger.qw qwVar = null;
        ?? r15 = 1;
        if (jl0Var.u0) {
            jl0Var.u0 = false;
            int i15 = 0;
            boolean z11 = false;
            while (i15 < zArr.length) {
                if (zArr[i15]) {
                    jl0Var.Y[i15].setErrorText(org.telegram.messenger.dd.L0(2131747465, null));
                    if (!z11) {
                        String R0 = zArr[c13] ? org.telegram.messenger.dd.D0().R0(jl0Var.a0[c13].getText().toString(), r15, r15) : jl0Var.Y[c13].getText().toString();
                        String R02 = zArr[r15] ? org.telegram.messenger.dd.D0().R0(jl0Var.a0[r15].getText().toString(), r15, r15) : jl0Var.Y[r15].getText().toString();
                        String R03 = zArr[c14] ? org.telegram.messenger.dd.D0().R0(jl0Var.a0[c14].getText().toString(), r15, r15) : jl0Var.Y[c14].getText().toString();
                        if (TextUtils.isEmpty(R0) || TextUtils.isEmpty(R02) || TextUtils.isEmpty(R03)) {
                            c11 = c13;
                            i12 = i14;
                            c12 = c14;
                            z10 = r15;
                            i13 = i15;
                            jl0Var.D1(jl0Var.Y[i13]);
                        } else {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(jl0Var.getParentActivity());
                            Object[] objArr = new Object[i14];
                            objArr[c13] = R0;
                            objArr[r15] = R02;
                            objArr[c14] = R03;
                            c12 = c14;
                            String a02 = org.telegram.messenger.dd.a0("PassportNameCheckAlert", null, 2131747519, objArr);
                            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                            x1Var.T = a02;
                            x1Var.R = org.telegram.messenger.dd.L0(R.string.AppName, null);
                            c11 = c13;
                            z10 = r15;
                            i13 = i15;
                            i12 = i14;
                            alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131751355, null), new mg.y(this, R0, R02, R03, kg0Var, cVar, 3));
                            alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131751336, null), new i2.q(this, i13, 17));
                            jl0Var.showDialog(x1Var);
                        }
                        z11 = z10;
                        i15 = i13 + 1;
                        c14 = c12;
                        i14 = i12;
                        r15 = z10;
                        c13 = c11;
                    }
                }
                c11 = c13;
                i12 = i14;
                c12 = c14;
                z10 = r15;
                i13 = i15;
                i15 = i13 + 1;
                c14 = c12;
                i14 = i12;
                r15 = z10;
                c13 = c11;
            }
            boolean z12 = c13;
            i10 = i14;
            c10 = c14;
            i11 = r15;
            r19 = z12;
            if (z11) {
                return z12;
            }
        } else {
            r19 = 0;
            i10 = 3;
            c10 = 2;
            i11 = 1;
        }
        if (jl0Var.y1()) {
            jl0Var.finishFragment();
            return r19;
        }
        try {
            if (jl0Var.v0) {
                jSONObject = null;
            } else {
                HashMap hashMap3 = new HashMap(jl0Var.s1);
                if (jl0Var.E.native_names) {
                    if (jl0Var.q0.getVisibility() == 0) {
                        hashMap3.put("first_name_native", jl0Var.a0[r19].getText().toString());
                        hashMap3.put("middle_name_native", jl0Var.a0[i11].getText().toString());
                        hashMap3.put("last_name_native", jl0Var.a0[c10].getText().toString());
                    } else {
                        hashMap3.put("first_name_native", jl0Var.Y[r19].getText().toString());
                        hashMap3.put("middle_name_native", jl0Var.Y[i11].getText().toString());
                        hashMap3.put("last_name_native", jl0Var.Y[c10].getText().toString());
                    }
                }
                hashMap3.put("first_name", jl0Var.Y[r19].getText().toString());
                hashMap3.put("middle_name", jl0Var.Y[i11].getText().toString());
                hashMap3.put("last_name", jl0Var.Y[c10].getText().toString());
                hashMap3.put("birth_date", jl0Var.Y[i10].getText().toString());
                hashMap3.put("gender", jl0Var.x);
                hashMap3.put("country_code", jl0Var.s);
                hashMap3.put("residence_country_code", jl0Var.w);
                jSONObject = new JSONObject();
                try {
                    ArrayList arrayList = new ArrayList(hashMap3.keySet());
                    final int i16 = r19;
                    Collections.sort(arrayList, new Comparator(this) { // from class: org.telegram.ui.qk0
                        public final /* synthetic */ rk0 b;

                        {
                            this.b = this;
                        }

                        @Override // java.util.Comparator
                        public final int compare(Object obj, Object obj2) {
                            String str = (String) obj;
                            String str2 = (String) obj2;
                            switch (i16) {
                                case 0:
                                    jl0 jl0Var2 = this.b.a;
                                    int G0 = jl0.G0(jl0Var2, str);
                                    int G02 = jl0.G0(jl0Var2, str2);
                                    if (G0 >= G02) {
                                        if (G0 > G02) {
                                        }
                                    }
                                    break;
                                default:
                                    jl0 jl0Var3 = this.b.a;
                                    int G03 = jl0.G0(jl0Var3, str);
                                    int G04 = jl0.G0(jl0Var3, str2);
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
                    for (int i17 = 0; i17 < size; i17++) {
                        String str = (String) arrayList.get(i17);
                        jSONObject.put(str, hashMap3.get(str));
                    }
                } catch (Exception unused) {
                }
            }
        } catch (Exception unused2) {
            jSONObject = null;
            jSONObject2 = null;
        }
        if (jl0Var.F != null) {
            HashMap hashMap4 = new HashMap(jl0Var.t1);
            hashMap4.put("document_no", jl0Var.Y[7].getText().toString());
            if (iArr[0] != 0) {
                Locale locale = Locale.US;
                Integer valueOf = Integer.valueOf(iArr[c10]);
                Integer valueOf2 = Integer.valueOf(iArr[i11]);
                Integer valueOf3 = Integer.valueOf(iArr[0]);
                Object[] objArr2 = new Object[i10];
                objArr2[0] = valueOf;
                objArr2[i11] = valueOf2;
                objArr2[c10] = valueOf3;
                hashMap4.put("expiry_date", String.format(locale, "%02d.%02d.%d", objArr2));
            } else {
                hashMap4.put("expiry_date", "");
            }
            jSONObject2 = new JSONObject();
            try {
                ArrayList arrayList2 = new ArrayList(hashMap4.keySet());
                final int i18 = i11;
                Collections.sort(arrayList2, new Comparator(this) { // from class: org.telegram.ui.qk0
                    public final /* synthetic */ rk0 b;

                    {
                        this.b = this;
                    }

                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        String str2 = (String) obj;
                        String str22 = (String) obj2;
                        switch (i18) {
                            case 0:
                                jl0 jl0Var2 = this.b.a;
                                int G0 = jl0.G0(jl0Var2, str2);
                                int G02 = jl0.G0(jl0Var2, str22);
                                if (G0 >= G02) {
                                    if (G0 > G02) {
                                    }
                                }
                                break;
                            default:
                                jl0 jl0Var3 = this.b.a;
                                int G03 = jl0.G0(jl0Var3, str2);
                                int G04 = jl0.G0(jl0Var3, str22);
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
                for (int i19 = 0; i19 < size2; i19++) {
                    String str2 = (String) arrayList2.get(i19);
                    jSONObject2.put(str2, hashMap4.get(str2));
                }
            } catch (Exception unused3) {
            }
            hashMap = jl0Var.w1;
            if (hashMap != null) {
                hashMap.clear();
            }
            hashMap2 = jl0Var.x1;
            if (hashMap2 != null) {
                hashMap2.clear();
            }
            zk0 zk0Var = jl0Var.B1;
            TLRPC.TL_secureRequiredType tL_secureRequiredType = jl0Var.E;
            String jSONObject3 = jSONObject == null ? jSONObject.toString() : null;
            TLRPC.TL_secureRequiredType tL_secureRequiredType2 = jl0Var.F;
            String jSONObject4 = jSONObject2 == null ? jSONObject2.toString() : null;
            org.telegram.messenger.qw qwVar2 = jl0Var.j1;
            ArrayList arrayList3 = jl0Var.k1;
            org.telegram.messenger.qw qwVar3 = jl0Var.l1;
            linearLayout = jl0Var.f0;
            if (linearLayout != null && linearLayout.getVisibility() == 0) {
                qwVar = jl0Var.m1;
            }
            ((nk0) zk0Var).c(tL_secureRequiredType, null, jSONObject3, tL_secureRequiredType2, jSONObject4, null, qwVar2, arrayList3, qwVar3, qwVar, kg0Var, cVar);
            return true;
        }
        jSONObject2 = null;
        hashMap = jl0Var.w1;
        if (hashMap != null) {
        }
        hashMap2 = jl0Var.x1;
        if (hashMap2 != null) {
        }
        zk0 zk0Var2 = jl0Var.B1;
        TLRPC.TL_secureRequiredType tL_secureRequiredType3 = jl0Var.E;
        if (jSONObject == null) {
        }
        TLRPC.TL_secureRequiredType tL_secureRequiredType22 = jl0Var.F;
        if (jSONObject2 == null) {
        }
        org.telegram.messenger.qw qwVar22 = jl0Var.j1;
        ArrayList arrayList32 = jl0Var.k1;
        org.telegram.messenger.qw qwVar32 = jl0Var.l1;
        linearLayout = jl0Var.f0;
        if (linearLayout != null) {
            qwVar = jl0Var.m1;
        }
        ((nk0) zk0Var2).c(tL_secureRequiredType3, null, jSONObject3, tL_secureRequiredType22, jSONObject4, null, qwVar22, arrayList32, qwVar32, qwVar, kg0Var, cVar);
        return true;
    }
}
