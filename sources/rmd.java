// default package

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
