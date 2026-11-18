package sg;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class s implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v b;

    public /* synthetic */ s(v vVar, int i7) {
        this.a = i7;
        this.b = vVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                v vVar = this.b;
                h hVar = vVar.A;
                if (hVar != null) {
                    vVar.a.g(hVar);
                    vVar.A = null;
                    break;
                }
                break;
            default:
                this.b.a(null, true, null);
                break;
        }
    }
}
