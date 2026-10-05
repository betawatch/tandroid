package xh;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public final class b0 extends FrameLayout {
    public final /* synthetic */ float a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(Context context, float f7) {
        super(context);
        this.a = f7;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipRect(0.0f, 0.0f, getWidth() * this.a, getHeight());
        super.dispatchDraw(canvas);
        canvas.restore();
    }
}
