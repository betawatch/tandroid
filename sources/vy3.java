// default package

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class vy3 extends uy3 {
    public final /* synthetic */ wy3 P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vy3(wy3 wy3Var, Context context, int i) {
        super(wy3Var.s, context, i);
        this.P = wy3Var;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.P.d(motionEvent);
        return super.onTouchEvent(motionEvent);
    }
}
