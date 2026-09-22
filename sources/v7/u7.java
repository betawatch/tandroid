package v7;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public abstract class u7 {
    public static final gd.e a(Throwable exception) {
        kotlin.jvm.internal.i.e(exception, "exception");
        return new gd.e(exception);
    }

    public static final void b(Object obj) {
        if (obj instanceof gd.e) {
            throw ((gd.e) obj).a;
        }
    }
}
