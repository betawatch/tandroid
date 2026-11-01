package yh;

import org.telegram.messenger.ds;
import org.telegram.messenger.vs;
import org.telegram.messenger.wp;
import org.telegram.ui.ActionBar.x1;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements ds {
    public final /* synthetic */ int a;
    public final /* synthetic */ x1 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ vs e;

    public /* synthetic */ c(vs vsVar, x1 x1Var, long j10, boolean z10, int i10) {
        this.a = i10;
        this.e = vsVar;
        this.b = x1Var;
        this.c = j10;
        this.d = z10;
    }

    @Override // org.telegram.messenger.ds
    public final void run(long j10) {
        switch (this.a) {
            case 0:
                e eVar = (e) this.e;
                eVar.getClass();
                this.b.dismiss();
                if (j10 != 0) {
                    eVar.b = -j10;
                    eVar.c = eVar.getMessagesController().L0(Long.valueOf(j10));
                    eVar.b0(this.c, this.d);
                    break;
                }
                break;
            default:
                z zVar = (z) this.e;
                zVar.getClass();
                this.b.dismiss();
                if (j10 != 0) {
                    zVar.K0(wp.r1(zVar.a).L0(Long.valueOf(j10)), this.c, this.d);
                    break;
                }
                break;
        }
    }
}
