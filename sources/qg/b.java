package qg;

import org.telegram.ui.an;
import org.telegram.ui.w91;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
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
