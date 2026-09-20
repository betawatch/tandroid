package org.telegram.ui;

import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
                org.telegram.ui.Components.v71 v71Var = kv0Var.s.q3;
                int measuredHeight = kv0Var.getMeasuredHeight();
                v71Var.h = (int) (((kv0Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - f7) - dp);
                v71Var.i = measuredHeight;
                View view2 = v71Var.v;
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
                f51 f51Var = (f51) obj;
                org.telegram.ui.Components.v71 v71Var2 = f51Var.r.Q;
                int measuredHeight2 = f51Var.getMeasuredHeight();
                v71Var2.h = (int) (((f51Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - f7) - 0);
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
