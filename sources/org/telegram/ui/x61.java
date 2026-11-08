package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class x61 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ Rect b;
    public final /* synthetic */ v71 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x61(v71 v71Var, Context context, int i7, Rect rect) {
        super(context);
        this.c = v71Var;
        this.a = i7;
        this.b = rect;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i7 = this.a;
        Rect rect = this.b;
        v71 v71Var = this.c;
        if (i7 == 0) {
            v71Var.r.setBounds(v71Var.W.getLeft() - rect.left, 0, v71Var.W.getRight() + rect.right, getMeasuredHeight());
        } else {
            v71Var.r.setBounds(-rect.left, 0, getMeasuredWidth() + rect.right, getMeasuredHeight());
        }
        v71Var.r.draw(canvas);
    }
}
