package org.telegram.ui;

import android.graphics.RectF;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class tu0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tu0(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        int i10 = 0;
        Object obj = this.b;
        switch (i7) {
            case 0:
                uu0 uu0Var = (uu0) obj;
                uu0Var.G.getNotificationCenter().j(uu0Var.F);
                break;
            case 1:
                ProfileActivity profileActivity = (ProfileActivity) ((bi.x5) obj).c;
                if (profileActivity.p5 != 1.0f) {
                    cv0 cv0Var = profileActivity.n0;
                    while (cv0Var.D0.k(i10) != cv0Var.getRealCount() - 1) {
                        i10++;
                    }
                    cv0Var.x(i10, true);
                    break;
                }
                break;
            case 2:
                ProfileActivity profileActivity2 = ((tv0) obj).b;
                RectF rectF = ProfileActivity.V6;
                profileActivity2.getMessagesController().d5(profileActivity2.d1, 0, true, new fi.l9(2, profileActivity2, true));
                break;
            case 3:
                xv0 xv0Var = (xv0) obj;
                xv0Var.Z0(xv0Var.getTabProgress());
                break;
            case 4:
                ((ow0) obj).c();
                break;
            case 5:
                ((ex0) obj).a();
                break;
            case 6:
                bx0 bx0Var = (bx0) obj;
                bx0Var.f.add(bx0Var.c);
                bx0Var.a();
                break;
            case 7:
                Runnable[] runnableArr = (Runnable[]) obj;
                runnableArr[0].run();
                runnableArr[0] = null;
                break;
            case 8:
                ((di.n6) obj).e();
                break;
            case 9:
                org.telegram.ui.Components.hc hcVar = (org.telegram.ui.Components.hc) obj;
                if (LaunchActivity.T() != null) {
                    if (hcVar == null) {
                        hcVar = org.telegram.ui.Components.hc.a0(LaunchActivity.T());
                    }
                    if (hcVar != null) {
                        org.telegram.ui.Components.cc I = hcVar.I(R.raw.msg_antispam, org.telegram.messenger.id.M0(2131746222, null), org.telegram.messenger.id.M0(2131746185, null));
                        I.j = 5000;
                        I.j();
                        break;
                    }
                }
                break;
            case 10:
                ((zy0) obj).invalidate();
                break;
            case 11:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj;
                saveToGallerySettingsActivity.w.clear();
                saveToGallerySettingsActivity.getUserConfig().A(saveToGallerySettingsActivity.a, saveToGallerySettingsActivity.w);
                saveToGallerySettingsActivity.e0();
                break;
            case 12:
                org.telegram.ui.Components.n20 n20Var = (org.telegram.ui.Components.n20) obj;
                n20Var.dismiss();
                vf.c.t(n20Var.getContext(), org.telegram.messenger.id.M0(2131746618, null));
                break;
            case 13:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) ((org.telegram.ui.Components.w50) obj).c;
                Runnable runnable = secretMediaViewer.m0;
                if (runnable != null) {
                    runnable.run();
                    secretMediaViewer.m0 = null;
                    break;
                }
                break;
            case 14:
                uz0 uz0Var = ((tz0) obj).a;
                uz0Var.Q = true;
                uz0Var.N.invalidate();
                break;
            case 15:
                ((org.telegram.messenger.qs) obj).o();
                break;
            case 16:
                org.telegram.messenger.g0.V3(((k01) obj).c, true, true);
                break;
            case 17:
                org.telegram.ui.Components.m41 m41Var = ((c21) obj).a2;
                if (m41Var != null) {
                    m41Var.O(true);
                    break;
                }
                break;
            case 18:
                ((v11) obj).a();
                break;
            case 19:
                kg.f.a(((SessionsActivity) obj).currentAccount).b();
                break;
            case 20:
                d51 d51Var = (d51) obj;
                d51Var.m0.a(d51Var.j0.e0, d51Var.k0.isAttachedToWindow());
                break;
            case 21:
                ((b91) obj).J.r.f();
                break;
            case 22:
                ((j91) obj).b.G0();
                break;
            case 23:
                ((VoIPFeedbackActivity) obj).finish();
                break;
            case 24:
                ((zb1) obj).a.y();
                break;
            case 25:
                ((ac1) obj).a.y();
                break;
            case 26:
                ic1 ic1Var = ((yb1) obj).b;
                ic1Var.K0.e();
                org.telegram.ui.Components.voip.e2.d().getClass();
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().swapSinks();
                }
                ic1Var.Y.setCornerRadius(-1.0f);
                ic1Var.c0.d.release();
                ic1Var.d0.d.release();
                ic1Var.b0.release();
                ic1Var.c();
                ic1Var.t0.d();
                org.telegram.ui.Components.voip.e2.S = false;
                ic1Var.D0 = false;
                ic1.l1 = null;
                org.telegram.ui.Components.voip.f2.d();
                break;
            case 27:
                gc1 gc1Var = (gc1) obj;
                gc1Var.getClass();
                if (VoIPService.getSharedState() != null) {
                    VoIPService.getSharedState().acceptIncomingCall();
                    if (gc1Var.a.m0 && VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().requestVideoCall(false);
                        break;
                    }
                }
                break;
            case 28:
                ((VoIPPermissionActivity) obj).finish();
                break;
            default:
                ((WallpapersListActivity) obj).G0(false);
                break;
        }
    }
}
