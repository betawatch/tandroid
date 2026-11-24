// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class xd0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ko b;
    public final /* synthetic */ Object c;

    public /* synthetic */ xd0(ko koVar, Object obj, byte b) {
        this.a = b;
        this.b = koVar;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        Object obj = this.c;
        ko koVar = this.b;
        switch (b) {
            case 0:
                if (koVar.a == 0) {
                    koVar.p(obj);
                    break;
                }
                break;
            default:
                int i = koVar.a - 1;
                koVar.a = i;
                if (i == 0) {
                    koVar.p(obj);
                    break;
                }
                break;
        }
    }
}
