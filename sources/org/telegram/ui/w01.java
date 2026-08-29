package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w01 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ w01(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                y01 y01Var = (y01) this.b;
                y01Var.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y01Var.a();
                break;
            case 1:
                l11 l11Var = (l11) this.b;
                l11Var.A = AndroidUtilities.lerp(l11Var.B, valueAnimator.getAnimatedFraction());
                l11Var.h.setTextColor(i0.a.d(l11Var.A, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.z6, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.q6, false)));
                l11Var.r.setAlpha((l11Var.A / 2.0f) + 0.5f);
                break;
            case 2:
                ((a21) this.b).h.s(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 3:
                z11 z11Var = (z11) this.b;
                z11Var.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z11Var.K.invalidate();
                break;
            case 4:
                SecretMediaViewer secretMediaViewer = ((u31) this.b).d;
                secretMediaViewer.W.g0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer.W.invalidate();
                break;
            case 5:
                SecretMediaViewer secretMediaViewer2 = ((u31) this.b).d;
                secretMediaViewer2.W.g0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer2.W.invalidate();
                break;
            case 6:
                ((SecretMediaViewer) ((org.telegram.ui.Components.cm0) this.b).b).W.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 7:
                f41 f41Var = (f41) this.b;
                f41Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (f41Var.O) {
                    f41Var.J.invalidate();
                    break;
                }
                break;
            case 8:
                ((t41) this.b).e.Q0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 9:
                s51 s51Var = (s51) this.b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s51Var.r = floatValue;
                View view = s51Var.e;
                if (view != null) {
                    view.setAlpha(floatValue);
                    break;
                } else {
                    cg.y yVar = s51Var.d;
                    if (yVar != null) {
                        yVar.invalidate();
                        break;
                    }
                }
                break;
            case 10:
                z51 z51Var = (z51) this.b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z51Var.H = floatValue2;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = z51Var.v;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(floatValue2);
                org.telegram.ui.ActionBar.k1 k1Var = actionBarPopupWindow$ActionBarPopupWindowLayout.H;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(org.telegram.ui.Components.jr.g.getInterpolation(z51Var.H));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i10 = 0; i10 < itemsCount; i10++) {
                    float cascade = AndroidUtilities.cascade(z51Var.H, i10, itemsCount, 4.0f);
                    k1Var.getChildAt(i10).setTranslationY((1.0f - cascade) * AndroidUtilities.dp(-12.0f));
                    k1Var.getChildAt(i10).setAlpha(cascade);
                }
                break;
            case 11:
                b81.Z((b81) this.b, valueAnimator);
                break;
            case 12:
                d91 d91Var = (d91) this.b;
                d91Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d91Var.e.setAlpha(1.0f - floatValue3);
                tf.g gVar = d91Var.b;
                gVar.v0.f = floatValue3;
                d91Var.c.invalidate();
                gVar.invalidate();
                break;
            case 13:
                qc1 qc1Var = (qc1) this.b;
                qc1Var.getClass();
                qc1Var.k1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qc1Var.t0.invalidate();
                qc1Var.y0.invalidate();
                qc1Var.N1.setAlpha(qc1Var.k1);
                qc1Var.M1.invalidate();
                qc1Var.V0();
                break;
            case 14:
                qc1 qc1Var2 = ((ec1) this.b).a;
                qc1Var2.k1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qc1Var2.t0.invalidate();
                qc1Var2.y0.invalidate();
                qc1Var2.N1.setAlpha(qc1Var2.k1);
                qc1Var2.M1.invalidate();
                qc1Var2.V0();
                break;
            case 15:
                md1 md1Var = (md1) this.b;
                md1Var.A = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int childCount = md1Var.a.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    int R = RecyclerView.R(md1Var.a.getChildAt(i11));
                    int i12 = md1Var.d.e;
                    if (R < i12 || i12 <= 0) {
                        md1Var.a.getChildAt(i11).setAlpha(1.0f);
                    } else {
                        md1Var.a.getChildAt(i11).setAlpha(md1Var.A);
                    }
                }
                break;
            case 16:
                rd1 rd1Var = (rd1) this.b;
                rd1Var.getClass();
                rd1Var.c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rd1Var.invalidate();
                break;
            case 17:
                ze1 ze1Var = (ze1) this.b;
                ze1Var.getClass();
                ze1Var.S0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 18:
                we1 we1Var = (we1) this.b;
                we1Var.getClass();
                we1Var.b5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                we1Var.f0();
                break;
            case 19:
                xe1 xe1Var = (xe1) this.b;
                xe1Var.getClass();
                xe1Var.setViewsOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                oh1 oh1Var = (oh1) this.b;
                oh1Var.getClass();
                oh1Var.u0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                oh1Var.G();
                break;
        }
    }
}
