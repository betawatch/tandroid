package org.telegram.ui;

import android.content.SharedPreferences;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zk0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zk0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x028f A[LOOP:2: B:137:0x0289->B:139:0x028f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0257  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i10;
        org.telegram.ui.ActionBar.f6 N0;
        String[] strArr;
        SparseIntArray Q0;
        int[] iArr;
        int i11;
        org.telegram.ui.ActionBar.e6 k10;
        vo0 vo0Var;
        boolean z10;
        Drawable drawable;
        int i12;
        ck ckVar;
        switch (this.a) {
            case 0:
                ((PasscodeActivity) ((od0) this.b).n).h0();
                break;
            case 1:
                PasskeysActivity.X((PasskeysActivity) this.b);
                break;
            case 2:
                TLObject tLObject = (TLObject) this.b;
                if (tLObject instanceof TLRPC.TL_help_passportConfig) {
                    TLRPC.TL_help_passportConfig tL_help_passportConfig = (TLRPC.TL_help_passportConfig) tLObject;
                    SharedConfig.setPassportConfig(tL_help_passportConfig.countries_langs.data, tL_help_passportConfig.hash);
                    break;
                } else {
                    SharedConfig.getCountryLangs();
                    break;
                }
            case 3:
                ((gm0) this.b).a.finishFragment();
                break;
            case 4:
                org.telegram.ui.Components.y4.x0(((km0) this.b).e.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                break;
            case 5:
                lh.h2 h2Var = (lh.h2) this.b;
                double currentTimeMillis = System.currentTimeMillis();
                tm0 tm0Var = (tm0) h2Var.b;
                double d = currentTimeMillis - tm0Var.C;
                tm0Var.C = currentTimeMillis;
                int i13 = (int) (tm0Var.A - d);
                tm0Var.A = i13;
                if (i13 <= 1000) {
                    tm0Var.r.setVisibility(0);
                    tm0Var.n.setVisibility(8);
                    tm0Var.r();
                    break;
                }
                break;
            case 6:
                sm0 sm0Var = (sm0) this.b;
                tm0 tm0Var2 = sm0Var.a;
                int i14 = tm0Var2.y;
                um0 um0Var = tm0Var2.s;
                qd0 qd0Var = tm0Var2.n;
                if (i14 >= 1000) {
                    int i15 = i14 / MediaDataController.MAX_STYLE_RUNS_COUNT;
                    int i16 = i15 / 60;
                    int i17 = i15 - (i16 * 60);
                    int i18 = tm0Var2.I;
                    if (i18 == 4 || i18 == 3) {
                        qd0Var.setText(LocaleController.formatString("CallText", R.string.CallText, Integer.valueOf(i16), Integer.valueOf(i17)));
                    } else if (i18 == 2) {
                        qd0Var.setText(LocaleController.formatString("SmsText", R.string.SmsText, Integer.valueOf(i16), Integer.valueOf(i17)));
                    }
                    if (um0Var != null) {
                        um0Var.c = 1.0f - (tm0Var2.y / tm0Var2.L);
                        um0Var.invalidate();
                        break;
                    }
                } else {
                    if (um0Var != null) {
                        um0Var.c = 1.0f;
                        um0Var.invalidate();
                    }
                    tm0Var2.s();
                    int i19 = tm0Var2.H;
                    if (i19 == 3) {
                        AndroidUtilities.setWaitingForCall(false);
                        NotificationCenter.getGlobalInstance().removeObserver(tm0Var2, NotificationCenter.didReceiveCall);
                        tm0Var2.E = false;
                        tm0Var2.r();
                        tm0Var2.t();
                        break;
                    } else if (i19 == 2 || i19 == 4) {
                        int i20 = tm0Var2.I;
                        if (i20 != 4 && i20 != 2) {
                            if (i20 == 3) {
                                AndroidUtilities.setWaitingForSms(false);
                                NotificationCenter.getGlobalInstance().removeObserver(tm0Var2, NotificationCenter.didReceiveSmsCode);
                                tm0Var2.E = false;
                                tm0Var2.r();
                                tm0Var2.t();
                                break;
                            }
                        } else {
                            if (i20 == 4) {
                                qd0Var.setText(LocaleController.getString(R.string.Calling));
                            } else {
                                qd0Var.setText(LocaleController.getString(R.string.SendingSms));
                            }
                            tm0Var2.p();
                            TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                            tL_auth_resendCode.phone_number = tm0Var2.a;
                            tL_auth_resendCode.phone_code_hash = tm0Var2.b;
                            i10 = ((org.telegram.ui.ActionBar.n2) tm0Var2.M).currentAccount;
                            ConnectionsManager.getInstance(i10).sendRequest(tL_auth_resendCode, new n(sm0Var, 16), 2);
                            break;
                        }
                    }
                }
                break;
            case 7:
                we.e.s(((on0) this.b).b.getParentActivity(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                break;
            case 8:
                do0 do0Var = ((sn0) this.b).a;
                do0Var.t0();
                do0Var.H0(true, false);
                do0Var.D0(false);
                break;
            case 9:
                we.e.s(((wn0) this.b).b.getParentActivity(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                break;
            case 10:
                ap0 ap0Var = (ap0) this.b;
                ap0Var.F = !ap0Var.F;
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
                String str = "Blue";
                String string = sharedPreferences.getString("lastDayTheme", "Blue");
                if (org.telegram.ui.ActionBar.g6.N0(string) == null || org.telegram.ui.ActionBar.g6.N0(string).q()) {
                    string = "Blue";
                }
                String str2 = "Dark Blue";
                String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                if (org.telegram.ui.ActionBar.g6.N0(string2) == null || !org.telegram.ui.ActionBar.g6.N0(string2).q()) {
                    string2 = "Dark Blue";
                }
                org.telegram.ui.ActionBar.f6 f6Var = org.telegram.ui.ActionBar.g6.I;
                if (string.equals(string2)) {
                    if (f6Var.q() || string.equals("Dark Blue") || string.equals("Night")) {
                        str2 = string2;
                        N0 = !ap0Var.F ? org.telegram.ui.ActionBar.g6.N0(str2) : org.telegram.ui.ActionBar.g6.N0(str);
                        ap0Var.s.clear();
                        strArr = new String[1];
                        String str3 = N0.d;
                        Q0 = str3 == null ? org.telegram.ui.ActionBar.g6.Q0(null, str3, strArr) : org.telegram.ui.ActionBar.g6.Q0(new File(N0.b), null, strArr);
                        iArr = org.telegram.ui.ActionBar.g6.nl;
                        if (iArr != null) {
                            for (int i21 = 0; i21 < iArr.length; i21++) {
                                ap0Var.s.put(i21, iArr[i21]);
                            }
                        }
                        for (i11 = 0; i11 < Q0.size(); i11++) {
                            ap0Var.s.put(Q0.keyAt(i11), Q0.valueAt(i11));
                        }
                        k10 = N0.k(false);
                        if (k10 != null) {
                            k10.c(Q0, ap0Var.s);
                        }
                        vo0Var = ap0Var.f;
                        if (vo0Var != null && vo0Var.w != null) {
                            af.h H = org.telegram.ui.ActionBar.g6.H(N0, ap0Var.s, strArr[0], 0, true);
                            org.telegram.ui.Cells.ba baVar = ap0Var.f.w;
                            drawable = (BitmapDrawable) H.b;
                            if (drawable == null) {
                                drawable = (Drawable) H.a;
                            }
                            baVar.setOverrideBackground(drawable);
                        }
                        z10 = ap0Var.F;
                        if (ap0Var.N != z10) {
                            ap0Var.N = z10;
                            org.telegram.ui.Components.oi0 oi0Var = ap0Var.G;
                            oi0Var.N(z10 ? oi0Var.e[0] : 0);
                            org.telegram.ui.Components.oi0 oi0Var2 = ap0Var.G;
                            if (oi0Var2 != null) {
                                oi0Var2.start();
                            }
                        }
                        ap0Var.z0();
                        break;
                    }
                } else {
                    str2 = string2;
                }
                str = string;
                if (!ap0Var.F) {
                }
                ap0Var.s.clear();
                strArr = new String[1];
                String str32 = N0.d;
                if (str32 == null) {
                }
                iArr = org.telegram.ui.ActionBar.g6.nl;
                if (iArr != null) {
                }
                while (i11 < Q0.size()) {
                }
                k10 = N0.k(false);
                if (k10 != null) {
                }
                vo0Var = ap0Var.f;
                if (vo0Var != null) {
                    af.h H2 = org.telegram.ui.ActionBar.g6.H(N0, ap0Var.s, strArr[0], 0, true);
                    org.telegram.ui.Cells.ba baVar2 = ap0Var.f.w;
                    drawable = (BitmapDrawable) H2.b;
                    if (drawable == null) {
                    }
                    baVar2.setOverrideBackground(drawable);
                }
                z10 = ap0Var.F;
                if (ap0Var.N != z10) {
                }
                ap0Var.z0();
                break;
            case 11:
                to0 to0Var = (to0) this.b;
                vo0 vo0Var2 = to0Var.c;
                no0 no0Var = vo0Var2.b;
                gh.j2 j2Var = null;
                int i22 = 0;
                while (true) {
                    ap0 ap0Var2 = vo0Var2.f0;
                    if (i22 < no0Var.getChildCount()) {
                        View childAt = no0Var.getChildAt(i22);
                        if (childAt instanceof gh.j2) {
                            j2Var = (gh.j2) childAt;
                        }
                        i22++;
                    } else if (j2Var != null && vo0Var2.C.size() > 1) {
                        j2Var.b = 1;
                        j2Var.a.invalidate();
                        TL_stars.StarGift starGift = (TL_stars.StarGift) vo0Var2.D.get(1);
                        vo0Var2.B = starGift;
                        if (starGift == null) {
                            gh.i5 i5Var = vo0Var2.A;
                            if (i5Var != null) {
                                i5Var.f();
                                vo0Var2.A = null;
                            }
                        } else {
                            gh.i5 i5Var2 = vo0Var2.A;
                            if (i5Var2 == null || i5Var2.b != starGift.id) {
                                i12 = ((org.telegram.ui.ActionBar.n2) ap0Var2).currentAccount;
                                gh.i5 i5Var3 = new gh.i5(vo0Var2.B.id, i12, new x3(to0Var, 13));
                                vo0Var2.A = i5Var3;
                                i5Var3.g(false);
                            }
                        }
                        vo0Var2.e();
                        (ap0Var2.y.getCurrentPosition() == 1 ? ap0Var2.h : ap0Var2.f).e();
                        break;
                    }
                }
                break;
            case 12:
                aq0 aq0Var = ((sp0) this.b).h;
                aq0Var.b0(aq0Var.L.getSearchField());
                break;
            case 13:
                ((tp0) this.b).v0.H.l();
                break;
            case 14:
                ((ut0) this.b).invalidate();
                break;
            case 15:
                com.google.android.gms.common.api.internal.v vVar = (com.google.android.gms.common.api.internal.v) this.b;
                PhotoViewer photoViewer = (PhotoViewer) vVar.d;
                long j10 = vVar.a;
                Drawable[] drawableArr = PhotoViewer.P8;
                photoViewer.t2(j10);
                if (photoViewer.Y1 == 1) {
                    long j11 = vVar.a;
                    photoViewer.S7 = j11;
                    if (photoViewer.R7 != j11) {
                        photoViewer.R7 = -1L;
                    }
                }
                vVar.c = null;
                break;
            case 16:
                PhotoViewer photoViewer2 = ((cs0) this.b).a;
                ImageView imageView = photoViewer2.A3;
                if (imageView != null && imageView.getParent() != null) {
                    ((ViewGroup) photoViewer2.A3.getParent()).removeView(photoViewer2.A3);
                    if (photoViewer2.z3 != null) {
                        ImageView imageView2 = photoViewer2.A3;
                        if (imageView2 != null) {
                            imageView2.setBackground(null);
                        }
                        AndroidUtilities.recycleBitmap(photoViewer2.z3);
                        photoViewer2.z3 = null;
                    }
                    photoViewer2.A3 = null;
                    break;
                }
                break;
            case 17:
                rn rnVar = ((es0) this.b).Z0.h4;
                if (rnVar != null && (ckVar = rnVar.U) != null) {
                    ckVar.H0();
                    break;
                }
                break;
            case 18:
                org.telegram.ui.Components.fk0 fk0Var = (org.telegram.ui.Components.fk0) ((f50) this.b).b;
                PhotoViewer photoViewer3 = (PhotoViewer) fk0Var.c;
                photoViewer3.D2 = false;
                org.telegram.ui.Components.m61 m61Var = photoViewer3.B2;
                if (m61Var != null) {
                    m61Var.D();
                }
                ((PhotoViewer) fk0Var.c).E2 = null;
                break;
            case 19:
                PhotoViewer photoViewer4 = ((rr0) this.b).a;
                photoViewer4.D2 = false;
                org.telegram.ui.Components.m61 m61Var2 = photoViewer4.B2;
                if (m61Var2 != null) {
                    m61Var2.D();
                }
                photoViewer4.E2 = null;
                break;
            case 20:
                et0 et0Var = (et0) ((f50) this.b).b;
                et0Var.r.h7.unlock();
                PhotoViewer photoViewer5 = et0Var.r;
                Runnable runnable = photoViewer5.l4;
                if (runnable != null) {
                    runnable.run();
                    photoViewer5.l4 = null;
                }
                photoViewer5.y2(true);
                break;
            case 21:
                PhotoViewer photoViewer6 = ((gs0) this.b).b;
                Runnable runnable2 = photoViewer6.l4;
                if (runnable2 != null) {
                    runnable2.run();
                    photoViewer6.l4 = null;
                    break;
                }
                break;
            case 22:
                ((pt0) this.b).s.d(true);
                break;
            case 23:
                ((tt0) this.b).d = true;
                break;
            case 24:
                PremiumPreviewFragment premiumPreviewFragment = ((yv0) this.b).c;
                premiumPreviewFragment.showDialog(new c31(premiumPreviewFragment.getParentActivity(), false, premiumPreviewFragment.getResourceProvider(), null));
                break;
            case 25:
                ((org.telegram.messenger.hk) this.b).run(0);
                break;
            case 26:
                AndroidUtilities.addToClipboard((String) this.b);
                break;
            case 27:
                ((lh.w3) this.b).e(true);
                break;
            case 28:
                AndroidUtilities.addToClipboard("@" + UserObject.getPublicUsername((TLRPC.User) this.b));
                break;
            default:
                cy0 cy0Var = (cy0) this.b;
                cy0Var.G.getNotificationCenter().onAnimationFinish(cy0Var.F);
                break;
        }
    }
}
