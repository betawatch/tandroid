package pg;

import ai.j6;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.widget.ImageView;
import java.util.Iterator;
import org.telegram.ui.s00;
import rg.b2;
import yh.m7;
import yh.q2;
import yh.r2;
import yh.s5;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class d0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 3:
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
                e0 e0Var = (e0) this.b;
                e0Var.a.getPainting().c(null, e0Var.a.getCurrentColor(), true, null);
                e0Var.r = null;
                break;
            case 1:
                super.onAnimationEnd(animator);
                qg.l0 l0Var = (qg.l0) this.b;
                ImageView imageView = l0Var.c;
                l0Var.c = l0Var.d;
                l0Var.d = imageView;
                imageView.bringToFront();
                l0Var.d.setVisibility(8);
                l0Var.h = null;
                break;
            case 2:
                qg.r1 r1Var = (qg.r1) this.b;
                if (animator == r1Var.r) {
                    r1Var.f = r1Var.h;
                    r1Var.h = -1;
                    r1Var.r = null;
                    break;
                }
                break;
            case 3:
                ((r0.m0) this.b).c();
                break;
            case 4:
                rg.q0 q0Var = (rg.q0) this.b;
                q0Var.n = q0Var.h ? 1.0f : 0.0f;
                q0Var.e();
                break;
            case 5:
                b2 b2Var = (b2) ((ci.c0) this.b).b;
                b2Var.F = true;
                b2Var.invalidate();
                break;
            case 6:
                super.onAnimationEnd(animator);
                sg.e eVar = (sg.e) ((j6) this.b).b;
                eVar.b.d = 0.0f;
                eVar.T = null;
                eVar.h(eVar.I);
                break;
            case 7:
                tg.b bVar = (tg.b) this.b;
                bVar.b = 1.0f;
                bVar.invalidate();
                break;
            case 8:
                vh.g gVar = (vh.g) this.b;
                Iterator it = gVar.h.iterator();
                while (it.hasNext()) {
                    vh.c cVar = (vh.c) it.next();
                    if (gVar.c.size() < gVar.d) {
                        gVar.c.push(cVar);
                    }
                    it.remove();
                }
                Runnable runnable = gVar.q;
                if (runnable != null) {
                    runnable.run();
                    gVar.q = null;
                }
                gVar.r = null;
                gVar.invalidateSelf();
                break;
            case 9:
                ((xh.h0) this.b).b.w.setVisibility(8);
                break;
            case 10:
                r2 r2Var = (r2) this.b;
                r2Var.E = 1.0f;
                r2Var.F = -1;
                q2 q2Var = r2Var.H;
                if (q2Var != null && (z10 = q2Var.l) && z10) {
                    q2Var.l = false;
                    q2Var.b();
                }
                r2Var.G = null;
                break;
            case 11:
                s00 s00Var = ((m7) this.b).c;
                s00Var.setScaleX(1.0f);
                s00Var.setScaleY(1.0f);
                break;
            case 12:
                ((s5) this.b).run();
                break;
            case 13:
                ((zg.o) this.b).v.setVisibility(4);
                break;
            case 14:
                zg.r rVar = (zg.r) this.b;
                rVar.setVisibility(8);
                zg.q qVar = rVar.b;
                if (qVar != null) {
                    rVar.removeView(qVar);
                    rVar.b = null;
                }
                rVar.e = null;
                break;
            default:
                ((zg.f0) this.b).x.c();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 3:
                ((r0.m0) this.b).b();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public d0(r0.m0 m0Var, View view) {
        this.a = 3;
        this.b = m0Var;
    }
}
