package qb;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
