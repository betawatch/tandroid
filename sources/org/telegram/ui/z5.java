package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class z5 implements org.telegram.ui.Components.pt0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrameLayout b;

    public /* synthetic */ z5(int i7, FrameLayout frameLayout) {
        this.a = i7;
        this.b = frameLayout;
    }

    @Override // org.telegram.ui.Components.pt0
    public final void a(Canvas canvas, RectF rectF, RecyclerView recyclerView) {
        switch (this.a) {
            case 0:
                org.telegram.ui.Components.ck0 ck0Var = (org.telegram.ui.Components.ck0) recyclerView;
                ih.d.a(ck0Var, canvas, rectF, ck0Var, this.b);
                break;
            default:
                org.telegram.ui.Components.ck0 ck0Var2 = (org.telegram.ui.Components.ck0) recyclerView;
                ih.d.a(ck0Var2, canvas, rectF, ck0Var2, this.b);
                break;
        }
    }
}
