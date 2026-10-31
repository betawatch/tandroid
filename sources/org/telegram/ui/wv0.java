package org.telegram.ui;

import android.graphics.RectF;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class wv0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wv0(Object obj, int i10) {
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
                RectF rectF = ProfileActivity.R6;
                org.telegram.messenger.i0.g("@" + org.telegram.messenger.h20.n((TLRPC.User) obj));
                break;
            case 2:
                cw0 cw0Var = (cw0) obj;
                cw0Var.G.getNotificationCenter().j(cw0Var.F);
                break;
            case 3:
                ProfileActivity profileActivity = (ProfileActivity) ((fg.i) obj).c;
                if (profileActivity.n5 != 1.0f) {
                    kw0 kw0Var = profileActivity.n0;
                    while (kw0Var.D0.k(i11) != kw0Var.getRealCount() - 1) {
                        i11++;
                    }
                    kw0Var.x(i11, true);
                    break;
                }
                break;
            case 4:
                ProfileActivity profileActivity2 = ((dx0) obj).b;
                RectF rectF2 = ProfileActivity.R6;
                profileActivity2.getMessagesController().a5(profileActivity2.d1, 0, true, new cv0(i11, profileActivity2, true));
                break;
            case 5:
                ix0 ix0Var = (ix0) obj;
                ix0Var.U0(ix0Var.getTabProgress());
                break;
            case 6:
                ((ay0) obj).c();
                break;
            case 7:
                ((oy0) obj).a();
                break;
            case 8:
                ly0 ly0Var = (ly0) obj;
                ly0Var.f.add(ly0Var.c);
                ly0Var.a();
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
                        org.telegram.ui.Components.wb I = ccVar.I(R.raw.msg_antispam, org.telegram.messenger.cd.L0(2131746239, null), org.telegram.messenger.cd.L0(2131746202, null));
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
                saveToGallerySettingsActivity.d0();
                break;
            case 14:
                org.telegram.ui.Components.e30 e30Var = (org.telegram.ui.Components.e30) obj;
                e30Var.dismiss();
                gf.f.r(e30Var.getContext(), org.telegram.messenger.cd.L0(2131746633, null));
                break;
            case 15:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) ((org.telegram.ui.Components.iw0) obj).c;
                Runnable runnable = secretMediaViewer.m0;
                if (runnable != null) {
                    runnable.run();
                    secretMediaViewer.m0 = null;
                    break;
                }
                break;
            case 16:
                i11 i11Var = ((h11) obj).a;
                i11Var.Q = true;
                i11Var.N.invalidate();
                break;
            case 17:
                ((org.telegram.messenger.zs) obj).o();
                break;
            case 18:
                org.telegram.messenger.i0.U3(((a21) obj).c, true, true);
                break;
            case 19:
                org.telegram.ui.Components.p51 p51Var = ((s31) obj).a2;
                if (p51Var != null) {
                    p51Var.O(true);
                    break;
                }
                break;
            case 20:
                ((l31) obj).a();
                break;
            case 21:
                ag.k.a(((SessionsActivity) obj).currentAccount).b();
                break;
            case 22:
                u61 u61Var = (u61) obj;
                u61Var.m0.a(u61Var.j0.e0, u61Var.k0.isAttachedToWindow());
                break;
            case 23:
                ((sa1) obj).J.r.f();
                break;
            case 24:
                ((bb1) obj).b.F0();
                break;
            case 25:
                ((VoIPFeedbackActivity) obj).finish();
                break;
            case 26:
                ((rd1) obj).a.G();
                break;
            case 27:
                ((sd1) obj).a.G();
                break;
            case 28:
                be1 be1Var = ((qd1) obj).b;
                be1Var.L0.e();
                org.telegram.ui.Components.voip.t1.d().getClass();
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().swapSinks();
                }
                be1Var.Y.setCornerRadius(-1.0f);
                be1Var.c0.d.release();
                be1Var.d0.d.release();
                be1Var.b0.release();
                be1Var.d();
                be1Var.u0.d();
                org.telegram.ui.Components.voip.t1.U = false;
                be1Var.E0 = false;
                be1.n1 = null;
                break;
            default:
                zd1 zd1Var = (zd1) obj;
                zd1Var.getClass();
                if (VoIPService.getSharedState() != null) {
                    VoIPService.getSharedState().acceptIncomingCall();
                    if (zd1Var.a.n0 && VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().requestVideoCall(false);
                        break;
                    }
                }
                break;
        }
    }
}
