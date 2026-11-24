// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v1b implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ y1b b;

    public /* synthetic */ v1b(y1b y1bVar, byte b) {
        this.a = b;
        this.b = y1bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        y1b y1bVar = this.b;
        switch (b) {
            case 0:
                kk7.f(y1bVar.c).k(kk7.z5, y1bVar);
                break;
            case 1:
                y1bVar.u = false;
                y1bVar.w = true;
                kk7.f(y1bVar.c).k(kk7.z5, y1bVar, Boolean.FALSE);
                break;
            case 2:
                y1bVar.z = false;
                break;
            default:
                y1bVar.k.clear();
                y1bVar.d(true);
                break;
        }
    }
}
