// default package

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
