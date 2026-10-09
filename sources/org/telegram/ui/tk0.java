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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tk0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tk0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        int i11;
        ok okVar;
        int i12 = this.a;
        int i13 = 16;
        Object obj = this.b;
        switch (i12) {
            case 0:
                NotificationsSettingsActivity.V((NotificationsSettingsActivity) obj);
                break;
            case 1:
                ((PasscodeActivity) ((ce0) obj).n).k0();
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
                ((vm0) obj).a.finishFragment();
                break;
            case 5:
                org.telegram.ui.Components.g5.w0(((zm0) obj).e.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                break;
            case 6:
                double currentTimeMillis = System.currentTimeMillis();
                jn0 jn0Var = (jn0) ((ci.n2) obj).b;
                double d = currentTimeMillis - jn0Var.G;
                jn0Var.G = currentTimeMillis;
                int i14 = (int) (jn0Var.E - d);
                jn0Var.E = i14;
                if (i14 <= 1000) {
                    jn0Var.r.setVisibility(0);
                    jn0Var.n.setVisibility(8);
                    jn0Var.r();
                    break;
                }
                break;
            case 7:
                in0 in0Var = (in0) obj;
                jn0 jn0Var2 = in0Var.a;
                int i15 = jn0Var2.y;
                kn0 kn0Var = jn0Var2.s;
                gn0 gn0Var = jn0Var2.n;
                if (i15 < 1000) {
                    if (kn0Var != null) {
                        kn0Var.c = 1.0f;
                        kn0Var.invalidate();
                    }
                    jn0Var2.s();
                    int i16 = jn0Var2.L;
                    if (i16 != 3) {
                        if (i16 == 2 || i16 == 4) {
                            int i17 = jn0Var2.M;
                            if (i17 != 4 && i17 != 2) {
                                if (i17 == 3) {
                                    AndroidUtilities.setWaitingForSms(false);
                                    NotificationCenter.getGlobalInstance().removeObserver(jn0Var2, NotificationCenter.didReceiveSmsCode);
                                    jn0Var2.I = false;
                                    jn0Var2.r();
                                    jn0Var2.t();
                                    break;
                                }
                            } else {
                                if (i17 == 4) {
                                    gn0Var.setText(LocaleController.getString(R.string.Calling));
                                } else {
                                    gn0Var.setText(LocaleController.getString(R.string.SendingSms));
                                }
                                jn0Var2.p();
                                TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                tL_auth_resendCode.phone_number = jn0Var2.a;
                                tL_auth_resendCode.phone_code_hash = jn0Var2.b;
                                i10 = ((org.telegram.ui.ActionBar.n2) jn0Var2.Q).currentAccount;
                                ConnectionsManager.getInstance(i10).sendRequest(tL_auth_resendCode, new m(in0Var, i13), 2);
                                break;
                            }
                        }
                    } else {
                        AndroidUtilities.setWaitingForCall(false);
                        NotificationCenter.getGlobalInstance().removeObserver(jn0Var2, NotificationCenter.didReceiveCall);
                        jn0Var2.I = false;
                        jn0Var2.r();
                        jn0Var2.t();
                        break;
                    }
                } else {
                    int i18 = i15 / MediaDataController.MAX_STYLE_RUNS_COUNT;
                    int i19 = i18 / 60;
                    int i20 = i18 - (i19 * 60);
                    int i21 = jn0Var2.M;
                    if (i21 == 4 || i21 == 3) {
                        gn0Var.setText(LocaleController.formatString("CallText", R.string.CallText, Integer.valueOf(i19), Integer.valueOf(i20)));
                    } else if (i21 == 2) {
                        gn0Var.setText(LocaleController.formatString("SmsText", R.string.SmsText, Integer.valueOf(i19), Integer.valueOf(i20)));
                    }
                    if (kn0Var != null) {
                        kn0Var.c = 1.0f - (jn0Var2.y / jn0Var2.P);
                        kn0Var.invalidate();
                        break;
                    }
                }
                break;
            case 8:
                of.f.s(((fo0) obj).b.getParentActivity(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                break;
            case 9:
                vo0 vo0Var = ((ko0) obj).a;
                vo0Var.t0();
                vo0Var.H0(true, false);
                vo0Var.D0(false);
                break;
            case 10:
                of.f.s(((oo0) obj).b.getParentActivity(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                break;
            case 11:
                sp0 sp0Var = (sp0) obj;
                up0 up0Var = sp0Var.c;
                zp0 zp0Var = up0Var.E;
                aq0 aq0Var = up0Var.p0;
                if (zp0Var != null && up0Var.L.size() > 1) {
                    zp0Var.a(1, true);
                    TL_stars.StarGift starGift = (TL_stars.StarGift) up0Var.M.get(1);
                    up0Var.K = starGift;
                    if (starGift == null) {
                        xh.v3 v3Var = up0Var.J;
                        if (v3Var != null) {
                            v3Var.f();
                            up0Var.J = null;
                        }
                    } else {
                        xh.v3 v3Var2 = up0Var.J;
                        if (v3Var2 == null || v3Var2.b != starGift.id) {
                            i11 = ((org.telegram.ui.ActionBar.n2) aq0Var).currentAccount;
                            xh.v3 v3Var3 = new xh.v3(up0Var.K.id, i11, new t3(sp0Var, i13));
                            up0Var.J = v3Var3;
                            v3Var3.g(false);
                        }
                    }
                    up0.a(up0Var);
                    (aq0Var.I.getCurrentPosition() == 1 ? aq0Var.n : aq0Var.h).e();
                    break;
                }
                break;
            case 12:
                br0 br0Var = ((sq0) obj).h;
                br0Var.b0(br0Var.P.getSearchField());
                break;
            case 13:
                ((tq0) obj).z0.L.l();
                break;
            case 14:
                ((wu0) obj).invalidate();
                break;
            case 15:
                com.google.android.gms.common.api.internal.v vVar = (com.google.android.gms.common.api.internal.v) obj;
                PhotoViewer photoViewer = (PhotoViewer) vVar.d;
                long j3 = vVar.a;
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.t2(j3);
                if (photoViewer.c2 == 1) {
                    long j10 = vVar.a;
                    photoViewer.X7 = j10;
                    if (photoViewer.W7 != j10) {
                        photoViewer.W7 = -1L;
                    }
                }
                vVar.c = null;
                break;
            case 16:
                PhotoViewer photoViewer2 = ((et0) obj).a;
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
                zn znVar = ((gt0) obj).d1.l4;
                if (znVar != null && (okVar = znVar.Y) != null) {
                    okVar.F0();
                    break;
                }
                break;
            case 18:
                org.telegram.ui.Components.ul0 ul0Var = (org.telegram.ui.Components.ul0) ((ep0) obj).b;
                PhotoViewer photoViewer3 = (PhotoViewer) ul0Var.c;
                photoViewer3.H2 = false;
                org.telegram.ui.Components.k81 k81Var = photoViewer3.F2;
                if (k81Var != null) {
                    k81Var.C();
                }
                ((PhotoViewer) ul0Var.c).I2 = null;
                break;
            case 19:
                PhotoViewer photoViewer4 = ((ts0) obj).a;
                photoViewer4.H2 = false;
                org.telegram.ui.Components.k81 k81Var2 = photoViewer4.F2;
                if (k81Var2 != null) {
                    k81Var2.C();
                }
                photoViewer4.I2 = null;
                break;
            case 20:
                gu0 gu0Var = (gu0) ((ep0) obj).b;
                gu0Var.r.l7.unlock();
                PhotoViewer photoViewer5 = gu0Var.r;
                Runnable runnable = photoViewer5.p4;
                if (runnable != null) {
                    runnable.run();
                    photoViewer5.p4 = null;
                }
                photoViewer5.y2(true);
                break;
            case 21:
                PhotoViewer photoViewer6 = ((it0) obj).b;
                Runnable runnable2 = photoViewer6.p4;
                if (runnable2 != null) {
                    runnable2.run();
                    photoViewer6.p4 = null;
                    break;
                }
                break;
            case 22:
                ((ru0) obj).x.d(true);
                break;
            case 23:
                ((vu0) obj).d = true;
                break;
            case 24:
                PremiumPreviewFragment premiumPreviewFragment = ((cx0) obj).c;
                premiumPreviewFragment.showDialog(new h41(premiumPreviewFragment.getParentActivity(), false, premiumPreviewFragment.getResourceProvider(), null));
                break;
            case 25:
                ((org.telegram.messenger.jk) obj).run(0);
                break;
            case 26:
                AndroidUtilities.addToClipboard((String) obj);
                break;
            case 27:
                ((ci.d4) obj).e(true);
                break;
            case 28:
                AndroidUtilities.addToClipboard("@" + UserObject.getPublicUsername((TLRPC.User) obj));
                break;
            default:
                fz0 fz0Var = (fz0) obj;
                fz0Var.G.getNotificationCenter().onAnimationFinish(fz0Var.F);
                break;
        }
    }
}
