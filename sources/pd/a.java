package pd;

import java.util.concurrent.CancellationException;
import la.t;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
