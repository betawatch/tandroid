package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class y61 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ Rect b;
    public final /* synthetic */ w71 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y61(w71 w71Var, Context context, int i7, Rect rect) {
        super(context);
        this.c = w71Var;
        this.a = i7;
        this.b = rect;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i7 = this.a;
        Rect rect = this.b;
        w71 w71Var = this.c;
        if (i7 == 0) {
            w71Var.r.setBounds(w71Var.W.getLeft() - rect.left, 0, w71Var.W.getRight() + rect.right, getMeasuredHeight());
        } else {
            w71Var.r.setBounds(-rect.left, 0, getMeasuredWidth() + rect.right, getMeasuredHeight());
        }
        w71Var.r.draw(canvas);
    }
}
