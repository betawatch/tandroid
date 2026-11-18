package pb;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
