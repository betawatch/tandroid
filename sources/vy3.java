// default package

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
