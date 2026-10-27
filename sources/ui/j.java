package ui;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class j {
    public static final j a;
    public static final j b;
    public static final j c;
    public static final /* synthetic */ j[] d;

    static {
        j jVar = new j("REBUILT", 0);
        a = jVar;
        j jVar2 = new j("CANCELLED", 1);
        b = jVar2;
        j jVar3 = new j("ERROR", 2);
        c = jVar3;
        d = new j[]{jVar, jVar2, jVar3};
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) d.clone();
    }
}
