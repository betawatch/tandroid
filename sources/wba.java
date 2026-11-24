// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class wba implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iea b;
    public final /* synthetic */ int c;

    public /* synthetic */ wba(iea ieaVar, int i, byte b) {
        this.a = b;
        this.b = ieaVar;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        int i = this.c;
        iea ieaVar = this.b;
        switch (b) {
            case 0:
                ieaVar.h.scrollBy(0, i);
                break;
            case 1:
                ieaVar.h.scrollBy(0, i);
                break;
            default:
                ieaVar.h.scrollBy(0, i);
                break;
        }
    }
}
