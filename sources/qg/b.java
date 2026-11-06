package qg;

import org.telegram.ui.an;
import org.telegram.ui.v91;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
                    v91.M0(anVar);
                    break;
                }
                break;
            default:
                this.b.Bc();
                break;
        }
    }
}
