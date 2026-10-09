package w3;

import org.telegram.ui.Components.br0;
import org.telegram.ui.Components.tc;
import yh.s3;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class d implements br0 {
    public final Object a;

    public /* synthetic */ d(Object obj) {
        this.a = obj;
    }

    public StringBuilder a() {
        ef.a aVar = (ef.a) this.a;
        if (!(aVar instanceof ze.m)) {
            return null;
        }
        StringBuilder sb2 = ((ze.m) aVar).b.b;
        if (sb2.length() == 0) {
            return null;
        }
        return sb2;
    }

    @Override // org.telegram.ui.Components.br0
    public void q0() {
        tc k10 = ((s3) this.a).getBulletinFactory().k(false);
        k10.t = true;
        k10.j();
    }

    @Override // org.telegram.ui.Components.br0
    public /* synthetic */ void P() {
    }
}
