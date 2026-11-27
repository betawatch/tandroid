// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class spa implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tpa b;
    public final /* synthetic */ int c;

    public /* synthetic */ spa(tpa tpaVar, int i, byte b) {
        this.a = b;
        this.b = tpaVar;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        byte b2 = 1;
        int i = this.c;
        tpa tpaVar = this.b;
        switch (b) {
            case 0:
                tpaVar.post(new spa(tpaVar, i, b2));
                break;
            default:
                if (i == tpaVar.h) {
                    tpaVar.f = false;
                    tpaVar.d = true;
                    tpaVar.b();
                    break;
                }
                break;
        }
    }
}
