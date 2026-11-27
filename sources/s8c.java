// default package

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final /* synthetic */ class s8c implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ t8c b;
    public final /* synthetic */ TLObject c;
    public final /* synthetic */ i61 d;
    public final /* synthetic */ TLRPC.TL_error e;

    public /* synthetic */ s8c(t8c t8cVar, TLObject tLObject, i61 i61Var, TLRPC.TL_error tL_error) {
        this.a = (byte) 1;
        this.b = t8cVar;
        this.c = tLObject;
        this.d = i61Var;
        this.e = tL_error;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        TLRPC.TL_error tL_error = this.e;
        TLObject tLObject = this.c;
        i61 i61Var = this.d;
        t8c t8cVar = this.b;
        switch (b) {
            case 0:
                u8c u8cVar = t8cVar.i;
                if (!(tLObject instanceof TLRPC.TL_boolTrue) || tL_error != null) {
                    u8cVar.getClass();
                    r1 = false;
                }
                i61Var.a(Boolean.valueOf(r1));
                u8cVar.getClass();
                break;
            case 1:
                u8c u8cVar2 = t8cVar.i;
                boolean z = tLObject instanceof TLRPC.Updates;
                if (z) {
                    uc7.s1(u8cVar2.a).Y3((TLRPC.Updates) tLObject, false);
                }
                y31.a(u8cVar2.a).b();
                i61Var.a(Boolean.valueOf(z && tL_error == null));
                break;
            default:
                u8c u8cVar3 = t8cVar.i;
                if (!(tLObject instanceof TLRPC.TL_boolTrue) || tL_error != null) {
                    u8cVar3.getClass();
                    r1 = false;
                }
                i61Var.a(Boolean.valueOf(r1));
                u8cVar3.getClass();
                break;
        }
    }

    public /* synthetic */ s8c(t8c t8cVar, i61 i61Var, TLObject tLObject, TLRPC.TL_error tL_error, byte b) {
        this.a = b;
        this.b = t8cVar;
        this.d = i61Var;
        this.c = tLObject;
        this.e = tL_error;
    }
}
