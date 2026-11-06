package zd;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class n extends v {
    public static final /* synthetic */ AtomicIntegerFieldUpdater c = AtomicIntegerFieldUpdater.newUpdater(n.class, "_resumed$volatile");
    private volatile /* synthetic */ int _resumed$volatile;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public n(m mVar, Throwable th2, boolean z9) {
        super(th2, z9);
        if (th2 == null) {
            th2 = new CancellationException("Continuation " + mVar + " was cancelled normally");
        }
        this._resumed$volatile = 0;
    }
}
