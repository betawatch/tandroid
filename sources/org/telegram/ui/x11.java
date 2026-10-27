package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x11 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x11(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                d21 d21Var = (d21) this.b;
                d21Var.y = AndroidUtilities.lerp(d21Var.E, valueAnimator.getAnimatedFraction());
                d21Var.h.setTextColor(i0.a.f(d21Var.y, org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.z6, false), org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.q6, false)));
                break;
            case 1:
                SecretMediaViewer secretMediaViewer = ((u31) this.b).d;
                secretMediaViewer.a0.k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer.a0.invalidate();
                break;
            case 2:
                SecretMediaViewer secretMediaViewer2 = ((u31) this.b).d;
                secretMediaViewer2.a0.k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer2.a0.invalidate();
                break;
            case 3:
                ((SecretMediaViewer) ((org.telegram.ui.Components.mn0) this.b).b).a0.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 4:
                f41 f41Var = (f41) this.b;
                f41Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (f41Var.S) {
                    f41Var.N.invalidate();
                    break;
                }
                break;
            case 5:
                ((v41) this.b).e.U0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 6:
                u51 u51Var = (u51) this.b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u51Var.r = floatValue;
                View view = u51Var.e;
                if (view != null) {
                    view.setAlpha(floatValue);
                    break;
                } else {
                    org.telegram.ui.Components.hh0 hh0Var = u51Var.d;
                    if (hh0Var != null) {
                        hh0Var.invalidate();
                        break;
                    }
                }
                break;
            case 7:
                b61 b61Var = (b61) this.b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b61Var.L = floatValue2;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = b61Var.v;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(floatValue2);
                org.telegram.ui.ActionBar.k1 k1Var = actionBarPopupWindow$ActionBarPopupWindowLayout.L;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(org.telegram.ui.Components.ds.g.getInterpolation(b61Var.L));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i10 = 0; i10 < itemsCount; i10++) {
                    float cascade = AndroidUtilities.cascade(b61Var.L, i10, itemsCount, 4.0f);
                    k1Var.getChildAt(i10).setTranslationY((1.0f - cascade) * AndroidUtilities.dp(-12.0f));
                    k1Var.getChildAt(i10).setAlpha(cascade);
                }
                break;
            case 8:
                f81 f81Var = (f81) this.b;
                f81Var.getClass();
                f81Var.k0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 9:
                i91 i91Var = (i91) this.b;
                i91Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i91Var.e.setAlpha(1.0f - floatValue3);
                kg.h hVar = i91Var.b;
                hVar.z0.f = floatValue3;
                i91Var.c.invalidate();
                hVar.invalidate();
                break;
            case 10:
                vc1 vc1Var = (vc1) this.b;
                vc1Var.getClass();
                vc1Var.p1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vc1Var.y0.invalidate();
                vc1Var.D0.invalidate();
                vc1Var.S1.setAlpha(vc1Var.p1);
                vc1Var.R1.invalidate();
                vc1Var.W0();
                break;
            case 11:
                vc1 vc1Var2 = ((jc1) this.b).a;
                vc1Var2.p1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vc1Var2.y0.invalidate();
                vc1Var2.D0.invalidate();
                vc1Var2.S1.setAlpha(vc1Var2.p1);
                vc1Var2.R1.invalidate();
                vc1Var2.W0();
                break;
            case 12:
                rd1 rd1Var = (rd1) this.b;
                rd1Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int childCount = rd1Var.a.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    int R = RecyclerView.R(rd1Var.a.getChildAt(i11));
                    int i12 = rd1Var.d.e;
                    if (R < i12 || i12 <= 0) {
                        rd1Var.a.getChildAt(i11).setAlpha(1.0f);
                    } else {
                        rd1Var.a.getChildAt(i11).setAlpha(rd1Var.E);
                    }
                }
                break;
            case 13:
                wd1 wd1Var = (wd1) this.b;
                wd1Var.getClass();
                wd1Var.c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wd1Var.invalidate();
                break;
            case 14:
                cf1 cf1Var = (cf1) this.b;
                cf1Var.getClass();
                cf1Var.S0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 15:
                ze1 ze1Var = (ze1) this.b;
                ze1Var.getClass();
                ze1Var.j5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ze1Var.e0();
                break;
            case 16:
                af1 af1Var = (af1) this.b;
                af1Var.getClass();
                af1Var.setViewsOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                rh1 rh1Var = (rh1) this.b;
                rh1Var.getClass();
                rh1Var.y0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rh1Var.F();
                break;
        }
    }
}
