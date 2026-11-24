// default package

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class xn3 implements Executor {
    public static final xn3 a;
    public static final /* synthetic */ xn3[] b;

    static {
        xn3 xn3Var = new xn3("INSTANCE", 0);
        a = xn3Var;
        b = new xn3[]{xn3Var};
    }

    public static xn3 valueOf(String str) {
        return (xn3) Enum.valueOf(xn3.class, str);
    }

    public static xn3[] values() {
        return (xn3[]) b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "DirectExecutor";
    }
}
