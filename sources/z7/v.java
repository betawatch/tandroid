package z7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
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
