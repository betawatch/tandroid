package p2;

import a8.yb;
import a8.zb;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import b2.u0;
import b2.w0;
import b2.x;
import b2.x0;
import c3.h0;
import e2.n0;
import f9.i0;
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
import org.telegram.ui.Components.b10;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class s implements y2.n {
    public final p a;
    public final m b;
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

    public s(p pVar, m mVar) {
        this.a = pVar;
        this.b = mVar;
    }

    public static Pattern a(String str) {
        return Pattern.compile(str.concat("=(NO|YES)"));
    }

    public static b2.t b(String str, b2.s[] sVarArr) {
        b2.s[] sVarArr2 = new b2.s[sVarArr.length];
        for (int i10 = 0; i10 < sVarArr.length; i10++) {
            b2.s sVar = sVarArr[i10];
            sVarArr2[i10] = new b2.s(sVar.b, sVar.c, sVar.d, null);
        }
        return new b2.t(str, true, sVarArr2);
    }

    public static b2.s c(String str, String str2, HashMap hashMap, o2.d dVar) {
        String i10 = i(str, k0, "1", hashMap, dVar);
        boolean equals = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2);
        Pattern pattern = l0;
        if (equals) {
            String j10 = j(str, pattern, hashMap, dVar);
            return new b2.s(b2.n.e, null, "video/mp4", Base64.decode(j10.substring(j10.indexOf(44)), 0));
        }
        if ("com.widevine".equals(str2)) {
            UUID uuid = b2.n.e;
            String str3 = n0.a;
            return new b2.s(uuid, null, "hls", str.getBytes(StandardCharsets.UTF_8));
        }
        if (!"com.microsoft.playready".equals(str2) || !"1".equals(i10)) {
            return null;
        }
        String j11 = j(str, pattern, hashMap, dVar);
        byte[] decode = Base64.decode(j11.substring(j11.indexOf(44)), 0);
        UUID uuid2 = b2.n.f;
        return new b2.s(uuid2, null, "video/mp4", w3.p.a(uuid2, null, decode));
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
    public static m d(p pVar, m mVar, k6.c cVar, Uri uri, o2.d dVar) {
        HashMap hashMap;
        Iterator it;
        g gVar;
        ArrayList arrayList;
        LinkedHashMap linkedHashMap;
        String str;
        int i10;
        String str2;
        int i11;
        long j10;
        int i12;
        h hVar;
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
        b2.t tVar;
        b2.t tVar2;
        String str7;
        int i14;
        String str8;
        ArrayList arrayList4;
        ArrayList arrayList5;
        long j12;
        String str9;
        int i15;
        b2.t tVar3;
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
        e eVar;
        int i17;
        char c11;
        String str13;
        long j13;
        b2.t tVar4;
        b2.t tVar5;
        p pVar2 = pVar;
        m mVar2 = mVar;
        String uri2 = uri.toString();
        boolean z11 = pVar2.c;
        j jVar = mVar2 != null ? mVar2.x : null;
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        ArrayList arrayList12 = new ArrayList();
        ArrayList arrayList13 = new ArrayList();
        ArrayList arrayList14 = new ArrayList();
        ArrayList arrayList15 = new ArrayList();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        l lVar = new l(-9223372036854775807L, false, -9223372036854775807L, -9223372036854775807L, false);
        TreeMap treeMap2 = new TreeMap();
        String str14 = "";
        int i18 = 0;
        String str15 = "";
        j jVar2 = jVar;
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
        b2.t tVar6 = null;
        b2.t tVar7 = null;
        String str16 = null;
        String str17 = null;
        h hVar2 = null;
        String str18 = null;
        while (true) {
            int i24 = i19;
            String str19 = "POINT";
            l lVar2 = lVar;
            if (!cVar.B()) {
                ArrayList arrayList16 = arrayList12;
                ArrayList arrayList17 = arrayList13;
                ArrayList arrayList18 = arrayList14;
                ArrayList arrayList19 = arrayList15;
                LinkedHashMap linkedHashMap4 = linkedHashMap3;
                h hVar3 = hVar2;
                HashMap hashMap5 = new HashMap();
                int i25 = i18;
                while (i25 < arrayList18.size()) {
                    ArrayList arrayList20 = arrayList18;
                    i iVar = (i) arrayList20.get(i25);
                    long j26 = iVar.b;
                    if (j26 == -1) {
                        j26 = (j18 + arrayList16.size()) - (arrayList17.isEmpty() ? 1L : 0L);
                    }
                    int i26 = iVar.c;
                    if (i26 == -1 && j15 != -9223372036854775807L) {
                        i26 = (arrayList17.isEmpty() ? ((j) f9.o.m(arrayList16)).x : arrayList17).size() - 1;
                    }
                    Uri uri3 = iVar.a;
                    hashMap5.put(uri3, new i(uri3, j26, i26));
                    i25++;
                    arrayList18 = arrayList20;
                }
                if (hVar3 != null) {
                    arrayList17.add(hVar3);
                }
                ArrayList arrayList21 = new ArrayList();
                Iterator it2 = linkedHashMap4.values().iterator();
                while (it2.hasNext()) {
                    f fVar = (f) it2.next();
                    Uri uri4 = fVar.d;
                    if ((uri4 == null && fVar.c != null) || (uri4 != null && fVar.c == null)) {
                        long j27 = fVar.e;
                        if (j27 != -9223372036854775807L) {
                            String str20 = fVar.a;
                            Uri uri5 = fVar.c;
                            long j28 = fVar.f;
                            hashMap = hashMap5;
                            it = it2;
                            long j29 = fVar.g;
                            long j30 = fVar.h;
                            ArrayList arrayList22 = fVar.i;
                            boolean z17 = fVar.j;
                            long j31 = fVar.k;
                            long j32 = fVar.l;
                            ArrayList arrayList23 = fVar.m;
                            ArrayList arrayList24 = fVar.n;
                            ArrayList arrayList25 = new ArrayList(fVar.b.values());
                            Boolean bool = fVar.o;
                            boolean z18 = bool == null || bool.booleanValue();
                            String str21 = fVar.p;
                            String str22 = str21 != null ? str21 : "POINT";
                            String str23 = fVar.q;
                            gVar = new g(str20, uri5, uri4, j27, j28, j29, j30, arrayList22, z17, j31, j32, arrayList23, arrayList24, arrayList25, z18, str22, str23 != null ? str23 : "HIGHLIGHT", fVar.r, fVar.s, fVar.t);
                            if (gVar == null) {
                                arrayList21.add(gVar);
                            }
                            it2 = it;
                            hashMap5 = hashMap;
                        }
                    }
                    hashMap = hashMap5;
                    it = it2;
                    gVar = null;
                    if (gVar == null) {
                    }
                    it2 = it;
                    hashMap5 = hashMap;
                }
                HashMap hashMap6 = hashMap5;
                if (j20 == 0 && mVar != null && mVar.p) {
                    j20 = mVar.h;
                }
                return new m(i22, uri.toString(), arrayList19, j16, z14, j20, z13, i20, j18, i23, j17, j15, z12, z15, j20 != 0, tVar6, arrayList16, arrayList17, lVar2, hashMap6, arrayList21, jVar2);
            }
            String C = cVar.C();
            HashMap hashMap7 = hashMap4;
            if (C.startsWith("#EXT")) {
                arrayList15.add(C);
            }
            if (C.startsWith("#EXT-X-PLAYLIST-TYPE")) {
                String j33 = j(C, R, hashMap3, dVar);
                if ("VOD".equals(j33)) {
                    i22 = 1;
                } else if ("EVENT".equals(j33)) {
                    i22 = 2;
                }
                i19 = i24;
                lVar = lVar2;
            } else if (C.equals("#EXT-X-I-FRAMES-ONLY")) {
                i19 = i24;
                lVar = lVar2;
                hashMap4 = hashMap7;
                z16 = true;
            } else {
                if (C.startsWith("#EXT-X-START")) {
                    arrayList = arrayList15;
                    linkedHashMap = linkedHashMap3;
                    long parseDouble = (long) (Double.parseDouble(j(C, d0, Collections.EMPTY_MAP, dVar)) * 1000000.0d);
                    z14 = f(C, A0, dVar);
                    j16 = parseDouble;
                } else {
                    arrayList = arrayList15;
                    linkedHashMap = linkedHashMap3;
                    if (C.startsWith("#EXT-X-SERVER-CONTROL")) {
                        double g7 = g(C, S, -9.223372036854776E18d, dVar);
                        long j34 = g7 == -9.223372036854776E18d ? -9223372036854775807L : (long) (g7 * 1000000.0d);
                        boolean f7 = f(C, T, dVar);
                        double g10 = g(C, V, -9.223372036854776E18d, dVar);
                        long j35 = g10 == -9.223372036854776E18d ? -9223372036854775807L : (long) (g10 * 1000000.0d);
                        double g11 = g(C, W, -9.223372036854776E18d, dVar);
                        arrayList15 = arrayList;
                        i19 = i24;
                        hashMap4 = hashMap7;
                        linkedHashMap3 = linkedHashMap;
                        lVar = new l(j34, f7, j35, g11 == -9.223372036854776E18d ? -9223372036854775807L : (long) (g11 * 1000000.0d), f(C, X, dVar));
                    } else if (C.startsWith("#EXT-X-PART-INF")) {
                        j15 = (long) (Double.parseDouble(j(C, P, Collections.EMPTY_MAP, dVar)) * 1000000.0d);
                    } else {
                        boolean startsWith = C.startsWith("#EXT-X-MAP");
                        Pattern pattern = f0;
                        Pattern pattern2 = l0;
                        if (startsWith) {
                            String j36 = j(C, pattern2, hashMap3, dVar);
                            String i27 = i(C, pattern, null, hashMap3, dVar);
                            if (i27 != null) {
                                String str24 = n0.a;
                                String[] split = i27.split("@", -1);
                                j14 = Long.parseLong(split[i18]);
                                if (split.length > 1) {
                                    j22 = Long.parseLong(split[1]);
                                }
                            }
                            long j37 = j14;
                            long j38 = j37 == -1 ? 0L : j22;
                            if (str16 != null && str17 == null) {
                                throw x0.b("The encryption IV attribute must be present when an initialization segment is encrypted with METHOD=AES-128.", null);
                            }
                            j jVar3 = new j(j36, j38, j37, str16, str17);
                            String str25 = str17;
                            if (j37 != -1) {
                                j38 += j37;
                            }
                            j22 = j38;
                            jVar2 = jVar3;
                            i19 = i24;
                            j14 = -1;
                            lVar = lVar2;
                            hashMap4 = hashMap7;
                            linkedHashMap3 = linkedHashMap;
                            arrayList15 = arrayList;
                            str17 = str25;
                        } else {
                            String str26 = str17;
                            ArrayList arrayList26 = arrayList13;
                            ArrayList arrayList27 = arrayList14;
                            if (C.startsWith("#EXT-X-TARGETDURATION")) {
                                j17 = Integer.parseInt(j(C, M, Collections.EMPTY_MAP, dVar)) * 1000000;
                            } else if (C.startsWith("#EXT-X-MEDIA-SEQUENCE")) {
                                j21 = Long.parseLong(j(C, Y, Collections.EMPTY_MAP, dVar));
                                i19 = i24;
                                j18 = j21;
                                lVar = lVar2;
                                hashMap4 = hashMap7;
                                linkedHashMap3 = linkedHashMap;
                                arrayList15 = arrayList;
                                str17 = str26;
                                arrayList14 = arrayList27;
                                arrayList13 = arrayList26;
                            } else if (C.startsWith("#EXT-X-VERSION")) {
                                i23 = Integer.parseInt(j(C, Q, Collections.EMPTY_MAP, dVar));
                            } else {
                                if (C.startsWith("#EXT-X-DEFINE")) {
                                    String i28 = i(C, q0, null, hashMap3, dVar);
                                    String i29 = i(C, r0, null, hashMap3, dVar);
                                    if (i28 != null) {
                                        l(i28, hashMap3);
                                        hashMap3.put(i28, j(C, B0, hashMap3, dVar));
                                    } else if (i29 != null) {
                                        l(i29, hashMap3);
                                        String queryParameter = uri.getQueryParameter(i29);
                                        if (queryParameter == null) {
                                            throw x0.b("QUERYPARAM \"" + i29 + "\" not found in playlist URI", null);
                                        }
                                        hashMap3.put(i29, queryParameter);
                                    } else {
                                        String j39 = j(C, C0, hashMap3, dVar);
                                        l(j39, hashMap3);
                                        String str27 = (String) pVar2.l.get(j39);
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
                                    hVar = hVar2;
                                    str3 = str18;
                                    j11 = j24;
                                    str4 = str15;
                                    hashMap2 = hashMap7;
                                    linkedHashMap2 = linkedHashMap;
                                    arrayList2 = arrayList26;
                                    str5 = uri2;
                                    treeMap = treeMap2;
                                } else if (C.startsWith("#EXTINF")) {
                                    j24 = new BigDecimal(j(C, Z, Collections.EMPTY_MAP, dVar)).multiply(new BigDecimal(1000000L)).longValue();
                                    str15 = i(C, a0, str14, hashMap3, dVar);
                                } else if (C.startsWith("#EXT-X-SKIP")) {
                                    int parseInt = Integer.parseInt(j(C, U, Collections.EMPTY_MAP, dVar));
                                    yb.p((mVar2 == null || !arrayList12.isEmpty()) ? i18 : 1);
                                    String str28 = n0.a;
                                    long j40 = mVar2.k;
                                    i0 i0Var = mVar2.r;
                                    int i30 = (int) (j18 - j40);
                                    int i31 = parseInt + i30;
                                    if (i30 >= 0 && i31 <= i0Var.size()) {
                                        long j41 = j23;
                                        str17 = str26;
                                        while (i30 < i31) {
                                            j jVar4 = (j) i0Var.get(i30);
                                            if (j18 != mVar2.k) {
                                                int i32 = (mVar2.j - i20) + jVar4.d;
                                                i0 i0Var2 = jVar4.x;
                                                ArrayList arrayList28 = new ArrayList();
                                                int i33 = i18;
                                                long j42 = j41;
                                                while (i33 < i0Var2.size()) {
                                                    h hVar4 = (h) i0Var2.get(i33);
                                                    arrayList28.add(new h(hVar4.a, hVar4.b, hVar4.c, i32, j42, hVar4.f, hVar4.h, hVar4.n, hVar4.r, hVar4.s, hVar4.v, hVar4.w, hVar4.x));
                                                    j42 += hVar4.c;
                                                    i33++;
                                                    str14 = str14;
                                                }
                                                str6 = str14;
                                                jVar4 = new j(jVar4.a, jVar4.b, jVar4.w, jVar4.c, i32, j41, jVar4.f, jVar4.h, jVar4.n, jVar4.r, jVar4.s, jVar4.v, arrayList28);
                                            } else {
                                                str6 = str14;
                                            }
                                            arrayList12.add(jVar4);
                                            long j43 = jVar4.c;
                                            String str29 = jVar4.n;
                                            j41 += j43;
                                            long j44 = jVar4.s;
                                            if (j44 != -1) {
                                                j22 = jVar4.r + j44;
                                            }
                                            int i34 = jVar4.d;
                                            j jVar5 = jVar4.b;
                                            b2.t tVar8 = jVar4.f;
                                            String str30 = jVar4.h;
                                            if (str29 == null || !str29.equals(Long.toHexString(j21))) {
                                                str17 = str29;
                                            }
                                            j21++;
                                            i30++;
                                            i24 = i34;
                                            jVar2 = jVar5;
                                            str16 = str30;
                                            tVar7 = tVar8;
                                            j19 = j41;
                                            str14 = str6;
                                        }
                                        pVar2 = pVar;
                                        i19 = i24;
                                        lVar = lVar2;
                                        hashMap4 = hashMap7;
                                        linkedHashMap3 = linkedHashMap;
                                        arrayList15 = arrayList;
                                        arrayList14 = arrayList27;
                                        arrayList13 = arrayList26;
                                        j23 = j41;
                                    }
                                } else {
                                    str2 = str14;
                                    if (C.startsWith("#EXT-X-KEY")) {
                                        String j45 = j(C, i0, hashMap3, dVar);
                                        String i35 = i(C, j0, "identity", hashMap3, dVar);
                                        if ("NONE".equals(j45)) {
                                            treeMap2.clear();
                                            tVar7 = null;
                                            str16 = null;
                                            str17 = null;
                                        } else {
                                            String i36 = i(C, m0, null, hashMap3, dVar);
                                            if (!"identity".equals(i35)) {
                                                String str31 = str18;
                                                if (str31 == null) {
                                                    str18 = ("SAMPLE-AES-CENC".equals(j45) || "SAMPLE-AES-CTR".equals(j45)) ? "cenc" : "cbcs";
                                                } else {
                                                    str18 = str31;
                                                }
                                                b2.s c12 = c(C, i35, hashMap3, dVar);
                                                if (c12 != null) {
                                                    treeMap2.put(i35, c12);
                                                    str17 = i36;
                                                    tVar7 = null;
                                                    str16 = null;
                                                }
                                            } else if ("AES-128".equals(j45)) {
                                                str16 = j(C, pattern2, hashMap3, dVar);
                                                str17 = i36;
                                            }
                                            str17 = i36;
                                            str16 = null;
                                        }
                                        pVar2 = pVar;
                                        i19 = i24;
                                        lVar = lVar2;
                                        hashMap4 = hashMap7;
                                        linkedHashMap3 = linkedHashMap;
                                        arrayList15 = arrayList;
                                    } else {
                                        String str32 = str18;
                                        if (C.startsWith("#EXT-X-BYTERANGE")) {
                                            String j46 = j(C, e0, hashMap3, dVar);
                                            String str33 = n0.a;
                                            String[] split2 = j46.split("@", -1);
                                            j14 = Long.parseLong(split2[i18]);
                                            if (split2.length > 1) {
                                                j22 = Long.parseLong(split2[1]);
                                            }
                                        } else if (C.startsWith("#EXT-X-DISCONTINUITY-SEQUENCE")) {
                                            i20 = Integer.parseInt(C.substring(C.indexOf(58) + 1));
                                            pVar2 = pVar;
                                            str18 = str32;
                                            i19 = i24;
                                            lVar = lVar2;
                                            hashMap4 = hashMap7;
                                            linkedHashMap3 = linkedHashMap;
                                            arrayList15 = arrayList;
                                            str17 = str26;
                                            arrayList14 = arrayList27;
                                            arrayList13 = arrayList26;
                                            str14 = str2;
                                            z13 = true;
                                        } else if (C.equals("#EXT-X-DISCONTINUITY")) {
                                            i19 = i24 + 1;
                                            pVar2 = pVar;
                                            str18 = str32;
                                            lVar = lVar2;
                                            hashMap4 = hashMap7;
                                            linkedHashMap3 = linkedHashMap;
                                            arrayList15 = arrayList;
                                            str17 = str26;
                                        } else {
                                            if (C.startsWith("#EXT-X-PROGRAM-DATE-TIME")) {
                                                if (j20 == 0) {
                                                    j20 = n0.S(n0.V(C.substring(C.indexOf(58) + 1))) - j23;
                                                }
                                            } else if (C.equals("#EXT-X-GAP")) {
                                                pVar2 = pVar;
                                                str18 = str32;
                                                i19 = i24;
                                                lVar = lVar2;
                                                hashMap4 = hashMap7;
                                                linkedHashMap3 = linkedHashMap;
                                                arrayList15 = arrayList;
                                                str17 = str26;
                                                arrayList14 = arrayList27;
                                                arrayList13 = arrayList26;
                                                str14 = str2;
                                                i21 = 1;
                                            } else if (C.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                                                pVar2 = pVar;
                                                str18 = str32;
                                                i19 = i24;
                                                lVar = lVar2;
                                                hashMap4 = hashMap7;
                                                linkedHashMap3 = linkedHashMap;
                                                arrayList15 = arrayList;
                                                str17 = str26;
                                                arrayList14 = arrayList27;
                                                arrayList13 = arrayList26;
                                                str14 = str2;
                                                z12 = true;
                                            } else if (C.equals("#EXT-X-ENDLIST")) {
                                                pVar2 = pVar;
                                                str18 = str32;
                                                i19 = i24;
                                                lVar = lVar2;
                                                hashMap4 = hashMap7;
                                                linkedHashMap3 = linkedHashMap;
                                                arrayList15 = arrayList;
                                                str17 = str26;
                                                arrayList14 = arrayList27;
                                                arrayList13 = arrayList26;
                                                str14 = str2;
                                                z15 = true;
                                            } else if (C.startsWith("#EXT-X-RENDITION-REPORT")) {
                                                long h10 = h(C, b0, dVar);
                                                Matcher a10 = o2.d.a(C, c0, dVar);
                                                if (a10.find()) {
                                                    String group = a10.group(1);
                                                    group.getClass();
                                                    i13 = Integer.parseInt(group);
                                                } else {
                                                    i13 = -1;
                                                }
                                                arrayList27.add(new i(Uri.parse(e2.e.f(uri2, j(C, pattern2, hashMap3, dVar))), h10, i13));
                                            } else if (C.startsWith("#EXT-X-PRELOAD-HINT")) {
                                                h hVar5 = hVar2;
                                                if (hVar5 == null && "PART".equals(j(C, o0, hashMap3, dVar))) {
                                                    b2.t tVar9 = tVar7;
                                                    String j47 = j(C, pattern2, hashMap3, dVar);
                                                    long h11 = h(C, g0, dVar);
                                                    long h12 = h(C, h0, dVar);
                                                    String hexString = str16 == null ? null : str26 != null ? str26 : Long.toHexString(j21);
                                                    if (tVar9 != null || treeMap2.isEmpty()) {
                                                        tVar = tVar9;
                                                    } else {
                                                        b2.s[] sVarArr = (b2.s[]) treeMap2.values().toArray(new b2.s[i18]);
                                                        b2.t tVar10 = new b2.t(str32, true, sVarArr);
                                                        if (tVar6 == null) {
                                                            tVar2 = b(str32, sVarArr);
                                                            tVar = tVar10;
                                                            if (h11 == -1 && h12 == -1) {
                                                                str7 = str16;
                                                                i14 = i24;
                                                                hVar2 = hVar5;
                                                            } else {
                                                                if (h11 == -1) {
                                                                    h11 = 0;
                                                                }
                                                                long j48 = j19;
                                                                h hVar6 = new h(j47, jVar2, 0L, i24, j48, tVar, str16, hexString, h11, h12, false, false, true);
                                                                j19 = j48;
                                                                str7 = str16;
                                                                i14 = i24;
                                                                hVar2 = hVar6;
                                                            }
                                                            arrayList14 = arrayList27;
                                                            str18 = str32;
                                                            tVar6 = tVar2;
                                                            tVar7 = tVar;
                                                            i19 = i14;
                                                            str16 = str7;
                                                            lVar = lVar2;
                                                            hashMap4 = hashMap7;
                                                            linkedHashMap3 = linkedHashMap;
                                                            arrayList15 = arrayList;
                                                            str17 = str26;
                                                            arrayList13 = arrayList26;
                                                            str14 = str2;
                                                            i18 = 0;
                                                            pVar2 = pVar;
                                                        } else {
                                                            tVar = tVar10;
                                                        }
                                                    }
                                                    tVar2 = tVar6;
                                                    if (h11 == -1) {
                                                    }
                                                    if (h11 == -1) {
                                                    }
                                                    long j482 = j19;
                                                    h hVar62 = new h(j47, jVar2, 0L, i24, j482, tVar, str16, hexString, h11, h12, false, false, true);
                                                    j19 = j482;
                                                    str7 = str16;
                                                    i14 = i24;
                                                    hVar2 = hVar62;
                                                    arrayList14 = arrayList27;
                                                    str18 = str32;
                                                    tVar6 = tVar2;
                                                    tVar7 = tVar;
                                                    i19 = i14;
                                                    str16 = str7;
                                                    lVar = lVar2;
                                                    hashMap4 = hashMap7;
                                                    linkedHashMap3 = linkedHashMap;
                                                    arrayList15 = arrayList;
                                                    str17 = str26;
                                                    arrayList13 = arrayList26;
                                                    str14 = str2;
                                                    i18 = 0;
                                                    pVar2 = pVar;
                                                } else {
                                                    str = str16;
                                                    i10 = i24;
                                                    arrayList27 = arrayList27;
                                                    str5 = uri2;
                                                    hVar = hVar5;
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
                                                b2.t tVar11 = tVar7;
                                                h hVar7 = hVar2;
                                                if (C.startsWith("#EXT-X-PART")) {
                                                    String hexString2 = str == null ? null : str26 != null ? str26 : Long.toHexString(j21);
                                                    String j49 = j(C, pattern2, hashMap3, dVar);
                                                    long parseDouble2 = (long) (Double.parseDouble(j(C, N, Collections.EMPTY_MAP, dVar)) * 1000000.0d);
                                                    boolean f10 = f(C, y0, dVar) | (z12 && arrayList26.isEmpty());
                                                    boolean f11 = f(C, z0, dVar);
                                                    String i37 = i(C, pattern, null, hashMap3, dVar);
                                                    if (i37 != null) {
                                                        String str34 = n0.a;
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
                                                    if (tVar11 != null || treeMap2.isEmpty()) {
                                                        tVar4 = tVar11;
                                                    } else {
                                                        b2.s[] sVarArr2 = (b2.s[]) treeMap2.values().toArray(new b2.s[0]);
                                                        b2.t tVar12 = new b2.t(str32, true, sVarArr2);
                                                        if (tVar6 == null) {
                                                            tVar5 = b(str32, sVarArr2);
                                                            tVar4 = tVar12;
                                                            long j50 = j19;
                                                            arrayList26.add(new h(j49, jVar2, parseDouble2, i10, j50, tVar4, str, hexString2, j25, j13, f11, f10, false));
                                                            j19 = j50 + parseDouble2;
                                                            if (j13 != -1) {
                                                                j25 += j13;
                                                            }
                                                            arrayList14 = arrayList27;
                                                            str18 = str32;
                                                            tVar6 = tVar5;
                                                            arrayList13 = arrayList26;
                                                            tVar7 = tVar4;
                                                            i19 = i10;
                                                            str16 = str;
                                                            uri2 = str13;
                                                            lVar = lVar2;
                                                            hashMap4 = hashMap7;
                                                            linkedHashMap3 = linkedHashMap;
                                                            arrayList15 = arrayList;
                                                            str17 = str26;
                                                            str14 = str2;
                                                            i18 = 0;
                                                            pVar2 = pVar;
                                                            hVar2 = hVar7;
                                                        } else {
                                                            tVar4 = tVar12;
                                                        }
                                                    }
                                                    tVar5 = tVar6;
                                                    long j502 = j19;
                                                    arrayList26.add(new h(j49, jVar2, parseDouble2, i10, j502, tVar4, str, hexString2, j25, j13, f11, f10, false));
                                                    j19 = j502 + parseDouble2;
                                                    if (j13 != -1) {
                                                    }
                                                    arrayList14 = arrayList27;
                                                    str18 = str32;
                                                    tVar6 = tVar5;
                                                    arrayList13 = arrayList26;
                                                    tVar7 = tVar4;
                                                    i19 = i10;
                                                    str16 = str;
                                                    uri2 = str13;
                                                    lVar = lVar2;
                                                    hashMap4 = hashMap7;
                                                    linkedHashMap3 = linkedHashMap;
                                                    arrayList15 = arrayList;
                                                    str17 = str26;
                                                    str14 = str2;
                                                    i18 = 0;
                                                    pVar2 = pVar;
                                                    hVar2 = hVar7;
                                                } else {
                                                    str5 = uri2;
                                                    if (C.startsWith("#EXT-X-DATERANGE")) {
                                                        if (i(C, E0, str2, hashMap3, dVar).equals("com.apple.hls.interstitial")) {
                                                            String j51 = j(C, D0, hashMap3, dVar);
                                                            String i38 = i(C, K0, null, hashMap3, dVar);
                                                            Uri parse = i38 != null ? Uri.parse(i38) : null;
                                                            arrayList4 = arrayList26;
                                                            String i39 = i(C, L0, null, hashMap3, dVar);
                                                            Uri parse2 = i39 != null ? Uri.parse(i39) : null;
                                                            tVar7 = tVar11;
                                                            String i40 = i(C, F0, null, hashMap3, dVar);
                                                            long S2 = i40 != null ? n0.S(n0.V(i40)) : -9223372036854775807L;
                                                            String i41 = i(C, H0, null, hashMap3, dVar);
                                                            long S3 = i41 != null ? n0.S(n0.V(i41)) : -9223372036854775807L;
                                                            ArrayList arrayList29 = new ArrayList();
                                                            str2 = str2;
                                                            String i42 = i(C, G0, null, hashMap3, dVar);
                                                            if (i42 != null) {
                                                                String str35 = n0.a;
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
                                                            double g12 = g(C, O, -1.0d, dVar);
                                                            long j52 = g12 >= 0.0d ? (long) (g12 * 1000000.0d) : -9223372036854775807L;
                                                            h hVar8 = hVar7;
                                                            double g13 = g(C, I0, -1.0d, dVar);
                                                            long j53 = g13 >= 0.0d ? (long) (g13 * 1000000.0d) : -9223372036854775807L;
                                                            boolean f12 = f(C, J0, dVar);
                                                            double g14 = g(C, M0, Double.MIN_VALUE, dVar);
                                                            long j54 = g14 != Double.MIN_VALUE ? (long) (g14 * 1000000.0d) : -9223372036854775807L;
                                                            double g15 = g(C, N0, -1.0d, dVar);
                                                            long j55 = g15 >= 0.0d ? (long) (g15 * 1000000.0d) : -9223372036854775807L;
                                                            ArrayList arrayList30 = new ArrayList();
                                                            String i45 = i(C, O0, null, hashMap3, dVar);
                                                            if (i45 != null) {
                                                                String str36 = n0.a;
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
                                                            String i48 = i(C, P0, null, hashMap3, dVar);
                                                            if (i48 != null) {
                                                                String str37 = n0.a;
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
                                                            Boolean valueOf = i(C, Q0, null, hashMap3, dVar) != null ? Boolean.valueOf(!r4.equals("NO")) : null;
                                                            String i51 = i(C, R0, null, hashMap3, dVar);
                                                            if (i51 != null) {
                                                                if (i51.equals("RANGE")) {
                                                                    str19 = "RANGE";
                                                                }
                                                                i16 = i(C, S0, null, hashMap3, dVar);
                                                                if (i16 != null) {
                                                                    str10 = "PRIMARY";
                                                                    if (!i16.equals("PRIMARY")) {
                                                                        str10 = "HIGHLIGHT";
                                                                    }
                                                                    double g16 = g(C, T0, -1.0d, dVar);
                                                                    long j56 = g16 >= 0.0d ? (long) (g16 * 1000000.0d) : -9223372036854775807L;
                                                                    str11 = str19;
                                                                    double g17 = g(C, U0, -1.0d, dVar);
                                                                    long j57 = g17 >= 0.0d ? (long) (g17 * 1000000.0d) : -9223372036854775807L;
                                                                    String i52 = i(C, V0, null, hashMap3, dVar);
                                                                    ArrayList arrayList32 = new ArrayList();
                                                                    String substring = C.substring(17);
                                                                    a2 = o2.d.a(substring, X0, dVar);
                                                                    while (true) {
                                                                        str12 = str11;
                                                                        if (a2.find()) {
                                                                            String group2 = a2.group();
                                                                            group2.getClass();
                                                                            h hVar9 = hVar8;
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
                                                                                    String l4 = h0.l(1, 0, group2);
                                                                                    String u10 = b10.u(l4, "=");
                                                                                    int length4 = u10.length() + substring.indexOf(u10);
                                                                                    z10 = f12;
                                                                                    String substring2 = substring.substring(length4, (substring.length() == length4 + 1 ? 1 : 2) + length4);
                                                                                    if (substring2.startsWith("\"")) {
                                                                                        eVar = new e(0, l4, j(substring, Pattern.compile(l4 + "=\"((?:.|\f)+?)\""), hashMap3, dVar));
                                                                                        arrayList11 = arrayList12;
                                                                                        arrayList10 = arrayList29;
                                                                                    } else if (substring2.equals("0x") || substring2.equals("0X")) {
                                                                                        arrayList11 = arrayList12;
                                                                                        arrayList10 = arrayList29;
                                                                                        eVar = new e(1, l4, j(substring, Pattern.compile(l4 + "=(0[xX][A-F0-9]+)"), hashMap3, dVar));
                                                                                    } else {
                                                                                        arrayList11 = arrayList12;
                                                                                        arrayList10 = arrayList29;
                                                                                        eVar = new e(l4, Double.parseDouble(j(substring, Pattern.compile(l4 + "=([\\d\\.]+)\\b"), Collections.EMPTY_MAP, dVar)));
                                                                                    }
                                                                                    arrayList32.add(eVar);
                                                                                    break;
                                                                            }
                                                                            arrayList12 = arrayList11;
                                                                            str11 = str12;
                                                                            a2 = matcher;
                                                                            f12 = z10;
                                                                            arrayList29 = arrayList10;
                                                                            hVar8 = hVar9;
                                                                        } else {
                                                                            ArrayList arrayList33 = arrayList29;
                                                                            hVar = hVar8;
                                                                            boolean z19 = f12;
                                                                            linkedHashMap2 = linkedHashMap;
                                                                            ArrayList arrayList34 = arrayList12;
                                                                            f fVar2 = linkedHashMap2.containsKey(j51) ? (f) linkedHashMap2.get(j51) : new f(j51);
                                                                            if (parse == null) {
                                                                                fVar2.getClass();
                                                                            } else {
                                                                                Uri uri6 = fVar2.c;
                                                                                if (uri6 != null) {
                                                                                    yb.i(uri6.equals(parse), "Can't change assetUri from %s to %s", fVar2.c, parse);
                                                                                }
                                                                                fVar2.c = parse;
                                                                            }
                                                                            if (parse2 != null) {
                                                                                Uri uri7 = fVar2.d;
                                                                                if (uri7 != null) {
                                                                                    yb.i(uri7.equals(parse2), "Can't change assetListUri from %s to %s", fVar2.d, parse2);
                                                                                }
                                                                                fVar2.d = parse2;
                                                                            }
                                                                            if (S2 != -9223372036854775807L) {
                                                                                long j58 = fVar2.e;
                                                                                if (j58 != -9223372036854775807L) {
                                                                                    yb.e("Can't change startDateUnixUs from %s to %s", j58, S2, j58 == S2);
                                                                                }
                                                                                fVar2.e = S2;
                                                                            }
                                                                            if (S3 != -9223372036854775807L) {
                                                                                long j59 = fVar2.f;
                                                                                if (j59 != -9223372036854775807L) {
                                                                                    yb.e("Can't change endDateUnixUs from %s to %s", j59, S3, j59 == S3);
                                                                                }
                                                                                fVar2.f = S3;
                                                                            }
                                                                            if (j52 != -9223372036854775807L) {
                                                                                long j60 = fVar2.g;
                                                                                if (j60 != -9223372036854775807L) {
                                                                                    yb.e("Can't change durationUs from %s to %s", j60, j52, j60 == j52);
                                                                                }
                                                                                fVar2.g = j52;
                                                                            }
                                                                            if (j53 != -9223372036854775807L) {
                                                                                long j61 = fVar2.h;
                                                                                if (j61 != -9223372036854775807L) {
                                                                                    yb.e("Can't change plannedDurationUs from %s to %s", j61, j53, j61 == j53);
                                                                                }
                                                                                fVar2.h = j53;
                                                                            }
                                                                            if (arrayList33.isEmpty()) {
                                                                                arrayList5 = arrayList34;
                                                                            } else {
                                                                                if (fVar2.i.isEmpty()) {
                                                                                    arrayList5 = arrayList34;
                                                                                    arrayList6 = arrayList33;
                                                                                } else {
                                                                                    arrayList6 = arrayList33;
                                                                                    boolean equals = fVar2.i.equals(arrayList6);
                                                                                    StringBuilder sb2 = new StringBuilder("Can't change cue from ");
                                                                                    ArrayList arrayList35 = fVar2.i;
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
                                                                                    yb.f(sb2.toString(), equals);
                                                                                }
                                                                                fVar2.i = arrayList6;
                                                                            }
                                                                            if (z19) {
                                                                                fVar2.j = true;
                                                                            }
                                                                            if (j54 != -9223372036854775807L) {
                                                                                long j62 = fVar2.k;
                                                                                if (j62 != -9223372036854775807L) {
                                                                                    yb.e("Can't change resumeOffsetUs from %s to %s", j62, j54, j62 == j54);
                                                                                }
                                                                                fVar2.k = j54;
                                                                            }
                                                                            if (j55 != -9223372036854775807L) {
                                                                                long j63 = fVar2.l;
                                                                                if (j63 != -9223372036854775807L) {
                                                                                    yb.e("Can't change playoutLimitUs from %s to %s", j63, j55, j63 == j55);
                                                                                }
                                                                                fVar2.l = j55;
                                                                            }
                                                                            if (!arrayList30.isEmpty()) {
                                                                                if (fVar2.m.isEmpty()) {
                                                                                    arrayList9 = arrayList30;
                                                                                } else {
                                                                                    arrayList9 = arrayList30;
                                                                                    boolean equals2 = fVar2.m.equals(arrayList9);
                                                                                    StringBuilder sb5 = new StringBuilder("Can't change snapTypes from ");
                                                                                    ArrayList arrayList36 = fVar2.m;
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
                                                                                    yb.f(sb5.toString(), equals2);
                                                                                }
                                                                                fVar2.m = arrayList9;
                                                                            }
                                                                            fVar2.getClass();
                                                                            if (!arrayList31.isEmpty()) {
                                                                                if (fVar2.n.isEmpty()) {
                                                                                    arrayList8 = arrayList31;
                                                                                } else {
                                                                                    arrayList8 = arrayList31;
                                                                                    boolean equals3 = fVar2.n.equals(arrayList8);
                                                                                    StringBuilder sb8 = new StringBuilder("Can't change restrictions from ");
                                                                                    ArrayList arrayList37 = fVar2.n;
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
                                                                                    yb.f(sb8.toString(), equals3);
                                                                                }
                                                                                fVar2.n = arrayList8;
                                                                            }
                                                                            HashMap hashMap8 = fVar2.b;
                                                                            if (!arrayList32.isEmpty()) {
                                                                                int i53 = 0;
                                                                                while (i53 < arrayList32.size()) {
                                                                                    e eVar2 = (e) arrayList32.get(i53);
                                                                                    String str38 = eVar2.a;
                                                                                    e eVar3 = (e) hashMap8.get(str38);
                                                                                    if (eVar3 != null) {
                                                                                        boolean equals4 = eVar3.equals(eVar2);
                                                                                        arrayList7 = arrayList32;
                                                                                        Object[] objArr = {str38, eVar3.d, Double.valueOf(eVar3.c), eVar2.d, Double.valueOf(eVar2.c)};
                                                                                        if (!equals4) {
                                                                                            throw new IllegalArgumentException(zb.a("Can't change %s from %s %s to %s %s", objArr));
                                                                                        }
                                                                                    } else {
                                                                                        arrayList7 = arrayList32;
                                                                                    }
                                                                                    hashMap8.put(str38, eVar2);
                                                                                    i53++;
                                                                                    arrayList32 = arrayList7;
                                                                                }
                                                                            }
                                                                            if (valueOf != null) {
                                                                                Boolean bool2 = fVar2.o;
                                                                                if (bool2 != null) {
                                                                                    yb.i(bool2.equals(valueOf), "Can't change contentMayVary from %s to %s", fVar2.o, valueOf);
                                                                                }
                                                                                fVar2.o = valueOf;
                                                                            }
                                                                            if (str12 != null) {
                                                                                String str39 = fVar2.p;
                                                                                if (str39 != null) {
                                                                                    yb.i(str39.equals(str12), "Can't change timelineOccupies from %s to %s", fVar2.p, str12);
                                                                                }
                                                                                fVar2.p = str12;
                                                                            }
                                                                            if (str10 != null) {
                                                                                String str40 = fVar2.q;
                                                                                if (str40 != null) {
                                                                                    yb.i(str40.equals(str10), "Can't change timelineStyle from %s to %s", fVar2.q, str10);
                                                                                }
                                                                                fVar2.q = str10;
                                                                            }
                                                                            if (j56 != -9223372036854775807L) {
                                                                                long j64 = fVar2.r;
                                                                                if (j64 != -9223372036854775807L) {
                                                                                    yb.e("Can't change skipControlOffsetUs from %s to %s", j64, j56, j64 == j56);
                                                                                }
                                                                                fVar2.r = j56;
                                                                            }
                                                                            if (j57 != -9223372036854775807L) {
                                                                                long j65 = fVar2.s;
                                                                                if (j65 != -9223372036854775807L) {
                                                                                    yb.e("Can't change skipControlDurationUs from %s to %s", j65, j57, j65 == j57);
                                                                                }
                                                                                fVar2.s = j57;
                                                                            }
                                                                            if (i52 != null) {
                                                                                String str41 = fVar2.t;
                                                                                if (str41 != null) {
                                                                                    yb.i(str41.equals(i52), "Can't change skipControlLabelId from %s to %s", fVar2.t, i52);
                                                                                }
                                                                                fVar2.t = i52;
                                                                            }
                                                                            linkedHashMap2.put(j51, fVar2);
                                                                            str3 = str8;
                                                                            j10 = j14;
                                                                            i12 = i21;
                                                                            j11 = j24;
                                                                            str4 = str15;
                                                                            hashMap2 = hashMap7;
                                                                            arrayList3 = arrayList5;
                                                                            arrayList2 = arrayList4;
                                                                            i11 = 0;
                                                                            pVar2 = pVar;
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
                                                                            lVar = lVar2;
                                                                            str17 = str26;
                                                                            arrayList14 = arrayList27;
                                                                            hVar2 = hVar;
                                                                            mVar2 = mVar;
                                                                            hashMap4 = hashMap2;
                                                                            str18 = str3;
                                                                            j14 = j10;
                                                                            arrayList15 = arrayList;
                                                                            str14 = str2;
                                                                        }
                                                                    }
                                                                }
                                                                str10 = null;
                                                                double g162 = g(C, T0, -1.0d, dVar);
                                                                if (g162 >= 0.0d) {
                                                                }
                                                                str11 = str19;
                                                                double g172 = g(C, U0, -1.0d, dVar);
                                                                if (g172 >= 0.0d) {
                                                                }
                                                                String i522 = i(C, V0, null, hashMap3, dVar);
                                                                ArrayList arrayList322 = new ArrayList();
                                                                String substring3 = C.substring(17);
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
                                                                    hVar8 = hVar9;
                                                                }
                                                            }
                                                            str19 = null;
                                                            i16 = i(C, S0, null, hashMap3, dVar);
                                                            if (i16 != null) {
                                                            }
                                                            str10 = null;
                                                            double g1622 = g(C, T0, -1.0d, dVar);
                                                            if (g1622 >= 0.0d) {
                                                            }
                                                            str11 = str19;
                                                            double g1722 = g(C, U0, -1.0d, dVar);
                                                            if (g1722 >= 0.0d) {
                                                            }
                                                            String i5222 = i(C, V0, null, hashMap3, dVar);
                                                            ArrayList arrayList3222 = new ArrayList();
                                                            String substring32 = C.substring(17);
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
                                                                hVar8 = hVar9;
                                                            }
                                                        } else {
                                                            str2 = str2;
                                                        }
                                                    }
                                                    arrayList27 = arrayList27;
                                                    hVar = hVar7;
                                                    str8 = str32;
                                                    arrayList4 = arrayList26;
                                                    tVar7 = tVar11;
                                                    treeMap = treeMap2;
                                                    linkedHashMap2 = linkedHashMap;
                                                    arrayList5 = arrayList12;
                                                    if (C.startsWith("#")) {
                                                        str3 = str8;
                                                        j10 = j14;
                                                        i12 = i21;
                                                        j11 = j24;
                                                        str4 = str15;
                                                        hashMap2 = hashMap7;
                                                        arrayList3 = arrayList5;
                                                        arrayList2 = arrayList4;
                                                        i11 = 0;
                                                        pVar2 = pVar;
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
                                                        lVar = lVar2;
                                                        str17 = str26;
                                                        arrayList14 = arrayList27;
                                                        hVar2 = hVar;
                                                        mVar2 = mVar;
                                                        hashMap4 = hashMap2;
                                                        str18 = str3;
                                                        j14 = j10;
                                                        arrayList15 = arrayList;
                                                        str14 = str2;
                                                    } else {
                                                        String hexString3 = str == null ? null : str26 != null ? str26 : Long.toHexString(j21);
                                                        long j66 = j21 + 1;
                                                        String k10 = k(C, hashMap3, dVar);
                                                        j jVar6 = (j) hashMap7.get(k10);
                                                        if (j14 == -1) {
                                                            j12 = 0;
                                                        } else {
                                                            if (z16 && jVar2 == null && jVar6 == null) {
                                                                jVar6 = new j(k10, 0L, j22, null, null);
                                                                hashMap7.put(k10, jVar6);
                                                            }
                                                            j12 = j22;
                                                        }
                                                        if (tVar7 != null || treeMap.isEmpty()) {
                                                            str9 = str8;
                                                            i15 = 0;
                                                            tVar3 = tVar7;
                                                        } else {
                                                            i15 = 0;
                                                            b2.s[] sVarArr3 = (b2.s[]) treeMap.values().toArray(new b2.s[0]);
                                                            str9 = str8;
                                                            b2.t tVar13 = new b2.t(str9, true, sVarArr3);
                                                            if (tVar6 == null) {
                                                                tVar6 = b(str9, sVarArr3);
                                                            }
                                                            tVar3 = tVar13;
                                                        }
                                                        String str42 = hexString3;
                                                        long j67 = j14;
                                                        long j68 = j23;
                                                        long j69 = j24;
                                                        arrayList5.add(new j(k10, jVar2 != null ? jVar2 : jVar6, str15, j69, i10, j68, tVar3, str, str42, j12, j67, i21, arrayList4));
                                                        long j70 = j68 + j69;
                                                        ArrayList arrayList38 = new ArrayList();
                                                        if (j14 != -1) {
                                                            j12 += j67;
                                                        }
                                                        j22 = j12;
                                                        linkedHashMap3 = linkedHashMap2;
                                                        j21 = j66;
                                                        hashMap4 = hashMap7;
                                                        j23 = j70;
                                                        i18 = i15;
                                                        i21 = i18;
                                                        i19 = i10;
                                                        tVar7 = tVar3;
                                                        str16 = str;
                                                        uri2 = str5;
                                                        j14 = -1;
                                                        j24 = 0;
                                                        lVar = lVar2;
                                                        str17 = str26;
                                                        arrayList14 = arrayList27;
                                                        hVar2 = hVar;
                                                        str14 = str2;
                                                        str15 = str14;
                                                        mVar2 = mVar;
                                                        arrayList13 = arrayList38;
                                                        j19 = j23;
                                                        arrayList12 = arrayList5;
                                                        treeMap2 = treeMap;
                                                        pVar2 = pVar;
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
                                            hVar = hVar2;
                                            j11 = j24;
                                            str4 = str15;
                                            hashMap2 = hashMap7;
                                            linkedHashMap2 = linkedHashMap;
                                            arrayList2 = arrayList26;
                                            str5 = uri2;
                                        }
                                        pVar2 = pVar;
                                        str18 = str32;
                                        i19 = i24;
                                        lVar = lVar2;
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
                                pVar2 = pVar;
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
                                lVar = lVar2;
                                str17 = str26;
                                arrayList14 = arrayList27;
                                hVar2 = hVar;
                                mVar2 = mVar;
                                hashMap4 = hashMap2;
                                str18 = str3;
                                j14 = j10;
                                arrayList15 = arrayList;
                                str14 = str2;
                            }
                            i19 = i24;
                            lVar = lVar2;
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
                lVar = lVar2;
                linkedHashMap3 = linkedHashMap;
                arrayList15 = arrayList;
            }
            hashMap4 = hashMap7;
        }
        throw new r();
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
    public static p e(k6.c cVar, Uri uri, o2.d dVar) {
        int i10;
        char c10;
        ArrayList arrayList;
        o oVar;
        String str;
        ArrayList arrayList2;
        int parseInt;
        String str2;
        o oVar2;
        String str3;
        o oVar3;
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
        String w10;
        b2.o oVar4;
        String i14;
        String str6;
        int i15;
        int i16;
        Uri g7;
        ArrayList arrayList7;
        HashMap hashMap3;
        ArrayList arrayList8;
        int i17;
        String[] d02;
        b2.o oVar5;
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
            boolean B = cVar.B();
            Pattern pattern = l0;
            ArrayList arrayList17 = arrayList13;
            boolean z13 = z11;
            Pattern pattern2 = q0;
            boolean z14 = z12;
            if (!B) {
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
                    o oVar6 = (o) arrayList24.get(i18);
                    Uri uri3 = oVar6.a;
                    x xVar = oVar6.b;
                    if (hashSet2.add(uri3)) {
                        yb.p(xVar.l == null);
                        ArrayList arrayList26 = (ArrayList) hashMap6.get(oVar6.a);
                        arrayList26.getClass();
                        hashMap = hashMap6;
                        hashSet = hashSet2;
                        u0 u0Var = new u0(new o2.s(null, null, arrayList26));
                        b2.w a2 = xVar.a();
                        a2.k = u0Var;
                        arrayList25.add(new o(oVar6.a, new x(a2), oVar6.c, oVar6.d, oVar6.e, oVar6.f, oVar6.g, oVar6.h));
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
                x xVar2 = null;
                while (i19 < arrayList18.size()) {
                    ArrayList arrayList28 = arrayList18;
                    String str7 = (String) arrayList28.get(i19);
                    String j10 = j(str7, s0, hashMap5, dVar);
                    String j11 = j(str7, pattern2, hashMap5, dVar);
                    ArrayList arrayList29 = arrayList25;
                    ArrayList arrayList30 = arrayList27;
                    String i20 = i(str7, L, null, hashMap5, dVar);
                    b2.w wVar = new b2.w();
                    x xVar3 = xVar2;
                    wVar.a = a1.g.D(j10, ":", j11);
                    wVar.b = j11;
                    wVar.q = w0.n("application/x-mpegURL");
                    boolean f7 = f(str7, w0, dVar);
                    ?? r29 = f7;
                    if (f(str7, x0, dVar)) {
                        r29 = (f7 ? 1 : 0) | 2;
                    }
                    wVar.e = f(str7, v0, dVar) ? r29 | 4 : r29;
                    int i21 = i19;
                    String i22 = i(str7, t0, null, hashMap5, dVar);
                    if (TextUtils.isEmpty(i22)) {
                        arrayList18 = arrayList28;
                        i10 = 0;
                    } else {
                        String str8 = n0.a;
                        String[] split = i22.split(",", -1);
                        i10 = n0.l(split, "public.accessibility.describes-video") ? 512 : 0;
                        arrayList18 = arrayList28;
                        if (n0.l(split, "public.accessibility.transcribes-spoken-dialog")) {
                            i10 |= 4096;
                        }
                        if (n0.l(split, "public.accessibility.describes-music-and-sound")) {
                            i10 |= 1024;
                        }
                        if (n0.l(split, "public.easy-to-read")) {
                            i10 |= 8192;
                        }
                    }
                    wVar.f = i10;
                    wVar.d = i(str7, p0, null, hashMap5, dVar);
                    String i23 = i(str7, pattern, null, hashMap5, dVar);
                    Uri g10 = i23 == null ? null : e2.e.g(uri2, i23);
                    String str9 = uri2;
                    Pattern pattern3 = pattern;
                    u0 u0Var2 = new u0(new o2.s(j10, j11, Collections.EMPTY_LIST));
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
                                    oVar = (o) arrayList24.get(i24);
                                    if (!j10.equals(oVar.e)) {
                                        i24++;
                                    }
                                } else {
                                    oVar = null;
                                }
                            }
                            if (oVar != null) {
                                String w11 = n0.w(3, oVar.b.k);
                                wVar.j = w11;
                                str = w0.d(w11);
                            } else {
                                str = null;
                            }
                            if (str == null) {
                                str = "text/vtt";
                            }
                            wVar.r = w0.n(str);
                            wVar.k = u0Var2;
                            if (g10 != null) {
                                arrayList2 = arrayList22;
                                arrayList2.add(new n(g10, new x(wVar), j11, i20));
                            } else {
                                arrayList2 = arrayList22;
                                e2.a.l("HlsPlaylistParser", "EXT-X-MEDIA tag with missing mandatory URI attribute: skipping");
                            }
                            arrayList27 = arrayList30;
                            xVar2 = xVar3;
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
                            wVar.r = w0.n(str2);
                            wVar.O = parseInt;
                            arrayList32.add(new x(wVar));
                            arrayList21 = arrayList31;
                            arrayList27 = arrayList32;
                            arrayList2 = arrayList22;
                            xVar2 = xVar3;
                            break;
                        case 2:
                            arrayList = arrayList20;
                            int i25 = 0;
                            while (true) {
                                if (i25 < arrayList24.size()) {
                                    oVar2 = (o) arrayList24.get(i25);
                                    int i26 = i25;
                                    if (!j10.equals(oVar2.d)) {
                                        i25 = i26 + 1;
                                    }
                                } else {
                                    oVar2 = null;
                                }
                            }
                            if (oVar2 != null) {
                                String w12 = n0.w(1, oVar2.b.k);
                                wVar.j = w12;
                                str3 = w0.d(w12);
                            } else {
                                str3 = null;
                            }
                            o oVar7 = oVar2;
                            String i27 = i(str7, r, null, hashMap5, dVar);
                            if (i27 != null) {
                                String str10 = n0.a;
                                wVar.J = Integer.parseInt(i27.split("/", 2)[0]);
                                if ("audio/eac3".equals(str3) && i27.endsWith("/JOC")) {
                                    wVar.j = "ec+3";
                                    str3 = "audio/eac3-joc";
                                }
                            }
                            wVar.r = w0.n(str3);
                            if (g10 != null) {
                                wVar.k = u0Var2;
                                arrayList21.add(new n(g10, new x(wVar), j11, i20));
                            } else {
                                ArrayList arrayList33 = arrayList21;
                                if (oVar7 != null) {
                                    xVar2 = new x(wVar);
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
                            xVar2 = xVar3;
                            break;
                        case 3:
                            int i28 = 0;
                            while (true) {
                                if (i28 < arrayList24.size()) {
                                    oVar3 = (o) arrayList24.get(i28);
                                    if (!j10.equals(oVar3.c)) {
                                        i28++;
                                    }
                                } else {
                                    oVar3 = null;
                                }
                            }
                            if (oVar3 != null) {
                                x xVar4 = oVar3.b;
                                String w13 = n0.w(2, xVar4.k);
                                wVar.j = w13;
                                wVar.r = w0.n(w0.d(w13));
                                wVar.y = xVar4.z;
                                wVar.z = xVar4.A;
                                wVar.C = xVar4.D;
                            }
                            if (g10 != null) {
                                wVar.k = u0Var2;
                                arrayList = arrayList20;
                                arrayList.add(new n(g10, new x(wVar), j11, i20));
                                arrayList2 = arrayList22;
                                arrayList27 = arrayList30;
                                xVar2 = xVar3;
                                break;
                            }
                        default:
                            arrayList2 = arrayList22;
                            arrayList = arrayList20;
                            arrayList27 = arrayList30;
                            xVar2 = xVar3;
                            break;
                    }
                    i19 = i21 + 1;
                    arrayList25 = arrayList29;
                    arrayList20 = arrayList;
                    arrayList22 = arrayList2;
                    uri2 = str9;
                    pattern = pattern3;
                }
                return new p(uri.toString(), arrayList19, arrayList25, arrayList20, arrayList21, arrayList22, arrayList17, xVar2, z13 ? Collections.EMPTY_LIST : arrayList27, z14, hashMap5, arrayList23);
            }
            String C = cVar.C();
            ArrayList arrayList34 = arrayList12;
            if (C.startsWith("#EXT")) {
                arrayList16.add(C);
            }
            boolean startsWith = C.startsWith("#EXT-X-I-FRAME-STREAM-INF");
            ArrayList arrayList35 = arrayList16;
            if (C.startsWith("#EXT-X-DEFINE")) {
                String i29 = i(C, pattern2, null, hashMap5, dVar);
                if (i29 != null) {
                    l(i29, hashMap5);
                    hashMap5.put(i29, j(C, B0, hashMap5, dVar));
                } else {
                    String j14 = j(C, r0, hashMap5, dVar);
                    l(j14, hashMap5);
                    String queryParameter = uri.getQueryParameter(j14);
                    if (queryParameter == null) {
                        throw x0.b("QUERYPARAM \"" + j14 + "\" not found in playlist URI", null);
                    }
                    hashMap5.put(j14, queryParameter);
                }
            } else if (C.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
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
            } else if (C.startsWith("#EXT-X-MEDIA")) {
                arrayList14.add(C);
            } else if (C.startsWith("#EXT-X-SESSION-KEY")) {
                b2.s c11 = c(C, i(C, j0, "identity", hashMap5, dVar), hashMap5, dVar);
                if (c11 != null) {
                    String j15 = j(C, i0, hashMap5, dVar);
                    arrayList15.add(new b2.t(("SAMPLE-AES-CENC".equals(j15) || "SAMPLE-AES-CTR".equals(j15)) ? "cenc" : "cbcs", true, c11));
                }
            } else if (C.startsWith("#EXT-X-STREAM-INF") || startsWith) {
                boolean contains = z13 | C.contains("CLOSED-CAPTIONS=NONE");
                if (startsWith) {
                    z10 = contains;
                    i11 = 16384;
                } else {
                    z10 = contains;
                    i11 = 0;
                }
                int parseInt2 = Integer.parseInt(j(C, n, Collections.EMPTY_MAP, dVar));
                Matcher a10 = o2.d.a(C, c, dVar);
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
                String i30 = i(C, s, null, hashMap5, dVar);
                arrayList5 = arrayList10;
                String i31 = i(C, v, null, hashMap5, dVar);
                arrayList6 = arrayList14;
                String i32 = i(C, w, null, hashMap5, dVar);
                if (i32 != null) {
                    String str11 = n0.a;
                    String[] split2 = i32.split(",", 2)[0].split("/", -1);
                    str4 = split2[0];
                    if (split2.length > 1) {
                        str5 = split2[1];
                        hashMap2 = hashMap4;
                        i13 = 2;
                        w10 = n0.w(i13, i31);
                        if (w0.j(w10, str4) && (str4 == null || !(i30 == null || str5 == null || ((i30.equals("PQ") && !str5.equals("db1p")) || ((i30.equals("SDR") && !str5.equals("db2g")) || (i30.equals("HLG") && !str5.startsWith("db4"))))))) {
                            b2.o x9 = n0.x(i31, str4, str5);
                            if (str4 == null) {
                                str4 = w10;
                            }
                            d02 = n0.d0(i31);
                            if (d02.length != 0) {
                                oVar5 = x9;
                            } else {
                                StringBuilder sb3 = new StringBuilder();
                                int length = d02.length;
                                int i33 = 0;
                                while (i33 < length) {
                                    String[] strArr = d02;
                                    String str12 = strArr[i33];
                                    b2.o oVar8 = x9;
                                    int i34 = length;
                                    if (2 != w0.h(w0.d(str12))) {
                                        if (sb3.length() > 0) {
                                            sb3.append(",");
                                        }
                                        sb3.append(str12);
                                    }
                                    i33++;
                                    d02 = strArr;
                                    length = i34;
                                    x9 = oVar8;
                                }
                                oVar5 = x9;
                                if (sb3.length() > 0) {
                                    sb2 = sb3.toString();
                                    i31 = sb2 != null ? a1.g.D(str4, ",", sb2) : str4;
                                    oVar4 = oVar5;
                                }
                            }
                            sb2 = null;
                            if (sb2 != null) {
                            }
                            oVar4 = oVar5;
                        } else {
                            oVar4 = null;
                        }
                        boolean equals = TextUtils.equals(i(C, y, null, hashMap5, dVar), "true");
                        String i35 = i(C, x, null, hashMap5, dVar);
                        String i36 = i(C, E, null, hashMap5, dVar);
                        String i37 = i(C, F, null, hashMap5, dVar);
                        String i38 = i(C, G, null, hashMap5, dVar);
                        i14 = i(C, H, null, hashMap5, dVar);
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
                        String i39 = i(C, I, null, hashMap5, dVar);
                        float parseFloat = i39 != null ? Float.parseFloat(i39) : -1.0f;
                        String i40 = i(C, J, null, hashMap5, dVar);
                        String i41 = i(C, d, null, hashMap5, dVar);
                        String i42 = i(C, e, null, hashMap5, dVar);
                        String i43 = i(C, f, null, hashMap5, dVar);
                        String i44 = i(C, h, null, hashMap5, dVar);
                        String i45 = i(C, K, null, hashMap5, dVar);
                        if (startsWith) {
                            g7 = e2.e.g(uri2, j(C, pattern, hashMap5, dVar));
                        } else {
                            if (!cVar.B()) {
                                throw x0.b("#EXT-X-STREAM-INF must be followed by another line", null);
                            }
                            g7 = e2.e.g(uri2, k(cVar.C(), hashMap5, dVar));
                        }
                        Uri uri4 = g7;
                        b2.w wVar2 = new b2.w();
                        wVar2.a = Integer.toString(arrayList36.size());
                        wVar2.q = w0.n("application/x-mpegURL");
                        wVar2.j = i31;
                        wVar2.h = i12;
                        wVar2.i = parseInt2;
                        wVar2.y = i15;
                        wVar2.z = i16;
                        wVar2.C = parseFloat;
                        wVar2.f = i11;
                        wVar2.H = oVar4;
                        wVar2.m = equals;
                        wVar2.r = w0.n(i35);
                        wVar2.n = Long.parseLong(str6);
                        wVar2.o = i37;
                        wVar2.p = Integer.parseInt(i38);
                        arrayList7 = arrayList36;
                        arrayList7.add(new o(uri4, new x(wVar2), i41, i42, i43, i44, i40, i45));
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
                w10 = n0.w(i13, i31);
                if (w0.j(w10, str4)) {
                    b2.o x92 = n0.x(i31, str4, str5);
                    if (str4 == null) {
                    }
                    d02 = n0.d0(i31);
                    if (d02.length != 0) {
                    }
                    sb2 = null;
                    if (sb2 != null) {
                    }
                    oVar4 = oVar5;
                    boolean equals2 = TextUtils.equals(i(C, y, null, hashMap5, dVar), "true");
                    String i352 = i(C, x, null, hashMap5, dVar);
                    String i362 = i(C, E, null, hashMap5, dVar);
                    String i372 = i(C, F, null, hashMap5, dVar);
                    String i382 = i(C, G, null, hashMap5, dVar);
                    i14 = i(C, H, null, hashMap5, dVar);
                    if (i14 != null) {
                    }
                    ArrayList arrayList362 = arrayList9;
                    String i392 = i(C, I, null, hashMap5, dVar);
                    if (i392 != null) {
                    }
                    String i402 = i(C, J, null, hashMap5, dVar);
                    String i412 = i(C, d, null, hashMap5, dVar);
                    String i422 = i(C, e, null, hashMap5, dVar);
                    String i432 = i(C, f, null, hashMap5, dVar);
                    String i442 = i(C, h, null, hashMap5, dVar);
                    String i452 = i(C, K, null, hashMap5, dVar);
                    if (startsWith) {
                    }
                    Uri uri42 = g7;
                    b2.w wVar22 = new b2.w();
                    wVar22.a = Integer.toString(arrayList362.size());
                    wVar22.q = w0.n("application/x-mpegURL");
                    wVar22.j = i31;
                    wVar22.h = i12;
                    wVar22.i = parseInt2;
                    wVar22.y = i15;
                    wVar22.z = i16;
                    wVar22.C = parseFloat;
                    wVar22.f = i11;
                    wVar22.H = oVar4;
                    wVar22.m = equals2;
                    wVar22.r = w0.n(i352);
                    wVar22.n = Long.parseLong(str6);
                    wVar22.o = i372;
                    wVar22.p = Integer.parseInt(i382);
                    arrayList7 = arrayList362;
                    arrayList7.add(new o(uri42, new x(wVar22), i412, i422, i432, i442, i402, i452));
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
                oVar4 = null;
                boolean equals22 = TextUtils.equals(i(C, y, null, hashMap5, dVar), "true");
                String i3522 = i(C, x, null, hashMap5, dVar);
                String i3622 = i(C, E, null, hashMap5, dVar);
                String i3722 = i(C, F, null, hashMap5, dVar);
                String i3822 = i(C, G, null, hashMap5, dVar);
                i14 = i(C, H, null, hashMap5, dVar);
                if (i14 != null) {
                }
                ArrayList arrayList3622 = arrayList9;
                String i3922 = i(C, I, null, hashMap5, dVar);
                if (i3922 != null) {
                }
                String i4022 = i(C, J, null, hashMap5, dVar);
                String i4122 = i(C, d, null, hashMap5, dVar);
                String i4222 = i(C, e, null, hashMap5, dVar);
                String i4322 = i(C, f, null, hashMap5, dVar);
                String i4422 = i(C, h, null, hashMap5, dVar);
                String i4522 = i(C, K, null, hashMap5, dVar);
                if (startsWith) {
                }
                Uri uri422 = g7;
                b2.w wVar222 = new b2.w();
                wVar222.a = Integer.toString(arrayList3622.size());
                wVar222.q = w0.n("application/x-mpegURL");
                wVar222.j = i31;
                wVar222.h = i12;
                wVar222.i = parseInt2;
                wVar222.y = i15;
                wVar222.z = i16;
                wVar222.C = parseFloat;
                wVar222.f = i11;
                wVar222.H = oVar4;
                wVar222.m = equals22;
                wVar222.r = w0.n(i3522);
                wVar222.n = Long.parseLong(str6);
                wVar222.o = i3722;
                wVar222.p = Integer.parseInt(i3822);
                arrayList7 = arrayList3622;
                arrayList7.add(new o(uri422, new x(wVar222), i4122, i4222, i4322, i4422, i4022, i4522));
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
        throw x0.b("Couldn't match " + pattern.pattern() + " in " + str, null);
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
            throw x0.b("duplicate variable name \"" + str + "\"", null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0073 A[Catch: all -> 0x00a0, LOOP:0: B:13:0x0073->B:38:0x0073, LOOP_START, TryCatch #0 {all -> 0x00a0, blocks: (B:3:0x0019, B:5:0x0022, B:7:0x002a, B:10:0x0033, B:13:0x0073, B:15:0x0079, B:18:0x0084, B:57:0x008e, B:20:0x00a2, B:22:0x00aa, B:24:0x00b2, B:26:0x00ba, B:28:0x00c2, B:30:0x00ca, B:32:0x00d2, B:34:0x00da, B:36:0x00e3, B:41:0x00e7, B:75:0x0109, B:76:0x010f, B:80:0x003a, B:82:0x0040, B:87:0x0049, B:89:0x0052, B:94:0x005b, B:96:0x0061, B:98:0x0067, B:100:0x006c), top: B:2:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0109 A[Catch: all -> 0x00a0, TRY_ENTER, TryCatch #0 {all -> 0x00a0, blocks: (B:3:0x0019, B:5:0x0022, B:7:0x002a, B:10:0x0033, B:13:0x0073, B:15:0x0079, B:18:0x0084, B:57:0x008e, B:20:0x00a2, B:22:0x00aa, B:24:0x00b2, B:26:0x00ba, B:28:0x00c2, B:30:0x00ca, B:32:0x00d2, B:34:0x00da, B:36:0x00e3, B:41:0x00e7, B:75:0x0109, B:76:0x010f, B:80:0x003a, B:82:0x0040, B:87:0x0049, B:89:0x0052, B:94:0x005b, B:96:0x0061, B:98:0x0067, B:100:0x006c), top: B:2:0x0019 }] */
    @Override // y2.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object S1(Uri uri, g2.k kVar) {
        String trim;
        int i10;
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
                    throw x0.b("Input does not start with the #EXTM3U header.", null);
                }
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException unused) {
                        }
                        throw x0.b("Failed to parse the playlist, could not identify any tags.", null);
                    }
                    trim = readLine.trim();
                    if (!trim.isEmpty()) {
                        i10 = 23;
                        if (!trim.startsWith("#EXT-X-STREAM-INF")) {
                            if (trim.startsWith("#EXT-X-TARGETDURATION") || trim.startsWith("#EXT-X-MEDIA-SEQUENCE") || trim.startsWith("#EXTINF") || trim.startsWith("#EXT-X-KEY") || trim.startsWith("#EXT-X-BYTERANGE") || trim.equals("#EXT-X-DISCONTINUITY") || trim.equals("#EXT-X-DISCONTINUITY-SEQUENCE") || trim.equals("#EXT-X-ENDLIST")) {
                                break;
                            }
                            arrayDeque.add(trim);
                        } else {
                            arrayDeque.add(trim);
                            p e10 = e(new k6.c(i10, arrayDeque, bufferedReader), uri, dVar);
                            try {
                                bufferedReader.close();
                            } catch (IOException unused2) {
                            }
                            return e10;
                        }
                    }
                }
                arrayDeque.add(trim);
                m d10 = d(this.a, this.b, new k6.c(i10, arrayDeque, bufferedReader), uri, dVar);
                try {
                    bufferedReader.close();
                } catch (IOException unused3) {
                }
                return d10;
            }
            while (read != -1 && Character.isWhitespace(read)) {
                read = bufferedReader.read();
            }
            int i11 = 0;
            while (true) {
                if (i11 >= 7) {
                    while (read != -1 && Character.isWhitespace(read) && !n0.O(read)) {
                        read = bufferedReader.read();
                    }
                    z10 = n0.O(read);
                } else {
                    if (read != "#EXTM3U".charAt(i11)) {
                        break;
                    }
                    read = bufferedReader.read();
                    i11++;
                }
            }
            if (z10) {
            }
        } finally {
            String str = n0.a;
            try {
                bufferedReader.close();
            } catch (IOException unused4) {
            }
        }
    }
}
