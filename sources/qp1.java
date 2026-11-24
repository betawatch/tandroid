// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class qp1 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public qp1(la2 la2Var, s49 s49Var, int i, View view) {
        this.a = (byte) 1;
        this.e = la2Var;
        this.c = s49Var;
        this.b = i;
        this.d = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                if (this.b != 0) {
                    ((View) this.d).setTranslationY(0.0f);
                    break;
                }
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.e;
        switch (b) {
            case 0:
                mu1 mu1Var = (mu1) obj;
                mu1Var.g6 = true;
                ((d) mu1Var).fragmentBeginToShow = true;
                mu1Var.sa = null;
                gl.d3(new nv0(this, (byte) 28), 32L);
                super.onAnimationEnd(animator);
                mu1Var.m1.invalidate();
                mu1Var.m1.setSkipBackgroundDrawing(false);
                mu1Var.pa = false;
                mu1 mu1Var2 = (mu1) obj2;
                mu1Var2.ra = 0.0f;
                mu1Var2.fragmentView.invalidate();
                mu1Var2.A0.invalidate();
                mu1Var2.qa = null;
                mu1Var.fragmentView.setAlpha(1.0f);
                ((Runnable) obj3).run();
                mu1Var.p1.setTranslationY(0.0f);
                mu1Var2.p1.setTranslationY(0.0f);
                mu1Var2.p1.getAvatarImageView().setTranslationY(0.0f);
                mu1Var.p1.getAvatarImageView().setScaleX(1.0f);
                mu1Var.p1.getAvatarImageView().setScaleY(1.0f);
                mu1Var.p1.getAvatarImageView().setAlpha(1.0f);
                mu1Var2.p1.getAvatarImageView().setScaleX(1.0f);
                mu1Var2.p1.getAvatarImageView().setScaleY(1.0f);
                mu1Var2.p1.getAvatarImageView().setAlpha(1.0f);
                ez1 ez1Var = mu1Var2.b1;
                if (ez1Var != null) {
                    ez1Var.setAlpha(1.0f);
                    break;
                }
                break;
            case 1:
                animator.removeAllListeners();
                la2 la2Var = (la2) obj3;
                s49 s49Var = (s49) obj2;
                la2Var.W(s49Var.a);
                View view = s49Var.a;
                if (view instanceof gb2) {
                    gb2 gb2Var = (gb2) view;
                    if (gb2Var.Ab) {
                        gb2Var.Ab = false;
                        gb2Var.setVisibility(0);
                    }
                    f27 currentMessagesGroup = gb2Var.getCurrentMessagesGroup();
                    if (currentMessagesGroup != null) {
                        e27 e27Var = currentMessagesGroup.m;
                        e27Var.n = 1.0f;
                        e27Var.h = 0.0f;
                        e27Var.f = 0.0f;
                        e27Var.g = 0.0f;
                        e27Var.e = 0.0f;
                        e27Var.j = false;
                    }
                }
                if (la2Var.z.remove(s49Var)) {
                    la2Var.v(s49Var);
                    la2Var.G();
                    break;
                }
                break;
            case 2:
                vt4 vt4Var = (vt4) obj3;
                vt4Var.U = null;
                LinearLayout linearLayout = (LinearLayout) obj2;
                vt4Var.f.removeView(linearLayout);
                linearLayout.setTranslationX(0.0f);
                linearLayout.setAlpha(1.0f);
                LinearLayout linearLayout2 = (LinearLayout) obj;
                linearLayout2.setTranslationX(0.0f);
                linearLayout2.setTranslationY(0.0f);
                linearLayout2.setAlpha(1.0f);
                vt4Var.h.scrollTo(0, this.b);
                vt4Var.E.set(vt4Var.W);
                vt4Var.requestLayout();
                vt4Var.invalidate();
                break;
            case 3:
                rw5 rw5Var = (rw5) obj3;
                rw5Var.W0 = rw5Var.X0;
                rw5Var.X0 = -1;
                rw5Var.V0.invalidate();
                ViewGroup viewGroup = (ViewGroup) obj2;
                if (viewGroup != null && ((ViewGroup) obj) != null) {
                    viewGroup.setVisibility(8);
                }
                if (animator == rw5Var.Z0) {
                    rw5Var.Z0 = null;
                    break;
                }
                break;
            default:
                wt7 wt7Var = (wt7) obj3;
                wt7Var.O0 = wt7Var.P0;
                wt7Var.P0 = -1;
                wt7Var.M0.invalidate();
                ViewGroup viewGroup2 = (ViewGroup) obj2;
                if (viewGroup2 != null && ((ViewGroup) obj) != null) {
                    viewGroup2.setVisibility(8);
                }
                if (animator == wt7Var.R0) {
                    wt7Var.R0 = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.e;
        Object obj3 = this.d;
        switch (b) {
            case 0:
                super.onAnimationStart(animator);
                i = ((d) ((mu1) obj3)).currentAccount;
                this.b = kk7.f(i).q(null, this.b, true);
                break;
            case 1:
                break;
            case 2:
            default:
                super.onAnimationStart(animator);
                break;
            case 3:
                rw5 rw5Var = (rw5) obj2;
                zt7 zt7Var = rw5Var.b1;
                if (((ViewGroup) obj) != null && (viewGroup = (ViewGroup) obj3) != null) {
                    viewGroup.setVisibility(0);
                }
                if (this.b != 2) {
                    m01 currentBrush = rw5Var.M0.getCurrentBrush();
                    if (!(currentBrush instanceof g01) && !(currentBrush instanceof i01)) {
                        zt7Var.b(0.05f, 1.0f);
                        break;
                    } else {
                        zt7Var.b(0.4f, 1.75f);
                        break;
                    }
                } else {
                    rw5Var.setTextWeightRange(rw5Var.I0);
                    break;
                }
                break;
            case 4:
                wt7 wt7Var = (wt7) obj2;
                zt7 zt7Var2 = wt7Var.T0;
                if (((ViewGroup) obj) != null && (viewGroup2 = (ViewGroup) obj3) != null) {
                    viewGroup2.setVisibility(0);
                }
                if (this.b != 2) {
                    m01 currentBrush2 = wt7Var.E0.getCurrentBrush();
                    if (!(currentBrush2 instanceof g01) && !(currentBrush2 instanceof i01)) {
                        zt7Var2.b(0.05f, 1.0f);
                        break;
                    } else {
                        zt7Var2.b(0.4f, 1.75f);
                        break;
                    }
                } else {
                    wt7Var.setTextWeightRange(wt7Var.z0);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ qp1(FrameLayout frameLayout, ViewGroup viewGroup, ViewGroup viewGroup2, int i, byte b) {
        this.a = b;
        this.e = frameLayout;
        this.c = viewGroup;
        this.d = viewGroup2;
        this.b = i;
    }

    public qp1(mu1 mu1Var, mu1 mu1Var2, Runnable runnable) {
        this.a = (byte) 0;
        this.d = mu1Var;
        this.c = mu1Var2;
        this.e = runnable;
    }

    private final void a(Animator animator) {
    }
}
