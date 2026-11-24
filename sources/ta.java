// default package

import java.io.Serializable;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class ta implements ee, oac {
    public final /* synthetic */ eb a;

    public /* synthetic */ ta(eb ebVar) {
        this.a = ebVar;
    }

    @Override // oac
    public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        xt xtVar;
        c6c c6cVar = (c6c) obj;
        boolean H = c6cVar.H(wa.class);
        eb ebVar = this.a;
        if (H) {
            String charSequence = c6cVar.m.toString();
            iu iuVar = ebVar.M;
            if (iuVar != null) {
                iuVar.a(charSequence);
                return;
            }
            return;
        }
        if (!c6cVar.H(ab.class) || (xtVar = ebVar.O) == null) {
            return;
        }
        try {
            xtVar.a(eb.a((k47) c6cVar.I));
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override // ee
    public final void r(he heVar, int i) {
        eb ebVar = this.a;
        ebVar.getContext().getSharedPreferences("webhistory", 0).edit().remove("queries_json").apply();
        ebVar.x.g3.O(true);
    }
}
