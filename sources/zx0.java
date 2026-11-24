// default package

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class zx0 extends vi7 {
    public final /* synthetic */ boolean s0;
    public final /* synthetic */ fy0 t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zx0(fy0 fy0Var, Context context, boolean z, boolean z2) {
        super(context);
        this.t0 = fy0Var;
        this.s0 = z;
    }

    @Override // cja, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        fy0 fy0Var = this.t0;
        fy0Var.R0(canvas, this);
        super.dispatchDraw(canvas);
        fy0Var.Q0(canvas, this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            float y = motionEvent.getY();
            fy0 fy0Var = this.t0;
            if (y < fy0Var.s0.getBounds().top) {
                fy0Var.dismiss();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    @Override // vi7, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i2);
        fy0 fy0Var = this.t0;
        fy0Var.q1 = size;
        fy0Var.N0(i, i2);
        if (this.s0) {
            i2 = View.MeasureSpec.makeMeasureSpec(fy0Var.q1, TLObject.FLAG_30);
        }
        super.onMeasure(i, i2);
    }
}
