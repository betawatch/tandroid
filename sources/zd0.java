// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zd0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lo b;
    public final /* synthetic */ Object c;

    public /* synthetic */ zd0(lo loVar, Object obj, byte b) {
        this.a = b;
        this.b = loVar;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        Object obj = this.c;
        lo loVar = this.b;
        switch (b) {
            case 0:
                if (loVar.a == 0) {
                    loVar.p(obj);
                    break;
                }
                break;
            default:
                int i = loVar.a - 1;
                loVar.a = i;
                if (i == 0) {
                    loVar.p(obj);
                    break;
                }
                break;
        }
    }
}
