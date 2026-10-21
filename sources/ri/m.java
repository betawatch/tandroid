package ri;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes4.dex */
public final class m {
    public static final m a;
    public static final m b;
    public static final m c;
    public static final m d;
    public static final m e;
    public static final m f;
    public static final m h;
    public static final m n;
    public static final m r;
    public static final m s;
    public static final /* synthetic */ m[] v;

    static {
        m mVar = new m("IDLE", 0);
        a = mVar;
        m mVar2 = new m("STARTING", 1);
        b = mVar2;
        m mVar3 = new m("RECORDING", 2);
        c = mVar3;
        m mVar4 = new m("PAUSING", 3);
        d = mVar4;
        m mVar5 = new m("PREVIEWING", 4);
        e = mVar5;
        m mVar6 = new m("RESUMING", 5);
        f = mVar6;
        m mVar7 = new m("FINISHING", 6);
        h = mVar7;
        m mVar8 = new m("COMPLETED", 7);
        n = mVar8;
        m mVar9 = new m("ERROR", 8);
        r = mVar9;
        m mVar10 = new m("RELEASED", 9);
        s = mVar10;
        v = new m[]{mVar, mVar2, mVar3, mVar4, mVar5, mVar6, mVar7, mVar8, mVar9, mVar10};
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) v.clone();
    }
}
