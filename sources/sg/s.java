package sg;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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
