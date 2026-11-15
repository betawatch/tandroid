package x2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class q0 {
    public static final q0 a;
    public static final q0 b;
    public static final q0 c;
    public static final /* synthetic */ q0[] d;

    static {
        q0 q0Var = new q0("PASS_THROUGH", 0);
        a = q0Var;
        q0 q0Var2 = new q0("DISCARD_AFTER_NEXT_SAMPLE_METADATA", 1);
        b = q0Var2;
        q0 q0Var3 = new q0("DISCARDING", 2);
        c = q0Var3;
        d = new q0[]{q0Var, q0Var2, q0Var3};
    }

    public static q0 valueOf(String str) {
        return (q0) Enum.valueOf(q0.class, str);
    }

    public static q0[] values() {
        return (q0[]) d.clone();
    }
}
