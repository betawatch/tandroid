// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class uy implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ez b;

    public /* synthetic */ uy(ez ezVar, byte b) {
        this.a = b;
        this.b = ezVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ez ezVar = this.b;
        switch (b) {
            case 0:
                ezVar.onBackPressed();
                break;
            default:
                ezVar.a1();
                break;
        }
    }
}
