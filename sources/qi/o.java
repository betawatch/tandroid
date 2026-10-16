package qi;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class o {
    public static final o a;
    public static final o b;
    public static final o c;
    public static final o d;
    public static final o e;
    public static final o f;
    public static final o h;
    public static final o n;
    public static final o r;
    public static final o s;
    public static final /* synthetic */ o[] v;

    static {
        o oVar = new o("IDLE", 0);
        a = oVar;
        o oVar2 = new o("STARTING", 1);
        b = oVar2;
        o oVar3 = new o("RECORDING", 2);
        c = oVar3;
        o oVar4 = new o("PAUSING", 3);
        d = oVar4;
        o oVar5 = new o("PREVIEWING", 4);
        e = oVar5;
        o oVar6 = new o("RESUMING", 5);
        f = oVar6;
        o oVar7 = new o("FINISHING", 6);
        h = oVar7;
        o oVar8 = new o("COMPLETED", 7);
        n = oVar8;
        o oVar9 = new o("ERROR", 8);
        r = oVar9;
        o oVar10 = new o("RELEASED", 9);
        s = oVar10;
        v = new o[]{oVar, oVar2, oVar3, oVar4, oVar5, oVar6, oVar7, oVar8, oVar9, oVar10};
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) v.clone();
    }
}
