package ri;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ p b;
    public final /* synthetic */ Throwable c;

    public /* synthetic */ d(p pVar, Throwable th2, int i10) {
        this.a = i10;
        this.b = pVar;
        this.c = th2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                p pVar = this.b;
                pVar.getClass();
                Throwable th2 = this.c;
                pVar.g(th2 instanceof Exception ? (Exception) th2 : new RuntimeException(th2));
                break;
            default:
                p pVar2 = this.b;
                pVar2.getClass();
                Throwable th3 = this.c;
                pVar2.g(th3 instanceof Exception ? (Exception) th3 : new RuntimeException(th3));
                break;
        }
    }
}
