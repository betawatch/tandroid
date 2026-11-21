package p4;

import android.net.Uri;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
