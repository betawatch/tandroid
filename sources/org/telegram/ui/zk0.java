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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zk0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zk0(Object obj, int i9) {
        this.a = i9;
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
        int i9;
        org.telegram.ui.ActionBar.e6 N0;
        String[] strArr;
        SparseIntArray Q0;
        int[] iArr;
        int i10;
        org.telegram.ui.ActionBar.d6 k10;
        uo0 uo0Var;
        boolean z10;
        Drawable drawable;
        int i11;
        ak akVar;
        switch (this.a) {
            case 0:
                ((PasscodeActivity) ((ld0) this.b).n).g0();
                break;
            case 1:
                PasskeysActivity.W((PasskeysActivity) this.b);
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
                ((fm0) this.b).a.finishFragment();
                break;
            case 4:
                org.telegram.ui.Components.y4.x0(((jm0) this.b).e.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                break;
            case 5:
                kh.j2 j2Var = (kh.j2) this.b;
                double currentTimeMillis = System.currentTimeMillis();
                sm0 sm0Var = (sm0) j2Var.b;
                double d = currentTimeMillis - sm0Var.C;
                sm0Var.C = currentTimeMillis;
                int i12 = (int) (sm0Var.A - d);
                sm0Var.A = i12;
                if (i12 <= 1000) {
                    sm0Var.r.setVisibility(0);
                    sm0Var.n.setVisibility(8);
                    sm0Var.r();
                    break;
                }
                break;
            case 6:
                rm0 rm0Var = (rm0) this.b;
                sm0 sm0Var2 = rm0Var.a;
                int i13 = sm0Var2.y;
                tm0 tm0Var = sm0Var2.s;
                nd0 nd0Var = sm0Var2.n;
                if (i13 >= 1000) {
                    int i14 = i13 / MediaDataController.MAX_STYLE_RUNS_COUNT;
                    int i15 = i14 / 60;
                    int i16 = i14 - (i15 * 60);
                    int i17 = sm0Var2.I;
                    if (i17 == 4 || i17 == 3) {
                        nd0Var.setText(LocaleController.formatString("CallText", R.string.CallText, Integer.valueOf(i15), Integer.valueOf(i16)));
                    } else if (i17 == 2) {
                        nd0Var.setText(LocaleController.formatString("SmsText", R.string.SmsText, Integer.valueOf(i15), Integer.valueOf(i16)));
                    }
                    if (tm0Var != null) {
                        tm0Var.c = 1.0f - (sm0Var2.y / sm0Var2.L);
                        tm0Var.invalidate();
                        break;
                    }
                } else {
                    if (tm0Var != null) {
                        tm0Var.c = 1.0f;
                        tm0Var.invalidate();
                    }
                    sm0Var2.s();
                    int i18 = sm0Var2.H;
                    if (i18 == 3) {
                        AndroidUtilities.setWaitingForCall(false);
                        NotificationCenter.getGlobalInstance().removeObserver(sm0Var2, NotificationCenter.didReceiveCall);
                        sm0Var2.E = false;
                        sm0Var2.r();
                        sm0Var2.t();
                        break;
                    } else if (i18 == 2 || i18 == 4) {
                        int i19 = sm0Var2.I;
                        if (i19 != 4 && i19 != 2) {
                            if (i19 == 3) {
                                AndroidUtilities.setWaitingForSms(false);
                                NotificationCenter.getGlobalInstance().removeObserver(sm0Var2, NotificationCenter.didReceiveSmsCode);
                                sm0Var2.E = false;
                                sm0Var2.r();
                                sm0Var2.t();
                                break;
                            }
                        } else {
                            if (i19 == 4) {
                                nd0Var.setText(LocaleController.getString(R.string.Calling));
                            } else {
                                nd0Var.setText(LocaleController.getString(R.string.SendingSms));
                            }
                            sm0Var2.p();
                            TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                            tL_auth_resendCode.phone_number = sm0Var2.a;
                            tL_auth_resendCode.phone_code_hash = sm0Var2.b;
                            i9 = ((org.telegram.ui.ActionBar.o2) sm0Var2.M).currentAccount;
                            ConnectionsManager.getInstance(i9).sendRequest(tL_auth_resendCode, new m(rm0Var, 16), 2);
                            break;
                        }
                    }
                }
                break;
            case 7:
                ve.e.s(((nn0) this.b).b.getParentActivity(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                break;
            case 8:
                co0 co0Var = ((rn0) this.b).a;
                co0Var.s0();
                co0Var.G0(true, false);
                co0Var.C0(false);
                break;
            case 9:
                ve.e.s(((vn0) this.b).b.getParentActivity(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                break;
            case 10:
                zo0 zo0Var = (zo0) this.b;
                zo0Var.F = !zo0Var.F;
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
                String str = "Blue";
                String string = sharedPreferences.getString("lastDayTheme", "Blue");
                if (org.telegram.ui.ActionBar.f6.N0(string) == null || org.telegram.ui.ActionBar.f6.N0(string).q()) {
                    string = "Blue";
                }
                String str2 = "Dark Blue";
                String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                if (org.telegram.ui.ActionBar.f6.N0(string2) == null || !org.telegram.ui.ActionBar.f6.N0(string2).q()) {
                    string2 = "Dark Blue";
                }
                org.telegram.ui.ActionBar.e6 e6Var = org.telegram.ui.ActionBar.f6.I;
                if (string.equals(string2)) {
                    if (e6Var.q() || string.equals("Dark Blue") || string.equals("Night")) {
                        str2 = string2;
                        N0 = !zo0Var.F ? org.telegram.ui.ActionBar.f6.N0(str2) : org.telegram.ui.ActionBar.f6.N0(str);
                        zo0Var.s.clear();
                        strArr = new String[1];
                        String str3 = N0.d;
                        Q0 = str3 == null ? org.telegram.ui.ActionBar.f6.Q0(null, str3, strArr) : org.telegram.ui.ActionBar.f6.Q0(new File(N0.b), null, strArr);
                        iArr = org.telegram.ui.ActionBar.f6.nl;
                        if (iArr != null) {
                            for (int i20 = 0; i20 < iArr.length; i20++) {
                                zo0Var.s.put(i20, iArr[i20]);
                            }
                        }
                        for (i10 = 0; i10 < Q0.size(); i10++) {
                            zo0Var.s.put(Q0.keyAt(i10), Q0.valueAt(i10));
                        }
                        k10 = N0.k(false);
                        if (k10 != null) {
                            k10.c(Q0, zo0Var.s);
                        }
                        uo0Var = zo0Var.f;
                        if (uo0Var != null && uo0Var.w != null) {
                            b3.b H = org.telegram.ui.ActionBar.f6.H(N0, zo0Var.s, strArr[0], 0, true);
                            org.telegram.ui.Cells.fa faVar = zo0Var.f.w;
                            drawable = (BitmapDrawable) H.b;
                            if (drawable == null) {
                                drawable = (Drawable) H.a;
                            }
                            faVar.setOverrideBackground(drawable);
                        }
                        z10 = zo0Var.F;
                        if (zo0Var.N != z10) {
                            zo0Var.N = z10;
                            org.telegram.ui.Components.mi0 mi0Var = zo0Var.G;
                            mi0Var.N(z10 ? mi0Var.e[0] : 0);
                            org.telegram.ui.Components.mi0 mi0Var2 = zo0Var.G;
                            if (mi0Var2 != null) {
                                mi0Var2.start();
                            }
                        }
                        zo0Var.y0();
                        break;
                    }
                } else {
                    str2 = string2;
                }
                str = string;
                if (!zo0Var.F) {
                }
                zo0Var.s.clear();
                strArr = new String[1];
                String str32 = N0.d;
                if (str32 == null) {
                }
                iArr = org.telegram.ui.ActionBar.f6.nl;
                if (iArr != null) {
                }
                while (i10 < Q0.size()) {
                }
                k10 = N0.k(false);
                if (k10 != null) {
                }
                uo0Var = zo0Var.f;
                if (uo0Var != null) {
                    b3.b H2 = org.telegram.ui.ActionBar.f6.H(N0, zo0Var.s, strArr[0], 0, true);
                    org.telegram.ui.Cells.fa faVar2 = zo0Var.f.w;
                    drawable = (BitmapDrawable) H2.b;
                    if (drawable == null) {
                    }
                    faVar2.setOverrideBackground(drawable);
                }
                z10 = zo0Var.F;
                if (zo0Var.N != z10) {
                }
                zo0Var.y0();
                break;
            case 11:
                so0 so0Var = (so0) this.b;
                uo0 uo0Var2 = so0Var.c;
                mo0 mo0Var = uo0Var2.b;
                fh.o2 o2Var = null;
                int i21 = 0;
                while (true) {
                    zo0 zo0Var2 = uo0Var2.f0;
                    if (i21 < mo0Var.getChildCount()) {
                        View childAt = mo0Var.getChildAt(i21);
                        if (childAt instanceof fh.o2) {
                            o2Var = (fh.o2) childAt;
                        }
                        i21++;
                    } else if (o2Var != null && uo0Var2.C.size() > 1) {
                        o2Var.b = 1;
                        o2Var.a.invalidate();
                        TL_stars.StarGift starGift = (TL_stars.StarGift) uo0Var2.D.get(1);
                        uo0Var2.B = starGift;
                        if (starGift == null) {
                            fh.p5 p5Var = uo0Var2.A;
                            if (p5Var != null) {
                                p5Var.f();
                                uo0Var2.A = null;
                            }
                        } else {
                            fh.p5 p5Var2 = uo0Var2.A;
                            if (p5Var2 == null || p5Var2.b != starGift.id) {
                                i11 = ((org.telegram.ui.ActionBar.o2) zo0Var2).currentAccount;
                                fh.p5 p5Var3 = new fh.p5(uo0Var2.B.id, i11, new w3(so0Var, 13));
                                uo0Var2.A = p5Var3;
                                p5Var3.g(false);
                            }
                        }
                        uo0Var2.e();
                        (zo0Var2.y.getCurrentPosition() == 1 ? zo0Var2.h : zo0Var2.f).e();
                        break;
                    }
                }
                break;
            case 12:
                zp0 zp0Var = ((rp0) this.b).h;
                zp0Var.a0(zp0Var.L.getSearchField());
                break;
            case 13:
                ((sp0) this.b).v0.H.l();
                break;
            case 14:
                ((tt0) this.b).invalidate();
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
                PhotoViewer photoViewer2 = ((bs0) this.b).a;
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
                qn qnVar = ((ds0) this.b).Z0.h4;
                if (qnVar != null && (akVar = qnVar.U) != null) {
                    akVar.G0();
                    break;
                }
                break;
            case 18:
                org.telegram.ui.Components.su0 su0Var = (org.telegram.ui.Components.su0) ((bc0) this.b).b;
                PhotoViewer photoViewer3 = (PhotoViewer) su0Var.c;
                photoViewer3.D2 = false;
                org.telegram.ui.Components.k61 k61Var = photoViewer3.B2;
                if (k61Var != null) {
                    k61Var.D();
                }
                ((PhotoViewer) su0Var.c).E2 = null;
                break;
            case 19:
                PhotoViewer photoViewer4 = ((qr0) this.b).a;
                photoViewer4.D2 = false;
                org.telegram.ui.Components.k61 k61Var2 = photoViewer4.B2;
                if (k61Var2 != null) {
                    k61Var2.D();
                }
                photoViewer4.E2 = null;
                break;
            case 20:
                dt0 dt0Var = (dt0) ((bc0) this.b).b;
                dt0Var.r.h7.unlock();
                PhotoViewer photoViewer5 = dt0Var.r;
                Runnable runnable = photoViewer5.l4;
                if (runnable != null) {
                    runnable.run();
                    photoViewer5.l4 = null;
                }
                photoViewer5.y2(true);
                break;
            case 21:
                PhotoViewer photoViewer6 = ((fs0) this.b).b;
                Runnable runnable2 = photoViewer6.l4;
                if (runnable2 != null) {
                    runnable2.run();
                    photoViewer6.l4 = null;
                    break;
                }
                break;
            case 22:
                ((ot0) this.b).s.d(true);
                break;
            case 23:
                ((st0) this.b).d = true;
                break;
            case 24:
                PremiumPreviewFragment premiumPreviewFragment = ((yv0) this.b).c;
                premiumPreviewFragment.showDialog(new d31(premiumPreviewFragment.getParentActivity(), false, premiumPreviewFragment.getResourceProvider(), null));
                break;
            case 25:
                ((org.telegram.messenger.dk) this.b).run(0);
                break;
            case 26:
                AndroidUtilities.addToClipboard((String) this.b);
                break;
            case 27:
                ((kh.x3) this.b).e(true);
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
