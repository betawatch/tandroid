package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sz0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ sz0(Object obj, int i10) {
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
                ProfileActivity profileActivity = ((vz0) obj).b;
                profileActivity.getMessagesController().toggleChatNoForwards(profileActivity.b1, 0, true, new ry0(true, profileActivity, i11));
                break;
            case 1:
                zz0 zz0Var = (zz0) obj;
                zz0Var.M0(zz0Var.getTabProgress());
                break;
            case 2:
                ((q01) obj).c();
                break;
            case 3:
                ((f11) obj).a();
                break;
            case 4:
                c11 c11Var = (c11) obj;
                c11Var.f.add(c11Var.c);
                c11Var.a();
                break;
            case 5:
                Runnable[] runnableArr = (Runnable[]) obj;
                runnableArr[0].run();
                runnableArr[0] = null;
                break;
            case 6:
                ((nh.h6) obj).e();
                break;
            case 7:
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
            case 8:
                ((a41) obj).invalidate();
                break;
            case 9:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj;
                saveToGallerySettingsActivity.v.clear();
                saveToGallerySettingsActivity.getUserConfig().updateSaveGalleryExceptions(saveToGallerySettingsActivity.a, saveToGallerySettingsActivity.v);
                saveToGallerySettingsActivity.Z();
                break;
            case 10:
                g41 g41Var = (g41) obj;
                g41Var.dismiss();
                ze.d.s(g41Var.getContext(), LocaleController.getString(R.string.PromoteUrl));
                break;
            case 11:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) ((org.telegram.ui.Components.ex0) obj).c;
                Runnable runnable = secretMediaViewer.l0;
                if (runnable != null) {
                    runnable.run();
                    secretMediaViewer.l0 = null;
                    break;
                }
                break;
            case 12:
                w41 w41Var = ((v41) obj).a;
                w41Var.N = true;
                w41Var.K.invalidate();
                break;
            case 13:
                ((NotificationCenter) obj).runDelayedNotifications();
                break;
            case 14:
                AndroidUtilities.updateViewShow(((l61) obj).c, true);
                break;
            case 15:
                org.telegram.ui.Components.w51 w51Var = ((i71) obj).f0;
                if (w51Var != null) {
                    w51Var.N(true);
                    break;
                }
                break;
            case 16:
                ((b71) obj).a();
                break;
            case 17:
                uf.f.a(((SessionsActivity) obj).currentAccount).b();
                break;
            case 18:
                ((te1) obj).J.r.l();
                break;
            case 19:
                ((cf1) obj).b.C0();
                break;
            case 20:
                ((VoIPFeedbackActivity) obj).finish();
                break;
            case 21:
                ((xh1) obj).a.H();
                break;
            case 22:
                ((yh1) obj).a.H();
                break;
            case 23:
                ii1 ii1Var = ((wh1) obj).b;
                ii1Var.I0.unlock();
                org.telegram.ui.Components.voip.m2.k().getClass();
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().swapSinks();
                }
                ii1Var.V.setCornerRadius(-1.0f);
                ii1Var.Z.d.release();
                ii1Var.a0.d.release();
                ii1Var.Y.release();
                ii1Var.l();
                ii1Var.r0.d();
                org.telegram.ui.Components.voip.m2.Q = false;
                ii1Var.B0 = false;
                ii1.k1 = null;
                break;
            case 24:
                gi1 gi1Var = (gi1) obj;
                gi1Var.getClass();
                if (VoIPService.getSharedState() != null) {
                    VoIPService.getSharedState().acceptIncomingCall();
                    if (gi1Var.a.k0 && VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().requestVideoCall(false);
                        break;
                    }
                }
                break;
            case 25:
                ((VoIPPermissionActivity) obj).finish();
                break;
            default:
                int[][] iArr = WallpapersListActivity.h0;
                ((WallpapersListActivity) obj).B0(false);
                break;
        }
    }
}
