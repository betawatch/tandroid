package z7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class c {
    public static final c a;
    public static final /* synthetic */ c[] b;

    static {
        c cVar = new c("DEFAULT", 0);
        a = cVar;
        b = new c[]{cVar, new c("SIGNED", 1), new c("FIXED", 2)};
    }

    public static c[] values() {
        return (c[]) b.clone();
    }
}
