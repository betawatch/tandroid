// default package

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class sp2 implements xe7, ue7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ jm7 d;
    public final /* synthetic */ Object e;

    public /* synthetic */ sp2(he heVar, d dVar, int i, long j, boolean z) {
        this.d = heVar;
        this.e = dVar;
        this.a = i;
        this.b = j;
        this.c = z;
    }

    @Override // xe7
    public final void run(long j) {
        he heVar = (he) this.d;
        d dVar = (d) this.e;
        heVar.dismiss();
        if (j == 0) {
            return;
        }
        oc7.r1(this.a).V2(-j, this.b, false, this.c, new jz((Object) dVar, j, (byte) 1));
    }

    @Override // ue7
    public final void z(boolean z) {
        nk3 nk3Var = (nk3) this.d;
        TLRPC.Chat chat = (TLRPC.Chat) this.e;
        nk3Var.Z3(this.a, this.b, chat, this.c, z);
    }

    public /* synthetic */ sp2(nk3 nk3Var, int i, TLRPC.Chat chat, long j, boolean z) {
        this.d = nk3Var;
        this.a = i;
        this.e = chat;
        this.b = j;
        this.c = z;
    }
}
