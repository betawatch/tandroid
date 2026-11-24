// default package

import android.util.Log;
import com.google.android.gms.cast.MediaInfo;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class qbd extends pfd {
    public final /* synthetic */ byte r;
    public final /* synthetic */ k89 s;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qbd(k89 k89Var, int[] iArr) {
        super(k89Var, true);
        this.r = (byte) 0;
        this.s = k89Var;
        this.t = iArr;
    }

    @Override // pfd
    public final void n() {
        byte b = this.r;
        Object obj = this.t;
        k89 k89Var = this.s;
        switch (b) {
            case 0:
                abd abdVar = k89Var.c;
                hbd o = o();
                int[] iArr = (int[]) obj;
                abdVar.getClass();
                JSONObject jSONObject = new JSONObject();
                long l = abdVar.l();
                try {
                    jSONObject.put("requestId", l);
                    jSONObject.put(TeXSymbolParser.TYPE_ATTR, "QUEUE_GET_ITEMS");
                    jSONObject.put("mediaSessionId", abdVar.p());
                    JSONArray jSONArray = new JSONArray();
                    for (int i : iArr) {
                        jSONArray.put(i);
                    }
                    jSONObject.put("itemIds", jSONArray);
                } catch (JSONException unused) {
                }
                abdVar.n(l, jSONObject.toString());
                abdVar.s.a(l, o);
                break;
            case 1:
                abd abdVar2 = k89Var.c;
                hbd o2 = o();
                gt6 gt6Var = (gt6) obj;
                abdVar2.getClass();
                MediaInfo mediaInfo = gt6Var.a;
                zt6 zt6Var = gt6Var.b;
                if (mediaInfo != null || zt6Var != null) {
                    long[] jArr = gt6Var.f;
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        MediaInfo mediaInfo2 = gt6Var.a;
                        if (mediaInfo2 != null) {
                            jSONObject2.put("media", mediaInfo2.b());
                        }
                        if (zt6Var != null) {
                            jSONObject2.put("queueData", zt6Var.b());
                        }
                        jSONObject2.putOpt("autoplay", gt6Var.c);
                        long j = gt6Var.d;
                        if (j != -1) {
                            Pattern pattern = qe1.a;
                            jSONObject2.put("currentTime", j / 1000.0d);
                        }
                        jSONObject2.put("playbackRate", gt6Var.e);
                        jSONObject2.putOpt("credentials", gt6Var.r);
                        jSONObject2.putOpt("credentialsType", gt6Var.s);
                        jSONObject2.putOpt("atvCredentials", gt6Var.w);
                        jSONObject2.putOpt("atvCredentialsType", gt6Var.x);
                        if (jArr != null) {
                            JSONArray jSONArray2 = new JSONArray();
                            for (int i2 = 0; i2 < jArr.length; i2++) {
                                jSONArray2.put(i2, jArr[i2]);
                            }
                            jSONObject2.put("activeTrackIds", jSONArray2);
                        }
                        jSONObject2.putOpt("customData", gt6Var.n);
                        jSONObject2.put("requestId", gt6Var.y);
                    } catch (JSONException e) {
                        ce6 ce6Var = gt6.E;
                        Log.e(ce6Var.a, ce6Var.d("Error transforming MediaLoadRequestData into JSONObject", e));
                        jSONObject2 = new JSONObject();
                    }
                    long l2 = abdVar2.l();
                    try {
                        jSONObject2.put("requestId", l2);
                        jSONObject2.put(TeXSymbolParser.TYPE_ATTR, "LOAD");
                    } catch (JSONException unused2) {
                    }
                    abdVar2.n(l2, jSONObject2.toString());
                    abdVar2.j.a(l2, o2);
                    break;
                } else {
                    u36.j("MediaInfo and MediaQueueData should not be both null");
                    break;
                }
            default:
                abd abdVar3 = k89Var.c;
                hbd o3 = o();
                abdVar3.getClass();
                JSONObject jSONObject3 = new JSONObject();
                long l3 = abdVar3.l();
                long j2 = ((nw6) obj).a;
                try {
                    jSONObject3.put("requestId", l3);
                    jSONObject3.put(TeXSymbolParser.TYPE_ATTR, "SEEK");
                    jSONObject3.put("mediaSessionId", abdVar3.p());
                    Pattern pattern2 = qe1.a;
                    jSONObject3.put("currentTime", j2 / 1000.0d);
                } catch (JSONException unused3) {
                }
                abdVar3.n(l3, jSONObject3.toString());
                abdVar3.g = Long.valueOf(j2);
                abdVar3.m.a(l3, new rhb(abdVar3, o3, (byte) 10));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qbd(k89 k89Var, Object obj, byte b) {
        super(k89Var, false);
        this.r = b;
        this.s = k89Var;
        this.t = obj;
    }
}
