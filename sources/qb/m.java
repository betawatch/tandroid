package qb;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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
