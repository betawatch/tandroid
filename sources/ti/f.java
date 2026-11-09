package ti;

import org.telegram.messenger.g0;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes4.dex */
public final class f implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i b;

    public /* synthetic */ f(i iVar, int i7) {
        this.a = i7;
        this.b = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                i iVar = this.b;
                iVar.q();
                if (iVar.b.h()) {
                    g0.i3(this, 500L);
                    break;
                }
                break;
            default:
                i iVar2 = this.b;
                if (!iVar2.b.u()) {
                    iVar2.u = false;
                    iVar2.o(false);
                    iVar2.w = false;
                    break;
                } else {
                    g0.i3(this, 1500L);
                    break;
                }
        }
    }
}
