package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class wc1 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ Rect b;
    public final /* synthetic */ vd1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wc1(vd1 vd1Var, Context context, int i10, Rect rect) {
        super(context);
        this.c = vd1Var;
        this.a = i10;
        this.b = rect;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i10 = this.a;
        Rect rect = this.b;
        vd1 vd1Var = this.c;
        if (i10 == 0) {
            vd1Var.r.setBounds(vd1Var.V.getLeft() - rect.left, 0, vd1Var.V.getRight() + rect.right, getMeasuredHeight());
        } else {
            vd1Var.r.setBounds(-rect.left, 0, getMeasuredWidth() + rect.right, getMeasuredHeight());
        }
        vd1Var.r.draw(canvas);
    }
}
