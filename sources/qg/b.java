package qg;

import org.telegram.ui.an;
import org.telegram.ui.v91;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
