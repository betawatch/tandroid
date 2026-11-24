// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class zp8 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pq8 b;
    public final /* synthetic */ int c;

    public /* synthetic */ zp8(pq8 pq8Var, int i, byte b) {
        this.a = b;
        this.b = pq8Var;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        int i = this.c;
        pq8 pq8Var = this.b;
        switch (b) {
            case 0:
                pq8Var.f.scrollBy(0, i);
                break;
            default:
                va vaVar = pq8Var.f;
                if (vaVar != null) {
                    vaVar.setSpanCount(i);
                    break;
                }
                break;
        }
    }
}
