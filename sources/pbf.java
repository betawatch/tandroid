// default package

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class pbf {
    public static final pbf d = new pbf();
    public final Runnable a;
    public final Executor b;
    public pbf c;

    public pbf() {
        this.a = null;
        this.b = null;
    }

    public pbf(Runnable runnable, Executor executor) {
        this.a = runnable;
        this.b = executor;
    }
}
