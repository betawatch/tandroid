package pd;

import java.util.concurrent.CancellationException;
import la.t;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
