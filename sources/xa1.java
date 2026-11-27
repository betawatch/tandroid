// default package

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class xa1 extends yp2 {
    public static final /* synthetic */ long c = fx.a.objectFieldOffset(xa1.class.getDeclaredField("_resumed$volatile"));
    private volatile /* synthetic */ int _resumed$volatile;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public xa1(va1 va1Var, Throwable th, boolean z) {
        super(th, z);
        if (th == null) {
            th = new CancellationException("Continuation " + va1Var + " was cancelled normally");
        }
        this._resumed$volatile = 0;
    }
}
