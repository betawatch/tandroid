// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class pu9 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ pu9(byte b, Object obj, boolean z) {
        this.a = b;
        this.c = obj;
        this.b = z;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 2:
                ((d8a) obj).n = null;
                break;
            case 3:
                ((nfa) obj).R1 = null;
                break;
            case 13:
                p3c p3cVar = (p3c) obj;
                AnimatorSet animatorSet = p3cVar.J;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    p3cVar.J = null;
                    break;
                }
                break;
            case 14:
                j6c j6cVar = (j6c) obj;
                AnimatorSet animatorSet2 = j6cVar.n1;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    j6cVar.n1 = null;
                    break;
                }
                break;
            case 15:
                x7c x7cVar = (x7c) obj;
                AnimatorSet animatorSet3 = x7cVar.s1;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    x7cVar.s1 = null;
                    break;
                }
                break;
            case 17:
                pqc pqcVar = (pqc) obj;
                AnimatorSet animatorSet4 = pqcVar.f;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    pqcVar.f = null;
                    break;
                }
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        u95 u95Var;
        Drawable[] drawableArr;
        Drawable drawable;
        float f;
        byte b = this.a;
        boolean z = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                qu9 qu9Var = (qu9) obj;
                qu9Var.w = z ? 1.0f : 0.0f;
                if (qu9Var.T) {
                    qu9Var.O.invalidate();
                    break;
                }
                break;
            case 1:
                px9 px9Var = (px9) obj;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = px9Var.w;
                float f2 = z ? 1.0f : 0.0f;
                px9Var.M = f2;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(f2);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(s33.g.getInterpolation(px9Var.M));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i = 0; i < itemsCount; i++) {
                    float s = gl.s(px9Var.M, i, itemsCount, 4.0f);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(i).setTranslationY((1.0f - s) * gl.L(-12.0f));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(i).setAlpha(s);
                }
                px9Var.O = null;
                break;
            case 2:
                d8a d8aVar = (d8a) obj;
                if (d8aVar.n != null && (u95Var = d8aVar.r) != null) {
                    if (!z) {
                        u95Var.setVisibility(4);
                    }
                    d8aVar.n = null;
                    break;
                }
                break;
            case 3:
                nfa nfaVar = (nfa) obj;
                if (nfaVar.R1 != null) {
                    nfaVar.R1 = null;
                    if (!z) {
                        nfaVar.E0.setVisibility(4);
                        break;
                    }
                }
                break;
            case 4:
                qfa qfaVar = (qfa) obj;
                ValueAnimator valueAnimator = qfaVar.B0;
                if (valueAnimator != null && valueAnimator.equals(animator)) {
                    qfaVar.C0 = z ? 1.0f : 0.0f;
                    qfaVar.B0 = null;
                    break;
                }
                break;
            case 5:
                r5b r5bVar = (r5b) obj;
                if (z) {
                    r5bVar.setVisibility(8);
                }
                r5bVar.c = null;
                break;
            case 6:
                t7b t7bVar = (t7b) obj;
                if (!z) {
                    t7bVar.W0.setVisibility(8);
                }
                t7bVar.g2 = null;
                break;
            case 7:
                m8b m8bVar = (m8b) obj;
                m8bVar.J0.e();
                m8bVar.f0 = z ? m8bVar.x.c : 0.0f;
                y28 currentPeerView = m8bVar.o0.getCurrentPeerView();
                if (currentPeerView != null) {
                    currentPeerView.invalidate();
                }
                m8bVar.w.invalidate();
                m8bVar.v1 = null;
                break;
            case 8:
                super.onAnimationEnd(animator);
                anb anbVar = (anb) obj;
                anbVar.N = z ? 1.0f : 0.0f;
                anbVar.invalidate();
                break;
            case 9:
                ((jpb) obj).E = z ? 1.0f : 0.0f;
                break;
            case 10:
                kxb kxbVar = (kxb) obj;
                long j = kxbVar.f;
                if (kxbVar.e0 == animator) {
                    kxbVar.V = z ? 1.0f : 0.0f;
                    kxbVar.m();
                    kxbVar.W = false;
                    ImageView imageView = kxbVar.I;
                    boolean z2 = kxbVar.T;
                    int i2 = R.drawable.menu_sidebar_top;
                    imageView.setImageResource(z2 ? R.drawable.menu_sidebar_top : R.drawable.menu_sidebar_bottom);
                    ImageView imageView2 = kxbVar.H;
                    if (!kxbVar.T) {
                        i2 = R.drawable.menu_sidebar_left;
                    }
                    imageView2.setImageResource(i2);
                    kxbVar.e0 = null;
                    na7.q1(kxbVar.e).X3.edit().putBoolean(ls6.n(j, "topicssidetabs"), kxbVar.U).putBoolean(ls6.n(j, "topicssidetabsb"), kxbVar.T).apply();
                    Boolean bool = kxbVar.d0;
                    if (bool != null && z != bool.booleanValue()) {
                        boolean booleanValue = kxbVar.d0.booleanValue();
                        kxbVar.d0 = null;
                        kxbVar.a(booleanValue);
                    }
                    gl.c3(new cib(this, (byte) 14));
                    break;
                }
                break;
            case 11:
                fxb fxbVar = (fxb) obj;
                fxbVar.G = z ? 1.0f : 0.0f;
                fxbVar.h();
                break;
            case 12:
                jxb jxbVar = (jxb) obj;
                jxbVar.V = z ? 1.0f : 0.0f;
                jxbVar.h();
                jxbVar.g();
                break;
            case 13:
                p3c p3cVar = (p3c) obj;
                AnimatorSet animatorSet = p3cVar.J;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (z) {
                        p3cVar.e.setVisibility(4);
                        break;
                    } else {
                        p3cVar.b.setVisibility(4);
                        break;
                    }
                }
                break;
            case 14:
                j6c j6cVar = (j6c) obj;
                AnimatorSet animatorSet2 = j6cVar.n1;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!z) {
                        j6cVar.o1.setVisibility(4);
                    }
                    j6cVar.n1 = null;
                    break;
                }
                break;
            case 15:
                x7c x7cVar = (x7c) obj;
                AnimatorSet animatorSet3 = x7cVar.s1;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    if (!z) {
                        x7cVar.r1.setVisibility(4);
                    }
                    x7cVar.s1 = null;
                    break;
                }
                break;
            case 16:
                dic dicVar = (dic) obj;
                dicVar.w = null;
                if (z) {
                    TextView[] textViewArr = dicVar.h;
                    TextView textView = textViewArr[0];
                    textViewArr[0] = textViewArr[1];
                    textViewArr[1] = textView;
                    textView.setVisibility(8);
                }
                if (!dicVar.H && (drawable = (drawableArr = dicVar.e)[1]) != null) {
                    drawableArr[0] = drawable;
                    drawableArr[1] = null;
                }
                dicVar.H = false;
                if (!dicVar.P) {
                    dicVar.n = dicVar.r;
                }
                dicVar.s = 0.0f;
                dicVar.invalidate();
                break;
            case 17:
                pqc pqcVar = (pqc) obj;
                AnimatorSet animatorSet4 = pqcVar.f;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    pqcVar.f = null;
                    if (!z) {
                        pqcVar.setBackgroundColor(0);
                        break;
                    }
                }
                break;
            case 18:
                nsc nscVar = (nsc) obj;
                ps0 ps0Var = nscVar.W;
                if (!nscVar.U) {
                    ps0Var.setVisibility(8);
                    ps0Var.setText("");
                }
                f = z ? 1.0f : 0.0f;
                nscVar.V = f;
                ps0Var.setAlpha(f);
                nscVar.invalidate();
                if (nscVar.U) {
                    ps0Var.requestFocus();
                    gl.E3(ps0Var);
                    break;
                } else {
                    ps0Var.clearFocus();
                    gl.t1(ps0Var);
                    break;
                }
            default:
                wt wtVar = (wt) obj;
                ps0 ps0Var2 = wtVar.c0;
                if (!wtVar.a0) {
                    ps0Var2.setVisibility(8);
                }
                f = z ? 1.0f : 0.0f;
                wtVar.b0 = f;
                ps0Var2.setAlpha(f);
                wtVar.j(wtVar.b0);
                wtVar.S.setTranslationX(gl.L(56.0f) * wtVar.b0);
                wtVar.P.setTranslationX(gl.L(112.0f) * wtVar.b0);
                wtVar.invalidate();
                break;
        }
    }
}
