package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
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
                ((org.telegram.ui.Wallet.d3) obj).K = null;
                break;
            case 3:
                ((org.telegram.ui.Wallet.k3) obj).g();
                break;
            case 4:
                org.telegram.ui.Wallet.l5 l5Var = (org.telegram.ui.Wallet.l5) obj;
                if (l5Var.K0 == animator) {
                    l5Var.K0 = null;
                    break;
                }
                break;
            case 5:
                org.telegram.ui.Wallet.j5 j5Var = (org.telegram.ui.Wallet.j5) obj;
                j5Var.h = false;
                j5Var.n = null;
                j5Var.b.setLayerType(0, null);
                break;
            case 6:
                org.telegram.ui.Wallet.o5 o5Var = (org.telegram.ui.Wallet.o5) obj;
                o5Var.J = 0.0f;
                o5Var.K = 0.0f;
                o5Var.R = null;
                break;
            case 7:
                org.telegram.ui.Wallet.b6 b6Var = (org.telegram.ui.Wallet.b6) obj;
                org.telegram.ui.Wallet.y5 y5Var = b6Var.f0;
                y5Var.d = 0.0f;
                y5Var.i = 0.0f;
                b6Var.o0 = null;
                break;
            case 8:
                org.telegram.ui.Wallet.p6 p6Var = (org.telegram.ui.Wallet.p6) obj;
                p6Var.I = null;
                p6Var.i0 = 1.0f;
                p6Var.h0 = 0.0f;
                p6Var.g0 = 0.0f;
                p6Var.e();
                break;
            case 9:
                org.telegram.ui.Wallet.q8 q8Var = (org.telegram.ui.Wallet.q8) obj;
                EditTextBoldCursor editTextBoldCursor = q8Var.b;
                if (q8Var.s == animator) {
                    q8Var.s = null;
                    q8Var.a.setVisibility(q8Var.x ? 4 : 0);
                    editTextBoldCursor.setVisibility(q8Var.x ? 0 : 4);
                    if (q8Var.x && !q8Var.y) {
                        editTextBoldCursor.requestFocus();
                        AndroidUtilities.showKeyboard(editTextBoldCursor);
                        break;
                    }
                }
                break;
            case 10:
                org.telegram.ui.Wallet.k9 k9Var = (org.telegram.ui.Wallet.k9) obj;
                k9Var.h = null;
                k9Var.c.setVisibility(k9Var.v ? 4 : 0);
                k9Var.e.setVisibility(k9Var.w ? 0 : 4);
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
                nVar.a0 = null;
                nVar.k(nVar.L);
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
