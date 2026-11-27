// default package

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final class ouc extends FrameLayout {
    public final /* synthetic */ quc a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ouc(quc qucVar, Context context) {
        super(context);
        this.a = qucVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.translate(-getLeft(), -getTop());
        guc gucVar = this.a.j;
        gucVar.p(canvas);
        canvas.restore();
        super.dispatchDraw(canvas);
        if (gucVar.q()) {
            postInvalidateOnAnimation();
        }
    }
}
