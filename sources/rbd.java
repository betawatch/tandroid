// default package

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
