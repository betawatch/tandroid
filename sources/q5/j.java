package q5;

import android.util.Log;
import com.google.android.gms.cast.MediaInfo;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class j extends n {
    public final /* synthetic */ int r;
    public final /* synthetic */ h s;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(h hVar, Object obj, int i10) {
        super(hVar, false);
        this.r = i10;
        this.s = hVar;
        this.t = obj;
    }

    @Override // q5.n
    public final void n() {
        int i10 = this.r;
        Object obj = this.t;
        h hVar = this.s;
        int i11 = 0;
        switch (i10) {
            case 0:
                s5.n nVar = hVar.c;
                s5.o o10 = o();
                int[] iArr = (int[]) obj;
                nVar.getClass();
                JSONObject jSONObject = new JSONObject();
                long b10 = nVar.b();
                try {
                    jSONObject.put("requestId", b10);
                    jSONObject.put(TeXSymbolParser.TYPE_ATTR, "QUEUE_GET_ITEMS");
                    jSONObject.put("mediaSessionId", nVar.p());
                    JSONArray jSONArray = new JSONArray();
                    int length = iArr.length;
                    while (i11 < length) {
                        jSONArray.put(iArr[i11]);
                        i11++;
                    }
                    jSONObject.put("itemIds", jSONArray);
                } catch (JSONException unused) {
                }
                nVar.c(b10, jSONObject.toString());
                nVar.s.a(b10, o10);
                return;
            case 1:
                s5.n nVar2 = hVar.c;
                s5.o o11 = o();
                o5.k kVar = (o5.k) obj;
                nVar2.getClass();
                MediaInfo mediaInfo = kVar.a;
                o5.n nVar3 = kVar.b;
                if (mediaInfo == null && nVar3 == null) {
                    throw new IllegalArgumentException("MediaInfo and MediaQueueData should not be both null");
                }
                long[] jArr = kVar.f;
                JSONObject jSONObject2 = new JSONObject();
                try {
                    MediaInfo mediaInfo2 = kVar.a;
                    if (mediaInfo2 != null) {
                        jSONObject2.put("media", mediaInfo2.b());
                    }
                    if (nVar3 != null) {
                        jSONObject2.put("queueData", nVar3.b());
                    }
                    jSONObject2.putOpt("autoplay", kVar.c);
                    long j10 = kVar.d;
                    if (j10 != -1) {
                        Pattern pattern = s5.a.a;
                        jSONObject2.put("currentTime", j10 / 1000.0d);
                    }
                    jSONObject2.put("playbackRate", kVar.e);
                    jSONObject2.putOpt("credentials", kVar.r);
                    jSONObject2.putOpt("credentialsType", kVar.s);
                    jSONObject2.putOpt("atvCredentials", kVar.v);
                    jSONObject2.putOpt("atvCredentialsType", kVar.w);
                    if (jArr != null) {
                        JSONArray jSONArray2 = new JSONArray();
                        for (int i12 = 0; i12 < jArr.length; i12++) {
                            jSONArray2.put(i12, jArr[i12]);
                        }
                        jSONObject2.put("activeTrackIds", jSONArray2);
                    }
                    jSONObject2.putOpt("customData", kVar.n);
                    jSONObject2.put("requestId", kVar.x);
                } catch (JSONException e10) {
                    s5.b bVar = o5.k.y;
                    Log.e(bVar.a, bVar.d("Error transforming MediaLoadRequestData into JSONObject", e10));
                    jSONObject2 = new JSONObject();
                }
                long b11 = nVar2.b();
                try {
                    jSONObject2.put("requestId", b11);
                    jSONObject2.put(TeXSymbolParser.TYPE_ATTR, "LOAD");
                } catch (JSONException unused2) {
                }
                nVar2.c(b11, jSONObject2.toString());
                nVar2.j.a(b11, o11);
                return;
            default:
                s5.n nVar4 = hVar.c;
                s5.o o12 = o();
                nVar4.getClass();
                JSONObject jSONObject3 = new JSONObject();
                long b12 = nVar4.b();
                long j11 = ((o5.p) obj).a;
                try {
                    jSONObject3.put("requestId", b12);
                    jSONObject3.put(TeXSymbolParser.TYPE_ATTR, "SEEK");
                    jSONObject3.put("mediaSessionId", nVar4.p());
                    Pattern pattern2 = s5.a.a;
                    jSONObject3.put("currentTime", j11 / 1000.0d);
                } catch (JSONException unused3) {
                }
                nVar4.c(b12, jSONObject3.toString());
                nVar4.g = Long.valueOf(j11);
                nVar4.m.a(b12, new s5.k(nVar4, o12, i11));
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(h hVar, int[] iArr) {
        super(hVar, true);
        this.r = 0;
        this.s = hVar;
        this.t = iArr;
    }
}
