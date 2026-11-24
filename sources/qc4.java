// default package

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class qc4 implements e39, ed {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pd4 b;

    public /* synthetic */ qc4(pd4 pd4Var, byte b) {
        this.a = b;
        this.b = pd4Var;
    }

    @Override // e39
    public final boolean d(int i, View view) {
        pd4 pd4Var = this.b;
        gd4 gd4Var = (gd4) pd4Var.Q.get(i);
        if (gd4Var == null || !(view instanceof v6c)) {
            return false;
        }
        v6c v6cVar = (v6c) view;
        pd4Var.A0(gd4Var, v6cVar.getName(), v6cVar.getCurrentObject(), gd4Var.g);
        return true;
    }

    @Override // ed
    public final void u(hd hdVar, int i) {
        byte b = this.a;
        pd4 pd4Var = this.b;
        switch (b) {
            case 1:
                hd hdVar2 = null;
                if (pd4Var.getParentActivity() != null) {
                    hd hdVar3 = new hd(3, null, pd4Var.getParentActivity());
                    hdVar3.j0 = false;
                    hdVar3.show();
                    hdVar2 = hdVar3;
                }
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter.id = pd4Var.r.a;
                pd4Var.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, new rv3(pd4Var, hdVar2, (byte) 2));
                break;
            case 2:
                pd4Var.v0();
                break;
            case 3:
                pd4Var.v0();
                break;
            default:
                pd4Var.finishFragment();
                break;
        }
    }
}
