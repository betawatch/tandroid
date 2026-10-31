package rh;

import org.telegram.messenger.cd;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.ec;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class t1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.tgnet.e b;
    public final /* synthetic */ ec[] c;
    public final /* synthetic */ TL_stars.UniqueStarGiftValueInfo d;
    public final /* synthetic */ String e;

    public /* synthetic */ t1(org.telegram.tgnet.e eVar, ec[] ecVarArr, TL_stars.UniqueStarGiftValueInfo uniqueStarGiftValueInfo, String str, int i10) {
        this.a = i10;
        this.b = eVar;
        this.c = ecVarArr;
        this.d = uniqueStarGiftValueInfo;
        this.e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        String str = this.e;
        TL_stars.UniqueStarGiftValueInfo uniqueStarGiftValueInfo = this.d;
        ec[] ecVarArr = this.c;
        org.telegram.tgnet.e eVar = this.b;
        switch (i10) {
            case 0:
                eVar.a(ecVarArr[0], cd.a0(null, null, 2131749588, org.telegram.messenger.u1.i().f(uniqueStarGiftValueInfo.floor_price, uniqueStarGiftValueInfo.currency), str));
                break;
            default:
                eVar.a(ecVarArr[0], cd.a0(null, null, 2131749596, org.telegram.messenger.u1.i().f(uniqueStarGiftValueInfo.average_price, uniqueStarGiftValueInfo.currency), str));
                break;
        }
    }
}
