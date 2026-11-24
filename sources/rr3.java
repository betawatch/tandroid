// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class rr3 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qac b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ rr3(qac qacVar, ArrayList arrayList, byte b) {
        this.a = b;
        this.b = qacVar;
        this.c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ArrayList arrayList = this.c;
        qac qacVar = this.b;
        switch (b) {
            case 0:
                qacVar.a(arrayList);
                break;
            default:
                if (qacVar != null) {
                    qacVar.a(arrayList);
                    break;
                }
                break;
        }
    }
}
