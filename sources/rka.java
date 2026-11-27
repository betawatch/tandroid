// default package

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class rka {
    public static final rka a;
    public static final rka b;
    public static final /* synthetic */ rka[] c;

    static {
        rka rkaVar = new rka("DEFAULT", 0);
        a = rkaVar;
        rka rkaVar2 = new rka("RECORDING", 1);
        b = rkaVar2;
        c = new rka[]{rkaVar, rkaVar2};
    }

    public static rka valueOf(String str) {
        return (rka) Enum.valueOf(rka.class, str);
    }

    public static rka[] values() {
        return (rka[]) c.clone();
    }
}
