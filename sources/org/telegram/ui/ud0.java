package org.telegram.ui;

import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ud0 implements o1.g {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ud0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // o1.g
    public final void a(o1.h hVar, float f7, float f10) {
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                lg0 lg0Var = ((xg0) obj).b0;
                if (lg0Var != null) {
                    int i11 = lg0.E;
                    View view = lg0Var.c;
                    ViewGroup viewGroup = lg0Var.b;
                    PointF pointF = lg0Var.y;
                    hh.k.b(view, viewGroup, pointF);
                    org.telegram.ui.Components.y10 y10Var = lg0Var.h;
                    y10Var.setTranslationX(pointF.x);
                    y10Var.setTranslationY(pointF.y);
                    lg0Var.requestLayout();
                    break;
                }
                break;
            case 1:
                to0 to0Var = (to0) obj;
                float f11 = f7 / 100.0f;
                to0Var.b = f11;
                TextView textView = to0Var.d.U;
                if (textView != null) {
                    textView.setAlpha((f11 * 0.2f) + 0.8f);
                }
                to0Var.invalidate();
                break;
            case 2:
                ou0 ou0Var = (ou0) obj;
                ou0Var.c0 = f7;
                ou0Var.e0 = f10;
                ou0Var.G();
                break;
            case 3:
                kv0 kv0Var = (kv0) obj;
                int dp = kv0Var.e > kv0Var.f ? AndroidUtilities.dp(48.0f) : 0;
                org.telegram.ui.Components.w71 w71Var = kv0Var.s.q3;
                int measuredHeight = kv0Var.getMeasuredHeight();
                w71Var.h = (int) (((kv0Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - f7) - dp);
                w71Var.i = measuredHeight;
                View view2 = w71Var.v;
                if (view2 != null) {
                    view2.invalidate();
                    break;
                }
                break;
            case 4:
                l41 l41Var = (l41) obj;
                l41Var.y = f7 / 1000.0f;
                l41Var.invalidate();
                break;
            default:
                c51 c51Var = (c51) obj;
                org.telegram.ui.Components.w71 w71Var2 = c51Var.r.Q;
                int measuredHeight2 = c51Var.getMeasuredHeight();
                w71Var2.h = (int) (((c51Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - f7) - 0);
                w71Var2.i = measuredHeight2;
                View view3 = w71Var2.v;
                if (view3 != null) {
                    view3.invalidate();
                    break;
                }
                break;
        }
    }
}
