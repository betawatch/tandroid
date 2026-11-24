// default package

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
