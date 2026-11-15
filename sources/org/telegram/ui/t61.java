package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class t61 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ Rect b;
    public final /* synthetic */ t71 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t61(t71 t71Var, Context context, int i7, Rect rect) {
        super(context);
        this.c = t71Var;
        this.a = i7;
        this.b = rect;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i7 = this.a;
        Rect rect = this.b;
        t71 t71Var = this.c;
        if (i7 == 0) {
            t71Var.r.setBounds(t71Var.X.getLeft() - rect.left, 0, t71Var.X.getRight() + rect.right, getMeasuredHeight());
        } else {
            t71Var.r.setBounds(-rect.left, 0, getMeasuredWidth() + rect.right, getMeasuredHeight());
        }
        t71Var.r.draw(canvas);
    }
}
