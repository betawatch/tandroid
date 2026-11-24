// default package

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
