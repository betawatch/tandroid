package qg;

import org.telegram.ui.cn;
import org.telegram.ui.y91;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
                    y91.M0(cnVar);
                    break;
                }
                break;
            default:
                this.b.Ec();
                break;
        }
    }
}
