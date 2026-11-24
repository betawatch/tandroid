// default package

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class t6c implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ u6c b;
    public final /* synthetic */ TLObject c;
    public final /* synthetic */ h71 d;
    public final /* synthetic */ TLRPC.TL_error e;

    public /* synthetic */ t6c(u6c u6cVar, TLObject tLObject, h71 h71Var, TLRPC.TL_error tL_error) {
        this.a = (byte) 1;
        this.b = u6cVar;
        this.c = tLObject;
        this.d = h71Var;
        this.e = tL_error;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        TLRPC.TL_error tL_error = this.e;
        TLObject tLObject = this.c;
        h71 h71Var = this.d;
        u6c u6cVar = this.b;
        switch (b) {
            case 0:
                v6c v6cVar = u6cVar.i;
                if (!(tLObject instanceof TLRPC.TL_boolTrue) || tL_error != null) {
                    v6cVar.getClass();
                    r1 = false;
                }
                h71Var.a(Boolean.valueOf(r1));
                v6cVar.getClass();
                break;
            case 1:
                v6c v6cVar2 = u6cVar.i;
                boolean z = tLObject instanceof TLRPC.Updates;
                if (z) {
                    oc7.r1(v6cVar2.a).T3((TLRPC.Updates) tLObject, false);
                }
                x41.a(v6cVar2.a).b();
                h71Var.a(Boolean.valueOf(z && tL_error == null));
                break;
            default:
                v6c v6cVar3 = u6cVar.i;
                if (!(tLObject instanceof TLRPC.TL_boolTrue) || tL_error != null) {
                    v6cVar3.getClass();
                    r1 = false;
                }
                h71Var.a(Boolean.valueOf(r1));
                v6cVar3.getClass();
                break;
        }
    }

    public /* synthetic */ t6c(u6c u6cVar, h71 h71Var, TLObject tLObject, TLRPC.TL_error tL_error, byte b) {
        this.a = b;
        this.b = u6cVar;
        this.d = h71Var;
        this.c = tLObject;
        this.e = tL_error;
    }
}
