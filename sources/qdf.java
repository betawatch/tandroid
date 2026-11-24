// default package

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class qdf {
    public static final qdf d = new qdf();
    public final Runnable a;
    public final Executor b;
    public qdf c;

    public qdf() {
        this.a = null;
        this.b = null;
    }

    public qdf(Runnable runnable, Executor executor) {
        this.a = runnable;
        this.b = executor;
    }
}
