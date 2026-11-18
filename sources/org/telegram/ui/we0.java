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
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stats;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class we0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ we0(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0203  */
    /* JADX WARN: Type inference failed for: r6v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i7;
        int i10;
        char c10;
        String G;
        ?? r62;
        String a02;
        org.telegram.ui.ActionBar.h2 T;
        org.telegram.ui.Components.gc I;
        ll0 ll0Var;
        ll0 ll0Var2;
        rj rjVar;
        String str = "";
        int i11 = 24;
        int i12 = 2;
        switch (this.a) {
            case 0:
                xe0 xe0Var = (xe0) this.b;
                TLObject tLObject = (TLObject) this.c;
                gf0 gf0Var = xe0Var.a;
                ye0 l02 = gf0Var.l0();
                gf0Var.j0.add(0, (TLRPC.TL_chatInviteExported) tLObject);
                TLRPC.ChatFull chatFull = gf0Var.d;
                if (chatFull != null) {
                    chatFull.invitesCount++;
                    gf0Var.getMessagesStorage().w1(gf0Var.d.invitesCount, gf0Var.n);
                }
                gf0Var.n0(l02);
                break;
            case 1:
                og0 og0Var = (og0) this.b;
                TL_stats.TL_statsGraphError tL_statsGraphError = (TL_stats.TL_statsGraphError) this.c;
                if (og0Var.getParentActivity() != null) {
                    Toast.makeText(og0Var.getParentActivity(), tL_statsGraphError.error, 1).show();
                    break;
                }
                break;
            case 2:
                fh0 fh0Var = (fh0) this.b;
                String str2 = (String) this.c;
                fh0Var.getClass();
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse("sms:+" + str2));
                intent.putExtra("sms_body", org.telegram.messenger.gd.a0(null, null, 2131748924, "https://telegram.org/dl"));
                fh0Var.getContext().startActivity(intent);
                break;
            case 3:
                fh0 fh0Var2 = (fh0) this.b;
                TLRPC.User user = (TLRPC.User) this.c;
                fh0Var2.dismiss();
                org.telegram.ui.ActionBar.h2 T2 = LaunchActivity.T();
                if (T2 != null) {
                    T2.presentFragment(ProfileActivity.D4(user.id));
                    break;
                }
                break;
            case 4:
                ((org.telegram.ui.Components.ph) this.b).a((TLRPC.User) this.c);
                break;
            case 5:
                NotificationsCustomSettingsActivity.b0((NotificationsCustomSettingsActivity) this.b, (ArrayList) this.c);
                break;
            case 6:
                org.telegram.ui.ActionBar.x2[] x2VarArr = (org.telegram.ui.ActionBar.x2[]) this.b;
                boolean[] zArr = (boolean[]) this.c;
                x2VarArr[0] = null;
                gi0.a = null;
                zArr[0] = true;
                break;
            case 7:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.b;
                Runnable runnable = (Runnable) this.c;
                for (er erVar : passcodeActivity.n.f) {
                    erVar.D(0.0f);
                }
                runnable.run();
                break;
            case 8:
                mi0 mi0Var = (mi0) this.b;
                org.telegram.ui.ActionBar.z0 z0Var = (org.telegram.ui.ActionBar.z0) this.c;
                PasscodeActivity passcodeActivity2 = (PasscodeActivity) mi0Var.c;
                z0Var.setText(org.telegram.messenger.gd.M0(passcodeActivity2.E == 0 ? 2131747460 : 2131747461, null));
                z0Var.setIcon(passcodeActivity2.E == 0 ? R.drawable.msg_permissions : R.drawable.msg_pin_code);
                passcodeActivity2.y0();
                if (passcodeActivity2.s0()) {
                    passcodeActivity2.h.setInputType(524417);
                    org.telegram.messenger.g0.X3(passcodeActivity2.s, true, 0.1f, true, false);
                    break;
                }
                break;
            case 9:
                ((PasskeysActivity) this.b).d0((TL_account.Passkey) this.c);
                break;
            case 10:
                hk0 hk0Var = (hk0) this.b;
                org.telegram.messenger.ur urVar = (org.telegram.messenger.ur) this.c;
                int[] iArr = hk0Var.y;
                int i13 = urVar.a;
                if (i13 == 2) {
                    if (!(hk0Var.G.type instanceof TLRPC.TL_secureValueTypeIdentityCard)) {
                        int size = hk0Var.H.size();
                        int i14 = 0;
                        while (true) {
                            if (i14 < size) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType = (TLRPC.TL_secureRequiredType) hk0Var.H.get(i14);
                                if (tL_secureRequiredType.type instanceof TLRPC.TL_secureValueTypeIdentityCard) {
                                    hk0Var.G = tL_secureRequiredType;
                                    hk0Var.U1();
                                } else {
                                    i14++;
                                }
                            }
                        }
                    }
                } else if (i13 == 1) {
                    if (!(hk0Var.G.type instanceof TLRPC.TL_secureValueTypePassport)) {
                        int size2 = hk0Var.H.size();
                        int i15 = 0;
                        while (true) {
                            if (i15 < size2) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType2 = (TLRPC.TL_secureRequiredType) hk0Var.H.get(i15);
                                if (tL_secureRequiredType2.type instanceof TLRPC.TL_secureValueTypePassport) {
                                    hk0Var.G = tL_secureRequiredType2;
                                    hk0Var.U1();
                                } else {
                                    i15++;
                                }
                            }
                        }
                    }
                } else if (i13 == 3) {
                    if (!(hk0Var.G.type instanceof TLRPC.TL_secureValueTypeInternalPassport)) {
                        int size3 = hk0Var.H.size();
                        int i16 = 0;
                        while (true) {
                            if (i16 < size3) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType3 = (TLRPC.TL_secureRequiredType) hk0Var.H.get(i16);
                                if (tL_secureRequiredType3.type instanceof TLRPC.TL_secureValueTypeInternalPassport) {
                                    hk0Var.G = tL_secureRequiredType3;
                                    hk0Var.U1();
                                } else {
                                    i16++;
                                }
                            }
                        }
                    }
                } else if (i13 == 4 && !(hk0Var.G.type instanceof TLRPC.TL_secureValueTypeDriverLicense)) {
                    int size4 = hk0Var.H.size();
                    int i17 = 0;
                    while (true) {
                        if (i17 < size4) {
                            TLRPC.TL_secureRequiredType tL_secureRequiredType4 = (TLRPC.TL_secureRequiredType) hk0Var.H.get(i17);
                            if (tL_secureRequiredType4.type instanceof TLRPC.TL_secureValueTypeDriverLicense) {
                                hk0Var.G = tL_secureRequiredType4;
                                hk0Var.U1();
                            } else {
                                i17++;
                            }
                        }
                    }
                }
                if (!TextUtils.isEmpty(urVar.b)) {
                    hk0Var.Z[0].setText(urVar.b);
                }
                if (!TextUtils.isEmpty(urVar.d)) {
                    hk0Var.Z[1].setText(urVar.d);
                }
                if (!TextUtils.isEmpty(urVar.c)) {
                    hk0Var.Z[2].setText(urVar.c);
                }
                if (!TextUtils.isEmpty(urVar.e)) {
                    hk0Var.Z[7].setText(urVar.e);
                }
                int i18 = urVar.n;
                if (i18 != 0) {
                    if (i18 == 1) {
                        hk0Var.x = "male";
                        hk0Var.Z[4].setText(org.telegram.messenger.gd.M0(2131747315, null));
                    } else if (i18 == 2) {
                        hk0Var.x = "female";
                        hk0Var.Z[4].setText(org.telegram.messenger.gd.M0(2131747376, null));
                    }
                }
                if (!TextUtils.isEmpty(urVar.m)) {
                    String str3 = urVar.m;
                    hk0Var.s = str3;
                    String str4 = (String) hk0Var.Z0.get(str3);
                    if (str4 != null) {
                        hk0Var.Z[5].setText(str4);
                    }
                }
                if (!TextUtils.isEmpty(urVar.l)) {
                    String str5 = urVar.l;
                    hk0Var.w = str5;
                    String str6 = (String) hk0Var.Z0.get(str5);
                    if (str6 != null) {
                        hk0Var.Z[6].setText(str6);
                    }
                }
                int i19 = urVar.k;
                if (i19 > 0 && urVar.j > 0 && urVar.i > 0) {
                    hk0Var.Z[3].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i19), Integer.valueOf(urVar.j), Integer.valueOf(urVar.i)));
                }
                int i20 = urVar.h;
                if (i20 <= 0 || (i7 = urVar.g) <= 0 || (i10 = urVar.f) <= 0) {
                    iArr[2] = 0;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    hk0Var.Z[8].setText(org.telegram.messenger.gd.M0(2131747301, null));
                    break;
                } else {
                    iArr[0] = i10;
                    iArr[1] = i7;
                    iArr[2] = i20;
                    hk0Var.Z[8].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i20), Integer.valueOf(urVar.g), Integer.valueOf(urVar.f)));
                    break;
                }
                break;
            case 11:
                hk0 hk0Var2 = (hk0) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                if (tLObject2 != null) {
                    TL_account.Password password = (TL_account.Password) tLObject2;
                    hk0Var2.K = password;
                    if (TwoStepVerificationActivity.n0(password, false)) {
                        TwoStepVerificationActivity.r0(hk0Var2.K);
                        hk0Var2.W1();
                        if (hk0Var2.a0[0].getVisibility() == 0) {
                            hk0Var2.Z[0].requestFocus();
                            org.telegram.messenger.g0.I3(hk0Var2.Z[0]);
                        }
                        if (hk0Var2.O0 == 1) {
                            hk0Var2.F1(true);
                            break;
                        }
                    } else {
                        org.telegram.ui.Components.b5.u0(hk0Var2.getParentActivity(), org.telegram.messenger.gd.M0(2131743583, null), true);
                        break;
                    }
                }
                break;
            case 12:
                hk0 hk0Var3 = (hk0) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                if (tL_error == null) {
                    hk0Var3.g1 = true;
                    hk0Var3.a1(true);
                    hk0Var3.finishFragment();
                    break;
                } else {
                    hk0Var3.R1(false, false);
                    if ("APP_VERSION_OUTDATED".equals(tL_error.text)) {
                        org.telegram.ui.Components.b5.u0(hk0Var3.getParentActivity(), org.telegram.messenger.gd.M0(2131743583, null), true);
                        break;
                    } else {
                        hk0Var3.Q1(org.telegram.messenger.gd.M0(R.string.AppName, null), tL_error.text);
                        break;
                    }
                }
            case 13:
                ((ck0) this.b).a.L = ((TLRPC.TL_error) this.c).text;
                break;
            case 14:
                ml0 ml0Var = (ml0) this.b;
                View view = (View) this.c;
                ml0Var.J0(false);
                view.callOnClick();
                break;
            case 15:
                ml0 ml0Var2 = (ml0) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                ml0Var2.N0(true, false);
                if (tL_error2 != null) {
                    if (tL_error2.text.startsWith("CODE_INVALID")) {
                        org.telegram.ui.Cells.m3 m3Var = ml0Var2.T;
                        try {
                            m3Var.performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        org.telegram.messenger.g0.E3(2.5f, m3Var, null);
                        org.telegram.ui.Cells.m3 m3Var2 = ml0Var2.T;
                        m3Var2.a.setText("");
                        m3Var2.setWillNotDraw(true);
                        break;
                    } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                        int intValue = Utilities.z(tL_error2.text).intValue();
                        if (intValue < 60) {
                            c10 = 0;
                            G = org.telegram.messenger.gd.G(intValue, "Seconds", new Object[0]);
                        } else {
                            c10 = 0;
                            G = org.telegram.messenger.gd.G(intValue / 60, "Minutes", new Object[0]);
                        }
                        String M0 = org.telegram.messenger.gd.M0(R.string.AppName, null);
                        Object[] objArr = new Object[1];
                        objArr[c10] = G;
                        ml0Var2.L0(M0, org.telegram.messenger.gd.a0("FloodWaitTime", null, 2131750670, objArr));
                        break;
                    } else {
                        ml0Var2.L0(org.telegram.messenger.gd.M0(R.string.AppName, null), tL_error2.text);
                        break;
                    }
                } else if (ml0Var2.getParentActivity() != null) {
                    nk0 nk0Var = ml0Var2.e0;
                    if (nk0Var != null) {
                        org.telegram.messenger.g0.r(nk0Var);
                        ml0Var2.e0 = null;
                    }
                    ml0Var2.z0();
                    break;
                }
                break;
            case 16:
                ml0.b0((ml0) this.b, (TLRPC.TL_payments_validatedRequestedInfo) this.c);
                break;
            case 17:
                ml0 ml0Var3 = (ml0) this.b;
                TLRPC.Message[] messageArr = (TLRPC.Message[]) this.c;
                Context parentActivity = ml0Var3.getParentActivity();
                if (parentActivity == null) {
                    parentActivity = org.telegram.messenger.t0.b;
                }
                if (parentActivity == null) {
                    parentActivity = LaunchActivity.H1;
                }
                if (parentActivity != null) {
                    ml0Var3.b1 = true;
                    ml0Var3.g1 = 1;
                    TLRPC.InputInvoice inputInvoice = ml0Var3.c1;
                    boolean z10 = inputInvoice instanceof TLRPC.TL_inputInvoiceStars;
                    boolean z11 = z10 && (((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose instanceof TLRPC.TL_inputStorePaymentStarsGift);
                    boolean z12 = z10 && (((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose instanceof TLRPC.TL_inputStorePaymentStarsGiveaway);
                    if (!z10 && (ll0Var2 = ml0Var3.a1) != null) {
                        ll0Var2.d(1);
                    }
                    ml0Var3.z0();
                    if (z10 && (ll0Var = ml0Var3.a1) != null) {
                        ll0Var.d(ml0Var3.g1);
                    }
                    long w02 = ml0Var3.w0();
                    if (w02 > 0) {
                        str = org.telegram.messenger.o10.l(ml0Var3.getMessagesController().c2(Long.valueOf(w02)));
                    } else if (w02 < 0) {
                        boolean z13 = false;
                        TLRPC.Chat O0 = ml0Var3.getMessagesController().O0(Long.valueOf(-w02));
                        r62 = z13;
                        if (O0 != null) {
                            str = O0.title;
                            r62 = z13;
                        }
                        long v02 = ml0Var3.v0();
                        int i21 = !z10 ? (z11 || z12) ? R.raw.stars_send : R.raw.stars_topup : R.raw.payment_success;
                        String M02 = z10 ? null : org.telegram.messenger.gd.M0(z12 ? 2131744857 : z11 ? 2131744865 : 2131744924, null);
                        if (z10) {
                            String str7 = ml0Var3.S0[r62];
                            String str8 = ml0Var3.r0;
                            Object[] objArr2 = new Object[2];
                            objArr2[r62] = str7;
                            objArr2[1] = str8;
                            a02 = org.telegram.messenger.gd.a0(null, null, 2131747208, objArr2);
                        } else if (z12) {
                            a02 = org.telegram.messenger.gd.H(',', "StarsGiveawaySentPopupInfo", (int) v02);
                        } else {
                            String str9 = z11 ? "StarsGiftSentPopupInfo" : "StarsAcquiredInfo";
                            Object[] objArr3 = new Object[1];
                            objArr3[r62] = str;
                            a02 = org.telegram.messenger.gd.K(str9, (int) v02, ',', objArr3);
                        }
                        SpannableStringBuilder W2 = org.telegram.messenger.g0.W2(a02);
                        T = LaunchActivity.T();
                        if (T == null) {
                            org.telegram.ui.Components.lc b02 = org.telegram.ui.Components.lc.b0(T);
                            if (w02 == 0 || M02 == null || z12) {
                                String str10 = M02;
                                I = str10 != null ? b02.I(i21, str10, W2) : b02.Q(i21, 36, W2);
                            } else {
                                I = b02.L(i21, M02, W2, org.telegram.messenger.gd.M0(2131743315, null), new di.g3(w02, i12));
                            }
                            org.telegram.ui.Components.gc gcVar = I;
                            gcVar.r = r62;
                            gcVar.j = 5000;
                            if (messageArr[r62] != null) {
                                fi.k3 k3Var = new fi.k3(ml0Var3, gcVar, z11, messageArr, 3);
                                org.telegram.ui.Components.lb lbVar = gcVar.e;
                                if (lbVar != null) {
                                    lbVar.setOnClickListener(k3Var);
                                }
                            }
                            gcVar.k(z12);
                            break;
                        }
                    }
                    r62 = 0;
                    long v022 = ml0Var3.v0();
                    int i212 = !z10 ? (z11 || z12) ? R.raw.stars_send : R.raw.stars_topup : R.raw.payment_success;
                    if (z10) {
                    }
                    if (z10) {
                    }
                    SpannableStringBuilder W22 = org.telegram.messenger.g0.W2(a02);
                    T = LaunchActivity.T();
                    if (T == null) {
                    }
                }
                break;
            case 18:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                uy0.e1(photoViewer.F, photoViewer.m4, false, (fi.b) this.c, null);
                break;
            case 19:
                PhotoViewer photoViewer2 = (PhotoViewer) this.b;
                fp0 fp0Var = (fp0) this.c;
                Drawable[] drawableArr = PhotoViewer.Z8;
                if (fp0Var.getWindow() != null) {
                    fp0Var.A0(true);
                    bn bnVar = photoViewer2.l4;
                    if (bnVar != null && (rjVar = bnVar.a0) != null) {
                        rjVar.G0(false);
                        break;
                    }
                }
                break;
            case 20:
                bi.e2 e2Var = (bi.e2) this.b;
                Bitmap bitmap = (Bitmap) this.c;
                Drawable[] drawableArr2 = PhotoViewer.Z8;
                e2Var.a(bitmap);
                break;
            case 21:
                PhotoViewer photoViewer3 = (PhotoViewer) this.b;
                tg.o0 o0Var = (tg.o0) this.c;
                Drawable[] drawableArr3 = PhotoViewer.Z8;
                o0Var.e.h();
                o0Var.c.postRunnable(new dd0(i11));
                photoViewer3.f0.removeView(photoViewer3.O1);
                break;
            case 22:
                org.telegram.ui.Components.b6 b6Var = (org.telegram.ui.Components.b6) this.b;
                Bitmap bitmap2 = (Bitmap) this.c;
                Drawable[] drawableArr4 = PhotoViewer.Z8;
                if (b6Var != null) {
                    ArrayList arrayList = b6Var.h;
                    org.telegram.ui.Components.y5 y5Var = b6Var.n;
                    if (y5Var != null) {
                        arrayList.add(y5Var);
                    }
                    org.telegram.ui.Components.y5 y5Var2 = b6Var.r;
                    if (y5Var2 != null) {
                        arrayList.add(y5Var2);
                    }
                    org.telegram.ui.Components.y5 y5Var3 = b6Var.s;
                    if (y5Var3 != null) {
                        arrayList.add(y5Var3);
                    }
                    b6Var.n = new org.telegram.ui.Components.y5(bitmap2);
                    b6Var.r = null;
                    b6Var.s = null;
                    b6Var.t();
                    break;
                }
                break;
            case 23:
                fo0 fo0Var = (fo0) this.b;
                View view2 = (View) this.c;
                fo0Var.getClass();
                view2.setOutlineProvider(null);
                PhotoViewer photoViewer4 = fo0Var.c;
                ImageView imageView = photoViewer4.x3;
                if (imageView != null) {
                    imageView.setOutlineProvider(null);
                }
                pq0 pq0Var = photoViewer4.F2;
                if (pq0Var != null) {
                    pq0Var.setOutlineProvider(null);
                    break;
                }
                break;
            case 24:
                np0 np0Var = (np0) this.b;
                org.telegram.ui.Components.f61 f61Var = (org.telegram.ui.Components.f61) this.c;
                np0Var.getClass();
                if (f61Var.U() > 0 && f61Var.S() >= f61Var.U() - 590) {
                    np0Var.a.f0.invalidate();
                    break;
                }
                break;
            case 25:
                qp0 qp0Var = (qp0) this.b;
                tg.o0 o0Var2 = (tg.o0) this.c;
                o0Var2.e.h();
                o0Var2.c.postRunnable(new dd0(i11));
                try {
                    qp0Var.b.f0.removeView(o0Var2);
                    break;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 26:
                aq0 aq0Var = (aq0) this.b;
                AnimatorSet animatorSet = (AnimatorSet) this.c;
                aq0Var.r.l7.d();
                animatorSet.start();
                break;
            case 27:
                aq0 aq0Var2 = (aq0) this.b;
                wq0 wq0Var = (wq0) this.c;
                aq0Var2.r.s4 = false;
                if (!wq0Var.s) {
                    wq0Var.a.O0(false, true);
                    break;
                }
                break;
            case 28:
                as0 as0Var = (as0) this.b;
                String str11 = (String) this.c;
                as0Var.getClass();
                org.telegram.messenger.g0.g(str11);
                as0Var.c(true);
                break;
            default:
                as0 as0Var2 = (as0) this.b;
                TLRPC.PollAnswer pollAnswer = (TLRPC.PollAnswer) this.c;
                as0Var2.getClass();
                org.telegram.messenger.g0.g(org.telegram.messenger.fj.h0(pollAnswer.text, false));
                as0Var2.c(true);
                break;
        }
    }
}
