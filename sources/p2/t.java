package p2;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import b2.t0;
import b2.v0;
import b2.w0;
import com.google.android.gms.internal.play_billing.k3;
import e2.m0;
import e9.n0;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import m.g3;
import v7.u6;
import v7.v6;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final class t implements y2.n {
    public final q a;
    public final n b;
    public static final Pattern c = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");
    public static final Pattern d = Pattern.compile("VIDEO=\"((?:.|\f)+?)\"");
    public static final Pattern e = Pattern.compile("AUDIO=\"((?:.|\f)+?)\"");
    public static final Pattern f = Pattern.compile("SUBTITLES=\"((?:.|\f)+?)\"");
    public static final Pattern h = Pattern.compile("CLOSED-CAPTIONS=\"((?:.|\f)+?)\"");
    public static final Pattern n = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");
    public static final Pattern r = Pattern.compile("CHANNELS=\"((?:.|\f)+?)\"");
    public static final Pattern s = Pattern.compile("VIDEO-RANGE=(SDR|PQ|HLG)");
    public static final Pattern v = Pattern.compile("CODECS=\"((?:.|\f)+?)\"");
    public static final Pattern w = Pattern.compile("SUPPLEMENTAL-CODECS=\"((?:.|\f)+?)\"");
    public static final Pattern x = Pattern.compile("MIME=\"(.+?)\"");
    public static final Pattern y = Pattern.compile("CACHED=\"(.+?)\"");
    public static final Pattern E = Pattern.compile("DOCID=\"(.+?)\"");
    public static final Pattern F = Pattern.compile("DOCFILENAME=\"(.+?)\"");
    public static final Pattern G = Pattern.compile("ACCOUNT=\"(.+?)\"");
    public static final Pattern H = Pattern.compile("RESOLUTION=(\\d+x\\d+)");
    public static final Pattern I = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");
    public static final Pattern J = Pattern.compile("PATHWAY-ID=\"((?:.|\f)+?)\"");
    public static final Pattern K = Pattern.compile("STABLE-VARIANT-ID=\"((?:.|\f)+?)\"");
    public static final Pattern L = Pattern.compile("STABLE-RENDITION-ID=\"((?:.|\f)+?)\"");
    public static final Pattern M = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");
    public static final Pattern N = Pattern.compile("DURATION=([\\d\\.]+)\\b");
    public static final Pattern O = Pattern.compile("[:,]DURATION=([\\d\\.]+)\\b");
    public static final Pattern P = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");
    public static final Pattern Q = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");
    public static final Pattern R = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");
    public static final Pattern S = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");
    public static final Pattern T = a("CAN-SKIP-DATERANGES");
    public static final Pattern U = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");
    public static final Pattern V = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");
    public static final Pattern W = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");
    public static final Pattern X = a("CAN-BLOCK-RELOAD");
    public static final Pattern Y = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");
    public static final Pattern Z = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");
    public static final Pattern a0 = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");
    public static final Pattern b0 = Pattern.compile("LAST-MSN=(\\d+)\\b");
    public static final Pattern c0 = Pattern.compile("LAST-PART=(\\d+)\\b");
    public static final Pattern d0 = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");
    public static final Pattern e0 = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");
    public static final Pattern f0 = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");
    public static final Pattern g0 = Pattern.compile("BYTERANGE-START=(\\d+)\\b");
    public static final Pattern h0 = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");
    public static final Pattern i0 = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");
    public static final Pattern j0 = Pattern.compile("KEYFORMAT=\"((?:.|\f)+?)\"");
    public static final Pattern k0 = Pattern.compile("KEYFORMATVERSIONS=\"((?:.|\f)+?)\"");
    public static final Pattern l0 = Pattern.compile("URI=\"((?:.|\f)+?)\"");
    public static final Pattern m0 = Pattern.compile("IV=([^,.*]+)");
    public static final Pattern n0 = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");
    public static final Pattern o0 = Pattern.compile("TYPE=(PART|MAP)");
    public static final Pattern p0 = Pattern.compile("LANGUAGE=\"((?:.|\f)+?)\"");
    public static final Pattern q0 = Pattern.compile("NAME=\"((?:.|\f)+?)\"");
    public static final Pattern r0 = Pattern.compile("QUERYPARAM=\"((?:.|\f)+?)\"");
    public static final Pattern s0 = Pattern.compile("GROUP-ID=\"((?:.|\f)+?)\"");
    public static final Pattern t0 = Pattern.compile("CHARACTERISTICS=\"((?:.|\f)+?)\"");
    public static final Pattern u0 = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");
    public static final Pattern v0 = a("AUTOSELECT");
    public static final Pattern w0 = a("DEFAULT");
    public static final Pattern x0 = a("FORCED");
    public static final Pattern y0 = a("INDEPENDENT");
    public static final Pattern z0 = a("GAP");
    public static final Pattern A0 = a("PRECISE");
    public static final Pattern B0 = Pattern.compile("VALUE=\"((?:.|\f)+?)\"");
    public static final Pattern C0 = Pattern.compile("IMPORT=\"((?:.|\f)+?)\"");
    public static final Pattern D0 = Pattern.compile("[:,]ID=\"((?:.|\f)+?)\"");
    public static final Pattern E0 = Pattern.compile("CLASS=\"((?:.|\f)+?)\"");
    public static final Pattern F0 = Pattern.compile("START-DATE=\"((?:.|\f)+?)\"");
    public static final Pattern G0 = Pattern.compile("CUE=\"((?:.|\f)+?)\"");
    public static final Pattern H0 = Pattern.compile("END-DATE=\"((?:.|\f)+?)\"");
    public static final Pattern I0 = Pattern.compile("PLANNED-DURATION=([\\d\\.]+)\\b");
    public static final Pattern J0 = a("END-ON-NEXT");
    public static final Pattern K0 = Pattern.compile("X-ASSET-URI=\"((?:.|\f)+?)\"");
    public static final Pattern L0 = Pattern.compile("X-ASSET-LIST=\"((?:.|\f)+?)\"");
    public static final Pattern M0 = Pattern.compile("X-RESUME-OFFSET=(-?[\\d\\.]+)\\b");
    public static final Pattern N0 = Pattern.compile("X-PLAYOUT-LIMIT=([\\d\\.]+)\\b");
    public static final Pattern O0 = Pattern.compile("X-SNAP=\"((?:.|\f)+?)\"");
    public static final Pattern P0 = Pattern.compile("X-RESTRICT=\"((?:.|\f)+?)\"");
    public static final Pattern Q0 = Pattern.compile("X-CONTENT-MAY-VARY=\"((?:.|\f)+?)\"");
    public static final Pattern R0 = Pattern.compile("X-TIMELINE-OCCUPIES=\"((?:.|\f)+?)\"");
    public static final Pattern S0 = Pattern.compile("X-TIMELINE-STYLE=\"((?:.|\f)+?)\"");
    public static final Pattern T0 = Pattern.compile("X-SKIP-CONTROL-OFFSET=([\\d\\.]+)\\b");
    public static final Pattern U0 = Pattern.compile("X-SKIP-CONTROL-DURATION=([\\d\\.]+)\\b");
    public static final Pattern V0 = Pattern.compile("X-SKIP-CONTROL-LABEL-ID=\"((?:.|\f)+?)\"");
    public static final Pattern W0 = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");
    public static final Pattern X0 = Pattern.compile("\\b(X-[A-Z0-9-]+)=");

    public t(q qVar, n nVar) {
        this.a = qVar;
        this.b = nVar;
    }

    public static Pattern a(String str) {
        return Pattern.compile(str.concat("=(NO|YES)"));
    }

    public static b2.s b(String str, b2.r[] rVarArr) {
        b2.r[] rVarArr2 = new b2.r[rVarArr.length];
        for (int i10 = 0; i10 < rVarArr.length; i10++) {
            b2.r rVar = rVarArr[i10];
            rVarArr2[i10] = new b2.r(rVar.b, rVar.c, rVar.d, null);
        }
        return new b2.s(str, true, rVarArr2);
    }

    public static b2.r c(String str, String str2, HashMap hashMap, o2.d dVar) {
        String i10 = i(str, k0, "1", hashMap, dVar);
        boolean equals = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2);
        Pattern pattern = l0;
        if (equals) {
            String j10 = j(str, pattern, hashMap, dVar);
            return new b2.r(b2.m.e, null, "video/mp4", Base64.decode(j10.substring(j10.indexOf(44)), 0));
        }
        if ("com.widevine".equals(str2)) {
            UUID uuid = b2.m.e;
            String str3 = m0.a;
            return new b2.r(uuid, null, "hls", str.getBytes(StandardCharsets.UTF_8));
        }
        if (!"com.microsoft.playready".equals(str2) || !"1".equals(i10)) {
            return null;
        }
        String j11 = j(str, pattern, hashMap, dVar);
        byte[] decode = Base64.decode(j11.substring(j11.indexOf(44)), 0);
        UUID uuid2 = b2.m.f;
        return new b2.r(uuid2, null, "video/mp4", w3.p.a(uuid2, null, decode));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x0a3a, code lost:
    
        if (r5.equals(r13) != false) goto L373;
     */
    /* JADX WARN: Code restructure failed: missing block: B:506:0x0a1e, code lost:
    
        if (r13.equals("POINT") != false) goto L364;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0808  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0a2b  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0a4e  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0a63  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0a8f  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0c00 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:502:0x0a69  */
    /* JADX WARN: Removed duplicated region for block: B:503:0x0a54  */
    /* JADX WARN: Removed duplicated region for block: B:578:0x06ff  */
    /* JADX WARN: Removed duplicated region for block: B:783:0x1207  */
    /* JADX WARN: Removed duplicated region for block: B:786:0x120a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static n d(q qVar, n nVar, g3 g3Var, Uri uri, o2.d dVar) {
        HashMap hashMap;
        Iterator it;
        h hVar;
        ArrayList arrayList;
        LinkedHashMap linkedHashMap;
        String str;
        int i10;
        String str2;
        int i11;
        long j10;
        int i12;
        i iVar;
        String str3;
        long j11;
        String str4;
        HashMap hashMap2;
        LinkedHashMap linkedHashMap2;
        ArrayList arrayList2;
        String str5;
        TreeMap treeMap;
        ArrayList arrayList3;
        String str6;
        int i13;
        b2.s sVar;
        b2.s sVar2;
        String str7;
        int i14;
        String str8;
        ArrayList arrayList4;
        ArrayList arrayList5;
        long j12;
        String str9;
        int i15;
        b2.s sVar3;
        String i16;
        String str10;
        String str11;
        Matcher a2;
        String str12;
        ArrayList arrayList6;
        ArrayList arrayList7;
        ArrayList arrayList8;
        ArrayList arrayList9;
        char c10;
        ArrayList arrayList10;
        Matcher matcher;
        boolean z10;
        ArrayList arrayList11;
        f fVar;
        int i17;
        char c11;
        String str13;
        long j13;
        b2.s sVar4;
        b2.s sVar5;
        q qVar2 = qVar;
        n nVar2 = nVar;
        String uri2 = uri.toString();
        boolean z11 = qVar2.c;
        k kVar = nVar2 != null ? nVar2.x : null;
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        ArrayList arrayList12 = new ArrayList();
        ArrayList arrayList13 = new ArrayList();
        ArrayList arrayList14 = new ArrayList();
        ArrayList arrayList15 = new ArrayList();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        m mVar = new m(-9223372036854775807L, false, -9223372036854775807L, -9223372036854775807L, false);
        TreeMap treeMap2 = new TreeMap();
        String str14 = "";
        int i18 = 0;
        String str15 = "";
        k kVar2 = kVar;
        long j14 = -1;
        boolean z12 = z11;
        long j15 = -9223372036854775807L;
        long j16 = -9223372036854775807L;
        long j17 = -9223372036854775807L;
        long j18 = 0;
        long j19 = 0;
        long j20 = 0;
        long j21 = 0;
        long j22 = 0;
        long j23 = 0;
        long j24 = 0;
        long j25 = 0;
        int i19 = 0;
        int i20 = 0;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        int i21 = 0;
        int i22 = 0;
        boolean z16 = false;
        int i23 = 1;
        b2.s sVar6 = null;
        b2.s sVar7 = null;
        String str16 = null;
        String str17 = null;
        i iVar2 = null;
        String str18 = null;
        while (true) {
            int i24 = i19;
            String str19 = "POINT";
            m mVar2 = mVar;
            if (!g3Var.H()) {
                ArrayList arrayList16 = arrayList12;
                ArrayList arrayList17 = arrayList13;
                ArrayList arrayList18 = arrayList14;
                ArrayList arrayList19 = arrayList15;
                LinkedHashMap linkedHashMap4 = linkedHashMap3;
                i iVar3 = iVar2;
                HashMap hashMap5 = new HashMap();
                int i25 = i18;
                while (i25 < arrayList18.size()) {
                    ArrayList arrayList20 = arrayList18;
                    j jVar = (j) arrayList20.get(i25);
                    long j26 = jVar.b;
                    if (j26 == -1) {
                        j26 = (j18 + arrayList16.size()) - (arrayList17.isEmpty() ? 1L : 0L);
                    }
                    int i26 = jVar.c;
                    if (i26 == -1 && j15 != -9223372036854775807L) {
                        i26 = (arrayList17.isEmpty() ? ((k) e9.s.m(arrayList16)).x : arrayList17).size() - 1;
                    }
                    Uri uri3 = jVar.a;
                    hashMap5.put(uri3, new j(uri3, j26, i26));
                    i25++;
                    arrayList18 = arrayList20;
                }
                if (iVar3 != null) {
                    arrayList17.add(iVar3);
                }
                ArrayList arrayList21 = new ArrayList();
                Iterator it2 = linkedHashMap4.values().iterator();
                while (it2.hasNext()) {
                    g gVar = (g) it2.next();
                    Uri uri4 = gVar.d;
                    if ((uri4 == null && gVar.c != null) || (uri4 != null && gVar.c == null)) {
                        long j27 = gVar.e;
                        if (j27 != -9223372036854775807L) {
                            String str20 = gVar.a;
                            Uri uri5 = gVar.c;
                            long j28 = gVar.f;
                            hashMap = hashMap5;
                            it = it2;
                            long j29 = gVar.g;
                            long j30 = gVar.h;
                            ArrayList arrayList22 = gVar.i;
                            boolean z17 = gVar.j;
                            long j31 = gVar.k;
                            long j32 = gVar.l;
                            ArrayList arrayList23 = gVar.m;
                            ArrayList arrayList24 = gVar.n;
                            ArrayList arrayList25 = new ArrayList(gVar.b.values());
                            Boolean bool = gVar.o;
                            boolean z18 = bool == null || bool.booleanValue();
                            String str21 = gVar.p;
                            String str22 = str21 != null ? str21 : "POINT";
                            String str23 = gVar.q;
                            hVar = new h(str20, uri5, uri4, j27, j28, j29, j30, arrayList22, z17, j31, j32, arrayList23, arrayList24, arrayList25, z18, str22, str23 != null ? str23 : "HIGHLIGHT", gVar.r, gVar.s, gVar.t);
                            if (hVar == null) {
                                arrayList21.add(hVar);
                            }
                            it2 = it;
                            hashMap5 = hashMap;
                        }
                    }
                    hashMap = hashMap5;
                    it = it2;
                    hVar = null;
                    if (hVar == null) {
                    }
                    it2 = it;
                    hashMap5 = hashMap;
                }
                HashMap hashMap6 = hashMap5;
                if (j20 == 0 && nVar != null && nVar.p) {
                    j20 = nVar.h;
                }
                return new n(i22, uri.toString(), arrayList19, j16, z14, j20, z13, i20, j18, i23, j17, j15, z12, z15, j20 != 0, sVar6, arrayList16, arrayList17, mVar2, hashMap6, arrayList21, kVar2);
            }
            String J2 = g3Var.J();
            HashMap hashMap7 = hashMap4;
            if (J2.startsWith("#EXT")) {
                arrayList15.add(J2);
            }
            if (J2.startsWith("#EXT-X-PLAYLIST-TYPE")) {
                String j33 = j(J2, R, hashMap3, dVar);
                if ("VOD".equals(j33)) {
                    i22 = 1;
                } else if ("EVENT".equals(j33)) {
                    i22 = 2;
                }
                i19 = i24;
                mVar = mVar2;
            } else if (J2.equals("#EXT-X-I-FRAMES-ONLY")) {
                i19 = i24;
                mVar = mVar2;
                hashMap4 = hashMap7;
                z16 = true;
            } else {
                if (J2.startsWith("#EXT-X-START")) {
                    arrayList = arrayList15;
                    linkedHashMap = linkedHashMap3;
                    long parseDouble = (long) (Double.parseDouble(j(J2, d0, Collections.EMPTY_MAP, dVar)) * 1000000.0d);
                    z14 = f(J2, A0, dVar);
                    j16 = parseDouble;
                } else {
                    arrayList = arrayList15;
                    linkedHashMap = linkedHashMap3;
                    if (J2.startsWith("#EXT-X-SERVER-CONTROL")) {
                        double g10 = g(J2, S, -9.223372036854776E18d, dVar);
                        long j34 = g10 == -9.223372036854776E18d ? -9223372036854775807L : (long) (g10 * 1000000.0d);
                        boolean f7 = f(J2, T, dVar);
                        double g11 = g(J2, V, -9.223372036854776E18d, dVar);
                        long j35 = g11 == -9.223372036854776E18d ? -9223372036854775807L : (long) (g11 * 1000000.0d);
                        double g12 = g(J2, W, -9.223372036854776E18d, dVar);
                        arrayList15 = arrayList;
                        i19 = i24;
                        hashMap4 = hashMap7;
                        linkedHashMap3 = linkedHashMap;
                        mVar = new m(j34, f7, j35, g12 == -9.223372036854776E18d ? -9223372036854775807L : (long) (g12 * 1000000.0d), f(J2, X, dVar));
                    } else if (J2.startsWith("#EXT-X-PART-INF")) {
                        j15 = (long) (Double.parseDouble(j(J2, P, Collections.EMPTY_MAP, dVar)) * 1000000.0d);
                    } else {
                        boolean startsWith = J2.startsWith("#EXT-X-MAP");
                        Pattern pattern = f0;
                        Pattern pattern2 = l0;
                        if (startsWith) {
                            String j36 = j(J2, pattern2, hashMap3, dVar);
                            String i27 = i(J2, pattern, null, hashMap3, dVar);
                            if (i27 != null) {
                                String str24 = m0.a;
                                String[] split = i27.split("@", -1);
                                j14 = Long.parseLong(split[i18]);
                                if (split.length > 1) {
                                    j22 = Long.parseLong(split[1]);
                                }
                            }
                            long j37 = j14;
                            long j38 = j37 == -1 ? 0L : j22;
                            if (str16 != null && str17 == null) {
                                throw w0.b("The encryption IV attribute must be present when an initialization segment is encrypted with METHOD=AES-128.", null);
                            }
                            k kVar3 = new k(j36, j38, j37, str16, str17);
                            String str25 = str17;
                            if (j37 != -1) {
                                j38 += j37;
                            }
                            j22 = j38;
                            kVar2 = kVar3;
                            i19 = i24;
                            j14 = -1;
                            mVar = mVar2;
                            hashMap4 = hashMap7;
                            linkedHashMap3 = linkedHashMap;
                            arrayList15 = arrayList;
                            str17 = str25;
                        } else {
                            String str26 = str17;
                            ArrayList arrayList26 = arrayList13;
                            ArrayList arrayList27 = arrayList14;
                            if (J2.startsWith("#EXT-X-TARGETDURATION")) {
                                j17 = Integer.parseInt(j(J2, M, Collections.EMPTY_MAP, dVar)) * 1000000;
                            } else if (J2.startsWith("#EXT-X-MEDIA-SEQUENCE")) {
                                j21 = Long.parseLong(j(J2, Y, Collections.EMPTY_MAP, dVar));
                                i19 = i24;
                                j18 = j21;
                                mVar = mVar2;
                                hashMap4 = hashMap7;
                                linkedHashMap3 = linkedHashMap;
                                arrayList15 = arrayList;
                                str17 = str26;
                                arrayList14 = arrayList27;
                                arrayList13 = arrayList26;
                            } else if (J2.startsWith("#EXT-X-VERSION")) {
                                i23 = Integer.parseInt(j(J2, Q, Collections.EMPTY_MAP, dVar));
                            } else {
                                if (J2.startsWith("#EXT-X-DEFINE")) {
                                    String i28 = i(J2, q0, null, hashMap3, dVar);
                                    String i29 = i(J2, r0, null, hashMap3, dVar);
                                    if (i28 != null) {
                                        l(i28, hashMap3);
                                        hashMap3.put(i28, j(J2, B0, hashMap3, dVar));
                                    } else if (i29 != null) {
                                        l(i29, hashMap3);
                                        String queryParameter = uri.getQueryParameter(i29);
                                        if (queryParameter == null) {
                                            throw w0.b("QUERYPARAM \"" + i29 + "\" not found in playlist URI", null);
                                        }
                                        hashMap3.put(i29, queryParameter);
                                    } else {
                                        String j39 = j(J2, C0, hashMap3, dVar);
                                        l(j39, hashMap3);
                                        String str27 = (String) qVar2.l.get(j39);
                                        if (str27 != null) {
                                            hashMap3.put(j39, str27);
                                        }
                                    }
                                    str = str16;
                                    i10 = i24;
                                    str2 = str14;
                                    i11 = i18;
                                    j10 = j14;
                                    i12 = i21;
                                    iVar = iVar2;
                                    str3 = str18;
                                    j11 = j24;
                                    str4 = str15;
                                    hashMap2 = hashMap7;
                                    linkedHashMap2 = linkedHashMap;
                                    arrayList2 = arrayList26;
                                    str5 = uri2;
                                    treeMap = treeMap2;
                                } else if (J2.startsWith("#EXTINF")) {
                                    j24 = new BigDecimal(j(J2, Z, Collections.EMPTY_MAP, dVar)).multiply(new BigDecimal(1000000L)).longValue();
                                    str15 = i(J2, a0, str14, hashMap3, dVar);
                                } else if (J2.startsWith("#EXT-X-SKIP")) {
                                    int parseInt = Integer.parseInt(j(J2, U, Collections.EMPTY_MAP, dVar));
                                    u6.p((nVar2 == null || !arrayList12.isEmpty()) ? i18 : 1);
                                    String str28 = m0.a;
                                    long j40 = nVar2.k;
                                    n0 n0Var = nVar2.r;
                                    int i30 = (int) (j18 - j40);
                                    int i31 = parseInt + i30;
                                    if (i30 >= 0 && i31 <= n0Var.size()) {
                                        long j41 = j23;
                                        str17 = str26;
                                        while (i30 < i31) {
                                            k kVar4 = (k) n0Var.get(i30);
                                            if (j18 != nVar2.k) {
                                                int i32 = (nVar2.j - i20) + kVar4.d;
                                                n0 n0Var2 = kVar4.x;
                                                ArrayList arrayList28 = new ArrayList();
                                                int i33 = i18;
                                                long j42 = j41;
                                                while (i33 < n0Var2.size()) {
                                                    i iVar4 = (i) n0Var2.get(i33);
                                                    arrayList28.add(new i(iVar4.a, iVar4.b, iVar4.c, i32, j42, iVar4.f, iVar4.h, iVar4.n, iVar4.r, iVar4.s, iVar4.v, iVar4.w, iVar4.x));
                                                    j42 += iVar4.c;
                                                    i33++;
                                                    str14 = str14;
                                                }
                                                str6 = str14;
                                                kVar4 = new k(kVar4.a, kVar4.b, kVar4.w, kVar4.c, i32, j41, kVar4.f, kVar4.h, kVar4.n, kVar4.r, kVar4.s, kVar4.v, arrayList28);
                                            } else {
                                                str6 = str14;
                                            }
                                            arrayList12.add(kVar4);
                                            long j43 = kVar4.c;
                                            String str29 = kVar4.n;
                                            j41 += j43;
                                            long j44 = kVar4.s;
                                            if (j44 != -1) {
                                                j22 = kVar4.r + j44;
                                            }
                                            int i34 = kVar4.d;
                                            k kVar5 = kVar4.b;
                                            b2.s sVar8 = kVar4.f;
                                            String str30 = kVar4.h;
                                            if (str29 == null || !str29.equals(Long.toHexString(j21))) {
                                                str17 = str29;
                                            }
                                            j21++;
                                            i30++;
                                            i24 = i34;
                                            kVar2 = kVar5;
                                            str16 = str30;
                                            sVar7 = sVar8;
                                            j19 = j41;
                                            str14 = str6;
                                        }
                                        qVar2 = qVar;
                                        i19 = i24;
                                        mVar = mVar2;
                                        hashMap4 = hashMap7;
                                        linkedHashMap3 = linkedHashMap;
                                        arrayList15 = arrayList;
                                        arrayList14 = arrayList27;
                                        arrayList13 = arrayList26;
                                        j23 = j41;
                                    }
                                } else {
                                    str2 = str14;
                                    if (J2.startsWith("#EXT-X-KEY")) {
                                        String j45 = j(J2, i0, hashMap3, dVar);
                                        String i35 = i(J2, j0, "identity", hashMap3, dVar);
                                        if ("NONE".equals(j45)) {
                                            treeMap2.clear();
                                            sVar7 = null;
                                            str16 = null;
                                            str17 = null;
                                        } else {
                                            String i36 = i(J2, m0, null, hashMap3, dVar);
                                            if (!"identity".equals(i35)) {
                                                String str31 = str18;
                                                if (str31 == null) {
                                                    str18 = ("SAMPLE-AES-CENC".equals(j45) || "SAMPLE-AES-CTR".equals(j45)) ? "cenc" : "cbcs";
                                                } else {
                                                    str18 = str31;
                                                }
                                                b2.r c12 = c(J2, i35, hashMap3, dVar);
                                                if (c12 != null) {
                                                    treeMap2.put(i35, c12);
                                                    str17 = i36;
                                                    sVar7 = null;
                                                    str16 = null;
                                                }
                                            } else if ("AES-128".equals(j45)) {
                                                str16 = j(J2, pattern2, hashMap3, dVar);
                                                str17 = i36;
                                            }
                                            str17 = i36;
                                            str16 = null;
                                        }
                                        qVar2 = qVar;
                                        i19 = i24;
                                        mVar = mVar2;
                                        hashMap4 = hashMap7;
                                        linkedHashMap3 = linkedHashMap;
                                        arrayList15 = arrayList;
                                    } else {
                                        String str32 = str18;
                                        if (J2.startsWith("#EXT-X-BYTERANGE")) {
                                            String j46 = j(J2, e0, hashMap3, dVar);
                                            String str33 = m0.a;
                                            String[] split2 = j46.split("@", -1);
                                            j14 = Long.parseLong(split2[i18]);
                                            if (split2.length > 1) {
                                                j22 = Long.parseLong(split2[1]);
                                            }
                                        } else if (J2.startsWith("#EXT-X-DISCONTINUITY-SEQUENCE")) {
                                            i20 = Integer.parseInt(J2.substring(J2.indexOf(58) + 1));
                                            qVar2 = qVar;
                                            str18 = str32;
                                            i19 = i24;
                                            mVar = mVar2;
                                            hashMap4 = hashMap7;
                                            linkedHashMap3 = linkedHashMap;
                                            arrayList15 = arrayList;
                                            str17 = str26;
                                            arrayList14 = arrayList27;
                                            arrayList13 = arrayList26;
                                            str14 = str2;
                                            z13 = true;
                                        } else if (J2.equals("#EXT-X-DISCONTINUITY")) {
                                            i19 = i24 + 1;
                                            qVar2 = qVar;
                                            str18 = str32;
                                            mVar = mVar2;
                                            hashMap4 = hashMap7;
                                            linkedHashMap3 = linkedHashMap;
                                            arrayList15 = arrayList;
                                            str17 = str26;
                                        } else {
                                            if (J2.startsWith("#EXT-X-PROGRAM-DATE-TIME")) {
                                                if (j20 == 0) {
                                                    j20 = m0.S(m0.V(J2.substring(J2.indexOf(58) + 1))) - j23;
                                                }
                                            } else if (J2.equals("#EXT-X-GAP")) {
                                                qVar2 = qVar;
                                                str18 = str32;
                                                i19 = i24;
                                                mVar = mVar2;
                                                hashMap4 = hashMap7;
                                                linkedHashMap3 = linkedHashMap;
                                                arrayList15 = arrayList;
                                                str17 = str26;
                                                arrayList14 = arrayList27;
                                                arrayList13 = arrayList26;
                                                str14 = str2;
                                                i21 = 1;
                                            } else if (J2.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                                                qVar2 = qVar;
                                                str18 = str32;
                                                i19 = i24;
                                                mVar = mVar2;
                                                hashMap4 = hashMap7;
                                                linkedHashMap3 = linkedHashMap;
                                                arrayList15 = arrayList;
                                                str17 = str26;
                                                arrayList14 = arrayList27;
                                                arrayList13 = arrayList26;
                                                str14 = str2;
                                                z12 = true;
                                            } else if (J2.equals("#EXT-X-ENDLIST")) {
                                                qVar2 = qVar;
                                                str18 = str32;
                                                i19 = i24;
                                                mVar = mVar2;
                                                hashMap4 = hashMap7;
                                                linkedHashMap3 = linkedHashMap;
                                                arrayList15 = arrayList;
                                                str17 = str26;
                                                arrayList14 = arrayList27;
                                                arrayList13 = arrayList26;
                                                str14 = str2;
                                                z15 = true;
                                            } else if (J2.startsWith("#EXT-X-RENDITION-REPORT")) {
                                                long h10 = h(J2, b0, dVar);
                                                Matcher a10 = o2.d.a(J2, c0, dVar);
                                                if (a10.find()) {
                                                    String group = a10.group(1);
                                                    group.getClass();
                                                    i13 = Integer.parseInt(group);
                                                } else {
                                                    i13 = -1;
                                                }
                                                arrayList27.add(new j(Uri.parse(e2.e.f(uri2, j(J2, pattern2, hashMap3, dVar))), h10, i13));
                                            } else if (J2.startsWith("#EXT-X-PRELOAD-HINT")) {
                                                i iVar5 = iVar2;
                                                if (iVar5 == null && "PART".equals(j(J2, o0, hashMap3, dVar))) {
                                                    b2.s sVar9 = sVar7;
                                                    String j47 = j(J2, pattern2, hashMap3, dVar);
                                                    long h11 = h(J2, g0, dVar);
                                                    long h12 = h(J2, h0, dVar);
                                                    String hexString = str16 == null ? null : str26 != null ? str26 : Long.toHexString(j21);
                                                    if (sVar9 != null || treeMap2.isEmpty()) {
                                                        sVar = sVar9;
                                                    } else {
                                                        b2.r[] rVarArr = (b2.r[]) treeMap2.values().toArray(new b2.r[i18]);
                                                        b2.s sVar10 = new b2.s(str32, true, rVarArr);
                                                        if (sVar6 == null) {
                                                            sVar2 = b(str32, rVarArr);
                                                            sVar = sVar10;
                                                            if (h11 == -1 && h12 == -1) {
                                                                str7 = str16;
                                                                i14 = i24;
                                                                iVar2 = iVar5;
                                                            } else {
                                                                if (h11 == -1) {
                                                                    h11 = 0;
                                                                }
                                                                long j48 = j19;
                                                                i iVar6 = new i(j47, kVar2, 0L, i24, j48, sVar, str16, hexString, h11, h12, false, false, true);
                                                                j19 = j48;
                                                                str7 = str16;
                                                                i14 = i24;
                                                                iVar2 = iVar6;
                                                            }
                                                            arrayList14 = arrayList27;
                                                            str18 = str32;
                                                            sVar6 = sVar2;
                                                            sVar7 = sVar;
                                                            i19 = i14;
                                                            str16 = str7;
                                                            mVar = mVar2;
                                                            hashMap4 = hashMap7;
                                                            linkedHashMap3 = linkedHashMap;
                                                            arrayList15 = arrayList;
                                                            str17 = str26;
                                                            arrayList13 = arrayList26;
                                                            str14 = str2;
                                                            i18 = 0;
                                                            qVar2 = qVar;
                                                        } else {
                                                            sVar = sVar10;
                                                        }
                                                    }
                                                    sVar2 = sVar6;
                                                    if (h11 == -1) {
                                                    }
                                                    if (h11 == -1) {
                                                    }
                                                    long j482 = j19;
                                                    i iVar62 = new i(j47, kVar2, 0L, i24, j482, sVar, str16, hexString, h11, h12, false, false, true);
                                                    j19 = j482;
                                                    str7 = str16;
                                                    i14 = i24;
                                                    iVar2 = iVar62;
                                                    arrayList14 = arrayList27;
                                                    str18 = str32;
                                                    sVar6 = sVar2;
                                                    sVar7 = sVar;
                                                    i19 = i14;
                                                    str16 = str7;
                                                    mVar = mVar2;
                                                    hashMap4 = hashMap7;
                                                    linkedHashMap3 = linkedHashMap;
                                                    arrayList15 = arrayList;
                                                    str17 = str26;
                                                    arrayList13 = arrayList26;
                                                    str14 = str2;
                                                    i18 = 0;
                                                    qVar2 = qVar;
                                                } else {
                                                    str = str16;
                                                    i10 = i24;
                                                    arrayList27 = arrayList27;
                                                    str5 = uri2;
                                                    iVar = iVar5;
                                                    str3 = str32;
                                                    treeMap = treeMap2;
                                                    i11 = i18;
                                                    j10 = j14;
                                                    i12 = i21;
                                                    j11 = j24;
                                                    str4 = str15;
                                                    hashMap2 = hashMap7;
                                                    linkedHashMap2 = linkedHashMap;
                                                    arrayList2 = arrayList26;
                                                }
                                            } else {
                                                str = str16;
                                                i10 = i24;
                                                b2.s sVar11 = sVar7;
                                                i iVar7 = iVar2;
                                                if (J2.startsWith("#EXT-X-PART")) {
                                                    String hexString2 = str == null ? null : str26 != null ? str26 : Long.toHexString(j21);
                                                    String j49 = j(J2, pattern2, hashMap3, dVar);
                                                    long parseDouble2 = (long) (Double.parseDouble(j(J2, N, Collections.EMPTY_MAP, dVar)) * 1000000.0d);
                                                    boolean f10 = f(J2, y0, dVar) | (z12 && arrayList26.isEmpty());
                                                    boolean f11 = f(J2, z0, dVar);
                                                    String i37 = i(J2, pattern, null, hashMap3, dVar);
                                                    if (i37 != null) {
                                                        String str34 = m0.a;
                                                        String[] split3 = i37.split("@", -1);
                                                        j13 = Long.parseLong(split3[0]);
                                                        str13 = uri2;
                                                        if (split3.length > 1) {
                                                            j25 = Long.parseLong(split3[1]);
                                                        }
                                                    } else {
                                                        str13 = uri2;
                                                        j13 = -1;
                                                    }
                                                    if (j13 == -1) {
                                                        j25 = 0;
                                                    }
                                                    if (sVar11 != null || treeMap2.isEmpty()) {
                                                        sVar4 = sVar11;
                                                    } else {
                                                        b2.r[] rVarArr2 = (b2.r[]) treeMap2.values().toArray(new b2.r[0]);
                                                        b2.s sVar12 = new b2.s(str32, true, rVarArr2);
                                                        if (sVar6 == null) {
                                                            sVar5 = b(str32, rVarArr2);
                                                            sVar4 = sVar12;
                                                            long j50 = j19;
                                                            arrayList26.add(new i(j49, kVar2, parseDouble2, i10, j50, sVar4, str, hexString2, j25, j13, f11, f10, false));
                                                            j19 = j50 + parseDouble2;
                                                            if (j13 != -1) {
                                                                j25 += j13;
                                                            }
                                                            arrayList14 = arrayList27;
                                                            str18 = str32;
                                                            sVar6 = sVar5;
                                                            arrayList13 = arrayList26;
                                                            sVar7 = sVar4;
                                                            i19 = i10;
                                                            str16 = str;
                                                            uri2 = str13;
                                                            mVar = mVar2;
                                                            hashMap4 = hashMap7;
                                                            linkedHashMap3 = linkedHashMap;
                                                            arrayList15 = arrayList;
                                                            str17 = str26;
                                                            str14 = str2;
                                                            i18 = 0;
                                                            qVar2 = qVar;
                                                            iVar2 = iVar7;
                                                        } else {
                                                            sVar4 = sVar12;
                                                        }
                                                    }
                                                    sVar5 = sVar6;
                                                    long j502 = j19;
                                                    arrayList26.add(new i(j49, kVar2, parseDouble2, i10, j502, sVar4, str, hexString2, j25, j13, f11, f10, false));
                                                    j19 = j502 + parseDouble2;
                                                    if (j13 != -1) {
                                                    }
                                                    arrayList14 = arrayList27;
                                                    str18 = str32;
                                                    sVar6 = sVar5;
                                                    arrayList13 = arrayList26;
                                                    sVar7 = sVar4;
                                                    i19 = i10;
                                                    str16 = str;
                                                    uri2 = str13;
                                                    mVar = mVar2;
                                                    hashMap4 = hashMap7;
                                                    linkedHashMap3 = linkedHashMap;
                                                    arrayList15 = arrayList;
                                                    str17 = str26;
                                                    str14 = str2;
                                                    i18 = 0;
                                                    qVar2 = qVar;
                                                    iVar2 = iVar7;
                                                } else {
                                                    str5 = uri2;
                                                    if (J2.startsWith("#EXT-X-DATERANGE")) {
                                                        if (i(J2, E0, str2, hashMap3, dVar).equals("com.apple.hls.interstitial")) {
                                                            String j51 = j(J2, D0, hashMap3, dVar);
                                                            String i38 = i(J2, K0, null, hashMap3, dVar);
                                                            Uri parse = i38 != null ? Uri.parse(i38) : null;
                                                            arrayList4 = arrayList26;
                                                            String i39 = i(J2, L0, null, hashMap3, dVar);
                                                            Uri parse2 = i39 != null ? Uri.parse(i39) : null;
                                                            sVar7 = sVar11;
                                                            String i40 = i(J2, F0, null, hashMap3, dVar);
                                                            long S2 = i40 != null ? m0.S(m0.V(i40)) : -9223372036854775807L;
                                                            String i41 = i(J2, H0, null, hashMap3, dVar);
                                                            long S3 = i41 != null ? m0.S(m0.V(i41)) : -9223372036854775807L;
                                                            ArrayList arrayList29 = new ArrayList();
                                                            str2 = str2;
                                                            String i42 = i(J2, G0, null, hashMap3, dVar);
                                                            if (i42 != null) {
                                                                String str35 = m0.a;
                                                                treeMap = treeMap2;
                                                                String[] split4 = i42.split(",", -1);
                                                                int length = split4.length;
                                                                int i43 = 0;
                                                                while (i43 < length) {
                                                                    int i44 = i43;
                                                                    String trim = split4[i43].trim();
                                                                    trim.getClass();
                                                                    switch (trim.hashCode()) {
                                                                        case 79491:
                                                                            i17 = length;
                                                                            if (trim.equals("PRE")) {
                                                                                c11 = 0;
                                                                                break;
                                                                            }
                                                                            c11 = 65535;
                                                                            break;
                                                                        case 2430593:
                                                                            i17 = length;
                                                                            if (trim.equals("ONCE")) {
                                                                                c11 = 1;
                                                                                break;
                                                                            }
                                                                            c11 = 65535;
                                                                            break;
                                                                        case 2461856:
                                                                            i17 = length;
                                                                            if (trim.equals("POST")) {
                                                                                c11 = 2;
                                                                                break;
                                                                            }
                                                                            c11 = 65535;
                                                                            break;
                                                                        default:
                                                                            i17 = length;
                                                                            c11 = 65535;
                                                                            break;
                                                                    }
                                                                    switch (c11) {
                                                                        case 0:
                                                                        case 1:
                                                                        case 2:
                                                                            arrayList29.add(trim);
                                                                            break;
                                                                    }
                                                                    i43 = i44 + 1;
                                                                    length = i17;
                                                                }
                                                            } else {
                                                                treeMap = treeMap2;
                                                            }
                                                            arrayList27 = arrayList27;
                                                            double g13 = g(J2, O, -1.0d, dVar);
                                                            long j52 = g13 >= 0.0d ? (long) (g13 * 1000000.0d) : -9223372036854775807L;
                                                            i iVar8 = iVar7;
                                                            double g14 = g(J2, I0, -1.0d, dVar);
                                                            long j53 = g14 >= 0.0d ? (long) (g14 * 1000000.0d) : -9223372036854775807L;
                                                            boolean f12 = f(J2, J0, dVar);
                                                            double g15 = g(J2, M0, Double.MIN_VALUE, dVar);
                                                            long j54 = g15 != Double.MIN_VALUE ? (long) (g15 * 1000000.0d) : -9223372036854775807L;
                                                            double g16 = g(J2, N0, -1.0d, dVar);
                                                            long j55 = g16 >= 0.0d ? (long) (g16 * 1000000.0d) : -9223372036854775807L;
                                                            ArrayList arrayList30 = new ArrayList();
                                                            String i45 = i(J2, O0, null, hashMap3, dVar);
                                                            if (i45 != null) {
                                                                String str36 = m0.a;
                                                                String[] split5 = i45.split(",", -1);
                                                                int length2 = split5.length;
                                                                str8 = str32;
                                                                int i46 = 0;
                                                                while (i46 < length2) {
                                                                    int i47 = i46;
                                                                    String trim2 = split5[i46].trim();
                                                                    trim2.getClass();
                                                                    String[] strArr = split5;
                                                                    if (trim2.equals("IN") || trim2.equals("OUT")) {
                                                                        arrayList30.add(trim2);
                                                                    }
                                                                    i46 = i47 + 1;
                                                                    split5 = strArr;
                                                                }
                                                            } else {
                                                                str8 = str32;
                                                            }
                                                            ArrayList arrayList31 = new ArrayList();
                                                            String i48 = i(J2, P0, null, hashMap3, dVar);
                                                            if (i48 != null) {
                                                                String str37 = m0.a;
                                                                String[] split6 = i48.split(",", -1);
                                                                int length3 = split6.length;
                                                                int i49 = 0;
                                                                while (i49 < length3) {
                                                                    String[] strArr2 = split6;
                                                                    String trim3 = split6[i49].trim();
                                                                    trim3.getClass();
                                                                    int i50 = length3;
                                                                    if (trim3.equals("JUMP") || trim3.equals("SKIP")) {
                                                                        arrayList31.add(trim3);
                                                                    }
                                                                    i49++;
                                                                    length3 = i50;
                                                                    split6 = strArr2;
                                                                }
                                                            }
                                                            Boolean valueOf = i(J2, Q0, null, hashMap3, dVar) != null ? Boolean.valueOf(!r4.equals("NO")) : null;
                                                            String i51 = i(J2, R0, null, hashMap3, dVar);
                                                            if (i51 != null) {
                                                                if (i51.equals("RANGE")) {
                                                                    str19 = "RANGE";
                                                                }
                                                                i16 = i(J2, S0, null, hashMap3, dVar);
                                                                if (i16 != null) {
                                                                    str10 = "PRIMARY";
                                                                    if (!i16.equals("PRIMARY")) {
                                                                        str10 = "HIGHLIGHT";
                                                                    }
                                                                    double g17 = g(J2, T0, -1.0d, dVar);
                                                                    long j56 = g17 >= 0.0d ? (long) (g17 * 1000000.0d) : -9223372036854775807L;
                                                                    str11 = str19;
                                                                    double g18 = g(J2, U0, -1.0d, dVar);
                                                                    long j57 = g18 >= 0.0d ? (long) (g18 * 1000000.0d) : -9223372036854775807L;
                                                                    String i52 = i(J2, V0, null, hashMap3, dVar);
                                                                    ArrayList arrayList32 = new ArrayList();
                                                                    String substring = J2.substring(17);
                                                                    a2 = o2.d.a(substring, X0, dVar);
                                                                    while (true) {
                                                                        str12 = str11;
                                                                        if (a2.find()) {
                                                                            String group2 = a2.group();
                                                                            group2.getClass();
                                                                            i iVar9 = iVar8;
                                                                            switch (group2.hashCode()) {
                                                                                case -2136701954:
                                                                                    if (group2.equals("X-SNAP=")) {
                                                                                        c10 = 0;
                                                                                        break;
                                                                                    }
                                                                                    c10 = 65535;
                                                                                    break;
                                                                                case -1843050726:
                                                                                    if (group2.equals("X-CONTENT-MAY-VARY=")) {
                                                                                        c10 = 1;
                                                                                        break;
                                                                                    }
                                                                                    c10 = 65535;
                                                                                    break;
                                                                                case -148960310:
                                                                                    if (group2.equals("X-PLAYOUT-LIMIT=")) {
                                                                                        c10 = 2;
                                                                                        break;
                                                                                    }
                                                                                    c10 = 65535;
                                                                                    break;
                                                                                case -36345757:
                                                                                    if (group2.equals("X-TIMELINE-STYLE=")) {
                                                                                        c10 = 3;
                                                                                        break;
                                                                                    }
                                                                                    c10 = 65535;
                                                                                    break;
                                                                                case 397239341:
                                                                                    if (group2.equals("X-ASSET-LIST=")) {
                                                                                        c10 = 4;
                                                                                        break;
                                                                                    }
                                                                                    c10 = 65535;
                                                                                    break;
                                                                                case 850193465:
                                                                                    if (group2.equals("X-TIMELINE-OCCUPIES=")) {
                                                                                        c10 = 5;
                                                                                        break;
                                                                                    }
                                                                                    c10 = 65535;
                                                                                    break;
                                                                                case 1065650400:
                                                                                    if (group2.equals("X-SKIP-CONTROL-DURATION=")) {
                                                                                        c10 = 6;
                                                                                        break;
                                                                                    }
                                                                                    c10 = 65535;
                                                                                    break;
                                                                                case 1274498945:
                                                                                    if (group2.equals("X-SKIP-CONTROL-OFFSET=")) {
                                                                                        c10 = 7;
                                                                                        break;
                                                                                    }
                                                                                    c10 = 65535;
                                                                                    break;
                                                                                case 1472528844:
                                                                                    if (group2.equals("X-RESTRICT=")) {
                                                                                        c10 = '\b';
                                                                                        break;
                                                                                    }
                                                                                    c10 = 65535;
                                                                                    break;
                                                                                case 1748487807:
                                                                                    if (group2.equals("X-RESUME-OFFSET=")) {
                                                                                        c10 = '\t';
                                                                                        break;
                                                                                    }
                                                                                    c10 = 65535;
                                                                                    break;
                                                                                case 1814205923:
                                                                                    if (group2.equals("X-ASSET-URI=")) {
                                                                                        c10 = '\n';
                                                                                        break;
                                                                                    }
                                                                                    c10 = 65535;
                                                                                    break;
                                                                                case 2080546752:
                                                                                    if (group2.equals("X-SKIP-CONTROL-LABEL-ID=")) {
                                                                                        c10 = 11;
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
                                                                                case 1:
                                                                                case 2:
                                                                                case 3:
                                                                                case 4:
                                                                                case 5:
                                                                                case 6:
                                                                                case 7:
                                                                                case '\b':
                                                                                case '\t':
                                                                                case '\n':
                                                                                case 11:
                                                                                    arrayList10 = arrayList29;
                                                                                    matcher = a2;
                                                                                    z10 = f12;
                                                                                    arrayList11 = arrayList12;
                                                                                    break;
                                                                                default:
                                                                                    matcher = a2;
                                                                                    String j58 = k3.j(1, 0, group2);
                                                                                    String u10 = r4.c.u(j58, "=");
                                                                                    int length4 = u10.length() + substring.indexOf(u10);
                                                                                    z10 = f12;
                                                                                    String substring2 = substring.substring(length4, (substring.length() == length4 + 1 ? 1 : 2) + length4);
                                                                                    if (substring2.startsWith("\"")) {
                                                                                        fVar = new f(0, j58, j(substring, Pattern.compile(j58 + "=\"((?:.|\f)+?)\""), hashMap3, dVar));
                                                                                        arrayList11 = arrayList12;
                                                                                        arrayList10 = arrayList29;
                                                                                    } else if (substring2.equals("0x") || substring2.equals("0X")) {
                                                                                        arrayList11 = arrayList12;
                                                                                        arrayList10 = arrayList29;
                                                                                        fVar = new f(1, j58, j(substring, Pattern.compile(j58 + "=(0[xX][A-F0-9]+)"), hashMap3, dVar));
                                                                                    } else {
                                                                                        arrayList11 = arrayList12;
                                                                                        arrayList10 = arrayList29;
                                                                                        fVar = new f(j58, Double.parseDouble(j(substring, Pattern.compile(j58 + "=([\\d\\.]+)\\b"), Collections.EMPTY_MAP, dVar)));
                                                                                    }
                                                                                    arrayList32.add(fVar);
                                                                                    break;
                                                                            }
                                                                            arrayList12 = arrayList11;
                                                                            str11 = str12;
                                                                            a2 = matcher;
                                                                            f12 = z10;
                                                                            arrayList29 = arrayList10;
                                                                            iVar8 = iVar9;
                                                                        } else {
                                                                            ArrayList arrayList33 = arrayList29;
                                                                            iVar = iVar8;
                                                                            boolean z19 = f12;
                                                                            linkedHashMap2 = linkedHashMap;
                                                                            ArrayList arrayList34 = arrayList12;
                                                                            g gVar2 = linkedHashMap2.containsKey(j51) ? (g) linkedHashMap2.get(j51) : new g(j51);
                                                                            if (parse == null) {
                                                                                gVar2.getClass();
                                                                            } else {
                                                                                Uri uri6 = gVar2.c;
                                                                                if (uri6 != null) {
                                                                                    u6.i(uri6.equals(parse), "Can't change assetUri from %s to %s", gVar2.c, parse);
                                                                                }
                                                                                gVar2.c = parse;
                                                                            }
                                                                            if (parse2 != null) {
                                                                                Uri uri7 = gVar2.d;
                                                                                if (uri7 != null) {
                                                                                    u6.i(uri7.equals(parse2), "Can't change assetListUri from %s to %s", gVar2.d, parse2);
                                                                                }
                                                                                gVar2.d = parse2;
                                                                            }
                                                                            if (S2 != -9223372036854775807L) {
                                                                                long j59 = gVar2.e;
                                                                                if (j59 != -9223372036854775807L) {
                                                                                    u6.e("Can't change startDateUnixUs from %s to %s", j59, S2, j59 == S2);
                                                                                }
                                                                                gVar2.e = S2;
                                                                            }
                                                                            if (S3 != -9223372036854775807L) {
                                                                                long j60 = gVar2.f;
                                                                                if (j60 != -9223372036854775807L) {
                                                                                    u6.e("Can't change endDateUnixUs from %s to %s", j60, S3, j60 == S3);
                                                                                }
                                                                                gVar2.f = S3;
                                                                            }
                                                                            if (j52 != -9223372036854775807L) {
                                                                                long j61 = gVar2.g;
                                                                                if (j61 != -9223372036854775807L) {
                                                                                    u6.e("Can't change durationUs from %s to %s", j61, j52, j61 == j52);
                                                                                }
                                                                                gVar2.g = j52;
                                                                            }
                                                                            if (j53 != -9223372036854775807L) {
                                                                                long j62 = gVar2.h;
                                                                                if (j62 != -9223372036854775807L) {
                                                                                    u6.e("Can't change plannedDurationUs from %s to %s", j62, j53, j62 == j53);
                                                                                }
                                                                                gVar2.h = j53;
                                                                            }
                                                                            if (arrayList33.isEmpty()) {
                                                                                arrayList5 = arrayList34;
                                                                            } else {
                                                                                if (gVar2.i.isEmpty()) {
                                                                                    arrayList5 = arrayList34;
                                                                                    arrayList6 = arrayList33;
                                                                                } else {
                                                                                    arrayList6 = arrayList33;
                                                                                    boolean equals = gVar2.i.equals(arrayList6);
                                                                                    StringBuilder sb2 = new StringBuilder("Can't change cue from ");
                                                                                    ArrayList arrayList35 = gVar2.i;
                                                                                    StringBuilder sb3 = new StringBuilder();
                                                                                    Iterator it3 = arrayList35.iterator();
                                                                                    if (it3.hasNext()) {
                                                                                        arrayList5 = arrayList34;
                                                                                        Object next = it3.next();
                                                                                        while (true) {
                                                                                            sb3.append((CharSequence) next);
                                                                                            if (it3.hasNext()) {
                                                                                                sb3.append((CharSequence) ", ");
                                                                                                next = it3.next();
                                                                                            }
                                                                                        }
                                                                                    } else {
                                                                                        arrayList5 = arrayList34;
                                                                                    }
                                                                                    sb2.append(sb3.toString());
                                                                                    sb2.append(" to ");
                                                                                    StringBuilder sb4 = new StringBuilder();
                                                                                    Iterator it4 = arrayList6.iterator();
                                                                                    if (it4.hasNext()) {
                                                                                        Object next2 = it4.next();
                                                                                        while (true) {
                                                                                            sb4.append((CharSequence) next2);
                                                                                            if (it4.hasNext()) {
                                                                                                sb4.append((CharSequence) ", ");
                                                                                                next2 = it4.next();
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    sb2.append(sb4.toString());
                                                                                    u6.f(sb2.toString(), equals);
                                                                                }
                                                                                gVar2.i = arrayList6;
                                                                            }
                                                                            if (z19) {
                                                                                gVar2.j = true;
                                                                            }
                                                                            if (j54 != -9223372036854775807L) {
                                                                                long j63 = gVar2.k;
                                                                                if (j63 != -9223372036854775807L) {
                                                                                    u6.e("Can't change resumeOffsetUs from %s to %s", j63, j54, j63 == j54);
                                                                                }
                                                                                gVar2.k = j54;
                                                                            }
                                                                            if (j55 != -9223372036854775807L) {
                                                                                long j64 = gVar2.l;
                                                                                if (j64 != -9223372036854775807L) {
                                                                                    u6.e("Can't change playoutLimitUs from %s to %s", j64, j55, j64 == j55);
                                                                                }
                                                                                gVar2.l = j55;
                                                                            }
                                                                            if (!arrayList30.isEmpty()) {
                                                                                if (gVar2.m.isEmpty()) {
                                                                                    arrayList9 = arrayList30;
                                                                                } else {
                                                                                    arrayList9 = arrayList30;
                                                                                    boolean equals2 = gVar2.m.equals(arrayList9);
                                                                                    StringBuilder sb5 = new StringBuilder("Can't change snapTypes from ");
                                                                                    ArrayList arrayList36 = gVar2.m;
                                                                                    StringBuilder sb6 = new StringBuilder();
                                                                                    Iterator it5 = arrayList36.iterator();
                                                                                    if (it5.hasNext()) {
                                                                                        Object next3 = it5.next();
                                                                                        while (true) {
                                                                                            sb6.append((CharSequence) next3);
                                                                                            if (it5.hasNext()) {
                                                                                                sb6.append((CharSequence) ", ");
                                                                                                next3 = it5.next();
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    sb5.append(sb6.toString());
                                                                                    sb5.append(" to ");
                                                                                    StringBuilder sb7 = new StringBuilder();
                                                                                    Iterator it6 = arrayList9.iterator();
                                                                                    if (it6.hasNext()) {
                                                                                        Object next4 = it6.next();
                                                                                        while (true) {
                                                                                            sb7.append((CharSequence) next4);
                                                                                            if (it6.hasNext()) {
                                                                                                sb7.append((CharSequence) ", ");
                                                                                                next4 = it6.next();
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    sb5.append(sb7.toString());
                                                                                    u6.f(sb5.toString(), equals2);
                                                                                }
                                                                                gVar2.m = arrayList9;
                                                                            }
                                                                            gVar2.getClass();
                                                                            if (!arrayList31.isEmpty()) {
                                                                                if (gVar2.n.isEmpty()) {
                                                                                    arrayList8 = arrayList31;
                                                                                } else {
                                                                                    arrayList8 = arrayList31;
                                                                                    boolean equals3 = gVar2.n.equals(arrayList8);
                                                                                    StringBuilder sb8 = new StringBuilder("Can't change restrictions from ");
                                                                                    ArrayList arrayList37 = gVar2.n;
                                                                                    StringBuilder sb9 = new StringBuilder();
                                                                                    Iterator it7 = arrayList37.iterator();
                                                                                    if (it7.hasNext()) {
                                                                                        Object next5 = it7.next();
                                                                                        while (true) {
                                                                                            sb9.append((CharSequence) next5);
                                                                                            if (it7.hasNext()) {
                                                                                                sb9.append((CharSequence) ", ");
                                                                                                next5 = it7.next();
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    sb8.append(sb9.toString());
                                                                                    sb8.append(" to ");
                                                                                    StringBuilder sb10 = new StringBuilder();
                                                                                    Iterator it8 = arrayList8.iterator();
                                                                                    if (it8.hasNext()) {
                                                                                        while (true) {
                                                                                            sb10.append((CharSequence) it8.next());
                                                                                            if (it8.hasNext()) {
                                                                                                sb10.append((CharSequence) ", ");
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    sb8.append(sb10.toString());
                                                                                    u6.f(sb8.toString(), equals3);
                                                                                }
                                                                                gVar2.n = arrayList8;
                                                                            }
                                                                            HashMap hashMap8 = gVar2.b;
                                                                            if (!arrayList32.isEmpty()) {
                                                                                int i53 = 0;
                                                                                while (i53 < arrayList32.size()) {
                                                                                    f fVar2 = (f) arrayList32.get(i53);
                                                                                    String str38 = fVar2.a;
                                                                                    f fVar3 = (f) hashMap8.get(str38);
                                                                                    if (fVar3 != null) {
                                                                                        boolean equals4 = fVar3.equals(fVar2);
                                                                                        arrayList7 = arrayList32;
                                                                                        Object[] objArr = {str38, fVar3.d, Double.valueOf(fVar3.c), fVar2.d, Double.valueOf(fVar2.c)};
                                                                                        if (!equals4) {
                                                                                            throw new IllegalArgumentException(v6.a("Can't change %s from %s %s to %s %s", objArr));
                                                                                        }
                                                                                    } else {
                                                                                        arrayList7 = arrayList32;
                                                                                    }
                                                                                    hashMap8.put(str38, fVar2);
                                                                                    i53++;
                                                                                    arrayList32 = arrayList7;
                                                                                }
                                                                            }
                                                                            if (valueOf != null) {
                                                                                Boolean bool2 = gVar2.o;
                                                                                if (bool2 != null) {
                                                                                    u6.i(bool2.equals(valueOf), "Can't change contentMayVary from %s to %s", gVar2.o, valueOf);
                                                                                }
                                                                                gVar2.o = valueOf;
                                                                            }
                                                                            if (str12 != null) {
                                                                                String str39 = gVar2.p;
                                                                                if (str39 != null) {
                                                                                    u6.i(str39.equals(str12), "Can't change timelineOccupies from %s to %s", gVar2.p, str12);
                                                                                }
                                                                                gVar2.p = str12;
                                                                            }
                                                                            if (str10 != null) {
                                                                                String str40 = gVar2.q;
                                                                                if (str40 != null) {
                                                                                    u6.i(str40.equals(str10), "Can't change timelineStyle from %s to %s", gVar2.q, str10);
                                                                                }
                                                                                gVar2.q = str10;
                                                                            }
                                                                            if (j56 != -9223372036854775807L) {
                                                                                long j65 = gVar2.r;
                                                                                if (j65 != -9223372036854775807L) {
                                                                                    u6.e("Can't change skipControlOffsetUs from %s to %s", j65, j56, j65 == j56);
                                                                                }
                                                                                gVar2.r = j56;
                                                                            }
                                                                            if (j57 != -9223372036854775807L) {
                                                                                long j66 = gVar2.s;
                                                                                if (j66 != -9223372036854775807L) {
                                                                                    u6.e("Can't change skipControlDurationUs from %s to %s", j66, j57, j66 == j57);
                                                                                }
                                                                                gVar2.s = j57;
                                                                            }
                                                                            if (i52 != null) {
                                                                                String str41 = gVar2.t;
                                                                                if (str41 != null) {
                                                                                    u6.i(str41.equals(i52), "Can't change skipControlLabelId from %s to %s", gVar2.t, i52);
                                                                                }
                                                                                gVar2.t = i52;
                                                                            }
                                                                            linkedHashMap2.put(j51, gVar2);
                                                                            str3 = str8;
                                                                            j10 = j14;
                                                                            i12 = i21;
                                                                            j11 = j24;
                                                                            str4 = str15;
                                                                            hashMap2 = hashMap7;
                                                                            arrayList3 = arrayList5;
                                                                            arrayList2 = arrayList4;
                                                                            i11 = 0;
                                                                            qVar2 = qVar;
                                                                            linkedHashMap3 = linkedHashMap2;
                                                                            arrayList13 = arrayList2;
                                                                            i18 = i11;
                                                                            arrayList12 = arrayList3;
                                                                            str15 = str4;
                                                                            j24 = j11;
                                                                            i19 = i10;
                                                                            str16 = str;
                                                                            i21 = i12;
                                                                            uri2 = str5;
                                                                            treeMap2 = treeMap;
                                                                            mVar = mVar2;
                                                                            str17 = str26;
                                                                            arrayList14 = arrayList27;
                                                                            iVar2 = iVar;
                                                                            nVar2 = nVar;
                                                                            hashMap4 = hashMap2;
                                                                            str18 = str3;
                                                                            j14 = j10;
                                                                            arrayList15 = arrayList;
                                                                            str14 = str2;
                                                                        }
                                                                    }
                                                                }
                                                                str10 = null;
                                                                double g172 = g(J2, T0, -1.0d, dVar);
                                                                if (g172 >= 0.0d) {
                                                                }
                                                                str11 = str19;
                                                                double g182 = g(J2, U0, -1.0d, dVar);
                                                                if (g182 >= 0.0d) {
                                                                }
                                                                String i522 = i(J2, V0, null, hashMap3, dVar);
                                                                ArrayList arrayList322 = new ArrayList();
                                                                String substring3 = J2.substring(17);
                                                                a2 = o2.d.a(substring3, X0, dVar);
                                                                while (true) {
                                                                    str12 = str11;
                                                                    if (a2.find()) {
                                                                    }
                                                                    arrayList12 = arrayList11;
                                                                    str11 = str12;
                                                                    a2 = matcher;
                                                                    f12 = z10;
                                                                    arrayList29 = arrayList10;
                                                                    iVar8 = iVar9;
                                                                }
                                                            }
                                                            str19 = null;
                                                            i16 = i(J2, S0, null, hashMap3, dVar);
                                                            if (i16 != null) {
                                                            }
                                                            str10 = null;
                                                            double g1722 = g(J2, T0, -1.0d, dVar);
                                                            if (g1722 >= 0.0d) {
                                                            }
                                                            str11 = str19;
                                                            double g1822 = g(J2, U0, -1.0d, dVar);
                                                            if (g1822 >= 0.0d) {
                                                            }
                                                            String i5222 = i(J2, V0, null, hashMap3, dVar);
                                                            ArrayList arrayList3222 = new ArrayList();
                                                            String substring32 = J2.substring(17);
                                                            a2 = o2.d.a(substring32, X0, dVar);
                                                            while (true) {
                                                                str12 = str11;
                                                                if (a2.find()) {
                                                                }
                                                                arrayList12 = arrayList11;
                                                                str11 = str12;
                                                                a2 = matcher;
                                                                f12 = z10;
                                                                arrayList29 = arrayList10;
                                                                iVar8 = iVar9;
                                                            }
                                                        } else {
                                                            str2 = str2;
                                                        }
                                                    }
                                                    arrayList27 = arrayList27;
                                                    iVar = iVar7;
                                                    str8 = str32;
                                                    arrayList4 = arrayList26;
                                                    sVar7 = sVar11;
                                                    treeMap = treeMap2;
                                                    linkedHashMap2 = linkedHashMap;
                                                    arrayList5 = arrayList12;
                                                    if (J2.startsWith("#")) {
                                                        str3 = str8;
                                                        j10 = j14;
                                                        i12 = i21;
                                                        j11 = j24;
                                                        str4 = str15;
                                                        hashMap2 = hashMap7;
                                                        arrayList3 = arrayList5;
                                                        arrayList2 = arrayList4;
                                                        i11 = 0;
                                                        qVar2 = qVar;
                                                        linkedHashMap3 = linkedHashMap2;
                                                        arrayList13 = arrayList2;
                                                        i18 = i11;
                                                        arrayList12 = arrayList3;
                                                        str15 = str4;
                                                        j24 = j11;
                                                        i19 = i10;
                                                        str16 = str;
                                                        i21 = i12;
                                                        uri2 = str5;
                                                        treeMap2 = treeMap;
                                                        mVar = mVar2;
                                                        str17 = str26;
                                                        arrayList14 = arrayList27;
                                                        iVar2 = iVar;
                                                        nVar2 = nVar;
                                                        hashMap4 = hashMap2;
                                                        str18 = str3;
                                                        j14 = j10;
                                                        arrayList15 = arrayList;
                                                        str14 = str2;
                                                    } else {
                                                        String hexString3 = str == null ? null : str26 != null ? str26 : Long.toHexString(j21);
                                                        long j67 = j21 + 1;
                                                        String k10 = k(J2, hashMap3, dVar);
                                                        k kVar6 = (k) hashMap7.get(k10);
                                                        if (j14 == -1) {
                                                            j12 = 0;
                                                        } else {
                                                            if (z16 && kVar2 == null && kVar6 == null) {
                                                                kVar6 = new k(k10, 0L, j22, null, null);
                                                                hashMap7.put(k10, kVar6);
                                                            }
                                                            j12 = j22;
                                                        }
                                                        if (sVar7 != null || treeMap.isEmpty()) {
                                                            str9 = str8;
                                                            i15 = 0;
                                                            sVar3 = sVar7;
                                                        } else {
                                                            i15 = 0;
                                                            b2.r[] rVarArr3 = (b2.r[]) treeMap.values().toArray(new b2.r[0]);
                                                            str9 = str8;
                                                            b2.s sVar13 = new b2.s(str9, true, rVarArr3);
                                                            if (sVar6 == null) {
                                                                sVar6 = b(str9, rVarArr3);
                                                            }
                                                            sVar3 = sVar13;
                                                        }
                                                        String str42 = hexString3;
                                                        long j68 = j14;
                                                        long j69 = j23;
                                                        long j70 = j24;
                                                        arrayList5.add(new k(k10, kVar2 != null ? kVar2 : kVar6, str15, j70, i10, j69, sVar3, str, str42, j12, j68, i21, arrayList4));
                                                        long j71 = j69 + j70;
                                                        ArrayList arrayList38 = new ArrayList();
                                                        if (j14 != -1) {
                                                            j12 += j68;
                                                        }
                                                        j22 = j12;
                                                        linkedHashMap3 = linkedHashMap2;
                                                        j21 = j67;
                                                        hashMap4 = hashMap7;
                                                        j23 = j71;
                                                        i18 = i15;
                                                        i21 = i18;
                                                        i19 = i10;
                                                        sVar7 = sVar3;
                                                        str16 = str;
                                                        uri2 = str5;
                                                        j14 = -1;
                                                        j24 = 0;
                                                        mVar = mVar2;
                                                        str17 = str26;
                                                        arrayList14 = arrayList27;
                                                        iVar2 = iVar;
                                                        str14 = str2;
                                                        str15 = str14;
                                                        nVar2 = nVar;
                                                        arrayList13 = arrayList38;
                                                        j19 = j23;
                                                        arrayList12 = arrayList5;
                                                        treeMap2 = treeMap;
                                                        qVar2 = qVar;
                                                        str18 = str9;
                                                        arrayList15 = arrayList;
                                                    }
                                                }
                                            }
                                            str = str16;
                                            i10 = i24;
                                            str3 = str32;
                                            treeMap = treeMap2;
                                            i11 = i18;
                                            j10 = j14;
                                            i12 = i21;
                                            iVar = iVar2;
                                            j11 = j24;
                                            str4 = str15;
                                            hashMap2 = hashMap7;
                                            linkedHashMap2 = linkedHashMap;
                                            arrayList2 = arrayList26;
                                            str5 = uri2;
                                        }
                                        qVar2 = qVar;
                                        str18 = str32;
                                        i19 = i24;
                                        mVar = mVar2;
                                        hashMap4 = hashMap7;
                                        linkedHashMap3 = linkedHashMap;
                                        arrayList15 = arrayList;
                                        str17 = str26;
                                    }
                                    arrayList14 = arrayList27;
                                    arrayList13 = arrayList26;
                                    str14 = str2;
                                }
                                arrayList3 = arrayList12;
                                qVar2 = qVar;
                                linkedHashMap3 = linkedHashMap2;
                                arrayList13 = arrayList2;
                                i18 = i11;
                                arrayList12 = arrayList3;
                                str15 = str4;
                                j24 = j11;
                                i19 = i10;
                                str16 = str;
                                i21 = i12;
                                uri2 = str5;
                                treeMap2 = treeMap;
                                mVar = mVar2;
                                str17 = str26;
                                arrayList14 = arrayList27;
                                iVar2 = iVar;
                                nVar2 = nVar;
                                hashMap4 = hashMap2;
                                str18 = str3;
                                j14 = j10;
                                arrayList15 = arrayList;
                                str14 = str2;
                            }
                            i19 = i24;
                            mVar = mVar2;
                            hashMap4 = hashMap7;
                            linkedHashMap3 = linkedHashMap;
                            arrayList15 = arrayList;
                            str17 = str26;
                            arrayList14 = arrayList27;
                            arrayList13 = arrayList26;
                        }
                    }
                }
                i19 = i24;
                mVar = mVar2;
                linkedHashMap3 = linkedHashMap;
                arrayList15 = arrayList;
            }
            hashMap4 = hashMap7;
        }
        throw new s();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Can't wrap try/catch for region: R(30:43|(1:45)(1:142)|46|47|(1:49)(1:141)|50|(2:52|(22:54|55|(7:72|(1:74)|75|(1:77)(5:122|(3:124|(1:132)(4:126|(1:128)|129|130)|131)|133|134|(3:136|(1:80)(1:121)|81))|78|(0)(0)|81)(1:137)|82|(3:84|(1:119)(1:87)|88)(1:120)|89|(1:91)(1:118)|92|93|(1:95)(2:112|(1:114)(3:115|116|117))|96|97|98|99|100|101|102|103|(1:105)|106|107|15)(1:138))(1:140)|139|55|(26:72|(0)|75|(0)(0)|78|(0)(0)|81|82|(0)(0)|89|(0)(0)|92|93|(0)(0)|96|97|98|99|100|101|102|103|(0)|106|107|15)|137|82|(0)(0)|89|(0)(0)|92|93|(0)(0)|96|97|98|99|100|101|102|103|(0)|106|107|15) */
    /* JADX WARN: Failed to find 'out' block for switch in B:177:0x055f. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02fa  */
    /* JADX WARN: Type inference failed for: r29v1 */
    /* JADX WARN: Type inference failed for: r29v11 */
    /* JADX WARN: Type inference failed for: r29v3 */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static q e(g3 g3Var, Uri uri, o2.d dVar) {
        int i10;
        char c10;
        ArrayList arrayList;
        p pVar;
        String str;
        ArrayList arrayList2;
        int parseInt;
        String str2;
        p pVar2;
        String str3;
        p pVar3;
        HashMap hashMap;
        HashSet hashSet;
        boolean z10;
        int i11;
        ArrayList arrayList3;
        int i12;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        HashMap hashMap2;
        int i13;
        String str4;
        String str5;
        String w9;
        b2.n nVar;
        String i14;
        String str6;
        int i15;
        int i16;
        Uri g10;
        ArrayList arrayList7;
        HashMap hashMap3;
        ArrayList arrayList8;
        int i17;
        String[] d02;
        b2.n nVar2;
        String sb2;
        String uri2 = uri.toString();
        HashMap hashMap4 = new HashMap();
        HashMap hashMap5 = new HashMap();
        ArrayList arrayList9 = new ArrayList();
        ArrayList arrayList10 = new ArrayList();
        ArrayList arrayList11 = new ArrayList();
        ArrayList arrayList12 = new ArrayList();
        ArrayList arrayList13 = new ArrayList();
        ArrayList arrayList14 = new ArrayList();
        ArrayList arrayList15 = new ArrayList();
        ArrayList arrayList16 = new ArrayList();
        boolean z11 = false;
        boolean z12 = false;
        while (true) {
            boolean H2 = g3Var.H();
            Pattern pattern = l0;
            ArrayList arrayList17 = arrayList13;
            boolean z13 = z11;
            Pattern pattern2 = q0;
            boolean z14 = z12;
            if (!H2) {
                ArrayList arrayList18 = arrayList14;
                ArrayList arrayList19 = arrayList16;
                ArrayList arrayList20 = arrayList10;
                ArrayList arrayList21 = arrayList11;
                ArrayList arrayList22 = arrayList12;
                ArrayList arrayList23 = arrayList15;
                HashMap hashMap6 = hashMap4;
                ArrayList arrayList24 = arrayList9;
                ArrayList arrayList25 = new ArrayList();
                HashSet hashSet2 = new HashSet();
                int i18 = 0;
                while (i18 < arrayList24.size()) {
                    p pVar4 = (p) arrayList24.get(i18);
                    Uri uri3 = pVar4.a;
                    b2.w wVar = pVar4.b;
                    if (hashSet2.add(uri3)) {
                        u6.p(wVar.l == null);
                        ArrayList arrayList26 = (ArrayList) hashMap6.get(pVar4.a);
                        arrayList26.getClass();
                        hashMap = hashMap6;
                        hashSet = hashSet2;
                        t0 t0Var = new t0(new o2.s(null, null, arrayList26));
                        b2.v a2 = wVar.a();
                        a2.k = t0Var;
                        arrayList25.add(new p(pVar4.a, new b2.w(a2), pVar4.c, pVar4.d, pVar4.e, pVar4.f, pVar4.g, pVar4.h));
                    } else {
                        hashMap = hashMap6;
                        hashSet = hashSet2;
                    }
                    i18++;
                    hashSet2 = hashSet;
                    hashMap6 = hashMap;
                }
                int i19 = 0;
                ArrayList arrayList27 = null;
                b2.w wVar2 = null;
                while (i19 < arrayList18.size()) {
                    ArrayList arrayList28 = arrayList18;
                    String str7 = (String) arrayList28.get(i19);
                    String j10 = j(str7, s0, hashMap5, dVar);
                    String j11 = j(str7, pattern2, hashMap5, dVar);
                    ArrayList arrayList29 = arrayList25;
                    ArrayList arrayList30 = arrayList27;
                    String i20 = i(str7, L, null, hashMap5, dVar);
                    b2.v vVar = new b2.v();
                    b2.w wVar3 = wVar2;
                    vVar.a = a1.g.C(j10, ":", j11);
                    vVar.b = j11;
                    vVar.q = v0.n("application/x-mpegURL");
                    boolean f7 = f(str7, w0, dVar);
                    ?? r29 = f7;
                    if (f(str7, x0, dVar)) {
                        r29 = (f7 ? 1 : 0) | 2;
                    }
                    vVar.e = f(str7, v0, dVar) ? r29 | 4 : r29;
                    int i21 = i19;
                    String i22 = i(str7, t0, null, hashMap5, dVar);
                    if (TextUtils.isEmpty(i22)) {
                        arrayList18 = arrayList28;
                        i10 = 0;
                    } else {
                        String str8 = m0.a;
                        String[] split = i22.split(",", -1);
                        i10 = m0.l(split, "public.accessibility.describes-video") ? 512 : 0;
                        arrayList18 = arrayList28;
                        if (m0.l(split, "public.accessibility.transcribes-spoken-dialog")) {
                            i10 |= 4096;
                        }
                        if (m0.l(split, "public.accessibility.describes-music-and-sound")) {
                            i10 |= 1024;
                        }
                        if (m0.l(split, "public.easy-to-read")) {
                            i10 |= 8192;
                        }
                    }
                    vVar.f = i10;
                    vVar.d = i(str7, p0, null, hashMap5, dVar);
                    String i23 = i(str7, pattern, null, hashMap5, dVar);
                    Uri g11 = i23 == null ? null : e2.e.g(uri2, i23);
                    String str9 = uri2;
                    Pattern pattern3 = pattern;
                    t0 t0Var2 = new t0(new o2.s(j10, j11, Collections.EMPTY_LIST));
                    String j12 = j(str7, n0, hashMap5, dVar);
                    switch (j12.hashCode()) {
                        case -959297733:
                            if (j12.equals("SUBTITLES")) {
                                c10 = 0;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case -333210994:
                            if (j12.equals("CLOSED-CAPTIONS")) {
                                c10 = 1;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 62628790:
                            if (j12.equals("AUDIO")) {
                                c10 = 2;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 81665115:
                            if (j12.equals("VIDEO")) {
                                c10 = 3;
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
                            arrayList = arrayList20;
                            int i24 = 0;
                            while (true) {
                                if (i24 < arrayList24.size()) {
                                    pVar = (p) arrayList24.get(i24);
                                    if (!j10.equals(pVar.e)) {
                                        i24++;
                                    }
                                } else {
                                    pVar = null;
                                }
                            }
                            if (pVar != null) {
                                String w10 = m0.w(3, pVar.b.k);
                                vVar.j = w10;
                                str = v0.d(w10);
                            } else {
                                str = null;
                            }
                            if (str == null) {
                                str = "text/vtt";
                            }
                            vVar.r = v0.n(str);
                            vVar.k = t0Var2;
                            if (g11 != null) {
                                arrayList2 = arrayList22;
                                arrayList2.add(new o(g11, new b2.w(vVar), j11, i20));
                            } else {
                                arrayList2 = arrayList22;
                                e2.a.l("HlsPlaylistParser", "EXT-X-MEDIA tag with missing mandatory URI attribute: skipping");
                            }
                            arrayList27 = arrayList30;
                            wVar2 = wVar3;
                            break;
                        case 1:
                            ArrayList arrayList31 = arrayList21;
                            arrayList = arrayList20;
                            String j13 = j(str7, u0, hashMap5, dVar);
                            if (j13.startsWith("CC")) {
                                parseInt = Integer.parseInt(j13.substring(2));
                                str2 = "application/cea-608";
                            } else {
                                parseInt = Integer.parseInt(j13.substring(7));
                                str2 = "application/cea-708";
                            }
                            ArrayList arrayList32 = arrayList30 == null ? new ArrayList() : arrayList30;
                            vVar.r = v0.n(str2);
                            vVar.O = parseInt;
                            arrayList32.add(new b2.w(vVar));
                            arrayList21 = arrayList31;
                            arrayList27 = arrayList32;
                            arrayList2 = arrayList22;
                            wVar2 = wVar3;
                            break;
                        case 2:
                            arrayList = arrayList20;
                            int i25 = 0;
                            while (true) {
                                if (i25 < arrayList24.size()) {
                                    pVar2 = (p) arrayList24.get(i25);
                                    int i26 = i25;
                                    if (!j10.equals(pVar2.d)) {
                                        i25 = i26 + 1;
                                    }
                                } else {
                                    pVar2 = null;
                                }
                            }
                            if (pVar2 != null) {
                                String w11 = m0.w(1, pVar2.b.k);
                                vVar.j = w11;
                                str3 = v0.d(w11);
                            } else {
                                str3 = null;
                            }
                            p pVar5 = pVar2;
                            String i27 = i(str7, r, null, hashMap5, dVar);
                            if (i27 != null) {
                                String str10 = m0.a;
                                vVar.J = Integer.parseInt(i27.split("/", 2)[0]);
                                if ("audio/eac3".equals(str3) && i27.endsWith("/JOC")) {
                                    vVar.j = "ec+3";
                                    str3 = "audio/eac3-joc";
                                }
                            }
                            vVar.r = v0.n(str3);
                            if (g11 != null) {
                                vVar.k = t0Var2;
                                arrayList21.add(new o(g11, new b2.w(vVar), j11, i20));
                            } else {
                                ArrayList arrayList33 = arrayList21;
                                if (pVar5 != null) {
                                    wVar2 = new b2.w(vVar);
                                    arrayList21 = arrayList33;
                                    arrayList2 = arrayList22;
                                    arrayList27 = arrayList30;
                                    break;
                                } else {
                                    arrayList21 = arrayList33;
                                }
                            }
                            arrayList2 = arrayList22;
                            arrayList27 = arrayList30;
                            wVar2 = wVar3;
                            break;
                        case 3:
                            int i28 = 0;
                            while (true) {
                                if (i28 < arrayList24.size()) {
                                    pVar3 = (p) arrayList24.get(i28);
                                    if (!j10.equals(pVar3.c)) {
                                        i28++;
                                    }
                                } else {
                                    pVar3 = null;
                                }
                            }
                            if (pVar3 != null) {
                                b2.w wVar4 = pVar3.b;
                                String w12 = m0.w(2, wVar4.k);
                                vVar.j = w12;
                                vVar.r = v0.n(v0.d(w12));
                                vVar.y = wVar4.z;
                                vVar.z = wVar4.A;
                                vVar.C = wVar4.D;
                            }
                            if (g11 != null) {
                                vVar.k = t0Var2;
                                arrayList = arrayList20;
                                arrayList.add(new o(g11, new b2.w(vVar), j11, i20));
                                arrayList2 = arrayList22;
                                arrayList27 = arrayList30;
                                wVar2 = wVar3;
                                break;
                            }
                        default:
                            arrayList2 = arrayList22;
                            arrayList = arrayList20;
                            arrayList27 = arrayList30;
                            wVar2 = wVar3;
                            break;
                    }
                    i19 = i21 + 1;
                    arrayList25 = arrayList29;
                    arrayList20 = arrayList;
                    arrayList22 = arrayList2;
                    uri2 = str9;
                    pattern = pattern3;
                }
                return new q(uri.toString(), arrayList19, arrayList25, arrayList20, arrayList21, arrayList22, arrayList17, wVar2, z13 ? Collections.EMPTY_LIST : arrayList27, z14, hashMap5, arrayList23);
            }
            String J2 = g3Var.J();
            ArrayList arrayList34 = arrayList12;
            if (J2.startsWith("#EXT")) {
                arrayList16.add(J2);
            }
            boolean startsWith = J2.startsWith("#EXT-X-I-FRAME-STREAM-INF");
            ArrayList arrayList35 = arrayList16;
            if (J2.startsWith("#EXT-X-DEFINE")) {
                String i29 = i(J2, pattern2, null, hashMap5, dVar);
                if (i29 != null) {
                    l(i29, hashMap5);
                    hashMap5.put(i29, j(J2, B0, hashMap5, dVar));
                } else {
                    String j14 = j(J2, r0, hashMap5, dVar);
                    l(j14, hashMap5);
                    String queryParameter = uri.getQueryParameter(j14);
                    if (queryParameter == null) {
                        throw w0.b("QUERYPARAM \"" + j14 + "\" not found in playlist URI", null);
                    }
                    hashMap5.put(j14, queryParameter);
                }
            } else if (J2.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                arrayList6 = arrayList14;
                arrayList5 = arrayList10;
                arrayList4 = arrayList11;
                arrayList3 = arrayList15;
                z11 = z13;
                z12 = true;
                hashMap3 = hashMap4;
                arrayList7 = arrayList9;
                arrayList9 = arrayList7;
                hashMap4 = hashMap3;
                arrayList13 = arrayList17;
                arrayList12 = arrayList34;
                arrayList16 = arrayList35;
                arrayList15 = arrayList3;
                arrayList11 = arrayList4;
                arrayList10 = arrayList5;
                arrayList14 = arrayList6;
            } else if (J2.startsWith("#EXT-X-MEDIA")) {
                arrayList14.add(J2);
            } else if (J2.startsWith("#EXT-X-SESSION-KEY")) {
                b2.r c11 = c(J2, i(J2, j0, "identity", hashMap5, dVar), hashMap5, dVar);
                if (c11 != null) {
                    String j15 = j(J2, i0, hashMap5, dVar);
                    arrayList15.add(new b2.s(("SAMPLE-AES-CENC".equals(j15) || "SAMPLE-AES-CTR".equals(j15)) ? "cenc" : "cbcs", true, c11));
                }
            } else if (J2.startsWith("#EXT-X-STREAM-INF") || startsWith) {
                boolean contains = z13 | J2.contains("CLOSED-CAPTIONS=NONE");
                if (startsWith) {
                    z10 = contains;
                    i11 = 16384;
                } else {
                    z10 = contains;
                    i11 = 0;
                }
                int parseInt2 = Integer.parseInt(j(J2, n, Collections.EMPTY_MAP, dVar));
                Matcher a10 = o2.d.a(J2, c, dVar);
                if (a10.find()) {
                    arrayList3 = arrayList15;
                    String group = a10.group(1);
                    group.getClass();
                    i12 = Integer.parseInt(group);
                } else {
                    arrayList3 = arrayList15;
                    i12 = -1;
                }
                arrayList4 = arrayList11;
                String i30 = i(J2, s, null, hashMap5, dVar);
                arrayList5 = arrayList10;
                String i31 = i(J2, v, null, hashMap5, dVar);
                arrayList6 = arrayList14;
                String i32 = i(J2, w, null, hashMap5, dVar);
                if (i32 != null) {
                    String str11 = m0.a;
                    String[] split2 = i32.split(",", 2)[0].split("/", -1);
                    str4 = split2[0];
                    if (split2.length > 1) {
                        str5 = split2[1];
                        hashMap2 = hashMap4;
                        i13 = 2;
                        w9 = m0.w(i13, i31);
                        if (v0.j(w9, str4) && (str4 == null || !(i30 == null || str5 == null || ((i30.equals("PQ") && !str5.equals("db1p")) || ((i30.equals("SDR") && !str5.equals("db2g")) || (i30.equals("HLG") && !str5.startsWith("db4"))))))) {
                            b2.n x10 = m0.x(i31, str4, str5);
                            if (str4 == null) {
                                str4 = w9;
                            }
                            d02 = m0.d0(i31);
                            if (d02.length != 0) {
                                nVar2 = x10;
                            } else {
                                StringBuilder sb3 = new StringBuilder();
                                int length = d02.length;
                                int i33 = 0;
                                while (i33 < length) {
                                    String[] strArr = d02;
                                    String str12 = strArr[i33];
                                    b2.n nVar3 = x10;
                                    int i34 = length;
                                    if (2 != v0.h(v0.d(str12))) {
                                        if (sb3.length() > 0) {
                                            sb3.append(",");
                                        }
                                        sb3.append(str12);
                                    }
                                    i33++;
                                    d02 = strArr;
                                    length = i34;
                                    x10 = nVar3;
                                }
                                nVar2 = x10;
                                if (sb3.length() > 0) {
                                    sb2 = sb3.toString();
                                    i31 = sb2 != null ? a1.g.C(str4, ",", sb2) : str4;
                                    nVar = nVar2;
                                }
                            }
                            sb2 = null;
                            if (sb2 != null) {
                            }
                            nVar = nVar2;
                        } else {
                            nVar = null;
                        }
                        boolean equals = TextUtils.equals(i(J2, y, null, hashMap5, dVar), "true");
                        String i35 = i(J2, x, null, hashMap5, dVar);
                        String i36 = i(J2, E, null, hashMap5, dVar);
                        String i37 = i(J2, F, null, hashMap5, dVar);
                        String i38 = i(J2, G, null, hashMap5, dVar);
                        i14 = i(J2, H, null, hashMap5, dVar);
                        if (i14 != null) {
                            str6 = i36;
                            String[] split3 = i14.split("x", -1);
                            int parseInt3 = Integer.parseInt(split3[0]);
                            int parseInt4 = Integer.parseInt(split3[1]);
                            if (parseInt3 <= 0 || parseInt4 <= 0) {
                                parseInt4 = -1;
                                i17 = -1;
                            } else {
                                i17 = parseInt3;
                            }
                            i16 = parseInt4;
                            i15 = i17;
                        } else {
                            str6 = i36;
                            i15 = -1;
                            i16 = -1;
                        }
                        ArrayList arrayList36 = arrayList9;
                        String i39 = i(J2, I, null, hashMap5, dVar);
                        float parseFloat = i39 != null ? Float.parseFloat(i39) : -1.0f;
                        String i40 = i(J2, J, null, hashMap5, dVar);
                        String i41 = i(J2, d, null, hashMap5, dVar);
                        String i42 = i(J2, e, null, hashMap5, dVar);
                        String i43 = i(J2, f, null, hashMap5, dVar);
                        String i44 = i(J2, h, null, hashMap5, dVar);
                        String i45 = i(J2, K, null, hashMap5, dVar);
                        if (startsWith) {
                            g10 = e2.e.g(uri2, j(J2, pattern, hashMap5, dVar));
                        } else {
                            if (!g3Var.H()) {
                                throw w0.b("#EXT-X-STREAM-INF must be followed by another line", null);
                            }
                            g10 = e2.e.g(uri2, k(g3Var.J(), hashMap5, dVar));
                        }
                        Uri uri4 = g10;
                        b2.v vVar2 = new b2.v();
                        vVar2.a = Integer.toString(arrayList36.size());
                        vVar2.q = v0.n("application/x-mpegURL");
                        vVar2.j = i31;
                        vVar2.h = i12;
                        vVar2.i = parseInt2;
                        vVar2.y = i15;
                        vVar2.z = i16;
                        vVar2.C = parseFloat;
                        vVar2.f = i11;
                        vVar2.H = nVar;
                        vVar2.m = equals;
                        vVar2.r = v0.n(i35);
                        vVar2.n = Long.parseLong(str6);
                        vVar2.o = i37;
                        vVar2.p = Integer.parseInt(i38);
                        arrayList7 = arrayList36;
                        arrayList7.add(new p(uri4, new b2.w(vVar2), i41, i42, i43, i44, i40, i45));
                        hashMap3 = hashMap2;
                        arrayList8 = (ArrayList) hashMap3.get(uri4);
                        if (arrayList8 == null) {
                            arrayList8 = new ArrayList();
                            hashMap3.put(uri4, arrayList8);
                        }
                        arrayList8.add(new o2.r(i12, i41, parseInt2, i42, i43, i44));
                        z11 = z10;
                        z12 = z14;
                        arrayList9 = arrayList7;
                        hashMap4 = hashMap3;
                        arrayList13 = arrayList17;
                        arrayList12 = arrayList34;
                        arrayList16 = arrayList35;
                        arrayList15 = arrayList3;
                        arrayList11 = arrayList4;
                        arrayList10 = arrayList5;
                        arrayList14 = arrayList6;
                    } else {
                        hashMap2 = hashMap4;
                        i13 = 2;
                    }
                } else {
                    hashMap2 = hashMap4;
                    i13 = 2;
                    str4 = null;
                }
                str5 = null;
                w9 = m0.w(i13, i31);
                if (v0.j(w9, str4)) {
                    b2.n x102 = m0.x(i31, str4, str5);
                    if (str4 == null) {
                    }
                    d02 = m0.d0(i31);
                    if (d02.length != 0) {
                    }
                    sb2 = null;
                    if (sb2 != null) {
                    }
                    nVar = nVar2;
                    boolean equals2 = TextUtils.equals(i(J2, y, null, hashMap5, dVar), "true");
                    String i352 = i(J2, x, null, hashMap5, dVar);
                    String i362 = i(J2, E, null, hashMap5, dVar);
                    String i372 = i(J2, F, null, hashMap5, dVar);
                    String i382 = i(J2, G, null, hashMap5, dVar);
                    i14 = i(J2, H, null, hashMap5, dVar);
                    if (i14 != null) {
                    }
                    ArrayList arrayList362 = arrayList9;
                    String i392 = i(J2, I, null, hashMap5, dVar);
                    if (i392 != null) {
                    }
                    String i402 = i(J2, J, null, hashMap5, dVar);
                    String i412 = i(J2, d, null, hashMap5, dVar);
                    String i422 = i(J2, e, null, hashMap5, dVar);
                    String i432 = i(J2, f, null, hashMap5, dVar);
                    String i442 = i(J2, h, null, hashMap5, dVar);
                    String i452 = i(J2, K, null, hashMap5, dVar);
                    if (startsWith) {
                    }
                    Uri uri42 = g10;
                    b2.v vVar22 = new b2.v();
                    vVar22.a = Integer.toString(arrayList362.size());
                    vVar22.q = v0.n("application/x-mpegURL");
                    vVar22.j = i31;
                    vVar22.h = i12;
                    vVar22.i = parseInt2;
                    vVar22.y = i15;
                    vVar22.z = i16;
                    vVar22.C = parseFloat;
                    vVar22.f = i11;
                    vVar22.H = nVar;
                    vVar22.m = equals2;
                    vVar22.r = v0.n(i352);
                    vVar22.n = Long.parseLong(str6);
                    vVar22.o = i372;
                    vVar22.p = Integer.parseInt(i382);
                    arrayList7 = arrayList362;
                    arrayList7.add(new p(uri42, new b2.w(vVar22), i412, i422, i432, i442, i402, i452));
                    hashMap3 = hashMap2;
                    arrayList8 = (ArrayList) hashMap3.get(uri42);
                    if (arrayList8 == null) {
                    }
                    arrayList8.add(new o2.r(i12, i412, parseInt2, i422, i432, i442));
                    z11 = z10;
                    z12 = z14;
                    arrayList9 = arrayList7;
                    hashMap4 = hashMap3;
                    arrayList13 = arrayList17;
                    arrayList12 = arrayList34;
                    arrayList16 = arrayList35;
                    arrayList15 = arrayList3;
                    arrayList11 = arrayList4;
                    arrayList10 = arrayList5;
                    arrayList14 = arrayList6;
                }
                nVar = null;
                boolean equals22 = TextUtils.equals(i(J2, y, null, hashMap5, dVar), "true");
                String i3522 = i(J2, x, null, hashMap5, dVar);
                String i3622 = i(J2, E, null, hashMap5, dVar);
                String i3722 = i(J2, F, null, hashMap5, dVar);
                String i3822 = i(J2, G, null, hashMap5, dVar);
                i14 = i(J2, H, null, hashMap5, dVar);
                if (i14 != null) {
                }
                ArrayList arrayList3622 = arrayList9;
                String i3922 = i(J2, I, null, hashMap5, dVar);
                if (i3922 != null) {
                }
                String i4022 = i(J2, J, null, hashMap5, dVar);
                String i4122 = i(J2, d, null, hashMap5, dVar);
                String i4222 = i(J2, e, null, hashMap5, dVar);
                String i4322 = i(J2, f, null, hashMap5, dVar);
                String i4422 = i(J2, h, null, hashMap5, dVar);
                String i4522 = i(J2, K, null, hashMap5, dVar);
                if (startsWith) {
                }
                Uri uri422 = g10;
                b2.v vVar222 = new b2.v();
                vVar222.a = Integer.toString(arrayList3622.size());
                vVar222.q = v0.n("application/x-mpegURL");
                vVar222.j = i31;
                vVar222.h = i12;
                vVar222.i = parseInt2;
                vVar222.y = i15;
                vVar222.z = i16;
                vVar222.C = parseFloat;
                vVar222.f = i11;
                vVar222.H = nVar;
                vVar222.m = equals22;
                vVar222.r = v0.n(i3522);
                vVar222.n = Long.parseLong(str6);
                vVar222.o = i3722;
                vVar222.p = Integer.parseInt(i3822);
                arrayList7 = arrayList3622;
                arrayList7.add(new p(uri422, new b2.w(vVar222), i4122, i4222, i4322, i4422, i4022, i4522));
                hashMap3 = hashMap2;
                arrayList8 = (ArrayList) hashMap3.get(uri422);
                if (arrayList8 == null) {
                }
                arrayList8.add(new o2.r(i12, i4122, parseInt2, i4222, i4322, i4422));
                z11 = z10;
                z12 = z14;
                arrayList9 = arrayList7;
                hashMap4 = hashMap3;
                arrayList13 = arrayList17;
                arrayList12 = arrayList34;
                arrayList16 = arrayList35;
                arrayList15 = arrayList3;
                arrayList11 = arrayList4;
                arrayList10 = arrayList5;
                arrayList14 = arrayList6;
            }
            arrayList6 = arrayList14;
            arrayList5 = arrayList10;
            arrayList4 = arrayList11;
            arrayList3 = arrayList15;
            z11 = z13;
            z12 = z14;
            hashMap3 = hashMap4;
            arrayList7 = arrayList9;
            arrayList9 = arrayList7;
            hashMap4 = hashMap3;
            arrayList13 = arrayList17;
            arrayList12 = arrayList34;
            arrayList16 = arrayList35;
            arrayList15 = arrayList3;
            arrayList11 = arrayList4;
            arrayList10 = arrayList5;
            arrayList14 = arrayList6;
        }
    }

    public static boolean f(String str, Pattern pattern, o2.d dVar) {
        Matcher a2 = o2.d.a(str, pattern, dVar);
        if (a2.find()) {
            return "YES".equals(a2.group(1));
        }
        return false;
    }

    public static double g(String str, Pattern pattern, double d10, o2.d dVar) {
        Matcher a2 = o2.d.a(str, pattern, dVar);
        if (!a2.find()) {
            return d10;
        }
        String group = a2.group(1);
        group.getClass();
        return Double.parseDouble(group);
    }

    public static long h(String str, Pattern pattern, o2.d dVar) {
        Matcher a2 = o2.d.a(str, pattern, dVar);
        if (!a2.find()) {
            return -1L;
        }
        String group = a2.group(1);
        group.getClass();
        return Long.parseLong(group);
    }

    public static String i(String str, Pattern pattern, String str2, Map map, o2.d dVar) {
        Matcher a2 = o2.d.a(str, pattern, dVar);
        if (a2.find()) {
            str2 = a2.group(1);
            str2.getClass();
        }
        return (map.isEmpty() || str2 == null) ? str2 : k(str2, map, dVar);
    }

    public static String j(String str, Pattern pattern, Map map, o2.d dVar) {
        String i10 = i(str, pattern, null, map, dVar);
        if (i10 != null) {
            return i10;
        }
        throw w0.b("Couldn't match " + pattern.pattern() + " in " + str, null);
    }

    public static String k(String str, Map map, o2.d dVar) {
        Matcher a2 = o2.d.a(str, W0, dVar);
        StringBuffer stringBuffer = new StringBuffer();
        while (a2.find()) {
            String group = a2.group(1);
            if (map.containsKey(group)) {
                a2.appendReplacement(stringBuffer, Matcher.quoteReplacement((String) map.get(group)));
            }
        }
        a2.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    public static void l(String str, HashMap hashMap) {
        if (hashMap.containsKey(str)) {
            throw w0.b("duplicate variable name \"" + str + "\"", null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0073 A[Catch: all -> 0x009e, LOOP:0: B:13:0x0073->B:38:0x0073, LOOP_START, TryCatch #4 {all -> 0x009e, blocks: (B:3:0x0019, B:5:0x0022, B:7:0x002a, B:10:0x0033, B:13:0x0073, B:15:0x0079, B:18:0x0084, B:57:0x008c, B:20:0x00a0, B:22:0x00a8, B:24:0x00b0, B:26:0x00b8, B:28:0x00c0, B:30:0x00c8, B:32:0x00d0, B:34:0x00d8, B:36:0x00e1, B:41:0x00e5, B:75:0x0107, B:76:0x010d, B:80:0x003a, B:82:0x0040, B:87:0x0049, B:89:0x0052, B:94:0x005b, B:96:0x0061, B:98:0x0067, B:100:0x006c), top: B:2:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0107 A[Catch: all -> 0x009e, TRY_ENTER, TryCatch #4 {all -> 0x009e, blocks: (B:3:0x0019, B:5:0x0022, B:7:0x002a, B:10:0x0033, B:13:0x0073, B:15:0x0079, B:18:0x0084, B:57:0x008c, B:20:0x00a0, B:22:0x00a8, B:24:0x00b0, B:26:0x00b8, B:28:0x00c0, B:30:0x00c8, B:32:0x00d0, B:34:0x00d8, B:36:0x00e1, B:41:0x00e5, B:75:0x0107, B:76:0x010d, B:80:0x003a, B:82:0x0040, B:87:0x0049, B:89:0x0052, B:94:0x005b, B:96:0x0061, B:98:0x0067, B:100:0x006c), top: B:2:0x0019 }] */
    @Override // y2.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d2(Uri uri, g2.k kVar) {
        String trim;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(kVar));
        ArrayDeque arrayDeque = new ArrayDeque();
        o2.d dVar = new o2.d(0.75f, 16, 1, true);
        try {
            int read = bufferedReader.read();
            boolean z10 = false;
            if (read == 239) {
                if (bufferedReader.read() == 187 && bufferedReader.read() == 191) {
                    read = bufferedReader.read();
                }
                if (z10) {
                    throw w0.b("Input does not start with the #EXTM3U header.", null);
                }
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException unused) {
                        }
                        throw w0.b("Failed to parse the playlist, could not identify any tags.", null);
                    }
                    trim = readLine.trim();
                    if (!trim.isEmpty()) {
                        if (!trim.startsWith("#EXT-X-STREAM-INF")) {
                            if (trim.startsWith("#EXT-X-TARGETDURATION") || trim.startsWith("#EXT-X-MEDIA-SEQUENCE") || trim.startsWith("#EXTINF") || trim.startsWith("#EXT-X-KEY") || trim.startsWith("#EXT-X-BYTERANGE") || trim.equals("#EXT-X-DISCONTINUITY") || trim.equals("#EXT-X-DISCONTINUITY-SEQUENCE") || trim.equals("#EXT-X-ENDLIST")) {
                                break;
                            }
                            arrayDeque.add(trim);
                        } else {
                            arrayDeque.add(trim);
                            q e7 = e(new g3(arrayDeque, bufferedReader), uri, dVar);
                            try {
                                bufferedReader.close();
                            } catch (IOException unused2) {
                            }
                            return e7;
                        }
                    }
                }
                arrayDeque.add(trim);
                n d10 = d(this.a, this.b, new g3(arrayDeque, bufferedReader), uri, dVar);
                try {
                    bufferedReader.close();
                } catch (IOException unused3) {
                }
                return d10;
            }
            while (read != -1 && Character.isWhitespace(read)) {
                read = bufferedReader.read();
            }
            int i10 = 0;
            while (true) {
                if (i10 >= 7) {
                    while (read != -1 && Character.isWhitespace(read) && !m0.O(read)) {
                        read = bufferedReader.read();
                    }
                    z10 = m0.O(read);
                } else {
                    if (read != "#EXTM3U".charAt(i10)) {
                        break;
                    }
                    read = bufferedReader.read();
                    i10++;
                }
            }
            if (z10) {
            }
        } finally {
            String str = m0.a;
            try {
                bufferedReader.close();
            } catch (IOException unused4) {
            }
        }
    }
}
