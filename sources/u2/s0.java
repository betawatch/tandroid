package u2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes.dex */
public final class s0 {
    public static final s0 a;
    public static final s0 b;
    public static final s0 c;
    public static final /* synthetic */ s0[] d;

    static {
        s0 s0Var = new s0("PASS_THROUGH", 0);
        a = s0Var;
        s0 s0Var2 = new s0("DISCARD_AFTER_NEXT_SAMPLE_METADATA", 1);
        b = s0Var2;
        s0 s0Var3 = new s0("DISCARDING", 2);
        c = s0Var3;
        d = new s0[]{s0Var, s0Var2, s0Var3};
    }

    public static s0 valueOf(String str) {
        return (s0) Enum.valueOf(s0.class, str);
    }

    public static s0[] values() {
        return (s0[]) d.clone();
    }
}
