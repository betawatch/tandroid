package org.telegram.ui;

import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rd0 implements o1.g {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rd0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // o1.g
    public final void a(o1.h hVar, float f7, float f10) {
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                ig0 ig0Var = ((ug0) obj).b0;
                if (ig0Var != null) {
                    int i11 = ig0.E;
                    View view = ig0Var.c;
                    ViewGroup viewGroup = ig0Var.b;
                    PointF pointF = ig0Var.y;
                    hh.k.b(view, viewGroup, pointF);
                    org.telegram.ui.Components.c20 c20Var = ig0Var.h;
                    c20Var.setTranslationX(pointF.x);
                    c20Var.setTranslationY(pointF.y);
                    ig0Var.requestLayout();
                    break;
                }
                break;
            case 1:
                oo0 oo0Var = (oo0) obj;
                float f11 = f7 / 100.0f;
                oo0Var.b = f11;
                TextView textView = oo0Var.d.U;
                if (textView != null) {
                    textView.setAlpha((f11 * 0.2f) + 0.8f);
                }
                oo0Var.invalidate();
                break;
            case 2:
                ju0 ju0Var = (ju0) obj;
                ju0Var.c0 = f7;
                ju0Var.e0 = f10;
                ju0Var.G();
                break;
            case 3:
                fv0 fv0Var = (fv0) obj;
                int dp = fv0Var.e > fv0Var.f ? AndroidUtilities.dp(48.0f) : 0;
                org.telegram.ui.Components.g81 g81Var = fv0Var.s.q3;
                int measuredHeight = fv0Var.getMeasuredHeight();
                g81Var.h = (int) (((fv0Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - f7) - dp);
                g81Var.i = measuredHeight;
                View view2 = g81Var.v;
                if (view2 != null) {
                    view2.invalidate();
                    break;
                }
                break;
            case 4:
                d41 d41Var = (d41) obj;
                d41Var.y = f7 / 1000.0f;
                d41Var.invalidate();
                break;
            default:
                w41 w41Var = (w41) obj;
                org.telegram.ui.Components.g81 g81Var2 = w41Var.r.Q;
                int measuredHeight2 = w41Var.getMeasuredHeight();
                g81Var2.h = (int) (((w41Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - f7) - 0);
                g81Var2.i = measuredHeight2;
                View view3 = g81Var2.v;
                if (view3 != null) {
                    view3.invalidate();
                    break;
                }
                break;
        }
    }
}
