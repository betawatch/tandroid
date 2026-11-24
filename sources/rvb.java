// default package

import java.util.Iterator;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
