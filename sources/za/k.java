package za;

import android.util.Log;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.z1;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public final /* synthetic */ class k implements i5.e, z1 {
    public final /* synthetic */ Object a;

    public /* synthetic */ k(Object obj) {
        this.a = obj;
    }

    @Override // i5.e
    public Object apply(Object obj) {
        ((w3.b) this.a).getClass();
        String J = d0.b.J((c0) obj);
        kotlin.jvm.internal.i.d(J, "SessionEvents.SESSION_EVENT_ENCODER.encode(value)");
        Log.d("EventGDTLogger", "Session Event: ".concat(J));
        byte[] bytes = J.getBytes(xd.a.a);
        kotlin.jvm.internal.i.d(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void f(a2 a2Var, int i10) {
        ei.l lVar = (ei.l) this.a;
        TL_bots.updateStarRefProgram updatestarrefprogram = new TL_bots.updateStarRefProgram();
        updatestarrefprogram.bot = lVar.getMessagesController().getInputUser(lVar.P);
        updatestarrefprogram.commission_permille = 0;
        a2 a2Var2 = new a2(lVar.getParentActivity(), 3, null);
        a2Var2.q(150L);
        lVar.getConnectionsManager().sendRequest(updatestarrefprogram, new ei.b(lVar, a2Var2, 0));
    }
}
