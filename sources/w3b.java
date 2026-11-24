// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class w3b implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ z3b b;

    public /* synthetic */ w3b(z3b z3bVar, byte b) {
        this.a = b;
        this.b = z3bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        z3b z3bVar = this.b;
        switch (b) {
            case 0:
                nm7.f(z3bVar.c).k(nm7.B5, z3bVar);
                break;
            case 1:
                z3bVar.u = false;
                z3bVar.w = true;
                nm7.f(z3bVar.c).k(nm7.B5, z3bVar, Boolean.FALSE);
                break;
            case 2:
                z3bVar.z = false;
                break;
            default:
                z3bVar.k.clear();
                z3bVar.d(true);
                break;
        }
    }
}
