package yh;

import java.io.Serializable;
import org.telegram.messenger.gs;
import org.telegram.messenger.p20;
import org.telegram.ui.Components.b51;
import rh.q2;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements p20, gs {
    public final /* synthetic */ e a;

    @Override // org.telegram.messenger.gs
    public void a(String str) {
        e eVar = this.a;
        eVar.getMessagesController().L0(Long.valueOf(-eVar.b));
        eVar.showDialog(new ai.a(eVar.getParentActivity(), null, eVar.b, new q2(17, eVar, str)));
    }

    @Override // org.telegram.messenger.p20
    public void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        e.Z(this.a, (b51) obj);
    }
}
