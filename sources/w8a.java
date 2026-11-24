// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w8a implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ x8a b;

    public /* synthetic */ w8a(x8a x8aVar, byte b) {
        this.a = b;
        this.b = x8aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        x8a x8aVar = this.b;
        switch (b) {
            case 0:
                if (x8aVar.x) {
                    x8aVar.d();
                    break;
                }
                break;
            default:
                x8aVar.invalidateSelf();
                break;
        }
    }
}
