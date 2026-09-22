package r5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public final class c {
    public static final c a;
    public static final c b;
    public static final c c;
    public static final /* synthetic */ c[] d;

    static {
        c cVar = new c("NETWORK_UNMETERED", 0);
        a = cVar;
        c cVar2 = new c("DEVICE_IDLE", 1);
        b = cVar2;
        c cVar3 = new c("DEVICE_CHARGING", 2);
        c = cVar3;
        d = new c[]{cVar, cVar2, cVar3};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) d.clone();
    }
}
