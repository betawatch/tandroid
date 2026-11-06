package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z5 implements org.telegram.ui.Components.gt0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrameLayout b;

    public /* synthetic */ z5(int i7, FrameLayout frameLayout) {
        this.a = i7;
        this.b = frameLayout;
    }

    @Override // org.telegram.ui.Components.gt0
    public final void a(Canvas canvas, RectF rectF, RecyclerView recyclerView) {
        switch (this.a) {
            case 0:
                org.telegram.ui.Components.pj0 pj0Var = (org.telegram.ui.Components.pj0) recyclerView;
                ih.d.a(pj0Var, canvas, rectF, pj0Var, this.b);
                break;
            default:
                org.telegram.ui.Components.pj0 pj0Var2 = (org.telegram.ui.Components.pj0) recyclerView;
                ih.d.a(pj0Var2, canvas, rectF, pj0Var2, this.b);
                break;
        }
    }
}
