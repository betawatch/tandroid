// default package

import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final /* synthetic */ class xu2 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lv2 b;
    public final /* synthetic */ HashMap c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ HashMap e;

    public /* synthetic */ xu2(lv2 lv2Var, ArrayList arrayList, HashMap hashMap, HashMap hashMap2) {
        this.a = (byte) 4;
        this.b = lv2Var;
        this.d = arrayList;
        this.c = hashMap;
        this.e = hashMap2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        HashMap hashMap = this.e;
        HashMap hashMap2 = this.c;
        ArrayList arrayList = this.d;
        lv2 lv2Var = this.b;
        switch (b) {
            case 0:
                lv2Var.E(hashMap2, arrayList, hashMap, true);
                lv2Var.N();
                lv2Var.getNotificationCenter().k(25, new Object[0]);
                lv2Var.getNotificationCenter().k(26, new Object[0]);
                break;
            case 1:
                lv2Var.E(hashMap2, arrayList, hashMap, true);
                lv2Var.N();
                lv2Var.getNotificationCenter().k(25, new Object[0]);
                lv2Var.getNotificationCenter().k(26, new Object[0]);
                break;
            case 2:
                lv2Var.E(hashMap2, arrayList, hashMap, true);
                break;
            case 3:
                lv2Var.E(hashMap2, arrayList, hashMap, true);
                lv2Var.getNotificationCenter().k(26, new Object[0]);
                break;
            default:
                lv2Var.d0 = arrayList;
                lv2Var.e0 = hashMap2;
                lv2Var.c0 = hashMap;
                break;
        }
    }

    public /* synthetic */ xu2(lv2 lv2Var, HashMap hashMap, ArrayList arrayList, HashMap hashMap2, byte b) {
        this.a = b;
        this.b = lv2Var;
        this.c = hashMap;
        this.d = arrayList;
        this.e = hashMap2;
    }
}
