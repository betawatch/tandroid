package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class xc1 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ Rect b;
    public final /* synthetic */ wd1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xc1(wd1 wd1Var, Context context, int i10, Rect rect) {
        super(context);
        this.c = wd1Var;
        this.a = i10;
        this.b = rect;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i10 = this.a;
        Rect rect = this.b;
        wd1 wd1Var = this.c;
        if (i10 == 0) {
            wd1Var.r.setBounds(wd1Var.V.getLeft() - rect.left, 0, wd1Var.V.getRight() + rect.right, getMeasuredHeight());
        } else {
            wd1Var.r.setBounds(-rect.left, 0, getMeasuredWidth() + rect.right, getMeasuredHeight());
        }
        wd1Var.r.draw(canvas);
    }
}
