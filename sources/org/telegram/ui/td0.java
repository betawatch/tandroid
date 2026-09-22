package org.telegram.ui;

import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
                    hh.k.b(view, viewGroup, pointF);
                    org.telegram.ui.Components.y10 y10Var = kg0Var.h;
                    y10Var.setTranslationX(pointF.x);
                    y10Var.setTranslationY(pointF.y);
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
                kv0 kv0Var = (kv0) obj;
                int dp = kv0Var.e > kv0Var.f ? AndroidUtilities.dp(48.0f) : 0;
                org.telegram.ui.Components.i71 i71Var = kv0Var.s.q3;
                int measuredHeight = kv0Var.getMeasuredHeight();
                i71Var.h = (int) (((kv0Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - f7) - dp);
                i71Var.i = measuredHeight;
                View view2 = i71Var.v;
                if (view2 != null) {
                    view2.invalidate();
                    break;
                }
                break;
            case 4:
                m41 m41Var = (m41) obj;
                m41Var.y = f7 / 1000.0f;
                m41Var.invalidate();
                break;
            default:
                c51 c51Var = (c51) obj;
                org.telegram.ui.Components.i71 i71Var2 = c51Var.r.Q;
                int measuredHeight2 = c51Var.getMeasuredHeight();
                i71Var2.h = (int) (((c51Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - f7) - 0);
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
