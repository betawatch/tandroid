package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class x61 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ Rect b;
    public final /* synthetic */ x71 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x61(x71 x71Var, Context context, int i7, Rect rect) {
        super(context);
        this.c = x71Var;
        this.a = i7;
        this.b = rect;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i7 = this.a;
        Rect rect = this.b;
        x71 x71Var = this.c;
        if (i7 == 0) {
            x71Var.r.setBounds(x71Var.X.getLeft() - rect.left, 0, x71Var.X.getRight() + rect.right, getMeasuredHeight());
        } else {
            x71Var.r.setBounds(-rect.left, 0, getMeasuredWidth() + rect.right, getMeasuredHeight());
        }
        x71Var.r.draw(canvas);
    }
}
