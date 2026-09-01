package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xy0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xy0(Object obj, int i10) {
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
                ProfileActivity profileActivity = (ProfileActivity) ((ag.l) obj).c;
                if (profileActivity.k5 != 1.0f) {
                    zy0 zy0Var = profileActivity.k0;
                    while (zy0Var.A0.k(i11) != zy0Var.getRealCount() - 1) {
                        i11++;
                    }
                    zy0Var.x(i11, true);
                    break;
                }
                break;
            case 1:
                ProfileActivity profileActivity2 = ((qz0) obj).b;
                profileActivity2.getMessagesController().toggleChatNoForwards(profileActivity2.b1, 0, true, new my0(true, profileActivity2, i11));
                break;
            case 2:
                uz0 uz0Var = (uz0) obj;
                uz0Var.M0(uz0Var.getTabProgress());
                break;
            case 3:
                ((l01) obj).c();
                break;
            case 4:
                ((a11) obj).a();
                break;
            case 5:
                x01 x01Var = (x01) obj;
                x01Var.f.add(x01Var.c);
                x01Var.a();
                break;
            case 6:
                Runnable[] runnableArr = (Runnable[]) obj;
                runnableArr[0].run();
                runnableArr[0] = null;
                break;
            case 7:
                ((oh.h6) obj).e();
                break;
            case 8:
                org.telegram.ui.Components.qc qcVar = (org.telegram.ui.Components.qc) obj;
                if (LaunchActivity.U() != null) {
                    if (qcVar == null) {
                        qcVar = org.telegram.ui.Components.qc.a0(LaunchActivity.U());
                    }
                    if (qcVar != null) {
                        org.telegram.ui.Components.ic M = qcVar.M(LocaleController.getString(R.string.ReportChatSent), LocaleController.getString(R.string.Reported2), R.raw.msg_antispam);
                        M.j = 5000;
                        M.j();
                        break;
                    }
                }
                break;
            case 9:
                ((v31) obj).invalidate();
                break;
            case 10:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj;
                saveToGallerySettingsActivity.v.clear();
                saveToGallerySettingsActivity.getUserConfig().updateSaveGalleryExceptions(saveToGallerySettingsActivity.a, saveToGallerySettingsActivity.v);
                saveToGallerySettingsActivity.Z();
                break;
            case 11:
                b41 b41Var = (b41) obj;
                b41Var.dismiss();
                af.g.s(b41Var.getContext(), LocaleController.getString(R.string.PromoteUrl));
                break;
            case 12:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) ((org.telegram.ui.Components.fx0) obj).c;
                Runnable runnable = secretMediaViewer.l0;
                if (runnable != null) {
                    runnable.run();
                    secretMediaViewer.l0 = null;
                    break;
                }
                break;
            case 13:
                r41 r41Var = ((q41) obj).a;
                r41Var.N = true;
                r41Var.K.invalidate();
                break;
            case 14:
                ((NotificationCenter) obj).runDelayedNotifications();
                break;
            case 15:
                AndroidUtilities.updateViewShow(((g61) obj).c, true);
                break;
            case 16:
                org.telegram.ui.Components.x51 x51Var = ((c71) obj).f0;
                if (x51Var != null) {
                    x51Var.N(true);
                    break;
                }
                break;
            case 17:
                ((v61) obj).a();
                break;
            case 18:
                vf.f.a(((SessionsActivity) obj).currentAccount).b();
                break;
            case 19:
                ((ne1) obj).J.r.l();
                break;
            case 20:
                ((we1) obj).b.C0();
                break;
            case 21:
                ((VoIPFeedbackActivity) obj).finish();
                break;
            case 22:
                ((rh1) obj).a.H();
                break;
            case 23:
                ((sh1) obj).a.H();
                break;
            case 24:
                ci1 ci1Var = ((qh1) obj).b;
                ci1Var.I0.unlock();
                org.telegram.ui.Components.voip.n2.k().getClass();
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().swapSinks();
                }
                ci1Var.V.setCornerRadius(-1.0f);
                ci1Var.Z.d.release();
                ci1Var.a0.d.release();
                ci1Var.Y.release();
                ci1Var.l();
                ci1Var.r0.d();
                org.telegram.ui.Components.voip.n2.Q = false;
                ci1Var.B0 = false;
                ci1.k1 = null;
                break;
            case 25:
                ai1 ai1Var = (ai1) obj;
                ai1Var.getClass();
                if (VoIPService.getSharedState() != null) {
                    VoIPService.getSharedState().acceptIncomingCall();
                    if (ai1Var.a.k0 && VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().requestVideoCall(false);
                        break;
                    }
                }
                break;
            case 26:
                ((VoIPPermissionActivity) obj).finish();
                break;
            default:
                int[][] iArr = WallpapersListActivity.h0;
                ((WallpapersListActivity) obj).B0(false);
                break;
        }
    }
}
