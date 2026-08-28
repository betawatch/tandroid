package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.CheckBox;
import org.telegram.ui.Components.CheckBoxBase;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class xp extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xp(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                bq bqVar = (bq) this.b;
                bqVar.h.b(bqVar.D ? 1.0f : 0.0f);
                bqVar.h.invalidateSelf();
                break;
            case 15:
                ((org.telegram.ui.Components.nl) this.b).a.K = null;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 1:
                nq nqVar = (nq) this.b;
                View view = nqVar.b;
                view.setAlpha(1.0f);
                f2.z0.x0(view);
                ((jr) nqVar.d).c.removeView(view);
                break;
            case 2:
                org.telegram.ui.Components.b6 b6Var = (org.telegram.ui.Components.b6) this.b;
                b6Var.d = null;
                b6Var.b.clear();
                break;
            case 3:
                AnimatedPhoneNumberEditText animatedPhoneNumberEditText = (AnimatedPhoneNumberEditText) this.b;
                animatedPhoneNumberEditText.n = null;
                animatedPhoneNumberEditText.f.clear();
                break;
            case 4:
                super.onAnimationEnd(animator);
                org.telegram.ui.Components.i6 i6Var = (org.telegram.ui.Components.i6) this.b;
                i6Var.c();
                i6Var.k = null;
                i6Var.h = 0.0f;
                i6Var.m = 0.0f;
                i6Var.invalidateSelf();
                Runnable runnable = i6Var.V;
                if (runnable != null) {
                    runnable.run();
                }
                i6Var.o = null;
                CharSequence charSequence = i6Var.p;
                if (charSequence == null) {
                    org.telegram.ui.Components.fg fgVar = i6Var.C;
                    if (fgVar != null) {
                        fgVar.run();
                        break;
                    }
                } else {
                    i6Var.q(charSequence, true, i6Var.q);
                    i6Var.p = null;
                    i6Var.q = false;
                    break;
                }
                break;
            case 5:
                org.telegram.ui.Components.o9 o9Var = (org.telegram.ui.Components.o9) this.b;
                o9Var.setVisibility(8);
                o9Var.setImageDrawable(null);
                o9Var.setAlpha(1.0f);
                break;
            case 6:
                org.telegram.ui.Components.w8 w8Var = ((org.telegram.ui.Components.k8) this.b).b;
                w8Var.f = false;
                w8Var.e.setVisibility(8);
                break;
            case 7:
                org.telegram.ui.Components.b9 b9Var = (org.telegram.ui.Components.b9) this.b;
                if (b9Var.f != null) {
                    b9Var.e = 1.0f;
                    b9Var.n();
                    if (b9Var.g) {
                        b9Var.g = false;
                        Runnable runnable2 = b9Var.j;
                        if (runnable2 != null) {
                            runnable2.run();
                        }
                    }
                    b9Var.f();
                }
                b9Var.f = null;
                break;
            case 8:
                ((org.telegram.ui.Components.hf) this.b).f.U.setVisibility(8);
                break;
            case 9:
                ((org.telegram.ui.Components.lg) this.b).W = 1.0f;
                break;
            case 10:
                ((org.telegram.ui.Components.sh) this.b).c.s.setVisibility(8);
                break;
            case 11:
                ((org.telegram.ui.Components.uh) this.b).d.v.setVisibility(8);
                break;
            case 12:
                org.telegram.ui.Components.ki kiVar = (org.telegram.ui.Components.ki) this.b;
                kiVar.V0 = null;
                if (!kiVar.m1) {
                    if (kiVar.T0.getTag() == null && kiVar.M0 == 0 && !kiVar.P0) {
                        kiVar.W0.setVisibility(4);
                    }
                    kiVar.e1.setVisibility(4);
                    break;
                } else {
                    org.telegram.ui.ActionBar.w0 w0Var = kiVar.a1;
                    if (w0Var != null) {
                        w0Var.setVisibility(4);
                        break;
                    }
                }
                break;
            case 13:
                super.onAnimationEnd(animator);
                org.telegram.ui.Components.fk fkVar = (org.telegram.ui.Components.fk) this.b;
                fkVar.s.setVisibility(8);
                fkVar.n = 0;
                org.telegram.ui.Components.uj ujVar = fkVar.r;
                ujVar.setAlpha(1.0f);
                ujVar.setScaleX(1.0f);
                ujVar.setScaleY(1.0f);
                ujVar.setTranslationX(0.0f);
                ujVar.invalidate();
                break;
            case 14:
                org.telegram.ui.Components.ek ekVar = (org.telegram.ui.Components.ek) this.b;
                if (ekVar.T.D.getTag() == null) {
                    ekVar.T.D.setVisibility(4);
                }
                ekVar.T.E = null;
                break;
            case 15:
                org.telegram.ui.Components.nl nlVar = (org.telegram.ui.Components.nl) this.b;
                if (animator.equals(nlVar.a.K)) {
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = nlVar.a;
                    chatAttachAlertPhotoLayout.V = true;
                    chatAttachAlertPhotoLayout.K = null;
                    break;
                }
                break;
            case 16:
                org.telegram.ui.Components.gm gmVar = (org.telegram.ui.Components.gm) this.b;
                org.telegram.ui.Components.hm hmVar = gmVar.L;
                hmVar.F = null;
                hmVar.G = false;
                gmVar.invalidate();
                break;
            case 17:
                org.telegram.ui.Components.cp cpVar = (org.telegram.ui.Components.cp) this.b;
                kh.eb ebVar = cpVar.N;
                if (ebVar != null) {
                    if (ebVar.getParent() != null) {
                        ((ViewGroup) cpVar.N.getParent()).removeView(cpVar.N);
                    }
                    cpVar.N = null;
                }
                cpVar.P = null;
                super.onAnimationEnd(animator);
                break;
            case 18:
                CheckBox checkBox = (CheckBox) this.b;
                if (animator.equals(checkBox.s)) {
                    checkBox.s = null;
                }
                if (!checkBox.x) {
                    checkBox.C = null;
                    break;
                }
                break;
            case 19:
                CheckBoxBase checkBoxBase = (CheckBoxBase) this.b;
                if (animator.equals(checkBoxBase.p)) {
                    checkBoxBase.p = null;
                }
                if (!checkBoxBase.q) {
                    checkBoxBase.C = null;
                    break;
                }
                break;
            case 20:
                org.telegram.ui.Components.cq cqVar = (org.telegram.ui.Components.cq) this.b;
                if (cqVar.G == cqVar.H) {
                    cqVar.C.setVisibility(4);
                }
                cqVar.y = null;
                break;
            case 21:
                org.telegram.ui.Components.lq lqVar = (org.telegram.ui.Components.lq) this.b;
                lqVar.l = 1.0f;
                lqVar.o = null;
                lqVar.p = null;
                lqVar.q = null;
                View view2 = lqVar.H;
                if (view2 != null) {
                    if (lqVar.h == 0 && lqVar.G) {
                        view2.setVisibility(8);
                    }
                    lqVar.H.invalidate();
                }
                lqVar.c = -1;
                break;
            case 22:
                org.telegram.ui.Components.ut utVar = (org.telegram.ui.Components.ut) this.b;
                utVar.K = false;
                utVar.d.setTranslationY(0.0f);
                utVar.d.setAlpha(0.0f);
                utVar.c(0.0f);
                utVar.N = 0.0f;
                utVar.j();
                break;
            case 23:
                ((org.telegram.ui.Components.cu) this.b).a.K = false;
                break;
            case 24:
                super.onAnimationEnd(animator);
                ((org.telegram.ui.Components.uu) this.b).d = null;
                break;
            case 25:
                ((org.telegram.ui.Components.wy) this.b).S = null;
                break;
            case 26:
                super.onAnimationEnd(animator);
                ((org.telegram.ui.Components.fy) this.b).n = null;
                break;
            case 27:
                ((org.telegram.ui.Components.tz) this.b).a();
                break;
            case 28:
                org.telegram.ui.Components.vz vzVar = (org.telegram.ui.Components.vz) this.b;
                vzVar.Q = vzVar.V;
                vzVar.U = vzVar.b0;
                vzVar.R = vzVar.W;
                vzVar.S = vzVar.a0;
                vzVar.V = -1;
                vzVar.W = -1;
                vzVar.a0 = -1;
                vzVar.b0 = -1;
                break;
            case 29:
                org.telegram.ui.Components.j00 j00Var = (org.telegram.ui.Components.j00) this.b;
                j00Var.s = 1.0f;
                j00Var.invalidate();
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    public xp(nq nqVar, f2.z0 z0Var) {
        this.a = 1;
        this.b = nqVar;
    }
}
