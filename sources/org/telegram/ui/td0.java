package org.telegram.ui;

import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
                kg0 kg0Var = ((wg0) obj).b0;
                if (kg0Var != null) {
                    int i11 = kg0.E;
                    View view = kg0Var.c;
                    ViewGroup viewGroup = kg0Var.b;
                    PointF pointF = kg0Var.y;
                    ih.k.b(view, viewGroup, pointF);
                    org.telegram.ui.Components.y10 y10Var = kg0Var.h;
                    y10Var.setTranslationX(pointF.x);
                    y10Var.setTranslationY(pointF.y);
                    kg0Var.requestLayout();
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
                nu0 nu0Var = (nu0) obj;
                nu0Var.c0 = f7;
                nu0Var.e0 = f10;
                nu0Var.G();
                break;
            case 3:
                jv0 jv0Var = (jv0) obj;
                int dp = jv0Var.e > jv0Var.f ? AndroidUtilities.dp(48.0f) : 0;
                org.telegram.ui.Components.i71 i71Var = jv0Var.s.q3;
                int measuredHeight = jv0Var.getMeasuredHeight();
                i71Var.h = (int) (((jv0Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - f7) - dp);
                i71Var.i = measuredHeight;
                View view2 = i71Var.v;
                if (view2 != null) {
                    view2.invalidate();
                    break;
                }
                break;
            case 4:
                o41 o41Var = (o41) obj;
                o41Var.y = f7 / 1000.0f;
                o41Var.invalidate();
                break;
            default:
                e51 e51Var = (e51) obj;
                org.telegram.ui.Components.i71 i71Var2 = e51Var.r.Q;
                int measuredHeight2 = e51Var.getMeasuredHeight();
                i71Var2.h = (int) (((e51Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - f7) - 0);
                i71Var2.i = measuredHeight2;
                View view3 = i71Var2.v;
                if (view3 != null) {
                    view3.invalidate();
                    break;
                }
                break;
        }
    }
}
