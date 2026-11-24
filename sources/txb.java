// default package

import java.util.Iterator;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class txb implements ee {
    public final /* synthetic */ wxb a;

    public /* synthetic */ txb(wxb wxbVar) {
        this.a = wxbVar;
    }

    @Override // ee
    public final void r(he heVar, int i) {
        zxb zxbVar = this.a.a;
        Iterator it = zxbVar.e.iterator();
        while (it.hasNext()) {
            zxbVar.Z(((Integer) it.next()).intValue());
        }
        zxbVar.e.clear();
        zxbVar.a0();
    }
}
