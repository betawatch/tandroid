package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vy0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vy0(Object obj, int i10) {
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
                ProfileActivity profileActivity = (ProfileActivity) ((ah.d) obj).c;
                if (profileActivity.k5 != 1.0f) {
                    xy0 xy0Var = profileActivity.k0;
                    while (xy0Var.A0.k(i11) != xy0Var.getRealCount() - 1) {
                        i11++;
                    }
                    xy0Var.x(i11, true);
                    break;
                }
                break;
            case 1:
                ProfileActivity profileActivity2 = ((oz0) obj).b;
                profileActivity2.getMessagesController().toggleChatNoForwards(profileActivity2.b1, 0, true, new ky0(true, profileActivity2, i11));
                break;
            case 2:
                sz0 sz0Var = (sz0) obj;
                sz0Var.M0(sz0Var.getTabProgress());
                break;
            case 3:
                ((j01) obj).c();
                break;
            case 4:
                ((y01) obj).a();
                break;
            case 5:
                v01 v01Var = (v01) obj;
                v01Var.f.add(v01Var.c);
                v01Var.a();
                break;
            case 6:
                Runnable[] runnableArr = (Runnable[]) obj;
                runnableArr[0].run();
                runnableArr[0] = null;
                break;
            case 7:
                ((nh.h6) obj).e();
                break;
            case 8:
                w11 w11Var = (w11) obj;
                AndroidUtilities.hideKeyboard(w11Var.d.findFocus());
                while (i11 < w11Var.y.length) {
                    int i12 = w11Var.w;
                    if ((i12 != 0 || i11 == 4) && (i12 != 1 || i11 == 2 || i11 == 3)) {
                        w11Var.a[i11].setText((CharSequence) null);
                    }
                    i11++;
                }
                break;
            case 9:
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
            case 10:
                ((t31) obj).invalidate();
                break;
            case 11:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj;
                saveToGallerySettingsActivity.v.clear();
                saveToGallerySettingsActivity.getUserConfig().updateSaveGalleryExceptions(saveToGallerySettingsActivity.a, saveToGallerySettingsActivity.v);
                saveToGallerySettingsActivity.Z();
                break;
            case 12:
                z31 z31Var = (z31) obj;
                z31Var.dismiss();
                af.g.s(z31Var.getContext(), LocaleController.getString(R.string.PromoteUrl));
                break;
            case 13:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) ((org.telegram.ui.Components.ex0) obj).c;
                Runnable runnable = secretMediaViewer.l0;
                if (runnable != null) {
                    runnable.run();
                    secretMediaViewer.l0 = null;
                    break;
                }
                break;
            case 14:
                p41 p41Var = ((o41) obj).a;
                p41Var.N = true;
                p41Var.K.invalidate();
                break;
            case 15:
                ((NotificationCenter) obj).runDelayedNotifications();
                break;
            case 16:
                AndroidUtilities.updateViewShow(((e61) obj).c, true);
                break;
            case 17:
                org.telegram.ui.Components.w51 w51Var = ((b71) obj).f0;
                if (w51Var != null) {
                    w51Var.N(true);
                    break;
                }
                break;
            case 18:
                ((u61) obj).a();
                break;
            case 19:
                uf.f.a(((SessionsActivity) obj).currentAccount).b();
                break;
            case 20:
                ((le1) obj).J.r.l();
                break;
            case 21:
                ((ue1) obj).b.C0();
                break;
            case 22:
                ((VoIPFeedbackActivity) obj).finish();
                break;
            case 23:
                ((ph1) obj).a.H();
                break;
            case 24:
                ((qh1) obj).a.H();
                break;
            case 25:
                ai1 ai1Var = ((oh1) obj).b;
                ai1Var.I0.unlock();
                org.telegram.ui.Components.voip.m2.k().getClass();
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().swapSinks();
                }
                ai1Var.V.setCornerRadius(-1.0f);
                ai1Var.Z.d.release();
                ai1Var.a0.d.release();
                ai1Var.Y.release();
                ai1Var.l();
                ai1Var.r0.d();
                org.telegram.ui.Components.voip.m2.Q = false;
                ai1Var.B0 = false;
                ai1.k1 = null;
                break;
            case 26:
                yh1 yh1Var = (yh1) obj;
                yh1Var.getClass();
                if (VoIPService.getSharedState() != null) {
                    VoIPService.getSharedState().acceptIncomingCall();
                    if (yh1Var.a.k0 && VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().requestVideoCall(false);
                        break;
                    }
                }
                break;
            case 27:
                ((VoIPPermissionActivity) obj).finish();
                break;
            default:
                int[][] iArr = WallpapersListActivity.h0;
                ((WallpapersListActivity) obj).B0(false);
                break;
        }
    }
}
