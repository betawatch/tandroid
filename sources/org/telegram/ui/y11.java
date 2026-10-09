package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y11 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ y11(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                a21 a21Var = (a21) this.b;
                a21Var.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a21Var.a();
                break;
            case 1:
                n21 n21Var = (n21) this.b;
                n21Var.y = AndroidUtilities.lerp(n21Var.E, valueAnimator.getAnimatedFraction());
                n21Var.h.setTextColor(i0.a.d(n21Var.y, org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.z6, false), org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.q6, false)));
                n21Var.r.setAlpha((n21Var.y / 2.0f) + 0.5f);
                break;
            case 2:
                ((e31) this.b).h.s(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 3:
                d31 d31Var = (d31) this.b;
                d31Var.P = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d31Var.O.invalidate();
                break;
            case 4:
                SecretMediaViewer secretMediaViewer = ((z41) this.b).d;
                secretMediaViewer.a0.k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer.a0.invalidate();
                break;
            case 5:
                SecretMediaViewer secretMediaViewer2 = ((z41) this.b).d;
                secretMediaViewer2.a0.k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer2.a0.invalidate();
                break;
            case 6:
                ((SecretMediaViewer) ((org.telegram.ui.Components.kn0) this.b).b).a0.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 7:
                k51 k51Var = (k51) this.b;
                k51Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (k51Var.S) {
                    k51Var.N.invalidate();
                    break;
                }
                break;
            case 8:
                ((a61) this.b).e.U0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 9:
                z61 z61Var = (z61) this.b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z61Var.r = floatValue;
                View view = z61Var.e;
                if (view != null) {
                    view.setAlpha(floatValue);
                    break;
                } else {
                    org.telegram.ui.Components.kh0 kh0Var = z61Var.d;
                    if (kh0Var != null) {
                        kh0Var.invalidate();
                        break;
                    }
                }
                break;
            case 10:
                g71 g71Var = (g71) this.b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g71Var.L = floatValue2;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = g71Var.v;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(floatValue2);
                org.telegram.ui.ActionBar.j1 j1Var = actionBarPopupWindow$ActionBarPopupWindowLayout.L;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(org.telegram.ui.Components.hs.g.getInterpolation(g71Var.L));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i10 = 0; i10 < itemsCount; i10++) {
                    float cascade = AndroidUtilities.cascade(g71Var.L, i10, itemsCount, 4.0f);
                    j1Var.getChildAt(i10).setTranslationY((1.0f - cascade) * AndroidUtilities.dp(-12.0f));
                    j1Var.getChildAt(i10).setAlpha(cascade);
                }
                break;
            case 11:
                i91.a0((i91) this.b, valueAnimator);
                break;
            case 12:
                la1 la1Var = (la1) this.b;
                la1Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                la1Var.e.setAlpha(1.0f - floatValue3);
                ig.g gVar = la1Var.b;
                gVar.z0.f = floatValue3;
                la1Var.c.invalidate();
                gVar.invalidate();
                break;
            case 13:
                xd1 xd1Var = (xd1) this.b;
                xd1Var.getClass();
                xd1Var.o1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xd1Var.x0.invalidate();
                xd1Var.C0.invalidate();
                xd1Var.R1.setAlpha(xd1Var.o1);
                xd1Var.Q1.invalidate();
                xd1Var.V0();
                break;
            case 14:
                xd1 xd1Var2 = ((ld1) this.b).a;
                xd1Var2.o1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xd1Var2.x0.invalidate();
                xd1Var2.C0.invalidate();
                xd1Var2.R1.setAlpha(xd1Var2.o1);
                xd1Var2.Q1.invalidate();
                xd1Var2.V0();
                break;
            case 15:
                ue1 ue1Var = (ue1) this.b;
                ue1Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int childCount = ue1Var.a.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    int R = RecyclerView.R(ue1Var.a.getChildAt(i11));
                    int i12 = ue1Var.d.e;
                    if (R < i12 || i12 <= 0) {
                        ue1Var.a.getChildAt(i11).setAlpha(1.0f);
                    } else {
                        ue1Var.a.getChildAt(i11).setAlpha(ue1Var.E);
                    }
                }
                break;
            case 16:
                ze1 ze1Var = (ze1) this.b;
                ze1Var.getClass();
                ze1Var.c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ze1Var.invalidate();
                break;
            case 17:
                fg1 fg1Var = (fg1) this.b;
                fg1Var.getClass();
                fg1Var.S0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 18:
                cg1 cg1Var = (cg1) this.b;
                cg1Var.getClass();
                cg1Var.j5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cg1Var.f0();
                break;
            case 19:
                dg1 dg1Var = (dg1) this.b;
                dg1Var.getClass();
                dg1Var.setViewsOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                wi1 wi1Var = (wi1) this.b;
                wi1Var.getClass();
                wi1Var.y0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wi1Var.F();
                break;
        }
    }
}
