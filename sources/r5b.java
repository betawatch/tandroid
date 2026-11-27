// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r5b implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ u5b b;

    public /* synthetic */ r5b(u5b u5bVar, byte b) {
        this.a = b;
        this.b = u5bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        u5b u5bVar = this.b;
        switch (b) {
            case 0:
                u5bVar.u = false;
                u5bVar.w = true;
                jn7.f(u5bVar.c).k(jn7.A5, u5bVar, Boolean.FALSE);
                break;
            case 1:
                u5bVar.z = false;
                break;
            case 2:
                u5bVar.k.clear();
                u5bVar.d(true);
                break;
            default:
                jn7.f(u5bVar.c).k(jn7.A5, u5bVar);
                break;
        }
    }
}
