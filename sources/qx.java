// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class qx extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ qx(Object obj, Object obj2, boolean z, byte b) {
        this.a = b;
        this.d = obj;
        this.c = obj2;
        this.b = z;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 8:
                this.b = true;
                break;
            case 9:
            default:
                super.onAnimationCancel(animator);
                break;
            case 10:
                this.b = true;
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        wo9 wo9Var;
        float f;
        rw9 rw9Var;
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.d;
        switch (b) {
            case 0:
                sx sxVar = (sx) obj2;
                sxVar.y = this.b ? 1.0f : 0.0f;
                if (!sxVar.n) {
                    sxVar.A();
                }
                sxVar.u();
                b1 b1Var = (b1) obj;
                if (b1Var != null) {
                    b1Var.run();
                }
                sxVar.r();
                break;
            case 1:
                yv1 yv1Var = (yv1) obj2;
                if (!this.b) {
                    Bitmap bitmap = yv1Var.R8;
                    if (bitmap != null) {
                        yv1Var.S8 = null;
                        yv1Var.T8 = null;
                        bitmap.recycle();
                        yv1Var.R8 = null;
                    }
                    rc2 rc2Var = (rc2) obj;
                    if (rc2Var != null) {
                        rc2Var.invalidate();
                    }
                    yv1Var.Mb(null);
                    yv1Var.c9 = null;
                    yv1Var.m1.invalidate();
                    yv1Var.A0.invalidate();
                    break;
                }
                break;
            case 2:
                ArrayList arrayList = (ArrayList) obj;
                ((ba2) obj2).O.setVisibility(this.b ? 0 : 8);
                for (int i = 0; i < arrayList.size(); i++) {
                    ((View) arrayList.get(i)).setTranslationY(0.0f);
                }
                break;
            case 3:
                super.onAnimationEnd(animator);
                x53 x53Var = (x53) obj2;
                x53Var.E.remove((ValueAnimator) obj);
                x53Var.a(this.b);
                break;
            case 4:
                g95 g95Var = (g95) obj2;
                g75 g75Var = g95Var.s4;
                ha5 ha5Var = (ha5) obj;
                if (ha5Var != null) {
                    ha5Var.f = false;
                }
                nm7.f(g95Var.n1.a).j(g95Var.S4);
                g95Var.R4 = false;
                boolean z = this.b;
                float f2 = z ? 1.0f : 0.0f;
                g95Var.W3 = f2;
                g95Var.T3.n = f2;
                if (z) {
                    g75Var.setAlpha(1.0f);
                    g75Var.setScaleX(1.0f);
                    g75Var.setScaleY(1.0f);
                    g75Var.setTranslationX(0.0f);
                    g75Var.setTranslationY(0.0f);
                } else {
                    g95Var.L4.setAlpha(0);
                    g95Var.R0();
                    if (g95Var.X3.getParent() != null) {
                        g95Var.b.removeView(g95Var.X3);
                    }
                    g95Var.X3 = null;
                    g75Var.setVisibility(8);
                    g95Var.Y3 = false;
                    g95Var.R1.X = true;
                    g95Var.U3.setVisibility(8);
                    if (g95Var.l2) {
                        g95Var.l2 = false;
                        g95Var.D0(true);
                    }
                    ha5 ha5Var2 = g95Var.O4;
                    if (ha5Var2 != null) {
                        ha5Var2.a.setRoundCorners(0.0f);
                    }
                }
                g95Var.I0();
                g95Var.b.invalidate();
                g95Var.l1.invalidate();
                g95Var.J1.invalidate();
                break;
            case 5:
                ha5 ha5Var3 = (ha5) obj2;
                ha5 ha5Var4 = (ha5) obj;
                ha5Var4.setScaleX(1.0f);
                ha5Var4.setScaleY(1.0f);
                ha5Var4.setAlpha(1.0f);
                if (this.b) {
                    ha5Var3.y.removeView(ha5Var4);
                    ha5Var3.e();
                }
                ha5Var4.setVisibility(8);
                break;
            case 6:
                kla klaVar = (kla) obj;
                mh6 mh6Var = (mh6) obj2;
                if (!mh6Var.K && this.b) {
                    mh6Var.K1(true, true);
                }
                klaVar.setVisibility(8);
                klaVar.g();
                klaVar.setX(0.0f);
                break;
            case 7:
                xg8 xg8Var = (xg8) obj2;
                xg8Var.E = this.b ? 1.0f : 0.0f;
                xg8Var.c.invalidate();
                xg8Var.d.invalidate();
                xg8Var.e();
                pg8 pg8Var = (pg8) obj;
                if (pg8Var != null) {
                    pg8Var.run();
                    break;
                }
                break;
            case 8:
                zx8 zx8Var = (zx8) obj2;
                if (zx8Var.U == animator) {
                    zx8Var.U = null;
                }
                if (!this.b) {
                    ((Runnable) obj).run();
                    break;
                }
                break;
            case 9:
                iy8 iy8Var = (iy8) obj2;
                iy8Var.l0();
                iy8Var.d.setReveal(this.b ? 1.0f : 0.0f);
                ((Runnable) obj).run();
                break;
            case 10:
                ((op9) obj2).P.k0 = null;
                if (!this.b && (wo9Var = (wo9) obj) != null) {
                    wo9Var.run();
                    break;
                }
                break;
            case 11:
                vs9 vs9Var = (vs9) obj2;
                f = this.b ? 1.0f : 0.0f;
                vs9Var.r = f;
                vs9Var.E.setScaleX(gm.R1(0.8f, 1.0f, f));
                vs9Var.E.setScaleY(gm.R1(0.8f, 1.0f, vs9Var.r));
                vs9Var.E.setAlpha(vs9Var.r);
                vs9Var.s.invalidate();
                vs9Var.w.invalidate();
                Runnable runnable = (Runnable) obj;
                if (runnable != null) {
                    gm.c3(runnable);
                    break;
                }
                break;
            case 12:
                tw9 tw9Var = (tw9) obj2;
                tw9Var.s = this.b ? 1.0f : 0.0f;
                tw9Var.b.invalidate();
                tw9Var.c.invalidate();
                tw9Var.e();
                TextView textView = tw9Var.E;
                if (textView != null) {
                    textView.setAlpha(tw9Var.s);
                }
                if (tw9Var.T) {
                    tw9Var.O.invalidate();
                }
                if (!tw9Var.T && (rw9Var = tw9Var.O) != null && rw9Var.getSeekBarWaveform() != null) {
                    gx9 seekBarWaveform = tw9Var.O.getSeekBarWaveform();
                    seekBarWaveform.L = tw9Var.s;
                    rc2 rc2Var2 = seekBarWaveform.n;
                    if (rc2Var2 != null) {
                        rc2Var2.invalidate();
                    }
                }
                nw9 nw9Var = (nw9) obj;
                if (nw9Var != null) {
                    nw9Var.run();
                    break;
                }
                break;
            case 13:
                n6b n6bVar = (n6b) obj2;
                t1 t1Var = n6bVar.c;
                f = this.b ? 1.0f : 0.0f;
                n6bVar.E = f;
                t1Var.setAlpha(f);
                t1Var.setScaleX(gm.R1(0.9f, 1.0f, n6bVar.E));
                t1Var.setScaleY(gm.R1(0.9f, 1.0f, n6bVar.E));
                n6bVar.b.invalidate();
                j6b j6bVar = (j6b) obj;
                if (j6bVar != null) {
                    gm.c3(j6bVar);
                    break;
                }
                break;
            case 14:
                ((v9b) obj2).m0();
                if (!this.b) {
                    ((View) obj).setVisibility(8);
                    break;
                }
                break;
            default:
                krb krbVar = (krb) obj2;
                krbVar.y = this.b ? 1.0f : 0.0f;
                krbVar.b.invalidate();
                krbVar.c.invalidate();
                krbVar.e();
                n28 n28Var = (n28) obj;
                if (n28Var != null) {
                    n28Var.run();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ qx(FrameLayout frameLayout, Runnable runnable, byte b) {
        this.a = b;
        this.d = frameLayout;
        this.c = runnable;
    }

    public /* synthetic */ qx(Object obj, boolean z, Object obj2, byte b) {
        this.a = b;
        this.d = obj;
        this.b = z;
        this.c = obj2;
    }
}
