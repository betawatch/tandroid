package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v01 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ v01(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                x01 x01Var = (x01) this.b;
                x01Var.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x01Var.a();
                break;
            case 1:
                k11 k11Var = (k11) this.b;
                k11Var.A = AndroidUtilities.lerp(k11Var.B, valueAnimator.getAnimatedFraction());
                k11Var.h.setTextColor(i0.a.d(k11Var.A, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.z6, false), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.q6, false)));
                k11Var.r.setAlpha((k11Var.A / 2.0f) + 0.5f);
                break;
            case 2:
                ((z11) this.b).h.s(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 3:
                y11 y11Var = (y11) this.b;
                y11Var.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y11Var.K.invalidate();
                break;
            case 4:
                SecretMediaViewer secretMediaViewer = ((s31) this.b).d;
                secretMediaViewer.W.g0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer.W.invalidate();
                break;
            case 5:
                SecretMediaViewer secretMediaViewer2 = ((s31) this.b).d;
                secretMediaViewer2.W.g0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer2.W.invalidate();
                break;
            case 6:
                ((SecretMediaViewer) ((org.telegram.ui.Components.pl0) this.b).b).W.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 7:
                d41 d41Var = (d41) this.b;
                d41Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (d41Var.O) {
                    d41Var.J.invalidate();
                    break;
                }
                break;
            case 8:
                ((r41) this.b).e.Q0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 9:
                q51 q51Var = (q51) this.b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q51Var.r = floatValue;
                View view = q51Var.e;
                if (view != null) {
                    view.setAlpha(floatValue);
                    break;
                } else {
                    org.telegram.ui.Components.tf0 tf0Var = q51Var.d;
                    if (tf0Var != null) {
                        tf0Var.invalidate();
                        break;
                    }
                }
                break;
            case 10:
                x51 x51Var = (x51) this.b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x51Var.H = floatValue2;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = x51Var.v;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(floatValue2);
                org.telegram.ui.ActionBar.k1 k1Var = actionBarPopupWindow$ActionBarPopupWindowLayout.H;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(org.telegram.ui.Components.gr.g.getInterpolation(x51Var.H));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i9 = 0; i9 < itemsCount; i9++) {
                    float cascade = AndroidUtilities.cascade(x51Var.H, i9, itemsCount, 4.0f);
                    k1Var.getChildAt(i9).setTranslationY((1.0f - cascade) * AndroidUtilities.dp(-12.0f));
                    k1Var.getChildAt(i9).setAlpha(cascade);
                }
                break;
            case 11:
                z71.Y((z71) this.b, valueAnimator);
                break;
            case 12:
                c91 c91Var = (c91) this.b;
                c91Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c91Var.e.setAlpha(1.0f - floatValue3);
                qf.g gVar = c91Var.b;
                gVar.v0.f = floatValue3;
                c91Var.c.invalidate();
                gVar.invalidate();
                break;
            case 13:
                oc1 oc1Var = (oc1) this.b;
                oc1Var.getClass();
                oc1Var.k1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                oc1Var.t0.invalidate();
                oc1Var.y0.invalidate();
                oc1Var.N1.setAlpha(oc1Var.k1);
                oc1Var.M1.invalidate();
                oc1Var.V0();
                break;
            case 14:
                oc1 oc1Var2 = ((cc1) this.b).a;
                oc1Var2.k1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                oc1Var2.t0.invalidate();
                oc1Var2.y0.invalidate();
                oc1Var2.N1.setAlpha(oc1Var2.k1);
                oc1Var2.M1.invalidate();
                oc1Var2.V0();
                break;
            case 15:
                kd1 kd1Var = (kd1) this.b;
                kd1Var.A = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int childCount = kd1Var.a.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    int R = RecyclerView.R(kd1Var.a.getChildAt(i10));
                    int i11 = kd1Var.d.e;
                    if (R < i11 || i11 <= 0) {
                        kd1Var.a.getChildAt(i10).setAlpha(1.0f);
                    } else {
                        kd1Var.a.getChildAt(i10).setAlpha(kd1Var.A);
                    }
                }
                break;
            case 16:
                pd1 pd1Var = (pd1) this.b;
                pd1Var.getClass();
                pd1Var.c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pd1Var.invalidate();
                break;
            case 17:
                we1 we1Var = (we1) this.b;
                we1Var.getClass();
                we1Var.S0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 18:
                se1 se1Var = (se1) this.b;
                se1Var.getClass();
                se1Var.b5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                se1Var.e0();
                break;
            case 19:
                ue1 ue1Var = (ue1) this.b;
                ue1Var.getClass();
                ue1Var.setViewsOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                mh1 mh1Var = (mh1) this.b;
                mh1Var.getClass();
                mh1Var.u0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mh1Var.G();
                break;
        }
    }
}
