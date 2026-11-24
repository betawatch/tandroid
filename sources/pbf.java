// default package

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
