package ri;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final class i {
    public static final i a;
    public static final i b;
    public static final /* synthetic */ i[] c;

    static {
        i iVar = new i("DISABLED", 0);
        a = iVar;
        i iVar2 = new i("RNNOISE", 1);
        b = iVar2;
        c = new i[]{iVar, iVar2};
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) c.clone();
    }
}
