package zi;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final /* synthetic */ class r implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ u b;

    public /* synthetic */ r(u uVar, int i7) {
        this.a = i7;
        this.b = uVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                u uVar = this.b;
                if (uVar.W != 0) {
                    uVar.V = true;
                    break;
                }
                break;
            default:
                this.b.c();
                break;
        }
    }
}
