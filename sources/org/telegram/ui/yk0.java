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

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class yk0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yk0(Object obj, int i10) {
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
                ((PasscodeActivity) ((ie0) obj).n).k0();
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
                ((bn0) obj).a.finishFragment();
                break;
            case 5:
                org.telegram.ui.Components.g5.w0(((fn0) obj).e.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                break;
            case 6:
                double currentTimeMillis = System.currentTimeMillis();
                qn0 qn0Var = (qn0) ((di.n2) obj).b;
                double d = currentTimeMillis - qn0Var.G;
                qn0Var.G = currentTimeMillis;
                int i14 = (int) (qn0Var.E - d);
                qn0Var.E = i14;
                if (i14 <= 1000) {
                    qn0Var.r.setVisibility(0);
                    qn0Var.n.setVisibility(8);
                    qn0Var.r();
                    break;
                }
                break;
            case 7:
                pn0 pn0Var = (pn0) obj;
                qn0 qn0Var2 = pn0Var.a;
                int i15 = qn0Var2.y;
                rn0 rn0Var = qn0Var2.s;
                mn0 mn0Var = qn0Var2.n;
                if (i15 < 1000) {
                    if (rn0Var != null) {
                        rn0Var.c = 1.0f;
                        rn0Var.invalidate();
                    }
                    qn0Var2.s();
                    int i16 = qn0Var2.L;
                    if (i16 != 3) {
                        if (i16 == 2 || i16 == 4) {
                            int i17 = qn0Var2.M;
                            if (i17 != 4 && i17 != 2) {
                                if (i17 == 3) {
                                    AndroidUtilities.setWaitingForSms(false);
                                    NotificationCenter.getGlobalInstance().removeObserver(qn0Var2, NotificationCenter.didReceiveSmsCode);
                                    qn0Var2.I = false;
                                    qn0Var2.r();
                                    qn0Var2.t();
                                    break;
                                }
                            } else {
                                if (i17 == 4) {
                                    mn0Var.setText(LocaleController.getString(R.string.Calling));
                                } else {
                                    mn0Var.setText(LocaleController.getString(R.string.SendingSms));
                                }
                                qn0Var2.p();
                                TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                tL_auth_resendCode.phone_number = qn0Var2.a;
                                tL_auth_resendCode.phone_code_hash = qn0Var2.b;
                                i10 = ((org.telegram.ui.ActionBar.m2) qn0Var2.Q).currentAccount;
                                ConnectionsManager.getInstance(i10).sendRequest(tL_auth_resendCode, new m(pn0Var, i13), 2);
                                break;
                            }
                        }
                    } else {
                        AndroidUtilities.setWaitingForCall(false);
                        NotificationCenter.getGlobalInstance().removeObserver(qn0Var2, NotificationCenter.didReceiveCall);
                        qn0Var2.I = false;
                        qn0Var2.r();
                        qn0Var2.t();
                        break;
                    }
                } else {
                    int i18 = i15 / MediaDataController.MAX_STYLE_RUNS_COUNT;
                    int i19 = i18 / 60;
                    int i20 = i18 - (i19 * 60);
                    int i21 = qn0Var2.M;
                    if (i21 == 4 || i21 == 3) {
                        mn0Var.setText(LocaleController.formatString("CallText", R.string.CallText, Integer.valueOf(i19), Integer.valueOf(i20)));
                    } else if (i21 == 2) {
                        mn0Var.setText(LocaleController.formatString("SmsText", R.string.SmsText, Integer.valueOf(i19), Integer.valueOf(i20)));
                    }
                    if (rn0Var != null) {
                        rn0Var.c = 1.0f - (qn0Var2.y / qn0Var2.P);
                        rn0Var.invalidate();
                        break;
                    }
                }
                break;
            case 8:
                pf.d.s(((mo0) obj).b.getParentActivity(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                break;
            case 9:
                cp0 cp0Var = ((ro0) obj).a;
                cp0Var.t0();
                cp0Var.H0(true, false);
                cp0Var.D0(false);
                break;
            case 10:
                pf.d.s(((vo0) obj).b.getParentActivity(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                break;
            case 11:
                yp0 yp0Var = (yp0) obj;
                aq0 aq0Var = yp0Var.c;
                fq0 fq0Var = aq0Var.E;
                gq0 gq0Var = aq0Var.p0;
                if (fq0Var != null && aq0Var.L.size() > 1) {
                    fq0Var.a(1, true);
                    TL_stars.StarGift starGift = (TL_stars.StarGift) aq0Var.M.get(1);
                    aq0Var.K = starGift;
                    if (starGift == null) {
                        yh.t3 t3Var = aq0Var.J;
                        if (t3Var != null) {
                            t3Var.f();
                            aq0Var.J = null;
                        }
                    } else {
                        yh.t3 t3Var2 = aq0Var.J;
                        if (t3Var2 == null || t3Var2.b != starGift.id) {
                            i11 = ((org.telegram.ui.ActionBar.m2) gq0Var).currentAccount;
                            yh.t3 t3Var3 = new yh.t3(aq0Var.K.id, i11, new v3(yp0Var, i13));
                            aq0Var.J = t3Var3;
                            t3Var3.g(false);
                        }
                    }
                    aq0.a(aq0Var);
                    (gq0Var.I.getCurrentPosition() == 1 ? gq0Var.n : gq0Var.h).e();
                    break;
                }
                break;
            case 12:
                hr0 hr0Var = ((yq0) obj).h;
                hr0Var.b0(hr0Var.P.getSearchField());
                break;
            case 13:
                ((zq0) obj).z0.L.l();
                break;
            case 14:
                ((cv0) obj).invalidate();
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
                PhotoViewer photoViewer2 = ((lt0) obj).a;
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
                fo foVar = ((nt0) obj).d1.l4;
                if (foVar != null && (skVar = foVar.Y) != null) {
                    skVar.F0();
                    break;
                }
                break;
            case 18:
                org.telegram.ui.Components.ql0 ql0Var = (org.telegram.ui.Components.ql0) ((lj0) obj).b;
                PhotoViewer photoViewer3 = (PhotoViewer) ql0Var.c;
                photoViewer3.H2 = false;
                org.telegram.ui.Components.h81 h81Var = photoViewer3.F2;
                if (h81Var != null) {
                    h81Var.C();
                }
                ((PhotoViewer) ql0Var.c).I2 = null;
                break;
            case 19:
                PhotoViewer photoViewer4 = ((at0) obj).a;
                photoViewer4.H2 = false;
                org.telegram.ui.Components.h81 h81Var2 = photoViewer4.F2;
                if (h81Var2 != null) {
                    h81Var2.C();
                }
                photoViewer4.I2 = null;
                break;
            case 20:
                mu0 mu0Var = (mu0) ((lj0) obj).b;
                mu0Var.r.l7.unlock();
                PhotoViewer photoViewer5 = mu0Var.r;
                Runnable runnable = photoViewer5.p4;
                if (runnable != null) {
                    runnable.run();
                    photoViewer5.p4 = null;
                }
                photoViewer5.y2(true);
                break;
            case 21:
                PhotoViewer photoViewer6 = ((pt0) obj).b;
                Runnable runnable2 = photoViewer6.p4;
                if (runnable2 != null) {
                    runnable2.run();
                    photoViewer6.p4 = null;
                    break;
                }
                break;
            case 22:
                ((xu0) obj).x.d(true);
                break;
            case 23:
                ((bv0) obj).d = true;
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
                mz0 mz0Var = (mz0) obj;
                mz0Var.G.getNotificationCenter().onAnimationFinish(mz0Var.F);
                break;
        }
    }
}
