// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class pa7 implements we7 {
    public final /* synthetic */ oc7 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ TLRPC.InputPeer e;
    public final /* synthetic */ long f;

    public /* synthetic */ pa7(oc7 oc7Var, long j, int i, boolean z, TLRPC.InputPeer inputPeer, long j2) {
        this.a = oc7Var;
        this.b = j;
        this.c = i;
        this.d = z;
        this.e = inputPeer;
        this.f = j2;
    }

    @Override // we7
    public final void a(int i) {
        oc7 oc7Var = this.a;
        long e = oc7Var.getUserConfig().e();
        long j = this.b;
        if (j == e) {
            oc7Var.E1().b();
        }
        oc7Var.U(j, 2, this.c, Math.max(0, i), this.d, this.e, this.f);
        oc7Var.F(1);
    }
}
