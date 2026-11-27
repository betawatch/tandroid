// default package

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
