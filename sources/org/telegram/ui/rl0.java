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

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class rl0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rl0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        int i11;
        mk mkVar;
        int i12 = this.a;
        int i13 = 0;
        Object obj = this.b;
        switch (i12) {
            case 0:
                ((PasscodeActivity) ((de0) obj).n).h0();
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
                ((xm0) obj).a.finishFragment();
                break;
            case 4:
                org.telegram.ui.Components.e5.x0(((bn0) obj).e.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                break;
            case 5:
                double currentTimeMillis = System.currentTimeMillis();
                ln0 ln0Var = (ln0) ((di.p2) obj).b;
                double d = currentTimeMillis - ln0Var.G;
                ln0Var.G = currentTimeMillis;
                int i14 = (int) (ln0Var.E - d);
                ln0Var.E = i14;
                if (i14 <= 1000) {
                    ln0Var.r.setVisibility(0);
                    ln0Var.n.setVisibility(8);
                    ln0Var.r();
                    break;
                }
                break;
            case 6:
                kn0 kn0Var = (kn0) obj;
                ln0 ln0Var2 = kn0Var.a;
                int i15 = ln0Var2.y;
                mn0 mn0Var = ln0Var2.s;
                in0 in0Var = ln0Var2.n;
                if (i15 < 1000) {
                    if (mn0Var != null) {
                        mn0Var.c = 1.0f;
                        mn0Var.invalidate();
                    }
                    ln0Var2.s();
                    int i16 = ln0Var2.L;
                    if (i16 != 3) {
                        if (i16 == 2 || i16 == 4) {
                            int i17 = ln0Var2.M;
                            if (i17 != 4 && i17 != 2) {
                                if (i17 == 3) {
                                    AndroidUtilities.setWaitingForSms(false);
                                    NotificationCenter.getGlobalInstance().removeObserver(ln0Var2, NotificationCenter.didReceiveSmsCode);
                                    ln0Var2.I = false;
                                    ln0Var2.r();
                                    ln0Var2.u();
                                    break;
                                }
                            } else {
                                if (i17 == 4) {
                                    in0Var.setText(LocaleController.getString(R.string.Calling));
                                } else {
                                    in0Var.setText(LocaleController.getString(R.string.SendingSms));
                                }
                                ln0Var2.p();
                                TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                tL_auth_resendCode.phone_number = ln0Var2.a;
                                tL_auth_resendCode.phone_code_hash = ln0Var2.b;
                                i10 = ((org.telegram.ui.ActionBar.n2) ln0Var2.Q).currentAccount;
                                ConnectionsManager.getInstance(i10).sendRequest(tL_auth_resendCode, new m(kn0Var, 16), 2);
                                break;
                            }
                        }
                    } else {
                        AndroidUtilities.setWaitingForCall(false);
                        NotificationCenter.getGlobalInstance().removeObserver(ln0Var2, NotificationCenter.didReceiveCall);
                        ln0Var2.I = false;
                        ln0Var2.r();
                        ln0Var2.u();
                        break;
                    }
                } else {
                    int i18 = i15 / MediaDataController.MAX_STYLE_RUNS_COUNT;
                    int i19 = i18 / 60;
                    int i20 = i18 - (i19 * 60);
                    int i21 = ln0Var2.M;
                    if (i21 == 4 || i21 == 3) {
                        in0Var.setText(LocaleController.formatString("CallText", R.string.CallText, Integer.valueOf(i19), Integer.valueOf(i20)));
                    } else if (i21 == 2) {
                        in0Var.setText(LocaleController.formatString("SmsText", R.string.SmsText, Integer.valueOf(i19), Integer.valueOf(i20)));
                    }
                    if (mn0Var != null) {
                        mn0Var.c = 1.0f - (ln0Var2.y / ln0Var2.P);
                        mn0Var.invalidate();
                        break;
                    }
                }
                break;
            case 7:
                of.f.s(((ho0) obj).b.getParentActivity(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                break;
            case 8:
                xo0 xo0Var = ((mo0) obj).a;
                xo0Var.t0();
                xo0Var.H0(true, false);
                xo0Var.D0(false);
                break;
            case 9:
                of.f.s(((qo0) obj).b.getParentActivity(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                break;
            case 10:
                tp0 tp0Var = (tp0) obj;
                vp0 vp0Var = tp0Var.c;
                aq0 aq0Var = vp0Var.E;
                bq0 bq0Var = vp0Var.p0;
                if (aq0Var != null && vp0Var.L.size() > 1) {
                    aq0Var.a(1, true);
                    TL_stars.StarGift starGift = (TL_stars.StarGift) vp0Var.M.get(1);
                    vp0Var.K = starGift;
                    if (starGift == null) {
                        yh.t3 t3Var = vp0Var.J;
                        if (t3Var != null) {
                            t3Var.f();
                            vp0Var.J = null;
                        }
                    } else {
                        yh.t3 t3Var2 = vp0Var.J;
                        if (t3Var2 == null || t3Var2.b != starGift.id) {
                            i11 = ((org.telegram.ui.ActionBar.n2) bq0Var).currentAccount;
                            yh.t3 t3Var3 = new yh.t3(vp0Var.K.id, i11, new t3(tp0Var, 13));
                            vp0Var.J = t3Var3;
                            t3Var3.g(false);
                        }
                    }
                    vp0.a(vp0Var);
                    (bq0Var.I.getCurrentPosition() == 1 ? bq0Var.n : bq0Var.h).e();
                    break;
                }
                break;
            case 11:
                br0 br0Var = ((sq0) obj).h;
                br0Var.b0(br0Var.P.getSearchField());
                break;
            case 12:
                ((tq0) obj).z0.L.l();
                break;
            case 13:
                ((uu0) obj).invalidate();
                break;
            case 14:
                com.google.android.gms.common.api.internal.v vVar = (com.google.android.gms.common.api.internal.v) obj;
                PhotoViewer photoViewer = (PhotoViewer) vVar.d;
                long j3 = vVar.a;
                Drawable[] drawableArr = PhotoViewer.T8;
                photoViewer.t2(j3);
                if (photoViewer.c2 == 1) {
                    long j10 = vVar.a;
                    photoViewer.W7 = j10;
                    if (photoViewer.V7 != j10) {
                        photoViewer.V7 = -1L;
                    }
                }
                vVar.c = null;
                break;
            case 15:
                PhotoViewer photoViewer2 = ((dt0) obj).a;
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
                co coVar = ((ft0) obj).d1.l4;
                if (coVar != null && (mkVar = coVar.Y) != null) {
                    mkVar.H0();
                    break;
                }
                break;
            case 17:
                org.telegram.ui.Components.pk0 pk0Var = (org.telegram.ui.Components.pk0) ((gk0) obj).b;
                PhotoViewer photoViewer3 = (PhotoViewer) pk0Var.c;
                photoViewer3.H2 = false;
                org.telegram.ui.Components.g71 g71Var = photoViewer3.F2;
                if (g71Var != null) {
                    g71Var.C();
                }
                ((PhotoViewer) pk0Var.c).I2 = null;
                break;
            case 18:
                PhotoViewer photoViewer4 = ((ss0) obj).a;
                photoViewer4.H2 = false;
                org.telegram.ui.Components.g71 g71Var2 = photoViewer4.F2;
                if (g71Var2 != null) {
                    g71Var2.C();
                }
                photoViewer4.I2 = null;
                break;
            case 19:
                eu0 eu0Var = (eu0) ((gk0) obj).b;
                eu0Var.r.l7.unlock();
                PhotoViewer photoViewer5 = eu0Var.r;
                Runnable runnable = photoViewer5.p4;
                if (runnable != null) {
                    runnable.run();
                    photoViewer5.p4 = null;
                }
                photoViewer5.y2(true);
                break;
            case 20:
                PhotoViewer photoViewer6 = ((ht0) obj).b;
                Runnable runnable2 = photoViewer6.p4;
                if (runnable2 != null) {
                    runnable2.run();
                    photoViewer6.p4 = null;
                    break;
                }
                break;
            case 21:
                ((pu0) obj).s.d(true);
                break;
            case 22:
                ((tu0) obj).d = true;
                break;
            case 23:
                PremiumPreviewFragment premiumPreviewFragment = ((cx0) obj).c;
                premiumPreviewFragment.showDialog(new k41(premiumPreviewFragment.getParentActivity(), false, premiumPreviewFragment.getResourceProvider(), null));
                break;
            case 24:
                ((org.telegram.messenger.nk) obj).run(0);
                break;
            case 25:
                AndroidUtilities.addToClipboard((String) obj);
                break;
            case 26:
                ((di.f4) obj).e(true);
                break;
            case 27:
                AndroidUtilities.addToClipboard("@" + UserObject.getPublicUsername((TLRPC.User) obj));
                break;
            case 28:
                hz0 hz0Var = (hz0) obj;
                hz0Var.G.getNotificationCenter().onAnimationFinish(hz0Var.F);
                break;
            default:
                ProfileActivity profileActivity = (ProfileActivity) ((ah.w) obj).c;
                if (profileActivity.n5 != 1.0f) {
                    qz0 qz0Var = profileActivity.n0;
                    while (qz0Var.D0.k(i13) != qz0Var.getRealCount() - 1) {
                        i13++;
                    }
                    qz0Var.x(i13, true);
                    break;
                }
                break;
        }
    }
}
