package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class xz0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xz0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                ProfileActivity profileActivity = ((a01) obj).b;
                profileActivity.getMessagesController().toggleChatNoForwards(profileActivity.e1, 0, true, new ci.za(true, profileActivity, 2));
                break;
            case 1:
                e01 e01Var = (e01) obj;
                e01Var.M0(e01Var.getTabProgress());
                break;
            case 2:
                ((v01) obj).c();
                break;
            case 3:
                ((j11) obj).a();
                break;
            case 4:
                g11 g11Var = (g11) obj;
                g11Var.f.add(g11Var.c);
                g11Var.a();
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
                ((e41) obj).invalidate();
                break;
            case 9:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj;
                saveToGallerySettingsActivity.v.clear();
                saveToGallerySettingsActivity.getUserConfig().updateSaveGalleryExceptions(saveToGallerySettingsActivity.a, saveToGallerySettingsActivity.v);
                saveToGallerySettingsActivity.Z();
                break;
            case 10:
                k41 k41Var = (k41) obj;
                k41Var.dismiss();
                nf.f.s(k41Var.getContext(), LocaleController.getString(R.string.PromoteUrl));
                break;
            case 11:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) ((org.telegram.ui.Components.qk0) obj).c;
                Runnable runnable = secretMediaViewer.o0;
                if (runnable != null) {
                    runnable.run();
                    secretMediaViewer.o0 = null;
                    break;
                }
                break;
            case 12:
                a51 a51Var = ((z41) obj).a;
                a51Var.Q = true;
                a51Var.N.invalidate();
                break;
            case 13:
                ((NotificationCenter) obj).runDelayedNotifications();
                break;
            case 14:
                AndroidUtilities.updateViewShow(((o61) obj).c, true);
                break;
            case 15:
                org.telegram.ui.Components.v51 v51Var = ((j71) obj).i0;
                if (v51Var != null) {
                    v51Var.N(true);
                    break;
                }
                break;
            case 16:
                ((c71) obj).a();
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
                org.telegram.ui.Components.voip.m2.k().getClass();
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().swapSinks();
                }
                mi1Var.Y.setCornerRadius(-1.0f);
                mi1Var.c0.d.release();
                mi1Var.d0.d.release();
                mi1Var.b0.release();
                mi1Var.l();
                mi1Var.u0.d();
                org.telegram.ui.Components.voip.m2.T = false;
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
