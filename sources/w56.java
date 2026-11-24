// default package

import android.os.Looper;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class w56 {
    public final mc5 a;
    public volatile u56 b;

    public w56(Looper looper, Object obj, String str) {
        this.a = new mc5(looper);
        fre.i(obj, "Listener must not be null");
        fre.f(str);
        this.b = new u56(obj, str);
    }

    public final void a(v56 v56Var) {
        this.a.execute(new tq4((Object) this, (Object) v56Var, (byte) 15));
    }
}
