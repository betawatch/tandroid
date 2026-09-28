package qb;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes.dex */
public final class m implements Executor {
    public static final m a;
    public static final /* synthetic */ m[] b;

    static {
        m mVar = new m("INSTANCE", 0);
        a = mVar;
        b = new m[]{mVar};
    }

    public static m[] values() {
        return (m[]) b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        f.a().a.post(runnable);
    }
}
