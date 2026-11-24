// default package

import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class pv2 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bw2 b;
    public final /* synthetic */ HashMap c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ HashMap e;

    public /* synthetic */ pv2(bw2 bw2Var, ArrayList arrayList, HashMap hashMap, HashMap hashMap2) {
        this.a = (byte) 4;
        this.b = bw2Var;
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
        bw2 bw2Var = this.b;
        switch (b) {
            case 0:
                bw2Var.E(hashMap2, arrayList, hashMap, true);
                bw2Var.N();
                bw2Var.getNotificationCenter().k(25, new Object[0]);
                bw2Var.getNotificationCenter().k(26, new Object[0]);
                break;
            case 1:
                bw2Var.E(hashMap2, arrayList, hashMap, true);
                bw2Var.N();
                bw2Var.getNotificationCenter().k(25, new Object[0]);
                bw2Var.getNotificationCenter().k(26, new Object[0]);
                break;
            case 2:
                bw2Var.E(hashMap2, arrayList, hashMap, true);
                break;
            case 3:
                bw2Var.E(hashMap2, arrayList, hashMap, true);
                bw2Var.getNotificationCenter().k(26, new Object[0]);
                break;
            default:
                bw2Var.d0 = arrayList;
                bw2Var.e0 = hashMap2;
                bw2Var.c0 = hashMap;
                break;
        }
    }

    public /* synthetic */ pv2(bw2 bw2Var, HashMap hashMap, ArrayList arrayList, HashMap hashMap2, byte b) {
        this.a = b;
        this.b = bw2Var;
        this.c = hashMap;
        this.d = arrayList;
        this.e = hashMap2;
    }
}
