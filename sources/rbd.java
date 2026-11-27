// default package

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class rbd {
    public static final rbd a;
    public static final /* synthetic */ rbd[] b;

    static {
        rbd rbdVar = new rbd("DEFAULT", 0);
        a = rbdVar;
        b = new rbd[]{rbdVar, new rbd("SIGNED", 1), new rbd("FIXED", 2)};
    }

    public static rbd[] values() {
        return (rbd[]) b.clone();
    }
}
