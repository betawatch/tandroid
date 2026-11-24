// default package

import android.net.Uri;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class yk implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ al b;

    public /* synthetic */ yk(al alVar, byte b) {
        this.a = b;
        this.b = alVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        al alVar = this.b;
        switch (b) {
            case 0:
                alVar.a.unregisterReceiver(alVar.d);
                break;
            case 1:
                alVar.a();
                break;
            default:
                Uri uri = al.g;
                alVar.b();
                break;
        }
    }
}
