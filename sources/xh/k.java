package xh;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class k implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l b;
    public final /* synthetic */ int c;

    public /* synthetic */ k(l lVar, int i7, int i10) {
        this.a = i10;
        this.b = lVar;
        this.c = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                l lVar = this.b;
                lVar.post(new k(lVar, this.c, 1));
                break;
            default:
                int i7 = this.c;
                l lVar2 = this.b;
                if (i7 == lVar2.h) {
                    lVar2.f = false;
                    lVar2.d = true;
                    lVar2.b();
                    break;
                }
                break;
        }
    }
}
