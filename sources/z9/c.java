package z9;

import a6.i;
import android.util.Base64;
import android.util.JsonReader;
import bi.u6;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import ka.d;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.ui.Cells.r6;
import v7.d8;
import y9.a0;
import y9.a1;
import y9.a2;
import y9.b0;
import y9.b2;
import y9.c0;
import y9.c2;
import y9.d0;
import y9.d2;
import y9.e;
import y9.e0;
import y9.e2;
import y9.f;
import y9.f0;
import y9.f1;
import y9.g;
import y9.g0;
import y9.g1;
import y9.h;
import y9.h0;
import y9.h1;
import y9.i0;
import y9.i1;
import y9.j;
import y9.j0;
import y9.j1;
import y9.k;
import y9.k0;
import y9.k1;
import y9.l;
import y9.l0;
import y9.l1;
import y9.m;
import y9.m0;
import y9.m1;
import y9.n;
import y9.n0;
import y9.n1;
import y9.o;
import y9.o0;
import y9.o1;
import y9.p;
import y9.p0;
import y9.p1;
import y9.q;
import y9.q0;
import y9.q1;
import y9.r;
import y9.r0;
import y9.r1;
import y9.s;
import y9.s0;
import y9.s1;
import y9.t;
import y9.t0;
import y9.t1;
import y9.u;
import y9.u0;
import y9.u1;
import y9.v;
import y9.v0;
import y9.v1;
import y9.w;
import y9.w0;
import y9.w1;
import y9.x;
import y9.x0;
import y9.x1;
import y9.y;
import y9.y0;
import y9.y1;
import y9.z;
import y9.z0;
import y9.z1;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class c {
    public static final i a;

    static {
        d dVar = new d();
        y9.d dVar2 = y9.d.a;
        dVar.m(e2.class, dVar2);
        dVar.m(a0.class, dVar2);
        j jVar = j.a;
        dVar.m(d2.class, jVar);
        dVar.m(h0.class, jVar);
        g gVar = g.a;
        dVar.m(l1.class, gVar);
        dVar.m(i0.class, gVar);
        h hVar = h.a;
        dVar.m(k1.class, hVar);
        dVar.m(j0.class, hVar);
        z zVar = z.a;
        dVar.m(c2.class, zVar);
        dVar.m(a1.class, zVar);
        y yVar = y.a;
        dVar.m(b2.class, yVar);
        dVar.m(z0.class, yVar);
        y9.i iVar = y9.i.a;
        dVar.m(m1.class, iVar);
        dVar.m(k0.class, iVar);
        t tVar = t.a;
        dVar.m(a2.class, tVar);
        dVar.m(l0.class, tVar);
        k kVar = k.a;
        dVar.m(u1.class, kVar);
        dVar.m(m0.class, kVar);
        m mVar = m.a;
        dVar.m(s1.class, mVar);
        dVar.m(n0.class, mVar);
        p pVar = p.a;
        dVar.m(r1.class, pVar);
        dVar.m(r0.class, pVar);
        q qVar = q.a;
        dVar.m(q1.class, qVar);
        dVar.m(s0.class, qVar);
        n nVar = n.a;
        dVar.m(o1.class, nVar);
        dVar.m(p0.class, nVar);
        y9.b bVar = y9.b.a;
        dVar.m(g1.class, bVar);
        dVar.m(b0.class, bVar);
        y9.a aVar = y9.a.a;
        dVar.m(f1.class, aVar);
        dVar.m(c0.class, aVar);
        o oVar = o.a;
        dVar.m(p1.class, oVar);
        dVar.m(q0.class, oVar);
        l lVar = l.a;
        dVar.m(n1.class, lVar);
        dVar.m(o0.class, lVar);
        y9.c cVar = y9.c.a;
        dVar.m(h1.class, cVar);
        dVar.m(d0.class, cVar);
        r rVar = r.a;
        dVar.m(t1.class, rVar);
        dVar.m(t0.class, rVar);
        s sVar = s.a;
        dVar.m(v1.class, sVar);
        dVar.m(u0.class, sVar);
        u uVar = u.a;
        dVar.m(w1.class, uVar);
        dVar.m(v0.class, uVar);
        x xVar = x.a;
        dVar.m(z1.class, xVar);
        dVar.m(y0.class, xVar);
        v vVar = v.a;
        dVar.m(y1.class, vVar);
        dVar.m(w0.class, vVar);
        w wVar = w.a;
        dVar.m(x1.class, wVar);
        dVar.m(x0.class, wVar);
        e eVar = e.a;
        dVar.m(j1.class, eVar);
        dVar.m(e0.class, eVar);
        f fVar = f.a;
        dVar.m(i1.class, fVar);
        dVar.m(f0.class, fVar);
        dVar.d = true;
        a = new i(dVar, 28);
    }

    public static s0 a(JsonReader jsonReader) {
        u6 u6Var = new u6();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            switch (nextName) {
                case "offset":
                    u6Var.d = Long.valueOf(jsonReader.nextLong());
                    break;
                case "symbol":
                    String nextString = jsonReader.nextString();
                    if (nextString == null) {
                        throw new NullPointerException("Null symbol");
                    }
                    u6Var.b = nextString;
                    break;
                case "pc":
                    u6Var.a = Long.valueOf(jsonReader.nextLong());
                    break;
                case "file":
                    u6Var.c = jsonReader.nextString();
                    break;
                case "importance":
                    u6Var.e = Integer.valueOf(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return u6Var.m();
    }

    public static d0 b(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            if (nextName.equals("key")) {
                str = jsonReader.nextString();
                if (str == null) {
                    throw new NullPointerException("Null key");
                }
            } else if (nextName.equals("value")) {
                str2 = jsonReader.nextString();
                if (str2 == null) {
                    throw new NullPointerException("Null value");
                }
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        String str3 = str == null ? " key" : "";
        if (str2 == null) {
            str3 = str3.concat(" value");
        }
        if (str3.isEmpty()) {
            return new d0(str, str2);
        }
        throw new IllegalStateException("Missing required properties:".concat(str3));
    }

    public static b0 c(JsonReader jsonReader) {
        da.b bVar = new da.b();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            switch (nextName) {
                case "buildIdMappingForArch":
                    bVar.i = d(jsonReader, new u2.c(25));
                    break;
                case "pid":
                    bVar.a = Integer.valueOf(jsonReader.nextInt());
                    break;
                case "pss":
                    bVar.e = Long.valueOf(jsonReader.nextLong());
                    break;
                case "rss":
                    bVar.f = Long.valueOf(jsonReader.nextLong());
                    break;
                case "timestamp":
                    bVar.g = Long.valueOf(jsonReader.nextLong());
                    break;
                case "processName":
                    String nextString = jsonReader.nextString();
                    if (nextString == null) {
                        throw new NullPointerException("Null processName");
                    }
                    bVar.b = nextString;
                    break;
                case "reasonCode":
                    bVar.c = Integer.valueOf(jsonReader.nextInt());
                    break;
                case "traceFile":
                    bVar.h = jsonReader.nextString();
                    break;
                case "importance":
                    bVar.d = Integer.valueOf(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return bVar.a();
    }

    public static List d(JsonReader jsonReader, b bVar) {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(bVar.a(jsonReader));
        }
        jsonReader.endArray();
        return DesugarCollections.unmodifiableList(arrayList);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static l0 e(JsonReader jsonReader) {
        char c10;
        char c11;
        String str;
        char c12;
        List list;
        char c13;
        List list2;
        List list3;
        char c14;
        com.google.firebase.messaging.n nVar = new com.google.firebase.messaging.n();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            switch (nextName.hashCode()) {
                case -1335157162:
                    if (nextName.equals("device")) {
                        c10 = 0;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -259312414:
                    if (nextName.equals("rollouts")) {
                        c10 = 1;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 96801:
                    if (nextName.equals("app")) {
                        c10 = 2;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 107332:
                    if (nextName.equals("log")) {
                        c10 = 3;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 3575610:
                    if (nextName.equals(TeXSymbolParser.TYPE_ATTR)) {
                        c10 = 4;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 55126294:
                    if (nextName.equals("timestamp")) {
                        c10 = 5;
                        break;
                    }
                    c10 = 65535;
                    break;
                default:
                    c10 = 65535;
                    break;
            }
            switch (c10) {
                case 0:
                    com.google.firebase.messaging.n nVar2 = new com.google.firebase.messaging.n();
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String nextName2 = jsonReader.nextName();
                        nextName2.getClass();
                        switch (nextName2.hashCode()) {
                            case -1708606089:
                                if (nextName2.equals("batteryLevel")) {
                                    c11 = 0;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -1455558134:
                                if (nextName2.equals("batteryVelocity")) {
                                    c11 = 1;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -1439500848:
                                if (nextName2.equals("orientation")) {
                                    c11 = 2;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 279795450:
                                if (nextName2.equals("diskUsed")) {
                                    c11 = 3;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 976541947:
                                if (nextName2.equals("ramUsed")) {
                                    c11 = 4;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 1516795582:
                                if (nextName2.equals("proximityOn")) {
                                    c11 = 5;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            default:
                                c11 = 65535;
                                break;
                        }
                        switch (c11) {
                            case 0:
                                nVar2.a = Double.valueOf(jsonReader.nextDouble());
                                break;
                            case 1:
                                nVar2.b = Integer.valueOf(jsonReader.nextInt());
                                break;
                            case 2:
                                nVar2.d = Integer.valueOf(jsonReader.nextInt());
                                break;
                            case 3:
                                nVar2.f = Long.valueOf(jsonReader.nextLong());
                                break;
                            case 4:
                                nVar2.e = Long.valueOf(jsonReader.nextLong());
                                break;
                            case 5:
                                nVar2.c = Boolean.valueOf(jsonReader.nextBoolean());
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    nVar.d = nVar2.j();
                    break;
                case 1:
                    jsonReader.beginObject();
                    List list4 = null;
                    while (jsonReader.hasNext()) {
                        String nextName3 = jsonReader.nextName();
                        nextName3.getClass();
                        if (nextName3.equals("assignments")) {
                            List d = d(jsonReader, new u2.c(27));
                            if (d == null) {
                                throw new NullPointerException("Null rolloutAssignments");
                            }
                            list4 = d;
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    str = list4 == null ? " rolloutAssignments" : "";
                    if (!str.isEmpty()) {
                        throw new IllegalStateException("Missing required properties:".concat(str));
                    }
                    nVar.f = new y0(list4);
                    break;
                case 2:
                    jsonReader.beginObject();
                    n0 n0Var = null;
                    List list5 = null;
                    List list6 = null;
                    Boolean bool = null;
                    t0 t0Var = null;
                    List list7 = null;
                    Integer num = null;
                    while (jsonReader.hasNext()) {
                        String nextName4 = jsonReader.nextName();
                        nextName4.getClass();
                        switch (nextName4.hashCode()) {
                            case -1405314732:
                                if (nextName4.equals("appProcessDetails")) {
                                    c12 = 0;
                                    break;
                                }
                                c12 = 65535;
                                break;
                            case -1332194002:
                                if (nextName4.equals("background")) {
                                    c12 = 1;
                                    break;
                                }
                                c12 = 65535;
                                break;
                            case -1090974952:
                                if (nextName4.equals("execution")) {
                                    c12 = 2;
                                    break;
                                }
                                c12 = 65535;
                                break;
                            case -80231855:
                                if (nextName4.equals("internalKeys")) {
                                    c12 = 3;
                                    break;
                                }
                                c12 = 65535;
                                break;
                            case 555169704:
                                if (nextName4.equals("customAttributes")) {
                                    c12 = 4;
                                    break;
                                }
                                c12 = 65535;
                                break;
                            case 928737948:
                                if (nextName4.equals("uiOrientation")) {
                                    c12 = 5;
                                    break;
                                }
                                c12 = 65535;
                                break;
                            case 1847730860:
                                if (nextName4.equals("currentProcessDetails")) {
                                    c12 = 6;
                                    break;
                                }
                                c12 = 65535;
                                break;
                            default:
                                c12 = 65535;
                                break;
                        }
                        switch (c12) {
                            case 0:
                                List list8 = list5;
                                list = list6;
                                ArrayList arrayList = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList.add(g(jsonReader));
                                }
                                jsonReader.endArray();
                                list7 = DesugarCollections.unmodifiableList(arrayList);
                                list5 = list8;
                                list6 = list;
                            case 1:
                                bool = Boolean.valueOf(jsonReader.nextBoolean());
                                list5 = list5;
                            case 2:
                                jsonReader.beginObject();
                                List list9 = null;
                                p0 p0Var = null;
                                b0 b0Var = null;
                                q0 q0Var = null;
                                List list10 = null;
                                while (jsonReader.hasNext()) {
                                    String nextName5 = jsonReader.nextName();
                                    nextName5.getClass();
                                    switch (nextName5.hashCode()) {
                                        case -1375141843:
                                            if (nextName5.equals("appExitInfo")) {
                                                c13 = 0;
                                                break;
                                            }
                                            c13 = 65535;
                                            break;
                                        case -1337936983:
                                            if (nextName5.equals("threads")) {
                                                c13 = 1;
                                                break;
                                            }
                                            c13 = 65535;
                                            break;
                                        case -902467928:
                                            if (nextName5.equals("signal")) {
                                                c13 = 2;
                                                break;
                                            }
                                            c13 = 65535;
                                            break;
                                        case 937615455:
                                            if (nextName5.equals("binaries")) {
                                                c13 = 3;
                                                break;
                                            }
                                            c13 = 65535;
                                            break;
                                        case 1481625679:
                                            if (nextName5.equals("exception")) {
                                                c13 = 4;
                                                break;
                                            }
                                            c13 = 65535;
                                            break;
                                        default:
                                            c13 = 65535;
                                            break;
                                    }
                                    switch (c13) {
                                        case 0:
                                            list2 = list5;
                                            list3 = list6;
                                            b0Var = c(jsonReader);
                                            list5 = list2;
                                            list6 = list3;
                                        case 1:
                                            list2 = list5;
                                            list3 = list6;
                                            list9 = d(jsonReader, new u2.c(28));
                                            list5 = list2;
                                            list6 = list3;
                                        case 2:
                                            jsonReader.beginObject();
                                            String str2 = null;
                                            String str3 = null;
                                            Long l4 = null;
                                            while (jsonReader.hasNext()) {
                                                String nextName6 = jsonReader.nextName();
                                                nextName6.getClass();
                                                switch (nextName6.hashCode()) {
                                                    case -1147692044:
                                                        if (nextName6.equals("address")) {
                                                            c14 = 0;
                                                            break;
                                                        }
                                                        c14 = 65535;
                                                        break;
                                                    case 3059181:
                                                        if (nextName6.equals("code")) {
                                                            c14 = 1;
                                                            break;
                                                        }
                                                        c14 = 65535;
                                                        break;
                                                    case 3373707:
                                                        if (nextName6.equals("name")) {
                                                            c14 = 2;
                                                            break;
                                                        }
                                                        c14 = 65535;
                                                        break;
                                                    default:
                                                        c14 = 65535;
                                                        break;
                                                }
                                                switch (c14) {
                                                    case 0:
                                                        l4 = Long.valueOf(jsonReader.nextLong());
                                                        break;
                                                    case 1:
                                                        str3 = jsonReader.nextString();
                                                        if (str3 == null) {
                                                            throw new NullPointerException("Null code");
                                                        }
                                                        break;
                                                    case 2:
                                                        str2 = jsonReader.nextString();
                                                        if (str2 == null) {
                                                            throw new NullPointerException("Null name");
                                                        }
                                                        break;
                                                    default:
                                                        jsonReader.skipValue();
                                                        break;
                                                }
                                            }
                                            jsonReader.endObject();
                                            String str4 = str2 == null ? " name" : "";
                                            if (str3 == null) {
                                                str4 = str4.concat(" code");
                                            }
                                            if (l4 == null) {
                                                str4 = r6.t(str4, " address");
                                            }
                                            if (!str4.isEmpty()) {
                                                throw new IllegalStateException("Missing required properties:".concat(str4));
                                            }
                                            list2 = list5;
                                            list3 = list6;
                                            q0Var = new q0(l4.longValue(), str2, str3);
                                            list5 = list2;
                                            list6 = list3;
                                        case 3:
                                            list10 = d(jsonReader, new u2.c(29));
                                            if (list10 == null) {
                                                throw new NullPointerException("Null binaries");
                                            }
                                            list2 = list5;
                                            list3 = list6;
                                            list5 = list2;
                                            list6 = list3;
                                        case 4:
                                            p0Var = f(jsonReader);
                                            list2 = list5;
                                            list3 = list6;
                                            list5 = list2;
                                            list6 = list3;
                                        default:
                                            jsonReader.skipValue();
                                            list2 = list5;
                                            list3 = list6;
                                            list5 = list2;
                                            list6 = list3;
                                    }
                                }
                                List list11 = list5;
                                list = list6;
                                jsonReader.endObject();
                                String str5 = q0Var == null ? " signal" : "";
                                if (list10 == null) {
                                    str5 = str5.concat(" binaries");
                                }
                                if (!str5.isEmpty()) {
                                    throw new IllegalStateException("Missing required properties:".concat(str5));
                                }
                                list5 = list11;
                                n0Var = new n0(list9, p0Var, b0Var, q0Var, list10);
                                list6 = list;
                            case 3:
                                ArrayList arrayList2 = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList2.add(b(jsonReader));
                                }
                                jsonReader.endArray();
                                list6 = DesugarCollections.unmodifiableList(arrayList2);
                            case 4:
                                ArrayList arrayList3 = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList3.add(b(jsonReader));
                                }
                                jsonReader.endArray();
                                list5 = DesugarCollections.unmodifiableList(arrayList3);
                            case 5:
                                num = Integer.valueOf(jsonReader.nextInt());
                            case 6:
                                t0Var = g(jsonReader);
                            default:
                                jsonReader.skipValue();
                        }
                    }
                    List list12 = list5;
                    List list13 = list6;
                    jsonReader.endObject();
                    str = n0Var == null ? " execution" : "";
                    if (num == null) {
                        str = str.concat(" uiOrientation");
                    }
                    if (!str.isEmpty()) {
                        throw new IllegalStateException("Missing required properties:".concat(str));
                    }
                    nVar.c = new m0(n0Var, list12, list13, bool, t0Var, list7, num.intValue());
                    break;
                case 3:
                    jsonReader.beginObject();
                    String str6 = null;
                    while (jsonReader.hasNext()) {
                        if (jsonReader.nextName().equals("content")) {
                            String nextString = jsonReader.nextString();
                            if (nextString == null) {
                                throw new NullPointerException("Null content");
                            }
                            str6 = nextString;
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    str = str6 == null ? " content" : "";
                    if (!str.isEmpty()) {
                        throw new IllegalStateException("Missing required properties:".concat(str));
                    }
                    nVar.e = new v0(str6);
                    break;
                case 4:
                    String nextString2 = jsonReader.nextString();
                    if (nextString2 == null) {
                        throw new NullPointerException("Null type");
                    }
                    nVar.b = nextString2;
                    break;
                case 5:
                    nVar.a = Long.valueOf(jsonReader.nextLong());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return nVar.i();
    }

    public static p0 f(JsonReader jsonReader) {
        int i10;
        jsonReader.beginObject();
        Integer num = null;
        String str = null;
        String str2 = null;
        List list = null;
        p0 p0Var = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            i10 = 0;
            switch (nextName) {
                case "frames":
                    List d = d(jsonReader, new a(i10));
                    if (d == null) {
                        throw new NullPointerException("Null frames");
                    }
                    list = d;
                    break;
                case "reason":
                    str2 = jsonReader.nextString();
                    break;
                case "type":
                    String nextString = jsonReader.nextString();
                    if (nextString == null) {
                        throw new NullPointerException("Null type");
                    }
                    str = nextString;
                    break;
                case "causedBy":
                    p0Var = f(jsonReader);
                    break;
                case "overflowCount":
                    num = Integer.valueOf(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        String str3 = str == null ? " type" : "";
        if (list == null) {
            str3 = str3.concat(" frames");
        }
        if (num == null) {
            str3 = r6.t(str3, " overflowCount");
        }
        if (str3.isEmpty()) {
            return new p0(str, str2, list, p0Var, num.intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str3));
    }

    public static t0 g(JsonReader jsonReader) {
        ki.f fVar = new ki.f();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            switch (nextName) {
                case "pid":
                    fVar.b = Integer.valueOf(jsonReader.nextInt());
                    break;
                case "processName":
                    String nextString = jsonReader.nextString();
                    if (nextString == null) {
                        throw new NullPointerException("Null processName");
                    }
                    fVar.a = nextString;
                    break;
                case "defaultProcess":
                    fVar.d = Boolean.valueOf(jsonReader.nextBoolean());
                    break;
                case "importance":
                    fVar.c = Integer.valueOf(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return fVar.f();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static a0 h(JsonReader jsonReader) {
        char c10;
        char c11;
        char c12;
        char c13;
        char c14;
        Charset charset = e2.a;
        d8 d8Var = new d8();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            switch (nextName.hashCode()) {
                case -2118372775:
                    if (nextName.equals("ndkPayload")) {
                        c10 = 0;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1962630338:
                    if (nextName.equals("sdkVersion")) {
                        c10 = 1;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1907185581:
                    if (nextName.equals("appQualitySessionId")) {
                        c10 = 2;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1375141843:
                    if (nextName.equals("appExitInfo")) {
                        c10 = 3;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -911706486:
                    if (nextName.equals("buildVersion")) {
                        c10 = 4;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 344431858:
                    if (nextName.equals("gmpAppId")) {
                        c10 = 5;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 719853845:
                    if (nextName.equals("installationUuid")) {
                        c10 = 6;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1047652060:
                    if (nextName.equals("firebaseInstallationId")) {
                        c10 = 7;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1874684019:
                    if (nextName.equals("platform")) {
                        c10 = '\b';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1975623094:
                    if (nextName.equals("displayVersion")) {
                        c10 = '\t';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1984987798:
                    if (nextName.equals("session")) {
                        c10 = '\n';
                        break;
                    }
                    c10 = 65535;
                    break;
                default:
                    c10 = 65535;
                    break;
            }
            switch (c10) {
                case 0:
                    jsonReader.beginObject();
                    List list = null;
                    String str = null;
                    while (jsonReader.hasNext()) {
                        String nextName2 = jsonReader.nextName();
                        nextName2.getClass();
                        if (nextName2.equals("files")) {
                            list = d(jsonReader, new u2.c(26));
                            if (list == null) {
                                throw new NullPointerException("Null files");
                            }
                        } else if (nextName2.equals("orgId")) {
                            str = jsonReader.nextString();
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    String str2 = list == null ? " files" : "";
                    if (!str2.isEmpty()) {
                        throw new IllegalStateException("Missing required properties:".concat(str2));
                    }
                    d8Var.h = new e0(str, list);
                    continue;
                case 1:
                    String nextString = jsonReader.nextString();
                    if (nextString == null) {
                        throw new NullPointerException("Null sdkVersion");
                    }
                    d8Var.a = nextString;
                    break;
                case 2:
                    d8Var.e = jsonReader.nextString();
                    break;
                case 3:
                    d8Var.j = c(jsonReader);
                    break;
                case 4:
                    String nextString2 = jsonReader.nextString();
                    if (nextString2 == null) {
                        throw new NullPointerException("Null buildVersion");
                    }
                    d8Var.k = nextString2;
                    break;
                case 5:
                    String nextString3 = jsonReader.nextString();
                    if (nextString3 == null) {
                        throw new NullPointerException("Null gmpAppId");
                    }
                    d8Var.b = nextString3;
                    break;
                case 6:
                    String nextString4 = jsonReader.nextString();
                    if (nextString4 == null) {
                        throw new NullPointerException("Null installationUuid");
                    }
                    d8Var.c = nextString4;
                    break;
                case 7:
                    d8Var.d = jsonReader.nextString();
                    break;
                case '\b':
                    d8Var.i = Integer.valueOf(jsonReader.nextInt());
                    break;
                case '\t':
                    String nextString5 = jsonReader.nextString();
                    if (nextString5 == null) {
                        throw new NullPointerException("Null displayVersion");
                    }
                    d8Var.f = nextString5;
                    break;
                case '\n':
                    g0 g0Var = new g0();
                    g0Var.f = Boolean.FALSE;
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String nextName3 = jsonReader.nextName();
                        nextName3.getClass();
                        switch (nextName3.hashCode()) {
                            case -2128794476:
                                if (nextName3.equals("startedAt")) {
                                    c11 = 0;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -1907185581:
                                if (nextName3.equals("appQualitySessionId")) {
                                    c11 = 1;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -1618432855:
                                if (nextName3.equals("identifier")) {
                                    c11 = 2;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -1606742899:
                                if (nextName3.equals("endedAt")) {
                                    c11 = 3;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -1335157162:
                                if (nextName3.equals("device")) {
                                    c11 = 4;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -1291329255:
                                if (nextName3.equals("events")) {
                                    c11 = 5;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 3556:
                                if (nextName3.equals("os")) {
                                    c11 = 6;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 96801:
                                if (nextName3.equals("app")) {
                                    c11 = 7;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 3599307:
                                if (nextName3.equals("user")) {
                                    c11 = '\b';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 286956243:
                                if (nextName3.equals("generator")) {
                                    c11 = '\t';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 1025385094:
                                if (nextName3.equals("crashed")) {
                                    c11 = '\n';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 2047016109:
                                if (nextName3.equals("generatorType")) {
                                    c11 = 11;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            default:
                                c11 = 65535;
                                break;
                        }
                        switch (c11) {
                            case 0:
                                g0Var.d = Long.valueOf(jsonReader.nextLong());
                                break;
                            case 1:
                                g0Var.c = jsonReader.nextString();
                                break;
                            case 2:
                                g0Var.b = new String(Base64.decode(jsonReader.nextString(), 2), e2.a);
                                break;
                            case 3:
                                g0Var.e = Long.valueOf(jsonReader.nextLong());
                                break;
                            case 4:
                                da.b bVar = new da.b();
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String nextName4 = jsonReader.nextName();
                                    nextName4.getClass();
                                    switch (nextName4.hashCode()) {
                                        case -1981332476:
                                            if (nextName4.equals("simulator")) {
                                                c12 = 0;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case -1969347631:
                                            if (nextName4.equals("manufacturer")) {
                                                c12 = 1;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 112670:
                                            if (nextName4.equals("ram")) {
                                                c12 = 2;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 3002454:
                                            if (nextName4.equals("arch")) {
                                                c12 = 3;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 81784169:
                                            if (nextName4.equals("diskSpace")) {
                                                c12 = 4;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 94848180:
                                            if (nextName4.equals("cores")) {
                                                c12 = 5;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 104069929:
                                            if (nextName4.equals("model")) {
                                                c12 = 6;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 109757585:
                                            if (nextName4.equals("state")) {
                                                c12 = 7;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 2078953423:
                                            if (nextName4.equals("modelClass")) {
                                                c12 = '\b';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        default:
                                            c12 = 65535;
                                            break;
                                    }
                                    switch (c12) {
                                        case 0:
                                            bVar.f = Boolean.valueOf(jsonReader.nextBoolean());
                                            break;
                                        case 1:
                                            String nextString6 = jsonReader.nextString();
                                            if (nextString6 == null) {
                                                throw new NullPointerException("Null manufacturer");
                                            }
                                            bVar.h = nextString6;
                                            break;
                                        case 2:
                                            bVar.d = Long.valueOf(jsonReader.nextLong());
                                            break;
                                        case 3:
                                            bVar.a = Integer.valueOf(jsonReader.nextInt());
                                            break;
                                        case 4:
                                            bVar.e = Long.valueOf(jsonReader.nextLong());
                                            break;
                                        case 5:
                                            bVar.c = Integer.valueOf(jsonReader.nextInt());
                                            break;
                                        case 6:
                                            String nextString7 = jsonReader.nextString();
                                            if (nextString7 == null) {
                                                throw new NullPointerException("Null model");
                                            }
                                            bVar.b = nextString7;
                                            break;
                                        case 7:
                                            bVar.g = Integer.valueOf(jsonReader.nextInt());
                                            break;
                                        case '\b':
                                            String nextString8 = jsonReader.nextString();
                                            if (nextString8 == null) {
                                                throw new NullPointerException("Null modelClass");
                                            }
                                            bVar.i = nextString8;
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                g0Var.j = bVar.b();
                                break;
                            case 5:
                                ArrayList arrayList = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList.add(e(jsonReader));
                                }
                                jsonReader.endArray();
                                g0Var.k = DesugarCollections.unmodifiableList(arrayList);
                                break;
                            case 6:
                                ki.f fVar = new ki.f();
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String nextName5 = jsonReader.nextName();
                                    nextName5.getClass();
                                    switch (nextName5.hashCode()) {
                                        case -911706486:
                                            if (nextName5.equals("buildVersion")) {
                                                c13 = 0;
                                                break;
                                            }
                                            c13 = 65535;
                                            break;
                                        case -293026577:
                                            if (nextName5.equals("jailbroken")) {
                                                c13 = 1;
                                                break;
                                            }
                                            c13 = 65535;
                                            break;
                                        case 351608024:
                                            if (nextName5.equals("version")) {
                                                c13 = 2;
                                                break;
                                            }
                                            c13 = 65535;
                                            break;
                                        case 1874684019:
                                            if (nextName5.equals("platform")) {
                                                c13 = 3;
                                                break;
                                            }
                                            c13 = 65535;
                                            break;
                                        default:
                                            c13 = 65535;
                                            break;
                                    }
                                    switch (c13) {
                                        case 0:
                                            String nextString9 = jsonReader.nextString();
                                            if (nextString9 == null) {
                                                throw new NullPointerException("Null buildVersion");
                                            }
                                            fVar.c = nextString9;
                                            break;
                                        case 1:
                                            fVar.d = Boolean.valueOf(jsonReader.nextBoolean());
                                            break;
                                        case 2:
                                            String nextString10 = jsonReader.nextString();
                                            if (nextString10 == null) {
                                                throw new NullPointerException("Null version");
                                            }
                                            fVar.b = nextString10;
                                            break;
                                        case 3:
                                            fVar.a = Integer.valueOf(jsonReader.nextInt());
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                g0Var.i = fVar.g();
                                break;
                            case 7:
                                jsonReader.beginObject();
                                String str3 = null;
                                String str4 = null;
                                String str5 = null;
                                String str6 = null;
                                String str7 = null;
                                String str8 = null;
                                while (jsonReader.hasNext()) {
                                    String nextName6 = jsonReader.nextName();
                                    nextName6.getClass();
                                    switch (nextName6.hashCode()) {
                                        case -1618432855:
                                            if (nextName6.equals("identifier")) {
                                                c14 = 0;
                                                break;
                                            }
                                            c14 = 65535;
                                            break;
                                        case -519438642:
                                            if (nextName6.equals("developmentPlatform")) {
                                                c14 = 1;
                                                break;
                                            }
                                            c14 = 65535;
                                            break;
                                        case 213652010:
                                            if (nextName6.equals("developmentPlatformVersion")) {
                                                c14 = 2;
                                                break;
                                            }
                                            c14 = 65535;
                                            break;
                                        case 351608024:
                                            if (nextName6.equals("version")) {
                                                c14 = 3;
                                                break;
                                            }
                                            c14 = 65535;
                                            break;
                                        case 719853845:
                                            if (nextName6.equals("installationUuid")) {
                                                c14 = 4;
                                                break;
                                            }
                                            c14 = 65535;
                                            break;
                                        case 1975623094:
                                            if (nextName6.equals("displayVersion")) {
                                                c14 = 5;
                                                break;
                                            }
                                            c14 = 65535;
                                            break;
                                        default:
                                            c14 = 65535;
                                            break;
                                    }
                                    switch (c14) {
                                        case 0:
                                            str3 = jsonReader.nextString();
                                            if (str3 == null) {
                                                throw new NullPointerException("Null identifier");
                                            }
                                            break;
                                        case 1:
                                            str7 = jsonReader.nextString();
                                            break;
                                        case 2:
                                            str8 = jsonReader.nextString();
                                            break;
                                        case 3:
                                            str4 = jsonReader.nextString();
                                            if (str4 == null) {
                                                throw new NullPointerException("Null version");
                                            }
                                            break;
                                        case 4:
                                            str6 = jsonReader.nextString();
                                            break;
                                        case 5:
                                            str5 = jsonReader.nextString();
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                String str9 = str3 == null ? " identifier" : "";
                                if (str4 == null) {
                                    str9 = str9.concat(" version");
                                }
                                if (!str9.isEmpty()) {
                                    throw new IllegalStateException("Missing required properties:".concat(str9));
                                }
                                g0Var.g = new i0(str3, str4, str5, str6, str7, str8);
                                break;
                            case '\b':
                                jsonReader.beginObject();
                                String str10 = null;
                                while (jsonReader.hasNext()) {
                                    if (jsonReader.nextName().equals("identifier")) {
                                        str10 = jsonReader.nextString();
                                        if (str10 == null) {
                                            throw new NullPointerException("Null identifier");
                                        }
                                    } else {
                                        jsonReader.skipValue();
                                    }
                                }
                                jsonReader.endObject();
                                String str11 = str10 == null ? " identifier" : "";
                                if (!str11.isEmpty()) {
                                    throw new IllegalStateException("Missing required properties:".concat(str11));
                                }
                                g0Var.h = new a1(str10);
                                break;
                            case '\t':
                                String nextString11 = jsonReader.nextString();
                                if (nextString11 == null) {
                                    throw new NullPointerException("Null generator");
                                }
                                g0Var.a = nextString11;
                                break;
                            case '\n':
                                g0Var.f = Boolean.valueOf(jsonReader.nextBoolean());
                                break;
                            case 11:
                                g0Var.l = Integer.valueOf(jsonReader.nextInt());
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    d8Var.g = g0Var.a();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return d8Var.a();
    }

    public static a0 i(String str) {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                a0 h = h(jsonReader);
                jsonReader.close();
                return h;
            } finally {
            }
        } catch (IllegalStateException e) {
            throw new IOException(e);
        }
    }
}
