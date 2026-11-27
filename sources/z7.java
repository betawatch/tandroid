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

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class z7 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ z7(byte b, Object obj, boolean z) {
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
                AnimatorSet[] animatorSetArr = ((id) obj).G;
                boolean z = this.b;
                AnimatorSet animatorSet = animatorSetArr[z ? 1 : 0];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    animatorSetArr[z ? 1 : 0] = null;
                    break;
                }
                break;
            case 5:
                sk0 sk0Var = (sk0) obj;
                AnimatorSet animatorSet2 = sk0Var.h;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    sk0Var.h = null;
                    break;
                }
                break;
            case 13:
                ((gi1) obj).r = null;
                break;
            case 14:
                zu1 zu1Var = (zu1) obj;
                AnimatorSet animatorSet3 = zu1Var.W0;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    zu1Var.W0 = null;
                    break;
                }
                break;
            case 15:
                ((n12) obj).V2 = null;
                break;
            case 16:
                ((g92) obj).h = null;
                break;
            case 17:
                this.b = true;
                break;
            case 23:
                ((xn2) obj).y = null;
                break;
            case 24:
                ((cu2) obj).x = null;
                break;
            case 25:
                vw2 vw2Var = (vw2) obj;
                AnimatorSet animatorSet4 = vw2Var.T;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    vw2Var.T = null;
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
        di1 di1Var;
        RadialProgressView radialProgressView;
        RadialProgressView radialProgressView2;
        RadialProgressView radialProgressView3;
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                b8 b8Var = (b8) obj;
                f = this.b ? 1.0f : 0.0f;
                b8Var.setTextColor(vm2.f(f, -1, -9194260));
                b8Var.setIconColor(vm2.f(f, -1, -9194260));
                break;
            case 1:
                AnimatorSet[] animatorSetArr = ((id) obj).G;
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
                oVar.r0.setTranslationY(((1.0f - f) * hl.L(51.0f)) + oVar.q0);
                if (!z2) {
                    oVar.r0.setVisibility(8);
                    break;
                }
                break;
            case 3:
                ((d20) obj).a[this.b ? 1 : 0].setVisibility(8);
                break;
            case 4:
                dc0 dc0Var = (dc0) obj;
                if (!this.b) {
                    dc0Var.setVisibility(4);
                    vh4 vh4Var = ((tb0) dc0Var).H;
                    if (vh4Var.a) {
                        vh4Var.a = false;
                        if (((tb0) vh4Var.d).getParent() != null) {
                            ((WindowManager) vh4Var.c).removeView((tb0) vh4Var.d);
                        }
                        tb0 tb0Var = (tb0) vh4Var.d;
                        tb0Var.F = true;
                        ac0 ac0Var = tb0Var.E;
                        if (ac0Var != null) {
                            if (ac0Var.g) {
                                ac0Var.g = false;
                                ac0Var.b.n(ac0Var.a, ac0Var.e);
                            }
                            tb0Var.E = null;
                        }
                        vh4Var.d = null;
                        ((ViewGroup) vh4Var.b).requestDisallowInterceptTouchEvent(false);
                        vh4Var.b = null;
                        vh4Var.c = null;
                        break;
                    }
                }
                break;
            case 5:
                sk0 sk0Var = (sk0) obj;
                AnimatorSet animatorSet2 = sk0Var.h;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.b) {
                        sk0Var.c.setVisibility(4);
                        break;
                    } else {
                        sk0Var.b.setVisibility(4);
                        break;
                    }
                }
                break;
            case 6:
                kr0 kr0Var = (kr0) obj;
                boolean z3 = this.b;
                kr0Var.x = z3 ? 1.0f : 0.0f;
                kr0Var.r.setTranslationY(hl.L(z3 ? 0.0f : -42.0f));
                kr0Var.n.setTranslationY(hl.L(z3 ? 42.0f : 0.0f));
                break;
            case 7:
                gr0 gr0Var = (gr0) obj;
                o9c o9cVar = gr0Var.h;
                yq0 yq0Var = gr0Var.f;
                br0 br0Var = gr0Var.w;
                gr0Var.b = false;
                boolean z4 = this.b;
                if (z4) {
                    int i = gr0Var.e;
                    gr0Var.d = i;
                    gr0Var.a0.E = i;
                    xea.E(i);
                }
                int b2 = br0Var.b();
                if (z4) {
                    o9cVar.x1(gr0Var.d);
                    yq0Var.c0();
                    if (br0Var.b() == b2) {
                        hl.V3(yq0Var);
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
                    o9cVar.g1(gr0Var.T, (-yq0Var.getPaddingTop()) + gr0Var.U);
                }
                super.onAnimationEnd(animator);
                break;
            case 8:
                xw0 xw0Var = (xw0) obj;
                xw0Var.S0 = this.b ? 1.0f : 0.0f;
                xw0Var.h();
                break;
            case 9:
                v41 v41Var = (v41) obj;
                if (animator == v41Var.g) {
                    v41Var.g = null;
                    v41Var.j = this.b ? 1.0f : 0.0f;
                    v41Var.b();
                    break;
                }
                break;
            case 10:
                c51 c51Var = (c51) obj;
                c51Var.Q = this.b ? 1.0f : 0.0f;
                c51Var.invalidate();
                break;
            case 11:
                qb1 qb1Var = (qb1) obj;
                boolean z5 = this.b;
                if (!z5) {
                    qb1Var.r.setVisibility(8);
                    mb1 mb1Var = qb1Var.N;
                    if (mb1Var != null) {
                        mb1Var.setVisibility(8);
                    }
                }
                if (z5) {
                    qb1Var.f.getEditText().setAllowDrawCursor(true);
                }
                qb1Var.c(z5);
                break;
            case 12:
                ((re1) obj).d.setVisibility(this.b ? 0 : 8);
                break;
            case 13:
                gi1 gi1Var = (gi1) obj;
                if (gi1Var.r != null && (di1Var = gi1Var.n) != null) {
                    if (this.b) {
                        di1Var.setVisibility(4);
                    } else {
                        gi1Var.s.setVisibility(4);
                    }
                    gi1Var.r = null;
                    break;
                }
                break;
            case 14:
                zu1 zu1Var = (zu1) obj;
                AnimatorSet animatorSet3 = zu1Var.W0;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    if (!this.b) {
                        zu1Var.J0.setVisibility(4);
                        break;
                    } else {
                        (zu1Var.F0 ? zu1Var.G0 : zu1Var.E0).setVisibility(4);
                        break;
                    }
                }
                break;
            case 15:
                n12 n12Var = (n12) obj;
                if (n12Var.V2 != null) {
                    if (!this.b) {
                        s7 s7Var = n12Var.b3;
                        if (s7Var != null) {
                            s7Var.setVisibility(4);
                        }
                        if (n12Var.N2 != 0 || !n12Var.n3) {
                            n12Var.X2.setVisibility(4);
                            break;
                        }
                    } else if (n12Var.P2) {
                        f12 f12Var = n12Var.v2;
                        if (f12Var == null || f12Var.M()) {
                            n12Var.u3.setVisibility(4);
                            break;
                        }
                    }
                }
                break;
            case 16:
                g92 g92Var = (g92) obj;
                if (g92Var.h != null && (radialProgressView = g92Var.n) != null) {
                    if (!this.b) {
                        radialProgressView.setVisibility(4);
                        g92Var.f.setVisibility(4);
                    }
                    g92Var.h = null;
                    break;
                }
                break;
            case 17:
                y92 y92Var = (y92) obj;
                if (!this.b) {
                    de0 de0Var = y92Var.h;
                    y92Var.h = y92Var.n;
                    y92Var.n = de0Var;
                    de0Var.setVisibility(8);
                    y92Var.n.setAlpha(0.0f);
                    y92Var.h.setVisibility(0);
                    y92Var.h.setAlpha(1.0f);
                    break;
                }
                break;
            case 18:
                wb2 wb2Var = (wb2) obj;
                dc2 dc2Var = wb2Var.ub;
                int b3 = dc2Var.b();
                int i3 = wb2Var.Cb;
                if (i3 == b3) {
                    wb2Var.Fb = false;
                    dc2Var.b2 = i3;
                    break;
                } else {
                    wb2Var.C0(i3, b3, this.b);
                    break;
                }
            case 19:
                boolean z6 = this.b;
                sd2 sd2Var = (sd2) obj;
                if (animator == sd2Var.e) {
                    f = z6 ? 1.0f : 0.0f;
                    sd2Var.d = f;
                    sd2Var.setShown(f);
                    if (!z6) {
                        sd2Var.setVisibility(8);
                    }
                    sd2Var.a(true);
                    break;
                }
                break;
            case 20:
                oe2 oe2Var = (oe2) obj;
                oe2Var.Z1 = this.b ? 1.0f : 0.0f;
                oe2Var.C1.setTranslationY((-hl.L(7.0f)) * oe2Var.Z1);
                break;
            case 21:
                el2 el2Var = (el2) obj;
                iw iwVar = el2Var.a;
                boolean z7 = this.b;
                el2Var.d = z7 ? 1.0f : 0.0f;
                iwVar.invalidate();
                iwVar.setVisibility(z7 ? 0 : 8);
                break;
            case 22:
                if (!this.b) {
                    ((p) obj).I.setVisibility(8);
                    break;
                }
                break;
            case 23:
                xn2 xn2Var = (xn2) obj;
                if (xn2Var.y != null && (radialProgressView2 = xn2Var.E) != null) {
                    if (!this.b) {
                        radialProgressView2.setVisibility(4);
                        xn2Var.w.setVisibility(4);
                    }
                    xn2Var.y = null;
                    break;
                }
                break;
            case 24:
                cu2 cu2Var = (cu2) obj;
                if (cu2Var.x != null && (radialProgressView3 = cu2Var.s) != null) {
                    if (!this.b) {
                        radialProgressView3.setVisibility(4);
                        cu2Var.w.setVisibility(4);
                    }
                    cu2Var.x = null;
                    break;
                }
                break;
            case 25:
                vw2 vw2Var = (vw2) obj;
                AnimatorSet animatorSet4 = vw2Var.T;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    vw2Var.T = null;
                    if (!this.b) {
                        vw2Var.setBackgroundColor(0);
                        break;
                    }
                }
                break;
            case 26:
                if (this.b) {
                    ((b43) obj).d(false, false, true, false);
                    break;
                }
                break;
            case 27:
                e53 e53Var = (e53) obj;
                i49 i49Var = e53Var.n;
                e53Var.k();
                e53Var.l();
                boolean z8 = this.b;
                e53Var.a(z8);
                e53Var.m.invalidateOutline();
                e53Var.j = z8 ? 1.0f : 0.0f;
                if (z8) {
                    e53Var.k = true;
                    e53Var.a.invalidate();
                }
                i49Var.setCustomEmojiEnterProgress(Utilities.i(e53Var.j, 1.0f, 0.0f));
                if (!z8) {
                    i49Var.setImportantForAccessibility(0);
                    i49Var.setSkipDraw(false);
                    e53Var.f();
                    Runtime.getRuntime().gc();
                    byte b4 = e53Var.y;
                    i49Var.setCustomEmojiReactionsBackground((b4 == 4 || b4 == 5) ? false : true);
                }
                e53Var.C = false;
                break;
            case 28:
                pg3 pg3Var = (pg3) obj;
                pg3Var.e0 = this.b ? 1.0f : 0.0f;
                pg3Var.b();
                break;
            default:
                uy3 uy3Var = (uy3) obj;
                xy3 xy3Var = uy3Var.O;
                if (xy3Var.U && !uy3Var.h) {
                    if (!this.b && !uy3Var.n) {
                        uy3Var.setBackground(null);
                        break;
                    } else if (uy3Var.getBackground() == null) {
                        uy3Var.setBackground(aob.Y(xy3Var.k(), 8, 8));
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
                    ((pg3) this.c).performHapticFeedback(3);
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
    public /* synthetic */ z7(Object obj, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
    }

    public z7(y92 y92Var) {
        this.a = (byte) 17;
        this.c = y92Var;
    }
}
