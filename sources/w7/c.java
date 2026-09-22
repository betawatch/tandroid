package w7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
