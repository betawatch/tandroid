package pg;

import org.telegram.ui.cf1;
import org.telegram.ui.wn;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wn b;

    public /* synthetic */ b(wn wnVar, int i10) {
        this.a = i10;
        this.b = wnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                wn wnVar = this.b;
                if (wnVar.getParentLayout() != null) {
                    cf1.I0(wnVar);
                    break;
                }
                break;
            default:
                this.b.oc();
                break;
        }
    }
}
