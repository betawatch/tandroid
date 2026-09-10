package org.telegram.ui;

import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class td0 implements o1.g {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ td0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // o1.g
    public final void a(o1.h hVar, float f7, float f10) {
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                kg0 kg0Var = ((xg0) obj).b0;
                if (kg0Var != null) {
                    int i11 = kg0.E;
                    View view = kg0Var.c;
                    ViewGroup viewGroup = kg0Var.b;
                    PointF pointF = kg0Var.y;
                    gh.k.b(view, viewGroup, pointF);
                    org.telegram.ui.Components.h20 h20Var = kg0Var.h;
                    h20Var.setTranslationX(pointF.x);
                    h20Var.setTranslationY(pointF.y);
                    kg0Var.requestLayout();
                    break;
                }
                break;
            case 1:
                so0 so0Var = (so0) obj;
                float f11 = f7 / 100.0f;
                so0Var.b = f11;
                TextView textView = so0Var.d.U;
                if (textView != null) {
                    textView.setAlpha((f11 * 0.2f) + 0.8f);
                }
                so0Var.invalidate();
                break;
            case 2:
                ou0 ou0Var = (ou0) obj;
                ou0Var.c0 = f7;
                ou0Var.e0 = f10;
                ou0Var.G();
                break;
            case 3:
                lv0 lv0Var = (lv0) obj;
                int dp = lv0Var.e > lv0Var.f ? AndroidUtilities.dp(48.0f) : 0;
                org.telegram.ui.Components.v71 v71Var = lv0Var.s.q3;
                int measuredHeight = lv0Var.getMeasuredHeight();
                v71Var.h = (int) (((lv0Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - f7) - dp);
                v71Var.i = measuredHeight;
                View view2 = v71Var.v;
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
                h51 h51Var = (h51) obj;
                org.telegram.ui.Components.v71 v71Var2 = h51Var.r.Q;
                int measuredHeight2 = h51Var.getMeasuredHeight();
                v71Var2.h = (int) (((h51Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - f7) - 0);
                v71Var2.i = measuredHeight2;
                View view3 = v71Var2.v;
                if (view3 != null) {
                    view3.invalidate();
                    break;
                }
                break;
        }
    }
}
