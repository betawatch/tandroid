// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class rw extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ rw(Object obj, Object obj2, boolean z, byte b) {
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
        lq9 lq9Var;
        float f;
        jy9 jy9Var;
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.d;
        switch (b) {
            case 0:
                tw twVar = (tw) obj2;
                twVar.y = this.b ? 1.0f : 0.0f;
                if (!twVar.n) {
                    twVar.A();
                }
                twVar.t();
                c1 c1Var = (c1) obj;
                if (c1Var != null) {
                    c1Var.run();
                }
                twVar.r();
                break;
            case 1:
                zu1 zu1Var = (zu1) obj2;
                if (!this.b) {
                    Bitmap bitmap = zu1Var.R8;
                    if (bitmap != null) {
                        zu1Var.S8 = null;
                        zu1Var.T8 = null;
                        bitmap.recycle();
                        zu1Var.R8 = null;
                    }
                    wb2 wb2Var = (wb2) obj;
                    if (wb2Var != null) {
                        wb2Var.invalidate();
                    }
                    zu1Var.Nb(null);
                    zu1Var.c9 = null;
                    zu1Var.m1.invalidate();
                    zu1Var.A0.invalidate();
                    break;
                }
                break;
            case 2:
                ArrayList arrayList = (ArrayList) obj;
                ((g92) obj2).O.setVisibility(this.b ? 0 : 8);
                for (int i = 0; i < arrayList.size(); i++) {
                    ((View) arrayList.get(i)).setTranslationY(0.0f);
                }
                break;
            case 3:
                super.onAnimationEnd(animator);
                e53 e53Var = (e53) obj2;
                e53Var.E.remove((ValueAnimator) obj);
                e53Var.a(this.b);
                break;
            case 4:
                j95 j95Var = (j95) obj2;
                k75 k75Var = j95Var.s4;
                ka5 ka5Var = (ka5) obj;
                if (ka5Var != null) {
                    ka5Var.f = false;
                }
                jn7.f(j95Var.n1.a).j(j95Var.S4);
                j95Var.R4 = false;
                boolean z = this.b;
                float f2 = z ? 1.0f : 0.0f;
                j95Var.W3 = f2;
                j95Var.T3.n = f2;
                if (z) {
                    k75Var.setAlpha(1.0f);
                    k75Var.setScaleX(1.0f);
                    k75Var.setScaleY(1.0f);
                    k75Var.setTranslationX(0.0f);
                    k75Var.setTranslationY(0.0f);
                } else {
                    j95Var.L4.setAlpha(0);
                    j95Var.S0();
                    if (j95Var.X3.getParent() != null) {
                        j95Var.b.removeView(j95Var.X3);
                    }
                    j95Var.X3 = null;
                    k75Var.setVisibility(8);
                    j95Var.Y3 = false;
                    j95Var.R1.X = true;
                    j95Var.U3.setVisibility(8);
                    if (j95Var.l2) {
                        j95Var.l2 = false;
                        j95Var.E0(true);
                    }
                    ka5 ka5Var2 = j95Var.O4;
                    if (ka5Var2 != null) {
                        ka5Var2.a.setRoundCorners(0.0f);
                    }
                }
                j95Var.J0();
                j95Var.b.invalidate();
                j95Var.l1.invalidate();
                j95Var.J1.invalidate();
                break;
            case 5:
                ka5 ka5Var3 = (ka5) obj2;
                ka5 ka5Var4 = (ka5) obj;
                ka5Var4.setScaleX(1.0f);
                ka5Var4.setScaleY(1.0f);
                ka5Var4.setAlpha(1.0f);
                if (this.b) {
                    ka5Var3.y.removeView(ka5Var4);
                    ka5Var3.e();
                }
                ka5Var4.setVisibility(8);
                break;
            case 6:
                cna cnaVar = (cna) obj;
                qh6 qh6Var = (qh6) obj2;
                if (!qh6Var.K && this.b) {
                    qh6Var.K1(true, true);
                }
                cnaVar.setVisibility(8);
                cnaVar.g();
                cnaVar.setX(0.0f);
                break;
            case 7:
                ji8 ji8Var = (ji8) obj2;
                ji8Var.E = this.b ? 1.0f : 0.0f;
                ji8Var.c.invalidate();
                ji8Var.d.invalidate();
                ji8Var.e();
                bi8 bi8Var = (bi8) obj;
                if (bi8Var != null) {
                    bi8Var.run();
                    break;
                }
                break;
            case 8:
                jz8 jz8Var = (jz8) obj2;
                if (jz8Var.U == animator) {
                    jz8Var.U = null;
                }
                if (!this.b) {
                    ((Runnable) obj).run();
                    break;
                }
                break;
            case 9:
                rz8 rz8Var = (rz8) obj2;
                rz8Var.k0();
                rz8Var.d.setReveal(this.b ? 1.0f : 0.0f);
                ((Runnable) obj).run();
                break;
            case 10:
                ((dr9) obj2).P.k0 = null;
                if (!this.b && (lq9Var = (lq9) obj) != null) {
                    lq9Var.run();
                    break;
                }
                break;
            case 11:
                mu9 mu9Var = (mu9) obj2;
                f = this.b ? 1.0f : 0.0f;
                mu9Var.r = f;
                mu9Var.E.setScaleX(hl.R1(0.8f, 1.0f, f));
                mu9Var.E.setScaleY(hl.R1(0.8f, 1.0f, mu9Var.r));
                mu9Var.E.setAlpha(mu9Var.r);
                mu9Var.s.invalidate();
                mu9Var.w.invalidate();
                Runnable runnable = (Runnable) obj;
                if (runnable != null) {
                    hl.c3(runnable);
                    break;
                }
                break;
            case 12:
                ky9 ky9Var = (ky9) obj2;
                ky9Var.s = this.b ? 1.0f : 0.0f;
                ky9Var.b.invalidate();
                ky9Var.c.invalidate();
                ky9Var.e();
                TextView textView = ky9Var.E;
                if (textView != null) {
                    textView.setAlpha(ky9Var.s);
                }
                if (ky9Var.T) {
                    ky9Var.O.invalidate();
                }
                if (!ky9Var.T && (jy9Var = ky9Var.O) != null && jy9Var.getSeekBarWaveform() != null) {
                    xy9 seekBarWaveform = ky9Var.O.getSeekBarWaveform();
                    seekBarWaveform.L = ky9Var.s;
                    wb2 wb2Var2 = seekBarWaveform.n;
                    if (wb2Var2 != null) {
                        wb2Var2.invalidate();
                    }
                }
                fy9 fy9Var = (fy9) obj;
                if (fy9Var != null) {
                    fy9Var.run();
                    break;
                }
                break;
            case 13:
                k8b k8bVar = (k8b) obj2;
                u1 u1Var = k8bVar.c;
                f = this.b ? 1.0f : 0.0f;
                k8bVar.E = f;
                u1Var.setAlpha(f);
                u1Var.setScaleX(hl.R1(0.9f, 1.0f, k8bVar.E));
                u1Var.setScaleY(hl.R1(0.9f, 1.0f, k8bVar.E));
                k8bVar.b.invalidate();
                f8b f8bVar = (f8b) obj;
                if (f8bVar != null) {
                    hl.c3(f8bVar);
                    break;
                }
                break;
            case 14:
                ((sbb) obj2).m0();
                if (!this.b) {
                    ((View) obj).setVisibility(8);
                    break;
                }
                break;
            default:
                ktb ktbVar = (ktb) obj2;
                ktbVar.y = this.b ? 1.0f : 0.0f;
                ktbVar.b.invalidate();
                ktbVar.c.invalidate();
                ktbVar.e();
                q38 q38Var = (q38) obj;
                if (q38Var != null) {
                    q38Var.run();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ rw(FrameLayout frameLayout, Runnable runnable, byte b) {
        this.a = b;
        this.d = frameLayout;
        this.c = runnable;
    }

    public /* synthetic */ rw(Object obj, boolean z, Object obj2, byte b) {
        this.a = b;
        this.d = obj;
        this.b = z;
        this.c = obj2;
    }
}
