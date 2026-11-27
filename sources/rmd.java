// default package

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class rmd {
    public static final rmd a;
    public static final /* synthetic */ rmd[] b;

    static {
        rmd rmdVar = new rmd("DEFAULT", 0);
        a = rmdVar;
        b = new rmd[]{rmdVar, new rmd("SIGNED", 1), new rmd("FIXED", 2)};
    }

    public static rmd[] values() {
        return (rmd[]) b.clone();
    }
}
