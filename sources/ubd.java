// default package

import org.json.JSONException;
import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class ubd extends ndd {
    public final /* synthetic */ byte r;
    public final /* synthetic */ double s;
    public final /* synthetic */ i69 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ubd(i69 i69Var, double d, byte b) {
        super(i69Var, false);
        this.r = b;
        this.t = i69Var;
        this.s = d;
    }

    @Override // ndd
    public final void n() {
        byte b = this.r;
        double d = this.s;
        i69 i69Var = this.t;
        switch (b) {
            case 0:
                y8d y8dVar = i69Var.c;
                f9d o = o();
                y8dVar.getClass();
                if (Double.isInfinite(d) || Double.isNaN(d)) {
                    throw new IllegalArgumentException("Volume cannot be " + d);
                }
                JSONObject jSONObject = new JSONObject();
                long l = y8dVar.l();
                try {
                    jSONObject.put("requestId", l);
                    jSONObject.put(TeXSymbolParser.TYPE_ATTR, "SET_VOLUME");
                    jSONObject.put("mediaSessionId", y8dVar.p());
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("level", d);
                    jSONObject.put("volume", jSONObject2);
                } catch (JSONException unused) {
                }
                y8dVar.n(l, jSONObject.toString());
                y8dVar.n.a(l, o);
                return;
            default:
                y8d y8dVar2 = i69Var.c;
                f9d o2 = o();
                if (y8dVar2.f == null) {
                    throw new m8d();
                }
                JSONObject jSONObject3 = new JSONObject();
                long l2 = y8dVar2.l();
                try {
                    jSONObject3.put("requestId", l2);
                    jSONObject3.put(TeXSymbolParser.TYPE_ATTR, "SET_PLAYBACK_RATE");
                    jSONObject3.put("playbackRate", d);
                    fre.i(y8dVar2.f, "mediaStatus should not be null");
                    jSONObject3.put("mediaSessionId", y8dVar2.f.b);
                } catch (JSONException unused2) {
                }
                y8dVar2.n(l2, jSONObject3.toString());
                y8dVar2.u.a(l2, o2);
                return;
        }
    }
}
