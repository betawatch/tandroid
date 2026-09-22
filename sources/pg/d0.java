package pg;

import ai.k6;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.widget.ImageView;
import java.util.Iterator;
import org.telegram.ui.s00;
import rg.z1;
import yh.k7;
import yh.p2;
import yh.q2;
import yh.s5;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
                qg.m0 m0Var = (qg.m0) this.b;
                ImageView imageView = m0Var.c;
                m0Var.c = m0Var.d;
                m0Var.d = imageView;
                imageView.bringToFront();
                m0Var.d.setVisibility(8);
                m0Var.h = null;
                break;
            case 2:
                qg.s1 s1Var = (qg.s1) this.b;
                if (animator == s1Var.r) {
                    s1Var.f = s1Var.h;
                    s1Var.h = -1;
                    s1Var.r = null;
                    break;
                }
                break;
            case 3:
                ((r0.m0) this.b).c();
                break;
            case 4:
                rg.p0 p0Var = (rg.p0) this.b;
                p0Var.n = p0Var.h ? 1.0f : 0.0f;
                p0Var.e();
                break;
            case 5:
                z1 z1Var = (z1) ((ci.c0) this.b).b;
                z1Var.F = true;
                z1Var.invalidate();
                break;
            case 6:
                super.onAnimationEnd(animator);
                sg.e eVar = (sg.e) ((k6) this.b).b;
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
                q2 q2Var = (q2) this.b;
                q2Var.E = 1.0f;
                q2Var.F = -1;
                p2 p2Var = q2Var.H;
                if (p2Var != null && (z10 = p2Var.l) && z10) {
                    p2Var.l = false;
                    p2Var.b();
                }
                q2Var.G = null;
                break;
            case 11:
                s00 s00Var = ((k7) this.b).c;
                s00Var.setScaleX(1.0f);
                s00Var.setScaleY(1.0f);
                break;
            case 12:
                ((s5) this.b).run();
                break;
            case 13:
                zg.u uVar = (zg.u) this.b;
                uVar.setVisibility(8);
                zg.s sVar = uVar.b;
                if (sVar != null) {
                    uVar.removeView(sVar);
                    uVar.b = null;
                }
                uVar.e = null;
                break;
            default:
                ((zg.i0) this.b).x.c();
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
