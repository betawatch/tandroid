package ri;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final class n {
    public static final n a;
    public static final n b;
    public static final n c;
    public static final n d;
    public static final n e;
    public static final n f;
    public static final n h;
    public static final n n;
    public static final n r;
    public static final n s;
    public static final /* synthetic */ n[] v;

    static {
        n nVar = new n("IDLE", 0);
        a = nVar;
        n nVar2 = new n("STARTING", 1);
        b = nVar2;
        n nVar3 = new n("RECORDING", 2);
        c = nVar3;
        n nVar4 = new n("PAUSING", 3);
        d = nVar4;
        n nVar5 = new n("PREVIEWING", 4);
        e = nVar5;
        n nVar6 = new n("RESUMING", 5);
        f = nVar6;
        n nVar7 = new n("FINISHING", 6);
        h = nVar7;
        n nVar8 = new n("COMPLETED", 7);
        n = nVar8;
        n nVar9 = new n("ERROR", 8);
        r = nVar9;
        n nVar10 = new n("RELEASED", 9);
        s = nVar10;
        v = new n[]{nVar, nVar2, nVar3, nVar4, nVar5, nVar6, nVar7, nVar8, nVar9, nVar10};
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) v.clone();
    }
}
