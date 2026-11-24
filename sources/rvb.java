// default package

import java.util.Iterator;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class rvb implements ed {
    public final /* synthetic */ tvb a;

    public /* synthetic */ rvb(tvb tvbVar) {
        this.a = tvbVar;
    }

    @Override // ed
    public final void u(hd hdVar, int i) {
        wvb wvbVar = this.a.a;
        Iterator it = wvbVar.e.iterator();
        while (it.hasNext()) {
            wvbVar.Y(((Integer) it.next()).intValue());
        }
        wvbVar.e.clear();
        wvbVar.Z();
    }
}
