// default package

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class pz8 extends be0 {
    public final /* synthetic */ boolean H;
    public final /* synthetic */ qz8 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public pz8(qz8 qz8Var, Context context, int i) {
        super(context);
        this.I = qz8Var;
        this.H = i;
    }

    @Override // be0, android.view.View
    public final void onDraw(Canvas canvas) {
        qz8 qz8Var = this.I;
        j72 j72Var = qz8Var.F;
        p37 p37Var = qz8.I;
        if (!this.H) {
            super.onDraw(canvas);
        } else {
            j72Var.F.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            x2b.h(qz8Var.E, canvas, getImageReceiver(), j72Var);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.I.F.a(this, motionEvent);
    }
}
