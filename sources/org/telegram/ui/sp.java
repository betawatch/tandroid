package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.CheckBox;
import org.telegram.ui.Components.CheckBoxBase;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class sp extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ sp(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 15:
                ((org.telegram.ui.Components.im) this.b).a.O = null;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                tp tpVar = (tp) this.b;
                tpVar.L = 0.0f;
                tpVar.K = 1.0f;
                View view = tpVar.a0;
                if (view != null) {
                    view.invalidate();
                }
                tpVar.T.invalidate();
                xi xiVar = tpVar.Y;
                if (xiVar != null) {
                    xiVar.run();
                    tpVar.Y = null;
                    break;
                }
                break;
            case 1:
                tq tqVar = (tq) this.b;
                View view2 = tqVar.b;
                view2.setAlpha(1.0f);
                s4.p0.x0(view2);
                ((mr) tqVar.d).c.removeView(view2);
                break;
            case 2:
                org.telegram.ui.Components.k6 k6Var = (org.telegram.ui.Components.k6) this.b;
                k6Var.d = null;
                k6Var.b.clear();
                break;
            case 3:
                AnimatedPhoneNumberEditText animatedPhoneNumberEditText = (AnimatedPhoneNumberEditText) this.b;
                animatedPhoneNumberEditText.n = null;
                animatedPhoneNumberEditText.f.clear();
                break;
            case 4:
                super.onAnimationEnd(animator);
                org.telegram.ui.Components.r6 r6Var = (org.telegram.ui.Components.r6) this.b;
                r6Var.b();
                r6Var.o = null;
                r6Var.j = 0.0f;
                r6Var.m = 0.0f;
                r6Var.l = 0.0f;
                r6Var.k = 0.0f;
                r6Var.r = 0.0f;
                r6Var.q = 0.0f;
                r6Var.invalidateSelf();
                Runnable runnable = r6Var.b0;
                if (runnable != null) {
                    runnable.run();
                }
                r6Var.t = null;
                CharSequence charSequence = r6Var.u;
                if (charSequence == null) {
                    org.telegram.ui.Components.pg pgVar = r6Var.I;
                    if (pgVar != null) {
                        pgVar.run();
                        break;
                    }
                } else {
                    r6Var.t(charSequence, true, r6Var.v);
                    r6Var.u = null;
                    r6Var.v = false;
                    break;
                }
                break;
            case 5:
                org.telegram.ui.Components.y9 y9Var = (org.telegram.ui.Components.y9) this.b;
                y9Var.setVisibility(8);
                y9Var.setImageDrawable(null);
                y9Var.setAlpha(1.0f);
                break;
            case 6:
                org.telegram.ui.Components.g9 g9Var = ((org.telegram.ui.Components.u8) this.b).b;
                g9Var.f = false;
                g9Var.e.setVisibility(8);
                break;
            case 7:
                org.telegram.ui.Components.l9 l9Var = (org.telegram.ui.Components.l9) this.b;
                if (l9Var.f != null) {
                    l9Var.e = 1.0f;
                    l9Var.n();
                    if (l9Var.g) {
                        l9Var.g = false;
                        Runnable runnable2 = l9Var.j;
                        if (runnable2 != null) {
                            runnable2.run();
                        }
                    }
                    l9Var.f();
                }
                l9Var.f = null;
                break;
            case 8:
                ((org.telegram.ui.Components.rf) this.b).f.b0.setVisibility(8);
                break;
            case 9:
                ((org.telegram.ui.Components.vg) this.b).d0 = 1.0f;
                break;
            case 10:
                ((org.telegram.ui.Components.ti) ((org.telegram.ui.Components.xh) this.b).d).s.setVisibility(8);
                break;
            case 11:
                ((org.telegram.ui.Components.ai) this.b).d.v.setVisibility(8);
                break;
            case 12:
                org.telegram.ui.Components.ti tiVar = (org.telegram.ui.Components.ti) this.b;
                tiVar.c1 = null;
                if (!tiVar.t1) {
                    if (tiVar.a1.getTag() == null && tiVar.T0 == 0 && !tiVar.W0) {
                        tiVar.d1.setVisibility(4);
                    }
                    tiVar.l1.setVisibility(4);
                    break;
                } else {
                    org.telegram.ui.ActionBar.w0 w0Var = tiVar.h1;
                    if (w0Var != null) {
                        w0Var.setVisibility(4);
                        break;
                    }
                }
                break;
            case 13:
                super.onAnimationEnd(animator);
                org.telegram.ui.Components.nk nkVar = (org.telegram.ui.Components.nk) this.b;
                nkVar.s.setVisibility(8);
                nkVar.n = 0;
                org.telegram.ui.Components.ck ckVar = nkVar.r;
                ckVar.setAlpha(1.0f);
                ckVar.setScaleX(1.0f);
                ckVar.setScaleY(1.0f);
                ckVar.setTranslationX(0.0f);
                ckVar.invalidate();
                break;
            case 14:
                org.telegram.ui.Components.mk mkVar = (org.telegram.ui.Components.mk) this.b;
                if (mkVar.X.H.getTag() == null) {
                    mkVar.X.H.setVisibility(4);
                }
                mkVar.X.I = null;
                break;
            case 15:
                org.telegram.ui.Components.im imVar = (org.telegram.ui.Components.im) this.b;
                if (animator.equals(imVar.a.O)) {
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = imVar.a;
                    chatAttachAlertPhotoLayout.c0 = true;
                    chatAttachAlertPhotoLayout.O = null;
                    break;
                }
                break;
            case 16:
                org.telegram.ui.Components.bn bnVar = (org.telegram.ui.Components.bn) this.b;
                org.telegram.ui.Components.cn cnVar = bnVar.P;
                cnVar.J = null;
                cnVar.K = false;
                bnVar.invalidate();
                break;
            case 17:
                org.telegram.ui.Components.zp zpVar = (org.telegram.ui.Components.zp) this.b;
                org.telegram.ui.Components.c31 c31Var = zpVar.Q;
                if (c31Var != null) {
                    if (c31Var.getParent() != null) {
                        ((ViewGroup) zpVar.Q.getParent()).removeView(zpVar.Q);
                    }
                    zpVar.Q = null;
                }
                zpVar.S = null;
                super.onAnimationEnd(animator);
                break;
            case 18:
                org.telegram.ui.Components.c31 c31Var2 = (org.telegram.ui.Components.c31) this.b;
                c31Var2.c = null;
                c31Var2.a.setShader(null);
                c31Var2.n = null;
                c31Var2.r = null;
                c31Var2.setImageDrawable(null);
                AndroidUtilities.removeFromParent(c31Var2);
                break;
            case 19:
                CheckBox checkBox = (CheckBox) this.b;
                if (animator.equals(checkBox.s)) {
                    checkBox.s = null;
                }
                if (!checkBox.x) {
                    checkBox.G = null;
                    break;
                }
                break;
            case 20:
                CheckBoxBase checkBoxBase = (CheckBoxBase) this.b;
                if (animator.equals(checkBoxBase.p)) {
                    checkBoxBase.p = null;
                }
                if (!checkBoxBase.q) {
                    checkBoxBase.C = null;
                    break;
                }
                break;
            case 21:
                org.telegram.ui.Components.yq yqVar = (org.telegram.ui.Components.yq) this.b;
                if (yqVar.K == yqVar.L) {
                    yqVar.G.setVisibility(4);
                }
                yqVar.y = null;
                break;
            case 22:
                org.telegram.ui.Components.gr grVar = (org.telegram.ui.Components.gr) this.b;
                grVar.l = 1.0f;
                grVar.o = null;
                grVar.p = null;
                grVar.q = null;
                View view3 = grVar.H;
                if (view3 != null) {
                    if (grVar.h == 0 && grVar.G) {
                        view3.setVisibility(8);
                    }
                    grVar.H.invalidate();
                }
                grVar.c = -1;
                break;
            case 23:
                org.telegram.ui.Components.ru ruVar = (org.telegram.ui.Components.ru) this.b;
                ruVar.O = false;
                ruVar.d.setTranslationY(0.0f);
                ruVar.d.setAlpha(0.0f);
                ruVar.c(0.0f);
                ruVar.R = 0.0f;
                ruVar.j();
                break;
            case 24:
                ((org.telegram.ui.Components.zu) this.b).a.O = false;
                break;
            case 25:
                super.onAnimationEnd(animator);
                ((org.telegram.ui.Components.rv) this.b).d = null;
                break;
            case 26:
                ((org.telegram.ui.Components.sz) this.b).W = null;
                break;
            case 27:
                super.onAnimationEnd(animator);
                ((org.telegram.ui.Components.bz) this.b).n = null;
                break;
            case 28:
                ((org.telegram.ui.Components.q00) this.b).a();
                break;
            default:
                org.telegram.ui.Components.s00 s00Var = (org.telegram.ui.Components.s00) this.b;
                s00Var.U = s00Var.c0;
                s00Var.b0 = s00Var.f0;
                s00Var.V = s00Var.d0;
                s00Var.W = s00Var.e0;
                s00Var.c0 = -1;
                s00Var.d0 = -1;
                s00Var.e0 = -1;
                s00Var.f0 = -1;
                break;
        }
    }

    public sp(tq tqVar, s4.p0 p0Var) {
        this.a = 1;
        this.b = tqVar;
    }
}
