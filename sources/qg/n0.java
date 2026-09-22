package qg;

import ai.k6;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.widget.ImageView;
import java.util.Iterator;
import org.telegram.ui.s00;
import yh.l7;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class n0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 2:
                ((r0.m0) this.b).a();
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                o0 o0Var = (o0) this.b;
                ImageView imageView = o0Var.c;
                o0Var.c = o0Var.d;
                o0Var.d = imageView;
                imageView.bringToFront();
                o0Var.d.setVisibility(8);
                o0Var.h = null;
                break;
            case 1:
                u1 u1Var = (u1) this.b;
                if (animator == u1Var.r) {
                    u1Var.f = u1Var.h;
                    u1Var.h = -1;
                    u1Var.r = null;
                    break;
                }
                break;
            case 2:
                ((r0.m0) this.b).c();
                break;
            case 3:
                rg.p0 p0Var = (rg.p0) this.b;
                p0Var.n = p0Var.h ? 1.0f : 0.0f;
                p0Var.e();
                break;
            case 4:
                rg.z1 z1Var = (rg.z1) ((ci.c0) this.b).b;
                z1Var.F = true;
                z1Var.invalidate();
                break;
            case 5:
                super.onAnimationEnd(animator);
                sg.e eVar = (sg.e) ((k6) this.b).b;
                eVar.b.d = 0.0f;
                eVar.T = null;
                eVar.h(eVar.I);
                break;
            case 6:
                tg.b bVar = (tg.b) this.b;
                bVar.b = 1.0f;
                bVar.invalidate();
                break;
            case 7:
                vh.h hVar = (vh.h) this.b;
                Iterator it = hVar.h.iterator();
                while (it.hasNext()) {
                    vh.c cVar = (vh.c) it.next();
                    if (hVar.c.size() < hVar.d) {
                        hVar.c.push(cVar);
                    }
                    it.remove();
                }
                Runnable runnable = hVar.q;
                if (runnable != null) {
                    runnable.run();
                    hVar.q = null;
                }
                hVar.r = null;
                hVar.invalidateSelf();
                break;
            case 8:
                ((xh.h0) this.b).b.w.setVisibility(8);
                break;
            case 9:
                yh.r2 r2Var = (yh.r2) this.b;
                r2Var.E = 1.0f;
                r2Var.F = -1;
                yh.q2 q2Var = r2Var.H;
                if (q2Var != null && (z10 = q2Var.l) && z10) {
                    q2Var.l = false;
                    q2Var.b();
                }
                r2Var.G = null;
                break;
            case 10:
                s00 s00Var = ((l7) this.b).c;
                s00Var.setScaleX(1.0f);
                s00Var.setScaleY(1.0f);
                break;
            case 11:
                ((zg.v) this.b).run();
                break;
            case 12:
                zg.t tVar = (zg.t) this.b;
                tVar.setVisibility(8);
                zg.s sVar = tVar.b;
                if (sVar != null) {
                    tVar.removeView(sVar);
                    tVar.b = null;
                }
                tVar.e = null;
                break;
            default:
                ((zg.i0) this.b).x.c();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 2:
                ((r0.m0) this.b).b();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public n0(r0.m0 m0Var, View view) {
        this.a = 2;
        this.b = m0Var;
    }
}
