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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vk0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vk0(Object obj, int i10) {
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
        org.telegram.ui.ActionBar.e6 k9;
        to0 to0Var;
        boolean z10;
        Drawable drawable;
        int i12;
        dk dkVar;
        switch (this.a) {
            case 0:
                ((PasscodeActivity) ((md0) this.b).n).h0();
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
                ((dm0) this.b).a.finishFragment();
                break;
            case 4:
                org.telegram.ui.Components.c5.x0(((hm0) this.b).e.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                break;
            case 5:
                nh.g2 g2Var = (nh.g2) this.b;
                double currentTimeMillis = System.currentTimeMillis();
                rm0 rm0Var = (rm0) g2Var.b;
                double d = currentTimeMillis - rm0Var.C;
                rm0Var.C = currentTimeMillis;
                int i13 = (int) (rm0Var.A - d);
                rm0Var.A = i13;
                if (i13 <= 1000) {
                    rm0Var.r.setVisibility(0);
                    rm0Var.n.setVisibility(8);
                    rm0Var.r();
                    break;
                }
                break;
            case 6:
                qm0 qm0Var = (qm0) this.b;
                rm0 rm0Var2 = qm0Var.a;
                int i14 = rm0Var2.y;
                sm0 sm0Var = rm0Var2.s;
                eg.r rVar = rm0Var2.n;
                if (i14 >= 1000) {
                    int i15 = i14 / MediaDataController.MAX_STYLE_RUNS_COUNT;
                    int i16 = i15 / 60;
                    int i17 = i15 - (i16 * 60);
                    int i18 = rm0Var2.I;
                    if (i18 == 4 || i18 == 3) {
                        rVar.setText(LocaleController.formatString("CallText", R.string.CallText, Integer.valueOf(i16), Integer.valueOf(i17)));
                    } else if (i18 == 2) {
                        rVar.setText(LocaleController.formatString("SmsText", R.string.SmsText, Integer.valueOf(i16), Integer.valueOf(i17)));
                    }
                    if (sm0Var != null) {
                        sm0Var.c = 1.0f - (rm0Var2.y / rm0Var2.L);
                        sm0Var.invalidate();
                        break;
                    }
                } else {
                    if (sm0Var != null) {
                        sm0Var.c = 1.0f;
                        sm0Var.invalidate();
                    }
                    rm0Var2.s();
                    int i19 = rm0Var2.H;
                    if (i19 == 3) {
                        AndroidUtilities.setWaitingForCall(false);
                        NotificationCenter.getGlobalInstance().removeObserver(rm0Var2, NotificationCenter.didReceiveCall);
                        rm0Var2.E = false;
                        rm0Var2.r();
                        rm0Var2.t();
                        break;
                    } else if (i19 == 2 || i19 == 4) {
                        int i20 = rm0Var2.I;
                        if (i20 != 4 && i20 != 2) {
                            if (i20 == 3) {
                                AndroidUtilities.setWaitingForSms(false);
                                NotificationCenter.getGlobalInstance().removeObserver(rm0Var2, NotificationCenter.didReceiveSmsCode);
                                rm0Var2.E = false;
                                rm0Var2.r();
                                rm0Var2.t();
                                break;
                            }
                        } else {
                            if (i20 == 4) {
                                rVar.setText(LocaleController.getString(R.string.Calling));
                            } else {
                                rVar.setText(LocaleController.getString(R.string.SendingSms));
                            }
                            rm0Var2.p();
                            TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                            tL_auth_resendCode.phone_number = rm0Var2.a;
                            tL_auth_resendCode.phone_code_hash = rm0Var2.b;
                            i10 = ((org.telegram.ui.ActionBar.o2) rm0Var2.M).currentAccount;
                            ConnectionsManager.getInstance(i10).sendRequest(tL_auth_resendCode, new o(qm0Var, 16), 2);
                            break;
                        }
                    }
                }
                break;
            case 7:
                ye.d.s(((mn0) this.b).b.getParentActivity(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                break;
            case 8:
                bo0 bo0Var = ((qn0) this.b).a;
                bo0Var.t0();
                bo0Var.H0(true, false);
                bo0Var.D0(false);
                break;
            case 9:
                ye.d.s(((un0) this.b).b.getParentActivity(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                break;
            case 10:
                yo0 yo0Var = (yo0) this.b;
                yo0Var.F = !yo0Var.F;
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
                        N0 = !yo0Var.F ? org.telegram.ui.ActionBar.g6.N0(str2) : org.telegram.ui.ActionBar.g6.N0(str);
                        yo0Var.s.clear();
                        strArr = new String[1];
                        String str3 = N0.d;
                        Q0 = str3 == null ? org.telegram.ui.ActionBar.g6.Q0(null, str3, strArr) : org.telegram.ui.ActionBar.g6.Q0(new File(N0.b), null, strArr);
                        iArr = org.telegram.ui.ActionBar.g6.nl;
                        if (iArr != null) {
                            for (int i21 = 0; i21 < iArr.length; i21++) {
                                yo0Var.s.put(i21, iArr[i21]);
                            }
                        }
                        for (i11 = 0; i11 < Q0.size(); i11++) {
                            yo0Var.s.put(Q0.keyAt(i11), Q0.valueAt(i11));
                        }
                        k9 = N0.k(false);
                        if (k9 != null) {
                            k9.c(Q0, yo0Var.s);
                        }
                        to0Var = yo0Var.f;
                        if (to0Var != null && to0Var.w != null) {
                            a5.j H = org.telegram.ui.ActionBar.g6.H(N0, yo0Var.s, strArr[0], 0, true);
                            org.telegram.ui.Cells.ca caVar = yo0Var.f.w;
                            drawable = (BitmapDrawable) H.b;
                            if (drawable == null) {
                                drawable = (Drawable) H.a;
                            }
                            caVar.setOverrideBackground(drawable);
                        }
                        z10 = yo0Var.F;
                        if (yo0Var.N != z10) {
                            yo0Var.N = z10;
                            org.telegram.ui.Components.xi0 xi0Var = yo0Var.G;
                            xi0Var.N(z10 ? xi0Var.e[0] : 0);
                            org.telegram.ui.Components.xi0 xi0Var2 = yo0Var.G;
                            if (xi0Var2 != null) {
                                xi0Var2.start();
                            }
                        }
                        yo0Var.z0();
                        break;
                    }
                } else {
                    str2 = string2;
                }
                str = string;
                if (!yo0Var.F) {
                }
                yo0Var.s.clear();
                strArr = new String[1];
                String str32 = N0.d;
                if (str32 == null) {
                }
                iArr = org.telegram.ui.ActionBar.g6.nl;
                if (iArr != null) {
                }
                while (i11 < Q0.size()) {
                }
                k9 = N0.k(false);
                if (k9 != null) {
                }
                to0Var = yo0Var.f;
                if (to0Var != null) {
                    a5.j H2 = org.telegram.ui.ActionBar.g6.H(N0, yo0Var.s, strArr[0], 0, true);
                    org.telegram.ui.Cells.ca caVar2 = yo0Var.f.w;
                    drawable = (BitmapDrawable) H2.b;
                    if (drawable == null) {
                    }
                    caVar2.setOverrideBackground(drawable);
                }
                z10 = yo0Var.F;
                if (yo0Var.N != z10) {
                }
                yo0Var.z0();
                break;
            case 11:
                ro0 ro0Var = (ro0) this.b;
                to0 to0Var2 = ro0Var.c;
                lo0 lo0Var = to0Var2.b;
                ih.g2 g2Var2 = null;
                int i22 = 0;
                while (true) {
                    yo0 yo0Var2 = to0Var2.f0;
                    if (i22 < lo0Var.getChildCount()) {
                        View childAt = lo0Var.getChildAt(i22);
                        if (childAt instanceof ih.g2) {
                            g2Var2 = (ih.g2) childAt;
                        }
                        i22++;
                    } else if (g2Var2 != null && to0Var2.C.size() > 1) {
                        g2Var2.b = 1;
                        g2Var2.a.invalidate();
                        TL_stars.StarGift starGift = (TL_stars.StarGift) to0Var2.D.get(1);
                        to0Var2.B = starGift;
                        if (starGift == null) {
                            ih.b5 b5Var = to0Var2.A;
                            if (b5Var != null) {
                                b5Var.f();
                                to0Var2.A = null;
                            }
                        } else {
                            ih.b5 b5Var2 = to0Var2.A;
                            if (b5Var2 == null || b5Var2.b != starGift.id) {
                                i12 = ((org.telegram.ui.ActionBar.o2) yo0Var2).currentAccount;
                                ih.b5 b5Var3 = new ih.b5(to0Var2.B.id, i12, new x3(ro0Var, 13));
                                to0Var2.A = b5Var3;
                                b5Var3.g(false);
                            }
                        }
                        to0Var2.e();
                        (yo0Var2.y.getCurrentPosition() == 1 ? yo0Var2.h : yo0Var2.f).e();
                        break;
                    }
                }
                break;
            case 12:
                zp0 zp0Var = ((rp0) this.b).h;
                zp0Var.b0(zp0Var.L.getSearchField());
                break;
            case 13:
                ((sp0) this.b).v0.H.l();
                break;
            case 14:
                ((rt0) this.b).invalidate();
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
                PhotoViewer photoViewer2 = ((as0) this.b).a;
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
                tn tnVar = ((cs0) this.b).Z0.h4;
                if (tnVar != null && (dkVar = tnVar.U) != null) {
                    dkVar.H0();
                    break;
                }
                break;
            case 18:
                org.telegram.ui.Components.ok0 ok0Var = (org.telegram.ui.Components.ok0) ((e50) this.b).b;
                PhotoViewer photoViewer3 = (PhotoViewer) ok0Var.c;
                photoViewer3.D2 = false;
                org.telegram.ui.Components.x61 x61Var = photoViewer3.B2;
                if (x61Var != null) {
                    x61Var.D();
                }
                ((PhotoViewer) ok0Var.c).E2 = null;
                break;
            case 19:
                PhotoViewer photoViewer4 = ((pr0) this.b).a;
                photoViewer4.D2 = false;
                org.telegram.ui.Components.x61 x61Var2 = photoViewer4.B2;
                if (x61Var2 != null) {
                    x61Var2.D();
                }
                photoViewer4.E2 = null;
                break;
            case 20:
                bt0 bt0Var = (bt0) ((e50) this.b).b;
                bt0Var.r.h7.unlock();
                PhotoViewer photoViewer5 = bt0Var.r;
                Runnable runnable = photoViewer5.l4;
                if (runnable != null) {
                    runnable.run();
                    photoViewer5.l4 = null;
                }
                photoViewer5.y2(true);
                break;
            case 21:
                PhotoViewer photoViewer6 = ((es0) this.b).b;
                Runnable runnable2 = photoViewer6.l4;
                if (runnable2 != null) {
                    runnable2.run();
                    photoViewer6.l4 = null;
                    break;
                }
                break;
            case 22:
                ((mt0) this.b).s.d(true);
                break;
            case 23:
                ((qt0) this.b).d = true;
                break;
            case 24:
                PremiumPreviewFragment premiumPreviewFragment = ((xv0) this.b).c;
                premiumPreviewFragment.showDialog(new d31(premiumPreviewFragment.getParentActivity(), false, premiumPreviewFragment.getResourceProvider(), null));
                break;
            case 25:
                ((org.telegram.messenger.kk) this.b).run(0);
                break;
            case 26:
                AndroidUtilities.addToClipboard((String) this.b);
                break;
            case 27:
                ((nh.t3) this.b).e(true);
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
