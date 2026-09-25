package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vz0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vz0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                ProfileActivity profileActivity = ((yz0) obj).b;
                profileActivity.getMessagesController().toggleChatNoForwards(profileActivity.e1, 0, true, new ci.za(true, profileActivity, 2));
                break;
            case 1:
                c01 c01Var = (c01) obj;
                c01Var.M0(c01Var.getTabProgress());
                break;
            case 2:
                ((t01) obj).c();
                break;
            case 3:
                ((h11) obj).a();
                break;
            case 4:
                e11 e11Var = (e11) obj;
                e11Var.f.add(e11Var.c);
                e11Var.a();
                break;
            case 5:
                Runnable[] runnableArr = (Runnable[]) obj;
                runnableArr[0].run();
                runnableArr[0] = null;
                break;
            case 6:
                ((ai.x8) obj).e();
                break;
            case 7:
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
            case 8:
                ((d41) obj).invalidate();
                break;
            case 9:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj;
                saveToGallerySettingsActivity.v.clear();
                saveToGallerySettingsActivity.getUserConfig().updateSaveGalleryExceptions(saveToGallerySettingsActivity.a, saveToGallerySettingsActivity.v);
                saveToGallerySettingsActivity.Z();
                break;
            case 10:
                l41 l41Var = (l41) obj;
                l41Var.dismiss();
                nf.f.s(l41Var.getContext(), LocaleController.getString(R.string.PromoteUrl));
                break;
            case 11:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) ((org.telegram.ui.Components.al0) obj).c;
                Runnable runnable = secretMediaViewer.o0;
                if (runnable != null) {
                    runnable.run();
                    secretMediaViewer.o0 = null;
                    break;
                }
                break;
            case 12:
                b51 b51Var = ((a51) obj).a;
                b51Var.Q = true;
                b51Var.N.invalidate();
                break;
            case 13:
                ((NotificationCenter) obj).runDelayedNotifications();
                break;
            case 14:
                AndroidUtilities.updateViewShow(((p61) obj).c, true);
                break;
            case 15:
                org.telegram.ui.Components.j61 j61Var = ((k71) obj).i0;
                if (j61Var != null) {
                    j61Var.N(true);
                    break;
                }
                break;
            case 16:
                ((d71) obj).a();
                break;
            case 17:
                hg.g.a(((SessionsActivity) obj).currentAccount).b();
                break;
            case 18:
                ((ye1) obj).J.r.l();
                break;
            case 19:
                ((gf1) obj).b.C0();
                break;
            case 20:
                ((VoIPFeedbackActivity) obj).finish();
                break;
            case 21:
                ((bi1) obj).a.H();
                break;
            case 22:
                ((ci1) obj).a.H();
                break;
            case 23:
                mi1 mi1Var = ((ai1) obj).b;
                mi1Var.L0.unlock();
                org.telegram.ui.Components.voip.n2.k().getClass();
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().swapSinks();
                }
                mi1Var.Y.setCornerRadius(-1.0f);
                mi1Var.c0.d.release();
                mi1Var.d0.d.release();
                mi1Var.b0.release();
                mi1Var.l();
                mi1Var.u0.d();
                org.telegram.ui.Components.voip.n2.T = false;
                mi1Var.E0 = false;
                mi1.n1 = null;
                break;
            case 24:
                ki1 ki1Var = (ki1) obj;
                ki1Var.getClass();
                if (VoIPService.getSharedState() != null) {
                    VoIPService.getSharedState().acceptIncomingCall();
                    if (ki1Var.a.n0 && VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().requestVideoCall(false);
                        break;
                    }
                }
                break;
            case 25:
                ((VoIPPermissionActivity) obj).finish();
                break;
            default:
                int[][] iArr = WallpapersListActivity.k0;
                ((WallpapersListActivity) obj).B0(false);
                break;
        }
    }
}
