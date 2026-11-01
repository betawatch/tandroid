package org.telegram.ui;

import android.graphics.RectF;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vv0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vv0(Object obj, int i10) {
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
                ((vh.p2) obj).e(true);
                break;
            case 1:
                RectF rectF = ProfileActivity.S6;
                org.telegram.messenger.i0.g("@" + org.telegram.messenger.i20.n((TLRPC.User) obj));
                break;
            case 2:
                bw0 bw0Var = (bw0) obj;
                bw0Var.G.getNotificationCenter().j(bw0Var.F);
                break;
            case 3:
                ProfileActivity profileActivity = (ProfileActivity) ((fg.i) obj).c;
                if (profileActivity.n5 != 1.0f) {
                    jw0 jw0Var = profileActivity.n0;
                    while (jw0Var.D0.k(i11) != jw0Var.getRealCount() - 1) {
                        i11++;
                    }
                    jw0Var.x(i11, true);
                    break;
                }
                break;
            case 4:
                ProfileActivity profileActivity2 = ((cx0) obj).b;
                RectF rectF2 = ProfileActivity.S6;
                profileActivity2.getMessagesController().a5(profileActivity2.d1, 0, true, new bv0(i11, profileActivity2, true));
                break;
            case 5:
                hx0 hx0Var = (hx0) obj;
                hx0Var.V0(hx0Var.getTabProgress());
                break;
            case 6:
                ((zx0) obj).c();
                break;
            case 7:
                ((ny0) obj).a();
                break;
            case 8:
                ky0 ky0Var = (ky0) obj;
                ky0Var.f.add(ky0Var.c);
                ky0Var.a();
                break;
            case 9:
                Runnable[] runnableArr = (Runnable[]) obj;
                runnableArr[0].run();
                runnableArr[0] = null;
                break;
            case 10:
                ((th.t4) obj).e();
                break;
            case 11:
                org.telegram.ui.Components.cc ccVar = (org.telegram.ui.Components.cc) obj;
                if (LaunchActivity.T() != null) {
                    if (ccVar == null) {
                        ccVar = org.telegram.ui.Components.cc.a0(LaunchActivity.T());
                    }
                    if (ccVar != null) {
                        org.telegram.ui.Components.wb I = ccVar.I(R.raw.msg_antispam, org.telegram.messenger.dd.L0(2131746239, null), org.telegram.messenger.dd.L0(2131746202, null));
                        I.j = 5000;
                        I.j();
                        break;
                    }
                }
                break;
            case 12:
                ((k01) obj).invalidate();
                break;
            case 13:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj;
                saveToGallerySettingsActivity.w.clear();
                saveToGallerySettingsActivity.getUserConfig().A(saveToGallerySettingsActivity.a, saveToGallerySettingsActivity.w);
                saveToGallerySettingsActivity.e0();
                break;
            case 14:
                org.telegram.ui.Components.e30 e30Var = (org.telegram.ui.Components.e30) obj;
                e30Var.dismiss();
                gf.f.r(e30Var.getContext(), org.telegram.messenger.dd.L0(2131746633, null));
                break;
            case 15:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) ((org.telegram.ui.Components.jw0) obj).c;
                Runnable runnable = secretMediaViewer.m0;
                if (runnable != null) {
                    runnable.run();
                    secretMediaViewer.m0 = null;
                    break;
                }
                break;
            case 16:
                h11 h11Var = ((g11) obj).a;
                h11Var.Q = true;
                h11Var.N.invalidate();
                break;
            case 17:
                ((org.telegram.messenger.at) obj).o();
                break;
            case 18:
                org.telegram.messenger.i0.U3(((y11) obj).c, true, true);
                break;
            case 19:
                org.telegram.ui.Components.q51 q51Var = ((q31) obj).a2;
                if (q51Var != null) {
                    q51Var.O(true);
                    break;
                }
                break;
            case 20:
                ((j31) obj).a();
                break;
            case 21:
                ag.k.a(((SessionsActivity) obj).currentAccount).b();
                break;
            case 22:
                s61 s61Var = (s61) obj;
                s61Var.m0.a(s61Var.j0.e0, s61Var.k0.isAttachedToWindow());
                break;
            case 23:
                ((qa1) obj).J.r.f();
                break;
            case 24:
                ((za1) obj).b.G0();
                break;
            case 25:
                ((VoIPFeedbackActivity) obj).finish();
                break;
            case 26:
                ((pd1) obj).a.G();
                break;
            case 27:
                ((qd1) obj).a.G();
                break;
            case 28:
                zd1 zd1Var = ((od1) obj).b;
                zd1Var.L0.e();
                org.telegram.ui.Components.voip.u1.d().getClass();
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().swapSinks();
                }
                zd1Var.Y.setCornerRadius(-1.0f);
                zd1Var.c0.d.release();
                zd1Var.d0.d.release();
                zd1Var.b0.release();
                zd1Var.d();
                zd1Var.u0.d();
                org.telegram.ui.Components.voip.u1.U = false;
                zd1Var.E0 = false;
                zd1.n1 = null;
                break;
            default:
                xd1 xd1Var = (xd1) obj;
                xd1Var.getClass();
                if (VoIPService.getSharedState() != null) {
                    VoIPService.getSharedState().acceptIncomingCall();
                    if (xd1Var.a.n0 && VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().requestVideoCall(false);
                        break;
                    }
                }
                break;
        }
    }
}
