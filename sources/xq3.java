// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
