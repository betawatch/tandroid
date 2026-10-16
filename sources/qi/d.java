package qi;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
