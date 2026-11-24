// default package

import java.io.Serializable;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class ta implements ed, n8c {
    public final /* synthetic */ eb a;

    public /* synthetic */ ta(eb ebVar) {
        this.a = ebVar;
    }

    @Override // n8c
    public final void j(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        ws wsVar;
        c4c c4cVar = (c4c) obj;
        boolean H = c4cVar.H(wa.class);
        eb ebVar = this.a;
        if (H) {
            String charSequence = c4cVar.m.toString();
            ht htVar = ebVar.M;
            if (htVar != null) {
                htVar.a(charSequence);
                return;
            }
            return;
        }
        if (!c4cVar.H(ab.class) || (wsVar = ebVar.O) == null) {
            return;
        }
        try {
            wsVar.a(eb.a((k27) c4cVar.I));
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override // ed
    public final void u(hd hdVar, int i) {
        eb ebVar = this.a;
        ebVar.getContext().getSharedPreferences("webhistory", 0).edit().remove("queries_json").apply();
        ebVar.x.g3.O(true);
    }
}
