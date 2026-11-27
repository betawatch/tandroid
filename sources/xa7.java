// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class xa7 implements ef7 {
    public final /* synthetic */ uc7 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ TLRPC.InputPeer e;
    public final /* synthetic */ long f;

    public /* synthetic */ xa7(uc7 uc7Var, long j, int i, boolean z, TLRPC.InputPeer inputPeer, long j2) {
        this.a = uc7Var;
        this.b = j;
        this.c = i;
        this.d = z;
        this.e = inputPeer;
        this.f = j2;
    }

    @Override // ef7
    public final void a(int i) {
        uc7 uc7Var = this.a;
        long e = uc7Var.getUserConfig().e();
        long j = this.b;
        if (j == e) {
            uc7Var.F1().b();
        }
        uc7Var.W(j, 2, this.c, Math.max(0, i), this.d, this.e, this.f);
        uc7Var.H(1);
    }
}
