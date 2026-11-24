// default package

import org.json.JSONException;
import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class x5d extends ndd {
    public final /* synthetic */ byte r;
    public final /* synthetic */ i69 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x5d(i69 i69Var) {
        super(i69Var, true);
        this.r = (byte) 4;
        this.s = i69Var;
    }

    @Override // ndd
    public final void n() {
        byte b = this.r;
        i69 i69Var = this.s;
        switch (b) {
            case 0:
                y8d y8dVar = i69Var.c;
                f9d o = o();
                y8dVar.getClass();
                JSONObject jSONObject = new JSONObject();
                long l = y8dVar.l();
                try {
                    jSONObject.put("requestId", l);
                    jSONObject.put(TeXSymbolParser.TYPE_ATTR, "GET_STATUS");
                    fy6 fy6Var = y8dVar.f;
                    if (fy6Var != null) {
                        jSONObject.put("mediaSessionId", fy6Var.b);
                    }
                } catch (JSONException unused) {
                }
                y8dVar.n(l, jSONObject.toString());
                y8dVar.p.a(l, o);
                break;
            case 1:
                i69Var.c.a(o(), -1, null);
                break;
            case 2:
                i69Var.c.a(o(), 1, null);
                break;
            case 3:
                i69Var.c.a(o(), 0, 2);
                break;
            case 4:
                y8d y8dVar2 = i69Var.c;
                f9d o2 = o();
                y8dVar2.getClass();
                JSONObject jSONObject2 = new JSONObject();
                long l2 = y8dVar2.l();
                try {
                    jSONObject2.put("requestId", l2);
                    jSONObject2.put(TeXSymbolParser.TYPE_ATTR, "QUEUE_GET_ITEM_IDS");
                    jSONObject2.put("mediaSessionId", y8dVar2.p());
                } catch (JSONException unused2) {
                }
                y8dVar2.n(l2, jSONObject2.toString());
                y8dVar2.r.a(l2, o2);
                break;
            case 5:
                y8d y8dVar3 = i69Var.c;
                f9d o3 = o();
                y8dVar3.getClass();
                JSONObject jSONObject3 = new JSONObject();
                long l3 = y8dVar3.l();
                try {
                    jSONObject3.put("requestId", l3);
                    jSONObject3.put(TeXSymbolParser.TYPE_ATTR, "PAUSE");
                    jSONObject3.put("mediaSessionId", y8dVar3.p());
                } catch (JSONException unused3) {
                }
                y8dVar3.n(l3, jSONObject3.toString());
                y8dVar3.k.a(l3, o3);
                break;
            default:
                y8d y8dVar4 = i69Var.c;
                f9d o4 = o();
                y8dVar4.getClass();
                JSONObject jSONObject4 = new JSONObject();
                long l4 = y8dVar4.l();
                try {
                    jSONObject4.put("requestId", l4);
                    jSONObject4.put(TeXSymbolParser.TYPE_ATTR, "PLAY");
                    jSONObject4.put("mediaSessionId", y8dVar4.p());
                } catch (JSONException unused4) {
                }
                y8dVar4.n(l4, jSONObject4.toString());
                y8dVar4.l.a(l4, o4);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x5d(i69 i69Var, byte b) {
        super(i69Var, false);
        this.r = b;
        this.s = i69Var;
    }
}
