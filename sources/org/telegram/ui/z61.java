package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class z61 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ Rect b;
    public final /* synthetic */ x71 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z61(x71 x71Var, Context context, int i7, Rect rect) {
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
            x71Var.r.setBounds(x71Var.W.getLeft() - rect.left, 0, x71Var.W.getRight() + rect.right, getMeasuredHeight());
        } else {
            x71Var.r.setBounds(-rect.left, 0, getMeasuredWidth() + rect.right, getMeasuredHeight());
        }
        x71Var.r.draw(canvas);
    }
}
