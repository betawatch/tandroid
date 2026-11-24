// default package

import android.os.Looper;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
