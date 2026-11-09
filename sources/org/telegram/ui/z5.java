package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class z5 implements org.telegram.ui.Components.it0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrameLayout b;

    public /* synthetic */ z5(int i7, FrameLayout frameLayout) {
        this.a = i7;
        this.b = frameLayout;
    }

    @Override // org.telegram.ui.Components.it0
    public final void a(Canvas canvas, RectF rectF, RecyclerView recyclerView) {
        switch (this.a) {
            case 0:
                org.telegram.ui.Components.qj0 qj0Var = (org.telegram.ui.Components.qj0) recyclerView;
                ih.d.a(qj0Var, canvas, rectF, qj0Var, this.b);
                break;
            default:
                org.telegram.ui.Components.qj0 qj0Var2 = (org.telegram.ui.Components.qj0) recyclerView;
                ih.d.a(qj0Var2, canvas, rectF, qj0Var2, this.b);
                break;
        }
    }
}
