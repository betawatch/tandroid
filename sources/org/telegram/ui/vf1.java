package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class vf1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vf1(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                wf1 wf1Var = (wf1) obj;
                if (animator.equals(wf1Var.d.K)) {
                    wf1Var.d.K = null;
                    break;
                }
                break;
            case 1:
                ng1 ng1Var = (ng1) obj;
                ng1Var.d = null;
                ng1Var.a = null;
                ng1Var.b = false;
                ng1Var.f.c.setAllowDrawCursor(true);
                break;
            case 2:
                ((org.telegram.ui.Wallet.e3) obj).K = null;
                break;
            case 3:
                ((org.telegram.ui.Wallet.l3) obj).g();
                break;
            case 4:
                org.telegram.ui.Wallet.m5 m5Var = (org.telegram.ui.Wallet.m5) obj;
                if (m5Var.K0 == animator) {
                    m5Var.K0 = null;
                    break;
                }
                break;
            case 5:
                org.telegram.ui.Wallet.k5 k5Var = (org.telegram.ui.Wallet.k5) obj;
                k5Var.h = false;
                k5Var.n = null;
                k5Var.b.setLayerType(0, null);
                break;
            case 6:
                org.telegram.ui.Wallet.p5 p5Var = (org.telegram.ui.Wallet.p5) obj;
                p5Var.J = 0.0f;
                p5Var.K = 0.0f;
                p5Var.R = null;
                break;
            case 7:
                org.telegram.ui.Wallet.e6 e6Var = (org.telegram.ui.Wallet.e6) obj;
                org.telegram.ui.Wallet.b6 b6Var = e6Var.i0;
                b6Var.d = 0.0f;
                b6Var.i = 0.0f;
                e6Var.r0 = null;
                break;
            case 8:
                org.telegram.ui.Wallet.s6 s6Var = (org.telegram.ui.Wallet.s6) obj;
                s6Var.I = null;
                s6Var.i0 = 1.0f;
                s6Var.h0 = 0.0f;
                s6Var.g0 = 0.0f;
                s6Var.e();
                break;
            case 9:
                org.telegram.ui.Wallet.t8 t8Var = (org.telegram.ui.Wallet.t8) obj;
                EditTextBoldCursor editTextBoldCursor = t8Var.b;
                if (t8Var.s == animator) {
                    t8Var.s = null;
                    t8Var.a.setVisibility(t8Var.x ? 4 : 0);
                    editTextBoldCursor.setVisibility(t8Var.x ? 0 : 4);
                    if (t8Var.x && !t8Var.y) {
                        editTextBoldCursor.requestFocus();
                        AndroidUtilities.showKeyboard(editTextBoldCursor);
                        break;
                    }
                }
                break;
            case 10:
                org.telegram.ui.Wallet.n9 n9Var = (org.telegram.ui.Wallet.n9) obj;
                n9Var.h = null;
                n9Var.c.setVisibility(n9Var.v ? 4 : 0);
                n9Var.e.setVisibility(n9Var.w ? 0 : 4);
                break;
            case 11:
                org.telegram.ui.Components.gg0 gg0Var = (org.telegram.ui.Components.gg0) obj;
                ((ei1) gg0Var.b).getClass();
                ((ei1) gg0Var.b).c.setVisibility(4);
                break;
            case 12:
                ((org.telegram.ui.web.a1) obj).s.setVisibility(8);
                break;
            case 13:
                qg.e0 e0Var = (qg.e0) obj;
                e0Var.a.getPainting().c(null, e0Var.a.getCurrentColor(), true, null);
                e0Var.r = null;
                break;
            case 14:
                super.onAnimationEnd(animator);
                rg.l0 l0Var = (rg.l0) obj;
                ImageView imageView = l0Var.c;
                l0Var.c = l0Var.d;
                l0Var.d = imageView;
                imageView.bringToFront();
                l0Var.d.setVisibility(8);
                l0Var.h = null;
                break;
            case 15:
                rg.r1 r1Var = (rg.r1) obj;
                if (animator == r1Var.r) {
                    r1Var.f = r1Var.h;
                    r1Var.h = -1;
                    r1Var.r = null;
                    break;
                }
                break;
            case 16:
                sg.p0 p0Var = (sg.p0) obj;
                p0Var.n = p0Var.h ? 1.0f : 0.0f;
                p0Var.e();
                break;
            case 17:
                sg.z1 z1Var = (sg.z1) ((ei.c0) obj).b;
                z1Var.F = true;
                z1Var.invalidate();
                break;
            case 18:
                tg.f fVar = (tg.f) ((tg.e) obj).b;
                int i11 = tg.f.K;
                fVar.d();
                break;
            case 19:
                tg.f fVar2 = (tg.f) obj;
                fVar2.d = null;
                fVar2.e();
                break;
            case 20:
                super.onAnimationEnd(animator);
                tg.n nVar = ((tg.i) obj).b;
                nVar.b.d = 0.0f;
                nVar.d0 = null;
                nVar.l(nVar.L);
                break;
            case 21:
                ug.b bVar = (ug.b) obj;
                bVar.b = 1.0f;
                bVar.invalidate();
                break;
            case 22:
                wh.g gVar = (wh.g) obj;
                Iterator it = gVar.h.iterator();
                while (it.hasNext()) {
                    wh.c cVar = (wh.c) it.next();
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
            default:
                ((yh.h0) obj).b.w.setVisibility(8);
                break;
        }
    }
}
