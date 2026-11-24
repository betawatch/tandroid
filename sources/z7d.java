// default package

import org.json.JSONException;
import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class z7d extends pfd {
    public final /* synthetic */ byte r;
    public final /* synthetic */ k89 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z7d(k89 k89Var) {
        super(k89Var, true);
        this.r = (byte) 4;
        this.s = k89Var;
    }

    @Override // pfd
    public final void n() {
        byte b = this.r;
        k89 k89Var = this.s;
        switch (b) {
            case 0:
                abd abdVar = k89Var.c;
                hbd o = o();
                abdVar.getClass();
                JSONObject jSONObject = new JSONObject();
                long l = abdVar.l();
                try {
                    jSONObject.put("requestId", l);
                    jSONObject.put(TeXSymbolParser.TYPE_ATTR, "GET_STATUS");
                    f07 f07Var = abdVar.f;
                    if (f07Var != null) {
                        jSONObject.put("mediaSessionId", f07Var.b);
                    }
                } catch (JSONException unused) {
                }
                abdVar.n(l, jSONObject.toString());
                abdVar.p.a(l, o);
                break;
            case 1:
                k89Var.c.a(o(), -1, null);
                break;
            case 2:
                k89Var.c.a(o(), 1, null);
                break;
            case 3:
                k89Var.c.a(o(), 0, 2);
                break;
            case 4:
                abd abdVar2 = k89Var.c;
                hbd o2 = o();
                abdVar2.getClass();
                JSONObject jSONObject2 = new JSONObject();
                long l2 = abdVar2.l();
                try {
                    jSONObject2.put("requestId", l2);
                    jSONObject2.put(TeXSymbolParser.TYPE_ATTR, "QUEUE_GET_ITEM_IDS");
                    jSONObject2.put("mediaSessionId", abdVar2.p());
                } catch (JSONException unused2) {
                }
                abdVar2.n(l2, jSONObject2.toString());
                abdVar2.r.a(l2, o2);
                break;
            case 5:
                abd abdVar3 = k89Var.c;
                hbd o3 = o();
                abdVar3.getClass();
                JSONObject jSONObject3 = new JSONObject();
                long l3 = abdVar3.l();
                try {
                    jSONObject3.put("requestId", l3);
                    jSONObject3.put(TeXSymbolParser.TYPE_ATTR, "PAUSE");
                    jSONObject3.put("mediaSessionId", abdVar3.p());
                } catch (JSONException unused3) {
                }
                abdVar3.n(l3, jSONObject3.toString());
                abdVar3.k.a(l3, o3);
                break;
            default:
                abd abdVar4 = k89Var.c;
                hbd o4 = o();
                abdVar4.getClass();
                JSONObject jSONObject4 = new JSONObject();
                long l4 = abdVar4.l();
                try {
                    jSONObject4.put("requestId", l4);
                    jSONObject4.put(TeXSymbolParser.TYPE_ATTR, "PLAY");
                    jSONObject4.put("mediaSessionId", abdVar4.p());
                } catch (JSONException unused4) {
                }
                abdVar4.n(l4, jSONObject4.toString());
                abdVar4.l.a(l4, o4);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z7d(k89 k89Var, byte b) {
        super(k89Var, false);
        this.r = b;
        this.s = k89Var;
    }
}
