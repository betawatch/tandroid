// default package

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class rha {
    public static final rha a;
    public static final rha b;
    public static final /* synthetic */ rha[] c;

    static {
        rha rhaVar = new rha("GLASS", 0);
        a = rhaVar;
        rha rhaVar2 = new rha("ACCENT", 1);
        b = rhaVar2;
        c = new rha[]{rhaVar, rhaVar2};
    }

    public static rha valueOf(String str) {
        return (rha) Enum.valueOf(rha.class, str);
    }

    public static rha[] values() {
        return (rha[]) c.clone();
    }
}
