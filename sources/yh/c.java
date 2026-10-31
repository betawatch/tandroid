package yh;

import org.telegram.messenger.cs;
import org.telegram.messenger.us;
import org.telegram.messenger.vp;
import org.telegram.ui.ActionBar.x1;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements cs {
    public final /* synthetic */ int a;
    public final /* synthetic */ x1 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ us e;

    public /* synthetic */ c(us usVar, x1 x1Var, long j10, boolean z10, int i10) {
        this.a = i10;
        this.e = usVar;
        this.b = x1Var;
        this.c = j10;
        this.d = z10;
    }

    @Override // org.telegram.messenger.cs
    public final void run(long j10) {
        switch (this.a) {
            case 0:
                e eVar = (e) this.e;
                eVar.getClass();
                this.b.dismiss();
                if (j10 != 0) {
                    eVar.b = -j10;
                    eVar.c = eVar.getMessagesController().L0(Long.valueOf(j10));
                    eVar.a0(this.c, this.d);
                    break;
                }
                break;
            default:
                a0 a0Var = (a0) this.e;
                a0Var.getClass();
                this.b.dismiss();
                if (j10 != 0) {
                    a0Var.K0(vp.r1(a0Var.a).L0(Long.valueOf(j10)), this.c, this.d);
                    break;
                }
                break;
        }
    }
}
