package org.telegram.ui;

import android.graphics.RectF;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class qu0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qu0(Object obj, int i7) {
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
                ru0 ru0Var = (ru0) obj;
                ru0Var.G.getNotificationCenter().j(ru0Var.F);
                break;
            case 1:
                ProfileActivity profileActivity = (ProfileActivity) ((ai.h0) obj).c;
                if (profileActivity.t5 != 1.0f) {
                    zu0 zu0Var = profileActivity.o0;
                    while (zu0Var.E0.k(i10) != zu0Var.getRealCount() - 1) {
                        i10++;
                    }
                    zu0Var.x(i10, true);
                    break;
                }
                break;
            case 2:
                ProfileActivity profileActivity2 = ((qv0) obj).b;
                RectF rectF = ProfileActivity.Z6;
                profileActivity2.getMessagesController().p5(profileActivity2.e1, 0, true, new hi.ea(profileActivity2, true, 2));
                break;
            case 3:
                uv0 uv0Var = (uv0) obj;
                uv0Var.Z0(uv0Var.getTabProgress());
                break;
            case 4:
                ((mw0) obj).c();
                break;
            case 5:
                ((bx0) obj).a();
                break;
            case 6:
                yw0 yw0Var = (yw0) obj;
                yw0Var.f.add(yw0Var.c);
                yw0Var.a();
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
                org.telegram.ui.Components.kc kcVar = (org.telegram.ui.Components.kc) obj;
                if (LaunchActivity.T() != null) {
                    if (kcVar == null) {
                        kcVar = org.telegram.ui.Components.kc.b0(LaunchActivity.T());
                    }
                    if (kcVar != null) {
                        org.telegram.ui.Components.fc I = kcVar.I(R.raw.msg_antispam, org.telegram.messenger.gd.N0(2131746026, null), org.telegram.messenger.gd.N0(2131745989, null));
                        I.j = 5000;
                        I.j();
                        break;
                    }
                }
                break;
            case 10:
                ((xy0) obj).invalidate();
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
                vf.c.t(x20Var.getContext(), org.telegram.messenger.gd.N0(2131746422, null));
                break;
            case 13:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) ((org.telegram.ui.Components.f10) obj).c;
                Runnable runnable = secretMediaViewer.n0;
                if (runnable != null) {
                    runnable.run();
                    secretMediaViewer.n0 = null;
                    break;
                }
                break;
            case 14:
                sz0 sz0Var = ((rz0) obj).a;
                sz0Var.R = true;
                sz0Var.O.invalidate();
                break;
            case 15:
                ((org.telegram.messenger.ks) obj).o();
                break;
            case 16:
                org.telegram.messenger.g0.T3(((i01) obj).c, true, true);
                break;
            case 17:
                org.telegram.ui.Components.b51 b51Var = ((a21) obj).e2;
                if (b51Var != null) {
                    b51Var.O(true);
                    break;
                }
                break;
            case 18:
                ((t11) obj).a();
                break;
            case 19:
                kg.f.a(((SessionsActivity) obj).currentAccount).b();
                break;
            case 20:
                b51 b51Var2 = (b51) obj;
                b51Var2.n0.a(b51Var2.k0.f0, b51Var2.l0.isAttachedToWindow());
                break;
            case 21:
                ((z81) obj).J.r.f();
                break;
            case 22:
                ((h91) obj).b.G0();
                break;
            case 23:
                ((VoIPFeedbackActivity) obj).finish();
                break;
            case 24:
                ((wb1) obj).a.y();
                break;
            case 25:
                ((xb1) obj).a.y();
                break;
            case 26:
                fc1 fc1Var = ((vb1) obj).b;
                fc1Var.L0.e();
                org.telegram.ui.Components.voip.i2.d().getClass();
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().swapSinks();
                }
                fc1Var.Z.setCornerRadius(-1.0f);
                fc1Var.d0.d.release();
                fc1Var.e0.d.release();
                fc1Var.c0.release();
                fc1Var.c();
                fc1Var.u0.d();
                org.telegram.ui.Components.voip.i2.T = false;
                fc1Var.E0 = false;
                fc1.m1 = null;
                org.telegram.ui.Components.voip.j2.d();
                break;
            case 27:
                dc1 dc1Var = (dc1) obj;
                dc1Var.getClass();
                if (VoIPService.getSharedState() != null) {
                    VoIPService.getSharedState().acceptIncomingCall();
                    if (dc1Var.a.n0 && VoIPService.getSharedInstance() != null) {
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
