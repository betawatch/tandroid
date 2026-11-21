package pb;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final class n implements Executor {
    public static final n a;
    public static final /* synthetic */ n[] b;

    static {
        n nVar = new n("INSTANCE", 0);
        a = nVar;
        b = new n[]{nVar};
    }

    public static n[] values() {
        return (n[]) b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        f.a().a.post(runnable);
    }
}
