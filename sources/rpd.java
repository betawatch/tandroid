// default package

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
