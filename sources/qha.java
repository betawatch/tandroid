// default package

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class qha {
    public static final qha a;
    public static final qha b;
    public static final /* synthetic */ qha[] c;

    static {
        qha qhaVar = new qha("ICON", 0);
        a = qhaVar;
        qha qhaVar2 = new qha("TEXT", 1);
        b = qhaVar2;
        c = new qha[]{qhaVar, qhaVar2};
    }

    public static qha valueOf(String str) {
        return (qha) Enum.valueOf(qha.class, str);
    }

    public static qha[] values() {
        return (qha[]) c.clone();
    }
}
