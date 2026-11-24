// default package

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class t02 extends no4 {
    public final x02 K;

    public t02(x02 x02Var, wjb wjbVar, Context context) {
        super(context, wjbVar);
        this.K = x02Var;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.K.c1(this.r, true);
        return super.onInterceptTouchEvent(motionEvent);
    }
}
