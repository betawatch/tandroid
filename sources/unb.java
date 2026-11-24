// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class unb extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ Rect b;
    public final /* synthetic */ rob c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public unb(rob robVar, Context context, int i, Rect rect) {
        super(context);
        this.c = robVar;
        this.a = i;
        this.b = rect;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        rob robVar = this.c;
        Drawable drawable = robVar.r;
        Rect rect = this.b;
        if (this.a == 0) {
            drawable.setBounds(robVar.X.getLeft() - rect.left, 0, robVar.X.getRight() + rect.right, getMeasuredHeight());
        } else {
            drawable.setBounds(-rect.left, 0, getMeasuredWidth() + rect.right, getMeasuredHeight());
        }
        robVar.r.draw(canvas);
    }
}
