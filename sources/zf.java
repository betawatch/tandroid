// default package

import java.util.HashMap;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class zf implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pcc b;
    public final /* synthetic */ HashMap c;

    public /* synthetic */ zf(pcc pccVar, HashMap hashMap, byte b) {
        this.a = b;
        this.b = pccVar;
        this.c = hashMap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        HashMap hashMap = this.c;
        pcc pccVar = this.b;
        switch (b) {
            case 0:
                pccVar.a(hashMap);
                break;
            default:
                pccVar.a(hashMap);
                break;
        }
    }
}
