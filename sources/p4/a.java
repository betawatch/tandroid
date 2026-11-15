package p4;

import android.net.Uri;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b b;

    public /* synthetic */ a(b bVar, int i7) {
        this.a = i7;
        this.b = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        b bVar = this.b;
        switch (i7) {
            case 0:
                bVar.a.unregisterReceiver(bVar.d);
                break;
            case 1:
                b.a(bVar);
                break;
            default:
                Uri uri = b.g;
                bVar.b();
                break;
        }
    }
}
