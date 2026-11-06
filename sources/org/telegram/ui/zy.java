package org.telegram.ui;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zy implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ az b;

    public /* synthetic */ zy(az azVar, int i7) {
        this.a = i7;
        this.b = azVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.d();
                break;
            case 1:
                this.b.a();
                break;
            default:
                az azVar = this.b;
                azVar.b(azVar.D);
                break;
        }
    }
}
