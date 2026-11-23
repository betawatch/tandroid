package s2;

import a8.bb;
import a8.ma;
import a8.p0;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.internal.vision.e2;
import e2.q0;
import e2.s0;
import e2.t0;
import h2.l0;
import h9.i0;
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
import org.telegram.ui.Components.i61;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class t implements b3.r {
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

    public t(q qVar, n nVar) {
        this.a = qVar;
        this.b = nVar;
    }

    public static Pattern a(String str) {
        return Pattern.compile(str.concat("=(NO|YES)"));
    }

    public static e2.r b(String str, e2.q[] qVarArr) {
        e2.q[] qVarArr2 = new e2.q[qVarArr.length];
        for (int i7 = 0; i7 < qVarArr.length; i7++) {
            e2.q qVar = qVarArr[i7];
            qVarArr2[i7] = new e2.q(qVar.b, qVar.c, qVar.d, null);
        }
        return new e2.r(str, true, qVarArr2);
    }

    public static e2.q c(String str, String str2, HashMap hashMap, org.telegram.utils.twidget.w wVar) {
        String j3 = j(str, l0, "1", hashMap, wVar);
        boolean equals = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2);
        Pattern pattern = m0;
        if (equals) {
            String k10 = k(str, pattern, hashMap, wVar);
            return new e2.q(e2.l.e, null, "video/mp4", Base64.decode(k10.substring(k10.indexOf(44)), 0));
        }
        if ("com.widevine".equals(str2)) {
            UUID uuid = e2.l.e;
            String str3 = l0.a;
            return new e2.q(uuid, null, "hls", str.getBytes(StandardCharsets.UTF_8));
        }
        if (!"com.microsoft.playready".equals(str2) || !"1".equals(j3)) {
            return null;
        }
        String k11 = k(str, pattern, hashMap, wVar);
        byte[] decode = Base64.decode(k11.substring(k11.indexOf(44)), 0);
        UUID uuid2 = e2.l.f;
        return new e2.q(uuid2, null, "video/mp4", z3.p.a(uuid2, null, decode));
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
    public static n d(q qVar, n nVar, i61 i61Var, Uri uri, org.telegram.utils.twidget.w wVar) {
        HashMap hashMap;
        Iterator it;
        h hVar;
        ArrayList arrayList;
        LinkedHashMap linkedHashMap;
        String str;
        int i7;
        String str2;
        int i10;
        long j3;
        int i11;
        i iVar;
        String str3;
        long j10;
        String str4;
        HashMap hashMap2;
        LinkedHashMap linkedHashMap2;
        ArrayList arrayList2;
        String str5;
        TreeMap treeMap;
        ArrayList arrayList3;
        String str6;
        int i12;
        e2.r rVar;
        e2.r rVar2;
        String str7;
        int i13;
        String str8;
        ArrayList arrayList4;
        ArrayList arrayList5;
        long j11;
        String str9;
        int i14;
        e2.r rVar3;
        String j12;
        String str10;
        String str11;
        Matcher b10;
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
        int i15;
        char c11;
        String str13;
        long j13;
        e2.r rVar4;
        e2.r rVar5;
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
        int i16 = 0;
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
        int i17 = 0;
        int i18 = 0;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        int i19 = 0;
        int i20 = 0;
        boolean z16 = false;
        int i21 = 1;
        e2.r rVar6 = null;
        e2.r rVar7 = null;
        String str16 = null;
        String str17 = null;
        i iVar2 = null;
        String str18 = null;
        while (true) {
            int i22 = i17;
            String str19 = "POINT";
            m mVar2 = mVar;
            if (!i61Var.G()) {
                ArrayList arrayList16 = arrayList12;
                ArrayList arrayList17 = arrayList13;
                ArrayList arrayList18 = arrayList14;
                ArrayList arrayList19 = arrayList15;
                LinkedHashMap linkedHashMap4 = linkedHashMap3;
                i iVar3 = iVar2;
                HashMap hashMap5 = new HashMap();
                int i23 = i16;
                while (i23 < arrayList18.size()) {
                    ArrayList arrayList20 = arrayList18;
                    j jVar = (j) arrayList20.get(i23);
                    long j26 = jVar.b;
                    if (j26 == -1) {
                        j26 = (j18 + arrayList16.size()) - (arrayList17.isEmpty() ? 1L : 0L);
                    }
                    int i24 = jVar.c;
                    if (i24 == -1 && j15 != -9223372036854775807L) {
                        i24 = (arrayList17.isEmpty() ? ((k) h9.o.n(arrayList16)).y : arrayList17).size() - 1;
                    }
                    Uri uri3 = jVar.a;
                    hashMap5.put(uri3, new j(uri3, j26, i24));
                    i23++;
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
                return new n(i20, uri.toString(), arrayList19, j16, z14, j20, z13, i18, j18, i21, j17, j15, z12, z15, j20 != 0, rVar6, arrayList16, arrayList17, mVar2, hashMap6, arrayList21, kVar2);
            }
            String J2 = i61Var.J();
            HashMap hashMap7 = hashMap4;
            if (J2.startsWith("#EXT")) {
                arrayList15.add(J2);
            }
            if (J2.startsWith("#EXT-X-PLAYLIST-TYPE")) {
                String k10 = k(J2, S, hashMap3, wVar);
                if ("VOD".equals(k10)) {
                    i20 = 1;
                } else if ("EVENT".equals(k10)) {
                    i20 = 2;
                }
                i17 = i22;
                mVar = mVar2;
            } else if (J2.equals("#EXT-X-I-FRAMES-ONLY")) {
                i17 = i22;
                mVar = mVar2;
                hashMap4 = hashMap7;
                z16 = true;
            } else {
                if (J2.startsWith("#EXT-X-START")) {
                    arrayList = arrayList15;
                    linkedHashMap = linkedHashMap3;
                    long parseDouble = (long) (Double.parseDouble(k(J2, e0, Collections.EMPTY_MAP, wVar)) * 1000000.0d);
                    z14 = f(J2, B0, wVar);
                    j16 = parseDouble;
                } else {
                    arrayList = arrayList15;
                    linkedHashMap = linkedHashMap3;
                    if (J2.startsWith("#EXT-X-SERVER-CONTROL")) {
                        double h7 = h(J2, T, -9.223372036854776E18d, wVar);
                        long j33 = h7 == -9.223372036854776E18d ? -9223372036854775807L : (long) (h7 * 1000000.0d);
                        boolean f10 = f(J2, U, wVar);
                        double h10 = h(J2, W, -9.223372036854776E18d, wVar);
                        long j34 = h10 == -9.223372036854776E18d ? -9223372036854775807L : (long) (h10 * 1000000.0d);
                        double h11 = h(J2, X, -9.223372036854776E18d, wVar);
                        arrayList15 = arrayList;
                        i17 = i22;
                        hashMap4 = hashMap7;
                        linkedHashMap3 = linkedHashMap;
                        mVar = new m(j33, f10, j34, h11 == -9.223372036854776E18d ? -9223372036854775807L : (long) (h11 * 1000000.0d), f(J2, Y, wVar));
                    } else if (J2.startsWith("#EXT-X-PART-INF")) {
                        j15 = (long) (Double.parseDouble(k(J2, Q, Collections.EMPTY_MAP, wVar)) * 1000000.0d);
                    } else {
                        boolean startsWith = J2.startsWith("#EXT-X-MAP");
                        Pattern pattern = g0;
                        Pattern pattern2 = m0;
                        if (startsWith) {
                            String k11 = k(J2, pattern2, hashMap3, wVar);
                            String j35 = j(J2, pattern, null, hashMap3, wVar);
                            if (j35 != null) {
                                String str24 = l0.a;
                                String[] split = j35.split("@", -1);
                                j14 = Long.parseLong(split[i16]);
                                if (split.length > 1) {
                                    j22 = Long.parseLong(split[1]);
                                }
                            }
                            long j36 = j14;
                            long j37 = j36 == -1 ? 0L : j22;
                            if (str16 != null && str17 == null) {
                                throw t0.b("The encryption IV attribute must be present when an initialization segment is encrypted with METHOD=AES-128.", null);
                            }
                            k kVar3 = new k(k11, j37, j36, str16, str17);
                            String str25 = str17;
                            if (j36 != -1) {
                                j37 += j36;
                            }
                            j22 = j37;
                            kVar2 = kVar3;
                            i17 = i22;
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
                                j17 = Integer.parseInt(k(J2, N, Collections.EMPTY_MAP, wVar)) * 1000000;
                            } else if (J2.startsWith("#EXT-X-MEDIA-SEQUENCE")) {
                                j21 = Long.parseLong(k(J2, Z, Collections.EMPTY_MAP, wVar));
                                i17 = i22;
                                j18 = j21;
                                mVar = mVar2;
                                hashMap4 = hashMap7;
                                linkedHashMap3 = linkedHashMap;
                                arrayList15 = arrayList;
                                str17 = str26;
                                arrayList14 = arrayList27;
                                arrayList13 = arrayList26;
                            } else if (J2.startsWith("#EXT-X-VERSION")) {
                                i21 = Integer.parseInt(k(J2, R, Collections.EMPTY_MAP, wVar));
                            } else {
                                if (J2.startsWith("#EXT-X-DEFINE")) {
                                    String j38 = j(J2, r0, null, hashMap3, wVar);
                                    String j39 = j(J2, s0, null, hashMap3, wVar);
                                    if (j38 != null) {
                                        m(j38, hashMap3);
                                        hashMap3.put(j38, k(J2, C0, hashMap3, wVar));
                                    } else if (j39 != null) {
                                        m(j39, hashMap3);
                                        String queryParameter = uri.getQueryParameter(j39);
                                        if (queryParameter == null) {
                                            throw t0.b("QUERYPARAM \"" + j39 + "\" not found in playlist URI", null);
                                        }
                                        hashMap3.put(j39, queryParameter);
                                    } else {
                                        String k12 = k(J2, D0, hashMap3, wVar);
                                        m(k12, hashMap3);
                                        String str27 = (String) qVar2.l.get(k12);
                                        if (str27 != null) {
                                            hashMap3.put(k12, str27);
                                        }
                                    }
                                    str = str16;
                                    i7 = i22;
                                    str2 = str14;
                                    i10 = i16;
                                    j3 = j14;
                                    i11 = i19;
                                    iVar = iVar2;
                                    str3 = str18;
                                    j10 = j24;
                                    str4 = str15;
                                    hashMap2 = hashMap7;
                                    linkedHashMap2 = linkedHashMap;
                                    arrayList2 = arrayList26;
                                    str5 = uri2;
                                    treeMap = treeMap2;
                                } else if (J2.startsWith("#EXTINF")) {
                                    j24 = new BigDecimal(k(J2, a0, Collections.EMPTY_MAP, wVar)).multiply(new BigDecimal(1000000L)).longValue();
                                    str15 = j(J2, b0, str14, hashMap3, wVar);
                                } else if (J2.startsWith("#EXT-X-SKIP")) {
                                    int parseInt = Integer.parseInt(k(J2, V, Collections.EMPTY_MAP, wVar));
                                    ma.p((nVar2 == null || !arrayList12.isEmpty()) ? i16 : 1);
                                    String str28 = l0.a;
                                    long j40 = nVar2.k;
                                    i0 i0Var = nVar2.r;
                                    int i25 = (int) (j18 - j40);
                                    int i26 = parseInt + i25;
                                    if (i25 >= 0 && i26 <= i0Var.size()) {
                                        long j41 = j23;
                                        str17 = str26;
                                        while (i25 < i26) {
                                            k kVar4 = (k) i0Var.get(i25);
                                            if (j18 != nVar2.k) {
                                                int i27 = (nVar2.j - i18) + kVar4.d;
                                                i0 i0Var2 = kVar4.y;
                                                ArrayList arrayList28 = new ArrayList();
                                                int i28 = i16;
                                                long j42 = j41;
                                                while (i28 < i0Var2.size()) {
                                                    i iVar4 = (i) i0Var2.get(i28);
                                                    arrayList28.add(new i(iVar4.a, iVar4.b, iVar4.c, i27, j42, iVar4.f, iVar4.h, iVar4.n, iVar4.r, iVar4.s, iVar4.w, iVar4.x, iVar4.y));
                                                    j42 += iVar4.c;
                                                    i28++;
                                                    str14 = str14;
                                                }
                                                str6 = str14;
                                                kVar4 = new k(kVar4.a, kVar4.b, kVar4.x, kVar4.c, i27, j41, kVar4.f, kVar4.h, kVar4.n, kVar4.r, kVar4.s, kVar4.w, arrayList28);
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
                                            int i29 = kVar4.d;
                                            k kVar5 = kVar4.b;
                                            e2.r rVar8 = kVar4.f;
                                            String str30 = kVar4.h;
                                            if (str29 == null || !str29.equals(Long.toHexString(j21))) {
                                                str17 = str29;
                                            }
                                            j21++;
                                            i25++;
                                            i22 = i29;
                                            kVar2 = kVar5;
                                            str16 = str30;
                                            rVar7 = rVar8;
                                            j19 = j41;
                                            str14 = str6;
                                        }
                                        qVar2 = qVar;
                                        i17 = i22;
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
                                        String k13 = k(J2, j0, hashMap3, wVar);
                                        String j45 = j(J2, k0, "identity", hashMap3, wVar);
                                        if ("NONE".equals(k13)) {
                                            treeMap2.clear();
                                            rVar7 = null;
                                            str16 = null;
                                            str17 = null;
                                        } else {
                                            String j46 = j(J2, n0, null, hashMap3, wVar);
                                            if (!"identity".equals(j45)) {
                                                String str31 = str18;
                                                if (str31 == null) {
                                                    str18 = ("SAMPLE-AES-CENC".equals(k13) || "SAMPLE-AES-CTR".equals(k13)) ? "cenc" : "cbcs";
                                                } else {
                                                    str18 = str31;
                                                }
                                                e2.q c12 = c(J2, j45, hashMap3, wVar);
                                                if (c12 != null) {
                                                    treeMap2.put(j45, c12);
                                                    str17 = j46;
                                                    rVar7 = null;
                                                    str16 = null;
                                                }
                                            } else if ("AES-128".equals(k13)) {
                                                str16 = k(J2, pattern2, hashMap3, wVar);
                                                str17 = j46;
                                            }
                                            str17 = j46;
                                            str16 = null;
                                        }
                                        qVar2 = qVar;
                                        i17 = i22;
                                        mVar = mVar2;
                                        hashMap4 = hashMap7;
                                        linkedHashMap3 = linkedHashMap;
                                        arrayList15 = arrayList;
                                    } else {
                                        String str32 = str18;
                                        if (J2.startsWith("#EXT-X-BYTERANGE")) {
                                            String k14 = k(J2, f0, hashMap3, wVar);
                                            String str33 = l0.a;
                                            String[] split2 = k14.split("@", -1);
                                            j14 = Long.parseLong(split2[i16]);
                                            if (split2.length > 1) {
                                                j22 = Long.parseLong(split2[1]);
                                            }
                                        } else if (J2.startsWith("#EXT-X-DISCONTINUITY-SEQUENCE")) {
                                            i18 = Integer.parseInt(J2.substring(J2.indexOf(58) + 1));
                                            qVar2 = qVar;
                                            str18 = str32;
                                            i17 = i22;
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
                                            i17 = i22 + 1;
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
                                                    j20 = l0.S(l0.V(J2.substring(J2.indexOf(58) + 1))) - j23;
                                                }
                                            } else if (J2.equals("#EXT-X-GAP")) {
                                                qVar2 = qVar;
                                                str18 = str32;
                                                i17 = i22;
                                                mVar = mVar2;
                                                hashMap4 = hashMap7;
                                                linkedHashMap3 = linkedHashMap;
                                                arrayList15 = arrayList;
                                                str17 = str26;
                                                arrayList14 = arrayList27;
                                                arrayList13 = arrayList26;
                                                str14 = str2;
                                                i19 = 1;
                                            } else if (J2.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                                                qVar2 = qVar;
                                                str18 = str32;
                                                i17 = i22;
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
                                                i17 = i22;
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
                                                long i30 = i(J2, c0, wVar);
                                                Matcher b11 = org.telegram.utils.twidget.w.b(J2, d0, wVar);
                                                if (b11.find()) {
                                                    String group = b11.group(1);
                                                    group.getClass();
                                                    i12 = Integer.parseInt(group);
                                                } else {
                                                    i12 = -1;
                                                }
                                                arrayList27.add(new j(Uri.parse(h2.e.f(uri2, k(J2, pattern2, hashMap3, wVar))), i30, i12));
                                            } else if (J2.startsWith("#EXT-X-PRELOAD-HINT")) {
                                                i iVar5 = iVar2;
                                                if (iVar5 == null && "PART".equals(k(J2, p0, hashMap3, wVar))) {
                                                    e2.r rVar9 = rVar7;
                                                    String k15 = k(J2, pattern2, hashMap3, wVar);
                                                    long i31 = i(J2, h0, wVar);
                                                    long i32 = i(J2, i0, wVar);
                                                    String hexString = str16 == null ? null : str26 != null ? str26 : Long.toHexString(j21);
                                                    if (rVar9 != null || treeMap2.isEmpty()) {
                                                        rVar = rVar9;
                                                    } else {
                                                        e2.q[] qVarArr = (e2.q[]) treeMap2.values().toArray(new e2.q[i16]);
                                                        e2.r rVar10 = new e2.r(str32, true, qVarArr);
                                                        if (rVar6 == null) {
                                                            rVar2 = b(str32, qVarArr);
                                                            rVar = rVar10;
                                                            if (i31 == -1 && i32 == -1) {
                                                                str7 = str16;
                                                                i13 = i22;
                                                                iVar2 = iVar5;
                                                            } else {
                                                                if (i31 == -1) {
                                                                    i31 = 0;
                                                                }
                                                                long j47 = j19;
                                                                i iVar6 = new i(k15, kVar2, 0L, i22, j47, rVar, str16, hexString, i31, i32, false, false, true);
                                                                j19 = j47;
                                                                str7 = str16;
                                                                i13 = i22;
                                                                iVar2 = iVar6;
                                                            }
                                                            arrayList14 = arrayList27;
                                                            str18 = str32;
                                                            rVar6 = rVar2;
                                                            rVar7 = rVar;
                                                            i17 = i13;
                                                            str16 = str7;
                                                            mVar = mVar2;
                                                            hashMap4 = hashMap7;
                                                            linkedHashMap3 = linkedHashMap;
                                                            arrayList15 = arrayList;
                                                            str17 = str26;
                                                            arrayList13 = arrayList26;
                                                            str14 = str2;
                                                            i16 = 0;
                                                            qVar2 = qVar;
                                                        } else {
                                                            rVar = rVar10;
                                                        }
                                                    }
                                                    rVar2 = rVar6;
                                                    if (i31 == -1) {
                                                    }
                                                    if (i31 == -1) {
                                                    }
                                                    long j472 = j19;
                                                    i iVar62 = new i(k15, kVar2, 0L, i22, j472, rVar, str16, hexString, i31, i32, false, false, true);
                                                    j19 = j472;
                                                    str7 = str16;
                                                    i13 = i22;
                                                    iVar2 = iVar62;
                                                    arrayList14 = arrayList27;
                                                    str18 = str32;
                                                    rVar6 = rVar2;
                                                    rVar7 = rVar;
                                                    i17 = i13;
                                                    str16 = str7;
                                                    mVar = mVar2;
                                                    hashMap4 = hashMap7;
                                                    linkedHashMap3 = linkedHashMap;
                                                    arrayList15 = arrayList;
                                                    str17 = str26;
                                                    arrayList13 = arrayList26;
                                                    str14 = str2;
                                                    i16 = 0;
                                                    qVar2 = qVar;
                                                } else {
                                                    str = str16;
                                                    i7 = i22;
                                                    arrayList27 = arrayList27;
                                                    str5 = uri2;
                                                    iVar = iVar5;
                                                    str3 = str32;
                                                    treeMap = treeMap2;
                                                    i10 = i16;
                                                    j3 = j14;
                                                    i11 = i19;
                                                    j10 = j24;
                                                    str4 = str15;
                                                    hashMap2 = hashMap7;
                                                    linkedHashMap2 = linkedHashMap;
                                                    arrayList2 = arrayList26;
                                                }
                                            } else {
                                                str = str16;
                                                i7 = i22;
                                                e2.r rVar11 = rVar7;
                                                i iVar7 = iVar2;
                                                if (J2.startsWith("#EXT-X-PART")) {
                                                    String hexString2 = str == null ? null : str26 != null ? str26 : Long.toHexString(j21);
                                                    String k16 = k(J2, pattern2, hashMap3, wVar);
                                                    long parseDouble2 = (long) (Double.parseDouble(k(J2, O, Collections.EMPTY_MAP, wVar)) * 1000000.0d);
                                                    boolean f11 = f(J2, z0, wVar) | (z12 && arrayList26.isEmpty());
                                                    boolean f12 = f(J2, A0, wVar);
                                                    String j48 = j(J2, pattern, null, hashMap3, wVar);
                                                    if (j48 != null) {
                                                        String str34 = l0.a;
                                                        String[] split3 = j48.split("@", -1);
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
                                                    if (rVar11 != null || treeMap2.isEmpty()) {
                                                        rVar4 = rVar11;
                                                    } else {
                                                        e2.q[] qVarArr2 = (e2.q[]) treeMap2.values().toArray(new e2.q[0]);
                                                        e2.r rVar12 = new e2.r(str32, true, qVarArr2);
                                                        if (rVar6 == null) {
                                                            rVar5 = b(str32, qVarArr2);
                                                            rVar4 = rVar12;
                                                            long j49 = j19;
                                                            arrayList26.add(new i(k16, kVar2, parseDouble2, i7, j49, rVar4, str, hexString2, j25, j13, f12, f11, false));
                                                            j19 = j49 + parseDouble2;
                                                            if (j13 != -1) {
                                                                j25 += j13;
                                                            }
                                                            arrayList14 = arrayList27;
                                                            str18 = str32;
                                                            rVar6 = rVar5;
                                                            arrayList13 = arrayList26;
                                                            rVar7 = rVar4;
                                                            i17 = i7;
                                                            str16 = str;
                                                            uri2 = str13;
                                                            mVar = mVar2;
                                                            hashMap4 = hashMap7;
                                                            linkedHashMap3 = linkedHashMap;
                                                            arrayList15 = arrayList;
                                                            str17 = str26;
                                                            str14 = str2;
                                                            i16 = 0;
                                                            qVar2 = qVar;
                                                            iVar2 = iVar7;
                                                        } else {
                                                            rVar4 = rVar12;
                                                        }
                                                    }
                                                    rVar5 = rVar6;
                                                    long j492 = j19;
                                                    arrayList26.add(new i(k16, kVar2, parseDouble2, i7, j492, rVar4, str, hexString2, j25, j13, f12, f11, false));
                                                    j19 = j492 + parseDouble2;
                                                    if (j13 != -1) {
                                                    }
                                                    arrayList14 = arrayList27;
                                                    str18 = str32;
                                                    rVar6 = rVar5;
                                                    arrayList13 = arrayList26;
                                                    rVar7 = rVar4;
                                                    i17 = i7;
                                                    str16 = str;
                                                    uri2 = str13;
                                                    mVar = mVar2;
                                                    hashMap4 = hashMap7;
                                                    linkedHashMap3 = linkedHashMap;
                                                    arrayList15 = arrayList;
                                                    str17 = str26;
                                                    str14 = str2;
                                                    i16 = 0;
                                                    qVar2 = qVar;
                                                    iVar2 = iVar7;
                                                } else {
                                                    str5 = uri2;
                                                    if (J2.startsWith("#EXT-X-DATERANGE")) {
                                                        if (j(J2, F0, str2, hashMap3, wVar).equals("com.apple.hls.interstitial")) {
                                                            String k17 = k(J2, E0, hashMap3, wVar);
                                                            String j50 = j(J2, L0, null, hashMap3, wVar);
                                                            Uri parse = j50 != null ? Uri.parse(j50) : null;
                                                            arrayList4 = arrayList26;
                                                            String j51 = j(J2, M0, null, hashMap3, wVar);
                                                            Uri parse2 = j51 != null ? Uri.parse(j51) : null;
                                                            rVar7 = rVar11;
                                                            String j52 = j(J2, G0, null, hashMap3, wVar);
                                                            long S2 = j52 != null ? l0.S(l0.V(j52)) : -9223372036854775807L;
                                                            String j53 = j(J2, I0, null, hashMap3, wVar);
                                                            long S3 = j53 != null ? l0.S(l0.V(j53)) : -9223372036854775807L;
                                                            ArrayList arrayList29 = new ArrayList();
                                                            str2 = str2;
                                                            String j54 = j(J2, H0, null, hashMap3, wVar);
                                                            if (j54 != null) {
                                                                String str35 = l0.a;
                                                                treeMap = treeMap2;
                                                                String[] split4 = j54.split(",", -1);
                                                                int length = split4.length;
                                                                int i33 = 0;
                                                                while (i33 < length) {
                                                                    int i34 = i33;
                                                                    String trim = split4[i33].trim();
                                                                    trim.getClass();
                                                                    switch (trim.hashCode()) {
                                                                        case 79491:
                                                                            i15 = length;
                                                                            if (trim.equals("PRE")) {
                                                                                c11 = 0;
                                                                                break;
                                                                            }
                                                                            c11 = 65535;
                                                                            break;
                                                                        case 2430593:
                                                                            i15 = length;
                                                                            if (trim.equals("ONCE")) {
                                                                                c11 = 1;
                                                                                break;
                                                                            }
                                                                            c11 = 65535;
                                                                            break;
                                                                        case 2461856:
                                                                            i15 = length;
                                                                            if (trim.equals("POST")) {
                                                                                c11 = 2;
                                                                                break;
                                                                            }
                                                                            c11 = 65535;
                                                                            break;
                                                                        default:
                                                                            i15 = length;
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
                                                                    i33 = i34 + 1;
                                                                    length = i15;
                                                                }
                                                            } else {
                                                                treeMap = treeMap2;
                                                            }
                                                            arrayList27 = arrayList27;
                                                            double h12 = h(J2, P, -1.0d, wVar);
                                                            long j55 = h12 >= 0.0d ? (long) (h12 * 1000000.0d) : -9223372036854775807L;
                                                            i iVar8 = iVar7;
                                                            double h13 = h(J2, J0, -1.0d, wVar);
                                                            long j56 = h13 >= 0.0d ? (long) (h13 * 1000000.0d) : -9223372036854775807L;
                                                            boolean f13 = f(J2, K0, wVar);
                                                            double h14 = h(J2, N0, Double.MIN_VALUE, wVar);
                                                            long j57 = h14 != Double.MIN_VALUE ? (long) (h14 * 1000000.0d) : -9223372036854775807L;
                                                            double h15 = h(J2, O0, -1.0d, wVar);
                                                            long j58 = h15 >= 0.0d ? (long) (h15 * 1000000.0d) : -9223372036854775807L;
                                                            ArrayList arrayList30 = new ArrayList();
                                                            String j59 = j(J2, P0, null, hashMap3, wVar);
                                                            if (j59 != null) {
                                                                String str36 = l0.a;
                                                                String[] split5 = j59.split(",", -1);
                                                                int length2 = split5.length;
                                                                str8 = str32;
                                                                int i35 = 0;
                                                                while (i35 < length2) {
                                                                    int i36 = i35;
                                                                    String trim2 = split5[i35].trim();
                                                                    trim2.getClass();
                                                                    String[] strArr = split5;
                                                                    if (trim2.equals("IN") || trim2.equals("OUT")) {
                                                                        arrayList30.add(trim2);
                                                                    }
                                                                    i35 = i36 + 1;
                                                                    split5 = strArr;
                                                                }
                                                            } else {
                                                                str8 = str32;
                                                            }
                                                            ArrayList arrayList31 = new ArrayList();
                                                            String j60 = j(J2, Q0, null, hashMap3, wVar);
                                                            if (j60 != null) {
                                                                String str37 = l0.a;
                                                                String[] split6 = j60.split(",", -1);
                                                                int length3 = split6.length;
                                                                int i37 = 0;
                                                                while (i37 < length3) {
                                                                    String[] strArr2 = split6;
                                                                    String trim3 = split6[i37].trim();
                                                                    trim3.getClass();
                                                                    int i38 = length3;
                                                                    if (trim3.equals("JUMP") || trim3.equals("SKIP")) {
                                                                        arrayList31.add(trim3);
                                                                    }
                                                                    i37++;
                                                                    length3 = i38;
                                                                    split6 = strArr2;
                                                                }
                                                            }
                                                            Boolean valueOf = j(J2, R0, null, hashMap3, wVar) != null ? Boolean.valueOf(!r4.equals("NO")) : null;
                                                            String j61 = j(J2, S0, null, hashMap3, wVar);
                                                            if (j61 != null) {
                                                                if (j61.equals("RANGE")) {
                                                                    str19 = "RANGE";
                                                                }
                                                                j12 = j(J2, T0, null, hashMap3, wVar);
                                                                if (j12 != null) {
                                                                    str10 = "PRIMARY";
                                                                    if (!j12.equals("PRIMARY")) {
                                                                        str10 = "HIGHLIGHT";
                                                                    }
                                                                    double h16 = h(J2, U0, -1.0d, wVar);
                                                                    long j62 = h16 >= 0.0d ? (long) (h16 * 1000000.0d) : -9223372036854775807L;
                                                                    str11 = str19;
                                                                    double h17 = h(J2, V0, -1.0d, wVar);
                                                                    long j63 = h17 >= 0.0d ? (long) (h17 * 1000000.0d) : -9223372036854775807L;
                                                                    String j64 = j(J2, W0, null, hashMap3, wVar);
                                                                    ArrayList arrayList32 = new ArrayList();
                                                                    String substring = J2.substring(17);
                                                                    b10 = org.telegram.utils.twidget.w.b(substring, Y0, wVar);
                                                                    while (true) {
                                                                        str12 = str11;
                                                                        if (b10.find()) {
                                                                            String group2 = b10.group();
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
                                                                                    matcher = b10;
                                                                                    z10 = f13;
                                                                                    arrayList11 = arrayList12;
                                                                                    break;
                                                                                default:
                                                                                    matcher = b10;
                                                                                    String k18 = e2.k(group2, 1, 0);
                                                                                    String v = p5.c.v(k18, "=");
                                                                                    int length4 = v.length() + substring.indexOf(v);
                                                                                    z10 = f13;
                                                                                    String substring2 = substring.substring(length4, (substring.length() == length4 + 1 ? 1 : 2) + length4);
                                                                                    if (substring2.startsWith("\"")) {
                                                                                        fVar = new f(0, k18, k(substring, Pattern.compile(k18 + "=\"((?:.|\f)+?)\""), hashMap3, wVar));
                                                                                        arrayList11 = arrayList12;
                                                                                        arrayList10 = arrayList29;
                                                                                    } else if (substring2.equals("0x") || substring2.equals("0X")) {
                                                                                        arrayList11 = arrayList12;
                                                                                        arrayList10 = arrayList29;
                                                                                        fVar = new f(1, k18, k(substring, Pattern.compile(k18 + "=(0[xX][A-F0-9]+)"), hashMap3, wVar));
                                                                                    } else {
                                                                                        arrayList11 = arrayList12;
                                                                                        arrayList10 = arrayList29;
                                                                                        fVar = new f(k18, Double.parseDouble(k(substring, Pattern.compile(k18 + "=([\\d\\.]+)\\b"), Collections.EMPTY_MAP, wVar)));
                                                                                    }
                                                                                    arrayList32.add(fVar);
                                                                                    break;
                                                                            }
                                                                            arrayList12 = arrayList11;
                                                                            str11 = str12;
                                                                            b10 = matcher;
                                                                            f13 = z10;
                                                                            arrayList29 = arrayList10;
                                                                            iVar8 = iVar9;
                                                                        } else {
                                                                            ArrayList arrayList33 = arrayList29;
                                                                            iVar = iVar8;
                                                                            boolean z19 = f13;
                                                                            linkedHashMap2 = linkedHashMap;
                                                                            ArrayList arrayList34 = arrayList12;
                                                                            g gVar2 = linkedHashMap2.containsKey(k17) ? (g) linkedHashMap2.get(k17) : new g(k17);
                                                                            if (parse == null) {
                                                                                gVar2.getClass();
                                                                            } else {
                                                                                Uri uri6 = gVar2.c;
                                                                                if (uri6 != null) {
                                                                                    ma.i(uri6.equals(parse), "Can't change assetUri from %s to %s", gVar2.c, parse);
                                                                                }
                                                                                gVar2.c = parse;
                                                                            }
                                                                            if (parse2 != null) {
                                                                                Uri uri7 = gVar2.d;
                                                                                if (uri7 != null) {
                                                                                    ma.i(uri7.equals(parse2), "Can't change assetListUri from %s to %s", gVar2.d, parse2);
                                                                                }
                                                                                gVar2.d = parse2;
                                                                            }
                                                                            if (S2 != -9223372036854775807L) {
                                                                                long j65 = gVar2.e;
                                                                                if (j65 != -9223372036854775807L) {
                                                                                    ma.g(j65 == S2, "Can't change startDateUnixUs from %s to %s", j65, S2);
                                                                                }
                                                                                gVar2.e = S2;
                                                                            }
                                                                            if (S3 != -9223372036854775807L) {
                                                                                long j66 = gVar2.f;
                                                                                if (j66 != -9223372036854775807L) {
                                                                                    ma.g(j66 == S3, "Can't change endDateUnixUs from %s to %s", j66, S3);
                                                                                }
                                                                                gVar2.f = S3;
                                                                            }
                                                                            if (j55 != -9223372036854775807L) {
                                                                                long j67 = gVar2.g;
                                                                                if (j67 != -9223372036854775807L) {
                                                                                    ma.g(j67 == j55, "Can't change durationUs from %s to %s", j67, j55);
                                                                                }
                                                                                gVar2.g = j55;
                                                                            }
                                                                            if (j56 != -9223372036854775807L) {
                                                                                long j68 = gVar2.h;
                                                                                if (j68 != -9223372036854775807L) {
                                                                                    ma.g(j68 == j56, "Can't change plannedDurationUs from %s to %s", j68, j56);
                                                                                }
                                                                                gVar2.h = j56;
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
                                                                                    ma.e(sb2.toString(), equals);
                                                                                }
                                                                                gVar2.i = arrayList6;
                                                                            }
                                                                            if (z19) {
                                                                                gVar2.j = true;
                                                                            }
                                                                            if (j57 != -9223372036854775807L) {
                                                                                long j69 = gVar2.k;
                                                                                if (j69 != -9223372036854775807L) {
                                                                                    ma.g(j69 == j57, "Can't change resumeOffsetUs from %s to %s", j69, j57);
                                                                                }
                                                                                gVar2.k = j57;
                                                                            }
                                                                            if (j58 != -9223372036854775807L) {
                                                                                long j70 = gVar2.l;
                                                                                if (j70 != -9223372036854775807L) {
                                                                                    ma.g(j70 == j58, "Can't change playoutLimitUs from %s to %s", j70, j58);
                                                                                }
                                                                                gVar2.l = j58;
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
                                                                                    ma.e(sb5.toString(), equals2);
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
                                                                                    ma.e(sb8.toString(), equals3);
                                                                                }
                                                                                gVar2.n = arrayList8;
                                                                            }
                                                                            HashMap hashMap8 = gVar2.b;
                                                                            if (!arrayList32.isEmpty()) {
                                                                                int i39 = 0;
                                                                                while (i39 < arrayList32.size()) {
                                                                                    f fVar2 = (f) arrayList32.get(i39);
                                                                                    String str38 = fVar2.a;
                                                                                    f fVar3 = (f) hashMap8.get(str38);
                                                                                    if (fVar3 != null) {
                                                                                        boolean equals4 = fVar3.equals(fVar2);
                                                                                        arrayList7 = arrayList32;
                                                                                        Object[] objArr = {str38, fVar3.d, Double.valueOf(fVar3.c), fVar2.d, Double.valueOf(fVar2.c)};
                                                                                        if (!equals4) {
                                                                                            throw new IllegalArgumentException(bb.a("Can't change %s from %s %s to %s %s", objArr));
                                                                                        }
                                                                                    } else {
                                                                                        arrayList7 = arrayList32;
                                                                                    }
                                                                                    hashMap8.put(str38, fVar2);
                                                                                    i39++;
                                                                                    arrayList32 = arrayList7;
                                                                                }
                                                                            }
                                                                            if (valueOf != null) {
                                                                                Boolean bool2 = gVar2.o;
                                                                                if (bool2 != null) {
                                                                                    ma.i(bool2.equals(valueOf), "Can't change contentMayVary from %s to %s", gVar2.o, valueOf);
                                                                                }
                                                                                gVar2.o = valueOf;
                                                                            }
                                                                            if (str12 != null) {
                                                                                String str39 = gVar2.p;
                                                                                if (str39 != null) {
                                                                                    ma.i(str39.equals(str12), "Can't change timelineOccupies from %s to %s", gVar2.p, str12);
                                                                                }
                                                                                gVar2.p = str12;
                                                                            }
                                                                            if (str10 != null) {
                                                                                String str40 = gVar2.q;
                                                                                if (str40 != null) {
                                                                                    ma.i(str40.equals(str10), "Can't change timelineStyle from %s to %s", gVar2.q, str10);
                                                                                }
                                                                                gVar2.q = str10;
                                                                            }
                                                                            if (j62 != -9223372036854775807L) {
                                                                                long j71 = gVar2.r;
                                                                                if (j71 != -9223372036854775807L) {
                                                                                    ma.g(j71 == j62, "Can't change skipControlOffsetUs from %s to %s", j71, j62);
                                                                                }
                                                                                gVar2.r = j62;
                                                                            }
                                                                            if (j63 != -9223372036854775807L) {
                                                                                long j72 = gVar2.s;
                                                                                if (j72 != -9223372036854775807L) {
                                                                                    ma.g(j72 == j63, "Can't change skipControlDurationUs from %s to %s", j72, j63);
                                                                                }
                                                                                gVar2.s = j63;
                                                                            }
                                                                            if (j64 != null) {
                                                                                String str41 = gVar2.t;
                                                                                if (str41 != null) {
                                                                                    ma.i(str41.equals(j64), "Can't change skipControlLabelId from %s to %s", gVar2.t, j64);
                                                                                }
                                                                                gVar2.t = j64;
                                                                            }
                                                                            linkedHashMap2.put(k17, gVar2);
                                                                            str3 = str8;
                                                                            j3 = j14;
                                                                            i11 = i19;
                                                                            j10 = j24;
                                                                            str4 = str15;
                                                                            hashMap2 = hashMap7;
                                                                            arrayList3 = arrayList5;
                                                                            arrayList2 = arrayList4;
                                                                            i10 = 0;
                                                                            qVar2 = qVar;
                                                                            linkedHashMap3 = linkedHashMap2;
                                                                            arrayList13 = arrayList2;
                                                                            i16 = i10;
                                                                            arrayList12 = arrayList3;
                                                                            str15 = str4;
                                                                            j24 = j10;
                                                                            i17 = i7;
                                                                            str16 = str;
                                                                            i19 = i11;
                                                                            uri2 = str5;
                                                                            treeMap2 = treeMap;
                                                                            mVar = mVar2;
                                                                            str17 = str26;
                                                                            arrayList14 = arrayList27;
                                                                            iVar2 = iVar;
                                                                            nVar2 = nVar;
                                                                            hashMap4 = hashMap2;
                                                                            str18 = str3;
                                                                            j14 = j3;
                                                                            arrayList15 = arrayList;
                                                                            str14 = str2;
                                                                        }
                                                                    }
                                                                }
                                                                str10 = null;
                                                                double h162 = h(J2, U0, -1.0d, wVar);
                                                                if (h162 >= 0.0d) {
                                                                }
                                                                str11 = str19;
                                                                double h172 = h(J2, V0, -1.0d, wVar);
                                                                if (h172 >= 0.0d) {
                                                                }
                                                                String j642 = j(J2, W0, null, hashMap3, wVar);
                                                                ArrayList arrayList322 = new ArrayList();
                                                                String substring3 = J2.substring(17);
                                                                b10 = org.telegram.utils.twidget.w.b(substring3, Y0, wVar);
                                                                while (true) {
                                                                    str12 = str11;
                                                                    if (b10.find()) {
                                                                    }
                                                                    arrayList12 = arrayList11;
                                                                    str11 = str12;
                                                                    b10 = matcher;
                                                                    f13 = z10;
                                                                    arrayList29 = arrayList10;
                                                                    iVar8 = iVar9;
                                                                }
                                                            }
                                                            str19 = null;
                                                            j12 = j(J2, T0, null, hashMap3, wVar);
                                                            if (j12 != null) {
                                                            }
                                                            str10 = null;
                                                            double h1622 = h(J2, U0, -1.0d, wVar);
                                                            if (h1622 >= 0.0d) {
                                                            }
                                                            str11 = str19;
                                                            double h1722 = h(J2, V0, -1.0d, wVar);
                                                            if (h1722 >= 0.0d) {
                                                            }
                                                            String j6422 = j(J2, W0, null, hashMap3, wVar);
                                                            ArrayList arrayList3222 = new ArrayList();
                                                            String substring32 = J2.substring(17);
                                                            b10 = org.telegram.utils.twidget.w.b(substring32, Y0, wVar);
                                                            while (true) {
                                                                str12 = str11;
                                                                if (b10.find()) {
                                                                }
                                                                arrayList12 = arrayList11;
                                                                str11 = str12;
                                                                b10 = matcher;
                                                                f13 = z10;
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
                                                    rVar7 = rVar11;
                                                    treeMap = treeMap2;
                                                    linkedHashMap2 = linkedHashMap;
                                                    arrayList5 = arrayList12;
                                                    if (J2.startsWith("#")) {
                                                        str3 = str8;
                                                        j3 = j14;
                                                        i11 = i19;
                                                        j10 = j24;
                                                        str4 = str15;
                                                        hashMap2 = hashMap7;
                                                        arrayList3 = arrayList5;
                                                        arrayList2 = arrayList4;
                                                        i10 = 0;
                                                        qVar2 = qVar;
                                                        linkedHashMap3 = linkedHashMap2;
                                                        arrayList13 = arrayList2;
                                                        i16 = i10;
                                                        arrayList12 = arrayList3;
                                                        str15 = str4;
                                                        j24 = j10;
                                                        i17 = i7;
                                                        str16 = str;
                                                        i19 = i11;
                                                        uri2 = str5;
                                                        treeMap2 = treeMap;
                                                        mVar = mVar2;
                                                        str17 = str26;
                                                        arrayList14 = arrayList27;
                                                        iVar2 = iVar;
                                                        nVar2 = nVar;
                                                        hashMap4 = hashMap2;
                                                        str18 = str3;
                                                        j14 = j3;
                                                        arrayList15 = arrayList;
                                                        str14 = str2;
                                                    } else {
                                                        String hexString3 = str == null ? null : str26 != null ? str26 : Long.toHexString(j21);
                                                        long j73 = j21 + 1;
                                                        String l10 = l(J2, hashMap3, wVar);
                                                        k kVar6 = (k) hashMap7.get(l10);
                                                        if (j14 == -1) {
                                                            j11 = 0;
                                                        } else {
                                                            if (z16 && kVar2 == null && kVar6 == null) {
                                                                kVar6 = new k(l10, 0L, j22, null, null);
                                                                hashMap7.put(l10, kVar6);
                                                            }
                                                            j11 = j22;
                                                        }
                                                        if (rVar7 != null || treeMap.isEmpty()) {
                                                            str9 = str8;
                                                            i14 = 0;
                                                            rVar3 = rVar7;
                                                        } else {
                                                            i14 = 0;
                                                            e2.q[] qVarArr3 = (e2.q[]) treeMap.values().toArray(new e2.q[0]);
                                                            str9 = str8;
                                                            e2.r rVar13 = new e2.r(str9, true, qVarArr3);
                                                            if (rVar6 == null) {
                                                                rVar6 = b(str9, qVarArr3);
                                                            }
                                                            rVar3 = rVar13;
                                                        }
                                                        String str42 = hexString3;
                                                        long j74 = j14;
                                                        long j75 = j23;
                                                        long j76 = j24;
                                                        arrayList5.add(new k(l10, kVar2 != null ? kVar2 : kVar6, str15, j76, i7, j75, rVar3, str, str42, j11, j74, i19, arrayList4));
                                                        long j77 = j75 + j76;
                                                        ArrayList arrayList38 = new ArrayList();
                                                        if (j14 != -1) {
                                                            j11 += j74;
                                                        }
                                                        j22 = j11;
                                                        linkedHashMap3 = linkedHashMap2;
                                                        j21 = j73;
                                                        hashMap4 = hashMap7;
                                                        j23 = j77;
                                                        i16 = i14;
                                                        i19 = i16;
                                                        i17 = i7;
                                                        rVar7 = rVar3;
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
                                            i7 = i22;
                                            str3 = str32;
                                            treeMap = treeMap2;
                                            i10 = i16;
                                            j3 = j14;
                                            i11 = i19;
                                            iVar = iVar2;
                                            j10 = j24;
                                            str4 = str15;
                                            hashMap2 = hashMap7;
                                            linkedHashMap2 = linkedHashMap;
                                            arrayList2 = arrayList26;
                                            str5 = uri2;
                                        }
                                        qVar2 = qVar;
                                        str18 = str32;
                                        i17 = i22;
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
                                i16 = i10;
                                arrayList12 = arrayList3;
                                str15 = str4;
                                j24 = j10;
                                i17 = i7;
                                str16 = str;
                                i19 = i11;
                                uri2 = str5;
                                treeMap2 = treeMap;
                                mVar = mVar2;
                                str17 = str26;
                                arrayList14 = arrayList27;
                                iVar2 = iVar;
                                nVar2 = nVar;
                                hashMap4 = hashMap2;
                                str18 = str3;
                                j14 = j3;
                                arrayList15 = arrayList;
                                str14 = str2;
                            }
                            i17 = i22;
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
                i17 = i22;
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
    public static q e(i61 i61Var, Uri uri, org.telegram.utils.twidget.w wVar) {
        int i7;
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
        e2.m mVar;
        String j3;
        String str6;
        int i13;
        int i14;
        Uri g10;
        ArrayList arrayList7;
        HashMap hashMap3;
        ArrayList arrayList8;
        int i15;
        String[] d02;
        e2.m mVar2;
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
            boolean G2 = i61Var.G();
            Pattern pattern = m0;
            ArrayList arrayList17 = arrayList13;
            boolean z13 = z11;
            Pattern pattern2 = r0;
            boolean z14 = z12;
            if (!G2) {
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
                int i16 = 0;
                while (i16 < arrayList24.size()) {
                    p pVar4 = (p) arrayList24.get(i16);
                    Uri uri3 = pVar4.a;
                    e2.u uVar = pVar4.b;
                    if (hashSet2.add(uri3)) {
                        ma.p(uVar.l == null);
                        ArrayList arrayList26 = (ArrayList) hashMap6.get(pVar4.a);
                        arrayList26.getClass();
                        hashMap = hashMap6;
                        hashSet = hashSet2;
                        q0 q0Var = new q0(new r2.r(null, null, arrayList26));
                        e2.t a10 = uVar.a();
                        a10.k = q0Var;
                        arrayList25.add(new p(pVar4.a, new e2.u(a10), pVar4.c, pVar4.d, pVar4.e, pVar4.f, pVar4.g, pVar4.h));
                    } else {
                        hashMap = hashMap6;
                        hashSet = hashSet2;
                    }
                    i16++;
                    hashSet2 = hashSet;
                    hashMap6 = hashMap;
                }
                int i17 = 0;
                ArrayList arrayList27 = null;
                e2.u uVar2 = null;
                while (i17 < arrayList18.size()) {
                    ArrayList arrayList28 = arrayList18;
                    String str7 = (String) arrayList28.get(i17);
                    String k10 = k(str7, t0, hashMap5, wVar);
                    String k11 = k(str7, pattern2, hashMap5, wVar);
                    ArrayList arrayList29 = arrayList25;
                    ArrayList arrayList30 = arrayList27;
                    String j10 = j(str7, M, null, hashMap5, wVar);
                    e2.t tVar = new e2.t();
                    e2.u uVar3 = uVar2;
                    tVar.a = p0.E(k10, ":", k11);
                    tVar.b = k11;
                    tVar.q = s0.n("application/x-mpegURL");
                    boolean f10 = f(str7, x0, wVar);
                    ?? r29 = f10;
                    if (f(str7, y0, wVar)) {
                        r29 = (f10 ? 1 : 0) | 2;
                    }
                    tVar.e = f(str7, w0, wVar) ? r29 | 4 : r29;
                    int i18 = i17;
                    String j11 = j(str7, u0, null, hashMap5, wVar);
                    if (TextUtils.isEmpty(j11)) {
                        arrayList18 = arrayList28;
                        i7 = 0;
                    } else {
                        String str8 = l0.a;
                        String[] split = j11.split(",", -1);
                        i7 = l0.l(split, "public.accessibility.describes-video") ? 512 : 0;
                        arrayList18 = arrayList28;
                        if (l0.l(split, "public.accessibility.transcribes-spoken-dialog")) {
                            i7 |= TLObject.FLAG_12;
                        }
                        if (l0.l(split, "public.accessibility.describes-music-and-sound")) {
                            i7 |= 1024;
                        }
                        if (l0.l(split, "public.easy-to-read")) {
                            i7 |= TLObject.FLAG_13;
                        }
                    }
                    tVar.f = i7;
                    tVar.d = j(str7, q0, null, hashMap5, wVar);
                    String j12 = j(str7, pattern, null, hashMap5, wVar);
                    Uri g11 = j12 == null ? null : h2.e.g(uri2, j12);
                    String str9 = uri2;
                    Pattern pattern3 = pattern;
                    q0 q0Var2 = new q0(new r2.r(k10, k11, Collections.EMPTY_LIST));
                    String k12 = k(str7, o0, hashMap5, wVar);
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
                                    pVar = (p) arrayList24.get(i19);
                                    if (!k10.equals(pVar.e)) {
                                        i19++;
                                    }
                                } else {
                                    pVar = null;
                                }
                            }
                            if (pVar != null) {
                                String w11 = l0.w(3, pVar.b.k);
                                tVar.j = w11;
                                str = s0.d(w11);
                            } else {
                                str = null;
                            }
                            if (str == null) {
                                str = "text/vtt";
                            }
                            tVar.r = s0.n(str);
                            tVar.k = q0Var2;
                            if (g11 != null) {
                                arrayList2 = arrayList22;
                                arrayList2.add(new o(g11, new e2.u(tVar), k11, j10));
                            } else {
                                arrayList2 = arrayList22;
                                h2.a.l("HlsPlaylistParser", "EXT-X-MEDIA tag with missing mandatory URI attribute: skipping");
                            }
                            arrayList27 = arrayList30;
                            uVar2 = uVar3;
                            break;
                        case 1:
                            ArrayList arrayList31 = arrayList21;
                            arrayList = arrayList20;
                            String k13 = k(str7, v0, hashMap5, wVar);
                            if (k13.startsWith("CC")) {
                                parseInt = Integer.parseInt(k13.substring(2));
                                str2 = "application/cea-608";
                            } else {
                                parseInt = Integer.parseInt(k13.substring(7));
                                str2 = "application/cea-708";
                            }
                            ArrayList arrayList32 = arrayList30 == null ? new ArrayList() : arrayList30;
                            tVar.r = s0.n(str2);
                            tVar.O = parseInt;
                            arrayList32.add(new e2.u(tVar));
                            arrayList21 = arrayList31;
                            arrayList27 = arrayList32;
                            arrayList2 = arrayList22;
                            uVar2 = uVar3;
                            break;
                        case 2:
                            arrayList = arrayList20;
                            int i20 = 0;
                            while (true) {
                                if (i20 < arrayList24.size()) {
                                    pVar2 = (p) arrayList24.get(i20);
                                    int i21 = i20;
                                    if (!k10.equals(pVar2.d)) {
                                        i20 = i21 + 1;
                                    }
                                } else {
                                    pVar2 = null;
                                }
                            }
                            if (pVar2 != null) {
                                String w12 = l0.w(1, pVar2.b.k);
                                tVar.j = w12;
                                str3 = s0.d(w12);
                            } else {
                                str3 = null;
                            }
                            p pVar5 = pVar2;
                            String j13 = j(str7, r, null, hashMap5, wVar);
                            if (j13 != null) {
                                String str10 = l0.a;
                                tVar.J = Integer.parseInt(j13.split("/", 2)[0]);
                                if ("audio/eac3".equals(str3) && j13.endsWith("/JOC")) {
                                    tVar.j = "ec+3";
                                    str3 = "audio/eac3-joc";
                                }
                            }
                            tVar.r = s0.n(str3);
                            if (g11 != null) {
                                tVar.k = q0Var2;
                                arrayList21.add(new o(g11, new e2.u(tVar), k11, j10));
                            } else {
                                ArrayList arrayList33 = arrayList21;
                                if (pVar5 != null) {
                                    uVar2 = new e2.u(tVar);
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
                            uVar2 = uVar3;
                            break;
                        case 3:
                            int i22 = 0;
                            while (true) {
                                if (i22 < arrayList24.size()) {
                                    pVar3 = (p) arrayList24.get(i22);
                                    if (!k10.equals(pVar3.c)) {
                                        i22++;
                                    }
                                } else {
                                    pVar3 = null;
                                }
                            }
                            if (pVar3 != null) {
                                e2.u uVar4 = pVar3.b;
                                String w13 = l0.w(2, uVar4.k);
                                tVar.j = w13;
                                tVar.r = s0.n(s0.d(w13));
                                tVar.y = uVar4.z;
                                tVar.z = uVar4.A;
                                tVar.C = uVar4.D;
                            }
                            if (g11 != null) {
                                tVar.k = q0Var2;
                                arrayList = arrayList20;
                                arrayList.add(new o(g11, new e2.u(tVar), k11, j10));
                                arrayList2 = arrayList22;
                                arrayList27 = arrayList30;
                                uVar2 = uVar3;
                                break;
                            }
                        default:
                            arrayList2 = arrayList22;
                            arrayList = arrayList20;
                            arrayList27 = arrayList30;
                            uVar2 = uVar3;
                            break;
                    }
                    i17 = i18 + 1;
                    arrayList25 = arrayList29;
                    arrayList20 = arrayList;
                    arrayList22 = arrayList2;
                    uri2 = str9;
                    pattern = pattern3;
                }
                return new q(uri.toString(), arrayList19, arrayList25, arrayList20, arrayList21, arrayList22, arrayList17, uVar2, z13 ? Collections.EMPTY_LIST : arrayList27, z14, hashMap5, arrayList23);
            }
            String J2 = i61Var.J();
            ArrayList arrayList34 = arrayList12;
            if (J2.startsWith("#EXT")) {
                arrayList16.add(J2);
            }
            boolean startsWith = J2.startsWith("#EXT-X-I-FRAME-STREAM-INF");
            ArrayList arrayList35 = arrayList16;
            if (J2.startsWith("#EXT-X-DEFINE")) {
                String j14 = j(J2, pattern2, null, hashMap5, wVar);
                if (j14 != null) {
                    m(j14, hashMap5);
                    hashMap5.put(j14, k(J2, C0, hashMap5, wVar));
                } else {
                    String k14 = k(J2, s0, hashMap5, wVar);
                    m(k14, hashMap5);
                    String queryParameter = uri.getQueryParameter(k14);
                    if (queryParameter == null) {
                        throw t0.b("QUERYPARAM \"" + k14 + "\" not found in playlist URI", null);
                    }
                    hashMap5.put(k14, queryParameter);
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
                e2.q c11 = c(J2, j(J2, k0, "identity", hashMap5, wVar), hashMap5, wVar);
                if (c11 != null) {
                    String k15 = k(J2, j0, hashMap5, wVar);
                    arrayList15.add(new e2.r(("SAMPLE-AES-CENC".equals(k15) || "SAMPLE-AES-CTR".equals(k15)) ? "cenc" : "cbcs", true, c11));
                }
            } else if (J2.startsWith("#EXT-X-STREAM-INF") || startsWith) {
                boolean contains = z13 | J2.contains("CLOSED-CAPTIONS=NONE");
                if (startsWith) {
                    z10 = contains;
                    i10 = 16384;
                } else {
                    z10 = contains;
                    i10 = 0;
                }
                int parseInt2 = Integer.parseInt(k(J2, n, Collections.EMPTY_MAP, wVar));
                Matcher b10 = org.telegram.utils.twidget.w.b(J2, c, wVar);
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
                String j15 = j(J2, s, null, hashMap5, wVar);
                arrayList5 = arrayList10;
                String j16 = j(J2, w, null, hashMap5, wVar);
                arrayList6 = arrayList14;
                String j17 = j(J2, x, null, hashMap5, wVar);
                if (j17 != null) {
                    String str11 = l0.a;
                    String[] split2 = j17.split(",", 2)[0].split("/", -1);
                    str4 = split2[0];
                    if (split2.length > 1) {
                        str5 = split2[1];
                        hashMap2 = hashMap4;
                        i12 = 2;
                        w10 = l0.w(i12, j16);
                        if (s0.j(w10, str4) && (str4 == null || !(j15 == null || str5 == null || ((j15.equals("PQ") && !str5.equals("db1p")) || ((j15.equals("SDR") && !str5.equals("db2g")) || (j15.equals("HLG") && !str5.startsWith("db4"))))))) {
                            e2.m x10 = l0.x(j16, str4, str5);
                            if (str4 == null) {
                                str4 = w10;
                            }
                            d02 = l0.d0(j16);
                            if (d02.length != 0) {
                                mVar2 = x10;
                            } else {
                                StringBuilder sb3 = new StringBuilder();
                                int length = d02.length;
                                int i23 = 0;
                                while (i23 < length) {
                                    String[] strArr = d02;
                                    String str12 = strArr[i23];
                                    e2.m mVar3 = x10;
                                    int i24 = length;
                                    if (2 != s0.h(s0.d(str12))) {
                                        if (sb3.length() > 0) {
                                            sb3.append(",");
                                        }
                                        sb3.append(str12);
                                    }
                                    i23++;
                                    d02 = strArr;
                                    length = i24;
                                    x10 = mVar3;
                                }
                                mVar2 = x10;
                                if (sb3.length() > 0) {
                                    sb2 = sb3.toString();
                                    j16 = sb2 != null ? p0.E(str4, ",", sb2) : str4;
                                    mVar = mVar2;
                                }
                            }
                            sb2 = null;
                            if (sb2 != null) {
                            }
                            mVar = mVar2;
                        } else {
                            mVar = null;
                        }
                        boolean equals = TextUtils.equals(j(J2, E, null, hashMap5, wVar), "true");
                        String j18 = j(J2, y, null, hashMap5, wVar);
                        String j19 = j(J2, F, null, hashMap5, wVar);
                        String j20 = j(J2, G, null, hashMap5, wVar);
                        String j21 = j(J2, H, null, hashMap5, wVar);
                        j3 = j(J2, I, null, hashMap5, wVar);
                        if (j3 != null) {
                            str6 = j19;
                            String[] split3 = j3.split("x", -1);
                            int parseInt3 = Integer.parseInt(split3[0]);
                            int parseInt4 = Integer.parseInt(split3[1]);
                            if (parseInt3 <= 0 || parseInt4 <= 0) {
                                parseInt4 = -1;
                                i15 = -1;
                            } else {
                                i15 = parseInt3;
                            }
                            i14 = parseInt4;
                            i13 = i15;
                        } else {
                            str6 = j19;
                            i13 = -1;
                            i14 = -1;
                        }
                        ArrayList arrayList36 = arrayList9;
                        String j22 = j(J2, J, null, hashMap5, wVar);
                        float parseFloat = j22 != null ? Float.parseFloat(j22) : -1.0f;
                        String j23 = j(J2, K, null, hashMap5, wVar);
                        String j24 = j(J2, d, null, hashMap5, wVar);
                        String j25 = j(J2, e, null, hashMap5, wVar);
                        String j26 = j(J2, f, null, hashMap5, wVar);
                        String j27 = j(J2, h, null, hashMap5, wVar);
                        String j28 = j(J2, L, null, hashMap5, wVar);
                        if (startsWith) {
                            g10 = h2.e.g(uri2, k(J2, pattern, hashMap5, wVar));
                        } else {
                            if (!i61Var.G()) {
                                throw t0.b("#EXT-X-STREAM-INF must be followed by another line", null);
                            }
                            g10 = h2.e.g(uri2, l(i61Var.J(), hashMap5, wVar));
                        }
                        Uri uri4 = g10;
                        e2.t tVar2 = new e2.t();
                        tVar2.a = Integer.toString(arrayList36.size());
                        tVar2.q = s0.n("application/x-mpegURL");
                        tVar2.j = j16;
                        tVar2.h = i11;
                        tVar2.i = parseInt2;
                        tVar2.y = i13;
                        tVar2.z = i14;
                        tVar2.C = parseFloat;
                        tVar2.f = i10;
                        tVar2.H = mVar;
                        tVar2.m = equals;
                        tVar2.r = s0.n(j18);
                        tVar2.n = Long.parseLong(str6);
                        tVar2.o = j20;
                        tVar2.p = Integer.parseInt(j21);
                        arrayList7 = arrayList36;
                        arrayList7.add(new p(uri4, new e2.u(tVar2), j24, j25, j26, j27, j23, j28));
                        hashMap3 = hashMap2;
                        arrayList8 = (ArrayList) hashMap3.get(uri4);
                        if (arrayList8 == null) {
                            arrayList8 = new ArrayList();
                            hashMap3.put(uri4, arrayList8);
                        }
                        arrayList8.add(new r2.q(i11, j24, parseInt2, j25, j26, j27));
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
                w10 = l0.w(i12, j16);
                if (s0.j(w10, str4)) {
                    e2.m x102 = l0.x(j16, str4, str5);
                    if (str4 == null) {
                    }
                    d02 = l0.d0(j16);
                    if (d02.length != 0) {
                    }
                    sb2 = null;
                    if (sb2 != null) {
                    }
                    mVar = mVar2;
                    boolean equals2 = TextUtils.equals(j(J2, E, null, hashMap5, wVar), "true");
                    String j182 = j(J2, y, null, hashMap5, wVar);
                    String j192 = j(J2, F, null, hashMap5, wVar);
                    String j202 = j(J2, G, null, hashMap5, wVar);
                    String j212 = j(J2, H, null, hashMap5, wVar);
                    j3 = j(J2, I, null, hashMap5, wVar);
                    if (j3 != null) {
                    }
                    ArrayList arrayList362 = arrayList9;
                    String j222 = j(J2, J, null, hashMap5, wVar);
                    if (j222 != null) {
                    }
                    String j232 = j(J2, K, null, hashMap5, wVar);
                    String j242 = j(J2, d, null, hashMap5, wVar);
                    String j252 = j(J2, e, null, hashMap5, wVar);
                    String j262 = j(J2, f, null, hashMap5, wVar);
                    String j272 = j(J2, h, null, hashMap5, wVar);
                    String j282 = j(J2, L, null, hashMap5, wVar);
                    if (startsWith) {
                    }
                    Uri uri42 = g10;
                    e2.t tVar22 = new e2.t();
                    tVar22.a = Integer.toString(arrayList362.size());
                    tVar22.q = s0.n("application/x-mpegURL");
                    tVar22.j = j16;
                    tVar22.h = i11;
                    tVar22.i = parseInt2;
                    tVar22.y = i13;
                    tVar22.z = i14;
                    tVar22.C = parseFloat;
                    tVar22.f = i10;
                    tVar22.H = mVar;
                    tVar22.m = equals2;
                    tVar22.r = s0.n(j182);
                    tVar22.n = Long.parseLong(str6);
                    tVar22.o = j202;
                    tVar22.p = Integer.parseInt(j212);
                    arrayList7 = arrayList362;
                    arrayList7.add(new p(uri42, new e2.u(tVar22), j242, j252, j262, j272, j232, j282));
                    hashMap3 = hashMap2;
                    arrayList8 = (ArrayList) hashMap3.get(uri42);
                    if (arrayList8 == null) {
                    }
                    arrayList8.add(new r2.q(i11, j242, parseInt2, j252, j262, j272));
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
                mVar = null;
                boolean equals22 = TextUtils.equals(j(J2, E, null, hashMap5, wVar), "true");
                String j1822 = j(J2, y, null, hashMap5, wVar);
                String j1922 = j(J2, F, null, hashMap5, wVar);
                String j2022 = j(J2, G, null, hashMap5, wVar);
                String j2122 = j(J2, H, null, hashMap5, wVar);
                j3 = j(J2, I, null, hashMap5, wVar);
                if (j3 != null) {
                }
                ArrayList arrayList3622 = arrayList9;
                String j2222 = j(J2, J, null, hashMap5, wVar);
                if (j2222 != null) {
                }
                String j2322 = j(J2, K, null, hashMap5, wVar);
                String j2422 = j(J2, d, null, hashMap5, wVar);
                String j2522 = j(J2, e, null, hashMap5, wVar);
                String j2622 = j(J2, f, null, hashMap5, wVar);
                String j2722 = j(J2, h, null, hashMap5, wVar);
                String j2822 = j(J2, L, null, hashMap5, wVar);
                if (startsWith) {
                }
                Uri uri422 = g10;
                e2.t tVar222 = new e2.t();
                tVar222.a = Integer.toString(arrayList3622.size());
                tVar222.q = s0.n("application/x-mpegURL");
                tVar222.j = j16;
                tVar222.h = i11;
                tVar222.i = parseInt2;
                tVar222.y = i13;
                tVar222.z = i14;
                tVar222.C = parseFloat;
                tVar222.f = i10;
                tVar222.H = mVar;
                tVar222.m = equals22;
                tVar222.r = s0.n(j1822);
                tVar222.n = Long.parseLong(str6);
                tVar222.o = j2022;
                tVar222.p = Integer.parseInt(j2122);
                arrayList7 = arrayList3622;
                arrayList7.add(new p(uri422, new e2.u(tVar222), j2422, j2522, j2622, j2722, j2322, j2822));
                hashMap3 = hashMap2;
                arrayList8 = (ArrayList) hashMap3.get(uri422);
                if (arrayList8 == null) {
                }
                arrayList8.add(new r2.q(i11, j2422, parseInt2, j2522, j2622, j2722));
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

    public static boolean f(String str, Pattern pattern, org.telegram.utils.twidget.w wVar) {
        Matcher b10 = org.telegram.utils.twidget.w.b(str, pattern, wVar);
        if (b10.find()) {
            return "YES".equals(b10.group(1));
        }
        return false;
    }

    public static double h(String str, Pattern pattern, double d2, org.telegram.utils.twidget.w wVar) {
        Matcher b10 = org.telegram.utils.twidget.w.b(str, pattern, wVar);
        if (!b10.find()) {
            return d2;
        }
        String group = b10.group(1);
        group.getClass();
        return Double.parseDouble(group);
    }

    public static long i(String str, Pattern pattern, org.telegram.utils.twidget.w wVar) {
        Matcher b10 = org.telegram.utils.twidget.w.b(str, pattern, wVar);
        if (!b10.find()) {
            return -1L;
        }
        String group = b10.group(1);
        group.getClass();
        return Long.parseLong(group);
    }

    public static String j(String str, Pattern pattern, String str2, Map map, org.telegram.utils.twidget.w wVar) {
        Matcher b10 = org.telegram.utils.twidget.w.b(str, pattern, wVar);
        if (b10.find()) {
            str2 = b10.group(1);
            str2.getClass();
        }
        return (map.isEmpty() || str2 == null) ? str2 : l(str2, map, wVar);
    }

    public static String k(String str, Pattern pattern, Map map, org.telegram.utils.twidget.w wVar) {
        String j3 = j(str, pattern, null, map, wVar);
        if (j3 != null) {
            return j3;
        }
        throw t0.b("Couldn't match " + pattern.pattern() + " in " + str, null);
    }

    public static String l(String str, Map map, org.telegram.utils.twidget.w wVar) {
        Matcher b10 = org.telegram.utils.twidget.w.b(str, X0, wVar);
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

    public static void m(String str, HashMap hashMap) {
        if (hashMap.containsKey(str)) {
            throw t0.b("duplicate variable name \"" + str + "\"", null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0074 A[Catch: all -> 0x009f, LOOP:0: B:13:0x0074->B:38:0x0074, LOOP_START, TryCatch #4 {all -> 0x009f, blocks: (B:3:0x001a, B:5:0x0023, B:7:0x002b, B:10:0x0034, B:13:0x0074, B:15:0x007a, B:18:0x0085, B:57:0x008d, B:20:0x00a1, B:22:0x00a9, B:24:0x00b1, B:26:0x00b9, B:28:0x00c1, B:30:0x00c9, B:32:0x00d1, B:34:0x00d9, B:36:0x00e2, B:41:0x00e6, B:75:0x0108, B:76:0x010e, B:80:0x003b, B:82:0x0041, B:87:0x004a, B:89:0x0053, B:94:0x005c, B:96:0x0062, B:98:0x0068, B:100:0x006d), top: B:2:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0108 A[Catch: all -> 0x009f, TRY_ENTER, TryCatch #4 {all -> 0x009f, blocks: (B:3:0x001a, B:5:0x0023, B:7:0x002b, B:10:0x0034, B:13:0x0074, B:15:0x007a, B:18:0x0085, B:57:0x008d, B:20:0x00a1, B:22:0x00a9, B:24:0x00b1, B:26:0x00b9, B:28:0x00c1, B:30:0x00c9, B:32:0x00d1, B:34:0x00d9, B:36:0x00e2, B:41:0x00e6, B:75:0x0108, B:76:0x010e, B:80:0x003b, B:82:0x0041, B:87:0x004a, B:89:0x0053, B:94:0x005c, B:96:0x0062, B:98:0x0068, B:100:0x006d), top: B:2:0x001a }] */
    @Override // b3.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(Uri uri, j2.k kVar) {
        String trim;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(kVar));
        ArrayDeque arrayDeque = new ArrayDeque();
        org.telegram.utils.twidget.w wVar = new org.telegram.utils.twidget.w(0.75f, 16, 2, true);
        try {
            int read = bufferedReader.read();
            boolean z10 = false;
            if (read == 239) {
                if (bufferedReader.read() == 187 && bufferedReader.read() == 191) {
                    read = bufferedReader.read();
                }
                if (z10) {
                    throw t0.b("Input does not start with the #EXTM3U header.", null);
                }
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException unused) {
                        }
                        throw t0.b("Failed to parse the playlist, could not identify any tags.", null);
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
                            q e10 = e(new i61(arrayDeque, bufferedReader), uri, wVar);
                            try {
                                bufferedReader.close();
                            } catch (IOException unused2) {
                            }
                            return e10;
                        }
                    }
                }
                arrayDeque.add(trim);
                n d2 = d(this.a, this.b, new i61(arrayDeque, bufferedReader), uri, wVar);
                try {
                    bufferedReader.close();
                } catch (IOException unused3) {
                }
                return d2;
            }
            while (read != -1 && Character.isWhitespace(read)) {
                read = bufferedReader.read();
            }
            int i7 = 0;
            while (true) {
                if (i7 >= 7) {
                    while (read != -1 && Character.isWhitespace(read) && !l0.O(read)) {
                        read = bufferedReader.read();
                    }
                    z10 = l0.O(read);
                } else {
                    if (read != "#EXTM3U".charAt(i7)) {
                        break;
                    }
                    read = bufferedReader.read();
                    i7++;
                }
            }
            if (z10) {
            }
        } finally {
            String str = l0.a;
            try {
                bufferedReader.close();
            } catch (IOException unused4) {
            }
        }
    }
}
