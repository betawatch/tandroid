package org.telegram.ui;

import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wd0 implements o1.g {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wd0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // o1.g
    public final void a(o1.h hVar, float f7, float f10) {
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                og0 og0Var = ((ah0) obj).b0;
                if (og0Var != null) {
                    int i11 = og0.E;
                    View view = og0Var.c;
                    ViewGroup viewGroup = og0Var.b;
                    PointF pointF = og0Var.y;
                    ih.j.b(view, viewGroup, pointF);
                    org.telegram.ui.Components.l20 l20Var = og0Var.h;
                    l20Var.setTranslationX(pointF.x);
                    l20Var.setTranslationY(pointF.y);
                    og0Var.requestLayout();
                    break;
                }
                break;
            case 1:
                wo0 wo0Var = (wo0) obj;
                float f11 = f7 / 100.0f;
                wo0Var.b = f11;
                TextView textView = wo0Var.d.U;
                if (textView != null) {
                    textView.setAlpha((f11 * 0.2f) + 0.8f);
                }
                wo0Var.invalidate();
                break;
            case 2:
                uu0 uu0Var = (uu0) obj;
                uu0Var.c0 = f7;
                uu0Var.e0 = f10;
                uu0Var.G();
                break;
            case 3:
                qv0 qv0Var = (qv0) obj;
                int dp = qv0Var.e > qv0Var.f ? AndroidUtilities.dp(48.0f) : 0;
                org.telegram.ui.Components.k81 k81Var = qv0Var.s.q3;
                int measuredHeight = qv0Var.getMeasuredHeight();
                k81Var.h = (int) (((qv0Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - f7) - dp);
                k81Var.i = measuredHeight;
                View view2 = k81Var.v;
                if (view2 != null) {
                    view2.invalidate();
                    break;
                }
                break;
            case 4:
                r41 r41Var = (r41) obj;
                r41Var.y = f7 / 1000.0f;
                r41Var.invalidate();
                break;
            default:
                l51 l51Var = (l51) obj;
                org.telegram.ui.Components.k81 k81Var2 = l51Var.r.Q;
                int measuredHeight2 = l51Var.getMeasuredHeight();
                k81Var2.h = (int) (((l51Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - f7) - 0);
                k81Var2.i = measuredHeight2;
                View view3 = k81Var2.v;
                if (view3 != null) {
                    view3.invalidate();
                    break;
                }
                break;
        }
    }
}
