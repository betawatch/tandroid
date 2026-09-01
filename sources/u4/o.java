package u4;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import g5.o0;
import h5.d0;
import j3.m0;
import j3.n0;
import j3.r1;
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
import s8.v;
import t4.t;
import t4.u;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class o implements o0 {
    public final l a;
    public final i b;
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
    public static final Pattern B = Pattern.compile("ACCOUNT=\"(.+?)\"");
    public static final Pattern C = Pattern.compile("RESOLUTION=(\\d+x\\d+)");
    public static final Pattern D = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");
    public static final Pattern E = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");
    public static final Pattern F = Pattern.compile("DURATION=([\\d\\.]+)\\b");
    public static final Pattern G = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");
    public static final Pattern H = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");
    public static final Pattern I = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");
    public static final Pattern J = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");
    public static final Pattern K = a("CAN-SKIP-DATERANGES");
    public static final Pattern L = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");
    public static final Pattern M = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");
    public static final Pattern N = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");
    public static final Pattern O = a("CAN-BLOCK-RELOAD");
    public static final Pattern P = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");
    public static final Pattern Q = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");
    public static final Pattern R = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");
    public static final Pattern S = Pattern.compile("LAST-MSN=(\\d+)\\b");
    public static final Pattern T = Pattern.compile("LAST-PART=(\\d+)\\b");
    public static final Pattern U = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");
    public static final Pattern V = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");
    public static final Pattern W = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");
    public static final Pattern X = Pattern.compile("BYTERANGE-START=(\\d+)\\b");
    public static final Pattern Y = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");
    public static final Pattern Z = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");
    public static final Pattern a0 = Pattern.compile("KEYFORMAT=\"(.+?)\"");
    public static final Pattern b0 = Pattern.compile("KEYFORMATVERSIONS=\"(.+?)\"");
    public static final Pattern c0 = Pattern.compile("URI=\"(.+?)\"");
    public static final Pattern d0 = Pattern.compile("IV=([^,.*]+)");
    public static final Pattern e0 = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");
    public static final Pattern f0 = Pattern.compile("TYPE=(PART|MAP)");
    public static final Pattern g0 = Pattern.compile("LANGUAGE=\"(.+?)\"");
    public static final Pattern h0 = Pattern.compile("NAME=\"(.+?)\"");
    public static final Pattern i0 = Pattern.compile("GROUP-ID=\"(.+?)\"");
    public static final Pattern j0 = Pattern.compile("CHARACTERISTICS=\"(.+?)\"");
    public static final Pattern k0 = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");
    public static final Pattern l0 = a("AUTOSELECT");
    public static final Pattern m0 = a("DEFAULT");
    public static final Pattern n0 = a("FORCED");
    public static final Pattern o0 = a("INDEPENDENT");
    public static final Pattern p0 = a("GAP");
    public static final Pattern q0 = a("PRECISE");
    public static final Pattern r0 = Pattern.compile("VALUE=\"(.+?)\"");
    public static final Pattern s0 = Pattern.compile("IMPORT=\"(.+?)\"");
    public static final Pattern t0 = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");

    public o(l lVar, i iVar) {
        this.a = lVar;
        this.b = iVar;
    }

    public static Pattern a(String str) {
        return Pattern.compile(str.concat("=(NO|YES)"));
    }

    public static o3.g b(String str, o3.f[] fVarArr) {
        o3.f[] fVarArr2 = new o3.f[fVarArr.length];
        for (int i10 = 0; i10 < fVarArr.length; i10++) {
            o3.f fVar = fVarArr[i10];
            fVarArr2[i10] = new o3.f(fVar.b, fVar.c, fVar.d, null);
        }
        return new o3.g(str, true, fVarArr2);
    }

    public static o3.f c(String str, String str2, HashMap hashMap) {
        String i10 = i(str, b0, "1", hashMap);
        boolean equals = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2);
        Pattern pattern = c0;
        if (equals) {
            String j10 = j(str, pattern, hashMap);
            return new o3.f(j3.h.d, null, "video/mp4", Base64.decode(j10.substring(j10.indexOf(44)), 0));
        }
        if ("com.widevine".equals(str2)) {
            UUID uuid = j3.h.d;
            int i11 = d0.a;
            return new o3.f(uuid, null, "hls", str.getBytes(r8.d.c));
        }
        if (!"com.microsoft.playready".equals(str2) || !"1".equals(i10)) {
            return null;
        }
        String j11 = j(str, pattern, hashMap);
        byte[] decode = Base64.decode(j11.substring(j11.indexOf(44)), 0);
        UUID uuid2 = j3.h.e;
        return new o3.f(uuid2, null, "video/mp4", z3.j.a(uuid2, null, decode));
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x078b  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x07c2  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x07c5  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x07a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static i d(l lVar, i iVar, s5.m mVar, String str) {
        ArrayList arrayList;
        h hVar;
        f fVar;
        long j10;
        String str2;
        long j11;
        String str3;
        boolean z4;
        String str4;
        ArrayList arrayList2;
        ArrayList arrayList3;
        int i10;
        o3.g gVar;
        long j12;
        o3.g gVar2;
        f fVar2;
        o3.g gVar3;
        String str5;
        o3.g gVar4;
        int i11;
        l lVar2 = lVar;
        i iVar2 = iVar;
        boolean z10 = lVar2.c;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        h hVar2 = new h(-9223372036854775807L, false, -9223372036854775807L, -9223372036854775807L, false);
        TreeMap treeMap = new TreeMap();
        boolean z11 = z10;
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
        boolean z12 = false;
        d dVar = null;
        int i12 = 0;
        o3.g gVar5 = null;
        f fVar3 = null;
        o3.g gVar6 = null;
        int i13 = 0;
        String str7 = null;
        String str8 = null;
        boolean z13 = false;
        char c3 = 0;
        boolean z14 = false;
        int i14 = 0;
        String str9 = null;
        boolean z15 = false;
        boolean z16 = false;
        long j22 = -9223372036854775807L;
        long j23 = -9223372036854775807L;
        long j24 = 0;
        int i15 = 1;
        while (mVar.l()) {
            String m9 = mVar.m();
            if (m9.startsWith("#EXT")) {
                arrayList7.add(m9);
            }
            if (m9.startsWith("#EXT-X-PLAYLIST-TYPE")) {
                String j25 = j(m9, I, hashMap);
                if ("VOD".equals(j25)) {
                    i12 = 1;
                } else if ("EVENT".equals(j25)) {
                    i12 = 2;
                }
            } else if (m9.equals("#EXT-X-I-FRAMES-ONLY")) {
                z15 = true;
            } else {
                if (m9.startsWith("#EXT-X-START")) {
                    double parseDouble = Double.parseDouble(j(m9, U, Collections.EMPTY_MAP));
                    arrayList = arrayList7;
                    hVar = hVar2;
                    z12 = f(m9, q0);
                    j13 = (long) (parseDouble * 1000000.0d);
                } else {
                    arrayList = arrayList7;
                    hVar = hVar2;
                    if (m9.startsWith("#EXT-X-SERVER-CONTROL")) {
                        double g10 = g(m9, J);
                        long j26 = g10 == -9.223372036854776E18d ? -9223372036854775807L : (long) (g10 * 1000000.0d);
                        boolean f10 = f(m9, K);
                        double g11 = g(m9, M);
                        long j27 = g11 == -9.223372036854776E18d ? -9223372036854775807L : (long) (g11 * 1000000.0d);
                        double g12 = g(m9, N);
                        hVar = new h(j26, f10, j27, g12 == -9.223372036854776E18d ? -9223372036854775807L : (long) (g12 * 1000000.0d), f(m9, O));
                    } else if (m9.startsWith("#EXT-X-PART-INF")) {
                        j23 = (long) (Double.parseDouble(j(m9, G, Collections.EMPTY_MAP)) * 1000000.0d);
                    } else {
                        boolean startsWith = m9.startsWith("#EXT-X-MAP");
                        Pattern pattern = W;
                        boolean z17 = z12;
                        Pattern pattern2 = c0;
                        if (startsWith) {
                            String j28 = j(m9, pattern2, hashMap);
                            String i16 = i(m9, pattern, null, hashMap);
                            if (i16 != null) {
                                int i17 = d0.a;
                                String[] split = i16.split("@", -1);
                                j21 = Long.parseLong(split[c3]);
                                if (split.length > 1) {
                                    j17 = Long.parseLong(split[1]);
                                }
                            }
                            long j29 = j21;
                            if (j29 == -1) {
                                j17 = 0;
                            }
                            if (str7 != null && str8 == null) {
                                throw r1.b("The encryption IV attribute must be present when an initialization segment is encrypted with METHOD=AES-128.", null);
                            }
                            String str10 = str7;
                            f fVar4 = new f(j28, j17, j29, str10, str8);
                            str7 = str10;
                            String str11 = str8;
                            if (j29 != -1) {
                                j17 += j29;
                            }
                            arrayList7 = arrayList;
                            fVar3 = fVar4;
                            j21 = -1;
                            hVar2 = hVar;
                            z12 = z17;
                            str8 = str11;
                        } else {
                            String str12 = str8;
                            ArrayList arrayList8 = arrayList5;
                            ArrayList arrayList9 = arrayList6;
                            if (m9.startsWith("#EXT-X-TARGETDURATION")) {
                                j22 = Integer.parseInt(j(m9, E, Collections.EMPTY_MAP)) * 1000000;
                            } else if (m9.startsWith("#EXT-X-MEDIA-SEQUENCE")) {
                                j16 = Long.parseLong(j(m9, P, Collections.EMPTY_MAP));
                                j24 = j16;
                            } else if (m9.startsWith("#EXT-X-VERSION")) {
                                i15 = Integer.parseInt(j(m9, H, Collections.EMPTY_MAP));
                            } else {
                                if (m9.startsWith("#EXT-X-DEFINE")) {
                                    String i18 = i(m9, s0, null, hashMap);
                                    if (i18 != null) {
                                        String str13 = (String) lVar2.l.get(i18);
                                        if (str13 != null) {
                                            hashMap.put(i18, str13);
                                        }
                                    } else {
                                        hashMap.put(j(m9, h0, hashMap), j(m9, r0, hashMap));
                                    }
                                    fVar = fVar3;
                                    j10 = j14;
                                    str2 = str7;
                                    j11 = j21;
                                    str3 = str9;
                                } else if (m9.startsWith("#EXTINF")) {
                                    j19 = new BigDecimal(j(m9, Q, Collections.EMPTY_MAP)).multiply(new BigDecimal(1000000L)).longValue();
                                    str6 = i(m9, R, "", hashMap);
                                } else if (m9.startsWith("#EXT-X-SKIP")) {
                                    int parseInt = Integer.parseInt(j(m9, L, Collections.EMPTY_MAP));
                                    h5.a.i(iVar2 != null && arrayList4.isEmpty());
                                    int i19 = d0.a;
                                    long j30 = iVar2.k;
                                    v vVar = iVar2.r;
                                    int i20 = (int) (j24 - j30);
                                    int i21 = parseInt + i20;
                                    if (i20 < 0 || i21 > vVar.size()) {
                                        throw new n();
                                    }
                                    long j31 = j18;
                                    str8 = str12;
                                    while (i20 < i21) {
                                        f fVar5 = (f) vVar.get(i20);
                                        if (j24 != iVar2.k) {
                                            int i22 = (iVar2.j - i14) + fVar5.d;
                                            v vVar2 = fVar5.x;
                                            ArrayList arrayList10 = new ArrayList();
                                            long j32 = j31;
                                            int i23 = 0;
                                            while (i23 < vVar2.size()) {
                                                d dVar2 = (d) vVar2.get(i23);
                                                arrayList10.add(new d(dVar2.a, dVar2.b, dVar2.c, i22, j32, dVar2.f, dVar2.h, dVar2.n, dVar2.r, dVar2.s, dVar2.v, dVar2.w, dVar2.x));
                                                j32 += dVar2.c;
                                                i23++;
                                                i21 = i21;
                                            }
                                            i11 = i21;
                                            fVar5 = new f(fVar5.a, fVar5.b, fVar5.w, fVar5.c, i22, j31, fVar5.f, fVar5.h, fVar5.n, fVar5.r, fVar5.s, fVar5.v, arrayList10);
                                        } else {
                                            i11 = i21;
                                        }
                                        arrayList4.add(fVar5);
                                        long j33 = fVar5.c;
                                        String str14 = fVar5.n;
                                        j31 += j33;
                                        long j34 = fVar5.s;
                                        if (j34 != -1) {
                                            j17 = fVar5.r + j34;
                                        }
                                        int i24 = fVar5.d;
                                        f fVar6 = fVar5.b;
                                        o3.g gVar7 = fVar5.f;
                                        String str15 = fVar5.h;
                                        if (str14 == null || !str14.equals(Long.toHexString(j16))) {
                                            str8 = str14;
                                        }
                                        j16++;
                                        i20++;
                                        i13 = i24;
                                        fVar3 = fVar6;
                                        str7 = str15;
                                        gVar5 = gVar7;
                                        i21 = i11;
                                        j14 = j31;
                                        iVar2 = iVar;
                                    }
                                    lVar2 = lVar;
                                    iVar2 = iVar;
                                    hVar2 = hVar;
                                    z12 = z17;
                                    arrayList7 = arrayList;
                                    arrayList6 = arrayList9;
                                    arrayList5 = arrayList8;
                                    j18 = j31;
                                } else if (m9.startsWith("#EXT-X-KEY")) {
                                    String j35 = j(m9, Z, hashMap);
                                    String i25 = i(m9, a0, "identity", hashMap);
                                    if ("NONE".equals(j35)) {
                                        treeMap.clear();
                                        gVar5 = null;
                                        str7 = null;
                                        str8 = null;
                                    } else {
                                        String i26 = i(m9, d0, null, hashMap);
                                        if (!"identity".equals(i25)) {
                                            String str16 = str9;
                                            str9 = str16 == null ? ("SAMPLE-AES-CENC".equals(j35) || "SAMPLE-AES-CTR".equals(j35)) ? "cenc" : "cbcs" : str16;
                                            o3.f c10 = c(m9, i25, hashMap);
                                            if (c10 != null) {
                                                treeMap.put(i25, c10);
                                                str8 = i26;
                                                gVar5 = null;
                                                str7 = null;
                                            }
                                        } else if ("AES-128".equals(j35)) {
                                            str7 = j(m9, pattern2, hashMap);
                                            str8 = i26;
                                        }
                                        str8 = i26;
                                        str7 = null;
                                    }
                                    lVar2 = lVar;
                                    iVar2 = iVar;
                                    hVar2 = hVar;
                                    z12 = z17;
                                    arrayList7 = arrayList;
                                    arrayList6 = arrayList9;
                                    arrayList5 = arrayList8;
                                } else {
                                    str3 = str9;
                                    if (m9.startsWith("#EXT-X-BYTERANGE")) {
                                        String j36 = j(m9, V, hashMap);
                                        int i27 = d0.a;
                                        String[] split2 = j36.split("@", -1);
                                        j21 = Long.parseLong(split2[c3]);
                                        if (split2.length > 1) {
                                            j17 = Long.parseLong(split2[1]);
                                        }
                                    } else if (m9.startsWith("#EXT-X-DISCONTINUITY-SEQUENCE")) {
                                        i14 = Integer.parseInt(m9.substring(m9.indexOf(58) + 1));
                                        lVar2 = lVar;
                                        iVar2 = iVar;
                                        str9 = str3;
                                        hVar2 = hVar;
                                        z12 = z17;
                                        str8 = str12;
                                        arrayList7 = arrayList;
                                        arrayList6 = arrayList9;
                                        arrayList5 = arrayList8;
                                        z14 = true;
                                    } else if (m9.equals("#EXT-X-DISCONTINUITY")) {
                                        i13++;
                                    } else if (m9.startsWith("#EXT-X-PROGRAM-DATE-TIME")) {
                                        if (j15 == 0) {
                                            j15 = d0.G(d0.J(m9.substring(m9.indexOf(58) + 1))) - j18;
                                        } else {
                                            fVar = fVar3;
                                            j10 = j14;
                                            str2 = str7;
                                            j11 = j21;
                                        }
                                    } else if (m9.equals("#EXT-X-GAP")) {
                                        lVar2 = lVar;
                                        iVar2 = iVar;
                                        str9 = str3;
                                        hVar2 = hVar;
                                        z12 = z17;
                                        str8 = str12;
                                        arrayList7 = arrayList;
                                        arrayList6 = arrayList9;
                                        arrayList5 = arrayList8;
                                        z16 = true;
                                    } else if (m9.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                                        lVar2 = lVar;
                                        iVar2 = iVar;
                                        str9 = str3;
                                        hVar2 = hVar;
                                        z12 = z17;
                                        str8 = str12;
                                        arrayList7 = arrayList;
                                        arrayList6 = arrayList9;
                                        arrayList5 = arrayList8;
                                        z11 = true;
                                    } else if (m9.equals("#EXT-X-ENDLIST")) {
                                        lVar2 = lVar;
                                        iVar2 = iVar;
                                        str9 = str3;
                                        hVar2 = hVar;
                                        z12 = z17;
                                        str8 = str12;
                                        arrayList7 = arrayList;
                                        arrayList6 = arrayList9;
                                        arrayList5 = arrayList8;
                                        z13 = true;
                                    } else {
                                        if (m9.startsWith("#EXT-X-RENDITION-REPORT")) {
                                            long h9 = h(m9, S);
                                            Matcher matcher = T.matcher(m9);
                                            if (matcher.find()) {
                                                String group = matcher.group(1);
                                                group.getClass();
                                                i10 = Integer.parseInt(group);
                                            } else {
                                                i10 = -1;
                                            }
                                            e eVar = new e(Uri.parse(h5.a.G(str, j(m9, pattern2, hashMap))), h9, i10);
                                            arrayList2 = arrayList9;
                                            arrayList2.add(eVar);
                                        } else {
                                            arrayList2 = arrayList9;
                                            if (!m9.startsWith("#EXT-X-PRELOAD-HINT")) {
                                                o3.g gVar8 = gVar6;
                                                f fVar7 = fVar3;
                                                if (m9.startsWith("#EXT-X-PART")) {
                                                    String hexString = str7 == null ? null : str12 != null ? str12 : Long.toHexString(j16);
                                                    String j37 = j(m9, pattern2, hashMap);
                                                    long parseDouble2 = (long) (Double.parseDouble(j(m9, F, Collections.EMPTY_MAP)) * 1000000.0d);
                                                    boolean f11 = f(m9, o0) | (z11 && arrayList8.isEmpty());
                                                    boolean f12 = f(m9, p0);
                                                    String i28 = i(m9, pattern, null, hashMap);
                                                    if (i28 != null) {
                                                        int i29 = d0.a;
                                                        String[] split3 = i28.split("@", -1);
                                                        long parseLong = Long.parseLong(split3[0]);
                                                        if (split3.length > 1) {
                                                            j20 = Long.parseLong(split3[1]);
                                                        }
                                                        j12 = parseLong;
                                                    } else {
                                                        j12 = -1;
                                                    }
                                                    long j38 = j12 == -1 ? 0L : j20;
                                                    if (gVar5 != null || treeMap.isEmpty()) {
                                                        gVar2 = gVar5;
                                                    } else {
                                                        o3.f[] fVarArr = (o3.f[]) treeMap.values().toArray(new o3.f[0]);
                                                        o3.g gVar9 = new o3.g(str3, true, fVarArr);
                                                        if (gVar8 == null) {
                                                            gVar8 = b(str3, fVarArr);
                                                        }
                                                        gVar2 = gVar9;
                                                    }
                                                    long j39 = j14;
                                                    arrayList8.add(new d(j37, fVar7, parseDouble2, i13, j39, gVar2, str7, hexString, j38, j12, f12, f11, false));
                                                    j14 = j39 + parseDouble2;
                                                    if (j12 != -1) {
                                                        j38 += j12;
                                                    }
                                                    j20 = j38;
                                                    gVar6 = gVar8;
                                                    fVar3 = fVar7;
                                                    arrayList5 = arrayList8;
                                                    str9 = str3;
                                                    gVar5 = gVar2;
                                                    hVar2 = hVar;
                                                    z12 = z17;
                                                    str8 = str12;
                                                    arrayList7 = arrayList;
                                                    c3 = 0;
                                                    iVar2 = iVar;
                                                    arrayList6 = arrayList2;
                                                    lVar2 = lVar;
                                                } else {
                                                    fVar = fVar7;
                                                    j10 = j14;
                                                    arrayList3 = arrayList8;
                                                    if (m9.startsWith("#")) {
                                                        gVar6 = gVar8;
                                                        str2 = str7;
                                                        j11 = j21;
                                                        z4 = z16;
                                                        str4 = str6;
                                                        iVar2 = iVar;
                                                        fVar3 = fVar;
                                                        arrayList5 = arrayList3;
                                                        str9 = str3;
                                                        str6 = str4;
                                                        j14 = j10;
                                                        str7 = str2;
                                                        j21 = j11;
                                                        z16 = z4;
                                                        hVar2 = hVar;
                                                        z12 = z17;
                                                        str8 = str12;
                                                        arrayList7 = arrayList;
                                                        c3 = 0;
                                                        arrayList6 = arrayList2;
                                                        lVar2 = lVar;
                                                    } else {
                                                        String hexString2 = str7 == null ? null : str12 != null ? str12 : Long.toHexString(j16);
                                                        long j40 = j16 + 1;
                                                        String k10 = k(m9, hashMap);
                                                        f fVar8 = (f) hashMap2.get(k10);
                                                        if (j21 == -1) {
                                                            fVar2 = fVar8;
                                                            j17 = 0;
                                                        } else {
                                                            if (z15 && fVar == null && fVar8 == null) {
                                                                fVar8 = new f(k10, 0L, j17, null, null);
                                                                hashMap2.put(k10, fVar8);
                                                            }
                                                            fVar2 = fVar8;
                                                        }
                                                        if (gVar5 != null || treeMap.isEmpty()) {
                                                            gVar3 = gVar8;
                                                            str5 = k10;
                                                        } else {
                                                            gVar3 = gVar8;
                                                            str5 = k10;
                                                            o3.f[] fVarArr2 = (o3.f[]) treeMap.values().toArray(new o3.f[0]);
                                                            o3.g gVar10 = new o3.g(str3, true, fVarArr2);
                                                            if (gVar3 == null) {
                                                                gVar4 = b(str3, fVarArr2);
                                                                gVar5 = gVar10;
                                                                int i30 = i13;
                                                                String str17 = str7;
                                                                long j41 = j21;
                                                                long j42 = j17;
                                                                long j43 = j18;
                                                                long j44 = j19;
                                                                o3.g gVar11 = gVar5;
                                                                i13 = i30;
                                                                arrayList4.add(new f(str5, fVar == null ? fVar : fVar2, str6, j44, i30, j43, gVar11, str17, hexString2, j42, j41, z16, arrayList3));
                                                                j14 = j43 + j44;
                                                                ArrayList arrayList11 = new ArrayList();
                                                                j17 = j21 == -1 ? j42 + j41 : j42;
                                                                arrayList6 = arrayList2;
                                                                gVar6 = gVar4;
                                                                fVar3 = fVar;
                                                                j16 = j40;
                                                                str9 = str3;
                                                                str6 = "";
                                                                j18 = j14;
                                                                gVar5 = gVar11;
                                                                str7 = str17;
                                                                j19 = 0;
                                                                j21 = -1;
                                                                hVar2 = hVar;
                                                                str8 = str12;
                                                                arrayList7 = arrayList;
                                                                c3 = 0;
                                                                z16 = false;
                                                                lVar2 = lVar;
                                                                iVar2 = iVar;
                                                                arrayList5 = arrayList11;
                                                                z12 = z17;
                                                            } else {
                                                                gVar5 = gVar10;
                                                            }
                                                        }
                                                        gVar4 = gVar3;
                                                        int i302 = i13;
                                                        String str172 = str7;
                                                        long j412 = j21;
                                                        long j422 = j17;
                                                        long j432 = j18;
                                                        long j442 = j19;
                                                        o3.g gVar112 = gVar5;
                                                        i13 = i302;
                                                        arrayList4.add(new f(str5, fVar == null ? fVar : fVar2, str6, j442, i302, j432, gVar112, str172, hexString2, j422, j412, z16, arrayList3));
                                                        j14 = j432 + j442;
                                                        ArrayList arrayList112 = new ArrayList();
                                                        if (j21 == -1) {
                                                        }
                                                        arrayList6 = arrayList2;
                                                        gVar6 = gVar4;
                                                        fVar3 = fVar;
                                                        j16 = j40;
                                                        str9 = str3;
                                                        str6 = "";
                                                        j18 = j14;
                                                        gVar5 = gVar112;
                                                        str7 = str172;
                                                        j19 = 0;
                                                        j21 = -1;
                                                        hVar2 = hVar;
                                                        str8 = str12;
                                                        arrayList7 = arrayList;
                                                        c3 = 0;
                                                        z16 = false;
                                                        lVar2 = lVar;
                                                        iVar2 = iVar;
                                                        arrayList5 = arrayList112;
                                                        z12 = z17;
                                                    }
                                                }
                                            } else if (dVar == null && "PART".equals(j(m9, f0, hashMap))) {
                                                o3.g gVar12 = gVar6;
                                                f fVar9 = fVar3;
                                                String j45 = j(m9, pattern2, hashMap);
                                                long h10 = h(m9, X);
                                                long h11 = h(m9, Y);
                                                String hexString3 = str7 == null ? null : str12 != null ? str12 : Long.toHexString(j16);
                                                if (gVar5 != null || treeMap.isEmpty()) {
                                                    gVar = gVar5;
                                                } else {
                                                    o3.f[] fVarArr3 = (o3.f[]) treeMap.values().toArray(new o3.f[0]);
                                                    o3.g gVar13 = new o3.g(str3, true, fVarArr3);
                                                    if (gVar12 == null) {
                                                        gVar12 = b(str3, fVarArr3);
                                                    }
                                                    gVar = gVar13;
                                                }
                                                if (h10 == -1 || h11 != -1) {
                                                    long j46 = j14;
                                                    j14 = j46;
                                                    dVar = new d(j45, fVar9, 0L, i13, j46, gVar, str7, hexString3, h10 != -1 ? h10 : 0L, h11, false, false, true);
                                                }
                                                arrayList6 = arrayList2;
                                                str9 = str3;
                                                fVar3 = fVar9;
                                                gVar5 = gVar;
                                                hVar2 = hVar;
                                                z12 = z17;
                                                str8 = str12;
                                                arrayList7 = arrayList;
                                                arrayList5 = arrayList8;
                                                c3 = 0;
                                                lVar2 = lVar;
                                                gVar6 = gVar12;
                                                iVar2 = iVar;
                                            }
                                        }
                                        fVar = fVar3;
                                        j10 = j14;
                                        str2 = str7;
                                        j11 = j21;
                                        z4 = z16;
                                        str4 = str6;
                                        arrayList3 = arrayList8;
                                        iVar2 = iVar;
                                        fVar3 = fVar;
                                        arrayList5 = arrayList3;
                                        str9 = str3;
                                        str6 = str4;
                                        j14 = j10;
                                        str7 = str2;
                                        j21 = j11;
                                        z16 = z4;
                                        hVar2 = hVar;
                                        z12 = z17;
                                        str8 = str12;
                                        arrayList7 = arrayList;
                                        c3 = 0;
                                        arrayList6 = arrayList2;
                                        lVar2 = lVar;
                                    }
                                    lVar2 = lVar;
                                    iVar2 = iVar;
                                    str9 = str3;
                                }
                                z4 = z16;
                                str4 = str6;
                                arrayList2 = arrayList9;
                                arrayList3 = arrayList8;
                                iVar2 = iVar;
                                fVar3 = fVar;
                                arrayList5 = arrayList3;
                                str9 = str3;
                                str6 = str4;
                                j14 = j10;
                                str7 = str2;
                                j21 = j11;
                                z16 = z4;
                                hVar2 = hVar;
                                z12 = z17;
                                str8 = str12;
                                arrayList7 = arrayList;
                                c3 = 0;
                                arrayList6 = arrayList2;
                                lVar2 = lVar;
                            }
                            hVar2 = hVar;
                            z12 = z17;
                            str8 = str12;
                            arrayList7 = arrayList;
                            arrayList6 = arrayList9;
                            arrayList5 = arrayList8;
                        }
                    }
                }
                arrayList7 = arrayList;
                hVar2 = hVar;
            }
        }
        boolean z18 = z12;
        ArrayList arrayList12 = arrayList6;
        ArrayList arrayList13 = arrayList7;
        h hVar3 = hVar2;
        ArrayList arrayList14 = arrayList5;
        HashMap hashMap3 = new HashMap();
        for (int i31 = 0; i31 < arrayList12.size(); i31++) {
            e eVar2 = (e) arrayList12.get(i31);
            long j47 = eVar2.b;
            if (j47 == -1) {
                j47 = (j24 + arrayList4.size()) - (arrayList14.isEmpty() ? 1L : 0L);
            }
            int i32 = eVar2.c;
            if (i32 == -1 && j23 != -9223372036854775807L) {
                i32 = (arrayList14.isEmpty() ? ((f) s8.l.h(arrayList4)).x : arrayList14).size() - 1;
            }
            Uri uri = eVar2.a;
            hashMap3.put(uri, new e(uri, j47, i32));
        }
        if (dVar != null) {
            arrayList14.add(dVar);
        }
        return new i(i12, str, arrayList13, j13, z18, j15, z14, i14, j24, i15, j22, j23, z11, z13, j15 != 0, gVar6, arrayList4, arrayList14, hVar3, hashMap3);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x018f, code lost:
    
        if (r3 > 0) goto L52;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static l e(s5.m mVar, String str) {
        int i10;
        int i11;
        char c3;
        ArrayList arrayList;
        k kVar;
        String str2;
        ArrayList arrayList2;
        int parseInt;
        String str3;
        k kVar2;
        String str4;
        k kVar3;
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
        boolean z4 = false;
        boolean z10 = false;
        while (true) {
            boolean l10 = mVar.l();
            Pattern pattern = c0;
            ArrayList arrayList17 = arrayList13;
            Pattern pattern2 = h0;
            boolean z11 = z4;
            if (!l10) {
                ArrayList arrayList18 = arrayList14;
                ArrayList arrayList19 = arrayList10;
                ArrayList arrayList20 = arrayList11;
                ArrayList arrayList21 = arrayList12;
                ArrayList arrayList22 = arrayList16;
                ArrayList arrayList23 = arrayList15;
                boolean z12 = z10;
                HashMap hashMap5 = hashMap3;
                ArrayList arrayList24 = arrayList9;
                ArrayList arrayList25 = new ArrayList();
                HashSet hashSet = new HashSet();
                for (int i15 = 0; i15 < arrayList24.size(); i15++) {
                    k kVar4 = (k) arrayList24.get(i15);
                    Uri uri = kVar4.a;
                    n0 n0Var = kVar4.b;
                    if (hashSet.add(uri)) {
                        h5.a.i(n0Var.s == null);
                        ArrayList arrayList26 = (ArrayList) hashMap5.get(kVar4.a);
                        arrayList26.getClass();
                        e4.c cVar = new e4.c(new u(null, null, arrayList26));
                        m0 a2 = n0Var.a();
                        a2.i = cVar;
                        arrayList25.add(new k(kVar4.a, new n0(a2), kVar4.c, kVar4.d, kVar4.e, kVar4.f));
                    }
                }
                int i16 = 0;
                n0 n0Var2 = null;
                List list = null;
                while (i16 < arrayList18.size()) {
                    ArrayList arrayList27 = arrayList18;
                    String str6 = (String) arrayList27.get(i16);
                    String j10 = j(str6, i0, hashMap4);
                    String j11 = j(str6, pattern2, hashMap4);
                    m0 m0Var = new m0();
                    m0Var.a = android.support.v4.media.a.z(j10, ":", j11);
                    m0Var.b = j11;
                    m0Var.n = "application/x-mpegURL";
                    boolean f10 = f(str6, m0);
                    ArrayList arrayList28 = arrayList25;
                    boolean z13 = f10;
                    if (f(str6, n0)) {
                        z13 = (f10 ? 1 : 0) | 2;
                    }
                    int i17 = z13;
                    if (f(str6, l0)) {
                        i17 = (z13 ? 1 : 0) | 4;
                    }
                    m0Var.d = i17;
                    String i18 = i(str6, j0, null, hashMap4);
                    if (TextUtils.isEmpty(i18)) {
                        i10 = i16;
                        i11 = 0;
                    } else {
                        int i19 = d0.a;
                        i10 = i16;
                        String[] split = i18.split(",", -1);
                        i11 = d0.j(split, "public.accessibility.describes-video") ? 512 : 0;
                        if (d0.j(split, "public.accessibility.transcribes-spoken-dialog")) {
                            i11 |= 4096;
                        }
                        if (d0.j(split, "public.accessibility.describes-music-and-sound")) {
                            i11 |= 1024;
                        }
                        if (d0.j(split, "public.easy-to-read")) {
                            i11 |= 8192;
                        }
                    }
                    m0Var.e = i11;
                    m0Var.c = i(str6, g0, null, hashMap4);
                    String i20 = i(str6, pattern, null, hashMap4);
                    Uri H3 = i20 == null ? null : h5.a.H(str5, i20);
                    arrayList18 = arrayList27;
                    e4.c cVar2 = new e4.c(new u(j10, j11, Collections.EMPTY_LIST));
                    String j12 = j(str6, e0, hashMap4);
                    switch (j12.hashCode()) {
                        case -959297733:
                            if (j12.equals("SUBTITLES")) {
                                c3 = 0;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case -333210994:
                            if (j12.equals("CLOSED-CAPTIONS")) {
                                c3 = 1;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 62628790:
                            if (j12.equals("AUDIO")) {
                                c3 = 2;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 81665115:
                            if (j12.equals("VIDEO")) {
                                c3 = 3;
                                break;
                            }
                            c3 = 65535;
                            break;
                        default:
                            c3 = 65535;
                            break;
                    }
                    switch (c3) {
                        case 0:
                            arrayList = arrayList20;
                            int i21 = 0;
                            while (true) {
                                if (i21 < arrayList24.size()) {
                                    kVar = (k) arrayList24.get(i21);
                                    if (!j10.equals(kVar.e)) {
                                        i21++;
                                    }
                                } else {
                                    kVar = null;
                                }
                            }
                            if (kVar != null) {
                                String p10 = d0.p(3, kVar.b.r);
                                m0Var.h = p10;
                                str2 = h5.o.c(p10);
                            } else {
                                str2 = null;
                            }
                            if (str2 == null) {
                                str2 = "text/vtt";
                            }
                            m0Var.o = str2;
                            m0Var.i = cVar2;
                            if (H3 != null) {
                                arrayList2 = arrayList21;
                                arrayList2.add(new j(H3, new n0(m0Var), j11));
                                break;
                            } else {
                                arrayList2 = arrayList21;
                                h5.a.K("HlsPlaylistParser", "EXT-X-MEDIA tag with missing mandatory URI attribute: skipping");
                                break;
                            }
                        case 1:
                            arrayList = arrayList20;
                            String j13 = j(str6, k0, hashMap4);
                            if (j13.startsWith("CC")) {
                                parseInt = Integer.parseInt(j13.substring(2));
                                str3 = "application/cea-608";
                            } else {
                                parseInt = Integer.parseInt(j13.substring(7));
                                str3 = "application/cea-708";
                            }
                            if (list == null) {
                                list = new ArrayList();
                            }
                            m0Var.o = str3;
                            m0Var.G = parseInt;
                            list.add(new n0(m0Var));
                            arrayList2 = arrayList21;
                            break;
                        case 2:
                            ArrayList arrayList29 = arrayList19;
                            int i22 = 0;
                            while (true) {
                                if (i22 < arrayList24.size()) {
                                    kVar2 = (k) arrayList24.get(i22);
                                    int i23 = i22;
                                    if (!j10.equals(kVar2.d)) {
                                        i22 = i23 + 1;
                                    }
                                } else {
                                    kVar2 = null;
                                }
                            }
                            if (kVar2 != null) {
                                String p11 = d0.p(1, kVar2.b.r);
                                m0Var.h = p11;
                                str4 = h5.o.c(p11);
                            } else {
                                str4 = null;
                            }
                            arrayList19 = arrayList29;
                            String i24 = i(str6, r, null, hashMap4);
                            if (i24 != null) {
                                int i25 = d0.a;
                                m0Var.B = Integer.parseInt(i24.split("/", 2)[0]);
                                if ("audio/eac3".equals(str4) && i24.endsWith("/JOC")) {
                                    m0Var.h = "ec+3";
                                    str4 = "audio/eac3-joc";
                                }
                            }
                            m0Var.o = str4;
                            if (H3 != null) {
                                m0Var.i = cVar2;
                                arrayList = arrayList20;
                                arrayList.add(new j(H3, new n0(m0Var), j11));
                            } else {
                                arrayList = arrayList20;
                                if (kVar2 != null) {
                                    n0Var2 = new n0(m0Var);
                                }
                            }
                            arrayList2 = arrayList21;
                            break;
                        case 3:
                            int i26 = 0;
                            while (true) {
                                if (i26 < arrayList24.size()) {
                                    kVar3 = (k) arrayList24.get(i26);
                                    if (!j10.equals(kVar3.c)) {
                                        i26++;
                                    }
                                } else {
                                    kVar3 = null;
                                }
                            }
                            if (kVar3 != null) {
                                n0 n0Var3 = kVar3.b;
                                String p12 = d0.p(2, n0Var3.r);
                                m0Var.h = p12;
                                m0Var.o = h5.o.c(p12);
                                m0Var.t = n0Var3.H;
                                m0Var.u = n0Var3.I;
                                m0Var.v = n0Var3.J;
                            }
                            if (H3 != null) {
                                m0Var.i = cVar2;
                                arrayList19.add(new j(H3, new n0(m0Var), j11));
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
                if (z11) {
                    list = Collections.EMPTY_LIST;
                }
                return new l(str, arrayList22, arrayList30, arrayList19, arrayList32, arrayList31, arrayList17, n0Var2, list, z12, hashMap4, arrayList23);
            }
            String m9 = mVar.m();
            if (m9.startsWith("#EXT")) {
                arrayList16.add(m9);
            }
            boolean startsWith = m9.startsWith("#EXT-X-I-FRAME-STREAM-INF");
            ArrayList arrayList33 = arrayList16;
            if (m9.startsWith("#EXT-X-DEFINE")) {
                hashMap4.put(j(m9, pattern2, hashMap4), j(m9, r0, hashMap4));
            } else if (m9.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                arrayList7 = arrayList14;
                arrayList6 = arrayList10;
                arrayList5 = arrayList11;
                arrayList4 = arrayList12;
                arrayList3 = arrayList15;
                z4 = z11;
                z10 = true;
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
            } else if (m9.startsWith("#EXT-X-MEDIA")) {
                arrayList14.add(m9);
            } else if (m9.startsWith("#EXT-X-SESSION-KEY")) {
                o3.f c10 = c(m9, i(m9, a0, "identity", hashMap4), hashMap4);
                if (c10 != null) {
                    String j14 = j(m9, Z, hashMap4);
                    arrayList15.add(new o3.g(("SAMPLE-AES-CENC".equals(j14) || "SAMPLE-AES-CTR".equals(j14)) ? "cenc" : "cbcs", true, c10));
                }
            } else if (m9.startsWith("#EXT-X-STREAM-INF") || startsWith) {
                boolean contains = z11 | m9.contains("CLOSED-CAPTIONS=NONE");
                int i27 = startsWith ? 16384 : 0;
                int parseInt2 = Integer.parseInt(j(m9, n, Collections.EMPTY_MAP));
                Matcher matcher = c.matcher(m9);
                if (matcher.find()) {
                    arrayList3 = arrayList15;
                    String group = matcher.group(1);
                    group.getClass();
                    i12 = Integer.parseInt(group);
                } else {
                    arrayList3 = arrayList15;
                    i12 = -1;
                }
                boolean z14 = z10;
                String i28 = i(m9, s, null, hashMap4);
                arrayList4 = arrayList12;
                String i29 = i(m9, v, null, hashMap4);
                arrayList5 = arrayList11;
                boolean equals = TextUtils.equals(i(m9, w, null, hashMap4), "true");
                arrayList6 = arrayList10;
                String i30 = i(m9, x, null, hashMap4);
                String i31 = i(m9, y, null, hashMap4);
                arrayList7 = arrayList14;
                String i32 = i(m9, B, null, hashMap4);
                String i33 = i(m9, C, null, hashMap4);
                if (i33 != null) {
                    int i34 = d0.a;
                    hashMap = hashMap3;
                    String[] split2 = i33.split("x", -1);
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
                String i35 = i(m9, D, null, hashMap4);
                float parseFloat = i35 != null ? Float.parseFloat(i35) : -1.0f;
                String i36 = i(m9, d, null, hashMap4);
                String i37 = i(m9, e, null, hashMap4);
                String i38 = i(m9, f, null, hashMap4);
                String i39 = i(m9, h, null, hashMap4);
                if (startsWith) {
                    H2 = h5.a.H(str5, j(m9, pattern, hashMap4));
                } else {
                    if (!mVar.l()) {
                        throw r1.b("#EXT-X-STREAM-INF must be followed by another line", null);
                    }
                    H2 = h5.a.H(str5, k(mVar.m(), hashMap4));
                }
                Uri uri2 = H2;
                m0 m0Var2 = new m0();
                m0Var2.a = Integer.toString(arrayList34.size());
                m0Var2.n = "application/x-mpegURL";
                m0Var2.h = i28;
                m0Var2.o = i29;
                m0Var2.f = i12;
                m0Var2.g = parseInt2;
                m0Var2.t = i13;
                m0Var2.u = i14;
                m0Var2.v = parseFloat;
                m0Var2.e = i27;
                m0Var2.j = equals;
                try {
                    m0Var2.k = Long.parseLong(i30);
                } catch (Exception unused) {
                }
                m0Var2.l = i31;
                try {
                    m0Var2.m = Integer.parseInt(i32);
                } catch (Exception unused2) {
                }
                arrayList8 = arrayList34;
                arrayList8.add(new k(uri2, new n0(m0Var2), i36, i37, i38, i39));
                hashMap2 = hashMap;
                ArrayList arrayList35 = (ArrayList) hashMap2.get(uri2);
                if (arrayList35 == null) {
                    arrayList35 = new ArrayList();
                    hashMap2.put(uri2, arrayList35);
                }
                arrayList35.add(new t(i12, i36, parseInt2, i37, i38, i39));
                z4 = contains;
                z10 = z14;
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
            z4 = z11;
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

    public static boolean f(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return "YES".equals(matcher.group(1));
        }
        return false;
    }

    public static double g(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return -9.223372036854776E18d;
        }
        String group = matcher.group(1);
        group.getClass();
        return Double.parseDouble(group);
    }

    public static long h(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return -1L;
        }
        String group = matcher.group(1);
        group.getClass();
        return Long.parseLong(group);
    }

    public static String i(String str, Pattern pattern, String str2, Map map) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            str2 = matcher.group(1);
            str2.getClass();
        }
        return (map.isEmpty() || str2 == null) ? str2 : k(str2, map);
    }

    public static String j(String str, Pattern pattern, Map map) {
        String i10 = i(str, pattern, null, map);
        if (i10 != null) {
            return i10;
        }
        throw r1.b("Couldn't match " + pattern.pattern() + " in " + str, null);
    }

    public static String k(String str, Map map) {
        Matcher matcher = t0.matcher(str);
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
    @Override // g5.o0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object w(Uri uri, g5.o oVar) {
        String trim;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(oVar));
        ArrayDeque arrayDeque = new ArrayDeque();
        try {
            int read = bufferedReader.read();
            boolean z4 = false;
            if (read == 239) {
                if (bufferedReader.read() == 187 && bufferedReader.read() == 191) {
                    read = bufferedReader.read();
                }
                if (z4) {
                    throw r1.b("Input does not start with the #EXTM3U header.", null);
                }
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException unused) {
                        }
                        throw r1.b("Failed to parse the playlist, could not identify any tags.", null);
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
                            l e6 = e(new s5.m(arrayDeque, bufferedReader), uri.toString());
                            try {
                                bufferedReader.close();
                            } catch (IOException unused2) {
                            }
                            return e6;
                        }
                    }
                }
                arrayDeque.add(trim);
                i d10 = d(this.a, this.b, new s5.m(arrayDeque, bufferedReader), uri.toString());
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
                    while (read != -1 && Character.isWhitespace(read) && !d0.E(read)) {
                        read = bufferedReader.read();
                    }
                    z4 = d0.E(read);
                } else {
                    if (read != "#EXTM3U".charAt(i10)) {
                        break;
                    }
                    read = bufferedReader.read();
                    i10++;
                }
            }
            if (z4) {
            }
        } finally {
            int i11 = d0.a;
            try {
                bufferedReader.close();
            } catch (IOException unused4) {
            }
        }
    }
}
