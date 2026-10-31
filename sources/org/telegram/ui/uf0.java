package org.telegram.ui;

import android.animation.AnimatorSet;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stats;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class uf0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ uf0(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01fe  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i10;
        int i11;
        char c10;
        String G;
        int i12;
        String a02;
        org.telegram.ui.ActionBar.k2 T;
        org.telegram.ui.Components.wb I;
        rm0 rm0Var;
        rm0 rm0Var2;
        mk mkVar;
        String str = "";
        switch (this.a) {
            case 0:
                kg0 kg0Var = (kg0) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                kg0Var.c0 = false;
                if (tL_error == null) {
                    bg0 k02 = kg0Var.k0();
                    kg0Var.j0.clear();
                    kg0Var.m0(k02);
                    break;
                }
                break;
            case 1:
                ag0 ag0Var = (ag0) this.b;
                TLObject tLObject = (TLObject) this.c;
                kg0 kg0Var2 = ag0Var.a;
                bg0 k03 = kg0Var2.k0();
                kg0Var2.i0.add(0, (TLRPC.TL_chatInviteExported) tLObject);
                TLRPC.ChatFull chatFull = kg0Var2.d;
                if (chatFull != null) {
                    chatFull.invitesCount++;
                    kg0Var2.getMessagesStorage().w1(kg0Var2.d.invitesCount, kg0Var2.n);
                }
                kg0Var2.m0(k03);
                break;
            case 2:
                sh0 sh0Var = (sh0) this.b;
                TL_stats.TL_statsGraphError tL_statsGraphError = (TL_stats.TL_statsGraphError) this.c;
                if (sh0Var.getParentActivity() != null) {
                    Toast.makeText(sh0Var.getParentActivity(), tL_statsGraphError.error, 1).show();
                    break;
                }
                break;
            case 3:
                gi0 gi0Var = (gi0) this.b;
                String str2 = (String) this.c;
                gi0Var.getClass();
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse("sms:+" + str2));
                intent.putExtra("sms_body", org.telegram.messenger.cd.a0(null, null, 2131749126, "https://telegram.org/dl"));
                gi0Var.getContext().startActivity(intent);
                break;
            case 4:
                gi0 gi0Var2 = (gi0) this.b;
                TLRPC.User user = (TLRPC.User) this.c;
                gi0Var2.dismiss();
                org.telegram.ui.ActionBar.k2 T2 = LaunchActivity.T();
                if (T2 != null) {
                    T2.presentFragment(ProfileActivity.z4(user.id));
                    break;
                }
                break;
            case 5:
                ((org.telegram.ui.Components.vg) this.b).a((TLRPC.User) this.c);
                break;
            case 6:
                NotificationsCustomSettingsActivity.a0((NotificationsCustomSettingsActivity) this.b, (ArrayList) this.c);
                break;
            case 7:
                org.telegram.ui.ActionBar.z2[] z2VarArr = (org.telegram.ui.ActionBar.z2[]) this.b;
                boolean[] zArr = (boolean[]) this.c;
                z2VarArr[0] = null;
                jj0.a = null;
                zArr[0] = true;
                break;
            case 8:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.b;
                Runnable runnable = (Runnable) this.c;
                for (bs bsVar : passcodeActivity.n.f) {
                    bsVar.C(0.0f);
                }
                runnable.run();
                break;
            case 9:
                pj0 pj0Var = (pj0) this.b;
                org.telegram.ui.ActionBar.b1 b1Var = (org.telegram.ui.ActionBar.b1) this.c;
                PasscodeActivity passcodeActivity2 = (PasscodeActivity) pj0Var.c;
                b1Var.setText(org.telegram.messenger.cd.L0(passcodeActivity2.D == 0 ? 2131747669 : 2131747670, null));
                b1Var.setIcon(passcodeActivity2.D == 0 ? R.drawable.msg_permissions : R.drawable.msg_pin_code);
                passcodeActivity2.x0();
                if (passcodeActivity2.r0()) {
                    passcodeActivity2.h.setInputType(524417);
                    org.telegram.messenger.i0.Y3(passcodeActivity2.s, true, 0.1f, true, false);
                    break;
                }
                break;
            case 10:
                ((PasskeysActivity) this.b).c0((TL_account.Passkey) this.c);
                break;
            case 11:
                ll0 ll0Var = (ll0) this.b;
                org.telegram.messenger.is isVar = (org.telegram.messenger.is) this.c;
                int[] iArr = ll0Var.y;
                int i13 = isVar.a;
                if (i13 == 2) {
                    if (!(ll0Var.F.type instanceof TLRPC.TL_secureValueTypeIdentityCard)) {
                        int size = ll0Var.G.size();
                        int i14 = 0;
                        while (true) {
                            if (i14 < size) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType = (TLRPC.TL_secureRequiredType) ll0Var.G.get(i14);
                                if (tL_secureRequiredType.type instanceof TLRPC.TL_secureValueTypeIdentityCard) {
                                    ll0Var.F = tL_secureRequiredType;
                                    ll0Var.T1();
                                } else {
                                    i14++;
                                }
                            }
                        }
                    }
                } else if (i13 == 1) {
                    if (!(ll0Var.F.type instanceof TLRPC.TL_secureValueTypePassport)) {
                        int size2 = ll0Var.G.size();
                        int i15 = 0;
                        while (true) {
                            if (i15 < size2) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType2 = (TLRPC.TL_secureRequiredType) ll0Var.G.get(i15);
                                if (tL_secureRequiredType2.type instanceof TLRPC.TL_secureValueTypePassport) {
                                    ll0Var.F = tL_secureRequiredType2;
                                    ll0Var.T1();
                                } else {
                                    i15++;
                                }
                            }
                        }
                    }
                } else if (i13 == 3) {
                    if (!(ll0Var.F.type instanceof TLRPC.TL_secureValueTypeInternalPassport)) {
                        int size3 = ll0Var.G.size();
                        int i16 = 0;
                        while (true) {
                            if (i16 < size3) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType3 = (TLRPC.TL_secureRequiredType) ll0Var.G.get(i16);
                                if (tL_secureRequiredType3.type instanceof TLRPC.TL_secureValueTypeInternalPassport) {
                                    ll0Var.F = tL_secureRequiredType3;
                                    ll0Var.T1();
                                } else {
                                    i16++;
                                }
                            }
                        }
                    }
                } else if (i13 == 4 && !(ll0Var.F.type instanceof TLRPC.TL_secureValueTypeDriverLicense)) {
                    int size4 = ll0Var.G.size();
                    int i17 = 0;
                    while (true) {
                        if (i17 < size4) {
                            TLRPC.TL_secureRequiredType tL_secureRequiredType4 = (TLRPC.TL_secureRequiredType) ll0Var.G.get(i17);
                            if (tL_secureRequiredType4.type instanceof TLRPC.TL_secureValueTypeDriverLicense) {
                                ll0Var.F = tL_secureRequiredType4;
                                ll0Var.T1();
                            } else {
                                i17++;
                            }
                        }
                    }
                }
                if (!TextUtils.isEmpty(isVar.b)) {
                    ll0Var.Y[0].setText(isVar.b);
                }
                if (!TextUtils.isEmpty(isVar.d)) {
                    ll0Var.Y[1].setText(isVar.d);
                }
                if (!TextUtils.isEmpty(isVar.c)) {
                    ll0Var.Y[2].setText(isVar.c);
                }
                if (!TextUtils.isEmpty(isVar.e)) {
                    ll0Var.Y[7].setText(isVar.e);
                }
                int i18 = isVar.n;
                if (i18 != 0) {
                    if (i18 == 1) {
                        ll0Var.x = "male";
                        ll0Var.Y[4].setText(org.telegram.messenger.cd.L0(2131747524, null));
                    } else if (i18 == 2) {
                        ll0Var.x = "female";
                        ll0Var.Y[4].setText(org.telegram.messenger.cd.L0(2131747585, null));
                    }
                }
                if (!TextUtils.isEmpty(isVar.m)) {
                    String str3 = isVar.m;
                    ll0Var.s = str3;
                    String str4 = (String) ll0Var.Y0.get(str3);
                    if (str4 != null) {
                        ll0Var.Y[5].setText(str4);
                    }
                }
                if (!TextUtils.isEmpty(isVar.l)) {
                    String str5 = isVar.l;
                    ll0Var.w = str5;
                    String str6 = (String) ll0Var.Y0.get(str5);
                    if (str6 != null) {
                        ll0Var.Y[6].setText(str6);
                    }
                }
                int i19 = isVar.k;
                if (i19 > 0 && isVar.j > 0 && isVar.i > 0) {
                    ll0Var.Y[3].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i19), Integer.valueOf(isVar.j), Integer.valueOf(isVar.i)));
                }
                int i20 = isVar.h;
                if (i20 <= 0 || (i10 = isVar.g) <= 0 || (i11 = isVar.f) <= 0) {
                    iArr[2] = 0;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    ll0Var.Y[8].setText(org.telegram.messenger.cd.L0(2131747510, null));
                    break;
                } else {
                    iArr[0] = i11;
                    iArr[1] = i10;
                    iArr[2] = i20;
                    ll0Var.Y[8].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i20), Integer.valueOf(isVar.g), Integer.valueOf(isVar.f)));
                    break;
                }
                break;
            case 12:
                ll0 ll0Var2 = (ll0) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                if (tLObject2 != null) {
                    TL_account.Password password = (TL_account.Password) tLObject2;
                    ll0Var2.J = password;
                    if (TwoStepVerificationActivity.m0(password, false)) {
                        TwoStepVerificationActivity.q0(ll0Var2.J);
                        ll0Var2.V1();
                        if (ll0Var2.Z[0].getVisibility() == 0) {
                            ll0Var2.Y[0].requestFocus();
                            org.telegram.messenger.i0.J3(ll0Var2.Y[0]);
                        }
                        if (ll0Var2.N0 == 1) {
                            ll0Var2.E1(true);
                            break;
                        }
                    } else {
                        org.telegram.ui.Components.s4.w0(ll0Var2.getParentActivity(), org.telegram.messenger.cd.L0(2131743846, null), true);
                        break;
                    }
                }
                break;
            case 13:
                ll0 ll0Var3 = (ll0) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                if (tL_error2 == null) {
                    ll0Var3.f1 = true;
                    ll0Var3.Z0(true);
                    ll0Var3.finishFragment();
                    break;
                } else {
                    ll0Var3.Q1(false, false);
                    if ("APP_VERSION_OUTDATED".equals(tL_error2.text)) {
                        org.telegram.ui.Components.s4.w0(ll0Var3.getParentActivity(), org.telegram.messenger.cd.L0(2131743846, null), true);
                        break;
                    } else {
                        ll0Var3.P1(org.telegram.messenger.cd.L0(R.string.AppName, null), tL_error2.text);
                        break;
                    }
                }
            case 14:
                ((gl0) this.b).a.K = ((TLRPC.TL_error) this.c).text;
                break;
            case 15:
                sm0 sm0Var = (sm0) this.b;
                View view = (View) this.c;
                sm0Var.I0(false);
                view.callOnClick();
                break;
            case 16:
                sm0 sm0Var2 = (sm0) this.b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.c;
                sm0Var2.M0(true, false);
                if (tL_error3 != null) {
                    if (tL_error3.text.startsWith("CODE_INVALID")) {
                        org.telegram.ui.Cells.n3 n3Var = sm0Var2.S;
                        try {
                            n3Var.performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        org.telegram.messenger.i0.F3(2.5f, n3Var, null);
                        org.telegram.ui.Cells.n3 n3Var2 = sm0Var2.S;
                        n3Var2.a.setText("");
                        n3Var2.setWillNotDraw(true);
                        break;
                    } else if (tL_error3.text.startsWith("FLOOD_WAIT")) {
                        int intValue = Utilities.z(tL_error3.text).intValue();
                        if (intValue < 60) {
                            c10 = 0;
                            G = org.telegram.messenger.cd.G(intValue, "Seconds", new Object[0]);
                        } else {
                            c10 = 0;
                            G = org.telegram.messenger.cd.G(intValue / 60, "Minutes", new Object[0]);
                        }
                        String L0 = org.telegram.messenger.cd.L0(R.string.AppName, null);
                        Object[] objArr = new Object[1];
                        objArr[c10] = G;
                        sm0Var2.K0(L0, org.telegram.messenger.cd.a0("FloodWaitTime", null, 2131750687, objArr));
                        break;
                    } else {
                        sm0Var2.K0(org.telegram.messenger.cd.L0(R.string.AppName, null), tL_error3.text);
                        break;
                    }
                } else if (sm0Var2.getParentActivity() != null) {
                    rl0 rl0Var = sm0Var2.d0;
                    if (rl0Var != null) {
                        org.telegram.messenger.i0.r(rl0Var);
                        sm0Var2.d0 = null;
                    }
                    sm0Var2.y0();
                    break;
                }
                break;
            case 17:
                sm0.a0((sm0) this.b, (TLRPC.TL_payments_validatedRequestedInfo) this.c);
                break;
            case 18:
                sm0 sm0Var3 = (sm0) this.b;
                TLRPC.Message[] messageArr = (TLRPC.Message[]) this.c;
                Context parentActivity = sm0Var3.getParentActivity();
                if (parentActivity == null) {
                    parentActivity = org.telegram.messenger.w0.b;
                }
                if (parentActivity == null) {
                    parentActivity = LaunchActivity.I1;
                }
                if (parentActivity != null) {
                    sm0Var3.a1 = true;
                    sm0Var3.f1 = 1;
                    TLRPC.InputInvoice inputInvoice = sm0Var3.b1;
                    boolean z10 = inputInvoice instanceof TLRPC.TL_inputInvoiceStars;
                    boolean z11 = z10 && (((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose instanceof TLRPC.TL_inputStorePaymentStarsGift);
                    boolean z12 = z10 && (((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose instanceof TLRPC.TL_inputStorePaymentStarsGiveaway);
                    if (!z10 && (rm0Var2 = sm0Var3.Z0) != null) {
                        rm0Var2.e(1);
                    }
                    sm0Var3.y0();
                    if (z10 && (rm0Var = sm0Var3.Z0) != null) {
                        rm0Var.e(sm0Var3.f1);
                    }
                    long v02 = sm0Var3.v0();
                    if (v02 > 0) {
                        str = org.telegram.messenger.h20.k(sm0Var3.getMessagesController().Z1(Long.valueOf(v02)));
                    } else if (v02 < 0) {
                        i12 = 0;
                        TLRPC.Chat L02 = sm0Var3.getMessagesController().L0(Long.valueOf(-v02));
                        if (L02 != null) {
                            str = L02.title;
                        }
                        long u02 = sm0Var3.u0();
                        int i21 = !z10 ? (z11 || z12) ? R.raw.stars_send : R.raw.stars_topup : R.raw.payment_success;
                        String L03 = z10 ? null : org.telegram.messenger.cd.L0(z12 ? 2131745110 : z11 ? 2131745118 : 2131745177, null);
                        if (z10) {
                            String str7 = sm0Var3.R0[i12];
                            String str8 = sm0Var3.q0;
                            Object[] objArr2 = new Object[2];
                            objArr2[i12] = str7;
                            objArr2[1] = str8;
                            a02 = org.telegram.messenger.cd.a0(null, null, 2131747417, objArr2);
                        } else if (z12) {
                            a02 = org.telegram.messenger.cd.H(',', "StarsGiveawaySentPopupInfo", (int) u02);
                        } else {
                            String str9 = z11 ? "StarsGiftSentPopupInfo" : "StarsAcquiredInfo";
                            Object[] objArr3 = new Object[1];
                            objArr3[i12] = str;
                            a02 = org.telegram.messenger.cd.K(str9, (int) u02, ',', objArr3);
                        }
                        SpannableStringBuilder W2 = org.telegram.messenger.i0.W2(a02);
                        T = LaunchActivity.T();
                        if (T == null) {
                            org.telegram.ui.Components.cc a03 = org.telegram.ui.Components.cc.a0(T);
                            if (v02 == 0 || L03 == null || z12) {
                                String str10 = L03;
                                I = str10 != null ? a03.I(i21, str10, W2) : a03.Q(i21, 36, W2);
                            } else {
                                I = a03.L(i21, L03, W2, org.telegram.messenger.cd.L0(2131743578, null), new vl0(v02, i12));
                            }
                            org.telegram.ui.Components.wb wbVar = I;
                            wbVar.r = false;
                            wbVar.j = 5000;
                            if (messageArr[0] != null) {
                                kg.z0 z0Var = new kg.z0(sm0Var3, wbVar, z11, messageArr, 3);
                                org.telegram.ui.Components.bb bbVar = wbVar.e;
                                if (bbVar != null) {
                                    bbVar.setOnClickListener(z0Var);
                                }
                            }
                            wbVar.k(z12);
                            break;
                        }
                    }
                    i12 = 0;
                    long u022 = sm0Var3.u0();
                    int i212 = !z10 ? (z11 || z12) ? R.raw.stars_send : R.raw.stars_topup : R.raw.payment_success;
                    if (z10) {
                    }
                    if (z10) {
                    }
                    SpannableStringBuilder W22 = org.telegram.messenger.i0.W2(a02);
                    T = LaunchActivity.T();
                    if (T == null) {
                    }
                }
                break;
            case 19:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                g01.d1(photoViewer.E, photoViewer.m4, false, (th.b) this.c, null);
                break;
            case 20:
                PhotoViewer photoViewer2 = (PhotoViewer) this.b;
                oq0 oq0Var = (oq0) this.c;
                Drawable[] drawableArr = PhotoViewer.U8;
                if (oq0Var.getWindow() != null) {
                    oq0Var.A0(true);
                    un unVar = photoViewer2.l4;
                    if (unVar != null && (mkVar = unVar.Z) != null) {
                        mkVar.i0(false);
                        break;
                    }
                }
                break;
            case 21:
                ko koVar = (ko) this.b;
                Bitmap bitmap = (Bitmap) this.c;
                Drawable[] drawableArr2 = PhotoViewer.U8;
                koVar.a(bitmap);
                break;
            case 22:
                PhotoViewer photoViewer3 = (PhotoViewer) this.b;
                jg.a1 a1Var = (jg.a1) this.c;
                Drawable[] drawableArr3 = PhotoViewer.U8;
                a1Var.e.h();
                a1Var.c.postRunnable(new ag.f3(5));
                photoViewer3.e0.removeView(photoViewer3.N1);
                break;
            case 23:
                org.telegram.ui.Components.s5 s5Var = (org.telegram.ui.Components.s5) this.b;
                Bitmap bitmap2 = (Bitmap) this.c;
                Drawable[] drawableArr4 = PhotoViewer.U8;
                if (s5Var != null) {
                    ArrayList arrayList = s5Var.h;
                    org.telegram.ui.Components.p5 p5Var = s5Var.n;
                    if (p5Var != null) {
                        arrayList.add(p5Var);
                    }
                    org.telegram.ui.Components.p5 p5Var2 = s5Var.r;
                    if (p5Var2 != null) {
                        arrayList.add(p5Var2);
                    }
                    org.telegram.ui.Components.p5 p5Var3 = s5Var.s;
                    if (p5Var3 != null) {
                        arrayList.add(p5Var3);
                    }
                    s5Var.n = new org.telegram.ui.Components.p5(bitmap2);
                    s5Var.r = null;
                    s5Var.s = null;
                    s5Var.t();
                    break;
                }
                break;
            case 24:
                op0 op0Var = (op0) this.b;
                View view2 = (View) this.c;
                op0Var.getClass();
                view2.setOutlineProvider(null);
                PhotoViewer photoViewer4 = op0Var.c;
                ImageView imageView = photoViewer4.x3;
                if (imageView != null) {
                    imageView.setOutlineProvider(null);
                }
                zr0 zr0Var = photoViewer4.E2;
                if (zr0Var != null) {
                    zr0Var.setOutlineProvider(null);
                    break;
                }
                break;
            case 25:
                wq0 wq0Var = (wq0) this.b;
                org.telegram.ui.Components.u61 u61Var = (org.telegram.ui.Components.u61) this.c;
                wq0Var.getClass();
                if (u61Var.U() > 0 && u61Var.S() >= u61Var.U() - 590) {
                    wq0Var.a.e0.invalidate();
                    break;
                }
                break;
            case 26:
                zq0 zq0Var = (zq0) this.b;
                jg.a1 a1Var2 = (jg.a1) this.c;
                a1Var2.e.h();
                a1Var2.c.postRunnable(new ag.f3(5));
                try {
                    zq0Var.b.e0.removeView(a1Var2);
                    break;
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                    return;
                }
            case 27:
                iq0 iq0Var = (iq0) this.b;
                fg.i iVar = (fg.i) this.c;
                PhotoViewer photoViewer5 = iq0Var.b;
                if (photoViewer5.C3 != null) {
                    ImageView imageView2 = photoViewer5.x3;
                    if (imageView2 != null) {
                        imageView2.setVisibility(0);
                        photoViewer5.x3.setImageBitmap(photoViewer5.C3);
                    }
                    ((ImageReceiver) iVar.b).v0(photoViewer5.C3);
                    break;
                }
                break;
            case 28:
                jr0 jr0Var = (jr0) this.b;
                AnimatorSet animatorSet = (AnimatorSet) this.c;
                jr0Var.r.l7.d();
                animatorSet.start();
                break;
            default:
                jr0 jr0Var2 = (jr0) this.b;
                gs0 gs0Var = (gs0) this.c;
                jr0Var2.r.s4 = false;
                if (!gs0Var.s) {
                    gs0Var.a.O0(false, true);
                    break;
                }
                break;
        }
    }
}
