package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
import java.util.Iterator;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class s81 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s81(Object obj, int i7) {
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
                ((t81) obj).d = null;
                break;
            case 1:
                super.onAnimationEnd(animator);
                ((u91) obj).setScrollEnabled(true);
                break;
            case 2:
                ya1 ya1Var = (ya1) obj;
                if (animator.equals(ya1Var.d.K)) {
                    ya1Var.d.K = null;
                    break;
                }
                break;
            case 3:
                lb1 lb1Var = (lb1) obj;
                lb1Var.d = null;
                lb1Var.a = null;
                lb1Var.b = false;
                lb1Var.f.c.setAllowDrawCursor(true);
                break;
            case 4:
                ((org.telegram.ui.Wallet.v3) obj).K = null;
                break;
            case 5:
                ((org.telegram.ui.Wallet.c4) obj).f();
                break;
            case 6:
                org.telegram.ui.Wallet.x5 x5Var = (org.telegram.ui.Wallet.x5) obj;
                if (x5Var.J0 == animator) {
                    x5Var.J0 = null;
                    break;
                }
                break;
            case 7:
                org.telegram.ui.Wallet.v5 v5Var = (org.telegram.ui.Wallet.v5) obj;
                v5Var.h = false;
                v5Var.n = null;
                v5Var.b.setLayerType(0, null);
                break;
            case 8:
                org.telegram.ui.Wallet.b6 b6Var = (org.telegram.ui.Wallet.b6) obj;
                b6Var.N = 0.0f;
                b6Var.O = 0.0f;
                b6Var.b0 = null;
                break;
            case 9:
                org.telegram.ui.Wallet.v6 v6Var = (org.telegram.ui.Wallet.v6) obj;
                v6Var.I = null;
                v6Var.i0 = 1.0f;
                v6Var.h0 = 0.0f;
                v6Var.g0 = 0.0f;
                v6Var.e();
                break;
            case 10:
                org.telegram.ui.Wallet.s8 s8Var = (org.telegram.ui.Wallet.s8) obj;
                EditTextBoldCursor editTextBoldCursor = s8Var.b;
                if (s8Var.s == animator) {
                    s8Var.s = null;
                    s8Var.a.setVisibility(s8Var.y ? 4 : 0);
                    editTextBoldCursor.setVisibility(s8Var.y ? 0 : 4);
                    if (s8Var.y && !s8Var.D) {
                        editTextBoldCursor.requestFocus();
                        org.telegram.messenger.g0.K3(editTextBoldCursor);
                        break;
                    }
                }
                break;
            case 11:
                org.telegram.ui.Wallet.l9 l9Var = (org.telegram.ui.Wallet.l9) obj;
                l9Var.n = null;
                l9Var.d.setVisibility(l9Var.x ? 4 : 0);
                l9Var.f.setVisibility(l9Var.y ? 0 : 4);
                break;
            case 12:
                n1 n1Var = (n1) obj;
                ((zc1) n1Var.b).getClass();
                ((zc1) n1Var.b).c.setVisibility(4);
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
