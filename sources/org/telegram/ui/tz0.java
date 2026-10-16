package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tz0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tz0(Object obj, int i10) {
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
                    vz0 vz0Var = profileActivity.n0;
                    while (vz0Var.D0.k(i11) != vz0Var.getRealCount() - 1) {
                        i11++;
                    }
                    vz0Var.x(i11, true);
                    break;
                }
                break;
            case 1:
                ProfileActivity profileActivity2 = ((m01) obj).b;
                profileActivity2.getMessagesController().toggleChatNoForwards(profileActivity2.e1, 0, true, new di.ya(2, profileActivity2, true));
                break;
            case 2:
                q01 q01Var = (q01) obj;
                q01Var.N0(q01Var.getTabProgress());
                break;
            case 3:
                ((h11) obj).c();
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
                pf.d.r(b51Var.getContext(), LocaleController.getString(R.string.PromoteUrl));
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
                org.telegram.ui.Components.a71 a71Var = ((b81) obj).i0;
                if (a71Var != null) {
                    a71Var.N(true);
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
                ((mf1) obj).J.r.l();
                break;
            case 20:
                ((uf1) obj).b.C0();
                break;
            case 21:
                ((VoIPFeedbackActivity) obj).finish();
                break;
            case 22:
                ((ri1) obj).a.G();
                break;
            case 23:
                ((si1) obj).a.G();
                break;
            case 24:
                cj1 cj1Var = ((qi1) obj).b;
                cj1Var.L0.unlock();
                org.telegram.ui.Components.voip.k2.k().getClass();
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().swapSinks();
                }
                cj1Var.Y.setCornerRadius(-1.0f);
                cj1Var.c0.d.release();
                cj1Var.d0.d.release();
                cj1Var.b0.release();
                cj1Var.k();
                cj1Var.u0.d();
                org.telegram.ui.Components.voip.k2.U = false;
                cj1Var.E0 = false;
                cj1.n1 = null;
                break;
            case 25:
                aj1 aj1Var = (aj1) obj;
                aj1Var.getClass();
                if (VoIPService.getSharedState() != null) {
                    VoIPService.getSharedState().acceptIncomingCall();
                    if (aj1Var.a.n0 && VoIPService.getSharedInstance() != null) {
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
