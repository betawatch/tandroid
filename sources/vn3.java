// default package

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class vn3 implements Executor {
    public static final vn3 a;
    public static final /* synthetic */ vn3[] b;

    static {
        vn3 vn3Var = new vn3("INSTANCE", 0);
        a = vn3Var;
        b = new vn3[]{vn3Var};
    }

    public static vn3 valueOf(String str) {
        return (vn3) Enum.valueOf(vn3.class, str);
    }

    public static vn3[] values() {
        return (vn3[]) b.clone();
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
