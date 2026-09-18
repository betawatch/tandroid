package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
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

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sl0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ sl0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        int i11;
        nk nkVar;
        int i12 = this.a;
        int i13 = 0;
        Object obj = this.b;
        switch (i12) {
            case 0:
                ((PasscodeActivity) ((fe0) obj).n).h0();
                break;
            case 1:
                PasskeysActivity.X((PasskeysActivity) obj);
                break;
            case 2:
                TLObject tLObject = (TLObject) obj;
                if (!(tLObject instanceof TLRPC.TL_help_passportConfig)) {
                    SharedConfig.getCountryLangs();
                    break;
                } else {
                    TLRPC.TL_help_passportConfig tL_help_passportConfig = (TLRPC.TL_help_passportConfig) tLObject;
                    SharedConfig.setPassportConfig(tL_help_passportConfig.countries_langs.data, tL_help_passportConfig.hash);
                    break;
                }
            case 3:
                ((ym0) obj).a.finishFragment();
                break;
            case 4:
                org.telegram.ui.Components.c5.x0(((cn0) obj).e.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                break;
            case 5:
                double currentTimeMillis = System.currentTimeMillis();
                mn0 mn0Var = (mn0) ((ci.p2) obj).b;
                double d = currentTimeMillis - mn0Var.G;
                mn0Var.G = currentTimeMillis;
                int i14 = (int) (mn0Var.E - d);
                mn0Var.E = i14;
                if (i14 <= 1000) {
                    mn0Var.r.setVisibility(0);
                    mn0Var.n.setVisibility(8);
                    mn0Var.r();
                    break;
                }
                break;
            case 6:
                ln0 ln0Var = (ln0) obj;
                mn0 mn0Var2 = ln0Var.a;
                int i15 = mn0Var2.y;
                nn0 nn0Var = mn0Var2.s;
                jn0 jn0Var = mn0Var2.n;
                if (i15 < 1000) {
                    if (nn0Var != null) {
                        nn0Var.c = 1.0f;
                        nn0Var.invalidate();
                    }
                    mn0Var2.s();
                    int i16 = mn0Var2.L;
                    if (i16 != 3) {
                        if (i16 == 2 || i16 == 4) {
                            int i17 = mn0Var2.M;
                            if (i17 != 4 && i17 != 2) {
                                if (i17 == 3) {
                                    AndroidUtilities.setWaitingForSms(false);
                                    NotificationCenter.getGlobalInstance().removeObserver(mn0Var2, NotificationCenter.didReceiveSmsCode);
                                    mn0Var2.I = false;
                                    mn0Var2.r();
                                    mn0Var2.u();
                                    break;
                                }
                            } else {
                                if (i17 == 4) {
                                    jn0Var.setText(LocaleController.getString(R.string.Calling));
                                } else {
                                    jn0Var.setText(LocaleController.getString(R.string.SendingSms));
                                }
                                mn0Var2.p();
                                TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                tL_auth_resendCode.phone_number = mn0Var2.a;
                                tL_auth_resendCode.phone_code_hash = mn0Var2.b;
                                i10 = ((org.telegram.ui.ActionBar.o2) mn0Var2.Q).currentAccount;
                                ConnectionsManager.getInstance(i10).sendRequest(tL_auth_resendCode, new m(ln0Var, 16), 2);
                                break;
                            }
                        }
                    } else {
                        AndroidUtilities.setWaitingForCall(false);
                        NotificationCenter.getGlobalInstance().removeObserver(mn0Var2, NotificationCenter.didReceiveCall);
                        mn0Var2.I = false;
                        mn0Var2.r();
                        mn0Var2.u();
                        break;
                    }
                } else {
                    int i18 = i15 / MediaDataController.MAX_STYLE_RUNS_COUNT;
                    int i19 = i18 / 60;
                    int i20 = i18 - (i19 * 60);
                    int i21 = mn0Var2.M;
                    if (i21 == 4 || i21 == 3) {
                        jn0Var.setText(LocaleController.formatString("CallText", R.string.CallText, Integer.valueOf(i19), Integer.valueOf(i20)));
                    } else if (i21 == 2) {
                        jn0Var.setText(LocaleController.formatString("SmsText", R.string.SmsText, Integer.valueOf(i19), Integer.valueOf(i20)));
                    }
                    if (nn0Var != null) {
                        nn0Var.c = 1.0f - (mn0Var2.y / mn0Var2.P);
                        nn0Var.invalidate();
                        break;
                    }
                }
                break;
            case 7:
                nf.f.s(((io0) obj).b.getParentActivity(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                break;
            case 8:
                yo0 yo0Var = ((no0) obj).a;
                yo0Var.t0();
                yo0Var.H0(true, false);
                yo0Var.D0(false);
                break;
            case 9:
                nf.f.s(((ro0) obj).b.getParentActivity(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                break;
            case 10:
                up0 up0Var = (up0) obj;
                wp0 wp0Var = up0Var.c;
                bq0 bq0Var = wp0Var.E;
                cq0 cq0Var = wp0Var.p0;
                if (bq0Var != null && wp0Var.L.size() > 1) {
                    bq0Var.a(1, true);
                    TL_stars.StarGift starGift = (TL_stars.StarGift) wp0Var.M.get(1);
                    wp0Var.K = starGift;
                    if (starGift == null) {
                        xh.u3 u3Var = wp0Var.J;
                        if (u3Var != null) {
                            u3Var.f();
                            wp0Var.J = null;
                        }
                    } else {
                        xh.u3 u3Var2 = wp0Var.J;
                        if (u3Var2 == null || u3Var2.b != starGift.id) {
                            i11 = ((org.telegram.ui.ActionBar.o2) cq0Var).currentAccount;
                            xh.u3 u3Var3 = new xh.u3(wp0Var.K.id, i11, new s3(up0Var, 13));
                            wp0Var.J = u3Var3;
                            u3Var3.g(false);
                        }
                    }
                    wp0.a(wp0Var);
                    (cq0Var.I.getCurrentPosition() == 1 ? cq0Var.n : cq0Var.h).e();
                    break;
                }
                break;
            case 11:
                cr0 cr0Var = ((tq0) obj).h;
                cr0Var.b0(cr0Var.P.getSearchField());
                break;
            case 12:
                ((uq0) obj).z0.L.l();
                break;
            case 13:
                ((xu0) obj).invalidate();
                break;
            case 14:
                com.google.android.gms.common.api.internal.v vVar = (com.google.android.gms.common.api.internal.v) obj;
                PhotoViewer photoViewer = (PhotoViewer) vVar.d;
                long j3 = vVar.a;
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.s2(j3);
                if (photoViewer.c2 == 1) {
                    long j10 = vVar.a;
                    photoViewer.X7 = j10;
                    if (photoViewer.W7 != j10) {
                        photoViewer.W7 = -1L;
                    }
                }
                vVar.c = null;
                break;
            case 15:
                PhotoViewer photoViewer2 = ((gt0) obj).a;
                ImageView imageView = photoViewer2.E3;
                if (imageView != null && imageView.getParent() != null) {
                    ((ViewGroup) photoViewer2.E3.getParent()).removeView(photoViewer2.E3);
                    if (photoViewer2.D3 != null) {
                        ImageView imageView2 = photoViewer2.E3;
                        if (imageView2 != null) {
                            imageView2.setBackground(null);
                        }
                        AndroidUtilities.recycleBitmap(photoViewer2.D3);
                        photoViewer2.D3 = null;
                    }
                    photoViewer2.E3 = null;
                    break;
                }
                break;
            case 16:
                bo boVar = ((it0) obj).d1.l4;
                if (boVar != null && (nkVar = boVar.Y) != null) {
                    nkVar.I0();
                    break;
                }
                break;
            case 17:
                org.telegram.ui.Components.qk0 qk0Var = (org.telegram.ui.Components.qk0) ((er0) obj).b;
                PhotoViewer photoViewer3 = (PhotoViewer) qk0Var.c;
                photoViewer3.H2 = false;
                org.telegram.ui.Components.h71 h71Var = photoViewer3.F2;
                if (h71Var != null) {
                    h71Var.C();
                }
                ((PhotoViewer) qk0Var.c).I2 = null;
                break;
            case 18:
                PhotoViewer photoViewer4 = ((vs0) obj).a;
                photoViewer4.H2 = false;
                org.telegram.ui.Components.h71 h71Var2 = photoViewer4.F2;
                if (h71Var2 != null) {
                    h71Var2.C();
                }
                photoViewer4.I2 = null;
                break;
            case 19:
                hu0 hu0Var = (hu0) ((er0) obj).b;
                hu0Var.r.l7.unlock();
                PhotoViewer photoViewer5 = hu0Var.r;
                Runnable runnable = photoViewer5.p4;
                if (runnable != null) {
                    runnable.run();
                    photoViewer5.p4 = null;
                }
                photoViewer5.x2(true);
                break;
            case 20:
                PhotoViewer photoViewer6 = ((kt0) obj).b;
                Runnable runnable2 = photoViewer6.p4;
                if (runnable2 != null) {
                    runnable2.run();
                    photoViewer6.p4 = null;
                    break;
                }
                break;
            case 21:
                ((su0) obj).s.d(true);
                break;
            case 22:
                ((wu0) obj).d = true;
                break;
            case 23:
                PremiumPreviewFragment premiumPreviewFragment = ((ex0) obj).c;
                premiumPreviewFragment.showDialog(new j41(premiumPreviewFragment.getParentActivity(), false, premiumPreviewFragment.getResourceProvider(), null));
                break;
            case 24:
                ((org.telegram.messenger.nk) obj).run(0);
                break;
            case 25:
                AndroidUtilities.addToClipboard((String) obj);
                break;
            case 26:
                ((ci.f4) obj).e(true);
                break;
            case 27:
                AndroidUtilities.addToClipboard("@" + UserObject.getPublicUsername((TLRPC.User) obj));
                break;
            case 28:
                iz0 iz0Var = (iz0) obj;
                iz0Var.G.getNotificationCenter().onAnimationFinish(iz0Var.F);
                break;
            default:
                ProfileActivity profileActivity = (ProfileActivity) ((ci.n6) obj).c;
                if (profileActivity.n5 != 1.0f) {
                    rz0 rz0Var = profileActivity.n0;
                    while (rz0Var.D0.k(i13) != rz0Var.getRealCount() - 1) {
                        i13++;
                    }
                    rz0Var.x(i13, true);
                    break;
                }
                break;
        }
    }
}
