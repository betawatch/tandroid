package qg;

import org.telegram.ui.cn;
import org.telegram.ui.z91;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ cn b;

    public /* synthetic */ b(cn cnVar, int i7) {
        this.a = i7;
        this.b = cnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                cn cnVar = this.b;
                if (cnVar.getParentLayout() != null) {
                    z91.M0(cnVar);
                    break;
                }
                break;
            default:
                this.b.Ec();
                break;
        }
    }
}
