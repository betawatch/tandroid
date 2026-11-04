package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xy0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xy0(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                SecretMediaViewer secretMediaViewer = ((yy0) this.b).d;
                secretMediaViewer.Z.l0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer.Z.invalidate();
                break;
            case 1:
                SecretMediaViewer secretMediaViewer2 = ((yy0) this.b).d;
                secretMediaViewer2.Z.l0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer2.Z.invalidate();
                break;
            case 2:
                ((SecretMediaViewer) ((org.telegram.ui.Components.rk0) this.b).b).Z.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 3:
                iz0 iz0Var = (iz0) this.b;
                iz0Var.w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (iz0Var.T) {
                    iz0Var.O.invalidate();
                    break;
                }
                break;
            case 4:
                ((xz0) this.b).e.V0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 5:
                yz0 yz0Var = (yz0) this.b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yz0Var.r = floatValue;
                View view = yz0Var.e;
                if (view != null) {
                    view.setAlpha(floatValue);
                    break;
                } else {
                    gi.q3 q3Var = yz0Var.d;
                    if (q3Var != null) {
                        q3Var.invalidate();
                        break;
                    }
                }
                break;
            case 6:
                c11 c11Var = (c11) this.b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c11Var.M = floatValue2;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = c11Var.w;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(floatValue2);
                s51 s51Var = actionBarPopupWindow$ActionBarPopupWindowLayout.M;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(org.telegram.ui.Components.xq.g.getInterpolation(c11Var.M));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i3 = 0; i3 < itemsCount; i3++) {
                    float s6 = org.telegram.messenger.g0.s(c11Var.M, i3, itemsCount, 4.0f);
                    s51Var.getChildAt(i3).setTranslationY((1.0f - s6) * org.telegram.messenger.g0.L(-12.0f));
                    s51Var.getChildAt(i3).setAlpha(s6);
                }
                break;
            case 7:
                c31 c31Var = (c31) this.b;
                c31Var.getClass();
                c31Var.l0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 8:
                b41 b41Var = (b41) this.b;
                b41Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b41Var.e.setAlpha(1.0f - floatValue3);
                mg.g gVar = b41Var.b;
                gVar.A0.f = floatValue3;
                b41Var.c.invalidate();
                gVar.invalidate();
                break;
            case 9:
                l71 l71Var = (l71) this.b;
                l71Var.getClass();
                l71Var.q1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l71Var.z0.invalidate();
                l71Var.E0.invalidate();
                l71Var.T1.setAlpha(l71Var.q1);
                l71Var.S1.invalidate();
                l71Var.a1();
                break;
            case 10:
                l71 l71Var2 = ((a71) this.b).a;
                l71Var2.q1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l71Var2.z0.invalidate();
                l71Var2.E0.invalidate();
                l71Var2.T1.setAlpha(l71Var2.q1);
                l71Var2.S1.invalidate();
                l71Var2.a1();
                break;
            case 11:
                d81 d81Var = (d81) this.b;
                d81Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int childCount = d81Var.a.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    int R = RecyclerView.R(d81Var.a.getChildAt(i10));
                    int i11 = d81Var.d.e;
                    if (R < i11 || i11 <= 0) {
                        d81Var.a.getChildAt(i10).setAlpha(1.0f);
                    } else {
                        d81Var.a.getChildAt(i10).setAlpha(d81Var.F);
                    }
                }
                break;
            case 12:
                j81 j81Var = (j81) this.b;
                j81Var.getClass();
                j81Var.b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j81Var.invalidate();
                break;
            case 13:
                m91 m91Var = (m91) this.b;
                m91Var.getClass();
                m91Var.W0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 14:
                j91 j91Var = (j91) this.b;
                j91Var.getClass();
                j91Var.k5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j91Var.n0();
                break;
            case 15:
                k91 k91Var = (k91) this.b;
                k91Var.getClass();
                k91Var.setViewsOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                zb1 zb1Var = (zb1) this.b;
                zb1Var.getClass();
                zb1Var.z0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zb1Var.F();
                break;
        }
    }
}
