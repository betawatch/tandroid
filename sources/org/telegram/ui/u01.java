package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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
                ((SecretMediaViewer) ((org.telegram.ui.Components.sl0) this.b).b).Y.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 3:
                h11 h11Var = (h11) this.b;
                h11Var.w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (h11Var.S) {
                    h11Var.N.invalidate();
                    break;
                }
                break;
            case 4:
                ((x11) this.b).e.U0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 5:
                y11 y11Var = (y11) this.b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y11Var.r = floatValue;
                View view = y11Var.e;
                if (view != null) {
                    view.setAlpha(floatValue);
                    break;
                } else {
                    kg.x xVar = y11Var.d;
                    if (xVar != null) {
                        xVar.invalidate();
                        break;
                    }
                }
                break;
            case 6:
                c31 c31Var = (c31) this.b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c31Var.L = floatValue2;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = c31Var.w;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(floatValue2);
                s71 s71Var = actionBarPopupWindow$ActionBarPopupWindowLayout.L;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(org.telegram.ui.Components.gr.g.getInterpolation(c31Var.L));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i10 = 0; i10 < itemsCount; i10++) {
                    float s10 = org.telegram.messenger.i0.s(c31Var.L, i10, itemsCount, 4.0f);
                    s71Var.getChildAt(i10).setTranslationY((1.0f - s10) * org.telegram.messenger.i0.L(-12.0f));
                    s71Var.getChildAt(i10).setAlpha(s10);
                }
                break;
            case 7:
                c51 c51Var = (c51) this.b;
                c51Var.getClass();
                c51Var.l0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 8:
                c61 c61Var = (c61) this.b;
                c61Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c61Var.e.setAlpha(1.0f - floatValue3);
                bg.i iVar = c61Var.b;
                iVar.z0.f = floatValue3;
                c61Var.c.invalidate();
                iVar.invalidate();
                break;
            case 9:
                k91 k91Var = (k91) this.b;
                k91Var.getClass();
                k91Var.p1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k91Var.y0.invalidate();
                k91Var.D0.invalidate();
                k91Var.S1.setAlpha(k91Var.p1);
                k91Var.R1.invalidate();
                k91Var.a1();
                break;
            case 10:
                k91 k91Var2 = ((z81) this.b).a;
                k91Var2.p1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k91Var2.y0.invalidate();
                k91Var2.D0.invalidate();
                k91Var2.S1.setAlpha(k91Var2.p1);
                k91Var2.R1.invalidate();
                k91Var2.a1();
                break;
            case 11:
                ca1 ca1Var = (ca1) this.b;
                ca1Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int childCount = ca1Var.a.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    int R = RecyclerView.R(ca1Var.a.getChildAt(i11));
                    int i12 = ca1Var.d.e;
                    if (R < i12 || i12 <= 0) {
                        ca1Var.a.getChildAt(i11).setAlpha(1.0f);
                    } else {
                        ca1Var.a.getChildAt(i11).setAlpha(ca1Var.E);
                    }
                }
                break;
            case 12:
                ha1 ha1Var = (ha1) this.b;
                ha1Var.getClass();
                ha1Var.b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ha1Var.invalidate();
                break;
            case 13:
                nb1 nb1Var = (nb1) this.b;
                nb1Var.getClass();
                nb1Var.W0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 14:
                kb1 kb1Var = (kb1) this.b;
                kb1Var.getClass();
                kb1Var.j5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kb1Var.m0();
                break;
            case 15:
                lb1 lb1Var = (lb1) this.b;
                lb1Var.getClass();
                lb1Var.setViewsOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                zd1 zd1Var = (zd1) this.b;
                zd1Var.getClass();
                zd1Var.y0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zd1Var.F();
                break;
        }
    }
}
