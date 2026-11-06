package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class w61 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ Rect b;
    public final /* synthetic */ u71 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w61(u71 u71Var, Context context, int i7, Rect rect) {
        super(context);
        this.c = u71Var;
        this.a = i7;
        this.b = rect;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i7 = this.a;
        Rect rect = this.b;
        u71 u71Var = this.c;
        if (i7 == 0) {
            u71Var.r.setBounds(u71Var.W.getLeft() - rect.left, 0, u71Var.W.getRight() + rect.right, getMeasuredHeight());
        } else {
            u71Var.r.setBounds(-rect.left, 0, getMeasuredWidth() + rect.right, getMeasuredHeight());
        }
        u71Var.r.draw(canvas);
    }
}
