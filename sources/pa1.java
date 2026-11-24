// default package

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class pa1 extends fp2 {
    public static final /* synthetic */ long c = ex.a.objectFieldOffset(pa1.class.getDeclaredField("_resumed$volatile"));
    private volatile /* synthetic */ int _resumed$volatile;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public pa1(na1 na1Var, Throwable th, boolean z) {
        super(th, z);
        if (th == null) {
            th = new CancellationException("Continuation " + na1Var + " was cancelled normally");
        }
        this._resumed$volatile = 0;
    }
}
