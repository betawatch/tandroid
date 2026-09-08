package z7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
