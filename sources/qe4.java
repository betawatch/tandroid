// default package

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class qe4 implements h59, ee {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qf4 b;

    public /* synthetic */ qe4(qf4 qf4Var, byte b) {
        this.a = b;
        this.b = qf4Var;
    }

    @Override // h59
    public final boolean g(int i, View view) {
        qf4 qf4Var = this.b;
        gf4 gf4Var = (gf4) qf4Var.Q.get(i);
        if (gf4Var == null || !(view instanceof w8c)) {
            return false;
        }
        w8c w8cVar = (w8c) view;
        qf4Var.B0(gf4Var, w8cVar.getName(), w8cVar.getCurrentObject(), gf4Var.g);
        return true;
    }

    @Override // ee
    public final void r(he heVar, int i) {
        byte b = this.a;
        qf4 qf4Var = this.b;
        switch (b) {
            case 1:
                he heVar2 = null;
                if (qf4Var.getParentActivity() != null) {
                    he heVar3 = new he(3, null, qf4Var.getParentActivity());
                    heVar3.j0 = false;
                    heVar3.show();
                    heVar2 = heVar3;
                }
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter.id = qf4Var.r.a;
                qf4Var.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, new cx3(qf4Var, heVar2, (byte) 2));
                break;
            case 2:
                qf4Var.w0();
                break;
            case 3:
                qf4Var.w0();
                break;
            default:
                qf4Var.finishFragment();
                break;
        }
    }
}
