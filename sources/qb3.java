// default package

import android.content.Context;
import android.net.Uri;
import j$.util.Objects;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class qb3 implements qx6 {
    public final gl2 a;
    public final tg2 b;
    public eef c;

    public qb3(Context context, ka3 ka3Var) {
        tg2 tg2Var = new tg2(context);
        eef eefVar = new eef((byte) 17);
        this.b = tg2Var;
        this.c = eefVar;
        gl2 gl2Var = new gl2(ka3Var, eefVar);
        this.a = gl2Var;
        if (tg2Var != ((tg2) gl2Var.e)) {
            gl2Var.e = tg2Var;
            ((HashMap) gl2Var.c).clear();
            ((HashMap) gl2Var.d).clear();
        }
    }

    public static qx6 e(Class cls, tg2 tg2Var) {
        try {
            return (qx6) cls.getConstructor(m63.class).newInstance(tg2Var);
        } catch (Exception e) {
            ho9.n(e);
            return null;
        }
    }

    @Override // qx6
    public final qx6 a() {
        gl2 gl2Var = this.a;
        synchronized (((ka3) gl2Var.b)) {
        }
        Iterator it = ((HashMap) gl2Var.d).values().iterator();
        while (it.hasNext()) {
            ((qx6) it.next()).a();
        }
        return this;
    }

    @Override // qx6
    public final qx6 b() {
        synchronized (((ka3) this.a.b)) {
        }
        return this;
    }

    @Override // qx6
    public final qx6 c(eef eefVar) {
        this.c = eefVar;
        gl2 gl2Var = this.a;
        gl2Var.f = eefVar;
        ka3 ka3Var = (ka3) gl2Var.b;
        synchronized (ka3Var) {
            ka3Var.b = eefVar;
        }
        Iterator it = ((HashMap) gl2Var.d).values().iterator();
        while (it.hasNext()) {
            ((qx6) it.next()).c(eefVar);
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qx6
    public final qg0 d(br6 br6Var) {
        Uri uri;
        boolean z;
        int i;
        long j;
        Uri uri2;
        String str;
        oq6 oq6Var;
        String str2;
        tq6 tq6Var;
        br6 br6Var2 = br6Var;
        br6Var2.b.getClass();
        String scheme = br6Var2.b.a.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            throw null;
        }
        boolean equals = Objects.equals(br6Var2.b.b, "application/x-image-uri");
        xq6 xq6Var = br6Var2.b;
        if (equals) {
            long j2 = xq6Var.h;
            String str3 = g8c.a;
            throw null;
        }
        int M = g8c.M(xq6Var.a, xq6Var.b);
        if (br6Var2.b.h != -9223372036854775807L) {
            ka3 ka3Var = (ka3) this.a.b;
            synchronized (ka3Var) {
                ka3Var.c = true;
            }
            this.a.N();
        }
        try {
            gl2 gl2Var = this.a;
            HashMap hashMap = (HashMap) gl2Var.d;
            qx6 qx6Var = (qx6) hashMap.get(Integer.valueOf(M));
            if (qx6Var == null) {
                qx6Var = (qx6) gl2Var.y(M).get();
                qx6Var.c((eef) gl2Var.f);
                qx6Var.a();
                qx6Var.b();
                hashMap.put(Integer.valueOf(M), qx6Var);
            }
            vq6 a = br6Var2.c.a();
            wq6 wq6Var = br6Var2.c;
            if (wq6Var.a == -9223372036854775807L) {
                a.a = -9223372036854775807L;
            }
            if (wq6Var.d == -3.4028235E38f) {
                a.d = -3.4028235E38f;
            }
            if (wq6Var.e == -3.4028235E38f) {
                a.e = -3.4028235E38f;
            }
            if (wq6Var.b == -9223372036854775807L) {
                a.b = -9223372036854775807L;
            }
            if (wq6Var.c == -9223372036854775807L) {
                a.c = -9223372036854775807L;
            }
            wq6 wq6Var2 = new wq6(a);
            if (wq6Var2.equals(br6Var2.c)) {
                uri = null;
                z = true;
                i = 0;
            } else {
                tq6 tq6Var2 = new tq6();
                List list = Collections.EMPTY_LIST;
                km5 km5Var = mm5.b;
                mm5 mm5Var = w59.e;
                yq6 yq6Var = yq6.d;
                qq6 a2 = br6Var2.e.a();
                String str4 = br6Var2.a;
                jr6 jr6Var = br6Var2.d;
                br6Var2.c.a();
                yq6 yq6Var2 = br6Var2.f;
                xq6 xq6Var2 = br6Var2.b;
                if (xq6Var2 != null) {
                    String str5 = xq6Var2.f;
                    String str6 = xq6Var2.b;
                    Uri uri3 = xq6Var2.a;
                    list = xq6Var2.e;
                    mm5Var = xq6Var2.g;
                    uri = null;
                    uq6 uq6Var = xq6Var2.c;
                    if (uq6Var != null) {
                        i = 0;
                        tq6 tq6Var3 = new tq6();
                        z = true;
                        tq6Var3.a = uq6Var.a;
                        tq6Var3.b = uq6Var.b;
                        tq6Var3.c = uq6Var.c;
                        tq6Var3.d = uq6Var.d;
                        tq6Var3.e = uq6Var.e;
                        tq6Var3.f = uq6Var.f;
                        tq6Var3.g = uq6Var.g;
                        tq6Var3.h = uq6Var.h;
                        tq6Var = tq6Var3;
                    } else {
                        z = true;
                        i = 0;
                        tq6Var = new tq6();
                    }
                    oq6 oq6Var2 = xq6Var2.d;
                    j = xq6Var2.h;
                    tq6Var2 = tq6Var;
                    oq6Var = oq6Var2;
                    str = str6;
                    uri2 = uri3;
                    str2 = str5;
                } else {
                    uri = null;
                    z = true;
                    i = 0;
                    j = -9223372036854775807L;
                    uri2 = null;
                    str = null;
                    oq6Var = null;
                    str2 = null;
                }
                List list2 = list;
                mm5 mm5Var2 = mm5Var;
                vq6 a3 = wq6Var2.a();
                gre.p((tq6Var2.b == null || tq6Var2.a != null) ? z : i);
                xq6 xq6Var3 = uri2 != null ? new xq6(uri2, str, tq6Var2.a != null ? new uq6(tq6Var2) : uri, oq6Var, list2, str2, mm5Var2, j) : uri;
                if (str4 == null) {
                    str4 = "";
                }
                String str7 = str4;
                sq6 sq6Var = new sq6(a2);
                wq6 wq6Var3 = new wq6(a3);
                if (jr6Var == null) {
                    jr6Var = jr6.M;
                }
                br6Var2 = new br6(str7, sq6Var, xq6Var3, wq6Var3, jr6Var, yq6Var2);
            }
            qg0 d = qx6Var.d(br6Var2);
            mm5 mm5Var3 = br6Var2.b.g;
            if (!mm5Var3.isEmpty()) {
                qg0[] qg0VarArr = new qg0[mm5Var3.size() + 1];
                qg0VarArr[i] = d;
                for (int i2 = i; i2 < mm5Var3.size(); i2++) {
                    em4 em4Var = new em4();
                    em4Var.s = ud7.n(((ar6) mm5Var3.get(i2)).b);
                    em4Var.d = ((ar6) mm5Var3.get(i2)).c;
                    em4Var.e = ((ar6) mm5Var3.get(i2)).d;
                    em4Var.f = ((ar6) mm5Var3.get(i2)).e;
                    em4Var.b = ((ar6) mm5Var3.get(i2)).f;
                    em4Var.a = ((ar6) mm5Var3.get(i2)).g;
                    fm4 fm4Var = new fm4(em4Var);
                    v82 v82Var = new v82((Object) this, (Object) fm4Var, (byte) 18);
                    tg2 tg2Var = this.b;
                    k88 k88Var = new k88(v82Var, (byte) 14);
                    mv6 mv6Var = new mv6();
                    i2f i2fVar = new i2f((byte) 17);
                    if (this.c.h(fm4Var)) {
                        em4 a4 = fm4Var.a();
                        a4.s = ud7.n("application/x-media3-cues");
                        a4.k = fm4Var.t;
                        a4.T = this.c.y(fm4Var);
                        fm4Var = new fm4(a4);
                    }
                    fm4 fm4Var2 = fm4Var;
                    int i3 = i2 + 1;
                    String uri4 = ((ar6) mm5Var3.get(i2)).a.toString();
                    qq6 qq6Var = new qq6();
                    tq6 tq6Var4 = new tq6();
                    List list3 = Collections.EMPTY_LIST;
                    km5 km5Var2 = mm5.b;
                    w59 w59Var = w59.e;
                    vq6 vq6Var = new vq6();
                    yq6 yq6Var3 = yq6.d;
                    Uri parse = uri4 == null ? uri : Uri.parse(uri4);
                    gre.p((tq6Var4.b == null || tq6Var4.a != null) ? z : i);
                    br6 br6Var3 = new br6("", new sq6(qq6Var), parse != null ? new xq6(parse, null, tq6Var4.a != null ? new uq6(tq6Var4) : uri, null, list3, null, w59Var, -9223372036854775807L) : uri, new wq6(vq6Var), jr6.M, yq6Var3);
                    br6Var3.b.getClass();
                    qg0VarArr[i3] = new vs8(br6Var3, tg2Var, k88Var, mv6Var.F(br6Var3), i2fVar, TLObject.FLAG_20, fm4Var2);
                }
                d = new b17(qg0VarArr);
            }
            sq6 sq6Var2 = br6Var2.e;
            if (sq6Var2.b != 0 || sq6Var2.d != Long.MIN_VALUE || sq6Var2.f) {
                qx qxVar = new qx(d);
                sq6 sq6Var3 = br6Var2.e;
                gre.p(!qxVar.b);
                qxVar.d = sq6Var3.a();
                gre.p(!qxVar.b);
                qxVar.b = z;
                d = new si2(qxVar);
            }
            br6Var2.b.getClass();
            if (br6Var2.b.d == null) {
                return d;
            }
            lad.f("DMediaSourceFactory", "Playing media without ads. Configure ad support by calling setAdsLoaderProvider and setAdViewProvider.");
            return d;
        } catch (ClassNotFoundException e) {
            ho9.n(e);
            return null;
        }
    }
}
