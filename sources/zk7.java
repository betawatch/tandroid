// default package

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class zk7 {
    public static final SparseArray a;
    public static final /* synthetic */ zk7[] b;

    /* JADX INFO: Fake field, exist only in values array */
    zk7 EF0;

    static {
        zk7 zk7Var = new zk7("MOBILE", 0);
        zk7 zk7Var2 = new zk7("WIFI", 1);
        zk7 zk7Var3 = new zk7("MOBILE_MMS", 2);
        zk7 zk7Var4 = new zk7("MOBILE_SUPL", 3);
        zk7 zk7Var5 = new zk7("MOBILE_DUN", 4);
        zk7 zk7Var6 = new zk7("MOBILE_HIPRI", 5);
        zk7 zk7Var7 = new zk7("WIMAX", 6);
        zk7 zk7Var8 = new zk7("BLUETOOTH", 7);
        zk7 zk7Var9 = new zk7("DUMMY", 8);
        zk7 zk7Var10 = new zk7("ETHERNET", 9);
        zk7 zk7Var11 = new zk7("MOBILE_FOTA", 10);
        zk7 zk7Var12 = new zk7("MOBILE_IMS", 11);
        zk7 zk7Var13 = new zk7("MOBILE_CBS", 12);
        zk7 zk7Var14 = new zk7("WIFI_P2P", 13);
        zk7 zk7Var15 = new zk7("MOBILE_IA", 14);
        zk7 zk7Var16 = new zk7("MOBILE_EMERGENCY", 15);
        zk7 zk7Var17 = new zk7("PROXY", 16);
        zk7 zk7Var18 = new zk7("VPN", 17);
        zk7 zk7Var19 = new zk7("NONE", 18);
        b = new zk7[]{zk7Var, zk7Var2, zk7Var3, zk7Var4, zk7Var5, zk7Var6, zk7Var7, zk7Var8, zk7Var9, zk7Var10, zk7Var11, zk7Var12, zk7Var13, zk7Var14, zk7Var15, zk7Var16, zk7Var17, zk7Var18, zk7Var19};
        SparseArray sparseArray = new SparseArray();
        a = sparseArray;
        sparseArray.put(0, zk7Var);
        sparseArray.put(1, zk7Var2);
        sparseArray.put(2, zk7Var3);
        sparseArray.put(3, zk7Var4);
        sparseArray.put(4, zk7Var5);
        sparseArray.put(5, zk7Var6);
        sparseArray.put(6, zk7Var7);
        sparseArray.put(7, zk7Var8);
        sparseArray.put(8, zk7Var9);
        sparseArray.put(9, zk7Var10);
        sparseArray.put(10, zk7Var11);
        sparseArray.put(11, zk7Var12);
        sparseArray.put(12, zk7Var13);
        sparseArray.put(13, zk7Var14);
        sparseArray.put(14, zk7Var15);
        sparseArray.put(15, zk7Var16);
        sparseArray.put(16, zk7Var17);
        sparseArray.put(17, zk7Var18);
        sparseArray.put(-1, zk7Var19);
    }

    public static zk7 valueOf(String str) {
        return (zk7) Enum.valueOf(zk7.class, str);
    }

    public static zk7[] values() {
        return (zk7[]) b.clone();
    }
}
