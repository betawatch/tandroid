// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class r7a implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ d8a b;

    public /* synthetic */ r7a(d8a d8aVar, byte b) {
        this.a = b;
        this.b = d8aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        d8a d8aVar = this.b;
        switch (b) {
            case 0:
                d8aVar.b0();
                break;
            case 1:
                d01.t(d8aVar.getParentActivity(), k96.M0(2131752142, null));
                break;
            default:
                d8aVar.c.g3.O(true);
                break;
        }
    }
}
