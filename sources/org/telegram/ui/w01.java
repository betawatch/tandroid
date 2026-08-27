package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
                j11 j11Var = (j11) this.b;
                j11Var.A = AndroidUtilities.lerp(j11Var.B, valueAnimator.getAnimatedFraction());
                j11Var.h.setTextColor(i0.b.d(j11Var.A, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.z6, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.q6, false)));
                j11Var.r.setAlpha((j11Var.A / 2.0f) + 0.5f);
                break;
            case 2:
                ((y11) this.b).h.s(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 3:
                x11 x11Var = (x11) this.b;
                x11Var.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x11Var.K.invalidate();
                break;
            case 4:
                SecretMediaViewer secretMediaViewer = ((r31) this.b).d;
                secretMediaViewer.W.g0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer.W.invalidate();
                break;
            case 5:
                SecretMediaViewer secretMediaViewer2 = ((r31) this.b).d;
                secretMediaViewer2.W.g0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer2.W.invalidate();
                break;
            case 6:
                ((SecretMediaViewer) ((org.telegram.ui.Components.sl0) this.b).b).W.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 7:
                c41 c41Var = (c41) this.b;
                c41Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (c41Var.O) {
                    c41Var.J.invalidate();
                    break;
                }
                break;
            case 8:
                ((q41) this.b).e.Q0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 9:
                p51 p51Var = (p51) this.b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p51Var.r = floatValue;
                View view = p51Var.e;
                if (view != null) {
                    view.setAlpha(floatValue);
                    break;
                } else {
                    ag.d0 d0Var = p51Var.d;
                    if (d0Var != null) {
                        d0Var.invalidate();
                        break;
                    }
                }
                break;
            case 10:
                w51 w51Var = (w51) this.b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w51Var.H = floatValue2;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = w51Var.v;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(floatValue2);
                org.telegram.ui.ActionBar.j1 j1Var = actionBarPopupWindow$ActionBarPopupWindowLayout.H;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(org.telegram.ui.Components.er.g.getInterpolation(w51Var.H));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i10 = 0; i10 < itemsCount; i10++) {
                    float cascade = AndroidUtilities.cascade(w51Var.H, i10, itemsCount, 4.0f);
                    j1Var.getChildAt(i10).setTranslationY((1.0f - cascade) * AndroidUtilities.dp(-12.0f));
                    j1Var.getChildAt(i10).setAlpha(cascade);
                }
                break;
            case 11:
                x71.Z((x71) this.b, valueAnimator);
                break;
            case 12:
                a91 a91Var = (a91) this.b;
                a91Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a91Var.e.setAlpha(1.0f - floatValue3);
                rf.g gVar = a91Var.b;
                gVar.v0.f = floatValue3;
                a91Var.c.invalidate();
                gVar.invalidate();
                break;
            case 13:
                nc1 nc1Var = (nc1) this.b;
                nc1Var.getClass();
                nc1Var.k1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nc1Var.t0.invalidate();
                nc1Var.y0.invalidate();
                nc1Var.N1.setAlpha(nc1Var.k1);
                nc1Var.M1.invalidate();
                nc1Var.V0();
                break;
            case 14:
                nc1 nc1Var2 = ((bc1) this.b).a;
                nc1Var2.k1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nc1Var2.t0.invalidate();
                nc1Var2.y0.invalidate();
                nc1Var2.N1.setAlpha(nc1Var2.k1);
                nc1Var2.M1.invalidate();
                nc1Var2.V0();
                break;
            case 15:
                ld1 ld1Var = (ld1) this.b;
                ld1Var.A = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int childCount = ld1Var.a.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    int R = RecyclerView.R(ld1Var.a.getChildAt(i11));
                    int i12 = ld1Var.d.e;
                    if (R < i12 || i12 <= 0) {
                        ld1Var.a.getChildAt(i11).setAlpha(1.0f);
                    } else {
                        ld1Var.a.getChildAt(i11).setAlpha(ld1Var.A);
                    }
                }
                break;
            case 16:
                qd1 qd1Var = (qd1) this.b;
                qd1Var.getClass();
                qd1Var.c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qd1Var.invalidate();
                break;
            case 17:
                we1 we1Var = (we1) this.b;
                we1Var.getClass();
                we1Var.S0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 18:
                te1 te1Var = (te1) this.b;
                te1Var.getClass();
                te1Var.b5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                te1Var.f0();
                break;
            case 19:
                ue1 ue1Var = (ue1) this.b;
                ue1Var.getClass();
                ue1Var.setViewsOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                lh1 lh1Var = (lh1) this.b;
                lh1Var.getClass();
                lh1Var.u0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lh1Var.G();
                break;
        }
    }
}
