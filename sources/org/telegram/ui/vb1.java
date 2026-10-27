package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class vb1 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ Rect b;
    public final /* synthetic */ vc1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vb1(vc1 vc1Var, Context context, int i10, Rect rect) {
        super(context);
        this.c = vc1Var;
        this.a = i10;
        this.b = rect;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i10 = this.a;
        Rect rect = this.b;
        vc1 vc1Var = this.c;
        if (i10 == 0) {
            vc1Var.r.setBounds(vc1Var.W.getLeft() - rect.left, 0, vc1Var.W.getRight() + rect.right, getMeasuredHeight());
        } else {
            vc1Var.r.setBounds(-rect.left, 0, getMeasuredWidth() + rect.right, getMeasuredHeight());
        }
        vc1Var.r.draw(canvas);
    }
}
