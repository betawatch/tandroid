// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final /* synthetic */ class p5a implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ r7a b;
    public final /* synthetic */ long c;
    public final /* synthetic */ ArrayList d;

    public /* synthetic */ p5a(r7a r7aVar, long j, ArrayList arrayList, byte b) {
        this.a = b;
        this.b = r7aVar;
        this.c = j;
        this.d = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ArrayList arrayList = this.d;
        long j = this.c;
        r7a r7aVar = this.b;
        switch (b) {
            case 0:
                r7aVar.getMessagesController().t3(arrayList, j);
                break;
            case 1:
                r7aVar.getMessagesController().t3(arrayList, j);
                break;
            default:
                r7aVar.getMessagesController().t3(arrayList, j);
                break;
        }
    }
}
