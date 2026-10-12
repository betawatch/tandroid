package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class uz0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ uz0(Object obj, int i10) {
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
                if (profileActivity.n5 != 1.0f) {
                    wz0 wz0Var = profileActivity.n0;
                    while (wz0Var.D0.k(i11) != wz0Var.getRealCount() - 1) {
                        i11++;
                    }
                    wz0Var.x(i11, true);
                    break;
                }
                break;
            case 1:
                ProfileActivity profileActivity2 = ((n01) obj).b;
                profileActivity2.getMessagesController().toggleChatNoForwards(profileActivity2.e1, 0, true, new di.ya(2, profileActivity2, true));
                break;
            case 2:
                r01 r01Var = (r01) obj;
                r01Var.M0(r01Var.getTabProgress());
                break;
            case 3:
                ((i11) obj).c();
                break;
            case 4:
                ((w11) obj).a();
                break;
            case 5:
                t11 t11Var = (t11) obj;
                t11Var.f.add(t11Var.c);
                t11Var.a();
                break;
            case 6:
                Runnable[] runnableArr = (Runnable[]) obj;
                runnableArr[0].run();
                runnableArr[0] = null;
                break;
            case 7:
                ((bi.i8) obj).e();
                break;
            case 8:
                org.telegram.ui.Components.zc zcVar = (org.telegram.ui.Components.zc) obj;
                if (LaunchActivity.U() != null) {
                    if (zcVar == null) {
                        zcVar = org.telegram.ui.Components.zc.a0(LaunchActivity.U());
                    }
                    if (zcVar != null) {
                        org.telegram.ui.Components.sc M = zcVar.M(LocaleController.getString(R.string.ReportChatSent), LocaleController.getString(R.string.Reported2), R.raw.msg_antispam);
                        M.j = 5000;
                        M.j();
                        break;
                    }
                }
                break;
            case 9:
                ((r41) obj).invalidate();
                break;
            case 10:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj;
                saveToGallerySettingsActivity.v.clear();
                saveToGallerySettingsActivity.getUserConfig().updateSaveGalleryExceptions(saveToGallerySettingsActivity.a, saveToGallerySettingsActivity.v);
                saveToGallerySettingsActivity.Z();
                break;
            case 11:
                b51 b51Var = (b51) obj;
                b51Var.dismiss();
                pf.d.s(b51Var.getContext(), LocaleController.getString(R.string.PromoteUrl));
                break;
            case 12:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) ((org.telegram.ui.Components.ql0) obj).c;
                Runnable runnable = secretMediaViewer.o0;
                if (runnable != null) {
                    runnable.run();
                    secretMediaViewer.o0 = null;
                    break;
                }
                break;
            case 13:
                r51 r51Var = ((q51) obj).a;
                r51Var.Q = true;
                r51Var.N.invalidate();
                break;
            case 14:
                ((NotificationCenter) obj).runDelayedNotifications();
                break;
            case 15:
                AndroidUtilities.updateViewShow(((g71) obj).c, true);
                break;
            case 16:
                org.telegram.ui.Components.z61 z61Var = ((b81) obj).i0;
                if (z61Var != null) {
                    z61Var.N(true);
                    break;
                }
                break;
            case 17:
                ((u71) obj).a();
                break;
            case 18:
                ig.f.a(((SessionsActivity) obj).currentAccount).b();
                break;
            case 19:
                ((nf1) obj).J.r.l();
                break;
            case 20:
                ((vf1) obj).b.C0();
                break;
            case 21:
                ((VoIPFeedbackActivity) obj).finish();
                break;
            case 22:
                ((si1) obj).a.G();
                break;
            case 23:
                ((ti1) obj).a.G();
                break;
            case 24:
                dj1 dj1Var = ((ri1) obj).b;
                dj1Var.L0.unlock();
                org.telegram.ui.Components.voip.k2.k().getClass();
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().swapSinks();
                }
                dj1Var.Y.setCornerRadius(-1.0f);
                dj1Var.c0.d.release();
                dj1Var.d0.d.release();
                dj1Var.b0.release();
                dj1Var.k();
                dj1Var.u0.d();
                org.telegram.ui.Components.voip.k2.U = false;
                dj1Var.E0 = false;
                dj1.n1 = null;
                break;
            case 25:
                bj1 bj1Var = (bj1) obj;
                bj1Var.getClass();
                if (VoIPService.getSharedState() != null) {
                    VoIPService.getSharedState().acceptIncomingCall();
                    if (bj1Var.a.n0 && VoIPService.getSharedInstance() != null) {
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
