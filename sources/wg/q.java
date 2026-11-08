package wg;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v b;

    public /* synthetic */ q(v vVar, int i7) {
        this.a = i7;
        this.b = vVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.h3(new q(this.b, 1));
                break;
            default:
                this.b.a(null);
                break;
        }
    }
}
