package za;

import android.util.Log;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.b2;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final /* synthetic */ class k implements i5.e, a2 {
    public final /* synthetic */ Object a;

    public /* synthetic */ k(Object obj) {
        this.a = obj;
    }

    @Override // i5.e
    public Object apply(Object obj) {
        ((m2.t) this.a).getClass();
        String T = d0.b.T((c0) obj);
        kotlin.jvm.internal.i.d(T, "SessionEvents.SESSION_EVENT_ENCODER.encode(value)");
        Log.d("EventGDTLogger", "Session Event: ".concat(T));
        byte[] bytes = T.getBytes(yd.a.a);
        kotlin.jvm.internal.i.d(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(b2 b2Var, int i10) {
        ei.l lVar = (ei.l) this.a;
        TL_bots.updateStarRefProgram updatestarrefprogram = new TL_bots.updateStarRefProgram();
        updatestarrefprogram.bot = lVar.getMessagesController().getInputUser(lVar.P);
        updatestarrefprogram.commission_permille = 0;
        b2 b2Var2 = new b2(lVar.getParentActivity(), 3, null);
        b2Var2.q(150L);
        lVar.getConnectionsManager().sendRequest(updatestarrefprogram, new ei.b(lVar, b2Var2, 0));
    }
}
