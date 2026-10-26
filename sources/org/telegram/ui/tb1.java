package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class tb1 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ Rect b;
    public final /* synthetic */ tc1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tb1(tc1 tc1Var, Context context, int i10, Rect rect) {
        super(context);
        this.c = tc1Var;
        this.a = i10;
        this.b = rect;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i10 = this.a;
        Rect rect = this.b;
        tc1 tc1Var = this.c;
        if (i10 == 0) {
            tc1Var.r.setBounds(tc1Var.W.getLeft() - rect.left, 0, tc1Var.W.getRight() + rect.right, getMeasuredHeight());
        } else {
            tc1Var.r.setBounds(-rect.left, 0, getMeasuredWidth() + rect.right, getMeasuredHeight());
        }
        tc1Var.r.draw(canvas);
    }
}
