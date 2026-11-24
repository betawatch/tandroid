// default package

import java.util.HashMap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class zn2 {
    public static final zn2 a;
    public static final HashMap b;
    public static final /* synthetic */ zn2[] c;

    /* JADX INFO: Fake field, exist only in values array */
    zn2 EF0;

    static {
        zn2 zn2Var = new zn2("X86_32", 0);
        zn2 zn2Var2 = new zn2("X86_64", 1);
        zn2 zn2Var3 = new zn2("ARM_UNKNOWN", 2);
        zn2 zn2Var4 = new zn2("PPC", 3);
        zn2 zn2Var5 = new zn2("PPC64", 4);
        zn2 zn2Var6 = new zn2("ARMV6", 5);
        zn2 zn2Var7 = new zn2("ARMV7", 6);
        zn2 zn2Var8 = new zn2("UNKNOWN", 7);
        a = zn2Var8;
        zn2 zn2Var9 = new zn2("ARMV7S", 8);
        zn2 zn2Var10 = new zn2("ARM64", 9);
        c = new zn2[]{zn2Var, zn2Var2, zn2Var3, zn2Var4, zn2Var5, zn2Var6, zn2Var7, zn2Var8, zn2Var9, zn2Var10};
        HashMap hashMap = new HashMap(4);
        b = hashMap;
        hashMap.put("armeabi-v7a", zn2Var7);
        hashMap.put("armeabi", zn2Var6);
        hashMap.put("arm64-v8a", zn2Var10);
        hashMap.put("x86", zn2Var);
    }

    public static zn2 valueOf(String str) {
        return (zn2) Enum.valueOf(zn2.class, str);
    }

    public static zn2[] values() {
        return (zn2[]) c.clone();
    }
}
