package p4;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.exoplayer2.upstream.s0;
import d5.g0;
import h3.t0;
import h3.t1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o4.t;
import o4.u;
import p8.z;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class p implements s0 {
    public final m a;
    public final j b;
    public static final Pattern c = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");
    public static final Pattern d = Pattern.compile("VIDEO=\"(.+?)\"");
    public static final Pattern e = Pattern.compile("AUDIO=\"(.+?)\"");
    public static final Pattern f = Pattern.compile("SUBTITLES=\"(.+?)\"");
    public static final Pattern h = Pattern.compile("CLOSED-CAPTIONS=\"(.+?)\"");
    public static final Pattern n = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");
    public static final Pattern r = Pattern.compile("CHANNELS=\"(.+?)\"");
    public static final Pattern s = Pattern.compile("CODECS=\"(.+?)\"");
    public static final Pattern v = Pattern.compile("MIME=\"(.+?)\"");
    public static final Pattern w = Pattern.compile("CACHED=\"(.+?)\"");
    public static final Pattern x = Pattern.compile("DOCID=\"(.+?)\"");
    public static final Pattern y = Pattern.compile("DOCFILENAME=\"(.+?)\"");
    public static final Pattern A = Pattern.compile("ACCOUNT=\"(.+?)\"");
    public static final Pattern B = Pattern.compile("RESOLUTION=(\\d+x\\d+)");
    public static final Pattern C = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");
    public static final Pattern D = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");
    public static final Pattern E = Pattern.compile("DURATION=([\\d\\.]+)\\b");
    public static final Pattern F = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");
    public static final Pattern G = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");
    public static final Pattern H = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");
    public static final Pattern I = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");
    public static final Pattern J = a("CAN-SKIP-DATERANGES");
    public static final Pattern K = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");
    public static final Pattern L = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");
    public static final Pattern M = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");
    public static final Pattern N = a("CAN-BLOCK-RELOAD");
    public static final Pattern O = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");
    public static final Pattern P = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");
    public static final Pattern Q = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");
    public static final Pattern R = Pattern.compile("LAST-MSN=(\\d+)\\b");
    public static final Pattern S = Pattern.compile("LAST-PART=(\\d+)\\b");
    public static final Pattern T = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");
    public static final Pattern U = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");
    public static final Pattern V = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");
    public static final Pattern W = Pattern.compile("BYTERANGE-START=(\\d+)\\b");
    public static final Pattern X = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");
    public static final Pattern Y = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");
    public static final Pattern Z = Pattern.compile("KEYFORMAT=\"(.+?)\"");
    public static final Pattern a0 = Pattern.compile("KEYFORMATVERSIONS=\"(.+?)\"");
    public static final Pattern b0 = Pattern.compile("URI=\"(.+?)\"");
    public static final Pattern c0 = Pattern.compile("IV=([^,.*]+)");
    public static final Pattern d0 = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");
    public static final Pattern e0 = Pattern.compile("TYPE=(PART|MAP)");
    public static final Pattern f0 = Pattern.compile("LANGUAGE=\"(.+?)\"");
    public static final Pattern g0 = Pattern.compile("NAME=\"(.+?)\"");
    public static final Pattern h0 = Pattern.compile("GROUP-ID=\"(.+?)\"");
    public static final Pattern i0 = Pattern.compile("CHARACTERISTICS=\"(.+?)\"");
    public static final Pattern j0 = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");
    public static final Pattern k0 = a("AUTOSELECT");
    public static final Pattern l0 = a("DEFAULT");
    public static final Pattern m0 = a("FORCED");
    public static final Pattern n0 = a("INDEPENDENT");
    public static final Pattern o0 = a("GAP");
    public static final Pattern p0 = a("PRECISE");
    public static final Pattern q0 = Pattern.compile("VALUE=\"(.+?)\"");
    public static final Pattern r0 = Pattern.compile("IMPORT=\"(.+?)\"");
    public static final Pattern s0 = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");

    public p(m mVar, j jVar) {
        this.a = mVar;
        this.b = jVar;
    }

    public static Pattern a(String str) {
        return Pattern.compile(str.concat("=(NO|YES)"));
    }

    public static l3.d b(String str, l3.c[] cVarArr) {
        l3.c[] cVarArr2 = new l3.c[cVarArr.length];
        for (int i10 = 0; i10 < cVarArr.length; i10++) {
            l3.c cVar = cVarArr[i10];
            cVarArr2[i10] = new l3.c(cVar.b, cVar.c, cVar.d, null);
        }
        return new l3.d(str, true, cVarArr2);
    }

    public static l3.c c(String str, String str2, HashMap hashMap) {
        String j10 = j(str, a0, "1", hashMap);
        boolean equals = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2);
        Pattern pattern = b0;
        if (equals) {
            String k10 = k(str, pattern, hashMap);
            return new l3.c(h3.h.d, null, "video/mp4", Base64.decode(k10.substring(k10.indexOf(44)), 0));
        }
        if ("com.widevine".equals(str2)) {
            UUID uuid = h3.h.d;
            int i10 = g0.a;
            return new l3.c(uuid, null, "hls", str.getBytes(o8.d.c));
        }
        if (!"com.microsoft.playready".equals(str2) || !"1".equals(j10)) {
            return null;
        }
        String k11 = k(str, pattern, hashMap);
        byte[] decode = Base64.decode(k11.substring(k11.indexOf(44)), 0);
        UUID uuid2 = h3.h.e;
        return new l3.c(uuid2, null, "video/mp4", u3.j.a(uuid2, null, decode));
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x078b  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x07c2  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x07c5  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x07a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static j d(m mVar, j jVar, j9.a aVar, String str) {
        ArrayList arrayList;
        i iVar;
        g gVar;
        long j10;
        String str2;
        long j11;
        String str3;
        boolean z10;
        String str4;
        ArrayList arrayList2;
        ArrayList arrayList3;
        int i10;
        l3.d dVar;
        long j12;
        l3.d dVar2;
        g gVar2;
        l3.d dVar3;
        String str5;
        l3.d dVar4;
        int i11;
        m mVar2 = mVar;
        j jVar2 = jVar;
        boolean z11 = mVar2.c;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        i iVar2 = new i(-9223372036854775807L, false, -9223372036854775807L, -9223372036854775807L, false);
        TreeMap treeMap = new TreeMap();
        boolean z12 = z11;
        String str6 = "";
        long j13 = -9223372036854775807L;
        long j14 = 0;
        long j15 = 0;
        long j16 = 0;
        long j17 = 0;
        long j18 = 0;
        long j19 = 0;
        long j20 = 0;
        long j21 = -1;
        boolean z13 = false;
        e eVar = null;
        int i12 = 0;
        l3.d dVar5 = null;
        g gVar3 = null;
        l3.d dVar6 = null;
        int i13 = 0;
        String str7 = null;
        String str8 = null;
        boolean z14 = false;
        char c10 = 0;
        boolean z15 = false;
        int i14 = 0;
        String str9 = null;
        boolean z16 = false;
        boolean z17 = false;
        long j22 = -9223372036854775807L;
        long j23 = -9223372036854775807L;
        long j24 = 0;
        int i15 = 1;
        while (aVar.D()) {
            String F2 = aVar.F();
            if (F2.startsWith("#EXT")) {
                arrayList7.add(F2);
            }
            if (F2.startsWith("#EXT-X-PLAYLIST-TYPE")) {
                String k10 = k(F2, H, hashMap);
                if ("VOD".equals(k10)) {
                    i12 = 1;
                } else if ("EVENT".equals(k10)) {
                    i12 = 2;
                }
            } else if (F2.equals("#EXT-X-I-FRAMES-ONLY")) {
                z16 = true;
            } else {
                if (F2.startsWith("#EXT-X-START")) {
                    double parseDouble = Double.parseDouble(k(F2, T, Collections.EMPTY_MAP));
                    arrayList = arrayList7;
                    iVar = iVar2;
                    z13 = g(F2, p0);
                    j13 = (long) (parseDouble * 1000000.0d);
                } else {
                    arrayList = arrayList7;
                    iVar = iVar2;
                    if (F2.startsWith("#EXT-X-SERVER-CONTROL")) {
                        double h10 = h(F2, I);
                        long j25 = h10 == -9.223372036854776E18d ? -9223372036854775807L : (long) (h10 * 1000000.0d);
                        boolean g10 = g(F2, J);
                        double h11 = h(F2, L);
                        long j26 = h11 == -9.223372036854776E18d ? -9223372036854775807L : (long) (h11 * 1000000.0d);
                        double h12 = h(F2, M);
                        iVar = new i(j25, g10, j26, h12 == -9.223372036854776E18d ? -9223372036854775807L : (long) (h12 * 1000000.0d), g(F2, N));
                    } else if (F2.startsWith("#EXT-X-PART-INF")) {
                        j23 = (long) (Double.parseDouble(k(F2, F, Collections.EMPTY_MAP)) * 1000000.0d);
                    } else {
                        boolean startsWith = F2.startsWith("#EXT-X-MAP");
                        Pattern pattern = V;
                        boolean z18 = z13;
                        Pattern pattern2 = b0;
                        if (startsWith) {
                            String k11 = k(F2, pattern2, hashMap);
                            String j27 = j(F2, pattern, null, hashMap);
                            if (j27 != null) {
                                int i16 = g0.a;
                                String[] split = j27.split("@", -1);
                                j21 = Long.parseLong(split[c10]);
                                if (split.length > 1) {
                                    j17 = Long.parseLong(split[1]);
                                }
                            }
                            long j28 = j21;
                            if (j28 == -1) {
                                j17 = 0;
                            }
                            if (str7 != null && str8 == null) {
                                throw t1.b("The encryption IV attribute must be present when an initialization segment is encrypted with METHOD=AES-128.", null);
                            }
                            String str10 = str7;
                            g gVar4 = new g(k11, j17, j28, str10, str8);
                            str7 = str10;
                            String str11 = str8;
                            if (j28 != -1) {
                                j17 += j28;
                            }
                            arrayList7 = arrayList;
                            gVar3 = gVar4;
                            j21 = -1;
                            iVar2 = iVar;
                            z13 = z18;
                            str8 = str11;
                        } else {
                            String str12 = str8;
                            ArrayList arrayList8 = arrayList5;
                            ArrayList arrayList9 = arrayList6;
                            if (F2.startsWith("#EXT-X-TARGETDURATION")) {
                                j22 = Integer.parseInt(k(F2, D, Collections.EMPTY_MAP)) * 1000000;
                            } else if (F2.startsWith("#EXT-X-MEDIA-SEQUENCE")) {
                                j16 = Long.parseLong(k(F2, O, Collections.EMPTY_MAP));
                                j24 = j16;
                            } else if (F2.startsWith("#EXT-X-VERSION")) {
                                i15 = Integer.parseInt(k(F2, G, Collections.EMPTY_MAP));
                            } else {
                                if (F2.startsWith("#EXT-X-DEFINE")) {
                                    String j29 = j(F2, r0, null, hashMap);
                                    if (j29 != null) {
                                        String str13 = (String) mVar2.l.get(j29);
                                        if (str13 != null) {
                                            hashMap.put(j29, str13);
                                        }
                                    } else {
                                        hashMap.put(k(F2, g0, hashMap), k(F2, q0, hashMap));
                                    }
                                    gVar = gVar3;
                                    j10 = j14;
                                    str2 = str7;
                                    j11 = j21;
                                    str3 = str9;
                                } else if (F2.startsWith("#EXTINF")) {
                                    j19 = new BigDecimal(k(F2, P, Collections.EMPTY_MAP)).multiply(new BigDecimal(1000000L)).longValue();
                                    str6 = j(F2, Q, "", hashMap);
                                } else if (F2.startsWith("#EXT-X-SKIP")) {
                                    int parseInt = Integer.parseInt(k(F2, K, Collections.EMPTY_MAP));
                                    d5.a.i(jVar2 != null && arrayList4.isEmpty());
                                    int i17 = g0.a;
                                    long j30 = jVar2.k;
                                    z zVar = jVar2.r;
                                    int i18 = (int) (j24 - j30);
                                    int i19 = parseInt + i18;
                                    if (i18 < 0 || i19 > zVar.size()) {
                                        throw new o();
                                    }
                                    long j31 = j18;
                                    str8 = str12;
                                    while (i18 < i19) {
                                        g gVar5 = (g) zVar.get(i18);
                                        if (j24 != jVar2.k) {
                                            int i20 = (jVar2.j - i14) + gVar5.d;
                                            z zVar2 = gVar5.x;
                                            ArrayList arrayList10 = new ArrayList();
                                            long j32 = j31;
                                            int i21 = 0;
                                            while (i21 < zVar2.size()) {
                                                e eVar2 = (e) zVar2.get(i21);
                                                arrayList10.add(new e(eVar2.a, eVar2.b, eVar2.c, i20, j32, eVar2.f, eVar2.h, eVar2.n, eVar2.r, eVar2.s, eVar2.v, eVar2.w, eVar2.x));
                                                j32 += eVar2.c;
                                                i21++;
                                                i19 = i19;
                                            }
                                            i11 = i19;
                                            gVar5 = new g(gVar5.a, gVar5.b, gVar5.w, gVar5.c, i20, j31, gVar5.f, gVar5.h, gVar5.n, gVar5.r, gVar5.s, gVar5.v, arrayList10);
                                        } else {
                                            i11 = i19;
                                        }
                                        arrayList4.add(gVar5);
                                        long j33 = gVar5.c;
                                        String str14 = gVar5.n;
                                        j31 += j33;
                                        long j34 = gVar5.s;
                                        if (j34 != -1) {
                                            j17 = gVar5.r + j34;
                                        }
                                        int i22 = gVar5.d;
                                        g gVar6 = gVar5.b;
                                        l3.d dVar7 = gVar5.f;
                                        String str15 = gVar5.h;
                                        if (str14 == null || !str14.equals(Long.toHexString(j16))) {
                                            str8 = str14;
                                        }
                                        j16++;
                                        i18++;
                                        i13 = i22;
                                        gVar3 = gVar6;
                                        str7 = str15;
                                        dVar5 = dVar7;
                                        i19 = i11;
                                        j14 = j31;
                                        jVar2 = jVar;
                                    }
                                    mVar2 = mVar;
                                    jVar2 = jVar;
                                    iVar2 = iVar;
                                    z13 = z18;
                                    arrayList7 = arrayList;
                                    arrayList6 = arrayList9;
                                    arrayList5 = arrayList8;
                                    j18 = j31;
                                } else if (F2.startsWith("#EXT-X-KEY")) {
                                    String k12 = k(F2, Y, hashMap);
                                    String j35 = j(F2, Z, "identity", hashMap);
                                    if ("NONE".equals(k12)) {
                                        treeMap.clear();
                                        dVar5 = null;
                                        str7 = null;
                                        str8 = null;
                                    } else {
                                        String j36 = j(F2, c0, null, hashMap);
                                        if (!"identity".equals(j35)) {
                                            String str16 = str9;
                                            str9 = str16 == null ? ("SAMPLE-AES-CENC".equals(k12) || "SAMPLE-AES-CTR".equals(k12)) ? "cenc" : "cbcs" : str16;
                                            l3.c c11 = c(F2, j35, hashMap);
                                            if (c11 != null) {
                                                treeMap.put(j35, c11);
                                                str8 = j36;
                                                dVar5 = null;
                                                str7 = null;
                                            }
                                        } else if ("AES-128".equals(k12)) {
                                            str7 = k(F2, pattern2, hashMap);
                                            str8 = j36;
                                        }
                                        str8 = j36;
                                        str7 = null;
                                    }
                                    mVar2 = mVar;
                                    jVar2 = jVar;
                                    iVar2 = iVar;
                                    z13 = z18;
                                    arrayList7 = arrayList;
                                    arrayList6 = arrayList9;
                                    arrayList5 = arrayList8;
                                } else {
                                    str3 = str9;
                                    if (F2.startsWith("#EXT-X-BYTERANGE")) {
                                        String k13 = k(F2, U, hashMap);
                                        int i23 = g0.a;
                                        String[] split2 = k13.split("@", -1);
                                        j21 = Long.parseLong(split2[c10]);
                                        if (split2.length > 1) {
                                            j17 = Long.parseLong(split2[1]);
                                        }
                                    } else if (F2.startsWith("#EXT-X-DISCONTINUITY-SEQUENCE")) {
                                        i14 = Integer.parseInt(F2.substring(F2.indexOf(58) + 1));
                                        mVar2 = mVar;
                                        jVar2 = jVar;
                                        str9 = str3;
                                        iVar2 = iVar;
                                        z13 = z18;
                                        str8 = str12;
                                        arrayList7 = arrayList;
                                        arrayList6 = arrayList9;
                                        arrayList5 = arrayList8;
                                        z15 = true;
                                    } else if (F2.equals("#EXT-X-DISCONTINUITY")) {
                                        i13++;
                                    } else if (F2.startsWith("#EXT-X-PROGRAM-DATE-TIME")) {
                                        if (j15 == 0) {
                                            j15 = g0.H(g0.K(F2.substring(F2.indexOf(58) + 1))) - j18;
                                        } else {
                                            gVar = gVar3;
                                            j10 = j14;
                                            str2 = str7;
                                            j11 = j21;
                                        }
                                    } else if (F2.equals("#EXT-X-GAP")) {
                                        mVar2 = mVar;
                                        jVar2 = jVar;
                                        str9 = str3;
                                        iVar2 = iVar;
                                        z13 = z18;
                                        str8 = str12;
                                        arrayList7 = arrayList;
                                        arrayList6 = arrayList9;
                                        arrayList5 = arrayList8;
                                        z17 = true;
                                    } else if (F2.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                                        mVar2 = mVar;
                                        jVar2 = jVar;
                                        str9 = str3;
                                        iVar2 = iVar;
                                        z13 = z18;
                                        str8 = str12;
                                        arrayList7 = arrayList;
                                        arrayList6 = arrayList9;
                                        arrayList5 = arrayList8;
                                        z12 = true;
                                    } else if (F2.equals("#EXT-X-ENDLIST")) {
                                        mVar2 = mVar;
                                        jVar2 = jVar;
                                        str9 = str3;
                                        iVar2 = iVar;
                                        z13 = z18;
                                        str8 = str12;
                                        arrayList7 = arrayList;
                                        arrayList6 = arrayList9;
                                        arrayList5 = arrayList8;
                                        z14 = true;
                                    } else {
                                        if (F2.startsWith("#EXT-X-RENDITION-REPORT")) {
                                            long i24 = i(F2, R);
                                            Matcher matcher = S.matcher(F2);
                                            if (matcher.find()) {
                                                String group = matcher.group(1);
                                                group.getClass();
                                                i10 = Integer.parseInt(group);
                                            } else {
                                                i10 = -1;
                                            }
                                            f fVar = new f(Uri.parse(d5.a.G(str, k(F2, pattern2, hashMap))), i24, i10);
                                            arrayList2 = arrayList9;
                                            arrayList2.add(fVar);
                                        } else {
                                            arrayList2 = arrayList9;
                                            if (!F2.startsWith("#EXT-X-PRELOAD-HINT")) {
                                                l3.d dVar8 = dVar6;
                                                g gVar7 = gVar3;
                                                if (F2.startsWith("#EXT-X-PART")) {
                                                    String hexString = str7 == null ? null : str12 != null ? str12 : Long.toHexString(j16);
                                                    String k14 = k(F2, pattern2, hashMap);
                                                    long parseDouble2 = (long) (Double.parseDouble(k(F2, E, Collections.EMPTY_MAP)) * 1000000.0d);
                                                    boolean g11 = g(F2, n0) | (z12 && arrayList8.isEmpty());
                                                    boolean g12 = g(F2, o0);
                                                    String j37 = j(F2, pattern, null, hashMap);
                                                    if (j37 != null) {
                                                        int i25 = g0.a;
                                                        String[] split3 = j37.split("@", -1);
                                                        long parseLong = Long.parseLong(split3[0]);
                                                        if (split3.length > 1) {
                                                            j20 = Long.parseLong(split3[1]);
                                                        }
                                                        j12 = parseLong;
                                                    } else {
                                                        j12 = -1;
                                                    }
                                                    long j38 = j12 == -1 ? 0L : j20;
                                                    if (dVar5 != null || treeMap.isEmpty()) {
                                                        dVar2 = dVar5;
                                                    } else {
                                                        l3.c[] cVarArr = (l3.c[]) treeMap.values().toArray(new l3.c[0]);
                                                        l3.d dVar9 = new l3.d(str3, true, cVarArr);
                                                        if (dVar8 == null) {
                                                            dVar8 = b(str3, cVarArr);
                                                        }
                                                        dVar2 = dVar9;
                                                    }
                                                    long j39 = j14;
                                                    arrayList8.add(new e(k14, gVar7, parseDouble2, i13, j39, dVar2, str7, hexString, j38, j12, g12, g11, false));
                                                    j14 = j39 + parseDouble2;
                                                    if (j12 != -1) {
                                                        j38 += j12;
                                                    }
                                                    j20 = j38;
                                                    dVar6 = dVar8;
                                                    gVar3 = gVar7;
                                                    arrayList5 = arrayList8;
                                                    str9 = str3;
                                                    dVar5 = dVar2;
                                                    iVar2 = iVar;
                                                    z13 = z18;
                                                    str8 = str12;
                                                    arrayList7 = arrayList;
                                                    c10 = 0;
                                                    jVar2 = jVar;
                                                    arrayList6 = arrayList2;
                                                    mVar2 = mVar;
                                                } else {
                                                    gVar = gVar7;
                                                    j10 = j14;
                                                    arrayList3 = arrayList8;
                                                    if (F2.startsWith("#")) {
                                                        dVar6 = dVar8;
                                                        str2 = str7;
                                                        j11 = j21;
                                                        z10 = z17;
                                                        str4 = str6;
                                                        jVar2 = jVar;
                                                        gVar3 = gVar;
                                                        arrayList5 = arrayList3;
                                                        str9 = str3;
                                                        str6 = str4;
                                                        j14 = j10;
                                                        str7 = str2;
                                                        j21 = j11;
                                                        z17 = z10;
                                                        iVar2 = iVar;
                                                        z13 = z18;
                                                        str8 = str12;
                                                        arrayList7 = arrayList;
                                                        c10 = 0;
                                                        arrayList6 = arrayList2;
                                                        mVar2 = mVar;
                                                    } else {
                                                        String hexString2 = str7 == null ? null : str12 != null ? str12 : Long.toHexString(j16);
                                                        long j40 = j16 + 1;
                                                        String l10 = l(F2, hashMap);
                                                        g gVar8 = (g) hashMap2.get(l10);
                                                        if (j21 == -1) {
                                                            gVar2 = gVar8;
                                                            j17 = 0;
                                                        } else {
                                                            if (z16 && gVar == null && gVar8 == null) {
                                                                gVar8 = new g(l10, 0L, j17, null, null);
                                                                hashMap2.put(l10, gVar8);
                                                            }
                                                            gVar2 = gVar8;
                                                        }
                                                        if (dVar5 != null || treeMap.isEmpty()) {
                                                            dVar3 = dVar8;
                                                            str5 = l10;
                                                        } else {
                                                            dVar3 = dVar8;
                                                            str5 = l10;
                                                            l3.c[] cVarArr2 = (l3.c[]) treeMap.values().toArray(new l3.c[0]);
                                                            l3.d dVar10 = new l3.d(str3, true, cVarArr2);
                                                            if (dVar3 == null) {
                                                                dVar4 = b(str3, cVarArr2);
                                                                dVar5 = dVar10;
                                                                int i26 = i13;
                                                                String str17 = str7;
                                                                long j41 = j21;
                                                                long j42 = j17;
                                                                long j43 = j18;
                                                                long j44 = j19;
                                                                l3.d dVar11 = dVar5;
                                                                i13 = i26;
                                                                arrayList4.add(new g(str5, gVar == null ? gVar : gVar2, str6, j44, i26, j43, dVar11, str17, hexString2, j42, j41, z17, arrayList3));
                                                                j14 = j43 + j44;
                                                                ArrayList arrayList11 = new ArrayList();
                                                                j17 = j21 == -1 ? j42 + j41 : j42;
                                                                arrayList6 = arrayList2;
                                                                dVar6 = dVar4;
                                                                gVar3 = gVar;
                                                                j16 = j40;
                                                                str9 = str3;
                                                                str6 = "";
                                                                j18 = j14;
                                                                dVar5 = dVar11;
                                                                str7 = str17;
                                                                j19 = 0;
                                                                j21 = -1;
                                                                iVar2 = iVar;
                                                                str8 = str12;
                                                                arrayList7 = arrayList;
                                                                c10 = 0;
                                                                z17 = false;
                                                                mVar2 = mVar;
                                                                jVar2 = jVar;
                                                                arrayList5 = arrayList11;
                                                                z13 = z18;
                                                            } else {
                                                                dVar5 = dVar10;
                                                            }
                                                        }
                                                        dVar4 = dVar3;
                                                        int i262 = i13;
                                                        String str172 = str7;
                                                        long j412 = j21;
                                                        long j422 = j17;
                                                        long j432 = j18;
                                                        long j442 = j19;
                                                        l3.d dVar112 = dVar5;
                                                        i13 = i262;
                                                        arrayList4.add(new g(str5, gVar == null ? gVar : gVar2, str6, j442, i262, j432, dVar112, str172, hexString2, j422, j412, z17, arrayList3));
                                                        j14 = j432 + j442;
                                                        ArrayList arrayList112 = new ArrayList();
                                                        if (j21 == -1) {
                                                        }
                                                        arrayList6 = arrayList2;
                                                        dVar6 = dVar4;
                                                        gVar3 = gVar;
                                                        j16 = j40;
                                                        str9 = str3;
                                                        str6 = "";
                                                        j18 = j14;
                                                        dVar5 = dVar112;
                                                        str7 = str172;
                                                        j19 = 0;
                                                        j21 = -1;
                                                        iVar2 = iVar;
                                                        str8 = str12;
                                                        arrayList7 = arrayList;
                                                        c10 = 0;
                                                        z17 = false;
                                                        mVar2 = mVar;
                                                        jVar2 = jVar;
                                                        arrayList5 = arrayList112;
                                                        z13 = z18;
                                                    }
                                                }
                                            } else if (eVar == null && "PART".equals(k(F2, e0, hashMap))) {
                                                l3.d dVar12 = dVar6;
                                                g gVar9 = gVar3;
                                                String k15 = k(F2, pattern2, hashMap);
                                                long i27 = i(F2, W);
                                                long i28 = i(F2, X);
                                                String hexString3 = str7 == null ? null : str12 != null ? str12 : Long.toHexString(j16);
                                                if (dVar5 != null || treeMap.isEmpty()) {
                                                    dVar = dVar5;
                                                } else {
                                                    l3.c[] cVarArr3 = (l3.c[]) treeMap.values().toArray(new l3.c[0]);
                                                    l3.d dVar13 = new l3.d(str3, true, cVarArr3);
                                                    if (dVar12 == null) {
                                                        dVar12 = b(str3, cVarArr3);
                                                    }
                                                    dVar = dVar13;
                                                }
                                                if (i27 == -1 || i28 != -1) {
                                                    long j45 = j14;
                                                    j14 = j45;
                                                    eVar = new e(k15, gVar9, 0L, i13, j45, dVar, str7, hexString3, i27 != -1 ? i27 : 0L, i28, false, false, true);
                                                }
                                                arrayList6 = arrayList2;
                                                str9 = str3;
                                                gVar3 = gVar9;
                                                dVar5 = dVar;
                                                iVar2 = iVar;
                                                z13 = z18;
                                                str8 = str12;
                                                arrayList7 = arrayList;
                                                arrayList5 = arrayList8;
                                                c10 = 0;
                                                mVar2 = mVar;
                                                dVar6 = dVar12;
                                                jVar2 = jVar;
                                            }
                                        }
                                        gVar = gVar3;
                                        j10 = j14;
                                        str2 = str7;
                                        j11 = j21;
                                        z10 = z17;
                                        str4 = str6;
                                        arrayList3 = arrayList8;
                                        jVar2 = jVar;
                                        gVar3 = gVar;
                                        arrayList5 = arrayList3;
                                        str9 = str3;
                                        str6 = str4;
                                        j14 = j10;
                                        str7 = str2;
                                        j21 = j11;
                                        z17 = z10;
                                        iVar2 = iVar;
                                        z13 = z18;
                                        str8 = str12;
                                        arrayList7 = arrayList;
                                        c10 = 0;
                                        arrayList6 = arrayList2;
                                        mVar2 = mVar;
                                    }
                                    mVar2 = mVar;
                                    jVar2 = jVar;
                                    str9 = str3;
                                }
                                z10 = z17;
                                str4 = str6;
                                arrayList2 = arrayList9;
                                arrayList3 = arrayList8;
                                jVar2 = jVar;
                                gVar3 = gVar;
                                arrayList5 = arrayList3;
                                str9 = str3;
                                str6 = str4;
                                j14 = j10;
                                str7 = str2;
                                j21 = j11;
                                z17 = z10;
                                iVar2 = iVar;
                                z13 = z18;
                                str8 = str12;
                                arrayList7 = arrayList;
                                c10 = 0;
                                arrayList6 = arrayList2;
                                mVar2 = mVar;
                            }
                            iVar2 = iVar;
                            z13 = z18;
                            str8 = str12;
                            arrayList7 = arrayList;
                            arrayList6 = arrayList9;
                            arrayList5 = arrayList8;
                        }
                    }
                }
                arrayList7 = arrayList;
                iVar2 = iVar;
            }
        }
        boolean z19 = z13;
        ArrayList arrayList12 = arrayList6;
        ArrayList arrayList13 = arrayList7;
        i iVar3 = iVar2;
        ArrayList arrayList14 = arrayList5;
        HashMap hashMap3 = new HashMap();
        for (int i29 = 0; i29 < arrayList12.size(); i29++) {
            f fVar2 = (f) arrayList12.get(i29);
            long j46 = fVar2.b;
            if (j46 == -1) {
                j46 = (j24 + arrayList4.size()) - (arrayList14.isEmpty() ? 1L : 0L);
            }
            int i30 = fVar2.c;
            if (i30 == -1 && j23 != -9223372036854775807L) {
                i30 = (arrayList14.isEmpty() ? ((g) p8.l.g(arrayList4)).x : arrayList14).size() - 1;
            }
            Uri uri = fVar2.a;
            hashMap3.put(uri, new f(uri, j46, i30));
        }
        if (eVar != null) {
            arrayList14.add(eVar);
        }
        return new j(i12, str, arrayList13, j13, z19, j15, z15, i14, j24, i15, j22, j23, z12, z14, j15 != 0, dVar6, arrayList4, arrayList14, iVar3, hashMap3);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x018f, code lost:
    
        if (r3 > 0) goto L52;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static m f(j9.a aVar, String str) {
        int i10;
        int i11;
        char c10;
        ArrayList arrayList;
        l lVar;
        String str2;
        ArrayList arrayList2;
        int parseInt;
        String str3;
        l lVar2;
        String str4;
        l lVar3;
        ArrayList arrayList3;
        int i12;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        ArrayList arrayList7;
        HashMap hashMap;
        int i13;
        int i14;
        Uri H2;
        ArrayList arrayList8;
        HashMap hashMap2;
        String str5 = str;
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        ArrayList arrayList9 = new ArrayList();
        ArrayList arrayList10 = new ArrayList();
        ArrayList arrayList11 = new ArrayList();
        ArrayList arrayList12 = new ArrayList();
        ArrayList arrayList13 = new ArrayList();
        ArrayList arrayList14 = new ArrayList();
        ArrayList arrayList15 = new ArrayList();
        ArrayList arrayList16 = new ArrayList();
        boolean z10 = false;
        boolean z11 = false;
        while (true) {
            boolean D2 = aVar.D();
            Pattern pattern = b0;
            ArrayList arrayList17 = arrayList13;
            Pattern pattern2 = g0;
            boolean z12 = z10;
            if (!D2) {
                ArrayList arrayList18 = arrayList14;
                ArrayList arrayList19 = arrayList10;
                ArrayList arrayList20 = arrayList11;
                ArrayList arrayList21 = arrayList12;
                ArrayList arrayList22 = arrayList16;
                ArrayList arrayList23 = arrayList15;
                boolean z13 = z11;
                HashMap hashMap5 = hashMap3;
                ArrayList arrayList24 = arrayList9;
                ArrayList arrayList25 = new ArrayList();
                HashSet hashSet = new HashSet();
                for (int i15 = 0; i15 < arrayList24.size(); i15++) {
                    l lVar4 = (l) arrayList24.get(i15);
                    Uri uri = lVar4.a;
                    t0 t0Var = lVar4.b;
                    if (hashSet.add(uri)) {
                        d5.a.i(t0Var.s == null);
                        ArrayList arrayList26 = (ArrayList) hashMap5.get(lVar4.a);
                        arrayList26.getClass();
                        z3.c cVar = new z3.c(new u(null, null, arrayList26));
                        h3.s0 a2 = t0Var.a();
                        a2.i = cVar;
                        arrayList25.add(new l(lVar4.a, new t0(a2), lVar4.c, lVar4.d, lVar4.e, lVar4.f));
                    }
                }
                int i16 = 0;
                t0 t0Var2 = null;
                List list = null;
                while (i16 < arrayList18.size()) {
                    ArrayList arrayList27 = arrayList18;
                    String str6 = (String) arrayList27.get(i16);
                    String k10 = k(str6, h0, hashMap4);
                    String k11 = k(str6, pattern2, hashMap4);
                    h3.s0 s0Var = new h3.s0();
                    s0Var.a = a9.p.w(k10, ":", k11);
                    s0Var.b = k11;
                    s0Var.n = "application/x-mpegURL";
                    boolean g10 = g(str6, l0);
                    ArrayList arrayList28 = arrayList25;
                    boolean z14 = g10;
                    if (g(str6, m0)) {
                        z14 = (g10 ? 1 : 0) | 2;
                    }
                    int i17 = z14;
                    if (g(str6, k0)) {
                        i17 = (z14 ? 1 : 0) | 4;
                    }
                    s0Var.d = i17;
                    String j10 = j(str6, i0, null, hashMap4);
                    if (TextUtils.isEmpty(j10)) {
                        i10 = i16;
                        i11 = 0;
                    } else {
                        int i18 = g0.a;
                        i10 = i16;
                        String[] split = j10.split(",", -1);
                        i11 = g0.j(split, "public.accessibility.describes-video") ? 512 : 0;
                        if (g0.j(split, "public.accessibility.transcribes-spoken-dialog")) {
                            i11 |= 4096;
                        }
                        if (g0.j(split, "public.accessibility.describes-music-and-sound")) {
                            i11 |= 1024;
                        }
                        if (g0.j(split, "public.easy-to-read")) {
                            i11 |= 8192;
                        }
                    }
                    s0Var.e = i11;
                    s0Var.c = j(str6, f0, null, hashMap4);
                    String j11 = j(str6, pattern, null, hashMap4);
                    Uri H3 = j11 == null ? null : d5.a.H(str5, j11);
                    arrayList18 = arrayList27;
                    z3.c cVar2 = new z3.c(new u(k10, k11, Collections.EMPTY_LIST));
                    String k12 = k(str6, d0, hashMap4);
                    switch (k12.hashCode()) {
                        case -959297733:
                            if (k12.equals("SUBTITLES")) {
                                c10 = 0;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case -333210994:
                            if (k12.equals("CLOSED-CAPTIONS")) {
                                c10 = 1;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 62628790:
                            if (k12.equals("AUDIO")) {
                                c10 = 2;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 81665115:
                            if (k12.equals("VIDEO")) {
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
                            int i19 = 0;
                            while (true) {
                                if (i19 < arrayList24.size()) {
                                    lVar = (l) arrayList24.get(i19);
                                    if (!k10.equals(lVar.e)) {
                                        i19++;
                                    }
                                } else {
                                    lVar = null;
                                }
                            }
                            if (lVar != null) {
                                String o10 = g0.o(3, lVar.b.r);
                                s0Var.h = o10;
                                str2 = d5.q.c(o10);
                            } else {
                                str2 = null;
                            }
                            if (str2 == null) {
                                str2 = "text/vtt";
                            }
                            s0Var.o = str2;
                            s0Var.i = cVar2;
                            if (H3 != null) {
                                arrayList2 = arrayList21;
                                arrayList2.add(new k(H3, new t0(s0Var), k11));
                                break;
                            } else {
                                arrayList2 = arrayList21;
                                d5.a.K("HlsPlaylistParser", "EXT-X-MEDIA tag with missing mandatory URI attribute: skipping");
                                break;
                            }
                        case 1:
                            arrayList = arrayList20;
                            String k13 = k(str6, j0, hashMap4);
                            if (k13.startsWith("CC")) {
                                parseInt = Integer.parseInt(k13.substring(2));
                                str3 = "application/cea-608";
                            } else {
                                parseInt = Integer.parseInt(k13.substring(7));
                                str3 = "application/cea-708";
                            }
                            if (list == null) {
                                list = new ArrayList();
                            }
                            s0Var.o = str3;
                            s0Var.G = parseInt;
                            list.add(new t0(s0Var));
                            arrayList2 = arrayList21;
                            break;
                        case 2:
                            ArrayList arrayList29 = arrayList19;
                            int i20 = 0;
                            while (true) {
                                if (i20 < arrayList24.size()) {
                                    lVar2 = (l) arrayList24.get(i20);
                                    int i21 = i20;
                                    if (!k10.equals(lVar2.d)) {
                                        i20 = i21 + 1;
                                    }
                                } else {
                                    lVar2 = null;
                                }
                            }
                            if (lVar2 != null) {
                                String o11 = g0.o(1, lVar2.b.r);
                                s0Var.h = o11;
                                str4 = d5.q.c(o11);
                            } else {
                                str4 = null;
                            }
                            arrayList19 = arrayList29;
                            String j12 = j(str6, r, null, hashMap4);
                            if (j12 != null) {
                                int i22 = g0.a;
                                s0Var.B = Integer.parseInt(j12.split("/", 2)[0]);
                                if ("audio/eac3".equals(str4) && j12.endsWith("/JOC")) {
                                    s0Var.h = "ec+3";
                                    str4 = "audio/eac3-joc";
                                }
                            }
                            s0Var.o = str4;
                            if (H3 != null) {
                                s0Var.i = cVar2;
                                arrayList = arrayList20;
                                arrayList.add(new k(H3, new t0(s0Var), k11));
                            } else {
                                arrayList = arrayList20;
                                if (lVar2 != null) {
                                    t0Var2 = new t0(s0Var);
                                }
                            }
                            arrayList2 = arrayList21;
                            break;
                        case 3:
                            int i23 = 0;
                            while (true) {
                                if (i23 < arrayList24.size()) {
                                    lVar3 = (l) arrayList24.get(i23);
                                    if (!k10.equals(lVar3.c)) {
                                        i23++;
                                    }
                                } else {
                                    lVar3 = null;
                                }
                            }
                            if (lVar3 != null) {
                                t0 t0Var3 = lVar3.b;
                                String o12 = g0.o(2, t0Var3.r);
                                s0Var.h = o12;
                                s0Var.o = d5.q.c(o12);
                                s0Var.t = t0Var3.G;
                                s0Var.u = t0Var3.H;
                                s0Var.v = t0Var3.I;
                            }
                            if (H3 != null) {
                                s0Var.i = cVar2;
                                arrayList19.add(new k(H3, new t0(s0Var), k11));
                            }
                        default:
                            arrayList2 = arrayList21;
                            arrayList = arrayList20;
                            break;
                    }
                    i16 = i10 + 1;
                    arrayList25 = arrayList28;
                    str5 = str;
                    arrayList20 = arrayList;
                    arrayList21 = arrayList2;
                }
                ArrayList arrayList30 = arrayList25;
                ArrayList arrayList31 = arrayList21;
                ArrayList arrayList32 = arrayList20;
                if (z12) {
                    list = Collections.EMPTY_LIST;
                }
                return new m(str, arrayList22, arrayList30, arrayList19, arrayList32, arrayList31, arrayList17, t0Var2, list, z13, hashMap4, arrayList23);
            }
            String F2 = aVar.F();
            if (F2.startsWith("#EXT")) {
                arrayList16.add(F2);
            }
            boolean startsWith = F2.startsWith("#EXT-X-I-FRAME-STREAM-INF");
            ArrayList arrayList33 = arrayList16;
            if (F2.startsWith("#EXT-X-DEFINE")) {
                hashMap4.put(k(F2, pattern2, hashMap4), k(F2, q0, hashMap4));
            } else if (F2.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                arrayList7 = arrayList14;
                arrayList6 = arrayList10;
                arrayList5 = arrayList11;
                arrayList4 = arrayList12;
                arrayList3 = arrayList15;
                z10 = z12;
                z11 = true;
                hashMap2 = hashMap3;
                arrayList8 = arrayList9;
                arrayList9 = arrayList8;
                hashMap3 = hashMap2;
                arrayList13 = arrayList17;
                arrayList16 = arrayList33;
                arrayList15 = arrayList3;
                arrayList12 = arrayList4;
                arrayList11 = arrayList5;
                arrayList10 = arrayList6;
                arrayList14 = arrayList7;
            } else if (F2.startsWith("#EXT-X-MEDIA")) {
                arrayList14.add(F2);
            } else if (F2.startsWith("#EXT-X-SESSION-KEY")) {
                l3.c c11 = c(F2, j(F2, Z, "identity", hashMap4), hashMap4);
                if (c11 != null) {
                    String k14 = k(F2, Y, hashMap4);
                    arrayList15.add(new l3.d(("SAMPLE-AES-CENC".equals(k14) || "SAMPLE-AES-CTR".equals(k14)) ? "cenc" : "cbcs", true, c11));
                }
            } else if (F2.startsWith("#EXT-X-STREAM-INF") || startsWith) {
                boolean contains = z12 | F2.contains("CLOSED-CAPTIONS=NONE");
                int i24 = startsWith ? 16384 : 0;
                int parseInt2 = Integer.parseInt(k(F2, n, Collections.EMPTY_MAP));
                Matcher matcher = c.matcher(F2);
                if (matcher.find()) {
                    arrayList3 = arrayList15;
                    String group = matcher.group(1);
                    group.getClass();
                    i12 = Integer.parseInt(group);
                } else {
                    arrayList3 = arrayList15;
                    i12 = -1;
                }
                boolean z15 = z11;
                String j13 = j(F2, s, null, hashMap4);
                arrayList4 = arrayList12;
                String j14 = j(F2, v, null, hashMap4);
                arrayList5 = arrayList11;
                boolean equals = TextUtils.equals(j(F2, w, null, hashMap4), "true");
                arrayList6 = arrayList10;
                String j15 = j(F2, x, null, hashMap4);
                String j16 = j(F2, y, null, hashMap4);
                arrayList7 = arrayList14;
                String j17 = j(F2, A, null, hashMap4);
                String j18 = j(F2, B, null, hashMap4);
                if (j18 != null) {
                    int i25 = g0.a;
                    hashMap = hashMap3;
                    String[] split2 = j18.split("x", -1);
                    i13 = Integer.parseInt(split2[0]);
                    i14 = Integer.parseInt(split2[1]);
                    if (i13 > 0) {
                    }
                } else {
                    hashMap = hashMap3;
                }
                i13 = -1;
                i14 = -1;
                ArrayList arrayList34 = arrayList9;
                String j19 = j(F2, C, null, hashMap4);
                float parseFloat = j19 != null ? Float.parseFloat(j19) : -1.0f;
                String j20 = j(F2, d, null, hashMap4);
                String j21 = j(F2, e, null, hashMap4);
                String j22 = j(F2, f, null, hashMap4);
                String j23 = j(F2, h, null, hashMap4);
                if (startsWith) {
                    H2 = d5.a.H(str5, k(F2, pattern, hashMap4));
                } else {
                    if (!aVar.D()) {
                        throw t1.b("#EXT-X-STREAM-INF must be followed by another line", null);
                    }
                    H2 = d5.a.H(str5, l(aVar.F(), hashMap4));
                }
                Uri uri2 = H2;
                h3.s0 s0Var2 = new h3.s0();
                s0Var2.a = Integer.toString(arrayList34.size());
                s0Var2.n = "application/x-mpegURL";
                s0Var2.h = j13;
                s0Var2.o = j14;
                s0Var2.f = i12;
                s0Var2.g = parseInt2;
                s0Var2.t = i13;
                s0Var2.u = i14;
                s0Var2.v = parseFloat;
                s0Var2.e = i24;
                s0Var2.j = equals;
                try {
                    s0Var2.k = Long.parseLong(j15);
                } catch (Exception unused) {
                }
                s0Var2.l = j16;
                try {
                    s0Var2.m = Integer.parseInt(j17);
                } catch (Exception unused2) {
                }
                arrayList8 = arrayList34;
                arrayList8.add(new l(uri2, new t0(s0Var2), j20, j21, j22, j23));
                hashMap2 = hashMap;
                ArrayList arrayList35 = (ArrayList) hashMap2.get(uri2);
                if (arrayList35 == null) {
                    arrayList35 = new ArrayList();
                    hashMap2.put(uri2, arrayList35);
                }
                arrayList35.add(new t(i12, j20, parseInt2, j21, j22, j23));
                z10 = contains;
                z11 = z15;
                arrayList9 = arrayList8;
                hashMap3 = hashMap2;
                arrayList13 = arrayList17;
                arrayList16 = arrayList33;
                arrayList15 = arrayList3;
                arrayList12 = arrayList4;
                arrayList11 = arrayList5;
                arrayList10 = arrayList6;
                arrayList14 = arrayList7;
            }
            arrayList7 = arrayList14;
            arrayList6 = arrayList10;
            arrayList5 = arrayList11;
            arrayList4 = arrayList12;
            arrayList3 = arrayList15;
            z10 = z12;
            hashMap2 = hashMap3;
            arrayList8 = arrayList9;
            arrayList9 = arrayList8;
            hashMap3 = hashMap2;
            arrayList13 = arrayList17;
            arrayList16 = arrayList33;
            arrayList15 = arrayList3;
            arrayList12 = arrayList4;
            arrayList11 = arrayList5;
            arrayList10 = arrayList6;
            arrayList14 = arrayList7;
        }
    }

    public static boolean g(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return "YES".equals(matcher.group(1));
        }
        return false;
    }

    public static double h(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return -9.223372036854776E18d;
        }
        String group = matcher.group(1);
        group.getClass();
        return Double.parseDouble(group);
    }

    public static long i(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return -1L;
        }
        String group = matcher.group(1);
        group.getClass();
        return Long.parseLong(group);
    }

    public static String j(String str, Pattern pattern, String str2, Map map) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            str2 = matcher.group(1);
            str2.getClass();
        }
        return (map.isEmpty() || str2 == null) ? str2 : l(str2, map);
    }

    public static String k(String str, Pattern pattern, Map map) {
        String j10 = j(str, pattern, null, map);
        if (j10 != null) {
            return j10;
        }
        throw t1.b("Couldn't match " + pattern.pattern() + " in " + str, null);
    }

    public static String l(String str, Map map) {
        Matcher matcher = s0.matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String group = matcher.group(1);
            if (map.containsKey(group)) {
                matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement((String) map.get(group)));
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0069 A[Catch: all -> 0x0098, LOOP:0: B:13:0x0069->B:38:0x0069, LOOP_START, TryCatch #2 {all -> 0x0098, blocks: (B:3:0x000f, B:5:0x0018, B:7:0x0020, B:10:0x0029, B:13:0x0069, B:15:0x006f, B:18:0x007a, B:57:0x0082, B:20:0x009b, B:22:0x00a3, B:24:0x00ab, B:26:0x00b3, B:28:0x00bb, B:30:0x00c3, B:32:0x00cb, B:34:0x00d3, B:36:0x00dc, B:41:0x00e0, B:75:0x0106, B:76:0x010c, B:80:0x0030, B:82:0x0036, B:87:0x003f, B:89:0x0048, B:94:0x0051, B:96:0x0057, B:98:0x005d, B:100:0x0062), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0106 A[Catch: all -> 0x0098, TRY_ENTER, TryCatch #2 {all -> 0x0098, blocks: (B:3:0x000f, B:5:0x0018, B:7:0x0020, B:10:0x0029, B:13:0x0069, B:15:0x006f, B:18:0x007a, B:57:0x0082, B:20:0x009b, B:22:0x00a3, B:24:0x00ab, B:26:0x00b3, B:28:0x00bb, B:30:0x00c3, B:32:0x00cb, B:34:0x00d3, B:36:0x00dc, B:41:0x00e0, B:75:0x0106, B:76:0x010c, B:80:0x0030, B:82:0x0036, B:87:0x003f, B:89:0x0048, B:94:0x0051, B:96:0x0057, B:98:0x005d, B:100:0x0062), top: B:2:0x000f }] */
    @Override // com.google.android.exoplayer2.upstream.s0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(Uri uri, com.google.android.exoplayer2.upstream.o oVar) {
        String trim;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(oVar));
        ArrayDeque arrayDeque = new ArrayDeque();
        try {
            int read = bufferedReader.read();
            boolean z10 = false;
            if (read == 239) {
                if (bufferedReader.read() == 187 && bufferedReader.read() == 191) {
                    read = bufferedReader.read();
                }
                if (z10) {
                    throw t1.b("Input does not start with the #EXTM3U header.", null);
                }
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException unused) {
                        }
                        throw t1.b("Failed to parse the playlist, could not identify any tags.", null);
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
                            m f10 = f(new j9.a(arrayDeque, bufferedReader), uri.toString());
                            try {
                                bufferedReader.close();
                            } catch (IOException unused2) {
                            }
                            return f10;
                        }
                    }
                }
                arrayDeque.add(trim);
                j d10 = d(this.a, this.b, new j9.a(arrayDeque, bufferedReader), uri.toString());
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
                    while (read != -1 && Character.isWhitespace(read) && !g0.E(read)) {
                        read = bufferedReader.read();
                    }
                    z10 = g0.E(read);
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
            int i11 = g0.a;
            try {
                bufferedReader.close();
            } catch (IOException unused4) {
            }
        }
    }
}
