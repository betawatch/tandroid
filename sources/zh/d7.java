package zh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.SurfaceView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Components.lj0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class d7 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ u7 b;

    public /* synthetic */ d7(u7 u7Var, int i10) {
        this.a = i10;
        this.b = u7Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        a3 t10;
        lj0 lj0Var;
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                u7 u7Var = this.b;
                r7 r7Var = u7Var.s0;
                j7 j7Var = u7Var.v;
                if (j7Var != null) {
                    j7Var.a(true);
                }
                u7Var.o();
                u7Var.J0.unlock();
                n5 n5Var = u7Var.u1;
                if (n5Var != null) {
                    n5Var.b();
                    AndroidUtilities.removeFromParent(u7Var.u1);
                    u7Var.u1 = null;
                }
                ImageReceiver imageReceiver = r7Var.b;
                if (imageReceiver != null) {
                    imageReceiver.setVisible(true, true);
                    r7Var.b = null;
                }
                ImageReceiver imageReceiver2 = r7Var.c;
                if (imageReceiver2 != null) {
                    imageReceiver2.setAlpha(1.0f);
                    r7Var.c.setVisible(true, true);
                }
                if (r7Var.d != null && (t10 = u7Var.t()) != null && (lj0Var = t10.o1.d) != null) {
                    lj0 lj0Var2 = r7Var.d;
                    lj0Var2.getClass();
                    lj0Var2.c = lj0Var.c;
                    lj0Var2.f = lj0Var.f;
                    lj0Var2.b = lj0Var.b;
                    lj0Var2.a = System.currentTimeMillis();
                    lj0Var2.c();
                }
                k2.v vVar = u7Var.G0;
                if (vVar != null) {
                    vVar.b();
                }
                SurfaceView surfaceView = u7Var.C0;
                if (surfaceView != null) {
                    surfaceView.setVisibility(4);
                }
                u7Var.I();
                try {
                    AndroidUtilities.runOnUIThread(new k5(this, 8));
                } catch (Exception unused) {
                }
                u7Var.m0 = false;
                u7Var.d = false;
                j2 j2Var = u7Var.o1;
                if (j2Var != null) {
                    j2Var.run();
                    u7Var.o1 = null;
                    break;
                }
                break;
            case 1:
                u7 u7Var2 = this.b;
                u7Var2.H = null;
                u7Var2.Z = 0.0f;
                u7Var2.d0 = 0.0f;
                k7 k7Var = u7Var2.n0;
                a3 currentPeerView = k7Var != null ? k7Var.getCurrentPeerView() : null;
                if (currentPeerView != null) {
                    currentPeerView.invalidate();
                    break;
                }
                break;
            default:
                u7 u7Var3 = this.b;
                r7 r7Var2 = u7Var3.s0;
                u7Var3.U = 1.0f;
                u7Var3.o();
                u7.x1 = false;
                j7 j7Var2 = u7Var3.v;
                if (j7Var2 != null) {
                    j7Var2.a(true);
                }
                i7 i7Var = u7Var3.s;
                if (i7Var != null) {
                    i7Var.invalidate();
                }
                ImageReceiver imageReceiver3 = r7Var2.b;
                if (imageReceiver3 != null && !u7Var3.d) {
                    imageReceiver3.setVisible(true, true);
                    r7Var2.b = null;
                }
                ImageReceiver imageReceiver4 = r7Var2.c;
                if (imageReceiver4 != null && !u7Var3.d) {
                    imageReceiver4.setAlpha(1.0f);
                    r7Var2.c.setVisible(true, true);
                    r7Var2.c = null;
                }
                a3 t11 = u7Var3.t();
                if (t11 != null) {
                    t11.f1(false);
                }
                t0 t0Var = u7Var3.A0;
                if (t0Var != null) {
                    t0Var.v((1.0f - u7Var3.V) * u7Var3.U);
                }
                if (u7Var3.w1) {
                    u7Var3.w1 = false;
                    u7Var3.p();
                    AndroidUtilities.runOnUIThread(new j2(u7Var3, 1), 30L);
                } else if (!SharedConfig.storiesIntroShown) {
                    if (u7Var3.u1 == null && u7Var3.v != null) {
                        n5 n5Var2 = new n5(u7Var3.v.getContext(), u7Var3.s);
                        u7Var3.u1 = n5Var2;
                        n5Var2.setAlpha(0.0f);
                        u7Var3.v.addView(u7Var3.u1);
                    }
                    n5 n5Var3 = u7Var3.u1;
                    if (n5Var3 != null) {
                        n5Var3.setOnClickListener(new org.telegram.ui.web.c(this, 28));
                        u7Var3.u1.animate().alpha(1.0f).setDuration(150L).setListener(new n7(this, 1)).start();
                    }
                    SharedConfig.setStoriesIntroShown(true);
                }
                u7Var3.P();
                u7Var3.J0.unlock();
                break;
        }
    }
}
