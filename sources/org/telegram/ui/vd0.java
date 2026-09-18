package org.telegram.ui;

import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vd0 implements o1.g {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vd0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // o1.g
    public final void a(o1.h hVar, float f7, float f10) {
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                mg0 mg0Var = ((yg0) obj).b0;
                if (mg0Var != null) {
                    int i11 = mg0.E;
                    View view = mg0Var.c;
                    ViewGroup viewGroup = mg0Var.b;
                    PointF pointF = mg0Var.y;
                    hh.k.b(view, viewGroup, pointF);
                    org.telegram.ui.Components.y10 y10Var = mg0Var.h;
                    y10Var.setTranslationX(pointF.x);
                    y10Var.setTranslationY(pointF.y);
                    mg0Var.requestLayout();
                    break;
                }
                break;
            case 1:
                uo0 uo0Var = (uo0) obj;
                float f11 = f7 / 100.0f;
                uo0Var.b = f11;
                TextView textView = uo0Var.d.U;
                if (textView != null) {
                    textView.setAlpha((f11 * 0.2f) + 0.8f);
                }
                uo0Var.invalidate();
                break;
            case 2:
                qu0 qu0Var = (qu0) obj;
                qu0Var.c0 = f7;
                qu0Var.e0 = f10;
                qu0Var.G();
                break;
            case 3:
                mv0 mv0Var = (mv0) obj;
                int dp = mv0Var.e > mv0Var.f ? AndroidUtilities.dp(48.0f) : 0;
                org.telegram.ui.Components.j71 j71Var = mv0Var.s.q3;
                int measuredHeight = mv0Var.getMeasuredHeight();
                j71Var.h = (int) (((mv0Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - f7) - dp);
                j71Var.i = measuredHeight;
                View view2 = j71Var.v;
                if (view2 != null) {
                    view2.invalidate();
                    break;
                }
                break;
            case 4:
                n41 n41Var = (n41) obj;
                n41Var.y = f7 / 1000.0f;
                n41Var.invalidate();
                break;
            default:
                e51 e51Var = (e51) obj;
                org.telegram.ui.Components.j71 j71Var2 = e51Var.r.Q;
                int measuredHeight2 = e51Var.getMeasuredHeight();
                j71Var2.h = (int) (((e51Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - f7) - 0);
                j71Var2.i = measuredHeight2;
                View view3 = j71Var2.v;
                if (view3 != null) {
                    view3.invalidate();
                    break;
                }
                break;
        }
    }
}
