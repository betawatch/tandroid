// default package

import android.os.Looper;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class w76 {
    public final ke5 a;
    public volatile u76 b;

    public w76(Looper looper, Object obj, String str) {
        this.a = new ke5(looper);
        ite.i(obj, "Listener must not be null");
        ite.f(str);
        this.b = new u76(obj, str);
    }

    public final void a(v76 v76Var) {
        this.a.execute(new us4((Object) this, (Object) v76Var, (byte) 15));
    }
}
