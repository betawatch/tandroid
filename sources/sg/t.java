package sg;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class t implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v b;
    public final /* synthetic */ i0 c;

    public /* synthetic */ t(v vVar, i0 i0Var, int i7) {
        this.a = i7;
        this.b = vVar;
        this.c = i0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.g3(new t(this.b, this.c, 1));
                break;
            default:
                v vVar = this.b;
                vVar.getClass();
                vVar.i = this.c.a;
                break;
        }
    }
}
