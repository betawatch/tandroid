package org.telegram.ui;

import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wa0 implements q1.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wa0(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // q1.d
    public final void a(q1.g gVar, float f10, float f11) {
        int i3 = this.a;
        Object obj = this.b;
        switch (i3) {
            case 0:
                md0 md0Var = ((xd0) obj).c0;
                if (md0Var != null) {
                    int i10 = md0.G;
                    View view = md0Var.c;
                    ViewGroup viewGroup = md0Var.b;
                    PointF pointF = md0Var.E;
                    kh.k.b(view, viewGroup, pointF);
                    org.telegram.ui.Components.l00 l00Var = md0Var.h;
                    l00Var.setTranslationX(pointF.x);
                    l00Var.setTranslationY(pointF.y);
                    md0Var.requestLayout();
                    break;
                }
                break;
            case 1:
                zk0 zk0Var = (zk0) obj;
                float f12 = f10 / 100.0f;
                zk0Var.b = f12;
                TextView textView = zk0Var.d.V;
                if (textView != null) {
                    textView.setAlpha((f12 * 0.2f) + 0.8f);
                }
                zk0Var.invalidate();
                break;
            case 2:
                zp0 zp0Var = (zp0) obj;
                zp0Var.d0 = f10;
                zp0Var.f0 = f11;
                zp0Var.G();
                break;
            case 3:
                sq0 sq0Var = (sq0) obj;
                int L = sq0Var.e > sq0Var.f ? org.telegram.messenger.g0.L(48.0f) : 0;
                org.telegram.ui.Components.o51 o51Var = sq0Var.s.r3;
                int measuredHeight = sq0Var.getMeasuredHeight();
                o51Var.h = (int) (((sq0Var.getMeasuredWidth() - org.telegram.messenger.g0.L(16.0f)) - f10) - L);
                o51Var.i = measuredHeight;
                View view2 = o51Var.v;
                if (view2 != null) {
                    view2.invalidate();
                    break;
                }
                break;
            case 4:
                my0 my0Var = (my0) obj;
                my0Var.E = f10 / 1000.0f;
                my0Var.invalidate();
                break;
            default:
                cz0 cz0Var = (cz0) obj;
                org.telegram.ui.Components.o51 o51Var2 = cz0Var.r.P;
                int measuredHeight2 = cz0Var.getMeasuredHeight();
                o51Var2.h = (int) (((cz0Var.getMeasuredWidth() - org.telegram.messenger.g0.L(16.0f)) - f10) - 0);
                o51Var2.i = measuredHeight2;
                View view3 = o51Var2.v;
                if (view3 != null) {
                    view3.invalidate();
                    break;
                }
                break;
        }
    }
}
