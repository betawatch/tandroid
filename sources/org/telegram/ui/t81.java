package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
import java.util.Iterator;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class t81 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t81(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i7 = this.a;
        Object obj = this.b;
        switch (i7) {
            case 0:
                super.onAnimationEnd(animator);
                ((u81) obj).d = null;
                break;
            case 1:
                super.onAnimationEnd(animator);
                ((w91) obj).setScrollEnabled(true);
                break;
            case 2:
                ab1 ab1Var = (ab1) obj;
                if (animator.equals(ab1Var.d.K)) {
                    ab1Var.d.K = null;
                    break;
                }
                break;
            case 3:
                nb1 nb1Var = (nb1) obj;
                nb1Var.d = null;
                nb1Var.a = null;
                nb1Var.b = false;
                nb1Var.f.c.setAllowDrawCursor(true);
                break;
            case 4:
                ((org.telegram.ui.Wallet.u3) obj).K = null;
                break;
            case 5:
                ((org.telegram.ui.Wallet.b4) obj).f();
                break;
            case 6:
                org.telegram.ui.Wallet.w5 w5Var = (org.telegram.ui.Wallet.w5) obj;
                if (w5Var.J0 == animator) {
                    w5Var.J0 = null;
                    break;
                }
                break;
            case 7:
                org.telegram.ui.Wallet.u5 u5Var = (org.telegram.ui.Wallet.u5) obj;
                u5Var.h = false;
                u5Var.n = null;
                u5Var.b.setLayerType(0, null);
                break;
            case 8:
                org.telegram.ui.Wallet.a6 a6Var = (org.telegram.ui.Wallet.a6) obj;
                a6Var.N = 0.0f;
                a6Var.O = 0.0f;
                a6Var.b0 = null;
                break;
            case 9:
                org.telegram.ui.Wallet.u6 u6Var = (org.telegram.ui.Wallet.u6) obj;
                u6Var.I = null;
                u6Var.i0 = 1.0f;
                u6Var.h0 = 0.0f;
                u6Var.g0 = 0.0f;
                u6Var.e();
                break;
            case 10:
                org.telegram.ui.Wallet.r8 r8Var = (org.telegram.ui.Wallet.r8) obj;
                EditTextBoldCursor editTextBoldCursor = r8Var.b;
                if (r8Var.s == animator) {
                    r8Var.s = null;
                    r8Var.a.setVisibility(r8Var.y ? 4 : 0);
                    editTextBoldCursor.setVisibility(r8Var.y ? 0 : 4);
                    if (r8Var.y && !r8Var.D) {
                        editTextBoldCursor.requestFocus();
                        org.telegram.messenger.g0.K3(editTextBoldCursor);
                        break;
                    }
                }
                break;
            case 11:
                org.telegram.ui.Wallet.k9 k9Var = (org.telegram.ui.Wallet.k9) obj;
                k9Var.n = null;
                k9Var.d.setVisibility(k9Var.x ? 4 : 0);
                k9Var.f.setVisibility(k9Var.y ? 0 : 4);
                break;
            case 12:
                n1 n1Var = (n1) obj;
                ((cd1) n1Var.b).getClass();
                ((cd1) n1Var.b).c.setVisibility(4);
                break;
            case 13:
                ((org.telegram.ui.web.x0) obj).s.setVisibility(8);
                break;
            case 14:
                sg.w wVar = (sg.w) obj;
                wVar.a.getPainting().c(null, wVar.a.getCurrentColor(), true, null);
                wVar.r = null;
                break;
            case 15:
                super.onAnimationEnd(animator);
                tg.f0 f0Var = (tg.f0) obj;
                ImageView imageView = f0Var.c;
                f0Var.c = f0Var.d;
                f0Var.d = imageView;
                imageView.bringToFront();
                f0Var.d.setVisibility(8);
                f0Var.h = null;
                break;
            case 16:
                tg.h1 h1Var = (tg.h1) obj;
                if (animator == h1Var.r) {
                    h1Var.f = h1Var.h;
                    h1Var.h = -1;
                    h1Var.r = null;
                    break;
                }
                break;
            case 17:
                ((ti.i) obj).v = null;
                break;
            case 18:
                ug.p0 p0Var = (ug.p0) obj;
                p0Var.s = p0Var.r ? 1.0f : 0.0f;
                p0Var.e();
                break;
            case 19:
                ug.t1 t1Var = (ug.t1) ((fi.c0) obj).b;
                t1Var.F = true;
                t1Var.invalidate();
                break;
            case 20:
                vg.e eVar = (vg.e) ((org.telegram.ui.Cells.x9) obj).b;
                int i10 = vg.e.K;
                eVar.d();
                break;
            case 21:
                vg.e eVar2 = (vg.e) obj;
                eVar2.d = null;
                eVar2.e();
                break;
            case 22:
                super.onAnimationEnd(animator);
                vg.m mVar = ((vg.h) obj).b;
                mVar.b.d = 0.0f;
                mVar.d0 = null;
                mVar.j(mVar.L);
                break;
            case 23:
                wg.b bVar = (wg.b) obj;
                bVar.b = 1.0f;
                bVar.invalidate();
                break;
            case 24:
                xh.f fVar = (xh.f) obj;
                Iterator it = fVar.h.iterator();
                while (it.hasNext()) {
                    xh.b bVar2 = (xh.b) it.next();
                    if (fVar.c.size() < fVar.d) {
                        fVar.c.push(bVar2);
                    }
                    it.remove();
                }
                Runnable runnable = fVar.q;
                if (runnable != null) {
                    runnable.run();
                    fVar.q = null;
                }
                fVar.r = null;
                fVar.invalidateSelf();
                break;
            default:
                ((zh.f0) obj).b.s1.setVisibility(8);
                break;
        }
    }
}
