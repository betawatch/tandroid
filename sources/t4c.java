// default package

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class t4c implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ u4c b;
    public final /* synthetic */ TLObject c;
    public final /* synthetic */ a61 d;
    public final /* synthetic */ TLRPC.TL_error e;

    public /* synthetic */ t4c(u4c u4cVar, TLObject tLObject, a61 a61Var, TLRPC.TL_error tL_error) {
        this.a = (byte) 1;
        this.b = u4cVar;
        this.c = tLObject;
        this.d = a61Var;
        this.e = tL_error;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        TLRPC.TL_error tL_error = this.e;
        TLObject tLObject = this.c;
        a61 a61Var = this.d;
        u4c u4cVar = this.b;
        switch (b) {
            case 0:
                v4c v4cVar = u4cVar.i;
                if (!(tLObject instanceof TLRPC.TL_boolTrue) || tL_error != null) {
                    v4cVar.getClass();
                    r1 = false;
                }
                a61Var.a(Boolean.valueOf(r1));
                v4cVar.getClass();
                break;
            case 1:
                v4c v4cVar2 = u4cVar.i;
                boolean z = tLObject instanceof TLRPC.Updates;
                if (z) {
                    na7.q1(v4cVar2.a).R3((TLRPC.Updates) tLObject, false);
                }
                p31.a(v4cVar2.a).b();
                a61Var.a(Boolean.valueOf(z && tL_error == null));
                break;
            default:
                v4c v4cVar3 = u4cVar.i;
                if (!(tLObject instanceof TLRPC.TL_boolTrue) || tL_error != null) {
                    v4cVar3.getClass();
                    r1 = false;
                }
                a61Var.a(Boolean.valueOf(r1));
                v4cVar3.getClass();
                break;
        }
    }

    public /* synthetic */ t4c(u4c u4cVar, a61 a61Var, TLObject tLObject, TLRPC.TL_error tL_error, byte b) {
        this.a = b;
        this.b = u4cVar;
        this.d = a61Var;
        this.c = tLObject;
        this.e = tL_error;
    }
}
