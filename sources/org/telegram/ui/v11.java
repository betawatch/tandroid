package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v11 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ v11(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                b21 b21Var = (b21) this.b;
                b21Var.y = AndroidUtilities.lerp(b21Var.E, valueAnimator.getAnimatedFraction());
                b21Var.h.setTextColor(i0.a.f(b21Var.y, org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.z6, false), org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.q6, false)));
                break;
            case 1:
                SecretMediaViewer secretMediaViewer = ((r31) this.b).d;
                secretMediaViewer.a0.k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer.a0.invalidate();
                break;
            case 2:
                SecretMediaViewer secretMediaViewer2 = ((r31) this.b).d;
                secretMediaViewer2.a0.k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer2.a0.invalidate();
                break;
            case 3:
                ((SecretMediaViewer) ((org.telegram.ui.Components.ln0) this.b).b).a0.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 4:
                c41 c41Var = (c41) this.b;
                c41Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (c41Var.S) {
                    c41Var.N.invalidate();
                    break;
                }
                break;
            case 5:
                ((s41) this.b).e.U0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 6:
                r51 r51Var = (r51) this.b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r51Var.r = floatValue;
                View view = r51Var.e;
                if (view != null) {
                    view.setAlpha(floatValue);
                    break;
                } else {
                    org.telegram.ui.Components.gh0 gh0Var = r51Var.d;
                    if (gh0Var != null) {
                        gh0Var.invalidate();
                        break;
                    }
                }
                break;
            case 7:
                y51 y51Var = (y51) this.b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y51Var.L = floatValue2;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = y51Var.v;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(floatValue2);
                org.telegram.ui.ActionBar.k1 k1Var = actionBarPopupWindow$ActionBarPopupWindowLayout.L;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(org.telegram.ui.Components.ds.g.getInterpolation(y51Var.L));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i10 = 0; i10 < itemsCount; i10++) {
                    float cascade = AndroidUtilities.cascade(y51Var.L, i10, itemsCount, 4.0f);
                    k1Var.getChildAt(i10).setTranslationY((1.0f - cascade) * AndroidUtilities.dp(-12.0f));
                    k1Var.getChildAt(i10).setAlpha(cascade);
                }
                break;
            case 8:
                d81 d81Var = (d81) this.b;
                d81Var.getClass();
                d81Var.k0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 9:
                g91 g91Var = (g91) this.b;
                g91Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g91Var.e.setAlpha(1.0f - floatValue3);
                kg.h hVar = g91Var.b;
                hVar.z0.f = floatValue3;
                g91Var.c.invalidate();
                hVar.invalidate();
                break;
            case 10:
                tc1 tc1Var = (tc1) this.b;
                tc1Var.getClass();
                tc1Var.p1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tc1Var.y0.invalidate();
                tc1Var.D0.invalidate();
                tc1Var.S1.setAlpha(tc1Var.p1);
                tc1Var.R1.invalidate();
                tc1Var.W0();
                break;
            case 11:
                tc1 tc1Var2 = ((hc1) this.b).a;
                tc1Var2.p1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tc1Var2.y0.invalidate();
                tc1Var2.D0.invalidate();
                tc1Var2.S1.setAlpha(tc1Var2.p1);
                tc1Var2.R1.invalidate();
                tc1Var2.W0();
                break;
            case 12:
                pd1 pd1Var = (pd1) this.b;
                pd1Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int childCount = pd1Var.a.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    int R = RecyclerView.R(pd1Var.a.getChildAt(i11));
                    int i12 = pd1Var.d.e;
                    if (R < i12 || i12 <= 0) {
                        pd1Var.a.getChildAt(i11).setAlpha(1.0f);
                    } else {
                        pd1Var.a.getChildAt(i11).setAlpha(pd1Var.E);
                    }
                }
                break;
            case 13:
                ud1 ud1Var = (ud1) this.b;
                ud1Var.getClass();
                ud1Var.c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ud1Var.invalidate();
                break;
            case 14:
                af1 af1Var = (af1) this.b;
                af1Var.getClass();
                af1Var.S0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 15:
                xe1 xe1Var = (xe1) this.b;
                xe1Var.getClass();
                xe1Var.j5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xe1Var.e0();
                break;
            case 16:
                ye1 ye1Var = (ye1) this.b;
                ye1Var.getClass();
                ye1Var.setViewsOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                ph1 ph1Var = (ph1) this.b;
                ph1Var.getClass();
                ph1Var.y0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ph1Var.F();
                break;
        }
    }
}
