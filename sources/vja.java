// default package

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class vja {
    public static final vja a;
    public static final vja b;
    public static final /* synthetic */ vja[] c;

    static {
        vja vjaVar = new vja("GENERAL", 0);
        a = vjaVar;
        vja vjaVar2 = new vja("FALLBACK", 1);
        b = vjaVar2;
        c = new vja[]{vjaVar, vjaVar2};
    }

    public static vja valueOf(String str) {
        return (vja) Enum.valueOf(vja.class, str);
    }

    public static vja[] values() {
        return (vja[]) c.clone();
    }
}
