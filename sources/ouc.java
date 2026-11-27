// default package

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
