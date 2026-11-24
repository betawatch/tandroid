// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.p;
import org.telegram.ui.o;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class y7 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ y7(byte b, Object obj, boolean z) {
        this.a = b;
        this.c = obj;
        this.b = z;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 1:
                AnimatorSet[] animatorSetArr = ((hd) obj).G;
                boolean z = this.b;
                AnimatorSet animatorSet = animatorSetArr[z ? 1 : 0];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    animatorSetArr[z ? 1 : 0] = null;
                    break;
                }
                break;
            case 5:
                rk0 rk0Var = (rk0) obj;
                AnimatorSet animatorSet2 = rk0Var.h;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    rk0Var.h = null;
                    break;
                }
                break;
            case 13:
                ((yh1) obj).r = null;
                break;
            case 14:
                mu1 mu1Var = (mu1) obj;
                AnimatorSet animatorSet3 = mu1Var.W0;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    mu1Var.W0 = null;
                    break;
                }
                break;
            case 15:
                ((x02) obj).V2 = null;
                break;
            case 16:
                ((p82) obj).h = null;
                break;
            case 17:
                this.b = true;
                break;
            case 23:
                ((en2) obj).y = null;
                break;
            case 24:
                ((it2) obj).x = null;
                break;
            case 25:
                bw2 bw2Var = (bw2) obj;
                AnimatorSet animatorSet4 = bw2Var.T;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    bw2Var.T = null;
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
        float f;
        View m;
        vh1 vh1Var;
        RadialProgressView radialProgressView;
        RadialProgressView radialProgressView2;
        RadialProgressView radialProgressView3;
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                a8 a8Var = (a8) obj;
                f = this.b ? 1.0f : 0.0f;
                a8Var.setTextColor(bm2.f(f, -1, -9194260));
                a8Var.setIconColor(bm2.f(f, -1, -9194260));
                break;
            case 1:
                AnimatorSet[] animatorSetArr = ((hd) obj).G;
                boolean z = this.b;
                AnimatorSet animatorSet = animatorSetArr[z ? 1 : 0];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    animatorSetArr[z ? 1 : 0] = null;
                    break;
                }
                break;
            case 2:
                o oVar = (o) obj;
                boolean z2 = this.b;
                f = z2 ? 1.0f : 0.0f;
                oVar.a1 = f;
                oVar.r0.setTranslationY(((1.0f - f) * gl.L(51.0f)) + oVar.q0);
                if (!z2) {
                    oVar.r0.setVisibility(8);
                    break;
                }
                break;
            case 3:
                ((c20) obj).a[this.b ? 1 : 0].setVisibility(8);
                break;
            case 4:
                bc0 bc0Var = (bc0) obj;
                if (!this.b) {
                    bc0Var.setVisibility(4);
                    xf4 xf4Var = ((rb0) bc0Var).H;
                    if (xf4Var.a) {
                        xf4Var.a = false;
                        if (((rb0) xf4Var.d).getParent() != null) {
                            ((WindowManager) xf4Var.c).removeView((rb0) xf4Var.d);
                        }
                        rb0 rb0Var = (rb0) xf4Var.d;
                        rb0Var.F = true;
                        yb0 yb0Var = rb0Var.E;
                        if (yb0Var != null) {
                            if (yb0Var.g) {
                                yb0Var.g = false;
                                yb0Var.b.n(yb0Var.a, yb0Var.e);
                            }
                            rb0Var.E = null;
                        }
                        xf4Var.d = null;
                        ((ViewGroup) xf4Var.b).requestDisallowInterceptTouchEvent(false);
                        xf4Var.b = null;
                        xf4Var.c = null;
                        break;
                    }
                }
                break;
            case 5:
                rk0 rk0Var = (rk0) obj;
                AnimatorSet animatorSet2 = rk0Var.h;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.b) {
                        rk0Var.c.setVisibility(4);
                        break;
                    } else {
                        rk0Var.b.setVisibility(4);
                        break;
                    }
                }
                break;
            case 6:
                kr0 kr0Var = (kr0) obj;
                boolean z3 = this.b;
                kr0Var.x = z3 ? 1.0f : 0.0f;
                kr0Var.r.setTranslationY(gl.L(z3 ? 0.0f : -42.0f));
                kr0Var.n.setTranslationY(gl.L(z3 ? 42.0f : 0.0f));
                break;
            case 7:
                gr0 gr0Var = (gr0) obj;
                o5c o5cVar = gr0Var.h;
                yq0 yq0Var = gr0Var.f;
                br0 br0Var = gr0Var.w;
                gr0Var.b = false;
                boolean z4 = this.b;
                if (z4) {
                    int i = gr0Var.e;
                    gr0Var.d = i;
                    gr0Var.a0.E = i;
                    gba.E(i);
                }
                int b2 = br0Var.b();
                if (z4) {
                    o5cVar.x1(gr0Var.d);
                    yq0Var.b0();
                    if (br0Var.b() == b2) {
                        gl.V3(yq0Var);
                    } else {
                        br0Var.f();
                    }
                }
                gr0Var.r.setVisibility(8);
                int i2 = gr0Var.T;
                if (i2 >= 0) {
                    if (z4 && (m = gr0Var.s.m(i2)) != null) {
                        gr0Var.U = m.getTop();
                    }
                    o5cVar.g1(gr0Var.T, (-yq0Var.getPaddingTop()) + gr0Var.U);
                }
                super.onAnimationEnd(animator);
                break;
            case 8:
                ow0 ow0Var = (ow0) obj;
                ow0Var.S0 = this.b ? 1.0f : 0.0f;
                ow0Var.h();
                break;
            case 9:
                n41 n41Var = (n41) obj;
                if (animator == n41Var.g) {
                    n41Var.g = null;
                    n41Var.j = this.b ? 1.0f : 0.0f;
                    n41Var.b();
                    break;
                }
                break;
            case 10:
                u41 u41Var = (u41) obj;
                u41Var.Q = this.b ? 1.0f : 0.0f;
                u41Var.invalidate();
                break;
            case 11:
                ib1 ib1Var = (ib1) obj;
                boolean z5 = this.b;
                if (!z5) {
                    ib1Var.r.setVisibility(8);
                    eb1 eb1Var = ib1Var.N;
                    if (eb1Var != null) {
                        eb1Var.setVisibility(8);
                    }
                }
                if (z5) {
                    ib1Var.f.getEditText().setAllowDrawCursor(true);
                }
                ib1Var.c(z5);
                break;
            case 12:
                ((ie1) obj).d.setVisibility(this.b ? 0 : 8);
                break;
            case 13:
                yh1 yh1Var = (yh1) obj;
                if (yh1Var.r != null && (vh1Var = yh1Var.n) != null) {
                    if (this.b) {
                        vh1Var.setVisibility(4);
                    } else {
                        yh1Var.s.setVisibility(4);
                    }
                    yh1Var.r = null;
                    break;
                }
                break;
            case 14:
                mu1 mu1Var = (mu1) obj;
                AnimatorSet animatorSet3 = mu1Var.W0;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    if (!this.b) {
                        mu1Var.J0.setVisibility(4);
                        break;
                    } else {
                        (mu1Var.F0 ? mu1Var.G0 : mu1Var.E0).setVisibility(4);
                        break;
                    }
                }
                break;
            case 15:
                x02 x02Var = (x02) obj;
                if (x02Var.V2 != null) {
                    if (!this.b) {
                        r7 r7Var = x02Var.b3;
                        if (r7Var != null) {
                            r7Var.setVisibility(4);
                        }
                        if (x02Var.N2 != 0 || !x02Var.n3) {
                            x02Var.X2.setVisibility(4);
                            break;
                        }
                    } else if (x02Var.P2) {
                        p02 p02Var = x02Var.v2;
                        if (p02Var == null || p02Var.N()) {
                            x02Var.u3.setVisibility(4);
                            break;
                        }
                    }
                }
                break;
            case 16:
                p82 p82Var = (p82) obj;
                if (p82Var.h != null && (radialProgressView = p82Var.n) != null) {
                    if (!this.b) {
                        radialProgressView.setVisibility(4);
                        p82Var.f.setVisibility(4);
                    }
                    p82Var.h = null;
                    break;
                }
                break;
            case 17:
                i92 i92Var = (i92) obj;
                if (!this.b) {
                    be0 be0Var = i92Var.h;
                    i92Var.h = i92Var.n;
                    i92Var.n = be0Var;
                    be0Var.setVisibility(8);
                    i92Var.n.setAlpha(0.0f);
                    i92Var.h.setVisibility(0);
                    i92Var.h.setAlpha(1.0f);
                    break;
                }
                break;
            case 18:
                gb2 gb2Var = (gb2) obj;
                nb2 nb2Var = gb2Var.ub;
                int b3 = nb2Var.b();
                int i3 = gb2Var.Cb;
                if (i3 == b3) {
                    gb2Var.Fb = false;
                    nb2Var.b2 = i3;
                    break;
                } else {
                    gb2Var.C0(i3, b3, this.b);
                    break;
                }
            case 19:
                boolean z6 = this.b;
                cd2 cd2Var = (cd2) obj;
                if (animator == cd2Var.e) {
                    f = z6 ? 1.0f : 0.0f;
                    cd2Var.d = f;
                    cd2Var.setShown(f);
                    if (!z6) {
                        cd2Var.setVisibility(8);
                    }
                    cd2Var.a(true);
                    break;
                }
                break;
            case 20:
                xd2 xd2Var = (xd2) obj;
                xd2Var.Z1 = this.b ? 1.0f : 0.0f;
                xd2Var.C1.setTranslationY((-gl.L(7.0f)) * xd2Var.Z1);
                break;
            case 21:
                jk2 jk2Var = (jk2) obj;
                hw hwVar = jk2Var.a;
                boolean z7 = this.b;
                jk2Var.d = z7 ? 1.0f : 0.0f;
                hwVar.invalidate();
                hwVar.setVisibility(z7 ? 0 : 8);
                break;
            case 22:
                if (!this.b) {
                    ((p) obj).I.setVisibility(8);
                    break;
                }
                break;
            case 23:
                en2 en2Var = (en2) obj;
                if (en2Var.y != null && (radialProgressView2 = en2Var.E) != null) {
                    if (!this.b) {
                        radialProgressView2.setVisibility(4);
                        en2Var.w.setVisibility(4);
                    }
                    en2Var.y = null;
                    break;
                }
                break;
            case 24:
                it2 it2Var = (it2) obj;
                if (it2Var.x != null && (radialProgressView3 = it2Var.s) != null) {
                    if (!this.b) {
                        radialProgressView3.setVisibility(4);
                        it2Var.w.setVisibility(4);
                    }
                    it2Var.x = null;
                    break;
                }
                break;
            case 25:
                bw2 bw2Var = (bw2) obj;
                AnimatorSet animatorSet4 = bw2Var.T;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    bw2Var.T = null;
                    if (!this.b) {
                        bw2Var.setBackgroundColor(0);
                        break;
                    }
                }
                break;
            case 26:
                if (this.b) {
                    ((j33) obj).d(false, false, true, false);
                    break;
                }
                break;
            case 27:
                m43 m43Var = (m43) obj;
                t09 t09Var = m43Var.n;
                m43Var.k();
                m43Var.l();
                boolean z8 = this.b;
                m43Var.a(z8);
                m43Var.m.invalidateOutline();
                m43Var.j = z8 ? 1.0f : 0.0f;
                if (z8) {
                    m43Var.k = true;
                    m43Var.a.invalidate();
                }
                t09Var.setCustomEmojiEnterProgress(Utilities.i(m43Var.j, 1.0f, 0.0f));
                if (!z8) {
                    t09Var.setImportantForAccessibility(0);
                    t09Var.setSkipDraw(false);
                    m43Var.f();
                    Runtime.getRuntime().gc();
                    byte b4 = m43Var.y;
                    t09Var.setCustomEmojiReactionsBackground((b4 == 4 || b4 == 5) ? false : true);
                }
                m43Var.C = false;
                break;
            case 28:
                vf3 vf3Var = (vf3) obj;
                vf3Var.e0 = this.b ? 1.0f : 0.0f;
                vf3Var.b();
                break;
            default:
                zx3 zx3Var = (zx3) obj;
                cy3 cy3Var = zx3Var.O;
                if (cy3Var.U && !zx3Var.h) {
                    if (!this.b && !zx3Var.n) {
                        zx3Var.setBackground(null);
                        break;
                    } else if (zx3Var.getBackground() == null) {
                        zx3Var.setBackground(bkb.Y(cy3Var.k(), 8, 8));
                        break;
                    }
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 28:
                super.onAnimationStart(animator);
                try {
                    ((vf3) this.c).performHapticFeedback(3);
                    break;
                } catch (Exception unused) {
                    return;
                }
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ y7(Object obj, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
    }

    public y7(i92 i92Var) {
        this.a = (byte) 17;
        this.c = i92Var;
    }
}
