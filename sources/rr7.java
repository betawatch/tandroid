// default package

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class rr7 implements OnBackAnimationCallback {
    public final /* synthetic */ ur4 a;
    public final /* synthetic */ ur4 b;
    public final /* synthetic */ sr4 c;
    public final /* synthetic */ sr4 d;

    public rr7(ur4 ur4Var, ur4 ur4Var2, sr4 sr4Var, sr4 sr4Var2) {
        this.a = ur4Var;
        this.b = ur4Var2;
        this.c = sr4Var;
        this.d = sr4Var2;
    }

    public final void onBackCancelled() {
        this.d.invoke();
    }

    public final void onBackInvoked() {
        this.c.invoke();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        backEvent.getClass();
        this.b.invoke(new hd0(backEvent));
    }

    public final void onBackStarted(BackEvent backEvent) {
        backEvent.getClass();
        this.a.invoke(new hd0(backEvent));
    }
}
