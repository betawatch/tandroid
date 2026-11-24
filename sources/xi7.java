// default package

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class xi7 {
    public static final SparseArray a;
    public static final /* synthetic */ xi7[] b;

    /* JADX INFO: Fake field, exist only in values array */
    xi7 EF0;

    static {
        xi7 xi7Var = new xi7("MOBILE", 0);
        xi7 xi7Var2 = new xi7("WIFI", 1);
        xi7 xi7Var3 = new xi7("MOBILE_MMS", 2);
        xi7 xi7Var4 = new xi7("MOBILE_SUPL", 3);
        xi7 xi7Var5 = new xi7("MOBILE_DUN", 4);
        xi7 xi7Var6 = new xi7("MOBILE_HIPRI", 5);
        xi7 xi7Var7 = new xi7("WIMAX", 6);
        xi7 xi7Var8 = new xi7("BLUETOOTH", 7);
        xi7 xi7Var9 = new xi7("DUMMY", 8);
        xi7 xi7Var10 = new xi7("ETHERNET", 9);
        xi7 xi7Var11 = new xi7("MOBILE_FOTA", 10);
        xi7 xi7Var12 = new xi7("MOBILE_IMS", 11);
        xi7 xi7Var13 = new xi7("MOBILE_CBS", 12);
        xi7 xi7Var14 = new xi7("WIFI_P2P", 13);
        xi7 xi7Var15 = new xi7("MOBILE_IA", 14);
        xi7 xi7Var16 = new xi7("MOBILE_EMERGENCY", 15);
        xi7 xi7Var17 = new xi7("PROXY", 16);
        xi7 xi7Var18 = new xi7("VPN", 17);
        xi7 xi7Var19 = new xi7("NONE", 18);
        b = new xi7[]{xi7Var, xi7Var2, xi7Var3, xi7Var4, xi7Var5, xi7Var6, xi7Var7, xi7Var8, xi7Var9, xi7Var10, xi7Var11, xi7Var12, xi7Var13, xi7Var14, xi7Var15, xi7Var16, xi7Var17, xi7Var18, xi7Var19};
        SparseArray sparseArray = new SparseArray();
        a = sparseArray;
        sparseArray.put(0, xi7Var);
        sparseArray.put(1, xi7Var2);
        sparseArray.put(2, xi7Var3);
        sparseArray.put(3, xi7Var4);
        sparseArray.put(4, xi7Var5);
        sparseArray.put(5, xi7Var6);
        sparseArray.put(6, xi7Var7);
        sparseArray.put(7, xi7Var8);
        sparseArray.put(8, xi7Var9);
        sparseArray.put(9, xi7Var10);
        sparseArray.put(10, xi7Var11);
        sparseArray.put(11, xi7Var12);
        sparseArray.put(12, xi7Var13);
        sparseArray.put(13, xi7Var14);
        sparseArray.put(14, xi7Var15);
        sparseArray.put(15, xi7Var16);
        sparseArray.put(16, xi7Var17);
        sparseArray.put(17, xi7Var18);
        sparseArray.put(-1, xi7Var19);
    }

    public static xi7 valueOf(String str) {
        return (xi7) Enum.valueOf(xi7.class, str);
    }

    public static xi7[] values() {
        return (xi7[]) b.clone();
    }
}
