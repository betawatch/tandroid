package qi;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class l {
    public static final l a;
    public static final l b;
    public static final l c;
    public static final /* synthetic */ l[] d;

    static {
        l lVar = new l("REBUILT", 0);
        a = lVar;
        l lVar2 = new l("CANCELLED", 1);
        b = lVar2;
        l lVar3 = new l("ERROR", 2);
        c = lVar3;
        d = new l[]{lVar, lVar2, lVar3};
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) d.clone();
    }
}
