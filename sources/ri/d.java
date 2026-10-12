package ri;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q b;
    public final /* synthetic */ Throwable c;

    public /* synthetic */ d(q qVar, Throwable th2, int i10) {
        this.a = i10;
        this.b = qVar;
        this.c = th2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                q qVar = this.b;
                qVar.getClass();
                Throwable th2 = this.c;
                qVar.g(th2 instanceof Exception ? (Exception) th2 : new RuntimeException(th2));
                break;
            default:
                q qVar2 = this.b;
                qVar2.getClass();
                Throwable th3 = this.c;
                qVar2.g(th3 instanceof Exception ? (Exception) th3 : new RuntimeException(th3));
                break;
        }
    }
}
