package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class u01 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ u01(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                SecretMediaViewer secretMediaViewer = ((v01) this.b).d;
                secretMediaViewer.Y.k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer.Y.invalidate();
                break;
            case 1:
                SecretMediaViewer secretMediaViewer2 = ((v01) this.b).d;
                secretMediaViewer2.Y.k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer2.Y.invalidate();
                break;
            case 2:
                ((SecretMediaViewer) ((org.telegram.ui.Components.rl0) this.b).b).Y.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 3:
                i11 i11Var = (i11) this.b;
                i11Var.w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (i11Var.S) {
                    i11Var.N.invalidate();
                    break;
                }
                break;
            case 4:
                ((z11) this.b).e.U0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 5:
                a21 a21Var = (a21) this.b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a21Var.r = floatValue;
                View view = a21Var.e;
                if (view != null) {
                    view.setAlpha(floatValue);
                    break;
                } else {
                    kg.x xVar = a21Var.d;
                    if (xVar != null) {
                        xVar.invalidate();
                        break;
                    }
                }
                break;
            case 6:
                e31 e31Var = (e31) this.b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e31Var.L = floatValue2;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = e31Var.w;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(floatValue2);
                u71 u71Var = actionBarPopupWindow$ActionBarPopupWindowLayout.L;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(org.telegram.ui.Components.gr.g.getInterpolation(e31Var.L));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i10 = 0; i10 < itemsCount; i10++) {
                    float s10 = org.telegram.messenger.i0.s(e31Var.L, i10, itemsCount, 4.0f);
                    u71Var.getChildAt(i10).setTranslationY((1.0f - s10) * org.telegram.messenger.i0.L(-12.0f));
                    u71Var.getChildAt(i10).setAlpha(s10);
                }
                break;
            case 7:
                e51 e51Var = (e51) this.b;
                e51Var.getClass();
                e51Var.k0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 8:
                e61 e61Var = (e61) this.b;
                e61Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e61Var.e.setAlpha(1.0f - floatValue3);
                bg.i iVar = e61Var.b;
                iVar.z0.f = floatValue3;
                e61Var.c.invalidate();
                iVar.invalidate();
                break;
            case 9:
                m91 m91Var = (m91) this.b;
                m91Var.getClass();
                m91Var.p1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m91Var.y0.invalidate();
                m91Var.D0.invalidate();
                m91Var.S1.setAlpha(m91Var.p1);
                m91Var.R1.invalidate();
                m91Var.Z0();
                break;
            case 10:
                m91 m91Var2 = ((b91) this.b).a;
                m91Var2.p1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m91Var2.y0.invalidate();
                m91Var2.D0.invalidate();
                m91Var2.S1.setAlpha(m91Var2.p1);
                m91Var2.R1.invalidate();
                m91Var2.Z0();
                break;
            case 11:
                ea1 ea1Var = (ea1) this.b;
                ea1Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int childCount = ea1Var.a.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    int R = RecyclerView.R(ea1Var.a.getChildAt(i11));
                    int i12 = ea1Var.d.e;
                    if (R < i12 || i12 <= 0) {
                        ea1Var.a.getChildAt(i11).setAlpha(1.0f);
                    } else {
                        ea1Var.a.getChildAt(i11).setAlpha(ea1Var.E);
                    }
                }
                break;
            case 12:
                ja1 ja1Var = (ja1) this.b;
                ja1Var.getClass();
                ja1Var.b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ja1Var.invalidate();
                break;
            case 13:
                pb1 pb1Var = (pb1) this.b;
                pb1Var.getClass();
                pb1Var.V0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 14:
                mb1 mb1Var = (mb1) this.b;
                mb1Var.getClass();
                mb1Var.j5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mb1Var.m0();
                break;
            case 15:
                nb1 nb1Var = (nb1) this.b;
                nb1Var.getClass();
                nb1Var.setViewsOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                be1 be1Var = (be1) this.b;
                be1Var.getClass();
                be1Var.y0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                be1Var.F();
                break;
        }
    }
}
