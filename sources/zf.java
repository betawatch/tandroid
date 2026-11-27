// default package

import java.util.HashMap;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
