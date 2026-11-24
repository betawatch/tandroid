// default package

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class yga {
    public static final yga a;
    public static final yga b;
    public static final /* synthetic */ yga[] c;

    static {
        yga ygaVar = new yga("DEFAULT", 0);
        a = ygaVar;
        yga ygaVar2 = new yga("RECORDING", 1);
        b = ygaVar2;
        c = new yga[]{ygaVar, ygaVar2};
    }

    public static yga valueOf(String str) {
        return (yga) Enum.valueOf(yga.class, str);
    }

    public static yga[] values() {
        return (yga[]) c.clone();
    }
}
