// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s5b implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ v5b b;

    public /* synthetic */ s5b(v5b v5bVar, byte b) {
        this.a = b;
        this.b = v5bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        v5b v5bVar = this.b;
        switch (b) {
            case 0:
                v5bVar.u = false;
                v5bVar.w = true;
                jn7.f(v5bVar.c).k(jn7.A5, v5bVar, Boolean.FALSE);
                break;
            case 1:
                v5bVar.z = false;
                break;
            case 2:
                v5bVar.k.clear();
                v5bVar.d(true);
                break;
            default:
                jn7.f(v5bVar.c).k(jn7.A5, v5bVar);
                break;
        }
    }
}
