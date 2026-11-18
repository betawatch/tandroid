package vg;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e b;
    public final /* synthetic */ int c;

    public /* synthetic */ b(e eVar, int i7, int i10) {
        this.a = i10;
        this.b = eVar;
        this.c = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                e eVar = this.b;
                eVar.postOnAnimation(new b(eVar, this.c, 1));
                break;
            default:
                e eVar2 = this.b;
                int i7 = this.c;
                if (eVar2.e && !eVar2.r && i7 == eVar2.F) {
                    eVar2.y = true;
                    eVar2.requestRender();
                    break;
                }
                break;
        }
    }
}
