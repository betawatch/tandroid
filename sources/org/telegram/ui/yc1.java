package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class yc1 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ Rect b;
    public final /* synthetic */ xd1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yc1(xd1 xd1Var, Context context, int i10, Rect rect) {
        super(context);
        this.c = xd1Var;
        this.a = i10;
        this.b = rect;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i10 = this.a;
        Rect rect = this.b;
        xd1 xd1Var = this.c;
        if (i10 == 0) {
            xd1Var.r.setBounds(xd1Var.V.getLeft() - rect.left, 0, xd1Var.V.getRight() + rect.right, getMeasuredHeight());
        } else {
            xd1Var.r.setBounds(-rect.left, 0, getMeasuredWidth() + rect.right, getMeasuredHeight());
        }
        xd1Var.r.draw(canvas);
    }
}
