package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sy0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ sy0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        int i11 = 0;
        Object obj = this.b;
        switch (i10) {
            case 0:
                ProfileActivity profileActivity = (ProfileActivity) ((ah.v) obj).c;
                if (profileActivity.p5 != 1.0f) {
                    uy0 uy0Var = profileActivity.o0;
                    while (uy0Var.D0.k(i11) != uy0Var.getRealCount() - 1) {
                        i11++;
                    }
                    uy0Var.x(i11, true);
                    break;
                }
                break;
            case 1:
                ProfileActivity profileActivity2 = ((lz0) obj).b;
                profileActivity2.getMessagesController().toggleChatNoForwards(profileActivity2.f1, 0, true, new ei.ka(2, profileActivity2, true));
                break;
            case 2:
                pz0 pz0Var = (pz0) obj;
                pz0Var.O0(pz0Var.getTabProgress());
                break;
            case 3:
                ((g01) obj).c();
                break;
            case 4:
                ((v01) obj).a();
                break;
            case 5:
                s01 s01Var = (s01) obj;
                s01Var.f.add(s01Var.c);
                s01Var.a();
                break;
            case 6:
                Runnable[] runnableArr = (Runnable[]) obj;
                runnableArr[0].run();
                runnableArr[0] = null;
                break;
            case 7:
                ((ci.w6) obj).e();
                break;
            case 8:
                org.telegram.ui.Components.xc xcVar = (org.telegram.ui.Components.xc) obj;
                if (LaunchActivity.U() != null) {
                    if (xcVar == null) {
                        xcVar = org.telegram.ui.Components.xc.a0(LaunchActivity.U());
                    }
                    if (xcVar != null) {
                        org.telegram.ui.Components.qc M = xcVar.M(LocaleController.getString(R.string.ReportChatSent), LocaleController.getString(R.string.Reported2), R.raw.msg_antispam);
                        M.j = 5000;
                        M.j();
                        break;
                    }
                }
                break;
            case 9:
                ((z21) obj).invalidate();
                break;
            case 10:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj;
                saveToGallerySettingsActivity.v.clear();
                saveToGallerySettingsActivity.getUserConfig().updateSaveGalleryExceptions(saveToGallerySettingsActivity.a, saveToGallerySettingsActivity.v);
                saveToGallerySettingsActivity.Z();
                break;
            case 11:
                j31 j31Var = (j31) obj;
                j31Var.dismiss();
                pf.d.r(j31Var.getContext(), LocaleController.getString(R.string.PromoteUrl));
                break;
            case 12:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) ((org.telegram.ui.Components.ml0) obj).c;
                Runnable runnable = secretMediaViewer.o0;
                if (runnable != null) {
                    runnable.run();
                    secretMediaViewer.o0 = null;
                    break;
                }
                break;
            case 13:
                z31 z31Var = ((y31) obj).a;
                z31Var.Q = true;
                z31Var.N.invalidate();
                break;
            case 14:
                ((NotificationCenter) obj).runDelayedNotifications();
                break;
            case 15:
                AndroidUtilities.updateViewShow(((o51) obj).c, true);
                break;
            case 16:
                org.telegram.ui.Components.s61 s61Var = ((j61) obj).i0;
                if (s61Var != null) {
                    s61Var.N(true);
                    break;
                }
                break;
            case 17:
                ((c61) obj).a();
                break;
            case 18:
                ig.f.a(((SessionsActivity) obj).currentAccount).b();
                break;
            case 19:
                ((vd1) obj).J.r.l();
                break;
            case 20:
                ((de1) obj).b.C0();
                break;
            case 21:
                ((VoIPFeedbackActivity) obj).finish();
                break;
            case 22:
                ((yg1) obj).a.G();
                break;
            case 23:
                ((zg1) obj).a.G();
                break;
            case 24:
                jh1 jh1Var = ((xg1) obj).b;
                jh1Var.L0.unlock();
                org.telegram.ui.Components.voip.k2.k().getClass();
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().swapSinks();
                }
                jh1Var.Y.setCornerRadius(-1.0f);
                jh1Var.c0.d.release();
                jh1Var.d0.d.release();
                jh1Var.b0.release();
                jh1Var.k();
                jh1Var.u0.d();
                org.telegram.ui.Components.voip.k2.U = false;
                jh1Var.E0 = false;
                jh1.n1 = null;
                break;
            case 25:
                hh1 hh1Var = (hh1) obj;
                hh1Var.getClass();
                if (VoIPService.getSharedState() != null) {
                    VoIPService.getSharedState().acceptIncomingCall();
                    if (hh1Var.a.n0 && VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().requestVideoCall(false);
                        break;
                    }
                }
                break;
            case 26:
                ((VoIPPermissionActivity) obj).finish();
                break;
            default:
                int[][] iArr = WallpapersListActivity.k0;
                ((WallpapersListActivity) obj).B0(false);
                break;
        }
    }
}
