package org.telegram.ui;

import android.graphics.RectF;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class uu0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ uu0(Object obj, int i7) {
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
                vu0 vu0Var = (vu0) obj;
                vu0Var.G.getNotificationCenter().j(vu0Var.F);
                break;
            case 1:
                ProfileActivity profileActivity = (ProfileActivity) ((bi.x5) obj).c;
                if (profileActivity.p5 != 1.0f) {
                    dv0 dv0Var = profileActivity.n0;
                    while (dv0Var.D0.k(i10) != dv0Var.getRealCount() - 1) {
                        i10++;
                    }
                    dv0Var.x(i10, true);
                    break;
                }
                break;
            case 2:
                ProfileActivity profileActivity2 = ((uv0) obj).b;
                RectF rectF = ProfileActivity.V6;
                profileActivity2.getMessagesController().d5(profileActivity2.d1, 0, true, new fi.l9(2, profileActivity2, true));
                break;
            case 3:
                yv0 yv0Var = (yv0) obj;
                yv0Var.Z0(yv0Var.getTabProgress());
                break;
            case 4:
                ((pw0) obj).c();
                break;
            case 5:
                ((fx0) obj).a();
                break;
            case 6:
                cx0 cx0Var = (cx0) obj;
                cx0Var.f.add(cx0Var.c);
                cx0Var.a();
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
                org.telegram.ui.Components.gc gcVar = (org.telegram.ui.Components.gc) obj;
                if (LaunchActivity.T() != null) {
                    if (gcVar == null) {
                        gcVar = org.telegram.ui.Components.gc.a0(LaunchActivity.T());
                    }
                    if (gcVar != null) {
                        org.telegram.ui.Components.bc I = gcVar.I(R.raw.msg_antispam, org.telegram.messenger.id.M0(2131746222, null), org.telegram.messenger.id.M0(2131746185, null));
                        I.j = 5000;
                        I.j();
                        break;
                    }
                }
                break;
            case 10:
                ((az0) obj).invalidate();
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
                vf.c.t(m20Var.getContext(), org.telegram.messenger.id.M0(2131746618, null));
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
                vz0 vz0Var = ((uz0) obj).a;
                vz0Var.Q = true;
                vz0Var.N.invalidate();
                break;
            case 15:
                ((org.telegram.messenger.qs) obj).o();
                break;
            case 16:
                org.telegram.messenger.g0.V3(((l01) obj).c, true, true);
                break;
            case 17:
                org.telegram.ui.Components.m41 m41Var = ((d21) obj).d2;
                if (m41Var != null) {
                    m41Var.O(true);
                    break;
                }
                break;
            case 18:
                ((w11) obj).a();
                break;
            case 19:
                kg.f.a(((SessionsActivity) obj).currentAccount).b();
                break;
            case 20:
                e51 e51Var = (e51) obj;
                e51Var.m0.a(e51Var.j0.e0, e51Var.k0.isAttachedToWindow());
                break;
            case 21:
                ((c91) obj).J.r.f();
                break;
            case 22:
                ((k91) obj).b.G0();
                break;
            case 23:
                ((VoIPFeedbackActivity) obj).finish();
                break;
            case 24:
                ((ac1) obj).a.y();
                break;
            case 25:
                ((bc1) obj).a.y();
                break;
            case 26:
                jc1 jc1Var = ((zb1) obj).b;
                jc1Var.K0.e();
                org.telegram.ui.Components.voip.e2.d().getClass();
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().swapSinks();
                }
                jc1Var.Y.setCornerRadius(-1.0f);
                jc1Var.c0.d.release();
                jc1Var.d0.d.release();
                jc1Var.b0.release();
                jc1Var.c();
                jc1Var.t0.d();
                org.telegram.ui.Components.voip.e2.S = false;
                jc1Var.D0 = false;
                jc1.l1 = null;
                org.telegram.ui.Components.voip.f2.d();
                break;
            case 27:
                hc1 hc1Var = (hc1) obj;
                hc1Var.getClass();
                if (VoIPService.getSharedState() != null) {
                    VoIPService.getSharedState().acceptIncomingCall();
                    if (hc1Var.a.m0 && VoIPService.getSharedInstance() != null) {
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
