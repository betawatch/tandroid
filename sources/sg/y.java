package sg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.tz;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.mj0;
import org.telegram.ui.Components.oh;
import org.telegram.ui.Components.s51;
import org.telegram.ui.g3;
import org.telegram.ui.nb0;
import th.o7;
import th.p1;
import th.s0;
import th.w0;
import th.z2;
import vh.b4;
import vh.k2;
import vh.o8;
import vh.p6;
import vh.y2;
import xh.m2;
import zf.a1;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class y extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ y(int i10, Object obj, boolean z10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 16:
                ((yh.l) this.c).y = null;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        s0 s0Var;
        View m10;
        RadialProgressView radialProgressView;
        switch (this.a) {
            case 0:
                b0 b0Var = (b0) this.c;
                mj0 mj0Var = b0Var.n;
                b0Var.k();
                b0Var.l();
                boolean z10 = this.b;
                b0.a(b0Var, z10);
                b0Var.m.invalidateOutline();
                b0Var.j = z10 ? 1.0f : 0.0f;
                if (z10) {
                    b0Var.k = true;
                    b0Var.a.invalidate();
                }
                mj0Var.setCustomEmojiEnterProgress(Utilities.i(b0Var.j, 1.0f, 0.0f));
                if (!z10) {
                    mj0Var.setImportantForAccessibility(0);
                    mj0Var.setSkipDraw(false);
                    b0Var.f();
                    Runtime.getRuntime().gc();
                    int i10 = b0Var.y;
                    mj0Var.setCustomEmojiReactionsBackground((i10 == 4 || i10 == 5) ? false : true);
                }
                b0Var.C = false;
                break;
            case 1:
                th.m mVar = (th.m) this.c;
                mVar.d0 = this.b ? 1.0f : 0.0f;
                mVar.b();
                break;
            case 2:
                p1 p1Var = (p1) this.c;
                nb0 nb0Var = p1Var.c;
                boolean z11 = this.b;
                nb0Var.setAlpha(z11 ? 0.0f : 1.0f);
                p1Var.a.setAlpha(z11 ? 0.0f : 0.5f);
                p1Var.invalidate();
                break;
            case 3:
                w0 w0Var = (w0) this.c;
                w0Var.b.removeViewImmediate(w0Var.d);
                w0Var.f.b();
                if (this.b && (s0Var = w0Var.w) != null && s0Var != s0.W) {
                    s0Var.e();
                }
                w0Var.w = null;
                w0Var.s = true;
                w0Var.G = null;
                w0Var.E = false;
                break;
            case 4:
                o7 o7Var = (o7) this.c;
                o7Var.J0.e();
                o7Var.e0 = this.b ? o7Var.x.c : 0.0f;
                z2 currentPeerView = o7Var.n0.getCurrentPeerView();
                if (currentPeerView != null) {
                    currentPeerView.invalidate();
                }
                o7Var.w.invalidate();
                o7Var.v1 = null;
                break;
            case 5:
                uh.m mVar2 = (uh.m) this.c;
                boolean z12 = this.b;
                mVar2.x = z12 ? 1.0f : 0.0f;
                mVar2.r.setTranslationY(org.telegram.messenger.i0.L(z12 ? 0.0f : -42.0f));
                mVar2.n.setTranslationY(org.telegram.messenger.i0.L(z12 ? 42.0f : 0.0f));
                break;
            case 6:
                uh.i iVar = (uh.i) this.c;
                s51 s51Var = iVar.h;
                uh.c cVar = iVar.f;
                uh.e eVar = iVar.w;
                iVar.b = false;
                boolean z13 = this.b;
                if (z13) {
                    int i11 = iVar.e;
                    iVar.d = i11;
                    iVar.W.D = i11;
                    tz.F(i11);
                }
                int b10 = eVar.b();
                if (z13) {
                    s51Var.y1(iVar.d);
                    cVar.a0();
                    if (eVar.b() == b10) {
                        org.telegram.messenger.i0.a4(cVar);
                    } else {
                        eVar.f();
                    }
                }
                iVar.r.setVisibility(8);
                int i12 = iVar.S;
                if (i12 >= 0) {
                    if (z13 && (m10 = iVar.s.m(i12)) != null) {
                        iVar.T = m10.getTop();
                    }
                    s51Var.h1(iVar.S, (-cVar.getPaddingTop()) + iVar.T);
                }
                super.onAnimationEnd(animator);
                break;
            case 7:
                vh.d dVar = (vh.d) this.c;
                dVar.P = this.b ? 1.0f : 0.0f;
                dVar.invalidate();
                break;
            case 8:
                vh.k kVar = (vh.k) this.c;
                boolean z14 = this.b;
                if (!z14) {
                    kVar.r.setVisibility(8);
                    oh ohVar = kVar.M;
                    if (ohVar != null) {
                        ohVar.setVisibility(8);
                    }
                }
                if (z14) {
                    kVar.f.getEditText().setAllowDrawCursor(true);
                }
                kVar.c(z14);
                break;
            case 9:
                vh.t tVar = (vh.t) this.c;
                g3 g3Var = tVar.a;
                boolean z15 = this.b;
                tVar.d = z15 ? 1.0f : 0.0f;
                g3Var.invalidate();
                g3Var.setVisibility(z15 ? 0 : 8);
                break;
            case 10:
                if (!this.b) {
                    ((k2) this.c).I.setVisibility(8);
                    break;
                }
                break;
            case 11:
                if (!this.b) {
                    ((y2) this.c).b.setVisibility(8);
                    break;
                }
                break;
            case 12:
                b4 b4Var = (b4) this.c;
                if (!this.b) {
                    b4Var.I1.setVisibility(8);
                    b4Var.I1.n();
                    break;
                }
                break;
            case 13:
                p6 p6Var = (p6) this.c;
                if (this.b) {
                    p6Var.setVisibility(8);
                }
                p6Var.c = null;
                break;
            case 14:
                o8 o8Var = (o8) this.c;
                if (!this.b) {
                    o8Var.V0.setVisibility(8);
                }
                o8Var.f2 = null;
                break;
            case 15:
                m2 m2Var = (m2) this.c;
                m2Var.R0 = this.b ? 1.0f : 0.0f;
                m2Var.l();
                break;
            case 16:
                yh.l lVar = (yh.l) this.c;
                if (lVar.y != null && (radialProgressView = lVar.D) != null) {
                    if (!this.b) {
                        radialProgressView.setVisibility(4);
                        lVar.w.setVisibility(4);
                    }
                    lVar.y = null;
                    break;
                }
                break;
            default:
                a1 a1Var = (a1) this.c;
                boolean z16 = this.b;
                a1Var.e = z16 ? 1.0f : 0.0f;
                a1Var.invalidate();
                int i13 = 0;
                while (i13 < 2) {
                    a1Var.c[i13].setTranslationX(org.telegram.messenger.i0.W1(a1Var.e, 0, -org.telegram.messenger.i0.L(62.0f)));
                    a1Var.c[i13].setVisibility((i13 == 1) == z16 ? 0 : 8);
                    a1Var.c[i13].setAlpha(org.telegram.messenger.i0.T1(i13 == 0 ? 1.0f : 0.0f, i13 == 1 ? 1.0f : 0.0f, a1Var.e));
                    a1Var.d[i13].setTranslationX(org.telegram.messenger.i0.W1(a1Var.e, 0, -org.telegram.messenger.i0.L(62.0f)));
                    a1Var.d[i13].setVisibility((i13 == 1) == z16 ? 0 : 8);
                    a1Var.d[i13].setAlpha(org.telegram.messenger.i0.T1(i13 == 0 ? 1.0f : 0.0f, i13 == 1 ? 1.0f : 0.0f, a1Var.e));
                    i13++;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 1:
                super.onAnimationStart(animator);
                try {
                    ((th.m) this.c).performHapticFeedback(3);
                    break;
                } catch (Exception unused) {
                    return;
                }
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
