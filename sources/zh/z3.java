package zh;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class z3 extends FrameLayout {
    public final /* synthetic */ float a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3(Context context, float f10) {
        super(context);
        this.a = f10;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipRect(0.0f, 0.0f, getWidth() * this.a, getHeight());
        super.dispatchDraw(canvas);
        canvas.restore();
    }
}
