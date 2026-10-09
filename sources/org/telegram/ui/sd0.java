package org.telegram.ui;

import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sd0 implements o1.g {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ sd0(Object obj, int i10) {
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
                    hh.j.b(view, viewGroup, pointF);
                    org.telegram.ui.Components.p20 p20Var = kg0Var.h;
                    p20Var.setTranslationX(pointF.x);
                    p20Var.setTranslationY(pointF.y);
                    kg0Var.requestLayout();
                    break;
                }
                break;
            case 1:
                ro0 ro0Var = (ro0) obj;
                float f11 = f7 / 100.0f;
                ro0Var.b = f11;
                TextView textView = ro0Var.d.U;
                if (textView != null) {
                    textView.setAlpha((f11 * 0.2f) + 0.8f);
                }
                ro0Var.invalidate();
                break;
            case 2:
                pu0 pu0Var = (pu0) obj;
                pu0Var.c0 = f7;
                pu0Var.e0 = f10;
                pu0Var.G();
                break;
            case 3:
                lv0 lv0Var = (lv0) obj;
                int dp = lv0Var.e > lv0Var.f ? AndroidUtilities.dp(48.0f) : 0;
                org.telegram.ui.Components.m81 m81Var = lv0Var.s.q3;
                int measuredHeight = lv0Var.getMeasuredHeight();
                m81Var.h = (int) (((lv0Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - f7) - dp);
                m81Var.i = measuredHeight;
                View view2 = m81Var.v;
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
                e51 e51Var = (e51) obj;
                org.telegram.ui.Components.m81 m81Var2 = e51Var.r.Q;
                int measuredHeight2 = e51Var.getMeasuredHeight();
                m81Var2.h = (int) (((e51Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - f7) - 0);
                m81Var2.i = measuredHeight2;
                View view3 = m81Var2.v;
                if (view3 != null) {
                    view3.invalidate();
                    break;
                }
                break;
        }
    }
}
