package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class z5 implements org.telegram.ui.Components.st0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrameLayout b;

    public /* synthetic */ z5(int i7, FrameLayout frameLayout) {
        this.a = i7;
        this.b = frameLayout;
    }

    @Override // org.telegram.ui.Components.st0
    public final void a(Canvas canvas, RectF rectF, RecyclerView recyclerView) {
        switch (this.a) {
            case 0:
                org.telegram.ui.Components.ek0 ek0Var = (org.telegram.ui.Components.ek0) recyclerView;
                ih.d.a(ek0Var, canvas, rectF, ek0Var, this.b);
                break;
            default:
                org.telegram.ui.Components.ek0 ek0Var2 = (org.telegram.ui.Components.ek0) recyclerView;
                ih.d.a(ek0Var2, canvas, rectF, ek0Var2, this.b);
                break;
        }
    }
}
