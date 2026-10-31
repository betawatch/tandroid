package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class z5 implements org.telegram.ui.Components.ju0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrameLayout b;

    public /* synthetic */ z5(int i10, FrameLayout frameLayout) {
        this.a = i10;
        this.b = frameLayout;
    }

    @Override // org.telegram.ui.Components.ju0
    public final void a(Canvas canvas, RectF rectF, RecyclerView recyclerView) {
        switch (this.a) {
            case 0:
                org.telegram.ui.Components.tk0 tk0Var = (org.telegram.ui.Components.tk0) recyclerView;
                yg.d.a(tk0Var, canvas, rectF, tk0Var, this.b);
                break;
            default:
                org.telegram.ui.Components.tk0 tk0Var2 = (org.telegram.ui.Components.tk0) recyclerView;
                yg.d.a(tk0Var2, canvas, rectF, tk0Var2, this.b);
                break;
        }
    }
}
