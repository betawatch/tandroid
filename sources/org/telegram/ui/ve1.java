package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class ve1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ve1(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                super.onAnimationEnd(animator);
                ((we1) obj).setScrollEnabled(true);
                break;
            case 1:
                ag1 ag1Var = (ag1) obj;
                if (animator.equals(ag1Var.d.K)) {
                    ag1Var.d.K = null;
                    break;
                }
                break;
            case 2:
                rg1 rg1Var = (rg1) obj;
                rg1Var.d = null;
                rg1Var.a = null;
                rg1Var.b = false;
                rg1Var.f.c.setAllowDrawCursor(true);
                break;
            case 3:
                ((org.telegram.ui.Wallet.f3) obj).K = null;
                break;
            case 4:
                ((org.telegram.ui.Wallet.m3) obj).f();
                break;
            case 5:
                org.telegram.ui.Wallet.o5 o5Var = (org.telegram.ui.Wallet.o5) obj;
                if (o5Var.I0 == animator) {
                    o5Var.I0 = null;
                    break;
                }
                break;
            case 6:
                org.telegram.ui.Wallet.m5 m5Var = (org.telegram.ui.Wallet.m5) obj;
                m5Var.h = false;
                m5Var.n = null;
                m5Var.b.setLayerType(0, null);
                break;
            case 7:
                org.telegram.ui.Wallet.s5 s5Var = (org.telegram.ui.Wallet.s5) obj;
                s5Var.N = 0.0f;
                s5Var.O = 0.0f;
                s5Var.b0 = null;
                break;
            case 8:
                org.telegram.ui.Wallet.m6 m6Var = (org.telegram.ui.Wallet.m6) obj;
                m6Var.I = null;
                m6Var.i0 = 1.0f;
                m6Var.h0 = 0.0f;
                m6Var.g0 = 0.0f;
                m6Var.e();
                break;
            case 9:
                org.telegram.ui.Wallet.o8 o8Var = (org.telegram.ui.Wallet.o8) obj;
                EditTextBoldCursor editTextBoldCursor = o8Var.b;
                if (o8Var.s == animator) {
                    o8Var.s = null;
                    o8Var.a.setVisibility(o8Var.x ? 4 : 0);
                    editTextBoldCursor.setVisibility(o8Var.x ? 0 : 4);
                    if (o8Var.x && !o8Var.y) {
                        editTextBoldCursor.requestFocus();
                        AndroidUtilities.showKeyboard(editTextBoldCursor);
                        break;
                    }
                }
                break;
            case 10:
                org.telegram.ui.Wallet.i9 i9Var = (org.telegram.ui.Wallet.i9) obj;
                i9Var.n = null;
                i9Var.d.setVisibility(i9Var.w ? 4 : 0);
                i9Var.f.setVisibility(i9Var.x ? 0 : 4);
                break;
            case 11:
                org.telegram.ui.Components.lg0 lg0Var = (org.telegram.ui.Components.lg0) obj;
                ((ki1) lg0Var.b).getClass();
                ((ki1) lg0Var.b).c.setVisibility(4);
                break;
            case 12:
                ((org.telegram.ui.web.b1) obj).s.setVisibility(8);
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
                rg.s1 s1Var = (rg.s1) obj;
                if (animator == s1Var.r) {
                    s1Var.f = s1Var.h;
                    s1Var.h = -1;
                    s1Var.r = null;
                    break;
                }
                break;
            case 16:
                sg.p0 p0Var = (sg.p0) obj;
                p0Var.s = p0Var.r ? 1.0f : 0.0f;
                p0Var.e();
                break;
            case 17:
                sg.a2 a2Var = (sg.a2) ((ei.c0) obj).b;
                a2Var.F = true;
                a2Var.invalidate();
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
                nVar.j(nVar.L);
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
                ((yh.g0) obj).b.w.setVisibility(8);
                break;
        }
    }
}
