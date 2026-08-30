package pd;

import java.util.concurrent.CancellationException;
import la.t;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class a extends CancellationException {
    public final transient t a;

    public a(t tVar) {
        super("Flow was aborted, no more elements needed");
        this.a = tVar;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
