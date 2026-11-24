// default package

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
