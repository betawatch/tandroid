// default package

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class rpd implements Executor {
    public static final rpd a;
    public static final /* synthetic */ rpd[] b;

    static {
        rpd rpdVar = new rpd("INSTANCE", 0);
        a = rpdVar;
        b = new rpd[]{rpdVar};
    }

    public static rpd[] values() {
        return (rpd[]) b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
