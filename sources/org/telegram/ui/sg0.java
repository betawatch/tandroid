package org.telegram.ui;

import android.content.SharedPreferences;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.io.File;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sg0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ sg0(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x026b A[LOOP:1: B:124:0x0265->B:126:0x026b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0233  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i3;
        org.telegram.ui.ActionBar.j6 Q0;
        String[] strArr;
        SparseIntArray T0;
        int[] iArr;
        int i10;
        org.telegram.ui.ActionBar.g6 k10;
        wl0 wl0Var;
        boolean z10;
        Drawable drawable;
        int i11;
        mj mjVar;
        int i12 = 17;
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.K3(((tg0) this.b).a.H1);
                break;
            case 1:
                NotificationsSettingsActivity.a0((NotificationsSettingsActivity) this.b);
                break;
            case 2:
                ((PasscodeActivity) ((ib0) this.b).n).v0();
                break;
            case 3:
                PasskeysActivity.c0((PasskeysActivity) this.b);
                break;
            case 4:
                TLObject tLObject = (TLObject) this.b;
                if (tLObject instanceof TLRPC.TL_help_passportConfig) {
                    TLRPC.TL_help_passportConfig tL_help_passportConfig = (TLRPC.TL_help_passportConfig) tLObject;
                    String str = tL_help_passportConfig.countries_langs.data;
                    int i13 = tL_help_passportConfig.hash;
                    org.telegram.messenger.az.j0 = null;
                    org.telegram.messenger.az.i0 = str;
                    org.telegram.messenger.az.k0 = i13;
                    org.telegram.messenger.az.y();
                    org.telegram.messenger.az.n();
                    break;
                } else {
                    org.telegram.messenger.az.n();
                    break;
                }
            case 5:
                ((hj0) this.b).a.finishFragment();
                break;
            case 6:
                org.telegram.ui.Components.t4.w0(((mj0) this.b).e.getParentActivity(), org.telegram.messenger.bd.M0(2131743830, null), true);
                break;
            case 7:
                g6.q qVar = (g6.q) this.b;
                double currentTimeMillis = System.currentTimeMillis();
                uj0 uj0Var = (uj0) qVar.b;
                double d = currentTimeMillis - uj0Var.H;
                uj0Var.H = currentTimeMillis;
                int i14 = (int) (uj0Var.F - d);
                uj0Var.F = i14;
                if (i14 <= 1000) {
                    uj0Var.r.setVisibility(0);
                    uj0Var.n.setVisibility(8);
                    uj0Var.q();
                    break;
                }
                break;
            case 8:
                tj0 tj0Var = (tj0) this.b;
                uj0 uj0Var2 = tj0Var.a;
                int i15 = uj0Var2.E;
                vj0 vj0Var = uj0Var2.s;
                jb0 jb0Var = uj0Var2.n;
                if (i15 >= 1000) {
                    int i16 = i15 / 1000;
                    int i17 = i16 / 60;
                    int i18 = i16 - (i17 * 60);
                    int i19 = uj0Var2.N;
                    if (i19 == 4 || i19 == 3) {
                        jb0Var.setText(org.telegram.messenger.bd.a0("CallText", null, 2131752601, Integer.valueOf(i17), Integer.valueOf(i18)));
                    } else if (i19 == 2) {
                        jb0Var.setText(org.telegram.messenger.bd.a0("SmsText", null, 2131745305, Integer.valueOf(i17), Integer.valueOf(i18)));
                    }
                    if (vj0Var != null) {
                        vj0Var.c = 1.0f - (uj0Var2.E / uj0Var2.Q);
                        vj0Var.invalidate();
                        break;
                    }
                } else {
                    if (vj0Var != null) {
                        vj0Var.c = 1.0f;
                        vj0Var.invalidate();
                    }
                    uj0Var2.r();
                    int i20 = uj0Var2.M;
                    if (i20 == 3) {
                        org.telegram.messenger.g0.D3(false);
                        org.telegram.messenger.hs.e().n(uj0Var2, org.telegram.messenger.hs.h4);
                        uj0Var2.J = false;
                        uj0Var2.q();
                        uj0Var2.s();
                        break;
                    } else if (i20 == 2 || i20 == 4) {
                        int i21 = uj0Var2.N;
                        if (i21 != 4 && i21 != 2) {
                            if (i21 == 3) {
                                org.telegram.messenger.g0.E3(false);
                                org.telegram.messenger.hs.e().n(uj0Var2, org.telegram.messenger.hs.g4);
                                uj0Var2.J = false;
                                uj0Var2.q();
                                uj0Var2.s();
                                break;
                            }
                        } else {
                            if (i21 == 4) {
                                jb0Var.setText(org.telegram.messenger.bd.M0(2131752597, null));
                            } else {
                                jb0Var.setText(org.telegram.messenger.bd.M0(2131745587, null));
                            }
                            uj0Var2.o();
                            TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                            tL_auth_resendCode.phone_number = uj0Var2.a;
                            tL_auth_resendCode.phone_code_hash = uj0Var2.b;
                            i3 = ((org.telegram.ui.ActionBar.d2) uj0Var2.R).currentAccount;
                            ConnectionsManager.getInstance(i3).sendRequest(tL_auth_resendCode, new l(tj0Var, i12), 2);
                            break;
                        }
                    }
                }
                break;
            case 9:
                sf.c.t(((qk0) this.b).c.getParentActivity(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                break;
            case 10:
                dl0 dl0Var = (dl0) ((f) this.b).b;
                dl0Var.z0();
                dl0Var.N0(true, false);
                dl0Var.J0(false);
                break;
            case 11:
                sf.c.t(((qk0) this.b).c.getParentActivity(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                break;
            case 12:
                cm0 cm0Var = (cm0) this.b;
                cm0Var.T = !cm0Var.T;
                SharedPreferences sharedPreferences = org.telegram.messenger.t0.b.getSharedPreferences("themeconfig", 0);
                String str2 = "Blue";
                String string = sharedPreferences.getString("lastDayTheme", "Blue");
                if (org.telegram.ui.ActionBar.k6.Q0(string) == null || org.telegram.ui.ActionBar.k6.Q0(string).q()) {
                    string = "Blue";
                }
                String str3 = "Dark Blue";
                String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                if (org.telegram.ui.ActionBar.k6.Q0(string2) == null || !org.telegram.ui.ActionBar.k6.Q0(string2).q()) {
                    string2 = "Dark Blue";
                }
                org.telegram.ui.ActionBar.j6 j6Var = org.telegram.ui.ActionBar.k6.I;
                if (string.equals(string2)) {
                    if (j6Var.q() || string.equals("Dark Blue") || string.equals("Night")) {
                        str3 = string2;
                        Q0 = !cm0Var.T ? org.telegram.ui.ActionBar.k6.Q0(str3) : org.telegram.ui.ActionBar.k6.Q0(str2);
                        cm0Var.w.clear();
                        strArr = new String[1];
                        String str4 = Q0.d;
                        T0 = str4 == null ? org.telegram.ui.ActionBar.k6.T0(null, str4, strArr) : org.telegram.ui.ActionBar.k6.T0(new File(Q0.b), null, strArr);
                        iArr = org.telegram.ui.ActionBar.k6.em;
                        if (iArr != null) {
                            for (int i22 = 0; i22 < iArr.length; i22++) {
                                cm0Var.w.put(i22, iArr[i22]);
                            }
                        }
                        for (i10 = 0; i10 < T0.size(); i10++) {
                            cm0Var.w.put(T0.keyAt(i10), T0.valueAt(i10));
                        }
                        k10 = Q0.k(false);
                        if (k10 != null) {
                            k10.d(T0, cm0Var.w);
                        }
                        wl0Var = cm0Var.h;
                        if (wl0Var != null && wl0Var.w != null) {
                            b8.ke I = org.telegram.ui.ActionBar.k6.I(Q0, cm0Var.w, strArr[0], 0, true);
                            rl0 rl0Var = cm0Var.h.w;
                            drawable = (BitmapDrawable) I.c;
                            if (drawable == null) {
                                drawable = (Drawable) I.b;
                            }
                            rl0Var.setOverrideBackground(drawable);
                        }
                        z10 = cm0Var.T;
                        if (cm0Var.b0 != z10) {
                            cm0Var.b0 = z10;
                            org.telegram.ui.Components.ch0 ch0Var = cm0Var.U;
                            ch0Var.P(z10 ? ch0Var.e[0] : 0);
                            org.telegram.ui.Components.ch0 ch0Var2 = cm0Var.U;
                            if (ch0Var2 != null) {
                                ch0Var2.start();
                            }
                        }
                        cm0Var.J0();
                        break;
                    }
                } else {
                    str3 = string2;
                }
                str2 = string;
                if (!cm0Var.T) {
                }
                cm0Var.w.clear();
                strArr = new String[1];
                String str42 = Q0.d;
                if (str42 == null) {
                }
                iArr = org.telegram.ui.ActionBar.k6.em;
                if (iArr != null) {
                }
                while (i10 < T0.size()) {
                }
                k10 = Q0.k(false);
                if (k10 != null) {
                }
                wl0Var = cm0Var.h;
                if (wl0Var != null) {
                    b8.ke I2 = org.telegram.ui.ActionBar.k6.I(Q0, cm0Var.w, strArr[0], 0, true);
                    rl0 rl0Var2 = cm0Var.h.w;
                    drawable = (BitmapDrawable) I2.c;
                    if (drawable == null) {
                    }
                    rl0Var2.setOverrideBackground(drawable);
                }
                z10 = cm0Var.T;
                if (cm0Var.b0 != z10) {
                }
                cm0Var.J0();
                break;
            case 13:
                ul0 ul0Var = (ul0) this.b;
                wl0 wl0Var2 = ul0Var.c;
                bm0 bm0Var = wl0Var2.F;
                cm0 cm0Var2 = wl0Var2.q0;
                if (bm0Var != null && wl0Var2.M.size() > 1) {
                    bm0Var.a(1, true);
                    TL_stars.StarGift starGift = (TL_stars.StarGift) wl0Var2.N.get(1);
                    wl0Var2.L = starGift;
                    if (starGift == null) {
                        ai.w5 w5Var = wl0Var2.K;
                        if (w5Var != null) {
                            w5Var.f();
                            wl0Var2.K = null;
                        }
                    } else {
                        ai.w5 w5Var2 = wl0Var2.K;
                        if (w5Var2 == null || w5Var2.b != starGift.id) {
                            i11 = ((org.telegram.ui.ActionBar.d2) cm0Var2).currentAccount;
                            ai.w5 w5Var3 = new ai.w5(i11, wl0Var2.L.id, new s3(ul0Var, i12));
                            wl0Var2.K = w5Var3;
                            w5Var3.g(false);
                        }
                    }
                    wl0.a(wl0Var2);
                    (cm0Var2.J.getCurrentPosition() == 1 ? cm0Var2.n : cm0Var2.h).e();
                    break;
                }
                break;
            case 14:
                sm0 sm0Var = (sm0) ((gi.s2) this.b).c;
                sm0Var.g0(sm0Var.Q.getSearchField());
                break;
            case 15:
                ((om0) this.b).j0.M.f();
                break;
            case 16:
                ((gq0) this.b).invalidate();
                break;
            case 17:
                com.google.android.gms.common.api.internal.s sVar = (com.google.android.gms.common.api.internal.s) this.b;
                PhotoViewer photoViewer = (PhotoViewer) sVar.d;
                long j10 = sVar.a;
                Drawable[] drawableArr = PhotoViewer.V8;
                photoViewer.w2(j10);
                if (photoViewer.d2 == 1) {
                    long j11 = sVar.a;
                    photoViewer.Y7 = j11;
                    if (photoViewer.X7 != j11) {
                        photoViewer.X7 = -1L;
                    }
                }
                sVar.c = null;
                break;
            case 18:
                PhotoViewer photoViewer2 = ((to0) this.b).a;
                ImageView imageView = photoViewer2.F3;
                if (imageView != null && imageView.getParent() != null) {
                    ((ViewGroup) photoViewer2.F3.getParent()).removeView(photoViewer2.F3);
                    if (photoViewer2.E3 != null) {
                        ImageView imageView2 = photoViewer2.F3;
                        if (imageView2 != null) {
                            imageView2.setBackground(null);
                        }
                        org.telegram.messenger.g0.z2(photoViewer2.E3);
                        photoViewer2.E3 = null;
                    }
                    photoViewer2.F3 = null;
                    break;
                }
                break;
            case 19:
                wm wmVar = ((vo0) this.b).U2.m4;
                if (wmVar != null && (mjVar = wmVar.a0) != null) {
                    mjVar.G0();
                    break;
                }
                break;
            case 20:
                org.telegram.ui.Components.ri0 ri0Var = (org.telegram.ui.Components.ri0) ((y20) this.b).b;
                PhotoViewer photoViewer3 = (PhotoViewer) ri0Var.c;
                photoViewer3.I2 = false;
                org.telegram.ui.Components.m51 m51Var = photoViewer3.G2;
                if (m51Var != null) {
                    m51Var.h0();
                }
                ((PhotoViewer) ri0Var.c).J2 = null;
                break;
            case 21:
                PhotoViewer photoViewer4 = ((io0) this.b).a;
                photoViewer4.I2 = false;
                org.telegram.ui.Components.m51 m51Var2 = photoViewer4.G2;
                if (m51Var2 != null) {
                    m51Var2.h0();
                }
                photoViewer4.J2 = null;
                break;
            case 22:
                qp0 qp0Var = (qp0) ((y20) this.b).b;
                qp0Var.r.m7.e();
                PhotoViewer photoViewer5 = qp0Var.r;
                Runnable runnable = photoViewer5.q4;
                if (runnable != null) {
                    runnable.run();
                    photoViewer5.q4 = null;
                }
                photoViewer5.B2(true);
                break;
            case 23:
                PhotoViewer photoViewer6 = ((xo0) this.b).b;
                Runnable runnable2 = photoViewer6.q4;
                if (runnable2 != null) {
                    runnable2.run();
                    photoViewer6.q4 = null;
                    break;
                }
                break;
            case 24:
                ((bq0) this.b).y.f(true);
                break;
            case 25:
                ((fq0) this.b).d = true;
                break;
            case 26:
                PremiumPreviewFragment premiumPreviewFragment = ((fs0) this.b).c;
                premiumPreviewFragment.showDialog(new iy0(premiumPreviewFragment.getParentActivity(), false, premiumPreviewFragment.getResourceProvider(), null));
                break;
            case 27:
                kt0 kt0Var = (kt0) this.b;
                RectF rectF = ProfileActivity.T6;
                kt0Var.a(0);
                break;
            case 28:
                TLRPC.User user = (TLRPC.User) this.b;
                RectF rectF2 = ProfileActivity.T6;
                org.telegram.messenger.g0.g("@" + org.telegram.messenger.l10.n(user));
                break;
            default:
                iu0 iu0Var = (iu0) this.b;
                iu0Var.G.getNotificationCenter().j(iu0Var.F);
                break;
        }
    }
}
