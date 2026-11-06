package zh;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a2 b;
    public final /* synthetic */ int c;

    public /* synthetic */ l1(a2 a2Var, int i7, int i10) {
        this.a = i10;
        this.b = a2Var;
        this.c = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.f.scrollBy(0, this.c);
                break;
            default:
                fi.w3 w3Var = this.b.f;
                if (w3Var != null) {
                    w3Var.setSpanCount(this.c);
                    break;
                }
                break;
        }
    }
}
