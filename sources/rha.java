// default package

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
