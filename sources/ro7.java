// default package

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class ro7 implements OnBackAnimationCallback {
    public final /* synthetic */ qp4 a;
    public final /* synthetic */ qp4 b;
    public final /* synthetic */ op4 c;
    public final /* synthetic */ op4 d;

    public ro7(qp4 qp4Var, qp4 qp4Var2, op4 op4Var, op4 op4Var2) {
        this.a = qp4Var;
        this.b = qp4Var2;
        this.c = op4Var;
        this.d = op4Var2;
    }

    public final void onBackCancelled() {
        this.d.invoke();
    }

    public final void onBackInvoked() {
        this.c.invoke();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        backEvent.getClass();
        this.b.invoke(new fd0(backEvent));
    }

    public final void onBackStarted(BackEvent backEvent) {
        backEvent.getClass();
        this.a.invoke(new fd0(backEvent));
    }
}
