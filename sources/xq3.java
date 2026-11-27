// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class xq3 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pcc b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ xq3(pcc pccVar, ArrayList arrayList, byte b) {
        this.a = b;
        this.b = pccVar;
        this.c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ArrayList arrayList = this.c;
        pcc pccVar = this.b;
        switch (b) {
            case 0:
                pccVar.a(arrayList);
                break;
            default:
                if (pccVar != null) {
                    pccVar.a(arrayList);
                    break;
                }
                break;
        }
    }
}
