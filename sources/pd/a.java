package pd;

import java.util.concurrent.CancellationException;
import la.t;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
