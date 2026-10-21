package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qy0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qy0(Object obj, int i10) {
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
                    sy0 sy0Var = profileActivity.o0;
                    while (sy0Var.D0.k(i11) != sy0Var.getRealCount() - 1) {
                        i11++;
                    }
                    sy0Var.x(i11, true);
                    break;
                }
                break;
            case 1:
                ProfileActivity profileActivity2 = ((jz0) obj).b;
                profileActivity2.getMessagesController().toggleChatNoForwards(profileActivity2.f1, 0, true, new ei.ka(2, profileActivity2, true));
                break;
            case 2:
                nz0 nz0Var = (nz0) obj;
                nz0Var.O0(nz0Var.getTabProgress());
                break;
            case 3:
                ((e01) obj).c();
                break;
            case 4:
                ((t01) obj).a();
                break;
            case 5:
                q01 q01Var = (q01) obj;
                q01Var.f.add(q01Var.c);
                q01Var.a();
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
                ((x21) obj).invalidate();
                break;
            case 10:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj;
                saveToGallerySettingsActivity.v.clear();
                saveToGallerySettingsActivity.getUserConfig().updateSaveGalleryExceptions(saveToGallerySettingsActivity.a, saveToGallerySettingsActivity.v);
                saveToGallerySettingsActivity.Z();
                break;
            case 11:
                h31 h31Var = (h31) obj;
                h31Var.dismiss();
                pf.d.r(h31Var.getContext(), LocaleController.getString(R.string.PromoteUrl));
                break;
            case 12:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) ((org.telegram.ui.Components.nl0) obj).c;
                Runnable runnable = secretMediaViewer.o0;
                if (runnable != null) {
                    runnable.run();
                    secretMediaViewer.o0 = null;
                    break;
                }
                break;
            case 13:
                x31 x31Var = ((w31) obj).a;
                x31Var.Q = true;
                x31Var.N.invalidate();
                break;
            case 14:
                ((NotificationCenter) obj).runDelayedNotifications();
                break;
            case 15:
                AndroidUtilities.updateViewShow(((m51) obj).c, true);
                break;
            case 16:
                org.telegram.ui.Components.u61 u61Var = ((h61) obj).i0;
                if (u61Var != null) {
                    u61Var.N(true);
                    break;
                }
                break;
            case 17:
                ((a61) obj).a();
                break;
            case 18:
                ig.f.a(((SessionsActivity) obj).currentAccount).b();
                break;
            case 19:
                ((td1) obj).J.r.l();
                break;
            case 20:
                ((be1) obj).b.C0();
                break;
            case 21:
                ((VoIPFeedbackActivity) obj).finish();
                break;
            case 22:
                ((wg1) obj).a.G();
                break;
            case 23:
                ((xg1) obj).a.G();
                break;
            case 24:
                hh1 hh1Var = ((vg1) obj).b;
                hh1Var.L0.unlock();
                org.telegram.ui.Components.voip.k2.k().getClass();
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().swapSinks();
                }
                hh1Var.Y.setCornerRadius(-1.0f);
                hh1Var.c0.d.release();
                hh1Var.d0.d.release();
                hh1Var.b0.release();
                hh1Var.k();
                hh1Var.u0.d();
                org.telegram.ui.Components.voip.k2.U = false;
                hh1Var.E0 = false;
                hh1.n1 = null;
                break;
            case 25:
                fh1 fh1Var = (fh1) obj;
                fh1Var.getClass();
                if (VoIPService.getSharedState() != null) {
                    VoIPService.getSharedState().acceptIncomingCall();
                    if (fh1Var.a.n0 && VoIPService.getSharedInstance() != null) {
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
