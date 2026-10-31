package rh;

import org.telegram.messenger.q20;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class h1 implements RequestDelegate {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ e4 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;
    public final /* synthetic */ Object f;

    public /* synthetic */ h1(e4 e4Var, long j10, long j11, q20 q20Var, long j12) {
        this.b = e4Var;
        this.c = j10;
        this.d = j11;
        this.f = q20Var;
        this.e = j12;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.i0.g3(new n1(this.b, (org.telegram.ui.ActionBar.x1) this.f, tLObject, this.c, this.d, this.e, tL_error));
                break;
            default:
                org.telegram.messenger.i0.g3(new n1(this.b, tLObject, this.c, this.d, (q20) this.f, tL_error, this.e));
                break;
        }
    }

    public /* synthetic */ h1(e4 e4Var, org.telegram.ui.ActionBar.x1 x1Var, long j10, long j11, long j12) {
        this.b = e4Var;
        this.f = x1Var;
        this.c = j10;
        this.d = j11;
        this.e = j12;
    }
}
