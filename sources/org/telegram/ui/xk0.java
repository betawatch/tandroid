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

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xk0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xk0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        int i11;
        sk skVar;
        int i12 = this.a;
        int i13 = 16;
        Object obj = this.b;
        switch (i12) {
            case 0:
                NotificationsSettingsActivity.V((NotificationsSettingsActivity) obj);
                break;
            case 1:
                ((PasscodeActivity) ((ge0) obj).n).k0();
                break;
            case 2:
                PasskeysActivity.X((PasskeysActivity) obj);
                break;
            case 3:
                TLObject tLObject = (TLObject) obj;
                if (!(tLObject instanceof TLRPC.TL_help_passportConfig)) {
                    SharedConfig.getCountryLangs();
                    break;
                } else {
                    TLRPC.TL_help_passportConfig tL_help_passportConfig = (TLRPC.TL_help_passportConfig) tLObject;
                    SharedConfig.setPassportConfig(tL_help_passportConfig.countries_langs.data, tL_help_passportConfig.hash);
                    break;
                }
            case 4:
                ((an0) obj).a.finishFragment();
                break;
            case 5:
                org.telegram.ui.Components.g5.w0(((en0) obj).e.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                break;
            case 6:
                double currentTimeMillis = System.currentTimeMillis();
                on0 on0Var = (on0) ((di.n2) obj).b;
                double d = currentTimeMillis - on0Var.G;
                on0Var.G = currentTimeMillis;
                int i14 = (int) (on0Var.E - d);
                on0Var.E = i14;
                if (i14 <= 1000) {
                    on0Var.r.setVisibility(0);
                    on0Var.n.setVisibility(8);
                    on0Var.r();
                    break;
                }
                break;
            case 7:
                nn0 nn0Var = (nn0) obj;
                on0 on0Var2 = nn0Var.a;
                int i15 = on0Var2.y;
                pn0 pn0Var = on0Var2.s;
                ln0 ln0Var = on0Var2.n;
                if (i15 < 1000) {
                    if (pn0Var != null) {
                        pn0Var.c = 1.0f;
                        pn0Var.invalidate();
                    }
                    on0Var2.s();
                    int i16 = on0Var2.L;
                    if (i16 != 3) {
                        if (i16 == 2 || i16 == 4) {
                            int i17 = on0Var2.M;
                            if (i17 != 4 && i17 != 2) {
                                if (i17 == 3) {
                                    AndroidUtilities.setWaitingForSms(false);
                                    NotificationCenter.getGlobalInstance().removeObserver(on0Var2, NotificationCenter.didReceiveSmsCode);
                                    on0Var2.I = false;
                                    on0Var2.r();
                                    on0Var2.t();
                                    break;
                                }
                            } else {
                                if (i17 == 4) {
                                    ln0Var.setText(LocaleController.getString(R.string.Calling));
                                } else {
                                    ln0Var.setText(LocaleController.getString(R.string.SendingSms));
                                }
                                on0Var2.p();
                                TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                tL_auth_resendCode.phone_number = on0Var2.a;
                                tL_auth_resendCode.phone_code_hash = on0Var2.b;
                                i10 = ((org.telegram.ui.ActionBar.m2) on0Var2.Q).currentAccount;
                                ConnectionsManager.getInstance(i10).sendRequest(tL_auth_resendCode, new m(nn0Var, i13), 2);
                                break;
                            }
                        }
                    } else {
                        AndroidUtilities.setWaitingForCall(false);
                        NotificationCenter.getGlobalInstance().removeObserver(on0Var2, NotificationCenter.didReceiveCall);
                        on0Var2.I = false;
                        on0Var2.r();
                        on0Var2.t();
                        break;
                    }
                } else {
                    int i18 = i15 / MediaDataController.MAX_STYLE_RUNS_COUNT;
                    int i19 = i18 / 60;
                    int i20 = i18 - (i19 * 60);
                    int i21 = on0Var2.M;
                    if (i21 == 4 || i21 == 3) {
                        ln0Var.setText(LocaleController.formatString("CallText", R.string.CallText, Integer.valueOf(i19), Integer.valueOf(i20)));
                    } else if (i21 == 2) {
                        ln0Var.setText(LocaleController.formatString("SmsText", R.string.SmsText, Integer.valueOf(i19), Integer.valueOf(i20)));
                    }
                    if (pn0Var != null) {
                        pn0Var.c = 1.0f - (on0Var2.y / on0Var2.P);
                        pn0Var.invalidate();
                        break;
                    }
                }
                break;
            case 8:
                pf.d.r(((ko0) obj).b.getParentActivity(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                break;
            case 9:
                ap0 ap0Var = ((po0) obj).a;
                ap0Var.t0();
                ap0Var.H0(true, false);
                ap0Var.D0(false);
                break;
            case 10:
                pf.d.r(((to0) obj).b.getParentActivity(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                break;
            case 11:
                wp0 wp0Var = (wp0) obj;
                yp0 yp0Var = wp0Var.c;
                dq0 dq0Var = yp0Var.E;
                eq0 eq0Var = yp0Var.p0;
                if (dq0Var != null && yp0Var.L.size() > 1) {
                    dq0Var.a(1, true);
                    TL_stars.StarGift starGift = (TL_stars.StarGift) yp0Var.M.get(1);
                    yp0Var.K = starGift;
                    if (starGift == null) {
                        yh.t3 t3Var = yp0Var.J;
                        if (t3Var != null) {
                            t3Var.f();
                            yp0Var.J = null;
                        }
                    } else {
                        yh.t3 t3Var2 = yp0Var.J;
                        if (t3Var2 == null || t3Var2.b != starGift.id) {
                            i11 = ((org.telegram.ui.ActionBar.m2) eq0Var).currentAccount;
                            yh.t3 t3Var3 = new yh.t3(yp0Var.K.id, i11, new v3(wp0Var, i13));
                            yp0Var.J = t3Var3;
                            t3Var3.g(false);
                        }
                    }
                    yp0.a(yp0Var);
                    (eq0Var.I.getCurrentPosition() == 1 ? eq0Var.n : eq0Var.h).e();
                    break;
                }
                break;
            case 12:
                fr0 fr0Var = ((wq0) obj).h;
                fr0Var.b0(fr0Var.P.getSearchField());
                break;
            case 13:
                ((xq0) obj).z0.L.l();
                break;
            case 14:
                ((bv0) obj).invalidate();
                break;
            case 15:
                com.google.android.gms.common.api.internal.v vVar = (com.google.android.gms.common.api.internal.v) obj;
                PhotoViewer photoViewer = (PhotoViewer) vVar.d;
                long j10 = vVar.a;
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.t2(j10);
                if (photoViewer.c2 == 1) {
                    long j11 = vVar.a;
                    photoViewer.X7 = j11;
                    if (photoViewer.W7 != j11) {
                        photoViewer.W7 = -1L;
                    }
                }
                vVar.c = null;
                break;
            case 16:
                PhotoViewer photoViewer2 = ((kt0) obj).a;
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
            case 17:
                fo foVar = ((mt0) obj).d1.l4;
                if (foVar != null && (skVar = foVar.Y) != null) {
                    skVar.F0();
                    break;
                }
                break;
            case 18:
                org.telegram.ui.Components.ql0 ql0Var = (org.telegram.ui.Components.ql0) ((kj0) obj).b;
                PhotoViewer photoViewer3 = (PhotoViewer) ql0Var.c;
                photoViewer3.H2 = false;
                org.telegram.ui.Components.i81 i81Var = photoViewer3.F2;
                if (i81Var != null) {
                    i81Var.C();
                }
                ((PhotoViewer) ql0Var.c).I2 = null;
                break;
            case 19:
                PhotoViewer photoViewer4 = ((zs0) obj).a;
                photoViewer4.H2 = false;
                org.telegram.ui.Components.i81 i81Var2 = photoViewer4.F2;
                if (i81Var2 != null) {
                    i81Var2.C();
                }
                photoViewer4.I2 = null;
                break;
            case 20:
                lu0 lu0Var = (lu0) ((kj0) obj).b;
                lu0Var.r.l7.unlock();
                PhotoViewer photoViewer5 = lu0Var.r;
                Runnable runnable = photoViewer5.p4;
                if (runnable != null) {
                    runnable.run();
                    photoViewer5.p4 = null;
                }
                photoViewer5.y2(true);
                break;
            case 21:
                PhotoViewer photoViewer6 = ((ot0) obj).b;
                Runnable runnable2 = photoViewer6.p4;
                if (runnable2 != null) {
                    runnable2.run();
                    photoViewer6.p4 = null;
                    break;
                }
                break;
            case 22:
                ((wu0) obj).x.d(true);
                break;
            case 23:
                ((av0) obj).d = true;
                break;
            case 24:
                PremiumPreviewFragment premiumPreviewFragment = ((ix0) obj).c;
                premiumPreviewFragment.showDialog(new n41(premiumPreviewFragment.getParentActivity(), false, premiumPreviewFragment.getResourceProvider(), null));
                break;
            case 25:
                ((org.telegram.messenger.mk) obj).run(0);
                break;
            case 26:
                AndroidUtilities.addToClipboard((String) obj);
                break;
            case 27:
                ((di.d4) obj).e(true);
                break;
            case 28:
                AndroidUtilities.addToClipboard("@" + UserObject.getPublicUsername((TLRPC.User) obj));
                break;
            default:
                lz0 lz0Var = (lz0) obj;
                lz0Var.G.getNotificationCenter().onAnimationFinish(lz0Var.F);
                break;
        }
    }
}
