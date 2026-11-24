// default package

import java.util.HashMap;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class ug implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qac b;
    public final /* synthetic */ HashMap c;

    public /* synthetic */ ug(qac qacVar, HashMap hashMap, byte b) {
        this.a = b;
        this.b = qacVar;
        this.c = hashMap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        HashMap hashMap = this.c;
        qac qacVar = this.b;
        switch (b) {
            case 0:
                qacVar.a(hashMap);
                break;
            default:
                qacVar.a(hashMap);
                break;
        }
    }
}
