package r2;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import b8.ac;
import b8.zb;
import d2.s0;
import d2.u0;
import d2.v0;
import g2.n0;
import g9.i0;
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
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class s implements a3.s {
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
    public static final Pattern w = Pattern.compile("CODECS=\"((?:.|\f)+?)\"");
    public static final Pattern x = Pattern.compile("SUPPLEMENTAL-CODECS=\"((?:.|\f)+?)\"");
    public static final Pattern y = Pattern.compile("MIME=\"(.+?)\"");
    public static final Pattern E = Pattern.compile("CACHED=\"(.+?)\"");
    public static final Pattern F = Pattern.compile("DOCID=\"(.+?)\"");
    public static final Pattern G = Pattern.compile("DOCFILENAME=\"(.+?)\"");
    public static final Pattern H = Pattern.compile("ACCOUNT=\"(.+?)\"");
    public static final Pattern I = Pattern.compile("RESOLUTION=(\\d+x\\d+)");
    public static final Pattern J = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");
    public static final Pattern K = Pattern.compile("PATHWAY-ID=\"((?:.|\f)+?)\"");
    public static final Pattern L = Pattern.compile("STABLE-VARIANT-ID=\"((?:.|\f)+?)\"");
    public static final Pattern M = Pattern.compile("STABLE-RENDITION-ID=\"((?:.|\f)+?)\"");
    public static final Pattern N = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");
    public static final Pattern O = Pattern.compile("DURATION=([\\d\\.]+)\\b");
    public static final Pattern P = Pattern.compile("[:,]DURATION=([\\d\\.]+)\\b");
    public static final Pattern Q = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");
    public static final Pattern R = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");
    public static final Pattern S = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");
    public static final Pattern T = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");
    public static final Pattern U = a("CAN-SKIP-DATERANGES");
    public static final Pattern V = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");
    public static final Pattern W = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");
    public static final Pattern X = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");
    public static final Pattern Y = a("CAN-BLOCK-RELOAD");
    public static final Pattern Z = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");
    public static final Pattern a0 = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");
    public static final Pattern b0 = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");
    public static final Pattern c0 = Pattern.compile("LAST-MSN=(\\d+)\\b");
    public static final Pattern d0 = Pattern.compile("LAST-PART=(\\d+)\\b");
    public static final Pattern e0 = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");
    public static final Pattern f0 = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");
    public static final Pattern g0 = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");
    public static final Pattern h0 = Pattern.compile("BYTERANGE-START=(\\d+)\\b");
    public static final Pattern i0 = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");
    public static final Pattern j0 = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");
    public static final Pattern k0 = Pattern.compile("KEYFORMAT=\"((?:.|\f)+?)\"");
    public static final Pattern l0 = Pattern.compile("KEYFORMATVERSIONS=\"((?:.|\f)+?)\"");
    public static final Pattern m0 = Pattern.compile("URI=\"((?:.|\f)+?)\"");
    public static final Pattern n0 = Pattern.compile("IV=([^,.*]+)");
    public static final Pattern o0 = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");
    public static final Pattern p0 = Pattern.compile("TYPE=(PART|MAP)");
    public static final Pattern q0 = Pattern.compile("LANGUAGE=\"((?:.|\f)+?)\"");
    public static final Pattern r0 = Pattern.compile("NAME=\"((?:.|\f)+?)\"");
    public static final Pattern s0 = Pattern.compile("QUERYPARAM=\"((?:.|\f)+?)\"");
    public static final Pattern t0 = Pattern.compile("GROUP-ID=\"((?:.|\f)+?)\"");
    public static final Pattern u0 = Pattern.compile("CHARACTERISTICS=\"((?:.|\f)+?)\"");
    public static final Pattern v0 = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");
    public static final Pattern w0 = a("AUTOSELECT");
    public static final Pattern x0 = a("DEFAULT");
    public static final Pattern y0 = a("FORCED");
    public static final Pattern z0 = a("INDEPENDENT");
    public static final Pattern A0 = a("GAP");
    public static final Pattern B0 = a("PRECISE");
    public static final Pattern C0 = Pattern.compile("VALUE=\"((?:.|\f)+?)\"");
    public static final Pattern D0 = Pattern.compile("IMPORT=\"((?:.|\f)+?)\"");
    public static final Pattern E0 = Pattern.compile("[:,]ID=\"((?:.|\f)+?)\"");
    public static final Pattern F0 = Pattern.compile("CLASS=\"((?:.|\f)+?)\"");
    public static final Pattern G0 = Pattern.compile("START-DATE=\"((?:.|\f)+?)\"");
    public static final Pattern H0 = Pattern.compile("CUE=\"((?:.|\f)+?)\"");
    public static final Pattern I0 = Pattern.compile("END-DATE=\"((?:.|\f)+?)\"");
    public static final Pattern J0 = Pattern.compile("PLANNED-DURATION=([\\d\\.]+)\\b");
    public static final Pattern K0 = a("END-ON-NEXT");
    public static final Pattern L0 = Pattern.compile("X-ASSET-URI=\"((?:.|\f)+?)\"");
    public static final Pattern M0 = Pattern.compile("X-ASSET-LIST=\"((?:.|\f)+?)\"");
    public static final Pattern N0 = Pattern.compile("X-RESUME-OFFSET=(-?[\\d\\.]+)\\b");
    public static final Pattern O0 = Pattern.compile("X-PLAYOUT-LIMIT=([\\d\\.]+)\\b");
    public static final Pattern P0 = Pattern.compile("X-SNAP=\"((?:.|\f)+?)\"");
    public static final Pattern Q0 = Pattern.compile("X-RESTRICT=\"((?:.|\f)+?)\"");
    public static final Pattern R0 = Pattern.compile("X-CONTENT-MAY-VARY=\"((?:.|\f)+?)\"");
    public static final Pattern S0 = Pattern.compile("X-TIMELINE-OCCUPIES=\"((?:.|\f)+?)\"");
    public static final Pattern T0 = Pattern.compile("X-TIMELINE-STYLE=\"((?:.|\f)+?)\"");
    public static final Pattern U0 = Pattern.compile("X-SKIP-CONTROL-OFFSET=([\\d\\.]+)\\b");
    public static final Pattern V0 = Pattern.compile("X-SKIP-CONTROL-DURATION=([\\d\\.]+)\\b");
    public static final Pattern W0 = Pattern.compile("X-SKIP-CONTROL-LABEL-ID=\"((?:.|\f)+?)\"");
    public static final Pattern X0 = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");
    public static final Pattern Y0 = Pattern.compile("\\b(X-[A-Z0-9-]+)=");

    public s(p pVar, m mVar) {
        this.a = pVar;
        this.b = mVar;
    }

    public static Pattern a(String str) {
        return Pattern.compile(str.concat("=(NO|YES)"));
    }

    public static d2.s b(String str, d2.r[] rVarArr) {
        d2.r[] rVarArr2 = new d2.r[rVarArr.length];
        for (int i3 = 0; i3 < rVarArr.length; i3++) {
            d2.r rVar = rVarArr[i3];
            rVarArr2[i3] = new d2.r(rVar.b, rVar.c, rVar.d, null);
        }
        return new d2.s(str, true, rVarArr2);
    }

    public static d2.r c(String str, String str2, HashMap hashMap, q2.d dVar) {
        String i3 = i(str, l0, "1", hashMap, dVar);
        boolean equals = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2);
        Pattern pattern = m0;
        if (equals) {
            String j10 = j(str, pattern, hashMap, dVar);
            return new d2.r(d2.m.e, null, "video/mp4", Base64.decode(j10.substring(j10.indexOf(44)), 0));
        }
        if ("com.widevine".equals(str2)) {
            UUID uuid = d2.m.e;
            String str3 = n0.a;
            return new d2.r(uuid, null, "hls", str.getBytes(StandardCharsets.UTF_8));
        }
        if (!"com.microsoft.playready".equals(str2) || !"1".equals(i3)) {
            return null;
        }
        String j11 = j(str, pattern, hashMap, dVar);
        byte[] decode = Base64.decode(j11.substring(j11.indexOf(44)), 0);
        UUID uuid2 = d2.m.f;
        return new d2.r(uuid2, null, "video/mp4", y3.q.a(uuid2, null, decode));
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
    public static m d(p pVar, m mVar, p7.d dVar, Uri uri, q2.d dVar2) {
        HashMap hashMap;
        Iterator it;
        g gVar;
        ArrayList arrayList;
        LinkedHashMap linkedHashMap;
        String str;
        int i3;
        String str2;
        int i10;
        long j10;
        int i11;
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
        int i12;
        d2.s sVar;
        d2.s sVar2;
        String str7;
        int i13;
        String str8;
        ArrayList arrayList4;
        ArrayList arrayList5;
        long j12;
        String str9;
        int i14;
        d2.s sVar3;
        String i15;
        String str10;
        String str11;
        Matcher b10;
        String str12;
        ArrayList arrayList6;
        ArrayList arrayList7;
        ArrayList arrayList8;
        ArrayList arrayList9;
        char c2;
        ArrayList arrayList10;
        Matcher matcher;
        boolean z10;
        ArrayList arrayList11;
        e eVar;
        int i16;
        char c10;
        String str13;
        long j13;
        d2.s sVar4;
        d2.s sVar5;
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
        int i17 = 0;
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
        int i18 = 0;
        int i19 = 0;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        int i20 = 0;
        int i21 = 0;
        boolean z16 = false;
        int i22 = 1;
        d2.s sVar6 = null;
        d2.s sVar7 = null;
        String str16 = null;
        String str17 = null;
        h hVar2 = null;
        String str18 = null;
        while (true) {
            int i23 = i18;
            String str19 = "POINT";
            l lVar2 = lVar;
            if (!dVar.v()) {
                ArrayList arrayList16 = arrayList12;
                ArrayList arrayList17 = arrayList13;
                ArrayList arrayList18 = arrayList14;
                ArrayList arrayList19 = arrayList15;
                LinkedHashMap linkedHashMap4 = linkedHashMap3;
                h hVar3 = hVar2;
                HashMap hashMap5 = new HashMap();
                int i24 = i17;
                while (i24 < arrayList18.size()) {
                    ArrayList arrayList20 = arrayList18;
                    i iVar = (i) arrayList20.get(i24);
                    long j26 = iVar.b;
                    if (j26 == -1) {
                        j26 = (j18 + arrayList16.size()) - (arrayList17.isEmpty() ? 1L : 0L);
                    }
                    int i25 = iVar.c;
                    if (i25 == -1 && j15 != -9223372036854775807L) {
                        i25 = (arrayList17.isEmpty() ? ((j) g9.o.n(arrayList16)).y : arrayList17).size() - 1;
                    }
                    Uri uri3 = iVar.a;
                    hashMap5.put(uri3, new i(uri3, j26, i25));
                    i24++;
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
                return new m(i21, uri.toString(), arrayList19, j16, z14, j20, z13, i19, j18, i22, j17, j15, z12, z15, j20 != 0, sVar6, arrayList16, arrayList17, lVar2, hashMap6, arrayList21, jVar2);
            }
            String z19 = dVar.z();
            HashMap hashMap7 = hashMap4;
            if (z19.startsWith("#EXT")) {
                arrayList15.add(z19);
            }
            if (z19.startsWith("#EXT-X-PLAYLIST-TYPE")) {
                String j33 = j(z19, S, hashMap3, dVar2);
                if ("VOD".equals(j33)) {
                    i21 = 1;
                } else if ("EVENT".equals(j33)) {
                    i21 = 2;
                }
                i18 = i23;
                lVar = lVar2;
            } else if (z19.equals("#EXT-X-I-FRAMES-ONLY")) {
                i18 = i23;
                lVar = lVar2;
                hashMap4 = hashMap7;
                z16 = true;
            } else {
                if (z19.startsWith("#EXT-X-START")) {
                    arrayList = arrayList15;
                    linkedHashMap = linkedHashMap3;
                    long parseDouble = (long) (Double.parseDouble(j(z19, e0, Collections.EMPTY_MAP, dVar2)) * 1000000.0d);
                    z14 = f(z19, B0, dVar2);
                    j16 = parseDouble;
                } else {
                    arrayList = arrayList15;
                    linkedHashMap = linkedHashMap3;
                    if (z19.startsWith("#EXT-X-SERVER-CONTROL")) {
                        double g7 = g(z19, T, -9.223372036854776E18d, dVar2);
                        long j34 = g7 == -9.223372036854776E18d ? -9223372036854775807L : (long) (g7 * 1000000.0d);
                        boolean f10 = f(z19, U, dVar2);
                        double g10 = g(z19, W, -9.223372036854776E18d, dVar2);
                        long j35 = g10 == -9.223372036854776E18d ? -9223372036854775807L : (long) (g10 * 1000000.0d);
                        double g11 = g(z19, X, -9.223372036854776E18d, dVar2);
                        arrayList15 = arrayList;
                        i18 = i23;
                        hashMap4 = hashMap7;
                        linkedHashMap3 = linkedHashMap;
                        lVar = new l(j34, f10, j35, g11 == -9.223372036854776E18d ? -9223372036854775807L : (long) (g11 * 1000000.0d), f(z19, Y, dVar2));
                    } else if (z19.startsWith("#EXT-X-PART-INF")) {
                        j15 = (long) (Double.parseDouble(j(z19, Q, Collections.EMPTY_MAP, dVar2)) * 1000000.0d);
                    } else {
                        boolean startsWith = z19.startsWith("#EXT-X-MAP");
                        Pattern pattern = g0;
                        Pattern pattern2 = m0;
                        if (startsWith) {
                            String j36 = j(z19, pattern2, hashMap3, dVar2);
                            String i26 = i(z19, pattern, null, hashMap3, dVar2);
                            if (i26 != null) {
                                String str24 = n0.a;
                                String[] split = i26.split("@", -1);
                                j14 = Long.parseLong(split[i17]);
                                if (split.length > 1) {
                                    j22 = Long.parseLong(split[1]);
                                }
                            }
                            long j37 = j14;
                            long j38 = j37 == -1 ? 0L : j22;
                            if (str16 != null && str17 == null) {
                                throw v0.b("The encryption IV attribute must be present when an initialization segment is encrypted with METHOD=AES-128.", null);
                            }
                            j jVar3 = new j(j36, j38, j37, str16, str17);
                            String str25 = str17;
                            if (j37 != -1) {
                                j38 += j37;
                            }
                            j22 = j38;
                            jVar2 = jVar3;
                            i18 = i23;
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
                            if (z19.startsWith("#EXT-X-TARGETDURATION")) {
                                j17 = Integer.parseInt(j(z19, N, Collections.EMPTY_MAP, dVar2)) * 1000000;
                            } else if (z19.startsWith("#EXT-X-MEDIA-SEQUENCE")) {
                                j21 = Long.parseLong(j(z19, Z, Collections.EMPTY_MAP, dVar2));
                                i18 = i23;
                                j18 = j21;
                                lVar = lVar2;
                                hashMap4 = hashMap7;
                                linkedHashMap3 = linkedHashMap;
                                arrayList15 = arrayList;
                                str17 = str26;
                                arrayList14 = arrayList27;
                                arrayList13 = arrayList26;
                            } else if (z19.startsWith("#EXT-X-VERSION")) {
                                i22 = Integer.parseInt(j(z19, R, Collections.EMPTY_MAP, dVar2));
                            } else {
                                if (z19.startsWith("#EXT-X-DEFINE")) {
                                    String i27 = i(z19, r0, null, hashMap3, dVar2);
                                    String i28 = i(z19, s0, null, hashMap3, dVar2);
                                    if (i27 != null) {
                                        l(i27, hashMap3);
                                        hashMap3.put(i27, j(z19, C0, hashMap3, dVar2));
                                    } else if (i28 != null) {
                                        l(i28, hashMap3);
                                        String queryParameter = uri.getQueryParameter(i28);
                                        if (queryParameter == null) {
                                            throw v0.b("QUERYPARAM \"" + i28 + "\" not found in playlist URI", null);
                                        }
                                        hashMap3.put(i28, queryParameter);
                                    } else {
                                        String j39 = j(z19, D0, hashMap3, dVar2);
                                        l(j39, hashMap3);
                                        String str27 = (String) pVar2.l.get(j39);
                                        if (str27 != null) {
                                            hashMap3.put(j39, str27);
                                        }
                                    }
                                    str = str16;
                                    i3 = i23;
                                    str2 = str14;
                                    i10 = i17;
                                    j10 = j14;
                                    i11 = i20;
                                    hVar = hVar2;
                                    str3 = str18;
                                    j11 = j24;
                                    str4 = str15;
                                    hashMap2 = hashMap7;
                                    linkedHashMap2 = linkedHashMap;
                                    arrayList2 = arrayList26;
                                    str5 = uri2;
                                    treeMap = treeMap2;
                                } else if (z19.startsWith("#EXTINF")) {
                                    j24 = new BigDecimal(j(z19, a0, Collections.EMPTY_MAP, dVar2)).multiply(new BigDecimal(1000000L)).longValue();
                                    str15 = i(z19, b0, str14, hashMap3, dVar2);
                                } else if (z19.startsWith("#EXT-X-SKIP")) {
                                    int parseInt = Integer.parseInt(j(z19, V, Collections.EMPTY_MAP, dVar2));
                                    zb.p((mVar2 == null || !arrayList12.isEmpty()) ? i17 : 1);
                                    String str28 = n0.a;
                                    long j40 = mVar2.k;
                                    i0 i0Var = mVar2.r;
                                    int i29 = (int) (j18 - j40);
                                    int i30 = parseInt + i29;
                                    if (i29 >= 0 && i30 <= i0Var.size()) {
                                        long j41 = j23;
                                        str17 = str26;
                                        while (i29 < i30) {
                                            j jVar4 = (j) i0Var.get(i29);
                                            if (j18 != mVar2.k) {
                                                int i31 = (mVar2.j - i19) + jVar4.d;
                                                i0 i0Var2 = jVar4.y;
                                                ArrayList arrayList28 = new ArrayList();
                                                int i32 = i17;
                                                long j42 = j41;
                                                while (i32 < i0Var2.size()) {
                                                    h hVar4 = (h) i0Var2.get(i32);
                                                    arrayList28.add(new h(hVar4.a, hVar4.b, hVar4.c, i31, j42, hVar4.f, hVar4.h, hVar4.n, hVar4.r, hVar4.s, hVar4.w, hVar4.x, hVar4.y));
                                                    j42 += hVar4.c;
                                                    i32++;
                                                    str14 = str14;
                                                }
                                                str6 = str14;
                                                jVar4 = new j(jVar4.a, jVar4.b, jVar4.x, jVar4.c, i31, j41, jVar4.f, jVar4.h, jVar4.n, jVar4.r, jVar4.s, jVar4.w, arrayList28);
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
                                            int i33 = jVar4.d;
                                            j jVar5 = jVar4.b;
                                            d2.s sVar8 = jVar4.f;
                                            String str30 = jVar4.h;
                                            if (str29 == null || !str29.equals(Long.toHexString(j21))) {
                                                str17 = str29;
                                            }
                                            j21++;
                                            i29++;
                                            i23 = i33;
                                            jVar2 = jVar5;
                                            str16 = str30;
                                            sVar7 = sVar8;
                                            j19 = j41;
                                            str14 = str6;
                                        }
                                        pVar2 = pVar;
                                        i18 = i23;
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
                                    if (z19.startsWith("#EXT-X-KEY")) {
                                        String j45 = j(z19, j0, hashMap3, dVar2);
                                        String i34 = i(z19, k0, "identity", hashMap3, dVar2);
                                        if ("NONE".equals(j45)) {
                                            treeMap2.clear();
                                            sVar7 = null;
                                            str16 = null;
                                            str17 = null;
                                        } else {
                                            String i35 = i(z19, n0, null, hashMap3, dVar2);
                                            if (!"identity".equals(i34)) {
                                                String str31 = str18;
                                                if (str31 == null) {
                                                    str18 = ("SAMPLE-AES-CENC".equals(j45) || "SAMPLE-AES-CTR".equals(j45)) ? "cenc" : "cbcs";
                                                } else {
                                                    str18 = str31;
                                                }
                                                d2.r c11 = c(z19, i34, hashMap3, dVar2);
                                                if (c11 != null) {
                                                    treeMap2.put(i34, c11);
                                                    str17 = i35;
                                                    sVar7 = null;
                                                    str16 = null;
                                                }
                                            } else if ("AES-128".equals(j45)) {
                                                str16 = j(z19, pattern2, hashMap3, dVar2);
                                                str17 = i35;
                                            }
                                            str17 = i35;
                                            str16 = null;
                                        }
                                        pVar2 = pVar;
                                        i18 = i23;
                                        lVar = lVar2;
                                        hashMap4 = hashMap7;
                                        linkedHashMap3 = linkedHashMap;
                                        arrayList15 = arrayList;
                                    } else {
                                        String str32 = str18;
                                        if (z19.startsWith("#EXT-X-BYTERANGE")) {
                                            String j46 = j(z19, f0, hashMap3, dVar2);
                                            String str33 = n0.a;
                                            String[] split2 = j46.split("@", -1);
                                            j14 = Long.parseLong(split2[i17]);
                                            if (split2.length > 1) {
                                                j22 = Long.parseLong(split2[1]);
                                            }
                                        } else if (z19.startsWith("#EXT-X-DISCONTINUITY-SEQUENCE")) {
                                            i19 = Integer.parseInt(z19.substring(z19.indexOf(58) + 1));
                                            pVar2 = pVar;
                                            str18 = str32;
                                            i18 = i23;
                                            lVar = lVar2;
                                            hashMap4 = hashMap7;
                                            linkedHashMap3 = linkedHashMap;
                                            arrayList15 = arrayList;
                                            str17 = str26;
                                            arrayList14 = arrayList27;
                                            arrayList13 = arrayList26;
                                            str14 = str2;
                                            z13 = true;
                                        } else if (z19.equals("#EXT-X-DISCONTINUITY")) {
                                            i18 = i23 + 1;
                                            pVar2 = pVar;
                                            str18 = str32;
                                            lVar = lVar2;
                                            hashMap4 = hashMap7;
                                            linkedHashMap3 = linkedHashMap;
                                            arrayList15 = arrayList;
                                            str17 = str26;
                                        } else {
                                            if (z19.startsWith("#EXT-X-PROGRAM-DATE-TIME")) {
                                                if (j20 == 0) {
                                                    j20 = n0.S(n0.V(z19.substring(z19.indexOf(58) + 1))) - j23;
                                                }
                                            } else if (z19.equals("#EXT-X-GAP")) {
                                                pVar2 = pVar;
                                                str18 = str32;
                                                i18 = i23;
                                                lVar = lVar2;
                                                hashMap4 = hashMap7;
                                                linkedHashMap3 = linkedHashMap;
                                                arrayList15 = arrayList;
                                                str17 = str26;
                                                arrayList14 = arrayList27;
                                                arrayList13 = arrayList26;
                                                str14 = str2;
                                                i20 = 1;
                                            } else if (z19.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                                                pVar2 = pVar;
                                                str18 = str32;
                                                i18 = i23;
                                                lVar = lVar2;
                                                hashMap4 = hashMap7;
                                                linkedHashMap3 = linkedHashMap;
                                                arrayList15 = arrayList;
                                                str17 = str26;
                                                arrayList14 = arrayList27;
                                                arrayList13 = arrayList26;
                                                str14 = str2;
                                                z12 = true;
                                            } else if (z19.equals("#EXT-X-ENDLIST")) {
                                                pVar2 = pVar;
                                                str18 = str32;
                                                i18 = i23;
                                                lVar = lVar2;
                                                hashMap4 = hashMap7;
                                                linkedHashMap3 = linkedHashMap;
                                                arrayList15 = arrayList;
                                                str17 = str26;
                                                arrayList14 = arrayList27;
                                                arrayList13 = arrayList26;
                                                str14 = str2;
                                                z15 = true;
                                            } else if (z19.startsWith("#EXT-X-RENDITION-REPORT")) {
                                                long h7 = h(z19, c0, dVar2);
                                                Matcher b11 = q2.d.b(z19, d0, dVar2);
                                                if (b11.find()) {
                                                    String group = b11.group(1);
                                                    group.getClass();
                                                    i12 = Integer.parseInt(group);
                                                } else {
                                                    i12 = -1;
                                                }
                                                arrayList27.add(new i(Uri.parse(g2.f.f(uri2, j(z19, pattern2, hashMap3, dVar2))), h7, i12));
                                            } else if (z19.startsWith("#EXT-X-PRELOAD-HINT")) {
                                                h hVar5 = hVar2;
                                                if (hVar5 == null && "PART".equals(j(z19, p0, hashMap3, dVar2))) {
                                                    d2.s sVar9 = sVar7;
                                                    String j47 = j(z19, pattern2, hashMap3, dVar2);
                                                    long h10 = h(z19, h0, dVar2);
                                                    long h11 = h(z19, i0, dVar2);
                                                    String hexString = str16 == null ? null : str26 != null ? str26 : Long.toHexString(j21);
                                                    if (sVar9 != null || treeMap2.isEmpty()) {
                                                        sVar = sVar9;
                                                    } else {
                                                        d2.r[] rVarArr = (d2.r[]) treeMap2.values().toArray(new d2.r[i17]);
                                                        d2.s sVar10 = new d2.s(str32, true, rVarArr);
                                                        if (sVar6 == null) {
                                                            sVar2 = b(str32, rVarArr);
                                                            sVar = sVar10;
                                                            if (h10 == -1 && h11 == -1) {
                                                                str7 = str16;
                                                                i13 = i23;
                                                                hVar2 = hVar5;
                                                            } else {
                                                                if (h10 == -1) {
                                                                    h10 = 0;
                                                                }
                                                                long j48 = j19;
                                                                h hVar6 = new h(j47, jVar2, 0L, i23, j48, sVar, str16, hexString, h10, h11, false, false, true);
                                                                j19 = j48;
                                                                str7 = str16;
                                                                i13 = i23;
                                                                hVar2 = hVar6;
                                                            }
                                                            arrayList14 = arrayList27;
                                                            str18 = str32;
                                                            sVar6 = sVar2;
                                                            sVar7 = sVar;
                                                            i18 = i13;
                                                            str16 = str7;
                                                            lVar = lVar2;
                                                            hashMap4 = hashMap7;
                                                            linkedHashMap3 = linkedHashMap;
                                                            arrayList15 = arrayList;
                                                            str17 = str26;
                                                            arrayList13 = arrayList26;
                                                            str14 = str2;
                                                            i17 = 0;
                                                            pVar2 = pVar;
                                                        } else {
                                                            sVar = sVar10;
                                                        }
                                                    }
                                                    sVar2 = sVar6;
                                                    if (h10 == -1) {
                                                    }
                                                    if (h10 == -1) {
                                                    }
                                                    long j482 = j19;
                                                    h hVar62 = new h(j47, jVar2, 0L, i23, j482, sVar, str16, hexString, h10, h11, false, false, true);
                                                    j19 = j482;
                                                    str7 = str16;
                                                    i13 = i23;
                                                    hVar2 = hVar62;
                                                    arrayList14 = arrayList27;
                                                    str18 = str32;
                                                    sVar6 = sVar2;
                                                    sVar7 = sVar;
                                                    i18 = i13;
                                                    str16 = str7;
                                                    lVar = lVar2;
                                                    hashMap4 = hashMap7;
                                                    linkedHashMap3 = linkedHashMap;
                                                    arrayList15 = arrayList;
                                                    str17 = str26;
                                                    arrayList13 = arrayList26;
                                                    str14 = str2;
                                                    i17 = 0;
                                                    pVar2 = pVar;
                                                } else {
                                                    str = str16;
                                                    i3 = i23;
                                                    arrayList27 = arrayList27;
                                                    str5 = uri2;
                                                    hVar = hVar5;
                                                    str3 = str32;
                                                    treeMap = treeMap2;
                                                    i10 = i17;
                                                    j10 = j14;
                                                    i11 = i20;
                                                    j11 = j24;
                                                    str4 = str15;
                                                    hashMap2 = hashMap7;
                                                    linkedHashMap2 = linkedHashMap;
                                                    arrayList2 = arrayList26;
                                                }
                                            } else {
                                                str = str16;
                                                i3 = i23;
                                                d2.s sVar11 = sVar7;
                                                h hVar7 = hVar2;
                                                if (z19.startsWith("#EXT-X-PART")) {
                                                    String hexString2 = str == null ? null : str26 != null ? str26 : Long.toHexString(j21);
                                                    String j49 = j(z19, pattern2, hashMap3, dVar2);
                                                    long parseDouble2 = (long) (Double.parseDouble(j(z19, O, Collections.EMPTY_MAP, dVar2)) * 1000000.0d);
                                                    boolean f11 = f(z19, z0, dVar2) | (z12 && arrayList26.isEmpty());
                                                    boolean f12 = f(z19, A0, dVar2);
                                                    String i36 = i(z19, pattern, null, hashMap3, dVar2);
                                                    if (i36 != null) {
                                                        String str34 = n0.a;
                                                        String[] split3 = i36.split("@", -1);
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
                                                        d2.r[] rVarArr2 = (d2.r[]) treeMap2.values().toArray(new d2.r[0]);
                                                        d2.s sVar12 = new d2.s(str32, true, rVarArr2);
                                                        if (sVar6 == null) {
                                                            sVar5 = b(str32, rVarArr2);
                                                            sVar4 = sVar12;
                                                            long j50 = j19;
                                                            arrayList26.add(new h(j49, jVar2, parseDouble2, i3, j50, sVar4, str, hexString2, j25, j13, f12, f11, false));
                                                            j19 = j50 + parseDouble2;
                                                            if (j13 != -1) {
                                                                j25 += j13;
                                                            }
                                                            arrayList14 = arrayList27;
                                                            str18 = str32;
                                                            sVar6 = sVar5;
                                                            arrayList13 = arrayList26;
                                                            sVar7 = sVar4;
                                                            i18 = i3;
                                                            str16 = str;
                                                            uri2 = str13;
                                                            lVar = lVar2;
                                                            hashMap4 = hashMap7;
                                                            linkedHashMap3 = linkedHashMap;
                                                            arrayList15 = arrayList;
                                                            str17 = str26;
                                                            str14 = str2;
                                                            i17 = 0;
                                                            pVar2 = pVar;
                                                            hVar2 = hVar7;
                                                        } else {
                                                            sVar4 = sVar12;
                                                        }
                                                    }
                                                    sVar5 = sVar6;
                                                    long j502 = j19;
                                                    arrayList26.add(new h(j49, jVar2, parseDouble2, i3, j502, sVar4, str, hexString2, j25, j13, f12, f11, false));
                                                    j19 = j502 + parseDouble2;
                                                    if (j13 != -1) {
                                                    }
                                                    arrayList14 = arrayList27;
                                                    str18 = str32;
                                                    sVar6 = sVar5;
                                                    arrayList13 = arrayList26;
                                                    sVar7 = sVar4;
                                                    i18 = i3;
                                                    str16 = str;
                                                    uri2 = str13;
                                                    lVar = lVar2;
                                                    hashMap4 = hashMap7;
                                                    linkedHashMap3 = linkedHashMap;
                                                    arrayList15 = arrayList;
                                                    str17 = str26;
                                                    str14 = str2;
                                                    i17 = 0;
                                                    pVar2 = pVar;
                                                    hVar2 = hVar7;
                                                } else {
                                                    str5 = uri2;
                                                    if (z19.startsWith("#EXT-X-DATERANGE")) {
                                                        if (i(z19, F0, str2, hashMap3, dVar2).equals("com.apple.hls.interstitial")) {
                                                            String j51 = j(z19, E0, hashMap3, dVar2);
                                                            String i37 = i(z19, L0, null, hashMap3, dVar2);
                                                            Uri parse = i37 != null ? Uri.parse(i37) : null;
                                                            arrayList4 = arrayList26;
                                                            String i38 = i(z19, M0, null, hashMap3, dVar2);
                                                            Uri parse2 = i38 != null ? Uri.parse(i38) : null;
                                                            sVar7 = sVar11;
                                                            String i39 = i(z19, G0, null, hashMap3, dVar2);
                                                            long S2 = i39 != null ? n0.S(n0.V(i39)) : -9223372036854775807L;
                                                            String i40 = i(z19, I0, null, hashMap3, dVar2);
                                                            long S3 = i40 != null ? n0.S(n0.V(i40)) : -9223372036854775807L;
                                                            ArrayList arrayList29 = new ArrayList();
                                                            str2 = str2;
                                                            String i41 = i(z19, H0, null, hashMap3, dVar2);
                                                            if (i41 != null) {
                                                                String str35 = n0.a;
                                                                treeMap = treeMap2;
                                                                String[] split4 = i41.split(",", -1);
                                                                int length = split4.length;
                                                                int i42 = 0;
                                                                while (i42 < length) {
                                                                    int i43 = i42;
                                                                    String trim = split4[i42].trim();
                                                                    trim.getClass();
                                                                    switch (trim.hashCode()) {
                                                                        case 79491:
                                                                            i16 = length;
                                                                            if (trim.equals("PRE")) {
                                                                                c10 = 0;
                                                                                break;
                                                                            }
                                                                            c10 = 65535;
                                                                            break;
                                                                        case 2430593:
                                                                            i16 = length;
                                                                            if (trim.equals("ONCE")) {
                                                                                c10 = 1;
                                                                                break;
                                                                            }
                                                                            c10 = 65535;
                                                                            break;
                                                                        case 2461856:
                                                                            i16 = length;
                                                                            if (trim.equals("POST")) {
                                                                                c10 = 2;
                                                                                break;
                                                                            }
                                                                            c10 = 65535;
                                                                            break;
                                                                        default:
                                                                            i16 = length;
                                                                            c10 = 65535;
                                                                            break;
                                                                    }
                                                                    switch (c10) {
                                                                        case 0:
                                                                        case 1:
                                                                        case 2:
                                                                            arrayList29.add(trim);
                                                                            break;
                                                                    }
                                                                    i42 = i43 + 1;
                                                                    length = i16;
                                                                }
                                                            } else {
                                                                treeMap = treeMap2;
                                                            }
                                                            arrayList27 = arrayList27;
                                                            double g12 = g(z19, P, -1.0d, dVar2);
                                                            long j52 = g12 >= 0.0d ? (long) (g12 * 1000000.0d) : -9223372036854775807L;
                                                            h hVar8 = hVar7;
                                                            double g13 = g(z19, J0, -1.0d, dVar2);
                                                            long j53 = g13 >= 0.0d ? (long) (g13 * 1000000.0d) : -9223372036854775807L;
                                                            boolean f13 = f(z19, K0, dVar2);
                                                            double g14 = g(z19, N0, Double.MIN_VALUE, dVar2);
                                                            long j54 = g14 != Double.MIN_VALUE ? (long) (g14 * 1000000.0d) : -9223372036854775807L;
                                                            double g15 = g(z19, O0, -1.0d, dVar2);
                                                            long j55 = g15 >= 0.0d ? (long) (g15 * 1000000.0d) : -9223372036854775807L;
                                                            ArrayList arrayList30 = new ArrayList();
                                                            String i44 = i(z19, P0, null, hashMap3, dVar2);
                                                            if (i44 != null) {
                                                                String str36 = n0.a;
                                                                String[] split5 = i44.split(",", -1);
                                                                int length2 = split5.length;
                                                                str8 = str32;
                                                                int i45 = 0;
                                                                while (i45 < length2) {
                                                                    int i46 = i45;
                                                                    String trim2 = split5[i45].trim();
                                                                    trim2.getClass();
                                                                    String[] strArr = split5;
                                                                    if (trim2.equals("IN") || trim2.equals("OUT")) {
                                                                        arrayList30.add(trim2);
                                                                    }
                                                                    i45 = i46 + 1;
                                                                    split5 = strArr;
                                                                }
                                                            } else {
                                                                str8 = str32;
                                                            }
                                                            ArrayList arrayList31 = new ArrayList();
                                                            String i47 = i(z19, Q0, null, hashMap3, dVar2);
                                                            if (i47 != null) {
                                                                String str37 = n0.a;
                                                                String[] split6 = i47.split(",", -1);
                                                                int length3 = split6.length;
                                                                int i48 = 0;
                                                                while (i48 < length3) {
                                                                    String[] strArr2 = split6;
                                                                    String trim3 = split6[i48].trim();
                                                                    trim3.getClass();
                                                                    int i49 = length3;
                                                                    if (trim3.equals("JUMP") || trim3.equals("SKIP")) {
                                                                        arrayList31.add(trim3);
                                                                    }
                                                                    i48++;
                                                                    length3 = i49;
                                                                    split6 = strArr2;
                                                                }
                                                            }
                                                            Boolean valueOf = i(z19, R0, null, hashMap3, dVar2) != null ? Boolean.valueOf(!r4.equals("NO")) : null;
                                                            String i50 = i(z19, S0, null, hashMap3, dVar2);
                                                            if (i50 != null) {
                                                                if (i50.equals("RANGE")) {
                                                                    str19 = "RANGE";
                                                                }
                                                                i15 = i(z19, T0, null, hashMap3, dVar2);
                                                                if (i15 != null) {
                                                                    str10 = "PRIMARY";
                                                                    if (!i15.equals("PRIMARY")) {
                                                                        str10 = "HIGHLIGHT";
                                                                    }
                                                                    double g16 = g(z19, U0, -1.0d, dVar2);
                                                                    long j56 = g16 >= 0.0d ? (long) (g16 * 1000000.0d) : -9223372036854775807L;
                                                                    str11 = str19;
                                                                    double g17 = g(z19, V0, -1.0d, dVar2);
                                                                    long j57 = g17 >= 0.0d ? (long) (g17 * 1000000.0d) : -9223372036854775807L;
                                                                    String i51 = i(z19, W0, null, hashMap3, dVar2);
                                                                    ArrayList arrayList32 = new ArrayList();
                                                                    String substring = z19.substring(17);
                                                                    b10 = q2.d.b(substring, Y0, dVar2);
                                                                    while (true) {
                                                                        str12 = str11;
                                                                        if (b10.find()) {
                                                                            String group2 = b10.group();
                                                                            group2.getClass();
                                                                            h hVar9 = hVar8;
                                                                            switch (group2.hashCode()) {
                                                                                case -2136701954:
                                                                                    if (group2.equals("X-SNAP=")) {
                                                                                        c2 = 0;
                                                                                        break;
                                                                                    }
                                                                                    c2 = 65535;
                                                                                    break;
                                                                                case -1843050726:
                                                                                    if (group2.equals("X-CONTENT-MAY-VARY=")) {
                                                                                        c2 = 1;
                                                                                        break;
                                                                                    }
                                                                                    c2 = 65535;
                                                                                    break;
                                                                                case -148960310:
                                                                                    if (group2.equals("X-PLAYOUT-LIMIT=")) {
                                                                                        c2 = 2;
                                                                                        break;
                                                                                    }
                                                                                    c2 = 65535;
                                                                                    break;
                                                                                case -36345757:
                                                                                    if (group2.equals("X-TIMELINE-STYLE=")) {
                                                                                        c2 = 3;
                                                                                        break;
                                                                                    }
                                                                                    c2 = 65535;
                                                                                    break;
                                                                                case 397239341:
                                                                                    if (group2.equals("X-ASSET-LIST=")) {
                                                                                        c2 = 4;
                                                                                        break;
                                                                                    }
                                                                                    c2 = 65535;
                                                                                    break;
                                                                                case 850193465:
                                                                                    if (group2.equals("X-TIMELINE-OCCUPIES=")) {
                                                                                        c2 = 5;
                                                                                        break;
                                                                                    }
                                                                                    c2 = 65535;
                                                                                    break;
                                                                                case 1065650400:
                                                                                    if (group2.equals("X-SKIP-CONTROL-DURATION=")) {
                                                                                        c2 = 6;
                                                                                        break;
                                                                                    }
                                                                                    c2 = 65535;
                                                                                    break;
                                                                                case 1274498945:
                                                                                    if (group2.equals("X-SKIP-CONTROL-OFFSET=")) {
                                                                                        c2 = 7;
                                                                                        break;
                                                                                    }
                                                                                    c2 = 65535;
                                                                                    break;
                                                                                case 1472528844:
                                                                                    if (group2.equals("X-RESTRICT=")) {
                                                                                        c2 = '\b';
                                                                                        break;
                                                                                    }
                                                                                    c2 = 65535;
                                                                                    break;
                                                                                case 1748487807:
                                                                                    if (group2.equals("X-RESUME-OFFSET=")) {
                                                                                        c2 = '\t';
                                                                                        break;
                                                                                    }
                                                                                    c2 = 65535;
                                                                                    break;
                                                                                case 1814205923:
                                                                                    if (group2.equals("X-ASSET-URI=")) {
                                                                                        c2 = '\n';
                                                                                        break;
                                                                                    }
                                                                                    c2 = 65535;
                                                                                    break;
                                                                                case 2080546752:
                                                                                    if (group2.equals("X-SKIP-CONTROL-LABEL-ID=")) {
                                                                                        c2 = 11;
                                                                                        break;
                                                                                    }
                                                                                    c2 = 65535;
                                                                                    break;
                                                                                default:
                                                                                    c2 = 65535;
                                                                                    break;
                                                                            }
                                                                            switch (c2) {
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
                                                                                    matcher = b10;
                                                                                    z10 = f13;
                                                                                    arrayList11 = arrayList12;
                                                                                    break;
                                                                                default:
                                                                                    matcher = b10;
                                                                                    String j58 = com.google.android.recaptcha.internal.a.j(group2, 1, 0);
                                                                                    String q10 = t4.c.q(j58, "=");
                                                                                    int length4 = q10.length() + substring.indexOf(q10);
                                                                                    z10 = f13;
                                                                                    String substring2 = substring.substring(length4, (substring.length() == length4 + 1 ? 1 : 2) + length4);
                                                                                    if (substring2.startsWith("\"")) {
                                                                                        eVar = new e(0, j58, j(substring, Pattern.compile(j58 + "=\"((?:.|\f)+?)\""), hashMap3, dVar2));
                                                                                        arrayList11 = arrayList12;
                                                                                        arrayList10 = arrayList29;
                                                                                    } else if (substring2.equals("0x") || substring2.equals("0X")) {
                                                                                        arrayList11 = arrayList12;
                                                                                        arrayList10 = arrayList29;
                                                                                        eVar = new e(1, j58, j(substring, Pattern.compile(j58 + "=(0[xX][A-F0-9]+)"), hashMap3, dVar2));
                                                                                    } else {
                                                                                        arrayList11 = arrayList12;
                                                                                        arrayList10 = arrayList29;
                                                                                        eVar = new e(j58, Double.parseDouble(j(substring, Pattern.compile(j58 + "=([\\d\\.]+)\\b"), Collections.EMPTY_MAP, dVar2)));
                                                                                    }
                                                                                    arrayList32.add(eVar);
                                                                                    break;
                                                                            }
                                                                            arrayList12 = arrayList11;
                                                                            str11 = str12;
                                                                            b10 = matcher;
                                                                            f13 = z10;
                                                                            arrayList29 = arrayList10;
                                                                            hVar8 = hVar9;
                                                                        } else {
                                                                            ArrayList arrayList33 = arrayList29;
                                                                            hVar = hVar8;
                                                                            boolean z20 = f13;
                                                                            linkedHashMap2 = linkedHashMap;
                                                                            ArrayList arrayList34 = arrayList12;
                                                                            f fVar2 = linkedHashMap2.containsKey(j51) ? (f) linkedHashMap2.get(j51) : new f(j51);
                                                                            if (parse == null) {
                                                                                fVar2.getClass();
                                                                            } else {
                                                                                Uri uri6 = fVar2.c;
                                                                                if (uri6 != null) {
                                                                                    zb.i(uri6.equals(parse), "Can't change assetUri from %s to %s", fVar2.c, parse);
                                                                                }
                                                                                fVar2.c = parse;
                                                                            }
                                                                            if (parse2 != null) {
                                                                                Uri uri7 = fVar2.d;
                                                                                if (uri7 != null) {
                                                                                    zb.i(uri7.equals(parse2), "Can't change assetListUri from %s to %s", fVar2.d, parse2);
                                                                                }
                                                                                fVar2.d = parse2;
                                                                            }
                                                                            if (S2 != -9223372036854775807L) {
                                                                                long j59 = fVar2.e;
                                                                                if (j59 != -9223372036854775807L) {
                                                                                    zb.g(j59 == S2, "Can't change startDateUnixUs from %s to %s", j59, S2);
                                                                                }
                                                                                fVar2.e = S2;
                                                                            }
                                                                            if (S3 != -9223372036854775807L) {
                                                                                long j60 = fVar2.f;
                                                                                if (j60 != -9223372036854775807L) {
                                                                                    zb.g(j60 == S3, "Can't change endDateUnixUs from %s to %s", j60, S3);
                                                                                }
                                                                                fVar2.f = S3;
                                                                            }
                                                                            if (j52 != -9223372036854775807L) {
                                                                                long j61 = fVar2.g;
                                                                                if (j61 != -9223372036854775807L) {
                                                                                    zb.g(j61 == j52, "Can't change durationUs from %s to %s", j61, j52);
                                                                                }
                                                                                fVar2.g = j52;
                                                                            }
                                                                            if (j53 != -9223372036854775807L) {
                                                                                long j62 = fVar2.h;
                                                                                if (j62 != -9223372036854775807L) {
                                                                                    zb.g(j62 == j53, "Can't change plannedDurationUs from %s to %s", j62, j53);
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
                                                                                    zb.e(sb2.toString(), equals);
                                                                                }
                                                                                fVar2.i = arrayList6;
                                                                            }
                                                                            if (z20) {
                                                                                fVar2.j = true;
                                                                            }
                                                                            if (j54 != -9223372036854775807L) {
                                                                                long j63 = fVar2.k;
                                                                                if (j63 != -9223372036854775807L) {
                                                                                    zb.g(j63 == j54, "Can't change resumeOffsetUs from %s to %s", j63, j54);
                                                                                }
                                                                                fVar2.k = j54;
                                                                            }
                                                                            if (j55 != -9223372036854775807L) {
                                                                                long j64 = fVar2.l;
                                                                                if (j64 != -9223372036854775807L) {
                                                                                    zb.g(j64 == j55, "Can't change playoutLimitUs from %s to %s", j64, j55);
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
                                                                                    zb.e(sb5.toString(), equals2);
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
                                                                                    zb.e(sb8.toString(), equals3);
                                                                                }
                                                                                fVar2.n = arrayList8;
                                                                            }
                                                                            HashMap hashMap8 = fVar2.b;
                                                                            if (!arrayList32.isEmpty()) {
                                                                                int i52 = 0;
                                                                                while (i52 < arrayList32.size()) {
                                                                                    e eVar2 = (e) arrayList32.get(i52);
                                                                                    String str38 = eVar2.a;
                                                                                    e eVar3 = (e) hashMap8.get(str38);
                                                                                    if (eVar3 != null) {
                                                                                        boolean equals4 = eVar3.equals(eVar2);
                                                                                        arrayList7 = arrayList32;
                                                                                        Object[] objArr = {str38, eVar3.d, Double.valueOf(eVar3.c), eVar2.d, Double.valueOf(eVar2.c)};
                                                                                        if (!equals4) {
                                                                                            throw new IllegalArgumentException(ac.a("Can't change %s from %s %s to %s %s", objArr));
                                                                                        }
                                                                                    } else {
                                                                                        arrayList7 = arrayList32;
                                                                                    }
                                                                                    hashMap8.put(str38, eVar2);
                                                                                    i52++;
                                                                                    arrayList32 = arrayList7;
                                                                                }
                                                                            }
                                                                            if (valueOf != null) {
                                                                                Boolean bool2 = fVar2.o;
                                                                                if (bool2 != null) {
                                                                                    zb.i(bool2.equals(valueOf), "Can't change contentMayVary from %s to %s", fVar2.o, valueOf);
                                                                                }
                                                                                fVar2.o = valueOf;
                                                                            }
                                                                            if (str12 != null) {
                                                                                String str39 = fVar2.p;
                                                                                if (str39 != null) {
                                                                                    zb.i(str39.equals(str12), "Can't change timelineOccupies from %s to %s", fVar2.p, str12);
                                                                                }
                                                                                fVar2.p = str12;
                                                                            }
                                                                            if (str10 != null) {
                                                                                String str40 = fVar2.q;
                                                                                if (str40 != null) {
                                                                                    zb.i(str40.equals(str10), "Can't change timelineStyle from %s to %s", fVar2.q, str10);
                                                                                }
                                                                                fVar2.q = str10;
                                                                            }
                                                                            if (j56 != -9223372036854775807L) {
                                                                                long j65 = fVar2.r;
                                                                                if (j65 != -9223372036854775807L) {
                                                                                    zb.g(j65 == j56, "Can't change skipControlOffsetUs from %s to %s", j65, j56);
                                                                                }
                                                                                fVar2.r = j56;
                                                                            }
                                                                            if (j57 != -9223372036854775807L) {
                                                                                long j66 = fVar2.s;
                                                                                if (j66 != -9223372036854775807L) {
                                                                                    zb.g(j66 == j57, "Can't change skipControlDurationUs from %s to %s", j66, j57);
                                                                                }
                                                                                fVar2.s = j57;
                                                                            }
                                                                            if (i51 != null) {
                                                                                String str41 = fVar2.t;
                                                                                if (str41 != null) {
                                                                                    zb.i(str41.equals(i51), "Can't change skipControlLabelId from %s to %s", fVar2.t, i51);
                                                                                }
                                                                                fVar2.t = i51;
                                                                            }
                                                                            linkedHashMap2.put(j51, fVar2);
                                                                            str3 = str8;
                                                                            j10 = j14;
                                                                            i11 = i20;
                                                                            j11 = j24;
                                                                            str4 = str15;
                                                                            hashMap2 = hashMap7;
                                                                            arrayList3 = arrayList5;
                                                                            arrayList2 = arrayList4;
                                                                            i10 = 0;
                                                                            pVar2 = pVar;
                                                                            linkedHashMap3 = linkedHashMap2;
                                                                            arrayList13 = arrayList2;
                                                                            i17 = i10;
                                                                            arrayList12 = arrayList3;
                                                                            str15 = str4;
                                                                            j24 = j11;
                                                                            i18 = i3;
                                                                            str16 = str;
                                                                            i20 = i11;
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
                                                                double g162 = g(z19, U0, -1.0d, dVar2);
                                                                if (g162 >= 0.0d) {
                                                                }
                                                                str11 = str19;
                                                                double g172 = g(z19, V0, -1.0d, dVar2);
                                                                if (g172 >= 0.0d) {
                                                                }
                                                                String i512 = i(z19, W0, null, hashMap3, dVar2);
                                                                ArrayList arrayList322 = new ArrayList();
                                                                String substring3 = z19.substring(17);
                                                                b10 = q2.d.b(substring3, Y0, dVar2);
                                                                while (true) {
                                                                    str12 = str11;
                                                                    if (b10.find()) {
                                                                    }
                                                                    arrayList12 = arrayList11;
                                                                    str11 = str12;
                                                                    b10 = matcher;
                                                                    f13 = z10;
                                                                    arrayList29 = arrayList10;
                                                                    hVar8 = hVar9;
                                                                }
                                                            }
                                                            str19 = null;
                                                            i15 = i(z19, T0, null, hashMap3, dVar2);
                                                            if (i15 != null) {
                                                            }
                                                            str10 = null;
                                                            double g1622 = g(z19, U0, -1.0d, dVar2);
                                                            if (g1622 >= 0.0d) {
                                                            }
                                                            str11 = str19;
                                                            double g1722 = g(z19, V0, -1.0d, dVar2);
                                                            if (g1722 >= 0.0d) {
                                                            }
                                                            String i5122 = i(z19, W0, null, hashMap3, dVar2);
                                                            ArrayList arrayList3222 = new ArrayList();
                                                            String substring32 = z19.substring(17);
                                                            b10 = q2.d.b(substring32, Y0, dVar2);
                                                            while (true) {
                                                                str12 = str11;
                                                                if (b10.find()) {
                                                                }
                                                                arrayList12 = arrayList11;
                                                                str11 = str12;
                                                                b10 = matcher;
                                                                f13 = z10;
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
                                                    sVar7 = sVar11;
                                                    treeMap = treeMap2;
                                                    linkedHashMap2 = linkedHashMap;
                                                    arrayList5 = arrayList12;
                                                    if (z19.startsWith("#")) {
                                                        str3 = str8;
                                                        j10 = j14;
                                                        i11 = i20;
                                                        j11 = j24;
                                                        str4 = str15;
                                                        hashMap2 = hashMap7;
                                                        arrayList3 = arrayList5;
                                                        arrayList2 = arrayList4;
                                                        i10 = 0;
                                                        pVar2 = pVar;
                                                        linkedHashMap3 = linkedHashMap2;
                                                        arrayList13 = arrayList2;
                                                        i17 = i10;
                                                        arrayList12 = arrayList3;
                                                        str15 = str4;
                                                        j24 = j11;
                                                        i18 = i3;
                                                        str16 = str;
                                                        i20 = i11;
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
                                                        long j67 = j21 + 1;
                                                        String k10 = k(z19, hashMap3, dVar2);
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
                                                        if (sVar7 != null || treeMap.isEmpty()) {
                                                            str9 = str8;
                                                            i14 = 0;
                                                            sVar3 = sVar7;
                                                        } else {
                                                            i14 = 0;
                                                            d2.r[] rVarArr3 = (d2.r[]) treeMap.values().toArray(new d2.r[0]);
                                                            str9 = str8;
                                                            d2.s sVar13 = new d2.s(str9, true, rVarArr3);
                                                            if (sVar6 == null) {
                                                                sVar6 = b(str9, rVarArr3);
                                                            }
                                                            sVar3 = sVar13;
                                                        }
                                                        String str42 = hexString3;
                                                        long j68 = j14;
                                                        long j69 = j23;
                                                        long j70 = j24;
                                                        arrayList5.add(new j(k10, jVar2 != null ? jVar2 : jVar6, str15, j70, i3, j69, sVar3, str, str42, j12, j68, i20, arrayList4));
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
                                                        i17 = i14;
                                                        i20 = i17;
                                                        i18 = i3;
                                                        sVar7 = sVar3;
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
                                            i3 = i23;
                                            str3 = str32;
                                            treeMap = treeMap2;
                                            i10 = i17;
                                            j10 = j14;
                                            i11 = i20;
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
                                        i18 = i23;
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
                                i17 = i10;
                                arrayList12 = arrayList3;
                                str15 = str4;
                                j24 = j11;
                                i18 = i3;
                                str16 = str;
                                i20 = i11;
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
                            i18 = i23;
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
                i18 = i23;
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
    /* JADX WARN: Failed to find 'out' block for switch in B:177:0x0559. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02f8  */
    /* JADX WARN: Type inference failed for: r29v1 */
    /* JADX WARN: Type inference failed for: r29v11 */
    /* JADX WARN: Type inference failed for: r29v3 */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static p e(p7.d dVar, Uri uri, q2.d dVar2) {
        int i3;
        char c2;
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
        int i10;
        ArrayList arrayList3;
        int i11;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        HashMap hashMap2;
        int i12;
        String str4;
        String str5;
        String w10;
        d2.n nVar;
        String i13;
        String str6;
        int i14;
        int i15;
        Uri g7;
        ArrayList arrayList7;
        HashMap hashMap3;
        ArrayList arrayList8;
        int i16;
        String[] d02;
        d2.n nVar2;
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
            boolean v = dVar.v();
            Pattern pattern = m0;
            ArrayList arrayList17 = arrayList13;
            boolean z13 = z11;
            Pattern pattern2 = r0;
            boolean z14 = z12;
            if (!v) {
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
                int i17 = 0;
                while (i17 < arrayList24.size()) {
                    o oVar4 = (o) arrayList24.get(i17);
                    Uri uri3 = oVar4.a;
                    d2.v vVar = oVar4.b;
                    if (hashSet2.add(uri3)) {
                        zb.p(vVar.l == null);
                        ArrayList arrayList26 = (ArrayList) hashMap6.get(oVar4.a);
                        arrayList26.getClass();
                        hashMap = hashMap6;
                        hashSet = hashSet2;
                        s0 s0Var = new s0(new q2.s(null, null, arrayList26));
                        d2.u a10 = vVar.a();
                        a10.k = s0Var;
                        arrayList25.add(new o(oVar4.a, new d2.v(a10), oVar4.c, oVar4.d, oVar4.e, oVar4.f, oVar4.g, oVar4.h));
                    } else {
                        hashMap = hashMap6;
                        hashSet = hashSet2;
                    }
                    i17++;
                    hashSet2 = hashSet;
                    hashMap6 = hashMap;
                }
                int i18 = 0;
                ArrayList arrayList27 = null;
                d2.v vVar2 = null;
                while (i18 < arrayList18.size()) {
                    ArrayList arrayList28 = arrayList18;
                    String str7 = (String) arrayList28.get(i18);
                    String j10 = j(str7, t0, hashMap5, dVar2);
                    String j11 = j(str7, pattern2, hashMap5, dVar2);
                    ArrayList arrayList29 = arrayList25;
                    ArrayList arrayList30 = arrayList27;
                    String i19 = i(str7, M, null, hashMap5, dVar2);
                    d2.u uVar = new d2.u();
                    d2.v vVar3 = vVar2;
                    uVar.a = a1.g.C(j10, ":", j11);
                    uVar.b = j11;
                    uVar.q = u0.n("application/x-mpegURL");
                    boolean f10 = f(str7, x0, dVar2);
                    ?? r29 = f10;
                    if (f(str7, y0, dVar2)) {
                        r29 = (f10 ? 1 : 0) | 2;
                    }
                    uVar.e = f(str7, w0, dVar2) ? r29 | 4 : r29;
                    int i20 = i18;
                    String i21 = i(str7, u0, null, hashMap5, dVar2);
                    if (TextUtils.isEmpty(i21)) {
                        arrayList18 = arrayList28;
                        i3 = 0;
                    } else {
                        String str8 = n0.a;
                        String[] split = i21.split(",", -1);
                        i3 = n0.l(split, "public.accessibility.describes-video") ? 512 : 0;
                        arrayList18 = arrayList28;
                        if (n0.l(split, "public.accessibility.transcribes-spoken-dialog")) {
                            i3 |= TLObject.FLAG_12;
                        }
                        if (n0.l(split, "public.accessibility.describes-music-and-sound")) {
                            i3 |= 1024;
                        }
                        if (n0.l(split, "public.easy-to-read")) {
                            i3 |= TLObject.FLAG_13;
                        }
                    }
                    uVar.f = i3;
                    uVar.d = i(str7, q0, null, hashMap5, dVar2);
                    String i22 = i(str7, pattern, null, hashMap5, dVar2);
                    Uri g10 = i22 == null ? null : g2.f.g(uri2, i22);
                    String str9 = uri2;
                    Pattern pattern3 = pattern;
                    s0 s0Var2 = new s0(new q2.s(j10, j11, Collections.EMPTY_LIST));
                    String j12 = j(str7, o0, hashMap5, dVar2);
                    switch (j12.hashCode()) {
                        case -959297733:
                            if (j12.equals("SUBTITLES")) {
                                c2 = 0;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -333210994:
                            if (j12.equals("CLOSED-CAPTIONS")) {
                                c2 = 1;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 62628790:
                            if (j12.equals("AUDIO")) {
                                c2 = 2;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 81665115:
                            if (j12.equals("VIDEO")) {
                                c2 = 3;
                                break;
                            }
                            c2 = 65535;
                            break;
                        default:
                            c2 = 65535;
                            break;
                    }
                    switch (c2) {
                        case 0:
                            arrayList = arrayList20;
                            int i23 = 0;
                            while (true) {
                                if (i23 < arrayList24.size()) {
                                    oVar = (o) arrayList24.get(i23);
                                    if (!j10.equals(oVar.e)) {
                                        i23++;
                                    }
                                } else {
                                    oVar = null;
                                }
                            }
                            if (oVar != null) {
                                String w11 = n0.w(3, oVar.b.k);
                                uVar.j = w11;
                                str = u0.d(w11);
                            } else {
                                str = null;
                            }
                            if (str == null) {
                                str = "text/vtt";
                            }
                            uVar.r = u0.n(str);
                            uVar.k = s0Var2;
                            if (g10 != null) {
                                arrayList2 = arrayList22;
                                arrayList2.add(new n(g10, new d2.v(uVar), j11, i19));
                            } else {
                                arrayList2 = arrayList22;
                                g2.a.l("HlsPlaylistParser", "EXT-X-MEDIA tag with missing mandatory URI attribute: skipping");
                            }
                            arrayList27 = arrayList30;
                            vVar2 = vVar3;
                            break;
                        case 1:
                            ArrayList arrayList31 = arrayList21;
                            arrayList = arrayList20;
                            String j13 = j(str7, v0, hashMap5, dVar2);
                            if (j13.startsWith("CC")) {
                                parseInt = Integer.parseInt(j13.substring(2));
                                str2 = "application/cea-608";
                            } else {
                                parseInt = Integer.parseInt(j13.substring(7));
                                str2 = "application/cea-708";
                            }
                            ArrayList arrayList32 = arrayList30 == null ? new ArrayList() : arrayList30;
                            uVar.r = u0.n(str2);
                            uVar.O = parseInt;
                            arrayList32.add(new d2.v(uVar));
                            arrayList21 = arrayList31;
                            arrayList27 = arrayList32;
                            arrayList2 = arrayList22;
                            vVar2 = vVar3;
                            break;
                        case 2:
                            arrayList = arrayList20;
                            int i24 = 0;
                            while (true) {
                                if (i24 < arrayList24.size()) {
                                    oVar2 = (o) arrayList24.get(i24);
                                    int i25 = i24;
                                    if (!j10.equals(oVar2.d)) {
                                        i24 = i25 + 1;
                                    }
                                } else {
                                    oVar2 = null;
                                }
                            }
                            if (oVar2 != null) {
                                String w12 = n0.w(1, oVar2.b.k);
                                uVar.j = w12;
                                str3 = u0.d(w12);
                            } else {
                                str3 = null;
                            }
                            o oVar5 = oVar2;
                            String i26 = i(str7, r, null, hashMap5, dVar2);
                            if (i26 != null) {
                                String str10 = n0.a;
                                uVar.J = Integer.parseInt(i26.split("/", 2)[0]);
                                if ("audio/eac3".equals(str3) && i26.endsWith("/JOC")) {
                                    uVar.j = "ec+3";
                                    str3 = "audio/eac3-joc";
                                }
                            }
                            uVar.r = u0.n(str3);
                            if (g10 != null) {
                                uVar.k = s0Var2;
                                arrayList21.add(new n(g10, new d2.v(uVar), j11, i19));
                            } else {
                                ArrayList arrayList33 = arrayList21;
                                if (oVar5 != null) {
                                    vVar2 = new d2.v(uVar);
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
                            vVar2 = vVar3;
                            break;
                        case 3:
                            int i27 = 0;
                            while (true) {
                                if (i27 < arrayList24.size()) {
                                    oVar3 = (o) arrayList24.get(i27);
                                    if (!j10.equals(oVar3.c)) {
                                        i27++;
                                    }
                                } else {
                                    oVar3 = null;
                                }
                            }
                            if (oVar3 != null) {
                                d2.v vVar4 = oVar3.b;
                                String w13 = n0.w(2, vVar4.k);
                                uVar.j = w13;
                                uVar.r = u0.n(u0.d(w13));
                                uVar.y = vVar4.z;
                                uVar.z = vVar4.A;
                                uVar.C = vVar4.D;
                            }
                            if (g10 != null) {
                                uVar.k = s0Var2;
                                arrayList = arrayList20;
                                arrayList.add(new n(g10, new d2.v(uVar), j11, i19));
                                arrayList2 = arrayList22;
                                arrayList27 = arrayList30;
                                vVar2 = vVar3;
                                break;
                            }
                        default:
                            arrayList2 = arrayList22;
                            arrayList = arrayList20;
                            arrayList27 = arrayList30;
                            vVar2 = vVar3;
                            break;
                    }
                    i18 = i20 + 1;
                    arrayList25 = arrayList29;
                    arrayList20 = arrayList;
                    arrayList22 = arrayList2;
                    uri2 = str9;
                    pattern = pattern3;
                }
                return new p(uri.toString(), arrayList19, arrayList25, arrayList20, arrayList21, arrayList22, arrayList17, vVar2, z13 ? Collections.EMPTY_LIST : arrayList27, z14, hashMap5, arrayList23);
            }
            String z15 = dVar.z();
            ArrayList arrayList34 = arrayList12;
            if (z15.startsWith("#EXT")) {
                arrayList16.add(z15);
            }
            boolean startsWith = z15.startsWith("#EXT-X-I-FRAME-STREAM-INF");
            ArrayList arrayList35 = arrayList16;
            if (z15.startsWith("#EXT-X-DEFINE")) {
                String i28 = i(z15, pattern2, null, hashMap5, dVar2);
                if (i28 != null) {
                    l(i28, hashMap5);
                    hashMap5.put(i28, j(z15, C0, hashMap5, dVar2));
                } else {
                    String j14 = j(z15, s0, hashMap5, dVar2);
                    l(j14, hashMap5);
                    String queryParameter = uri.getQueryParameter(j14);
                    if (queryParameter == null) {
                        throw v0.b("QUERYPARAM \"" + j14 + "\" not found in playlist URI", null);
                    }
                    hashMap5.put(j14, queryParameter);
                }
            } else if (z15.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
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
            } else if (z15.startsWith("#EXT-X-MEDIA")) {
                arrayList14.add(z15);
            } else if (z15.startsWith("#EXT-X-SESSION-KEY")) {
                d2.r c10 = c(z15, i(z15, k0, "identity", hashMap5, dVar2), hashMap5, dVar2);
                if (c10 != null) {
                    String j15 = j(z15, j0, hashMap5, dVar2);
                    arrayList15.add(new d2.s(("SAMPLE-AES-CENC".equals(j15) || "SAMPLE-AES-CTR".equals(j15)) ? "cenc" : "cbcs", true, c10));
                }
            } else if (z15.startsWith("#EXT-X-STREAM-INF") || startsWith) {
                boolean contains = z13 | z15.contains("CLOSED-CAPTIONS=NONE");
                if (startsWith) {
                    z10 = contains;
                    i10 = 16384;
                } else {
                    z10 = contains;
                    i10 = 0;
                }
                int parseInt2 = Integer.parseInt(j(z15, n, Collections.EMPTY_MAP, dVar2));
                Matcher b10 = q2.d.b(z15, c, dVar2);
                if (b10.find()) {
                    arrayList3 = arrayList15;
                    String group = b10.group(1);
                    group.getClass();
                    i11 = Integer.parseInt(group);
                } else {
                    arrayList3 = arrayList15;
                    i11 = -1;
                }
                arrayList4 = arrayList11;
                String i29 = i(z15, s, null, hashMap5, dVar2);
                arrayList5 = arrayList10;
                String i30 = i(z15, w, null, hashMap5, dVar2);
                arrayList6 = arrayList14;
                String i31 = i(z15, x, null, hashMap5, dVar2);
                if (i31 != null) {
                    String str11 = n0.a;
                    String[] split2 = i31.split(",", 2)[0].split("/", -1);
                    str4 = split2[0];
                    if (split2.length > 1) {
                        str5 = split2[1];
                        hashMap2 = hashMap4;
                        i12 = 2;
                        w10 = n0.w(i12, i30);
                        if (u0.j(w10, str4) && (str4 == null || !(i29 == null || str5 == null || ((i29.equals("PQ") && !str5.equals("db1p")) || ((i29.equals("SDR") && !str5.equals("db2g")) || (i29.equals("HLG") && !str5.startsWith("db4"))))))) {
                            d2.n x10 = n0.x(i30, str4, str5);
                            if (str4 == null) {
                                str4 = w10;
                            }
                            d02 = n0.d0(i30);
                            if (d02.length != 0) {
                                nVar2 = x10;
                            } else {
                                StringBuilder sb3 = new StringBuilder();
                                int length = d02.length;
                                int i32 = 0;
                                while (i32 < length) {
                                    String[] strArr = d02;
                                    String str12 = strArr[i32];
                                    d2.n nVar3 = x10;
                                    int i33 = length;
                                    if (2 != u0.h(u0.d(str12))) {
                                        if (sb3.length() > 0) {
                                            sb3.append(",");
                                        }
                                        sb3.append(str12);
                                    }
                                    i32++;
                                    d02 = strArr;
                                    length = i33;
                                    x10 = nVar3;
                                }
                                nVar2 = x10;
                                if (sb3.length() > 0) {
                                    sb2 = sb3.toString();
                                    i30 = sb2 != null ? a1.g.C(str4, ",", sb2) : str4;
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
                        boolean equals = TextUtils.equals(i(z15, E, null, hashMap5, dVar2), "true");
                        String i34 = i(z15, y, null, hashMap5, dVar2);
                        String i35 = i(z15, F, null, hashMap5, dVar2);
                        String i36 = i(z15, G, null, hashMap5, dVar2);
                        String i37 = i(z15, H, null, hashMap5, dVar2);
                        i13 = i(z15, I, null, hashMap5, dVar2);
                        if (i13 != null) {
                            str6 = i35;
                            String[] split3 = i13.split("x", -1);
                            int parseInt3 = Integer.parseInt(split3[0]);
                            int parseInt4 = Integer.parseInt(split3[1]);
                            if (parseInt3 <= 0 || parseInt4 <= 0) {
                                parseInt4 = -1;
                                i16 = -1;
                            } else {
                                i16 = parseInt3;
                            }
                            i15 = parseInt4;
                            i14 = i16;
                        } else {
                            str6 = i35;
                            i14 = -1;
                            i15 = -1;
                        }
                        ArrayList arrayList36 = arrayList9;
                        String i38 = i(z15, J, null, hashMap5, dVar2);
                        float parseFloat = i38 != null ? Float.parseFloat(i38) : -1.0f;
                        String i39 = i(z15, K, null, hashMap5, dVar2);
                        String i40 = i(z15, d, null, hashMap5, dVar2);
                        String i41 = i(z15, e, null, hashMap5, dVar2);
                        String i42 = i(z15, f, null, hashMap5, dVar2);
                        String i43 = i(z15, h, null, hashMap5, dVar2);
                        String i44 = i(z15, L, null, hashMap5, dVar2);
                        if (startsWith) {
                            g7 = g2.f.g(uri2, j(z15, pattern, hashMap5, dVar2));
                        } else {
                            if (!dVar.v()) {
                                throw v0.b("#EXT-X-STREAM-INF must be followed by another line", null);
                            }
                            g7 = g2.f.g(uri2, k(dVar.z(), hashMap5, dVar2));
                        }
                        Uri uri4 = g7;
                        d2.u uVar2 = new d2.u();
                        uVar2.a = Integer.toString(arrayList36.size());
                        uVar2.q = u0.n("application/x-mpegURL");
                        uVar2.j = i30;
                        uVar2.h = i11;
                        uVar2.i = parseInt2;
                        uVar2.y = i14;
                        uVar2.z = i15;
                        uVar2.C = parseFloat;
                        uVar2.f = i10;
                        uVar2.H = nVar;
                        uVar2.m = equals;
                        uVar2.r = u0.n(i34);
                        uVar2.n = Long.parseLong(str6);
                        uVar2.o = i36;
                        uVar2.p = Integer.parseInt(i37);
                        arrayList7 = arrayList36;
                        arrayList7.add(new o(uri4, new d2.v(uVar2), i40, i41, i42, i43, i39, i44));
                        hashMap3 = hashMap2;
                        arrayList8 = (ArrayList) hashMap3.get(uri4);
                        if (arrayList8 == null) {
                            arrayList8 = new ArrayList();
                            hashMap3.put(uri4, arrayList8);
                        }
                        arrayList8.add(new q2.r(i11, i40, parseInt2, i41, i42, i43));
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
                        i12 = 2;
                    }
                } else {
                    hashMap2 = hashMap4;
                    i12 = 2;
                    str4 = null;
                }
                str5 = null;
                w10 = n0.w(i12, i30);
                if (u0.j(w10, str4)) {
                    d2.n x102 = n0.x(i30, str4, str5);
                    if (str4 == null) {
                    }
                    d02 = n0.d0(i30);
                    if (d02.length != 0) {
                    }
                    sb2 = null;
                    if (sb2 != null) {
                    }
                    nVar = nVar2;
                    boolean equals2 = TextUtils.equals(i(z15, E, null, hashMap5, dVar2), "true");
                    String i342 = i(z15, y, null, hashMap5, dVar2);
                    String i352 = i(z15, F, null, hashMap5, dVar2);
                    String i362 = i(z15, G, null, hashMap5, dVar2);
                    String i372 = i(z15, H, null, hashMap5, dVar2);
                    i13 = i(z15, I, null, hashMap5, dVar2);
                    if (i13 != null) {
                    }
                    ArrayList arrayList362 = arrayList9;
                    String i382 = i(z15, J, null, hashMap5, dVar2);
                    if (i382 != null) {
                    }
                    String i392 = i(z15, K, null, hashMap5, dVar2);
                    String i402 = i(z15, d, null, hashMap5, dVar2);
                    String i412 = i(z15, e, null, hashMap5, dVar2);
                    String i422 = i(z15, f, null, hashMap5, dVar2);
                    String i432 = i(z15, h, null, hashMap5, dVar2);
                    String i442 = i(z15, L, null, hashMap5, dVar2);
                    if (startsWith) {
                    }
                    Uri uri42 = g7;
                    d2.u uVar22 = new d2.u();
                    uVar22.a = Integer.toString(arrayList362.size());
                    uVar22.q = u0.n("application/x-mpegURL");
                    uVar22.j = i30;
                    uVar22.h = i11;
                    uVar22.i = parseInt2;
                    uVar22.y = i14;
                    uVar22.z = i15;
                    uVar22.C = parseFloat;
                    uVar22.f = i10;
                    uVar22.H = nVar;
                    uVar22.m = equals2;
                    uVar22.r = u0.n(i342);
                    uVar22.n = Long.parseLong(str6);
                    uVar22.o = i362;
                    uVar22.p = Integer.parseInt(i372);
                    arrayList7 = arrayList362;
                    arrayList7.add(new o(uri42, new d2.v(uVar22), i402, i412, i422, i432, i392, i442));
                    hashMap3 = hashMap2;
                    arrayList8 = (ArrayList) hashMap3.get(uri42);
                    if (arrayList8 == null) {
                    }
                    arrayList8.add(new q2.r(i11, i402, parseInt2, i412, i422, i432));
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
                boolean equals22 = TextUtils.equals(i(z15, E, null, hashMap5, dVar2), "true");
                String i3422 = i(z15, y, null, hashMap5, dVar2);
                String i3522 = i(z15, F, null, hashMap5, dVar2);
                String i3622 = i(z15, G, null, hashMap5, dVar2);
                String i3722 = i(z15, H, null, hashMap5, dVar2);
                i13 = i(z15, I, null, hashMap5, dVar2);
                if (i13 != null) {
                }
                ArrayList arrayList3622 = arrayList9;
                String i3822 = i(z15, J, null, hashMap5, dVar2);
                if (i3822 != null) {
                }
                String i3922 = i(z15, K, null, hashMap5, dVar2);
                String i4022 = i(z15, d, null, hashMap5, dVar2);
                String i4122 = i(z15, e, null, hashMap5, dVar2);
                String i4222 = i(z15, f, null, hashMap5, dVar2);
                String i4322 = i(z15, h, null, hashMap5, dVar2);
                String i4422 = i(z15, L, null, hashMap5, dVar2);
                if (startsWith) {
                }
                Uri uri422 = g7;
                d2.u uVar222 = new d2.u();
                uVar222.a = Integer.toString(arrayList3622.size());
                uVar222.q = u0.n("application/x-mpegURL");
                uVar222.j = i30;
                uVar222.h = i11;
                uVar222.i = parseInt2;
                uVar222.y = i14;
                uVar222.z = i15;
                uVar222.C = parseFloat;
                uVar222.f = i10;
                uVar222.H = nVar;
                uVar222.m = equals22;
                uVar222.r = u0.n(i3422);
                uVar222.n = Long.parseLong(str6);
                uVar222.o = i3622;
                uVar222.p = Integer.parseInt(i3722);
                arrayList7 = arrayList3622;
                arrayList7.add(new o(uri422, new d2.v(uVar222), i4022, i4122, i4222, i4322, i3922, i4422));
                hashMap3 = hashMap2;
                arrayList8 = (ArrayList) hashMap3.get(uri422);
                if (arrayList8 == null) {
                }
                arrayList8.add(new q2.r(i11, i4022, parseInt2, i4122, i4222, i4322));
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

    public static boolean f(String str, Pattern pattern, q2.d dVar) {
        Matcher b10 = q2.d.b(str, pattern, dVar);
        if (b10.find()) {
            return "YES".equals(b10.group(1));
        }
        return false;
    }

    public static double g(String str, Pattern pattern, double d10, q2.d dVar) {
        Matcher b10 = q2.d.b(str, pattern, dVar);
        if (!b10.find()) {
            return d10;
        }
        String group = b10.group(1);
        group.getClass();
        return Double.parseDouble(group);
    }

    public static long h(String str, Pattern pattern, q2.d dVar) {
        Matcher b10 = q2.d.b(str, pattern, dVar);
        if (!b10.find()) {
            return -1L;
        }
        String group = b10.group(1);
        group.getClass();
        return Long.parseLong(group);
    }

    public static String i(String str, Pattern pattern, String str2, Map map, q2.d dVar) {
        Matcher b10 = q2.d.b(str, pattern, dVar);
        if (b10.find()) {
            str2 = b10.group(1);
            str2.getClass();
        }
        return (map.isEmpty() || str2 == null) ? str2 : k(str2, map, dVar);
    }

    public static String j(String str, Pattern pattern, Map map, q2.d dVar) {
        String i3 = i(str, pattern, null, map, dVar);
        if (i3 != null) {
            return i3;
        }
        throw v0.b("Couldn't match " + pattern.pattern() + " in " + str, null);
    }

    public static String k(String str, Map map, q2.d dVar) {
        Matcher b10 = q2.d.b(str, X0, dVar);
        StringBuffer stringBuffer = new StringBuffer();
        while (b10.find()) {
            String group = b10.group(1);
            if (map.containsKey(group)) {
                b10.appendReplacement(stringBuffer, Matcher.quoteReplacement((String) map.get(group)));
            }
        }
        b10.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    public static void l(String str, HashMap hashMap) {
        if (hashMap.containsKey(str)) {
            throw v0.b("duplicate variable name \"" + str + "\"", null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0073 A[Catch: all -> 0x009e, LOOP:0: B:13:0x0073->B:38:0x0073, LOOP_START, TryCatch #4 {all -> 0x009e, blocks: (B:3:0x0019, B:5:0x0022, B:7:0x002a, B:10:0x0033, B:13:0x0073, B:15:0x0079, B:18:0x0084, B:57:0x008c, B:20:0x00a0, B:22:0x00a8, B:24:0x00b0, B:26:0x00b8, B:28:0x00c0, B:30:0x00c8, B:32:0x00d0, B:34:0x00d8, B:36:0x00e1, B:41:0x00e5, B:75:0x0107, B:76:0x010d, B:80:0x003a, B:82:0x0040, B:87:0x0049, B:89:0x0052, B:94:0x005b, B:96:0x0061, B:98:0x0067, B:100:0x006c), top: B:2:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0107 A[Catch: all -> 0x009e, TRY_ENTER, TryCatch #4 {all -> 0x009e, blocks: (B:3:0x0019, B:5:0x0022, B:7:0x002a, B:10:0x0033, B:13:0x0073, B:15:0x0079, B:18:0x0084, B:57:0x008c, B:20:0x00a0, B:22:0x00a8, B:24:0x00b0, B:26:0x00b8, B:28:0x00c0, B:30:0x00c8, B:32:0x00d0, B:34:0x00d8, B:36:0x00e1, B:41:0x00e5, B:75:0x0107, B:76:0x010d, B:80:0x003a, B:82:0x0040, B:87:0x0049, B:89:0x0052, B:94:0x005b, B:96:0x0061, B:98:0x0067, B:100:0x006c), top: B:2:0x0019 }] */
    @Override // a3.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object L(Uri uri, i2.l lVar) {
        String trim;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(lVar));
        ArrayDeque arrayDeque = new ArrayDeque();
        q2.d dVar = new q2.d(0.75f, 16, 1, true);
        try {
            int read = bufferedReader.read();
            boolean z10 = false;
            if (read == 239) {
                if (bufferedReader.read() == 187 && bufferedReader.read() == 191) {
                    read = bufferedReader.read();
                }
                if (z10) {
                    throw v0.b("Input does not start with the #EXTM3U header.", null);
                }
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException unused) {
                        }
                        throw v0.b("Failed to parse the playlist, could not identify any tags.", null);
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
                            p e10 = e(new p7.d(arrayDeque, bufferedReader), uri, dVar);
                            try {
                                bufferedReader.close();
                            } catch (IOException unused2) {
                            }
                            return e10;
                        }
                    }
                }
                arrayDeque.add(trim);
                m d10 = d(this.a, this.b, new p7.d(arrayDeque, bufferedReader), uri, dVar);
                try {
                    bufferedReader.close();
                } catch (IOException unused3) {
                }
                return d10;
            }
            while (read != -1 && Character.isWhitespace(read)) {
                read = bufferedReader.read();
            }
            int i3 = 0;
            while (true) {
                if (i3 >= 7) {
                    while (read != -1 && Character.isWhitespace(read) && !n0.O(read)) {
                        read = bufferedReader.read();
                    }
                    z10 = n0.O(read);
                } else {
                    if (read != "#EXTM3U".charAt(i3)) {
                        break;
                    }
                    read = bufferedReader.read();
                    i3++;
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
