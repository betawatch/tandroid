// default package

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class uq7 implements OnBackAnimationCallback {
    public final /* synthetic */ rr4 a;
    public final /* synthetic */ rr4 b;
    public final /* synthetic */ pr4 c;
    public final /* synthetic */ pr4 d;

    public uq7(rr4 rr4Var, rr4 rr4Var2, pr4 pr4Var, pr4 pr4Var2) {
        this.a = rr4Var;
        this.b = rr4Var2;
        this.c = pr4Var;
        this.d = pr4Var2;
    }

    public final void onBackCancelled() {
        this.d.invoke();
    }

    public final void onBackInvoked() {
        this.c.invoke();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        backEvent.getClass();
        this.b.invoke(new fe0(backEvent));
    }

    public final void onBackStarted(BackEvent backEvent) {
        backEvent.getClass();
        this.a.invoke(new fe0(backEvent));
    }
}
