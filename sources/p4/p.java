package p4;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.exoplayer2.upstream.s0;
import d5.f0;
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
import o8.z;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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

    public static l3.c b(String str, l3.b[] bVarArr) {
        l3.b[] bVarArr2 = new l3.b[bVarArr.length];
        for (int i9 = 0; i9 < bVarArr.length; i9++) {
            l3.b bVar = bVarArr[i9];
            bVarArr2[i9] = new l3.b(bVar.b, bVar.c, bVar.d, null);
        }
        return new l3.c(str, true, bVarArr2);
    }

    public static l3.b c(String str, String str2, HashMap hashMap) {
        String i9 = i(str, a0, "1", hashMap);
        boolean equals = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2);
        Pattern pattern = b0;
        if (equals) {
            String j10 = j(str, pattern, hashMap);
            return new l3.b(h3.h.d, null, "video/mp4", Base64.decode(j10.substring(j10.indexOf(44)), 0));
        }
        if ("com.widevine".equals(str2)) {
            UUID uuid = h3.h.d;
            int i10 = f0.a;
            return new l3.b(uuid, null, "hls", str.getBytes(n8.d.c));
        }
        if (!"com.microsoft.playready".equals(str2) || !"1".equals(i9)) {
            return null;
        }
        String j11 = j(str, pattern, hashMap);
        byte[] decode = Base64.decode(j11.substring(j11.indexOf(44)), 0);
        UUID uuid2 = h3.h.e;
        return new l3.b(uuid2, null, "video/mp4", u3.j.a(uuid2, null, decode));
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x078b  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x07c2  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x07c5  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x07a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static j d(m mVar, j jVar, j4.c cVar, String str) {
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
        int i9;
        l3.c cVar2;
        long j12;
        l3.c cVar3;
        g gVar2;
        l3.c cVar4;
        String str5;
        l3.c cVar5;
        int i10;
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
        int i11 = 0;
        l3.c cVar6 = null;
        g gVar3 = null;
        l3.c cVar7 = null;
        int i12 = 0;
        String str7 = null;
        String str8 = null;
        boolean z14 = false;
        char c10 = 0;
        boolean z15 = false;
        int i13 = 0;
        String str9 = null;
        boolean z16 = false;
        boolean z17 = false;
        long j22 = -9223372036854775807L;
        long j23 = -9223372036854775807L;
        long j24 = 0;
        int i14 = 1;
        while (cVar.B()) {
            String D2 = cVar.D();
            if (D2.startsWith("#EXT")) {
                arrayList7.add(D2);
            }
            if (D2.startsWith("#EXT-X-PLAYLIST-TYPE")) {
                String j25 = j(D2, H, hashMap);
                if ("VOD".equals(j25)) {
                    i11 = 1;
                } else if ("EVENT".equals(j25)) {
                    i11 = 2;
                }
            } else if (D2.equals("#EXT-X-I-FRAMES-ONLY")) {
                z16 = true;
            } else {
                if (D2.startsWith("#EXT-X-START")) {
                    double parseDouble = Double.parseDouble(j(D2, T, Collections.EMPTY_MAP));
                    arrayList = arrayList7;
                    iVar = iVar2;
                    z13 = f(D2, p0);
                    j13 = (long) (parseDouble * 1000000.0d);
                } else {
                    arrayList = arrayList7;
                    iVar = iVar2;
                    if (D2.startsWith("#EXT-X-SERVER-CONTROL")) {
                        double g10 = g(D2, I);
                        long j26 = g10 == -9.223372036854776E18d ? -9223372036854775807L : (long) (g10 * 1000000.0d);
                        boolean f10 = f(D2, J);
                        double g11 = g(D2, L);
                        long j27 = g11 == -9.223372036854776E18d ? -9223372036854775807L : (long) (g11 * 1000000.0d);
                        double g12 = g(D2, M);
                        iVar = new i(j26, f10, j27, g12 == -9.223372036854776E18d ? -9223372036854775807L : (long) (g12 * 1000000.0d), f(D2, N));
                    } else if (D2.startsWith("#EXT-X-PART-INF")) {
                        j23 = (long) (Double.parseDouble(j(D2, F, Collections.EMPTY_MAP)) * 1000000.0d);
                    } else {
                        boolean startsWith = D2.startsWith("#EXT-X-MAP");
                        Pattern pattern = V;
                        boolean z18 = z13;
                        Pattern pattern2 = b0;
                        if (startsWith) {
                            String j28 = j(D2, pattern2, hashMap);
                            String i15 = i(D2, pattern, null, hashMap);
                            if (i15 != null) {
                                int i16 = f0.a;
                                String[] split = i15.split("@", -1);
                                j21 = Long.parseLong(split[c10]);
                                if (split.length > 1) {
                                    j17 = Long.parseLong(split[1]);
                                }
                            }
                            long j29 = j21;
                            if (j29 == -1) {
                                j17 = 0;
                            }
                            if (str7 != null && str8 == null) {
                                throw t1.b("The encryption IV attribute must be present when an initialization segment is encrypted with METHOD=AES-128.", null);
                            }
                            String str10 = str7;
                            g gVar4 = new g(j28, j17, j29, str10, str8);
                            str7 = str10;
                            String str11 = str8;
                            if (j29 != -1) {
                                j17 += j29;
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
                            if (D2.startsWith("#EXT-X-TARGETDURATION")) {
                                j22 = Integer.parseInt(j(D2, D, Collections.EMPTY_MAP)) * 1000000;
                            } else if (D2.startsWith("#EXT-X-MEDIA-SEQUENCE")) {
                                j16 = Long.parseLong(j(D2, O, Collections.EMPTY_MAP));
                                j24 = j16;
                            } else if (D2.startsWith("#EXT-X-VERSION")) {
                                i14 = Integer.parseInt(j(D2, G, Collections.EMPTY_MAP));
                            } else {
                                if (D2.startsWith("#EXT-X-DEFINE")) {
                                    String i17 = i(D2, r0, null, hashMap);
                                    if (i17 != null) {
                                        String str13 = (String) mVar2.l.get(i17);
                                        if (str13 != null) {
                                            hashMap.put(i17, str13);
                                        }
                                    } else {
                                        hashMap.put(j(D2, g0, hashMap), j(D2, q0, hashMap));
                                    }
                                    gVar = gVar3;
                                    j10 = j14;
                                    str2 = str7;
                                    j11 = j21;
                                    str3 = str9;
                                } else if (D2.startsWith("#EXTINF")) {
                                    j19 = new BigDecimal(j(D2, P, Collections.EMPTY_MAP)).multiply(new BigDecimal(1000000L)).longValue();
                                    str6 = i(D2, Q, "", hashMap);
                                } else if (D2.startsWith("#EXT-X-SKIP")) {
                                    int parseInt = Integer.parseInt(j(D2, K, Collections.EMPTY_MAP));
                                    d5.a.i(jVar2 != null && arrayList4.isEmpty());
                                    int i18 = f0.a;
                                    long j30 = jVar2.k;
                                    z zVar = jVar2.r;
                                    int i19 = (int) (j24 - j30);
                                    int i20 = parseInt + i19;
                                    if (i19 < 0 || i20 > zVar.size()) {
                                        throw new o();
                                    }
                                    long j31 = j18;
                                    str8 = str12;
                                    while (i19 < i20) {
                                        g gVar5 = (g) zVar.get(i19);
                                        if (j24 != jVar2.k) {
                                            int i21 = (jVar2.j - i13) + gVar5.d;
                                            z zVar2 = gVar5.x;
                                            ArrayList arrayList10 = new ArrayList();
                                            long j32 = j31;
                                            int i22 = 0;
                                            while (i22 < zVar2.size()) {
                                                e eVar2 = (e) zVar2.get(i22);
                                                arrayList10.add(new e(eVar2.a, eVar2.b, eVar2.c, i21, j32, eVar2.f, eVar2.h, eVar2.n, eVar2.r, eVar2.s, eVar2.v, eVar2.w, eVar2.x));
                                                j32 += eVar2.c;
                                                i22++;
                                                i20 = i20;
                                            }
                                            i10 = i20;
                                            gVar5 = new g(gVar5.a, gVar5.b, gVar5.w, gVar5.c, i21, j31, gVar5.f, gVar5.h, gVar5.n, gVar5.r, gVar5.s, gVar5.v, arrayList10);
                                        } else {
                                            i10 = i20;
                                        }
                                        arrayList4.add(gVar5);
                                        long j33 = gVar5.c;
                                        String str14 = gVar5.n;
                                        j31 += j33;
                                        long j34 = gVar5.s;
                                        if (j34 != -1) {
                                            j17 = gVar5.r + j34;
                                        }
                                        int i23 = gVar5.d;
                                        g gVar6 = gVar5.b;
                                        l3.c cVar8 = gVar5.f;
                                        String str15 = gVar5.h;
                                        if (str14 == null || !str14.equals(Long.toHexString(j16))) {
                                            str8 = str14;
                                        }
                                        j16++;
                                        i19++;
                                        i12 = i23;
                                        gVar3 = gVar6;
                                        str7 = str15;
                                        cVar6 = cVar8;
                                        i20 = i10;
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
                                } else if (D2.startsWith("#EXT-X-KEY")) {
                                    String j35 = j(D2, Y, hashMap);
                                    String i24 = i(D2, Z, "identity", hashMap);
                                    if ("NONE".equals(j35)) {
                                        treeMap.clear();
                                        cVar6 = null;
                                        str7 = null;
                                        str8 = null;
                                    } else {
                                        String i25 = i(D2, c0, null, hashMap);
                                        if (!"identity".equals(i24)) {
                                            String str16 = str9;
                                            str9 = str16 == null ? ("SAMPLE-AES-CENC".equals(j35) || "SAMPLE-AES-CTR".equals(j35)) ? "cenc" : "cbcs" : str16;
                                            l3.b c11 = c(D2, i24, hashMap);
                                            if (c11 != null) {
                                                treeMap.put(i24, c11);
                                                str8 = i25;
                                                cVar6 = null;
                                                str7 = null;
                                            }
                                        } else if ("AES-128".equals(j35)) {
                                            str7 = j(D2, pattern2, hashMap);
                                            str8 = i25;
                                        }
                                        str8 = i25;
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
                                    if (D2.startsWith("#EXT-X-BYTERANGE")) {
                                        String j36 = j(D2, U, hashMap);
                                        int i26 = f0.a;
                                        String[] split2 = j36.split("@", -1);
                                        j21 = Long.parseLong(split2[c10]);
                                        if (split2.length > 1) {
                                            j17 = Long.parseLong(split2[1]);
                                        }
                                    } else if (D2.startsWith("#EXT-X-DISCONTINUITY-SEQUENCE")) {
                                        i13 = Integer.parseInt(D2.substring(D2.indexOf(58) + 1));
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
                                    } else if (D2.equals("#EXT-X-DISCONTINUITY")) {
                                        i12++;
                                    } else if (D2.startsWith("#EXT-X-PROGRAM-DATE-TIME")) {
                                        if (j15 == 0) {
                                            j15 = f0.H(f0.K(D2.substring(D2.indexOf(58) + 1))) - j18;
                                        } else {
                                            gVar = gVar3;
                                            j10 = j14;
                                            str2 = str7;
                                            j11 = j21;
                                        }
                                    } else if (D2.equals("#EXT-X-GAP")) {
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
                                    } else if (D2.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
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
                                    } else if (D2.equals("#EXT-X-ENDLIST")) {
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
                                        if (D2.startsWith("#EXT-X-RENDITION-REPORT")) {
                                            long h10 = h(D2, R);
                                            Matcher matcher = S.matcher(D2);
                                            if (matcher.find()) {
                                                String group = matcher.group(1);
                                                group.getClass();
                                                i9 = Integer.parseInt(group);
                                            } else {
                                                i9 = -1;
                                            }
                                            f fVar = new f(Uri.parse(d5.a.G(str, j(D2, pattern2, hashMap))), h10, i9);
                                            arrayList2 = arrayList9;
                                            arrayList2.add(fVar);
                                        } else {
                                            arrayList2 = arrayList9;
                                            if (!D2.startsWith("#EXT-X-PRELOAD-HINT")) {
                                                l3.c cVar9 = cVar7;
                                                g gVar7 = gVar3;
                                                if (D2.startsWith("#EXT-X-PART")) {
                                                    String hexString = str7 == null ? null : str12 != null ? str12 : Long.toHexString(j16);
                                                    String j37 = j(D2, pattern2, hashMap);
                                                    long parseDouble2 = (long) (Double.parseDouble(j(D2, E, Collections.EMPTY_MAP)) * 1000000.0d);
                                                    boolean f11 = f(D2, n0) | (z12 && arrayList8.isEmpty());
                                                    boolean f12 = f(D2, o0);
                                                    String i27 = i(D2, pattern, null, hashMap);
                                                    if (i27 != null) {
                                                        int i28 = f0.a;
                                                        String[] split3 = i27.split("@", -1);
                                                        long parseLong = Long.parseLong(split3[0]);
                                                        if (split3.length > 1) {
                                                            j20 = Long.parseLong(split3[1]);
                                                        }
                                                        j12 = parseLong;
                                                    } else {
                                                        j12 = -1;
                                                    }
                                                    long j38 = j12 == -1 ? 0L : j20;
                                                    if (cVar6 != null || treeMap.isEmpty()) {
                                                        cVar3 = cVar6;
                                                    } else {
                                                        l3.b[] bVarArr = (l3.b[]) treeMap.values().toArray(new l3.b[0]);
                                                        l3.c cVar10 = new l3.c(str3, true, bVarArr);
                                                        if (cVar9 == null) {
                                                            cVar9 = b(str3, bVarArr);
                                                        }
                                                        cVar3 = cVar10;
                                                    }
                                                    long j39 = j14;
                                                    arrayList8.add(new e(j37, gVar7, parseDouble2, i12, j39, cVar3, str7, hexString, j38, j12, f12, f11, false));
                                                    j14 = j39 + parseDouble2;
                                                    if (j12 != -1) {
                                                        j38 += j12;
                                                    }
                                                    j20 = j38;
                                                    cVar7 = cVar9;
                                                    gVar3 = gVar7;
                                                    arrayList5 = arrayList8;
                                                    str9 = str3;
                                                    cVar6 = cVar3;
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
                                                    if (D2.startsWith("#")) {
                                                        cVar7 = cVar9;
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
                                                        String k10 = k(D2, hashMap);
                                                        g gVar8 = (g) hashMap2.get(k10);
                                                        if (j21 == -1) {
                                                            gVar2 = gVar8;
                                                            j17 = 0;
                                                        } else {
                                                            if (z16 && gVar == null && gVar8 == null) {
                                                                gVar8 = new g(k10, 0L, j17, null, null);
                                                                hashMap2.put(k10, gVar8);
                                                            }
                                                            gVar2 = gVar8;
                                                        }
                                                        if (cVar6 != null || treeMap.isEmpty()) {
                                                            cVar4 = cVar9;
                                                            str5 = k10;
                                                        } else {
                                                            cVar4 = cVar9;
                                                            str5 = k10;
                                                            l3.b[] bVarArr2 = (l3.b[]) treeMap.values().toArray(new l3.b[0]);
                                                            l3.c cVar11 = new l3.c(str3, true, bVarArr2);
                                                            if (cVar4 == null) {
                                                                cVar5 = b(str3, bVarArr2);
                                                                cVar6 = cVar11;
                                                                int i29 = i12;
                                                                String str17 = str7;
                                                                long j41 = j21;
                                                                long j42 = j17;
                                                                long j43 = j18;
                                                                long j44 = j19;
                                                                l3.c cVar12 = cVar6;
                                                                i12 = i29;
                                                                arrayList4.add(new g(str5, gVar == null ? gVar : gVar2, str6, j44, i29, j43, cVar12, str17, hexString2, j42, j41, z17, arrayList3));
                                                                j14 = j43 + j44;
                                                                ArrayList arrayList11 = new ArrayList();
                                                                j17 = j21 == -1 ? j42 + j41 : j42;
                                                                arrayList6 = arrayList2;
                                                                cVar7 = cVar5;
                                                                gVar3 = gVar;
                                                                j16 = j40;
                                                                str9 = str3;
                                                                str6 = "";
                                                                j18 = j14;
                                                                cVar6 = cVar12;
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
                                                                cVar6 = cVar11;
                                                            }
                                                        }
                                                        cVar5 = cVar4;
                                                        int i292 = i12;
                                                        String str172 = str7;
                                                        long j412 = j21;
                                                        long j422 = j17;
                                                        long j432 = j18;
                                                        long j442 = j19;
                                                        l3.c cVar122 = cVar6;
                                                        i12 = i292;
                                                        arrayList4.add(new g(str5, gVar == null ? gVar : gVar2, str6, j442, i292, j432, cVar122, str172, hexString2, j422, j412, z17, arrayList3));
                                                        j14 = j432 + j442;
                                                        ArrayList arrayList112 = new ArrayList();
                                                        if (j21 == -1) {
                                                        }
                                                        arrayList6 = arrayList2;
                                                        cVar7 = cVar5;
                                                        gVar3 = gVar;
                                                        j16 = j40;
                                                        str9 = str3;
                                                        str6 = "";
                                                        j18 = j14;
                                                        cVar6 = cVar122;
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
                                            } else if (eVar == null && "PART".equals(j(D2, e0, hashMap))) {
                                                l3.c cVar13 = cVar7;
                                                g gVar9 = gVar3;
                                                String j45 = j(D2, pattern2, hashMap);
                                                long h11 = h(D2, W);
                                                long h12 = h(D2, X);
                                                String hexString3 = str7 == null ? null : str12 != null ? str12 : Long.toHexString(j16);
                                                if (cVar6 != null || treeMap.isEmpty()) {
                                                    cVar2 = cVar6;
                                                } else {
                                                    l3.b[] bVarArr3 = (l3.b[]) treeMap.values().toArray(new l3.b[0]);
                                                    l3.c cVar14 = new l3.c(str3, true, bVarArr3);
                                                    if (cVar13 == null) {
                                                        cVar13 = b(str3, bVarArr3);
                                                    }
                                                    cVar2 = cVar14;
                                                }
                                                if (h11 == -1 || h12 != -1) {
                                                    long j46 = j14;
                                                    j14 = j46;
                                                    eVar = new e(j45, gVar9, 0L, i12, j46, cVar2, str7, hexString3, h11 != -1 ? h11 : 0L, h12, false, false, true);
                                                }
                                                arrayList6 = arrayList2;
                                                str9 = str3;
                                                gVar3 = gVar9;
                                                cVar6 = cVar2;
                                                iVar2 = iVar;
                                                z13 = z18;
                                                str8 = str12;
                                                arrayList7 = arrayList;
                                                arrayList5 = arrayList8;
                                                c10 = 0;
                                                mVar2 = mVar;
                                                cVar7 = cVar13;
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
        for (int i30 = 0; i30 < arrayList12.size(); i30++) {
            f fVar2 = (f) arrayList12.get(i30);
            long j47 = fVar2.b;
            if (j47 == -1) {
                j47 = (j24 + arrayList4.size()) - (arrayList14.isEmpty() ? 1L : 0L);
            }
            int i31 = fVar2.c;
            if (i31 == -1 && j23 != -9223372036854775807L) {
                i31 = (arrayList14.isEmpty() ? ((g) o8.l.g(arrayList4)).x : arrayList14).size() - 1;
            }
            Uri uri = fVar2.a;
            hashMap3.put(uri, new f(uri, j47, i31));
        }
        if (eVar != null) {
            arrayList14.add(eVar);
        }
        return new j(i11, str, arrayList13, j13, z19, j15, z15, i13, j24, i14, j22, j23, z12, z14, j15 != 0, cVar7, arrayList4, arrayList14, iVar3, hashMap3);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x018f, code lost:
    
        if (r3 > 0) goto L52;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static m e(j4.c cVar, String str) {
        int i9;
        int i10;
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
        int i11;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        ArrayList arrayList7;
        HashMap hashMap;
        int i12;
        int i13;
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
            boolean B2 = cVar.B();
            Pattern pattern = b0;
            ArrayList arrayList17 = arrayList13;
            Pattern pattern2 = g0;
            boolean z12 = z10;
            if (!B2) {
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
                for (int i14 = 0; i14 < arrayList24.size(); i14++) {
                    l lVar4 = (l) arrayList24.get(i14);
                    Uri uri = lVar4.a;
                    t0 t0Var = lVar4.b;
                    if (hashSet.add(uri)) {
                        d5.a.i(t0Var.s == null);
                        ArrayList arrayList26 = (ArrayList) hashMap5.get(lVar4.a);
                        arrayList26.getClass();
                        z3.c cVar2 = new z3.c(new u(null, null, arrayList26));
                        h3.s0 a2 = t0Var.a();
                        a2.i = cVar2;
                        arrayList25.add(new l(lVar4.a, new t0(a2), lVar4.c, lVar4.d, lVar4.e, lVar4.f));
                    }
                }
                int i15 = 0;
                t0 t0Var2 = null;
                List list = null;
                while (i15 < arrayList18.size()) {
                    ArrayList arrayList27 = arrayList18;
                    String str6 = (String) arrayList27.get(i15);
                    String j10 = j(str6, h0, hashMap4);
                    String j11 = j(str6, pattern2, hashMap4);
                    h3.s0 s0Var = new h3.s0();
                    s0Var.a = aa.d.z(j10, ":", j11);
                    s0Var.b = j11;
                    s0Var.n = "application/x-mpegURL";
                    boolean f10 = f(str6, l0);
                    ArrayList arrayList28 = arrayList25;
                    boolean z14 = f10;
                    if (f(str6, m0)) {
                        z14 = (f10 ? 1 : 0) | 2;
                    }
                    int i16 = z14;
                    if (f(str6, k0)) {
                        i16 = (z14 ? 1 : 0) | 4;
                    }
                    s0Var.d = i16;
                    String i17 = i(str6, i0, null, hashMap4);
                    if (TextUtils.isEmpty(i17)) {
                        i9 = i15;
                        i10 = 0;
                    } else {
                        int i18 = f0.a;
                        i9 = i15;
                        String[] split = i17.split(",", -1);
                        i10 = f0.j(split, "public.accessibility.describes-video") ? 512 : 0;
                        if (f0.j(split, "public.accessibility.transcribes-spoken-dialog")) {
                            i10 |= 4096;
                        }
                        if (f0.j(split, "public.accessibility.describes-music-and-sound")) {
                            i10 |= 1024;
                        }
                        if (f0.j(split, "public.easy-to-read")) {
                            i10 |= 8192;
                        }
                    }
                    s0Var.e = i10;
                    s0Var.c = i(str6, f0, null, hashMap4);
                    String i19 = i(str6, pattern, null, hashMap4);
                    Uri H3 = i19 == null ? null : d5.a.H(str5, i19);
                    arrayList18 = arrayList27;
                    z3.c cVar3 = new z3.c(new u(j10, j11, Collections.EMPTY_LIST));
                    String j12 = j(str6, d0, hashMap4);
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
                            int i20 = 0;
                            while (true) {
                                if (i20 < arrayList24.size()) {
                                    lVar = (l) arrayList24.get(i20);
                                    if (!j10.equals(lVar.e)) {
                                        i20++;
                                    }
                                } else {
                                    lVar = null;
                                }
                            }
                            if (lVar != null) {
                                String o6 = f0.o(3, lVar.b.r);
                                s0Var.h = o6;
                                str2 = d5.q.c(o6);
                            } else {
                                str2 = null;
                            }
                            if (str2 == null) {
                                str2 = "text/vtt";
                            }
                            s0Var.o = str2;
                            s0Var.i = cVar3;
                            if (H3 != null) {
                                arrayList2 = arrayList21;
                                arrayList2.add(new k(H3, new t0(s0Var), j11));
                                break;
                            } else {
                                arrayList2 = arrayList21;
                                d5.a.K("HlsPlaylistParser", "EXT-X-MEDIA tag with missing mandatory URI attribute: skipping");
                                break;
                            }
                        case 1:
                            arrayList = arrayList20;
                            String j13 = j(str6, j0, hashMap4);
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
                            s0Var.o = str3;
                            s0Var.G = parseInt;
                            list.add(new t0(s0Var));
                            arrayList2 = arrayList21;
                            break;
                        case 2:
                            ArrayList arrayList29 = arrayList19;
                            int i21 = 0;
                            while (true) {
                                if (i21 < arrayList24.size()) {
                                    lVar2 = (l) arrayList24.get(i21);
                                    int i22 = i21;
                                    if (!j10.equals(lVar2.d)) {
                                        i21 = i22 + 1;
                                    }
                                } else {
                                    lVar2 = null;
                                }
                            }
                            if (lVar2 != null) {
                                String o9 = f0.o(1, lVar2.b.r);
                                s0Var.h = o9;
                                str4 = d5.q.c(o9);
                            } else {
                                str4 = null;
                            }
                            arrayList19 = arrayList29;
                            String i23 = i(str6, r, null, hashMap4);
                            if (i23 != null) {
                                int i24 = f0.a;
                                s0Var.B = Integer.parseInt(i23.split("/", 2)[0]);
                                if ("audio/eac3".equals(str4) && i23.endsWith("/JOC")) {
                                    s0Var.h = "ec+3";
                                    str4 = "audio/eac3-joc";
                                }
                            }
                            s0Var.o = str4;
                            if (H3 != null) {
                                s0Var.i = cVar3;
                                arrayList = arrayList20;
                                arrayList.add(new k(H3, new t0(s0Var), j11));
                            } else {
                                arrayList = arrayList20;
                                if (lVar2 != null) {
                                    t0Var2 = new t0(s0Var);
                                }
                            }
                            arrayList2 = arrayList21;
                            break;
                        case 3:
                            int i25 = 0;
                            while (true) {
                                if (i25 < arrayList24.size()) {
                                    lVar3 = (l) arrayList24.get(i25);
                                    if (!j10.equals(lVar3.c)) {
                                        i25++;
                                    }
                                } else {
                                    lVar3 = null;
                                }
                            }
                            if (lVar3 != null) {
                                t0 t0Var3 = lVar3.b;
                                String o10 = f0.o(2, t0Var3.r);
                                s0Var.h = o10;
                                s0Var.o = d5.q.c(o10);
                                s0Var.t = t0Var3.G;
                                s0Var.u = t0Var3.H;
                                s0Var.v = t0Var3.I;
                            }
                            if (H3 != null) {
                                s0Var.i = cVar3;
                                arrayList19.add(new k(H3, new t0(s0Var), j11));
                            }
                        default:
                            arrayList2 = arrayList21;
                            arrayList = arrayList20;
                            break;
                    }
                    i15 = i9 + 1;
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
            String D2 = cVar.D();
            if (D2.startsWith("#EXT")) {
                arrayList16.add(D2);
            }
            boolean startsWith = D2.startsWith("#EXT-X-I-FRAME-STREAM-INF");
            ArrayList arrayList33 = arrayList16;
            if (D2.startsWith("#EXT-X-DEFINE")) {
                hashMap4.put(j(D2, pattern2, hashMap4), j(D2, q0, hashMap4));
            } else if (D2.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
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
            } else if (D2.startsWith("#EXT-X-MEDIA")) {
                arrayList14.add(D2);
            } else if (D2.startsWith("#EXT-X-SESSION-KEY")) {
                l3.b c11 = c(D2, i(D2, Z, "identity", hashMap4), hashMap4);
                if (c11 != null) {
                    String j14 = j(D2, Y, hashMap4);
                    arrayList15.add(new l3.c(("SAMPLE-AES-CENC".equals(j14) || "SAMPLE-AES-CTR".equals(j14)) ? "cenc" : "cbcs", true, c11));
                }
            } else if (D2.startsWith("#EXT-X-STREAM-INF") || startsWith) {
                boolean contains = z12 | D2.contains("CLOSED-CAPTIONS=NONE");
                int i26 = startsWith ? 16384 : 0;
                int parseInt2 = Integer.parseInt(j(D2, n, Collections.EMPTY_MAP));
                Matcher matcher = c.matcher(D2);
                if (matcher.find()) {
                    arrayList3 = arrayList15;
                    String group = matcher.group(1);
                    group.getClass();
                    i11 = Integer.parseInt(group);
                } else {
                    arrayList3 = arrayList15;
                    i11 = -1;
                }
                boolean z15 = z11;
                String i27 = i(D2, s, null, hashMap4);
                arrayList4 = arrayList12;
                String i28 = i(D2, v, null, hashMap4);
                arrayList5 = arrayList11;
                boolean equals = TextUtils.equals(i(D2, w, null, hashMap4), "true");
                arrayList6 = arrayList10;
                String i29 = i(D2, x, null, hashMap4);
                String i30 = i(D2, y, null, hashMap4);
                arrayList7 = arrayList14;
                String i31 = i(D2, A, null, hashMap4);
                String i32 = i(D2, B, null, hashMap4);
                if (i32 != null) {
                    int i33 = f0.a;
                    hashMap = hashMap3;
                    String[] split2 = i32.split("x", -1);
                    i12 = Integer.parseInt(split2[0]);
                    i13 = Integer.parseInt(split2[1]);
                    if (i12 > 0) {
                    }
                } else {
                    hashMap = hashMap3;
                }
                i12 = -1;
                i13 = -1;
                ArrayList arrayList34 = arrayList9;
                String i34 = i(D2, C, null, hashMap4);
                float parseFloat = i34 != null ? Float.parseFloat(i34) : -1.0f;
                String i35 = i(D2, d, null, hashMap4);
                String i36 = i(D2, e, null, hashMap4);
                String i37 = i(D2, f, null, hashMap4);
                String i38 = i(D2, h, null, hashMap4);
                if (startsWith) {
                    H2 = d5.a.H(str5, j(D2, pattern, hashMap4));
                } else {
                    if (!cVar.B()) {
                        throw t1.b("#EXT-X-STREAM-INF must be followed by another line", null);
                    }
                    H2 = d5.a.H(str5, k(cVar.D(), hashMap4));
                }
                Uri uri2 = H2;
                h3.s0 s0Var2 = new h3.s0();
                s0Var2.a = Integer.toString(arrayList34.size());
                s0Var2.n = "application/x-mpegURL";
                s0Var2.h = i27;
                s0Var2.o = i28;
                s0Var2.f = i11;
                s0Var2.g = parseInt2;
                s0Var2.t = i12;
                s0Var2.u = i13;
                s0Var2.v = parseFloat;
                s0Var2.e = i26;
                s0Var2.j = equals;
                try {
                    s0Var2.k = Long.parseLong(i29);
                } catch (Exception unused) {
                }
                s0Var2.l = i30;
                try {
                    s0Var2.m = Integer.parseInt(i31);
                } catch (Exception unused2) {
                }
                arrayList8 = arrayList34;
                arrayList8.add(new l(uri2, new t0(s0Var2), i35, i36, i37, i38));
                hashMap2 = hashMap;
                ArrayList arrayList35 = (ArrayList) hashMap2.get(uri2);
                if (arrayList35 == null) {
                    arrayList35 = new ArrayList();
                    hashMap2.put(uri2, arrayList35);
                }
                arrayList35.add(new t(i11, i35, parseInt2, i36, i37, i38));
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
        String i9 = i(str, pattern, null, map);
        if (i9 != null) {
            return i9;
        }
        throw t1.b("Couldn't match " + pattern.pattern() + " in " + str, null);
    }

    public static String k(String str, Map map) {
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
    public final Object D(Uri uri, com.google.android.exoplayer2.upstream.o oVar) {
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
                            m e10 = e(new j4.c(arrayDeque, bufferedReader), uri.toString());
                            try {
                                bufferedReader.close();
                            } catch (IOException unused2) {
                            }
                            return e10;
                        }
                    }
                }
                arrayDeque.add(trim);
                j d9 = d(this.a, this.b, new j4.c(arrayDeque, bufferedReader), uri.toString());
                try {
                    bufferedReader.close();
                } catch (IOException unused3) {
                }
                return d9;
            }
            while (read != -1 && Character.isWhitespace(read)) {
                read = bufferedReader.read();
            }
            int i9 = 0;
            while (true) {
                if (i9 >= 7) {
                    while (read != -1 && Character.isWhitespace(read) && !f0.E(read)) {
                        read = bufferedReader.read();
                    }
                    z10 = f0.E(read);
                } else {
                    if (read != "#EXTM3U".charAt(i9)) {
                        break;
                    }
                    read = bufferedReader.read();
                    i9++;
                }
            }
            if (z10) {
            }
        } finally {
            int i10 = f0.a;
            try {
                bufferedReader.close();
            } catch (IOException unused4) {
            }
        }
    }
}
