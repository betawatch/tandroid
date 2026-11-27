// default package

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
