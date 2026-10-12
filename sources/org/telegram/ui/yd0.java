package org.telegram.ui;

import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class yd0 implements o1.g {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yd0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // o1.g
    public final void a(o1.h hVar, float f7, float f10) {
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                pg0 pg0Var = ((bh0) obj).b0;
                if (pg0Var != null) {
                    int i11 = pg0.E;
                    View view = pg0Var.c;
                    ViewGroup viewGroup = pg0Var.b;
                    PointF pointF = pg0Var.y;
                    ih.j.b(view, viewGroup, pointF);
                    org.telegram.ui.Components.l20 l20Var = pg0Var.h;
                    l20Var.setTranslationX(pointF.x);
                    l20Var.setTranslationY(pointF.y);
                    pg0Var.requestLayout();
                    break;
                }
                break;
            case 1:
                yo0 yo0Var = (yo0) obj;
                float f11 = f7 / 100.0f;
                yo0Var.b = f11;
                TextView textView = yo0Var.d.U;
                if (textView != null) {
                    textView.setAlpha((f11 * 0.2f) + 0.8f);
                }
                yo0Var.invalidate();
                break;
            case 2:
                vu0 vu0Var = (vu0) obj;
                vu0Var.c0 = f7;
                vu0Var.e0 = f10;
                vu0Var.G();
                break;
            case 3:
                rv0 rv0Var = (rv0) obj;
                int dp = rv0Var.e > rv0Var.f ? AndroidUtilities.dp(48.0f) : 0;
                org.telegram.ui.Components.j81 j81Var = rv0Var.s.q3;
                int measuredHeight = rv0Var.getMeasuredHeight();
                j81Var.h = (int) (((rv0Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - f7) - dp);
                j81Var.i = measuredHeight;
                View view2 = j81Var.v;
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
                org.telegram.ui.Components.j81 j81Var2 = l51Var.r.Q;
                int measuredHeight2 = l51Var.getMeasuredHeight();
                j81Var2.h = (int) (((l51Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - f7) - 0);
                j81Var2.i = measuredHeight2;
                View view3 = j81Var2.v;
                if (view3 != null) {
                    view3.invalidate();
                    break;
                }
                break;
        }
    }
}
