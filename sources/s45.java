// default package

import java.util.Arrays;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final /* synthetic */ class s45 implements pcc {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ s45(a55 a55Var, w45 w45Var, v35 v35Var, boolean z, c35 c35Var) {
        this.c = a55Var;
        this.d = w45Var;
        this.e = v35Var;
        this.b = z;
        this.f = c35Var;
    }

    @Override // pcc
    public final void a(Object obj) {
        byte b = this.a;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (b) {
            case 0:
                a55 a55Var = (a55) obj5;
                w45 w45Var = (w45) obj4;
                v35 v35Var = (v35) obj3;
                c35 c35Var = (c35) obj2;
                byte[] bArr = (byte[]) obj;
                if (!a55Var.i(w45Var) && a55Var.A(w45Var)) {
                    TL_wallet.tonConnectClaimRequest tonconnectclaimrequest = new TL_wallet.tonConnectClaimRequest();
                    tonconnectclaimrequest.session_id = w45Var.a.id;
                    tonconnectclaimrequest.msg_id = w45Var.b;
                    tonconnectclaimrequest.app_request_id = w45Var.d;
                    boolean z = this.b;
                    tonconnectclaimrequest.declined = z;
                    tonconnectclaimrequest.challenge_answer = bArr;
                    a55Var.f.sendRequestTyped(tonconnectclaimrequest, new ic((byte) 0), new r45(a55Var, bArr, w45Var, v35Var, z, c35Var));
                    break;
                } else {
                    if (bArr != null) {
                        Arrays.fill(bArr, (byte) 0);
                    }
                    v35Var.a("Request expired or wallet changed");
                    break;
                }
            default:
                wua wuaVar = (wua) obj5;
                l01 l01Var = (l01) obj4;
                Runnable runnable = (Runnable) obj3;
                id idVar = (id) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    l01Var.c(false);
                    idVar.dismiss();
                    runnable.run();
                    break;
                } else {
                    yac h = yac.h(wuaVar.a);
                    h.y = null;
                    h.u(false);
                    wuaVar.a2(this.b, l01Var, runnable);
                    break;
                }
        }
    }

    public /* synthetic */ s45(wua wuaVar, boolean z, l01 l01Var, Runnable runnable, id idVar) {
        this.c = wuaVar;
        this.b = z;
        this.d = l01Var;
        this.e = runnable;
        this.f = idVar;
    }
}
