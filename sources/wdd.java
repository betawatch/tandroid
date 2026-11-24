// default package

import org.json.JSONException;
import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class wdd extends pfd {
    public final /* synthetic */ byte r;
    public final /* synthetic */ double s;
    public final /* synthetic */ k89 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wdd(k89 k89Var, double d, byte b) {
        super(k89Var, false);
        this.r = b;
        this.t = k89Var;
        this.s = d;
    }

    @Override // pfd
    public final void n() {
        byte b = this.r;
        double d = this.s;
        k89 k89Var = this.t;
        switch (b) {
            case 0:
                abd abdVar = k89Var.c;
                hbd o = o();
                abdVar.getClass();
                if (Double.isInfinite(d) || Double.isNaN(d)) {
                    throw new IllegalArgumentException("Volume cannot be " + d);
                }
                JSONObject jSONObject = new JSONObject();
                long l = abdVar.l();
                try {
                    jSONObject.put("requestId", l);
                    jSONObject.put(TeXSymbolParser.TYPE_ATTR, "SET_VOLUME");
                    jSONObject.put("mediaSessionId", abdVar.p());
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("level", d);
                    jSONObject.put("volume", jSONObject2);
                } catch (JSONException unused) {
                }
                abdVar.n(l, jSONObject.toString());
                abdVar.n.a(l, o);
                return;
            default:
                abd abdVar2 = k89Var.c;
                hbd o2 = o();
                if (abdVar2.f == null) {
                    throw new oad();
                }
                JSONObject jSONObject3 = new JSONObject();
                long l2 = abdVar2.l();
                try {
                    jSONObject3.put("requestId", l2);
                    jSONObject3.put(TeXSymbolParser.TYPE_ATTR, "SET_PLAYBACK_RATE");
                    jSONObject3.put("playbackRate", d);
                    ite.i(abdVar2.f, "mediaStatus should not be null");
                    jSONObject3.put("mediaSessionId", abdVar2.f.b);
                } catch (JSONException unused2) {
                }
                abdVar2.n(l2, jSONObject3.toString());
                abdVar2.u.a(l2, o2);
                return;
        }
    }
}
