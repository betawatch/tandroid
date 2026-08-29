package s5;

import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaInfo;
import i7.t7;
import java.util.Iterator;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class n extends q {
    public static final String v;
    public long e;
    public o5.q f;
    public Long g;
    public o4.g h;
    public int i;
    public final p j;
    public final p k;
    public final p l;
    public final p m;
    public final p n;
    public final p o;
    public final p p;
    public final p q;
    public final p r;
    public final p s;
    public final p t;
    public final p u;

    static {
        Pattern pattern = a.a;
        v = "urn:x-cast:com.google.cast.media";
    }

    public n() {
        super(v);
        this.i = -1;
        p pVar = new p(86400000L, "load");
        this.j = pVar;
        p pVar2 = new p(86400000L, "pause");
        this.k = pVar2;
        p pVar3 = new p(86400000L, "play");
        this.l = pVar3;
        p pVar4 = new p(86400000L, "stop");
        p pVar5 = new p(10000L, "seek");
        this.m = pVar5;
        p pVar6 = new p(86400000L, "volume");
        this.n = pVar6;
        p pVar7 = new p(86400000L, "mute");
        this.o = pVar7;
        p pVar8 = new p(86400000L, "status");
        this.p = pVar8;
        p pVar9 = new p(86400000L, "activeTracks");
        p pVar10 = new p(86400000L, "trackStyle");
        p pVar11 = new p(86400000L, "queueInsert");
        p pVar12 = new p(86400000L, "queueUpdate");
        this.q = pVar12;
        p pVar13 = new p(86400000L, "queueRemove");
        p pVar14 = new p(86400000L, "queueReorder");
        p pVar15 = new p(86400000L, "queueFetchItemIds");
        this.r = pVar15;
        p pVar16 = new p(86400000L, "queueFetchItemRange");
        this.t = pVar16;
        this.s = new p(86400000L, "queueFetchItems");
        p pVar17 = new p(86400000L, "setPlaybackRate");
        this.u = pVar17;
        p pVar18 = new p(86400000L, "skipAd");
        a(pVar);
        a(pVar2);
        a(pVar3);
        a(pVar4);
        a(pVar5);
        a(pVar6);
        a(pVar7);
        a(pVar8);
        a(pVar9);
        a(pVar10);
        a(pVar11);
        a(pVar12);
        a(pVar13);
        a(pVar14);
        a(pVar15);
        a(pVar16);
        a(pVar16);
        a(pVar17);
        a(pVar18);
        g();
    }

    public static m f(JSONObject jSONObject) {
        MediaError.b(jSONObject);
        m mVar = new m();
        Pattern pattern = a.a;
        if (jSONObject.has("customData")) {
            jSONObject.optJSONObject("customData");
        }
        return mVar;
    }

    public static int[] m(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        int[] iArr = new int[jSONArray.length()];
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            iArr[i10] = jSONArray.getInt(i10);
        }
        return iArr;
    }

    public final void d(o oVar, int i10, Integer num) {
        JSONObject jSONObject = new JSONObject();
        long b10 = b();
        try {
            jSONObject.put("requestId", b10);
            jSONObject.put(TeXSymbolParser.TYPE_ATTR, "QUEUE_UPDATE");
            jSONObject.put("mediaSessionId", p());
            if (i10 != 0) {
                jSONObject.put("jump", i10);
            }
            String b11 = t7.b(num);
            if (b11 != null) {
                jSONObject.put("repeatMode", b11);
            }
            int i11 = this.i;
            if (i11 != -1) {
                jSONObject.put("sequenceNumber", i11);
            }
        } catch (JSONException unused) {
        }
        c(b10, jSONObject.toString());
        this.q.a(b10, new k(this, oVar, 1));
    }

    public final long e(double d, long j10, long j11) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.e;
        if (elapsedRealtime < 0) {
            elapsedRealtime = 0;
        }
        if (elapsedRealtime == 0) {
            return j10;
        }
        long j12 = j10 + ((long) (elapsedRealtime * d));
        if (j11 > 0 && j12 > j11) {
            return j11;
        }
        if (j12 >= 0) {
            return j12;
        }
        return 0L;
    }

    public final void g() {
        this.e = 0L;
        this.f = null;
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((p) it.next()).f(2002);
        }
    }

    public final void h(String str, JSONObject jSONObject) {
        if (jSONObject.has("sequenceNumber")) {
            this.i = jSONObject.optInt("sequenceNumber", -1);
        } else {
            b bVar = this.a;
            Log.w(bVar.a, bVar.d(str.concat(" message is missing a sequence number."), new Object[0]));
        }
    }

    public final void i() {
        o4.g gVar = this.h;
        if (gVar != null) {
            q5.h hVar = (q5.h) gVar.b;
            Iterator it = hVar.h.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
            Iterator it2 = hVar.i.iterator();
            while (it2.hasNext()) {
                ((q5.g) it2.next()).c();
            }
        }
    }

    public final void j() {
        o4.g gVar = this.h;
        if (gVar != null) {
            q5.h hVar = (q5.h) gVar.b;
            Iterator it = hVar.h.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
            Iterator it2 = hVar.i.iterator();
            while (it2.hasNext()) {
                ((q5.g) it2.next()).d();
            }
        }
    }

    public final void k() {
        o4.g gVar = this.h;
        if (gVar != null) {
            q5.h hVar = (q5.h) gVar.b;
            Iterator it = hVar.h.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
            Iterator it2 = hVar.i.iterator();
            while (it2.hasNext()) {
                ((q5.g) it2.next()).e();
            }
        }
    }

    public final void l() {
        o4.g gVar = this.h;
        if (gVar != null) {
            q5.h hVar = (q5.h) gVar.b;
            Iterator it = hVar.j.values().iterator();
            if (it.hasNext()) {
                if (it.next() != null) {
                    throw new ClassCastException();
                }
                if (hVar.h()) {
                    throw null;
                }
                if (!hVar.h()) {
                    throw null;
                }
                throw null;
            }
            Iterator it2 = hVar.h.iterator();
            if (it2.hasNext()) {
                it2.next().getClass();
                throw new ClassCastException();
            }
            Iterator it3 = hVar.i.iterator();
            while (it3.hasNext()) {
                ((q5.g) it3.next()).g();
            }
        }
    }

    public final void n() {
        synchronized (this.d) {
            try {
                Iterator it = this.d.iterator();
                while (it.hasNext()) {
                    ((p) it.next()).f(2002);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        g();
    }

    public final long o() {
        o5.j jVar;
        o5.q qVar = this.f;
        MediaInfo mediaInfo = qVar == null ? null : qVar.a;
        if (mediaInfo != null && qVar != null) {
            Long l10 = this.g;
            if (l10 != null) {
                if (l10.equals(4294967296000L)) {
                    o5.q qVar2 = this.f;
                    if (qVar2.G != null) {
                        long longValue = l10.longValue();
                        o5.q qVar3 = this.f;
                        if (qVar3 != null && (jVar = qVar3.G) != null) {
                            long j10 = jVar.b;
                            r3 = !jVar.d ? e(1.0d, j10, -1L) : j10;
                        }
                        return Math.min(longValue, r3);
                    }
                    MediaInfo mediaInfo2 = qVar2 == null ? null : qVar2.a;
                    if ((mediaInfo2 != null ? mediaInfo2.e : 0L) >= 0) {
                        long longValue2 = l10.longValue();
                        o5.q qVar4 = this.f;
                        MediaInfo mediaInfo3 = qVar4 != null ? qVar4.a : null;
                        return Math.min(longValue2, mediaInfo3 != null ? mediaInfo3.e : 0L);
                    }
                }
                return l10.longValue();
            }
            if (this.e != 0) {
                double d = qVar.d;
                long j11 = qVar.h;
                return (d == 0.0d || qVar.e != 2) ? j11 : e(d, j11, mediaInfo.e);
            }
        }
        return 0L;
    }

    public final long p() {
        o5.q qVar = this.f;
        if (qVar != null) {
            return qVar.b;
        }
        throw new l();
    }
}
