package sd;

import k7.p8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class b {
    public static final b a;
    public static final b b;
    public static final b c;
    public static final b d;
    public static final b e;
    public static final /* synthetic */ b[] f;

    static {
        b bVar = new b("CPU_ACQUIRED", 0);
        a = bVar;
        b bVar2 = new b("BLOCKING", 1);
        b = bVar2;
        b bVar3 = new b("PARKING", 2);
        c = bVar3;
        b bVar4 = new b("DORMANT", 3);
        d = bVar4;
        b bVar5 = new b("TERMINATED", 4);
        e = bVar5;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5};
        f = bVarArr;
        p8.a(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f.clone();
    }
}
