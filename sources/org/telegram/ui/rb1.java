package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class rb1 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ Rect b;
    public final /* synthetic */ qc1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rb1(qc1 qc1Var, Context context, int i10, Rect rect) {
        super(context);
        this.c = qc1Var;
        this.a = i10;
        this.b = rect;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i10 = this.a;
        Rect rect = this.b;
        qc1 qc1Var = this.c;
        if (i10 == 0) {
            qc1Var.r.setBounds(qc1Var.W.getLeft() - rect.left, 0, qc1Var.W.getRight() + rect.right, getMeasuredHeight());
        } else {
            qc1Var.r.setBounds(-rect.left, 0, getMeasuredWidth() + rect.right, getMeasuredHeight());
        }
        qc1Var.r.draw(canvas);
    }
}
