package qg;

import org.telegram.ui.an;
import org.telegram.ui.w91;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ an b;

    public /* synthetic */ b(an anVar, int i7) {
        this.a = i7;
        this.b = anVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                an anVar = this.b;
                if (anVar.getParentLayout() != null) {
                    w91.M0(anVar);
                    break;
                }
                break;
            default:
                this.b.Bc();
                break;
        }
    }
}
