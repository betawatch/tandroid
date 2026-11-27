// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
