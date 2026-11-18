package org.telegram.ui;

import android.graphics.RectF;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class ru0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ru0(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        int i10 = 0;
        Object obj = this.b;
        switch (i7) {
            case 0:
                su0 su0Var = (su0) obj;
                su0Var.G.getNotificationCenter().j(su0Var.F);
                break;
            case 1:
                ProfileActivity profileActivity = (ProfileActivity) ((ai.k0) obj).c;
                if (profileActivity.t5 != 1.0f) {
                    av0 av0Var = profileActivity.o0;
                    while (av0Var.E0.k(i10) != av0Var.getRealCount() - 1) {
                        i10++;
                    }
                    av0Var.x(i10, true);
                    break;
                }
                break;
            case 2:
                ProfileActivity profileActivity2 = ((rv0) obj).b;
                RectF rectF = ProfileActivity.Z6;
                profileActivity2.getMessagesController().p5(profileActivity2.e1, 0, true, new hi.k9(profileActivity2, true, 2));
                break;
            case 3:
                vv0 vv0Var = (vv0) obj;
                vv0Var.Z0(vv0Var.getTabProgress());
                break;
            case 4:
                ((ow0) obj).c();
                break;
            case 5:
                ((dx0) obj).a();
                break;
            case 6:
                ax0 ax0Var = (ax0) obj;
                ax0Var.f.add(ax0Var.c);
                ax0Var.a();
                break;
            case 7:
                Runnable[] runnableArr = (Runnable[]) obj;
                runnableArr[0].run();
                runnableArr[0] = null;
                break;
            case 8:
                ((fi.d6) obj).e();
                break;
            case 9:
                org.telegram.ui.Components.lc lcVar = (org.telegram.ui.Components.lc) obj;
                if (LaunchActivity.T() != null) {
                    if (lcVar == null) {
                        lcVar = org.telegram.ui.Components.lc.b0(LaunchActivity.T());
                    }
                    if (lcVar != null) {
                        org.telegram.ui.Components.gc I = lcVar.I(R.raw.msg_antispam, org.telegram.messenger.gd.M0(2131746027, null), org.telegram.messenger.gd.M0(2131745990, null));
                        I.j = 5000;
                        I.j();
                        break;
                    }
                }
                break;
            case 10:
                ((yy0) obj).invalidate();
                break;
            case 11:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj;
                saveToGallerySettingsActivity.w.clear();
                saveToGallerySettingsActivity.getUserConfig().A(saveToGallerySettingsActivity.a, saveToGallerySettingsActivity.w);
                saveToGallerySettingsActivity.e0();
                break;
            case 12:
                org.telegram.ui.Components.x20 x20Var = (org.telegram.ui.Components.x20) obj;
                x20Var.dismiss();
                vf.c.t(x20Var.getContext(), org.telegram.messenger.gd.M0(2131746423, null));
                break;
            case 13:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) ((org.telegram.ui.Components.h60) obj).c;
                Runnable runnable = secretMediaViewer.n0;
                if (runnable != null) {
                    runnable.run();
                    secretMediaViewer.n0 = null;
                    break;
                }
                break;
            case 14:
                tz0 tz0Var = ((sz0) obj).a;
                tz0Var.R = true;
                tz0Var.O.invalidate();
                break;
            case 15:
                ((org.telegram.messenger.ks) obj).o();
                break;
            case 16:
                org.telegram.messenger.g0.T3(((j01) obj).c, true, true);
                break;
            case 17:
                org.telegram.ui.Components.z41 z41Var = ((b21) obj).e2;
                if (z41Var != null) {
                    z41Var.O(true);
                    break;
                }
                break;
            case 18:
                ((u11) obj).a();
                break;
            case 19:
                kg.f.a(((SessionsActivity) obj).currentAccount).b();
                break;
            case 20:
                c51 c51Var = (c51) obj;
                c51Var.n0.a(c51Var.k0.f0, c51Var.l0.isAttachedToWindow());
                break;
            case 21:
                ((b91) obj).J.r.f();
                break;
            case 22:
                ((j91) obj).b.G0();
                break;
            case 23:
                ((VoIPFeedbackActivity) obj).finish();
                break;
            case 24:
                ((yb1) obj).a.y();
                break;
            case 25:
                ((zb1) obj).a.y();
                break;
            case 26:
                hc1 hc1Var = ((xb1) obj).b;
                hc1Var.L0.e();
                org.telegram.ui.Components.voip.h2.d().getClass();
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().swapSinks();
                }
                hc1Var.Z.setCornerRadius(-1.0f);
                hc1Var.d0.d.release();
                hc1Var.e0.d.release();
                hc1Var.c0.release();
                hc1Var.c();
                hc1Var.u0.d();
                org.telegram.ui.Components.voip.h2.T = false;
                hc1Var.E0 = false;
                hc1.m1 = null;
                org.telegram.ui.Components.voip.i2.g();
                break;
            case 27:
                fc1 fc1Var = (fc1) obj;
                fc1Var.getClass();
                if (VoIPService.getSharedState() != null) {
                    VoIPService.getSharedState().acceptIncomingCall();
                    if (fc1Var.a.n0 && VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().requestVideoCall(false);
                        break;
                    }
                }
                break;
            case 28:
                ((VoIPPermissionActivity) obj).finish();
                break;
            default:
                ((WallpapersListActivity) obj).G0(false);
                break;
        }
    }
}
