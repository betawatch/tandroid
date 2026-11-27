// default package

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class s35 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ t35 c;

    public s35(t35 t35Var, int i, long j) {
        this.c = t35Var;
        this.a = i;
        this.b = j;
    }

    public final void a(ryc rycVar, vyc vycVar, vyc vycVar2, boolean z) {
        StringBuilder sb = new StringBuilder("websocket disconnected; closedByServer=");
        sb.append(z);
        sb.append(", serverCloseCode=");
        sb.append(vycVar == null ? "none" : Integer.valueOf(vycVar.b()));
        sb.append(", clientCloseCode=");
        sb.append(vycVar2 != null ? Integer.valueOf(vycVar2.b()) : "none");
        hl.c3(new gp6((Object) this.c, (Object) rycVar, this.a, (Object) sb.toString(), (byte) 25));
    }

    public final void b(ryc rycVar, String str) {
        StringBuilder sb = new StringBuilder("[gram-wallet-streaming] account=");
        sb.append(this.c.a);
        sb.append(" generation=");
        int i = this.a;
        sb.append(i);
        sb.append(" receive <- ");
        sb.append(str);
        cc4.b(sb.toString());
        try {
            hl.c3(new gp6((Object) this, (Object) rycVar, i, (Object) new JSONObject(str), (byte) 26));
        } catch (JSONException unused) {
            hl.c3(new ze7((Object) this, (Object) rycVar, i, (byte) 29));
        }
    }
}
