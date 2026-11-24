// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class q79 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ p8c c;

    public /* synthetic */ q79(gta gtaVar, boolean[] zArr, p8c p8cVar) {
        this.a = (byte) 2;
        this.b = zArr;
        this.c = p8cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        p8c p8cVar = this.c;
        boolean[] zArr = this.b;
        switch (b) {
            case 0:
                if (!zArr[0] && p8cVar != null) {
                    zArr[0] = true;
                    p8cVar.a(Boolean.TRUE);
                }
                gl.e3(new am6((byte) 16), 220L);
                break;
            case 1:
                if (!zArr[0] && p8cVar != null) {
                    zArr[0] = true;
                    p8cVar.a(Boolean.FALSE);
                    break;
                }
                break;
            default:
                if (!zArr[0] && p8cVar != null) {
                    p8cVar.a("cancelled");
                    zArr[0] = true;
                    break;
                }
                break;
        }
    }

    public /* synthetic */ q79(byte b, p8c p8cVar, boolean[] zArr) {
        this.a = b;
        this.b = zArr;
        this.c = p8cVar;
    }
}
