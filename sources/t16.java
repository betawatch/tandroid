// default package

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final /* synthetic */ class t16 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ u16 b;
    public final /* synthetic */ k5 c;
    public final /* synthetic */ long d;
    public final /* synthetic */ e e;

    public /* synthetic */ t16(u16 u16Var, k5 k5Var, long j, e eVar, byte b) {
        this.a = b;
        this.b = u16Var;
        this.c = k5Var;
        this.d = j;
        this.e = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                hl.c3(new t16(this.b, this.c, this.d, this.e, (byte) 1));
                break;
            default:
                k5 k5Var = this.c;
                int i = k5Var.a;
                uc7 s1 = uc7.s1(i);
                long j = this.d;
                long j2 = -j;
                vc2 g1 = s1.g1(j2, false, null);
                TLRPC.Chat M0 = uc7.s1(i).M0(Long.valueOf(j2));
                uc7.s1(i).j1(j);
                xkc.l(M0, null, false, Boolean.valueOf(g1 == null || !g1.b.rtmp_stream), this.b.h, this.e, k5Var);
                break;
        }
    }
}
