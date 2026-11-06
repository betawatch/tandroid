package org.telegram.ui;

import android.graphics.RectF;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ru0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ru0(Object obj, int i7) {
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
                su0 su0Var = (su0) obj;
                su0Var.G.getNotificationCenter().j(su0Var.F);
                break;
            case 1:
                ProfileActivity profileActivity = (ProfileActivity) ((bi.x5) obj).c;
                if (profileActivity.n5 != 1.0f) {
                    av0 av0Var = profileActivity.n0;
                    while (av0Var.D0.k(i10) != av0Var.getRealCount() - 1) {
                        i10++;
                    }
                    av0Var.x(i10, true);
                    break;
                }
                break;
            case 2:
                ProfileActivity profileActivity2 = ((rv0) obj).b;
                RectF rectF = ProfileActivity.S6;
                profileActivity2.getMessagesController().d5(profileActivity2.d1, 0, true, new fi.m9(2, profileActivity2, true));
                break;
            case 3:
                vv0 vv0Var = (vv0) obj;
                vv0Var.X0(vv0Var.getTabProgress());
                break;
            case 4:
                ((mw0) obj).c();
                break;
            case 5:
                ((ax0) obj).a();
                break;
            case 6:
                xw0 xw0Var = (xw0) obj;
                xw0Var.f.add(xw0Var.c);
                xw0Var.a();
                break;
            case 7:
                Runnable[] runnableArr = (Runnable[]) obj;
                runnableArr[0].run();
                runnableArr[0] = null;
                break;
            case 8:
                ((di.m6) obj).e();
                break;
            case 9:
                org.telegram.ui.Components.hc hcVar = (org.telegram.ui.Components.hc) obj;
                if (LaunchActivity.T() != null) {
                    if (hcVar == null) {
                        hcVar = org.telegram.ui.Components.hc.a0(LaunchActivity.T());
                    }
                    if (hcVar != null) {
                        org.telegram.ui.Components.cc I = hcVar.I(R.raw.msg_antispam, org.telegram.messenger.hd.M0(2131746223, null), org.telegram.messenger.hd.M0(2131746186, null));
                        I.j = 5000;
                        I.j();
                        break;
                    }
                }
                break;
            case 10:
                ((wy0) obj).invalidate();
                break;
            case 11:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj;
                saveToGallerySettingsActivity.w.clear();
                saveToGallerySettingsActivity.getUserConfig().A(saveToGallerySettingsActivity.a, saveToGallerySettingsActivity.w);
                saveToGallerySettingsActivity.e0();
                break;
            case 12:
                org.telegram.ui.Components.m20 m20Var = (org.telegram.ui.Components.m20) obj;
                m20Var.dismiss();
                vf.c.t(m20Var.getContext(), org.telegram.messenger.hd.M0(2131746617, null));
                break;
            case 13:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) ((org.telegram.ui.Components.v50) obj).c;
                Runnable runnable = secretMediaViewer.m0;
                if (runnable != null) {
                    runnable.run();
                    secretMediaViewer.m0 = null;
                    break;
                }
                break;
            case 14:
                rz0 rz0Var = ((qz0) obj).a;
                rz0Var.Q = true;
                rz0Var.N.invalidate();
                break;
            case 15:
                ((org.telegram.messenger.qs) obj).o();
                break;
            case 16:
                org.telegram.messenger.g0.V3(((i01) obj).c, true, true);
                break;
            case 17:
                org.telegram.ui.Components.l41 l41Var = ((a21) obj).a2;
                if (l41Var != null) {
                    l41Var.O(true);
                    break;
                }
                break;
            case 18:
                ((t11) obj).a();
                break;
            case 19:
                kg.f.a(((SessionsActivity) obj).currentAccount).b();
                break;
            case 20:
                c51 c51Var = (c51) obj;
                c51Var.m0.a(c51Var.j0.e0, c51Var.k0.isAttachedToWindow());
                break;
            case 21:
                ((z81) obj).J.r.f();
                break;
            case 22:
                ((h91) obj).b.G0();
                break;
            case 23:
                ((VoIPFeedbackActivity) obj).finish();
                break;
            case 24:
                ((vb1) obj).a.y();
                break;
            case 25:
                ((wb1) obj).a.y();
                break;
            case 26:
                ec1 ec1Var = ((ub1) obj).b;
                ec1Var.K0.e();
                org.telegram.ui.Components.voip.e2.d().getClass();
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().swapSinks();
                }
                ec1Var.Y.setCornerRadius(-1.0f);
                ec1Var.c0.d.release();
                ec1Var.d0.d.release();
                ec1Var.b0.release();
                ec1Var.c();
                ec1Var.t0.d();
                org.telegram.ui.Components.voip.e2.S = false;
                ec1Var.D0 = false;
                ec1.l1 = null;
                org.telegram.ui.Components.voip.f2.d();
                break;
            case 27:
                cc1 cc1Var = (cc1) obj;
                cc1Var.getClass();
                if (VoIPService.getSharedState() != null) {
                    VoIPService.getSharedState().acceptIncomingCall();
                    if (cc1Var.a.m0 && VoIPService.getSharedInstance() != null) {
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
