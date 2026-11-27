// default package

import java.io.Serializable;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ua implements fd, ncc {
    public final /* synthetic */ fb a;

    public /* synthetic */ ua(fb fbVar) {
        this.a = fbVar;
    }

    @Override // ncc
    public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        vs vsVar;
        b8c b8cVar = (b8c) obj;
        boolean H = b8cVar.H(xa.class);
        fb fbVar = this.a;
        if (H) {
            String charSequence = b8cVar.m.toString();
            gt gtVar = fbVar.M;
            if (gtVar != null) {
                gtVar.a(charSequence);
                return;
            }
            return;
        }
        if (!b8cVar.H(bb.class) || (vsVar = fbVar.O) == null) {
            return;
        }
        try {
            vsVar.a(fb.a((r47) b8cVar.I));
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override // fd
    public final void w(id idVar, int i) {
        fb fbVar = this.a;
        fbVar.getContext().getSharedPreferences("webhistory", 0).edit().remove("queries_json").apply();
        fbVar.x.g3.O(true);
    }
}
