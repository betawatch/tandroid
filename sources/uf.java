// default package

import java.util.HashMap;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class uf implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ p8c b;
    public final /* synthetic */ HashMap c;

    public /* synthetic */ uf(p8c p8cVar, HashMap hashMap, byte b) {
        this.a = b;
        this.b = p8cVar;
        this.c = hashMap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        HashMap hashMap = this.c;
        p8c p8cVar = this.b;
        switch (b) {
            case 0:
                p8cVar.a(hashMap);
                break;
            default:
                p8cVar.a(hashMap);
                break;
        }
    }
}
