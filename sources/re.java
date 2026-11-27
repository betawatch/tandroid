// default package

import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class re implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ij b;
    public final /* synthetic */ id c;
    public final /* synthetic */ e d;

    public /* synthetic */ re(ij ijVar, id idVar, e eVar, byte b) {
        this.a = b;
        this.b = ijVar;
        this.c = idVar;
        this.d = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        e eVar = this.d;
        id idVar = this.c;
        ij ijVar = this.b;
        switch (b) {
            case 0:
                hl.c3(new re(ijVar, idVar, eVar, (byte) 1));
                break;
            default:
                jj.b0(ijVar, idVar, eVar);
                break;
        }
    }
}
