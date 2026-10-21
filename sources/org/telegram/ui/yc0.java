package org.telegram.ui;

import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yc0 implements o1.g {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yc0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // o1.g
    public final void a(o1.h hVar, float f7, float f10) {
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                rf0 rf0Var = ((dg0) obj).b0;
                if (rf0Var != null) {
                    int i11 = rf0.E;
                    View view = rf0Var.c;
                    ViewGroup viewGroup = rf0Var.b;
                    PointF pointF = rf0Var.y;
                    ih.j.b(view, viewGroup, pointF);
                    org.telegram.ui.Components.h20 h20Var = rf0Var.h;
                    h20Var.setTranslationX(pointF.x);
                    h20Var.setTranslationY(pointF.y);
                    rf0Var.requestLayout();
                    break;
                }
                break;
            case 1:
                ao0 ao0Var = (ao0) obj;
                float f11 = f7 / 100.0f;
                ao0Var.b = f11;
                TextView textView = ao0Var.d.U;
                if (textView != null) {
                    textView.setAlpha((f11 * 0.2f) + 0.8f);
                }
                ao0Var.invalidate();
                break;
            case 2:
                ut0 ut0Var = (ut0) obj;
                ut0Var.c0 = f7;
                ut0Var.e0 = f10;
                ut0Var.G();
                break;
            case 3:
                qu0 qu0Var = (qu0) obj;
                int dp = qu0Var.e > qu0Var.f ? AndroidUtilities.dp(48.0f) : 0;
                org.telegram.ui.Components.e81 e81Var = qu0Var.s.q3;
                int measuredHeight = qu0Var.getMeasuredHeight();
                e81Var.h = (int) (((qu0Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - f7) - dp);
                e81Var.i = measuredHeight;
                View view2 = e81Var.v;
                if (view2 != null) {
                    view2.invalidate();
                    break;
                }
                break;
            case 4:
                x21 x21Var = (x21) obj;
                x21Var.y = f7 / 1000.0f;
                x21Var.invalidate();
                break;
            default:
                r31 r31Var = (r31) obj;
                org.telegram.ui.Components.e81 e81Var2 = r31Var.r.Q;
                int measuredHeight2 = r31Var.getMeasuredHeight();
                e81Var2.h = (int) (((r31Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - f7) - 0);
                e81Var2.i = measuredHeight2;
                View view3 = e81Var2.v;
                if (view3 != null) {
                    view3.invalidate();
                    break;
                }
                break;
        }
    }
}
