// default package

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class xb1 extends qq2 {
    public static final /* synthetic */ long c = fy.a.objectFieldOffset(xb1.class.getDeclaredField("_resumed$volatile"));
    private volatile /* synthetic */ int _resumed$volatile;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public xb1(vb1 vb1Var, Throwable th, boolean z) {
        super(th, z);
        if (th == null) {
            th = new CancellationException("Continuation " + vb1Var + " was cancelled normally");
        }
        this._resumed$volatile = 0;
    }
}
