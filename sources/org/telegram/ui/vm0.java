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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SecureDocument;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class vm0 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ nn0 a;

    public vm0(nn0 nn0Var) {
        this.a = nn0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0221  */
    @Override // org.telegram.ui.ActionBar.j
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
        nn0 nn0Var = this.a;
        int i15 = nn0Var.b;
        if (i10 == -1) {
            if (nn0Var.W0(true)) {
                return;
            }
            if (i15 == 0 || i15 == 5) {
                nn0Var.V0(false);
            }
            nn0Var.finishFragment();
            return;
        }
        if (i10 == 1) {
            if (nn0Var.getParentActivity() == null) {
                return;
            }
            org.telegram.ui.Components.ea0 ea0Var = new org.telegram.ui.Components.ea0(nn0Var.getParentActivity(), null);
            String string = LocaleController.getString(R.string.PassportInfo2);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
            int indexOf = string.indexOf(42);
            int lastIndexOf = string.lastIndexOf(42);
            if (indexOf != -1 && lastIndexOf != -1) {
                spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
                spannableStringBuilder.replace(indexOf, indexOf + 1, (CharSequence) "");
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.o4(LocaleController.getString(R.string.PassportInfoUrl), 4, this), indexOf, lastIndexOf - 1, 33);
            }
            ea0Var.setText(spannableStringBuilder);
            ea0Var.setTextSize(1, 16.0f);
            ea0Var.setLinkTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.k5, false));
            ea0Var.setHighlightColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.l5, false));
            ea0Var.setPadding(AndroidUtilities.dp(23.0f), 0, AndroidUtilities.dp(23.0f), 0);
            ea0Var.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
            ea0Var.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.j5, false));
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(nn0Var.getParentActivity());
            alertDialog$Builder.n(ea0Var);
            alertDialog$Builder.a.R = LocaleController.getString(R.string.PassportInfoTitle);
            alertDialog$Builder.h(LocaleController.getString(R.string.Close), null);
            nn0Var.showDialog(alertDialog$Builder.a);
            return;
        }
        if (i10 == 2) {
            if (i15 == 5) {
                nn0Var.A1(false);
                return;
            }
            if (i15 == 7) {
                nn0Var.J1[nn0Var.I1].h(null);
                return;
            }
            tk0 tk0Var = new tk0(this, 4);
            org.telegram.ui.ActionBar.b5 b5Var = new org.telegram.ui.ActionBar.b5(5, this, tk0Var);
            if (i15 == 4) {
                if (nn0Var.f) {
                    obj = nn0Var.d1;
                } else if (nn0.C0(nn0Var)) {
                    return;
                } else {
                    obj = nn0Var.Y[0].getText().toString();
                }
                ((qm0) nn0Var.B1).c(nn0Var.E, obj, null, null, null, null, null, null, null, null, tk0Var, b5Var);
            } else if (i15 == 3) {
                if (nn0Var.f) {
                    i14 = ((org.telegram.ui.ActionBar.n2) nn0Var).currentAccount;
                    str = UserConfig.getInstance(i14).getCurrentUser().phone;
                } else {
                    if (nn0.C0(nn0Var)) {
                        return;
                    }
                    str = nn0Var.Y[1].getText().toString() + nn0Var.Y[2].getText().toString();
                }
                ((qm0) nn0Var.B1).c(nn0Var.E, str, null, null, null, null, null, null, null, null, tk0Var, b5Var);
            } else if (i15 == 2) {
                if (!nn0Var.o1.isEmpty() || nn0.C0(nn0Var)) {
                    return;
                }
                if (nn0Var.t1()) {
                    nn0Var.finishFragment();
                    return;
                }
                if (!nn0Var.v0) {
                    jSONObject = new JSONObject();
                    try {
                        jSONObject.put("street_line1", nn0Var.Y[0].getText().toString());
                        jSONObject.put("street_line2", nn0Var.Y[1].getText().toString());
                        jSONObject.put("post_code", nn0Var.Y[2].getText().toString());
                        jSONObject.put("city", nn0Var.Y[3].getText().toString());
                        jSONObject.put("state", nn0Var.Y[4].getText().toString());
                        jSONObject.put("country_code", nn0Var.s);
                    } catch (Exception unused) {
                    }
                    hashMap = nn0Var.w1;
                    if (hashMap != null) {
                        hashMap.clear();
                    }
                    hashMap2 = nn0Var.x1;
                    if (hashMap2 != null) {
                        hashMap2.clear();
                    }
                    ((qm0) nn0Var.B1).c(nn0Var.E, null, jSONObject != null ? jSONObject.toString() : null, nn0Var.F, null, nn0Var.i1, nn0Var.j1, nn0Var.k1, null, null, tk0Var, b5Var);
                }
                jSONObject = null;
                hashMap = nn0Var.w1;
                if (hashMap != null) {
                }
                hashMap2 = nn0Var.x1;
                if (hashMap2 != null) {
                }
                ((qm0) nn0Var.B1).c(nn0Var.E, null, jSONObject != null ? jSONObject.toString() : null, nn0Var.F, null, nn0Var.i1, nn0Var.j1, nn0Var.k1, null, null, tk0Var, b5Var);
            } else if (i15 == 1) {
                if (!c(tk0Var, b5Var)) {
                    return;
                }
            } else if (i15 == 6) {
                TL_account.verifyEmail verifyemail = new TL_account.verifyEmail();
                verifyemail.purpose = new TLRPC.TL_emailVerifyPurposePassport();
                TLRPC.TL_emailVerificationCode tL_emailVerificationCode = new TLRPC.TL_emailVerificationCode();
                tL_emailVerificationCode.code = nn0Var.Y[0].getText().toString();
                verifyemail.verification = tL_emailVerificationCode;
                i11 = ((org.telegram.ui.ActionBar.n2) nn0Var).currentAccount;
                int sendRequest = ConnectionsManager.getInstance(i11).sendRequest(verifyemail, new ai.q3(this, tk0Var, b5Var, verifyemail, 10));
                i12 = ((org.telegram.ui.ActionBar.n2) nn0Var).currentAccount;
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i12);
                i13 = ((org.telegram.ui.ActionBar.n2) nn0Var).classGuid;
                connectionsManager.bindRequestToGuid(sendRequest, i13);
            }
            nn0Var.M1(true, true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0140, code lost:
    
        if (r0 != false) goto L100;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02fa  */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r14v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(tk0 tk0Var, org.telegram.ui.ActionBar.b5 b5Var) {
        int i10;
        char c10;
        int i11;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        HashMap hashMap;
        HashMap hashMap2;
        LinearLayout linearLayout;
        int i12;
        char c11;
        boolean z10;
        nn0 nn0Var = this.a;
        int[] iArr = nn0Var.x;
        boolean[] zArr = nn0Var.t0;
        final int i13 = 0;
        if (nn0Var.o1.isEmpty() && !nn0.C0(nn0Var)) {
            int i14 = 3;
            char c12 = 2;
            ?? r14 = 1;
            if (nn0Var.u0) {
                nn0Var.u0 = false;
                boolean z11 = false;
                int i15 = 0;
                while (i15 < zArr.length) {
                    if (zArr[i15]) {
                        nn0Var.Y[i15].setErrorText(LocaleController.getString(R.string.PassportUseLatinOnly));
                        if (!z11) {
                            String translitString = zArr[0] ? LocaleController.getInstance().getTranslitString(nn0Var.a0[0].getText().toString(), r14) : nn0Var.Y[0].getText().toString();
                            String translitString2 = zArr[r14] ? LocaleController.getInstance().getTranslitString(nn0Var.a0[r14].getText().toString(), r14) : nn0Var.Y[r14].getText().toString();
                            String translitString3 = zArr[c12] ? LocaleController.getInstance().getTranslitString(nn0Var.a0[c12].getText().toString(), r14) : nn0Var.Y[c12].getText().toString();
                            if (TextUtils.isEmpty(translitString) || TextUtils.isEmpty(translitString2) || TextUtils.isEmpty(translitString3)) {
                                i12 = i14;
                                c11 = c12;
                                z10 = r14;
                                nn0Var.y1(nn0Var.Y[i15]);
                            } else {
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(nn0Var.getParentActivity());
                                int i16 = R.string.PassportNameCheckAlert;
                                Object[] objArr = new Object[i14];
                                objArr[0] = translitString;
                                objArr[r14] = translitString2;
                                objArr[c12] = translitString3;
                                String formatString = LocaleController.formatString("PassportNameCheckAlert", i16, objArr);
                                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                                b2Var.T = formatString;
                                b2Var.R = LocaleController.getString(R.string.AppName);
                                i12 = i14;
                                c11 = c12;
                                z10 = r14;
                                alertDialog$Builder.k(LocaleController.getString(R.string.Done), new org.telegram.ui.Components.d1(this, translitString, translitString2, translitString3, tk0Var, b5Var, 1));
                                alertDialog$Builder.h(LocaleController.getString(R.string.Edit), new i2.s(this, i15, 16));
                                nn0Var.showDialog(b2Var);
                            }
                            z11 = z10;
                            i15++;
                            r14 = z10;
                            c12 = c11;
                            i14 = i12;
                        }
                    }
                    i12 = i14;
                    c11 = c12;
                    z10 = r14;
                    i15++;
                    r14 = z10;
                    c12 = c11;
                    i14 = i12;
                }
                i10 = i14;
                c10 = c12;
                i11 = r14;
            } else {
                i10 = 3;
                c10 = 2;
                i11 = 1;
            }
            if (nn0Var.t1()) {
                nn0Var.finishFragment();
                return false;
            }
            SecureDocument secureDocument = null;
            try {
                if (nn0Var.v0) {
                    jSONObject = null;
                } else {
                    HashMap hashMap3 = new HashMap(nn0Var.s1);
                    if (nn0Var.E.native_names) {
                        if (nn0Var.q0.getVisibility() == 0) {
                            hashMap3.put("first_name_native", nn0Var.a0[0].getText().toString());
                            hashMap3.put("middle_name_native", nn0Var.a0[i11].getText().toString());
                            hashMap3.put("last_name_native", nn0Var.a0[c10].getText().toString());
                        } else {
                            hashMap3.put("first_name_native", nn0Var.Y[0].getText().toString());
                            hashMap3.put("middle_name_native", nn0Var.Y[i11].getText().toString());
                            hashMap3.put("last_name_native", nn0Var.Y[c10].getText().toString());
                        }
                    }
                    hashMap3.put("first_name", nn0Var.Y[0].getText().toString());
                    hashMap3.put("middle_name", nn0Var.Y[i11].getText().toString());
                    hashMap3.put("last_name", nn0Var.Y[c10].getText().toString());
                    hashMap3.put("birth_date", nn0Var.Y[i10].getText().toString());
                    hashMap3.put("gender", nn0Var.w);
                    hashMap3.put("country_code", nn0Var.s);
                    hashMap3.put("residence_country_code", nn0Var.v);
                    jSONObject = new JSONObject();
                    try {
                        ArrayList arrayList = new ArrayList(hashMap3.keySet());
                        Collections.sort(arrayList, new Comparator(this) { // from class: org.telegram.ui.um0
                            public final /* synthetic */ vm0 b;

                            {
                                this.b = this;
                            }

                            @Override // java.util.Comparator
                            public final int compare(Object obj, Object obj2) {
                                String str = (String) obj;
                                String str2 = (String) obj2;
                                switch (i13) {
                                    case 0:
                                        nn0 nn0Var2 = this.b.a;
                                        int B0 = nn0.B0(nn0Var2, str);
                                        int B02 = nn0.B0(nn0Var2, str2);
                                        if (B0 >= B02) {
                                            if (B0 > B02) {
                                            }
                                        }
                                        break;
                                    default:
                                        nn0 nn0Var3 = this.b.a;
                                        int B03 = nn0.B0(nn0Var3, str);
                                        int B04 = nn0.B0(nn0Var3, str2);
                                        if (B03 >= B04) {
                                            if (B03 > B04) {
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
            if (nn0Var.F != null) {
                HashMap hashMap4 = new HashMap(nn0Var.t1);
                hashMap4.put("document_no", nn0Var.Y[7].getText().toString());
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
                    Collections.sort(arrayList2, new Comparator(this) { // from class: org.telegram.ui.um0
                        public final /* synthetic */ vm0 b;

                        {
                            this.b = this;
                        }

                        @Override // java.util.Comparator
                        public final int compare(Object obj, Object obj2) {
                            String str2 = (String) obj;
                            String str22 = (String) obj2;
                            switch (i18) {
                                case 0:
                                    nn0 nn0Var2 = this.b.a;
                                    int B0 = nn0.B0(nn0Var2, str2);
                                    int B02 = nn0.B0(nn0Var2, str22);
                                    if (B0 >= B02) {
                                        if (B0 > B02) {
                                        }
                                    }
                                    break;
                                default:
                                    nn0 nn0Var3 = this.b.a;
                                    int B03 = nn0.B0(nn0Var3, str2);
                                    int B04 = nn0.B0(nn0Var3, str22);
                                    if (B03 >= B04) {
                                        if (B03 > B04) {
                                        }
                                    }
                                    break;
                            }
                            return 0;
                        }
                    });
                    int size2 = arrayList2.size();
                    while (i13 < size2) {
                        String str2 = (String) arrayList2.get(i13);
                        jSONObject2.put(str2, hashMap4.get(str2));
                        i13++;
                    }
                } catch (Exception unused3) {
                }
                hashMap = nn0Var.w1;
                if (hashMap != null) {
                    hashMap.clear();
                }
                hashMap2 = nn0Var.x1;
                if (hashMap2 != null) {
                    hashMap2.clear();
                }
                dn0 dn0Var = nn0Var.B1;
                TLRPC.TL_secureRequiredType tL_secureRequiredType = nn0Var.E;
                String jSONObject3 = jSONObject == null ? jSONObject.toString() : null;
                TLRPC.TL_secureRequiredType tL_secureRequiredType2 = nn0Var.F;
                String jSONObject4 = jSONObject2 == null ? jSONObject2.toString() : null;
                SecureDocument secureDocument2 = nn0Var.j1;
                ArrayList arrayList3 = nn0Var.k1;
                SecureDocument secureDocument3 = nn0Var.l1;
                linearLayout = nn0Var.f0;
                if (linearLayout != null && linearLayout.getVisibility() == 0) {
                    secureDocument = nn0Var.m1;
                }
                ((qm0) dn0Var).c(tL_secureRequiredType, null, jSONObject3, tL_secureRequiredType2, jSONObject4, null, secureDocument2, arrayList3, secureDocument3, secureDocument, tk0Var, b5Var);
                return true;
            }
            jSONObject2 = null;
            hashMap = nn0Var.w1;
            if (hashMap != null) {
            }
            hashMap2 = nn0Var.x1;
            if (hashMap2 != null) {
            }
            dn0 dn0Var2 = nn0Var.B1;
            TLRPC.TL_secureRequiredType tL_secureRequiredType3 = nn0Var.E;
            if (jSONObject == null) {
            }
            TLRPC.TL_secureRequiredType tL_secureRequiredType22 = nn0Var.F;
            if (jSONObject2 == null) {
            }
            SecureDocument secureDocument22 = nn0Var.j1;
            ArrayList arrayList32 = nn0Var.k1;
            SecureDocument secureDocument32 = nn0Var.l1;
            linearLayout = nn0Var.f0;
            if (linearLayout != null) {
                secureDocument = nn0Var.m1;
            }
            ((qm0) dn0Var2).c(tL_secureRequiredType3, null, jSONObject3, tL_secureRequiredType22, jSONObject4, null, secureDocument22, arrayList32, secureDocument32, secureDocument, tk0Var, b5Var);
            return true;
        }
        return false;
    }
}
