// default package

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class qi3 extends he4 {
    public final /* synthetic */ cj3 H0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qi3(cj3 cj3Var, Context context, wjb wjbVar) {
        super(context, wjbVar);
        this.H0 = cj3Var;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        getParent().requestDisallowInterceptTouchEvent(true);
        this.H0.p3 = false;
        return super.onInterceptTouchEvent(motionEvent);
    }
}
