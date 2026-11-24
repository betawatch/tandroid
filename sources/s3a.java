// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class s3a implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ a6a b;
    public final /* synthetic */ long c;
    public final /* synthetic */ ArrayList d;

    public /* synthetic */ s3a(a6a a6aVar, long j, ArrayList arrayList, byte b) {
        this.a = b;
        this.b = a6aVar;
        this.c = j;
        this.d = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ArrayList arrayList = this.d;
        long j = this.c;
        a6a a6aVar = this.b;
        switch (b) {
            case 0:
                a6aVar.getMessagesController().p3(arrayList, j);
                break;
            case 1:
                a6aVar.getMessagesController().p3(arrayList, j);
                break;
            default:
                a6aVar.getMessagesController().p3(arrayList, j);
                break;
        }
    }
}
