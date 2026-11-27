// default package

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
