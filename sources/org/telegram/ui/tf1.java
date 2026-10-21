package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class tf1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tf1(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                uf1 uf1Var = (uf1) obj;
                if (animator.equals(uf1Var.d.K)) {
                    uf1Var.d.K = null;
                    break;
                }
                break;
            case 1:
                lg1 lg1Var = (lg1) obj;
                lg1Var.d = null;
                lg1Var.a = null;
                lg1Var.b = false;
                lg1Var.f.c.setAllowDrawCursor(true);
                break;
            case 2:
                ((org.telegram.ui.Wallet.g3) obj).K = null;
                break;
            case 3:
                ((org.telegram.ui.Wallet.n3) obj).f();
                break;
            case 4:
                org.telegram.ui.Wallet.o5 o5Var = (org.telegram.ui.Wallet.o5) obj;
                if (o5Var.I0 == animator) {
                    o5Var.I0 = null;
                    break;
                }
                break;
            case 5:
                org.telegram.ui.Wallet.m5 m5Var = (org.telegram.ui.Wallet.m5) obj;
                m5Var.h = false;
                m5Var.n = null;
                m5Var.b.setLayerType(0, null);
                break;
            case 6:
                org.telegram.ui.Wallet.s5 s5Var = (org.telegram.ui.Wallet.s5) obj;
                s5Var.N = 0.0f;
                s5Var.O = 0.0f;
                s5Var.b0 = null;
                break;
            case 7:
                org.telegram.ui.Wallet.m6 m6Var = (org.telegram.ui.Wallet.m6) obj;
                m6Var.I = null;
                m6Var.i0 = 1.0f;
                m6Var.h0 = 0.0f;
                m6Var.g0 = 0.0f;
                m6Var.e();
                break;
            case 8:
                org.telegram.ui.Wallet.n8 n8Var = (org.telegram.ui.Wallet.n8) obj;
                EditTextBoldCursor editTextBoldCursor = n8Var.b;
                if (n8Var.s == animator) {
                    n8Var.s = null;
                    n8Var.a.setVisibility(n8Var.x ? 4 : 0);
                    editTextBoldCursor.setVisibility(n8Var.x ? 0 : 4);
                    if (n8Var.x && !n8Var.y) {
                        editTextBoldCursor.requestFocus();
                        AndroidUtilities.showKeyboard(editTextBoldCursor);
                        break;
                    }
                }
                break;
            case 9:
                org.telegram.ui.Wallet.h9 h9Var = (org.telegram.ui.Wallet.h9) obj;
                h9Var.h = null;
                h9Var.c.setVisibility(h9Var.v ? 4 : 0);
                h9Var.e.setVisibility(h9Var.w ? 0 : 4);
                break;
            case 10:
                org.telegram.ui.Components.hg0 hg0Var = (org.telegram.ui.Components.hg0) obj;
                ((ci1) hg0Var.b).getClass();
                ((ci1) hg0Var.b).c.setVisibility(4);
                break;
            case 11:
                ((org.telegram.ui.web.a1) obj).s.setVisibility(8);
                break;
            case 12:
                qg.e0 e0Var = (qg.e0) obj;
                e0Var.a.getPainting().c(null, e0Var.a.getCurrentColor(), true, null);
                e0Var.r = null;
                break;
            case 13:
                super.onAnimationEnd(animator);
                rg.l0 l0Var = (rg.l0) obj;
                ImageView imageView = l0Var.c;
                l0Var.c = l0Var.d;
                l0Var.d = imageView;
                imageView.bringToFront();
                l0Var.d.setVisibility(8);
                l0Var.h = null;
                break;
            case 14:
                rg.r1 r1Var = (rg.r1) obj;
                if (animator == r1Var.r) {
                    r1Var.f = r1Var.h;
                    r1Var.h = -1;
                    r1Var.r = null;
                    break;
                }
                break;
            case 15:
                sg.q0 q0Var = (sg.q0) obj;
                q0Var.n = q0Var.h ? 1.0f : 0.0f;
                q0Var.e();
                break;
            case 16:
                sg.a2 a2Var = (sg.a2) ((ei.c0) obj).b;
                a2Var.F = true;
                a2Var.invalidate();
                break;
            case 17:
                tg.f fVar = (tg.f) ((tg.e) obj).b;
                int i11 = tg.f.K;
                fVar.d();
                break;
            case 18:
                tg.f fVar2 = (tg.f) obj;
                fVar2.d = null;
                fVar2.e();
                break;
            case 19:
                super.onAnimationEnd(animator);
                tg.n nVar = ((tg.i) obj).b;
                nVar.b.d = 0.0f;
                nVar.d0 = null;
                nVar.j(nVar.L);
                break;
            case 20:
                ug.b bVar = (ug.b) obj;
                bVar.b = 1.0f;
                bVar.invalidate();
                break;
            case 21:
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
                ((yh.g0) obj).b.w.setVisibility(8);
                break;
        }
    }
}
