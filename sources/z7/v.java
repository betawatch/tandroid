package z7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes.dex */
public final class v {
    public static final v a;
    public static final /* synthetic */ v[] b;

    static {
        v vVar = new v("DEFAULT", 0);
        a = vVar;
        b = new v[]{vVar, new v("SIGNED", 1), new v("FIXED", 2)};
    }

    public static v[] values() {
        return (v[]) b.clone();
    }
}
