package p2;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import b2.p0;
import b2.r0;
import b2.s0;
import com.google.android.gms.internal.vision.e2;
import e2.d0;
import e9.i0;
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
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.ui.Cells.p6;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class r implements y2.o {
    public final o a;
    public final l b;
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
    public static final Pattern J = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");
    public static final Pattern K = Pattern.compile("DURATION=([\\d\\.]+)\\b");
    public static final Pattern L = Pattern.compile("[:,]DURATION=([\\d\\.]+)\\b");
    public static final Pattern M = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");
    public static final Pattern N = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");
    public static final Pattern O = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");
    public static final Pattern P = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");
    public static final Pattern Q = a("CAN-SKIP-DATERANGES");
    public static final Pattern R = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");
    public static final Pattern S = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");
    public static final Pattern T = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");
    public static final Pattern U = a("CAN-BLOCK-RELOAD");
    public static final Pattern V = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");
    public static final Pattern W = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");
    public static final Pattern X = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");
    public static final Pattern Y = Pattern.compile("LAST-MSN=(\\d+)\\b");
    public static final Pattern Z = Pattern.compile("LAST-PART=(\\d+)\\b");
    public static final Pattern a0 = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");
    public static final Pattern b0 = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");
    public static final Pattern c0 = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");
    public static final Pattern d0 = Pattern.compile("BYTERANGE-START=(\\d+)\\b");
    public static final Pattern e0 = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");
    public static final Pattern f0 = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");
    public static final Pattern g0 = Pattern.compile("KEYFORMAT=\"((?:.|\f)+?)\"");
    public static final Pattern h0 = Pattern.compile("KEYFORMATVERSIONS=\"((?:.|\f)+?)\"");
    public static final Pattern i0 = Pattern.compile("URI=\"((?:.|\f)+?)\"");
    public static final Pattern j0 = Pattern.compile("IV=([^,.*]+)");
    public static final Pattern k0 = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");
    public static final Pattern l0 = Pattern.compile("TYPE=(PART|MAP)");
    public static final Pattern m0 = Pattern.compile("LANGUAGE=\"((?:.|\f)+?)\"");
    public static final Pattern n0 = Pattern.compile("NAME=\"((?:.|\f)+?)\"");
    public static final Pattern o0 = Pattern.compile("GROUP-ID=\"((?:.|\f)+?)\"");
    public static final Pattern p0 = Pattern.compile("CHARACTERISTICS=\"((?:.|\f)+?)\"");
    public static final Pattern q0 = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");
    public static final Pattern r0 = a("AUTOSELECT");
    public static final Pattern s0 = a("DEFAULT");
    public static final Pattern t0 = a("FORCED");
    public static final Pattern u0 = a("INDEPENDENT");
    public static final Pattern v0 = a("GAP");
    public static final Pattern w0 = a("PRECISE");
    public static final Pattern x0 = Pattern.compile("VALUE=\"((?:.|\f)+?)\"");
    public static final Pattern y0 = Pattern.compile("IMPORT=\"((?:.|\f)+?)\"");
    public static final Pattern z0 = Pattern.compile("[:,]ID=\"((?:.|\f)+?)\"");
    public static final Pattern A0 = Pattern.compile("CLASS=\"((?:.|\f)+?)\"");
    public static final Pattern B0 = Pattern.compile("START-DATE=\"((?:.|\f)+?)\"");
    public static final Pattern C0 = Pattern.compile("CUE=\"((?:.|\f)+?)\"");
    public static final Pattern D0 = Pattern.compile("END-DATE=\"((?:.|\f)+?)\"");
    public static final Pattern E0 = Pattern.compile("PLANNED-DURATION=([\\d\\.]+)\\b");
    public static final Pattern F0 = a("END-ON-NEXT");
    public static final Pattern G0 = Pattern.compile("X-ASSET-URI=\"((?:.|\f)+?)\"");
    public static final Pattern H0 = Pattern.compile("X-ASSET-LIST=\"((?:.|\f)+?)\"");
    public static final Pattern I0 = Pattern.compile("X-RESUME-OFFSET=(-?[\\d\\.]+)\\b");
    public static final Pattern J0 = Pattern.compile("X-PLAYOUT-LIMIT=([\\d\\.]+)\\b");
    public static final Pattern K0 = Pattern.compile("X-SNAP=\"((?:.|\f)+?)\"");
    public static final Pattern L0 = Pattern.compile("X-RESTRICT=\"((?:.|\f)+?)\"");
    public static final Pattern M0 = Pattern.compile("X-CONTENT-MAY-VARY=\"((?:.|\f)+?)\"");
    public static final Pattern N0 = Pattern.compile("X-TIMELINE-OCCUPIES=\"((?:.|\f)+?)\"");
    public static final Pattern O0 = Pattern.compile("X-TIMELINE-STYLE=\"((?:.|\f)+?)\"");
    public static final Pattern P0 = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");
    public static final Pattern Q0 = Pattern.compile("\\b(X-[A-Z0-9-]+)=");

    public r(o oVar, l lVar) {
        this.a = oVar;
        this.b = lVar;
    }

    public static Pattern a(String str) {
        return Pattern.compile(str.concat("=(NO|YES)"));
    }

    public static b2.o b(String str, b2.n[] nVarArr) {
        b2.n[] nVarArr2 = new b2.n[nVarArr.length];
        for (int i10 = 0; i10 < nVarArr.length; i10++) {
            b2.n nVar = nVarArr[i10];
            nVarArr2[i10] = new b2.n(nVar.b, nVar.c, nVar.d, null);
        }
        return new b2.o(str, true, nVarArr2);
    }

    public static b2.n c(String str, String str2, HashMap hashMap) {
        String i10 = i(str, h0, "1", hashMap);
        boolean equals = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2);
        Pattern pattern = i0;
        if (equals) {
            String j3 = j(str, pattern, hashMap);
            return new b2.n(b2.i.d, null, "video/mp4", Base64.decode(j3.substring(j3.indexOf(44)), 0));
        }
        if ("com.widevine".equals(str2)) {
            UUID uuid = b2.i.d;
            String str3 = d0.a;
            return new b2.n(uuid, null, "hls", str.getBytes(StandardCharsets.UTF_8));
        }
        if (!"com.microsoft.playready".equals(str2) || !"1".equals(i10)) {
            return null;
        }
        String j10 = j(str, pattern, hashMap);
        byte[] decode = Base64.decode(j10.substring(j10.indexOf(44)), 0);
        UUID uuid2 = b2.i.e;
        return new b2.n(uuid2, null, "video/mp4", w3.n.a(uuid2, null, decode));
    }

    /* JADX WARN: Code restructure failed: missing block: B:223:0x08ec, code lost:
    
        if (r7.equals(r15) != false) goto L343;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x090a, code lost:
    
        if (r7.equals(r5) != false) goto L352;
     */
    /* JADX WARN: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
    	at jadx.core.dex.visitors.typeinference.TypeUpdateInfo.requestUpdate(TypeUpdateInfo.java:35)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
     */
    /* JADX WARN: Removed duplicated region for block: B:226:0x08fb  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0927  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0a8a  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0a9a  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0ac4  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0b1c  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0b49  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0b7b  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0bb2  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0c2a  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x0c32  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x0c64  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x0c99  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x0d19  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x0d9c  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x0dee  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x0e16  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x0e3e  */
    /* JADX WARN: Removed duplicated region for block: B:441:0x0aee  */
    /* JADX WARN: Removed duplicated region for block: B:449:0x0a9e  */
    /* JADX WARN: Removed duplicated region for block: B:453:0x0a91  */
    /* JADX WARN: Removed duplicated region for block: B:481:0x0f13  */
    /* JADX WARN: Removed duplicated region for block: B:485:0x0f44  */
    /* JADX WARN: Removed duplicated region for block: B:489:0x0f47  */
    /* JADX WARN: Removed duplicated region for block: B:490:0x0f2c  */
    /* JADX WARN: Removed duplicated region for block: B:713:0x10aa  */
    /* JADX WARN: Removed duplicated region for block: B:716:0x10ad A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static l d(o oVar, l lVar, m2.t tVar, String str) {
        ArrayList arrayList;
        ArrayList arrayList2;
        f fVar;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        TreeMap treeMap;
        String str2;
        long j3;
        i iVar;
        int i10;
        long j10;
        String str3;
        HashMap hashMap;
        LinkedHashMap linkedHashMap;
        long j11;
        int i11;
        b2.o oVar2;
        long j12;
        b2.o oVar3;
        int i12;
        ArrayList arrayList6;
        ArrayList arrayList7;
        String str4;
        i iVar2;
        long j13;
        b2.o oVar4;
        long j14;
        String str5;
        String i13;
        String str6;
        ArrayList arrayList8;
        String str7;
        Matcher matcher;
        Boolean bool;
        ArrayList arrayList9;
        long j15;
        String str8;
        long j16;
        ArrayList arrayList10;
        long j17;
        long j18;
        long j19;
        long j20;
        String str9;
        char c10;
        Boolean bool2;
        ArrayList arrayList11;
        long j21;
        d dVar;
        int i14;
        char c11;
        int i15;
        o oVar5 = oVar;
        l lVar2 = lVar;
        boolean z10 = oVar5.c;
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        ArrayList arrayList12 = new ArrayList();
        ArrayList arrayList13 = new ArrayList();
        ArrayList arrayList14 = new ArrayList();
        ArrayList arrayList15 = new ArrayList();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        k kVar = new k(-9223372036854775807L, false, -9223372036854775807L, -9223372036854775807L, false);
        TreeMap treeMap2 = new TreeMap();
        String str10 = "";
        boolean z11 = z10;
        String str11 = "";
        long j22 = -9223372036854775807L;
        long j23 = 0;
        long j24 = 0;
        long j25 = 0;
        long j26 = 0;
        long j27 = 0;
        long j28 = 0;
        long j29 = 0;
        long j30 = -1;
        g gVar = null;
        String str12 = null;
        b2.o oVar6 = null;
        String str13 = null;
        b2.o oVar7 = null;
        int i16 = 0;
        int i17 = 1;
        boolean z12 = false;
        boolean z13 = false;
        int i18 = 0;
        i iVar3 = null;
        int i19 = 0;
        String str14 = null;
        char c12 = 0;
        boolean z14 = false;
        boolean z15 = false;
        long j31 = -9223372036854775807L;
        long j32 = -9223372036854775807L;
        long j33 = 0;
        boolean z16 = false;
        while (true) {
            k kVar2 = kVar;
            if (!tVar.F()) {
                g gVar2 = gVar;
                ArrayList arrayList16 = arrayList12;
                ArrayList arrayList17 = arrayList13;
                ArrayList arrayList18 = arrayList14;
                ArrayList arrayList19 = arrayList15;
                LinkedHashMap linkedHashMap3 = linkedHashMap2;
                HashMap hashMap4 = new HashMap();
                int i20 = 0;
                while (i20 < arrayList18.size()) {
                    ArrayList arrayList20 = arrayList18;
                    h hVar = (h) arrayList20.get(i20);
                    long j34 = hVar.b;
                    if (j34 == -1) {
                        j34 = (j33 + arrayList16.size()) - (arrayList17.isEmpty() ? 1L : 0L);
                    }
                    int i21 = hVar.c;
                    if (i21 == -1 && j32 != -9223372036854775807L) {
                        i21 = (arrayList17.isEmpty() ? ((i) e9.q.l(arrayList16)).x : arrayList17).size() - 1;
                    }
                    Uri uri = hVar.a;
                    hashMap4.put(uri, new h(uri, j34, i21));
                    i20++;
                    arrayList18 = arrayList20;
                }
                if (gVar2 != null) {
                    arrayList17.add(gVar2);
                }
                ArrayList arrayList21 = new ArrayList();
                for (e eVar : linkedHashMap3.values()) {
                    Uri uri2 = eVar.d;
                    if ((uri2 == null && eVar.c != null) || (uri2 != null && eVar.c == null)) {
                        long j35 = eVar.e;
                        if (j35 != -9223372036854775807L) {
                            String str15 = eVar.a;
                            Uri uri3 = eVar.c;
                            long j36 = eVar.f;
                            long j37 = eVar.g;
                            arrayList = arrayList16;
                            arrayList2 = arrayList17;
                            long j38 = eVar.h;
                            ArrayList arrayList22 = eVar.i;
                            boolean z17 = eVar.j;
                            long j39 = eVar.k;
                            long j40 = eVar.l;
                            ArrayList arrayList23 = eVar.m;
                            ArrayList arrayList24 = eVar.n;
                            ArrayList arrayList25 = new ArrayList(eVar.b.values());
                            Boolean bool3 = eVar.o;
                            boolean z18 = bool3 == null || bool3.booleanValue();
                            String str16 = eVar.p;
                            String str17 = str16 != null ? str16 : "POINT";
                            String str18 = eVar.q;
                            fVar = new f(str15, uri3, uri2, j35, j36, j37, j38, arrayList22, z17, j39, j40, arrayList23, arrayList24, arrayList25, z18, str17, str18 != null ? str18 : "HIGHLIGHT");
                            if (fVar == null) {
                                arrayList21.add(fVar);
                            }
                            arrayList17 = arrayList2;
                            arrayList16 = arrayList;
                        }
                    }
                    arrayList = arrayList16;
                    arrayList2 = arrayList17;
                    fVar = null;
                    if (fVar == null) {
                    }
                    arrayList17 = arrayList2;
                    arrayList16 = arrayList;
                }
                return new l(i16, str, arrayList19, j22, z16, j26, z13, i18, j33, i17, j31, j32, z11, z12, j26 != 0, oVar6, arrayList16, arrayList17, kVar2, hashMap4, arrayList21);
            }
            String K2 = tVar.K();
            g gVar3 = gVar;
            if (K2.startsWith("#EXT")) {
                arrayList15.add(K2);
            }
            if (K2.startsWith("#EXT-X-PLAYLIST-TYPE")) {
                String j41 = j(K2, O, hashMap2);
                if ("VOD".equals(j41)) {
                    i16 = 1;
                } else if ("EVENT".equals(j41)) {
                    i16 = 2;
                }
            } else if (K2.equals("#EXT-X-I-FRAMES-ONLY")) {
                kVar = kVar2;
                gVar = gVar3;
                z14 = true;
            } else if (K2.startsWith("#EXT-X-START")) {
                long parseDouble = (long) (Double.parseDouble(j(K2, a0, Collections.EMPTY_MAP)) * 1000000.0d);
                z16 = f(K2, w0);
                j22 = parseDouble;
            } else if (K2.startsWith("#EXT-X-SERVER-CONTROL")) {
                double g10 = g(K2, P, -9.223372036854776E18d);
                long j42 = g10 == -9.223372036854776E18d ? -9223372036854775807L : (long) (g10 * 1000000.0d);
                boolean f7 = f(K2, Q);
                double g11 = g(K2, S, -9.223372036854776E18d);
                long j43 = g11 == -9.223372036854776E18d ? -9223372036854775807L : (long) (g11 * 1000000.0d);
                double g12 = g(K2, T, -9.223372036854776E18d);
                gVar = gVar3;
                kVar = new k(j42, f7, j43, g12 == -9.223372036854776E18d ? -9223372036854775807L : (long) (g12 * 1000000.0d), f(K2, U));
            } else if (K2.startsWith("#EXT-X-PART-INF")) {
                j32 = (long) (Double.parseDouble(j(K2, M, Collections.EMPTY_MAP)) * 1000000.0d);
            } else {
                boolean startsWith = K2.startsWith("#EXT-X-MAP");
                Pattern pattern = c0;
                ArrayList arrayList26 = arrayList15;
                HashMap hashMap5 = hashMap3;
                Pattern pattern2 = i0;
                if (startsWith) {
                    String j44 = j(K2, pattern2, hashMap2);
                    String i22 = i(K2, pattern, null, hashMap2);
                    if (i22 != null) {
                        String str19 = d0.a;
                        String[] split = i22.split("@", -1);
                        j30 = Long.parseLong(split[c12]);
                        if (split.length > 1) {
                            j23 = Long.parseLong(split[1]);
                        }
                    }
                    long j45 = j30;
                    long j46 = j45 == -1 ? 0L : j23;
                    if (str14 != null && str13 == null) {
                        throw s0.b("The encryption IV attribute must be present when an initialization segment is encrypted with METHOD=AES-128.", null);
                    }
                    i iVar4 = new i(j44, j46, j45, str14, str13);
                    String str20 = str13;
                    if (j45 != -1) {
                        j46 += j45;
                    }
                    j23 = j46;
                    iVar3 = iVar4;
                    j30 = -1;
                    kVar = kVar2;
                    gVar = gVar3;
                    arrayList15 = arrayList26;
                    hashMap3 = hashMap5;
                    str13 = str20;
                } else {
                    LinkedHashMap linkedHashMap4 = linkedHashMap2;
                    String str21 = str13;
                    if (K2.startsWith("#EXT-X-TARGETDURATION")) {
                        j31 = Integer.parseInt(j(K2, J, Collections.EMPTY_MAP)) * 1000000;
                    } else if (K2.startsWith("#EXT-X-MEDIA-SEQUENCE")) {
                        j25 = Long.parseLong(j(K2, V, Collections.EMPTY_MAP));
                        j33 = j25;
                    } else if (K2.startsWith("#EXT-X-VERSION")) {
                        i17 = Integer.parseInt(j(K2, N, Collections.EMPTY_MAP));
                    } else {
                        if (K2.startsWith("#EXT-X-DEFINE")) {
                            String i23 = i(K2, y0, null, hashMap2);
                            if (i23 != null) {
                                String str22 = (String) oVar5.l.get(i23);
                                if (str22 != null) {
                                    hashMap2.put(i23, str22);
                                }
                            } else {
                                hashMap2.put(j(K2, n0, hashMap2), j(K2, x0, hashMap2));
                            }
                        } else if (K2.startsWith("#EXTINF")) {
                            j28 = new BigDecimal(j(K2, W, Collections.EMPTY_MAP)).multiply(new BigDecimal(1000000L)).longValue();
                            str11 = i(K2, X, str10, hashMap2);
                        } else if (K2.startsWith("#EXT-X-SKIP")) {
                            int parseInt = Integer.parseInt(j(K2, R, Collections.EMPTY_MAP));
                            e2.d.g(lVar2 != null && arrayList12.isEmpty());
                            String str23 = d0.a;
                            long j47 = lVar2.k;
                            i0 i0Var = lVar2.r;
                            int i24 = (int) (j33 - j47);
                            int i25 = parseInt + i24;
                            if (i24 >= 0 && i25 <= i0Var.size()) {
                                long j48 = j27;
                                str13 = str21;
                                long j49 = j24;
                                while (i24 < i25) {
                                    i iVar5 = (i) i0Var.get(i24);
                                    if (j33 != lVar2.k) {
                                        int i26 = (lVar2.j - i18) + iVar5.d;
                                        i0 i0Var2 = iVar5.x;
                                        ArrayList arrayList27 = new ArrayList();
                                        long j50 = j49;
                                        int i27 = 0;
                                        while (i27 < i0Var2.size()) {
                                            g gVar4 = (g) i0Var2.get(i27);
                                            arrayList27.add(new g(gVar4.a, gVar4.b, gVar4.c, i26, j50, gVar4.f, gVar4.h, gVar4.n, gVar4.r, gVar4.s, gVar4.v, gVar4.w, gVar4.x));
                                            j50 += gVar4.c;
                                            i27++;
                                            i25 = i25;
                                        }
                                        i15 = i25;
                                        iVar5 = new i(iVar5.a, iVar5.b, iVar5.w, iVar5.c, i26, j49, iVar5.f, iVar5.h, iVar5.n, iVar5.r, iVar5.s, iVar5.v, arrayList27);
                                    } else {
                                        i15 = i25;
                                    }
                                    arrayList12.add(iVar5);
                                    long j51 = iVar5.c;
                                    String str24 = iVar5.n;
                                    j48 = j49 + j51;
                                    long j52 = iVar5.s;
                                    if (j52 != -1) {
                                        j23 = iVar5.r + j52;
                                    }
                                    int i28 = iVar5.d;
                                    i iVar6 = iVar5.b;
                                    b2.o oVar8 = iVar5.f;
                                    String str25 = iVar5.h;
                                    if (str24 == null || !str24.equals(Long.toHexString(j25))) {
                                        str13 = str24;
                                    }
                                    j25++;
                                    i24++;
                                    i19 = i28;
                                    iVar3 = iVar6;
                                    str14 = str25;
                                    oVar7 = oVar8;
                                    j49 = j48;
                                    i25 = i15;
                                    lVar2 = lVar;
                                }
                                oVar5 = oVar;
                                lVar2 = lVar;
                                j24 = j49;
                                kVar = kVar2;
                                gVar = gVar3;
                                arrayList15 = arrayList26;
                                hashMap3 = hashMap5;
                                linkedHashMap2 = linkedHashMap4;
                                j27 = j48;
                            }
                        } else if (K2.startsWith("#EXT-X-KEY")) {
                            String j53 = j(K2, f0, hashMap2);
                            String i29 = i(K2, g0, "identity", hashMap2);
                            if ("NONE".equals(j53)) {
                                treeMap2.clear();
                                str13 = null;
                            } else {
                                String i30 = i(K2, j0, null, hashMap2);
                                if (!"identity".equals(i29)) {
                                    if (str12 == null) {
                                        str12 = ("SAMPLE-AES-CENC".equals(j53) || "SAMPLE-AES-CTR".equals(j53)) ? "cenc" : "cbcs";
                                    }
                                    b2.n c13 = c(K2, i29, hashMap2);
                                    if (c13 != null) {
                                        treeMap2.put(i29, c13);
                                        str13 = i30;
                                    }
                                } else if ("AES-128".equals(j53)) {
                                    str14 = j(K2, pattern2, hashMap2);
                                    str13 = i30;
                                    oVar5 = oVar;
                                    lVar2 = lVar;
                                    kVar = kVar2;
                                    gVar = gVar3;
                                    arrayList15 = arrayList26;
                                    hashMap3 = hashMap5;
                                    linkedHashMap2 = linkedHashMap4;
                                }
                                str13 = i30;
                                str14 = null;
                                oVar5 = oVar;
                                lVar2 = lVar;
                                kVar = kVar2;
                                gVar = gVar3;
                                arrayList15 = arrayList26;
                                hashMap3 = hashMap5;
                                linkedHashMap2 = linkedHashMap4;
                            }
                            oVar7 = null;
                            str14 = null;
                            oVar5 = oVar;
                            lVar2 = lVar;
                            kVar = kVar2;
                            gVar = gVar3;
                            arrayList15 = arrayList26;
                            hashMap3 = hashMap5;
                            linkedHashMap2 = linkedHashMap4;
                        } else {
                            if (K2.startsWith("#EXT-X-BYTERANGE")) {
                                String j54 = j(K2, b0, hashMap2);
                                String str26 = d0.a;
                                String[] split2 = j54.split("@", -1);
                                j30 = Long.parseLong(split2[c12]);
                                if (split2.length > 1) {
                                    j23 = Long.parseLong(split2[1]);
                                }
                            } else if (K2.startsWith("#EXT-X-DISCONTINUITY-SEQUENCE")) {
                                i18 = Integer.parseInt(K2.substring(K2.indexOf(58) + 1));
                                oVar5 = oVar;
                                lVar2 = lVar;
                                kVar = kVar2;
                                gVar = gVar3;
                                arrayList15 = arrayList26;
                                hashMap3 = hashMap5;
                                str13 = str21;
                                linkedHashMap2 = linkedHashMap4;
                                z13 = true;
                            } else if (K2.equals("#EXT-X-DISCONTINUITY")) {
                                i19++;
                            } else if (K2.startsWith("#EXT-X-PROGRAM-DATE-TIME")) {
                                if (j26 == 0) {
                                    j26 = d0.Q(d0.T(K2.substring(K2.indexOf(58) + 1))) - j24;
                                }
                            } else if (K2.equals("#EXT-X-GAP")) {
                                oVar5 = oVar;
                                lVar2 = lVar;
                                kVar = kVar2;
                                gVar = gVar3;
                                arrayList15 = arrayList26;
                                hashMap3 = hashMap5;
                                str13 = str21;
                                linkedHashMap2 = linkedHashMap4;
                                z15 = true;
                            } else if (K2.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                                oVar5 = oVar;
                                lVar2 = lVar;
                                kVar = kVar2;
                                gVar = gVar3;
                                arrayList15 = arrayList26;
                                hashMap3 = hashMap5;
                                str13 = str21;
                                linkedHashMap2 = linkedHashMap4;
                                z11 = true;
                            } else if (K2.equals("#EXT-X-ENDLIST")) {
                                oVar5 = oVar;
                                lVar2 = lVar;
                                kVar = kVar2;
                                gVar = gVar3;
                                arrayList15 = arrayList26;
                                hashMap3 = hashMap5;
                                str13 = str21;
                                linkedHashMap2 = linkedHashMap4;
                                z12 = true;
                            } else if (K2.startsWith("#EXT-X-RENDITION-REPORT")) {
                                long h10 = h(K2, Y);
                                Matcher matcher2 = Z.matcher(K2);
                                if (matcher2.find()) {
                                    String group = matcher2.group(1);
                                    group.getClass();
                                    i11 = Integer.parseInt(group);
                                } else {
                                    i11 = -1;
                                }
                                arrayList14.add(new h(Uri.parse(e2.a.l(str, j(K2, pattern2, hashMap2))), h10, i11));
                            } else if (!K2.startsWith("#EXT-X-PRELOAD-HINT")) {
                                if (K2.startsWith("#EXT-X-PART")) {
                                    String hexString = str14 == null ? null : str21 != null ? str21 : Long.toHexString(j25);
                                    String j55 = j(K2, pattern2, hashMap2);
                                    long parseDouble2 = (long) (Double.parseDouble(j(K2, K, Collections.EMPTY_MAP)) * 1000000.0d);
                                    boolean f10 = f(K2, u0) | (z11 && arrayList13.isEmpty());
                                    boolean f11 = f(K2, v0);
                                    String i31 = i(K2, pattern, null, hashMap2);
                                    if (i31 != null) {
                                        String str27 = d0.a;
                                        String[] split3 = i31.split("@", -1);
                                        long parseLong = Long.parseLong(split3[0]);
                                        if (split3.length > 1) {
                                            j29 = Long.parseLong(split3[1]);
                                        }
                                        j12 = parseLong;
                                    } else {
                                        j12 = -1;
                                    }
                                    long j56 = j12 == -1 ? 0L : j29;
                                    if (oVar7 != null || treeMap2.isEmpty()) {
                                        oVar3 = oVar7;
                                    } else {
                                        b2.n[] nVarArr = (b2.n[]) treeMap2.values().toArray(new b2.n[0]);
                                        b2.o oVar9 = new b2.o(str12, true, nVarArr);
                                        if (oVar6 == null) {
                                            oVar6 = b(str12, nVarArr);
                                        }
                                        oVar3 = oVar9;
                                    }
                                    g gVar5 = new g(j55, iVar3, parseDouble2, i19, j27, oVar3, str14, hexString, j56, j12, f11, f10, false);
                                    i iVar7 = iVar3;
                                    int i32 = i19;
                                    arrayList13.add(gVar5);
                                    j27 += parseDouble2;
                                    if (j12 != -1) {
                                        j56 += j12;
                                    }
                                    j29 = j56;
                                    lVar2 = lVar;
                                    i19 = i32;
                                    iVar3 = iVar7;
                                    oVar7 = oVar3;
                                    kVar = kVar2;
                                    gVar = gVar3;
                                    arrayList15 = arrayList26;
                                    hashMap3 = hashMap5;
                                    str13 = str21;
                                    linkedHashMap2 = linkedHashMap4;
                                    c12 = 0;
                                } else {
                                    i iVar8 = iVar3;
                                    int i33 = i19;
                                    if (K2.startsWith("#EXT-X-DATERANGE") && i(K2, A0, str10, hashMap2).equals("com.apple.hls.interstitial")) {
                                        String j57 = j(K2, z0, hashMap2);
                                        String i34 = i(K2, G0, null, hashMap2);
                                        Uri parse = i34 != null ? Uri.parse(i34) : null;
                                        String i35 = i(K2, H0, null, hashMap2);
                                        Uri parse2 = i35 != null ? Uri.parse(i35) : null;
                                        String i36 = i(K2, B0, null, hashMap2);
                                        if (i36 != null) {
                                            iVar = iVar8;
                                            j14 = d0.Q(d0.T(i36));
                                        } else {
                                            iVar = iVar8;
                                            j14 = -9223372036854775807L;
                                        }
                                        i12 = i33;
                                        String i37 = i(K2, D0, null, hashMap2);
                                        long Q2 = i37 != null ? d0.Q(d0.T(i37)) : -9223372036854775807L;
                                        ArrayList arrayList28 = new ArrayList();
                                        arrayList7 = arrayList13;
                                        String i38 = i(K2, C0, null, hashMap2);
                                        if (i38 != null) {
                                            String str28 = d0.a;
                                            String[] split4 = i38.split(",", -1);
                                            int length = split4.length;
                                            int i39 = 0;
                                            while (i39 < length) {
                                                int i40 = i39;
                                                String trim = split4[i39].trim();
                                                trim.getClass();
                                                switch (trim.hashCode()) {
                                                    case 79491:
                                                        i14 = length;
                                                        if (trim.equals("PRE")) {
                                                            c11 = 0;
                                                            break;
                                                        }
                                                        c11 = 65535;
                                                        break;
                                                    case 2430593:
                                                        i14 = length;
                                                        if (trim.equals("ONCE")) {
                                                            c11 = 1;
                                                            break;
                                                        }
                                                        c11 = 65535;
                                                        break;
                                                    case 2461856:
                                                        i14 = length;
                                                        if (trim.equals("POST")) {
                                                            c11 = 2;
                                                            break;
                                                        }
                                                        c11 = 65535;
                                                        break;
                                                    default:
                                                        i14 = length;
                                                        c11 = 65535;
                                                        break;
                                                }
                                                switch (c11) {
                                                    case 0:
                                                    case 1:
                                                    case 2:
                                                        arrayList28.add(trim);
                                                        break;
                                                }
                                                i39 = i40 + 1;
                                                length = i14;
                                            }
                                        }
                                        TreeMap treeMap3 = treeMap2;
                                        str4 = str12;
                                        double g13 = g(K2, L, -1.0d);
                                        long j58 = g13 >= 0.0d ? (long) (g13 * 1000000.0d) : -9223372036854775807L;
                                        double g14 = g(K2, E0, -1.0d);
                                        long j59 = g14 >= 0.0d ? (long) (g14 * 1000000.0d) : -9223372036854775807L;
                                        boolean f12 = f(K2, F0);
                                        long j60 = j59;
                                        double g15 = g(K2, I0, Double.MIN_VALUE);
                                        long j61 = g15 != Double.MIN_VALUE ? (long) (g15 * 1000000.0d) : -9223372036854775807L;
                                        double g16 = g(K2, J0, -1.0d);
                                        long j62 = g16 >= 0.0d ? (long) (g16 * 1000000.0d) : -9223372036854775807L;
                                        ArrayList arrayList29 = new ArrayList();
                                        treeMap = treeMap3;
                                        str2 = str10;
                                        String i41 = i(K2, K0, null, hashMap2);
                                        if (i41 != null) {
                                            String str29 = d0.a;
                                            String[] split5 = i41.split(",", -1);
                                            int length2 = split5.length;
                                            int i42 = 0;
                                            while (i42 < length2) {
                                                int i43 = i42;
                                                String trim2 = split5[i42].trim();
                                                trim2.getClass();
                                                int i44 = length2;
                                                if (trim2.equals("IN") || trim2.equals("OUT")) {
                                                    arrayList29.add(trim2);
                                                }
                                                i42 = i43 + 1;
                                                length2 = i44;
                                            }
                                        }
                                        ArrayList arrayList30 = new ArrayList();
                                        arrayList5 = arrayList14;
                                        String i45 = i(K2, L0, null, hashMap2);
                                        if (i45 != null) {
                                            String str30 = d0.a;
                                            String[] split6 = i45.split(",", -1);
                                            int length3 = split6.length;
                                            int i46 = 0;
                                            while (i46 < length3) {
                                                String[] strArr = split6;
                                                String trim3 = split6[i46].trim();
                                                trim3.getClass();
                                                int i47 = length3;
                                                if (trim3.equals("JUMP") || trim3.equals("SKIP")) {
                                                    arrayList30.add(trim3);
                                                }
                                                i46++;
                                                length3 = i47;
                                                split6 = strArr;
                                            }
                                        }
                                        Boolean valueOf = i(K2, M0, null, hashMap2) != null ? Boolean.valueOf(!r4.equals("NO")) : null;
                                        String i48 = i(K2, N0, null, hashMap2);
                                        if (i48 != null) {
                                            str5 = "RANGE";
                                            if (!i48.equals("RANGE")) {
                                                str5 = "POINT";
                                            }
                                            arrayList6 = arrayList12;
                                            i13 = i(K2, O0, null, hashMap2);
                                            if (i13 != null) {
                                                str6 = "PRIMARY";
                                                if (!i13.equals("PRIMARY")) {
                                                    str6 = "HIGHLIGHT";
                                                }
                                                arrayList8 = new ArrayList();
                                                str7 = str6;
                                                String substring = K2.substring(17);
                                                matcher = Q0.matcher(substring);
                                                while (matcher.find()) {
                                                    Matcher matcher3 = matcher;
                                                    String group2 = matcher3.group();
                                                    group2.getClass();
                                                    switch (group2.hashCode()) {
                                                        case -2136701954:
                                                            str9 = str5;
                                                            if (group2.equals("X-SNAP=")) {
                                                                c10 = 0;
                                                                break;
                                                            }
                                                            c10 = 65535;
                                                            break;
                                                        case -1843050726:
                                                            str9 = str5;
                                                            if (group2.equals("X-CONTENT-MAY-VARY=")) {
                                                                c10 = 1;
                                                                break;
                                                            }
                                                            c10 = 65535;
                                                            break;
                                                        case -148960310:
                                                            str9 = str5;
                                                            if (group2.equals("X-PLAYOUT-LIMIT=")) {
                                                                c10 = 2;
                                                                break;
                                                            }
                                                            c10 = 65535;
                                                            break;
                                                        case -36345757:
                                                            str9 = str5;
                                                            if (group2.equals("X-TIMELINE-STYLE=")) {
                                                                c10 = 3;
                                                                break;
                                                            }
                                                            c10 = 65535;
                                                            break;
                                                        case 397239341:
                                                            str9 = str5;
                                                            if (group2.equals("X-ASSET-LIST=")) {
                                                                c10 = 4;
                                                                break;
                                                            }
                                                            c10 = 65535;
                                                            break;
                                                        case 850193465:
                                                            str9 = str5;
                                                            if (group2.equals("X-TIMELINE-OCCUPIES=")) {
                                                                c10 = 5;
                                                                break;
                                                            }
                                                            c10 = 65535;
                                                            break;
                                                        case 1472528844:
                                                            str9 = str5;
                                                            if (group2.equals("X-RESTRICT=")) {
                                                                c10 = 6;
                                                                break;
                                                            }
                                                            c10 = 65535;
                                                            break;
                                                        case 1748487807:
                                                            str9 = str5;
                                                            if (group2.equals("X-RESUME-OFFSET=")) {
                                                                c10 = 7;
                                                                break;
                                                            }
                                                            c10 = 65535;
                                                            break;
                                                        case 1814205923:
                                                            str9 = str5;
                                                            if (group2.equals("X-ASSET-URI=")) {
                                                                c10 = '\b';
                                                                break;
                                                            }
                                                            c10 = 65535;
                                                            break;
                                                        default:
                                                            str9 = str5;
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
                                                            bool2 = valueOf;
                                                            arrayList11 = arrayList30;
                                                            j21 = j62;
                                                            break;
                                                        default:
                                                            bool2 = valueOf;
                                                            String i49 = e2.i(1, 0, group2);
                                                            String t10 = p6.t(i49, "=");
                                                            int length4 = t10.length() + substring.indexOf(t10);
                                                            arrayList11 = arrayList30;
                                                            String substring2 = substring.substring(length4, (substring.length() == length4 + 1 ? 1 : 2) + length4);
                                                            if (substring2.startsWith("\"")) {
                                                                dVar = new d(0, i49, j(substring, Pattern.compile(i49 + "=\"((?:.|\f)+?)\""), hashMap2));
                                                                j21 = j62;
                                                            } else if (substring2.equals("0x") || substring2.equals("0X")) {
                                                                j21 = j62;
                                                                dVar = new d(1, i49, j(substring, Pattern.compile(i49 + "=(0[xX][A-F0-9]+)"), hashMap2));
                                                            } else {
                                                                j21 = j62;
                                                                dVar = new d(i49, Double.parseDouble(j(substring, Pattern.compile(i49 + "=([\\d\\.]+)\\b"), Collections.EMPTY_MAP)));
                                                            }
                                                            arrayList8.add(dVar);
                                                            break;
                                                    }
                                                    matcher = matcher3;
                                                    str5 = str9;
                                                    valueOf = bool2;
                                                    arrayList30 = arrayList11;
                                                    j62 = j21;
                                                }
                                                bool = valueOf;
                                                arrayList9 = arrayList30;
                                                j15 = j62;
                                                str8 = str5;
                                                linkedHashMap = linkedHashMap4;
                                                e eVar2 = linkedHashMap.containsKey(j57) ? (e) linkedHashMap.get(j57) : new e(j57);
                                                if (parse == null) {
                                                    eVar2.getClass();
                                                } else {
                                                    Uri uri4 = eVar2.c;
                                                    if (uri4 != null) {
                                                        e2.d.a("Can't change assetUri from " + eVar2.c + " to " + parse, uri4.equals(parse));
                                                    }
                                                    eVar2.c = parse;
                                                }
                                                if (parse2 != null) {
                                                    Uri uri5 = eVar2.d;
                                                    if (uri5 != null) {
                                                        e2.d.a("Can't change assetListUri from " + eVar2.d + " to " + parse2, uri5.equals(parse2));
                                                    }
                                                    eVar2.d = parse2;
                                                }
                                                if (j14 != -9223372036854775807L) {
                                                    long j63 = eVar2.e;
                                                    if (j63 != -9223372036854775807L) {
                                                        e2.d.a("Can't change startDateUnixUs from " + eVar2.e + " to " + j14, j63 == j14);
                                                    }
                                                    eVar2.e = j14;
                                                }
                                                j16 = Q2;
                                                if (j16 != -9223372036854775807L) {
                                                    long j64 = eVar2.f;
                                                    if (j64 != -9223372036854775807L) {
                                                        e2.d.a("Can't change endDateUnixUs from " + eVar2.f + " to " + j16, j64 == j16);
                                                    }
                                                    eVar2.f = j16;
                                                }
                                                if (j58 != -9223372036854775807L) {
                                                    long j65 = eVar2.g;
                                                    if (j65 != -9223372036854775807L) {
                                                        boolean z19 = j65 == j58;
                                                        StringBuilder sb2 = new StringBuilder("Can't change durationUs from ");
                                                        sb2.append(eVar2.g);
                                                        sb2.append(" to ");
                                                        j20 = j58;
                                                        sb2.append(j20);
                                                        e2.d.a(sb2.toString(), z19);
                                                    } else {
                                                        j20 = j58;
                                                    }
                                                    eVar2.g = j20;
                                                }
                                                if (j60 != -9223372036854775807L) {
                                                    long j66 = eVar2.h;
                                                    if (j66 != -9223372036854775807L) {
                                                        boolean z20 = j66 == j60;
                                                        StringBuilder sb3 = new StringBuilder("Can't change plannedDurationUs from ");
                                                        sb3.append(eVar2.h);
                                                        sb3.append(" to ");
                                                        j19 = j60;
                                                        sb3.append(j19);
                                                        e2.d.a(sb3.toString(), z20);
                                                    } else {
                                                        j19 = j60;
                                                    }
                                                    eVar2.h = j19;
                                                }
                                                if (!arrayList28.isEmpty()) {
                                                    if (!eVar2.i.isEmpty()) {
                                                        boolean equals = eVar2.i.equals(arrayList28);
                                                        StringBuilder sb4 = new StringBuilder("Can't change cue from ");
                                                        ArrayList arrayList31 = eVar2.i;
                                                        StringBuilder sb5 = new StringBuilder();
                                                        Iterator it = arrayList31.iterator();
                                                        if (it.hasNext()) {
                                                            while (true) {
                                                                sb5.append((CharSequence) it.next());
                                                                if (it.hasNext()) {
                                                                    sb5.append((CharSequence) ", ");
                                                                }
                                                            }
                                                        }
                                                        sb4.append(sb5.toString());
                                                        sb4.append(" to ");
                                                        StringBuilder sb6 = new StringBuilder();
                                                        Iterator it2 = arrayList28.iterator();
                                                        if (it2.hasNext()) {
                                                            while (true) {
                                                                sb6.append((CharSequence) it2.next());
                                                                if (it2.hasNext()) {
                                                                    sb6.append((CharSequence) ", ");
                                                                }
                                                            }
                                                        }
                                                        sb4.append(sb6.toString());
                                                        e2.d.a(sb4.toString(), equals);
                                                    }
                                                    eVar2.i = arrayList28;
                                                }
                                                if (f12) {
                                                    eVar2.j = true;
                                                }
                                                if (j61 != -9223372036854775807L) {
                                                    long j67 = eVar2.k;
                                                    if (j67 != -9223372036854775807L) {
                                                        boolean z21 = j67 == j61;
                                                        StringBuilder sb7 = new StringBuilder("Can't change resumeOffsetUs from ");
                                                        sb7.append(eVar2.k);
                                                        sb7.append(" to ");
                                                        j18 = j61;
                                                        sb7.append(j18);
                                                        e2.d.a(sb7.toString(), z21);
                                                    } else {
                                                        j18 = j61;
                                                    }
                                                    eVar2.k = j18;
                                                }
                                                if (j15 != -9223372036854775807L) {
                                                    long j68 = eVar2.l;
                                                    if (j68 != -9223372036854775807L) {
                                                        boolean z22 = j68 == j15;
                                                        StringBuilder sb8 = new StringBuilder("Can't change playoutLimitUs from ");
                                                        sb8.append(eVar2.l);
                                                        sb8.append(" to ");
                                                        j17 = j15;
                                                        sb8.append(j17);
                                                        e2.d.a(sb8.toString(), z22);
                                                    } else {
                                                        j17 = j15;
                                                    }
                                                    eVar2.l = j17;
                                                }
                                                if (!arrayList29.isEmpty()) {
                                                    if (!eVar2.m.isEmpty()) {
                                                        boolean equals2 = eVar2.m.equals(arrayList29);
                                                        StringBuilder sb9 = new StringBuilder("Can't change snapTypes from ");
                                                        ArrayList arrayList32 = eVar2.m;
                                                        StringBuilder sb10 = new StringBuilder();
                                                        Iterator it3 = arrayList32.iterator();
                                                        if (it3.hasNext()) {
                                                            while (true) {
                                                                sb10.append((CharSequence) it3.next());
                                                                if (it3.hasNext()) {
                                                                    sb10.append((CharSequence) ", ");
                                                                }
                                                            }
                                                        }
                                                        sb9.append(sb10.toString());
                                                        sb9.append(" to ");
                                                        StringBuilder sb11 = new StringBuilder();
                                                        Iterator it4 = arrayList29.iterator();
                                                        if (it4.hasNext()) {
                                                            while (true) {
                                                                sb11.append((CharSequence) it4.next());
                                                                if (it4.hasNext()) {
                                                                    sb11.append((CharSequence) ", ");
                                                                }
                                                            }
                                                        }
                                                        sb9.append(sb11.toString());
                                                        e2.d.a(sb9.toString(), equals2);
                                                    }
                                                    eVar2.m = arrayList29;
                                                }
                                                eVar2.getClass();
                                                if (!arrayList9.isEmpty()) {
                                                    if (eVar2.n.isEmpty()) {
                                                        arrayList10 = arrayList9;
                                                    } else {
                                                        arrayList10 = arrayList9;
                                                        boolean equals3 = eVar2.n.equals(arrayList10);
                                                        StringBuilder sb12 = new StringBuilder("Can't change restrictions from ");
                                                        ArrayList arrayList33 = eVar2.n;
                                                        StringBuilder sb13 = new StringBuilder();
                                                        Iterator it5 = arrayList33.iterator();
                                                        if (it5.hasNext()) {
                                                            while (true) {
                                                                sb13.append((CharSequence) it5.next());
                                                                if (it5.hasNext()) {
                                                                    sb13.append((CharSequence) ", ");
                                                                }
                                                            }
                                                        }
                                                        sb12.append(sb13.toString());
                                                        sb12.append(" to ");
                                                        StringBuilder sb14 = new StringBuilder();
                                                        Iterator it6 = arrayList10.iterator();
                                                        if (it6.hasNext()) {
                                                            while (true) {
                                                                sb14.append((CharSequence) it6.next());
                                                                if (it6.hasNext()) {
                                                                    sb14.append((CharSequence) ", ");
                                                                }
                                                            }
                                                        }
                                                        sb12.append(sb14.toString());
                                                        e2.d.a(sb12.toString(), equals3);
                                                    }
                                                    eVar2.n = arrayList10;
                                                }
                                                HashMap hashMap6 = eVar2.b;
                                                if (!arrayList8.isEmpty()) {
                                                    for (int i50 = 0; i50 < arrayList8.size(); i50++) {
                                                        d dVar2 = (d) arrayList8.get(i50);
                                                        String str31 = dVar2.a;
                                                        d dVar3 = (d) hashMap6.get(str31);
                                                        if (dVar3 != null) {
                                                            boolean equals4 = dVar3.equals(dVar2);
                                                            StringBuilder v9 = a4.a.v("Can't change ", str31, " from ");
                                                            v9.append(dVar3.d);
                                                            v9.append(" ");
                                                            v9.append(dVar3.c);
                                                            v9.append(" to ");
                                                            v9.append(dVar2.d);
                                                            v9.append(" ");
                                                            v9.append(dVar2.c);
                                                            e2.d.a(v9.toString(), equals4);
                                                        }
                                                        hashMap6.put(str31, dVar2);
                                                    }
                                                }
                                                if (bool != null) {
                                                    Boolean bool4 = eVar2.o;
                                                    if (bool4 != null) {
                                                        e2.d.a("Can't change contentMayVary from " + eVar2.o + " to " + bool, bool4.equals(bool));
                                                    }
                                                    eVar2.o = bool;
                                                }
                                                if (str8 != null) {
                                                    String str32 = eVar2.p;
                                                    if (str32 != null) {
                                                        e2.d.a("Can't change timelineOccupies from " + eVar2.p + " to " + str8, str32.equals(str8));
                                                    }
                                                    eVar2.p = str8;
                                                }
                                                if (str7 != null) {
                                                    String str33 = eVar2.q;
                                                    if (str33 != null) {
                                                        e2.d.a("Can't change timelineStyle from " + eVar2.q + " to " + str7, str33.equals(str7));
                                                    }
                                                    eVar2.q = str7;
                                                }
                                                linkedHashMap.put(j57, eVar2);
                                            }
                                            str6 = null;
                                            arrayList8 = new ArrayList();
                                            str7 = str6;
                                            String substring3 = K2.substring(17);
                                            matcher = Q0.matcher(substring3);
                                            while (matcher.find()) {
                                            }
                                            bool = valueOf;
                                            arrayList9 = arrayList30;
                                            j15 = j62;
                                            str8 = str5;
                                            linkedHashMap = linkedHashMap4;
                                            if (linkedHashMap.containsKey(j57)) {
                                            }
                                            if (parse == null) {
                                            }
                                            if (parse2 != null) {
                                            }
                                            if (j14 != -9223372036854775807L) {
                                            }
                                            j16 = Q2;
                                            if (j16 != -9223372036854775807L) {
                                            }
                                            if (j58 != -9223372036854775807L) {
                                            }
                                            if (j60 != -9223372036854775807L) {
                                            }
                                            if (!arrayList28.isEmpty()) {
                                            }
                                            if (f12) {
                                            }
                                            if (j61 != -9223372036854775807L) {
                                            }
                                            if (j15 != -9223372036854775807L) {
                                            }
                                            if (!arrayList29.isEmpty()) {
                                            }
                                            eVar2.getClass();
                                            if (!arrayList9.isEmpty()) {
                                            }
                                            HashMap hashMap62 = eVar2.b;
                                            if (!arrayList8.isEmpty()) {
                                            }
                                            if (bool != null) {
                                            }
                                            if (str8 != null) {
                                            }
                                            if (str7 != null) {
                                            }
                                            linkedHashMap.put(j57, eVar2);
                                        }
                                        str5 = null;
                                        arrayList6 = arrayList12;
                                        i13 = i(K2, O0, null, hashMap2);
                                        if (i13 != null) {
                                        }
                                        str6 = null;
                                        arrayList8 = new ArrayList();
                                        str7 = str6;
                                        String substring32 = K2.substring(17);
                                        matcher = Q0.matcher(substring32);
                                        while (matcher.find()) {
                                        }
                                        bool = valueOf;
                                        arrayList9 = arrayList30;
                                        j15 = j62;
                                        str8 = str5;
                                        linkedHashMap = linkedHashMap4;
                                        if (linkedHashMap.containsKey(j57)) {
                                        }
                                        if (parse == null) {
                                        }
                                        if (parse2 != null) {
                                        }
                                        if (j14 != -9223372036854775807L) {
                                        }
                                        j16 = Q2;
                                        if (j16 != -9223372036854775807L) {
                                        }
                                        if (j58 != -9223372036854775807L) {
                                        }
                                        if (j60 != -9223372036854775807L) {
                                        }
                                        if (!arrayList28.isEmpty()) {
                                        }
                                        if (f12) {
                                        }
                                        if (j61 != -9223372036854775807L) {
                                        }
                                        if (j15 != -9223372036854775807L) {
                                        }
                                        if (!arrayList29.isEmpty()) {
                                        }
                                        eVar2.getClass();
                                        if (!arrayList9.isEmpty()) {
                                        }
                                        HashMap hashMap622 = eVar2.b;
                                        if (!arrayList8.isEmpty()) {
                                        }
                                        if (bool != null) {
                                        }
                                        if (str8 != null) {
                                        }
                                        if (str7 != null) {
                                        }
                                        linkedHashMap.put(j57, eVar2);
                                    } else {
                                        i12 = i33;
                                        arrayList6 = arrayList12;
                                        arrayList7 = arrayList13;
                                        arrayList5 = arrayList14;
                                        treeMap = treeMap2;
                                        str4 = str12;
                                        iVar = iVar8;
                                        str2 = str10;
                                        linkedHashMap = linkedHashMap4;
                                        if (!K2.startsWith("#")) {
                                            String hexString2 = str14 == null ? null : str21 != null ? str21 : Long.toHexString(j25);
                                            long j69 = j25 + 1;
                                            String k10 = k(K2, hashMap2);
                                            i iVar9 = (i) hashMap5.get(k10);
                                            if (j30 == -1) {
                                                iVar2 = iVar9;
                                                j23 = 0;
                                            } else if (z14 && iVar == null && iVar9 == null) {
                                                i iVar10 = new i(k10, 0L, j23, null, null);
                                                hashMap5.put(k10, iVar10);
                                                iVar2 = iVar10;
                                            } else {
                                                iVar2 = iVar9;
                                                j23 = j23;
                                            }
                                            if (oVar7 != null || treeMap.isEmpty()) {
                                                str12 = str4;
                                            } else {
                                                b2.n[] nVarArr2 = (b2.n[]) treeMap.values().toArray(new b2.n[0]);
                                                str12 = str4;
                                                b2.o oVar10 = new b2.o(str12, true, nVarArr2);
                                                if (oVar6 == null) {
                                                    oVar4 = b(str12, nVarArr2);
                                                    oVar7 = oVar10;
                                                    j13 = j23;
                                                    long j70 = j24;
                                                    b2.o oVar11 = oVar7;
                                                    long j71 = j13;
                                                    String str34 = str14;
                                                    long j72 = j28;
                                                    str14 = str34;
                                                    arrayList6.add(new i(k10, iVar == null ? iVar : iVar2, str11, j72, i12, j70, oVar11, str34, hexString2, j71, j30, z15, arrayList7));
                                                    j27 = j70 + j72;
                                                    ArrayList arrayList34 = new ArrayList();
                                                    j23 = j30 == -1 ? j71 + j30 : j71;
                                                    j25 = j69;
                                                    linkedHashMap2 = linkedHashMap;
                                                    hashMap3 = hashMap5;
                                                    oVar6 = oVar4;
                                                    i19 = i12;
                                                    oVar7 = oVar11;
                                                    j24 = j27;
                                                    iVar3 = iVar;
                                                    treeMap2 = treeMap;
                                                    str10 = str2;
                                                    str11 = str10;
                                                    j28 = 0;
                                                    j30 = -1;
                                                    kVar = kVar2;
                                                    gVar = gVar3;
                                                    arrayList15 = arrayList26;
                                                    str13 = str21;
                                                    arrayList14 = arrayList5;
                                                    c12 = 0;
                                                    z15 = false;
                                                    lVar2 = lVar;
                                                    arrayList13 = arrayList34;
                                                    arrayList12 = arrayList6;
                                                } else {
                                                    oVar7 = oVar10;
                                                }
                                            }
                                            j13 = j23;
                                            oVar4 = oVar6;
                                            long j702 = j24;
                                            b2.o oVar112 = oVar7;
                                            long j712 = j13;
                                            String str342 = str14;
                                            long j722 = j28;
                                            str14 = str342;
                                            arrayList6.add(new i(k10, iVar == null ? iVar : iVar2, str11, j722, i12, j702, oVar112, str342, hexString2, j712, j30, z15, arrayList7));
                                            j27 = j702 + j722;
                                            ArrayList arrayList342 = new ArrayList();
                                            if (j30 == -1) {
                                            }
                                            j25 = j69;
                                            linkedHashMap2 = linkedHashMap;
                                            hashMap3 = hashMap5;
                                            oVar6 = oVar4;
                                            i19 = i12;
                                            oVar7 = oVar112;
                                            j24 = j27;
                                            iVar3 = iVar;
                                            treeMap2 = treeMap;
                                            str10 = str2;
                                            str11 = str10;
                                            j28 = 0;
                                            j30 = -1;
                                            kVar = kVar2;
                                            gVar = gVar3;
                                            arrayList15 = arrayList26;
                                            str13 = str21;
                                            arrayList14 = arrayList5;
                                            c12 = 0;
                                            z15 = false;
                                            lVar2 = lVar;
                                            arrayList13 = arrayList342;
                                            arrayList12 = arrayList6;
                                        }
                                    }
                                    j11 = j23;
                                    i10 = i12;
                                    arrayList4 = arrayList7;
                                    j3 = j24;
                                    str12 = str4;
                                    j10 = j28;
                                    str3 = str11;
                                    hashMap = hashMap5;
                                    arrayList3 = arrayList6;
                                    arrayList12 = arrayList3;
                                    linkedHashMap2 = linkedHashMap;
                                    hashMap3 = hashMap;
                                    str11 = str3;
                                    j28 = j10;
                                    j24 = j3;
                                    j23 = j11;
                                    iVar3 = iVar;
                                    treeMap2 = treeMap;
                                    str10 = str2;
                                    kVar = kVar2;
                                    gVar = gVar3;
                                    arrayList15 = arrayList26;
                                    str13 = str21;
                                    arrayList14 = arrayList5;
                                    c12 = 0;
                                    oVar5 = oVar;
                                    arrayList13 = arrayList4;
                                    i19 = i10;
                                    lVar2 = lVar;
                                }
                                oVar5 = oVar;
                            } else if (gVar3 == null && "PART".equals(j(K2, l0, hashMap2))) {
                                String j73 = j(K2, pattern2, hashMap2);
                                long h11 = h(K2, d0);
                                long h12 = h(K2, e0);
                                String hexString3 = str14 == null ? null : str21 != null ? str21 : Long.toHexString(j25);
                                if (oVar7 != null || treeMap2.isEmpty()) {
                                    oVar2 = oVar7;
                                } else {
                                    b2.n[] nVarArr3 = (b2.n[]) treeMap2.values().toArray(new b2.n[0]);
                                    b2.o oVar12 = new b2.o(str12, true, nVarArr3);
                                    if (oVar6 == null) {
                                        oVar6 = b(str12, nVarArr3);
                                    }
                                    oVar2 = oVar12;
                                }
                                gVar = (h11 == -1 || h12 != -1) ? new g(j73, iVar3, 0L, i19, j27, oVar2, str14, hexString3, h11 != -1 ? h11 : 0L, h12, false, false, true) : gVar3;
                                oVar5 = oVar;
                                lVar2 = lVar;
                                oVar7 = oVar2;
                                kVar = kVar2;
                                arrayList15 = arrayList26;
                                hashMap3 = hashMap5;
                                str13 = str21;
                                linkedHashMap2 = linkedHashMap4;
                                c12 = 0;
                            }
                            oVar5 = oVar;
                            lVar2 = lVar;
                        }
                        arrayList3 = arrayList12;
                        arrayList4 = arrayList13;
                        arrayList5 = arrayList14;
                        treeMap = treeMap2;
                        str2 = str10;
                        j3 = j24;
                        iVar = iVar3;
                        i10 = i19;
                        j10 = j28;
                        str3 = str11;
                        hashMap = hashMap5;
                        linkedHashMap = linkedHashMap4;
                        j11 = j23;
                        arrayList12 = arrayList3;
                        linkedHashMap2 = linkedHashMap;
                        hashMap3 = hashMap;
                        str11 = str3;
                        j28 = j10;
                        j24 = j3;
                        j23 = j11;
                        iVar3 = iVar;
                        treeMap2 = treeMap;
                        str10 = str2;
                        kVar = kVar2;
                        gVar = gVar3;
                        arrayList15 = arrayList26;
                        str13 = str21;
                        arrayList14 = arrayList5;
                        c12 = 0;
                        oVar5 = oVar;
                        arrayList13 = arrayList4;
                        i19 = i10;
                        lVar2 = lVar;
                    }
                    kVar = kVar2;
                    gVar = gVar3;
                    arrayList15 = arrayList26;
                    hashMap3 = hashMap5;
                    str13 = str21;
                    linkedHashMap2 = linkedHashMap4;
                }
            }
            kVar = kVar2;
            gVar = gVar3;
        }
        throw new q();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Can't wrap try/catch for region: R(30:34|(1:36)(1:128)|37|38|(1:40)(1:127)|41|(2:43|(23:45|46|(5:(1:64)|65|(5:71|(3:73|(1:81)(4:75|(1:77)|78|79)|80)|82|83|(2:85|(1:69)(1:70)))|67|(0)(0))|86|(2:88|(0))(1:123)|122|91|(1:93)(1:121)|94|95|(1:97)(2:114|(1:116)(3:117|118|119))|98|99|100|101|102|103|104|105|(1:107)|108|109|13)(1:124))(1:126)|125|46|(5:(0)|65|(0)|67|(0)(0))|86|(0)(0)|122|91|(0)(0)|94|95|(0)(0)|98|99|100|101|102|103|104|105|(0)|108|109|13) */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0259, code lost:
    
        if (r3 > 0) goto L102;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x028f  */
    /* JADX WARN: Type inference failed for: r26v1 */
    /* JADX WARN: Type inference failed for: r26v11 */
    /* JADX WARN: Type inference failed for: r26v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static o e(m2.t tVar, String str) {
        int i10;
        char c10;
        ArrayList arrayList;
        n nVar;
        String str2;
        ArrayList arrayList2;
        int parseInt;
        String str3;
        n nVar2;
        String str4;
        n nVar3;
        HashMap hashMap;
        ArrayList arrayList3;
        boolean z10;
        int i11;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        ArrayList arrayList7;
        int i12;
        String str5;
        String str6;
        String v9;
        String i13;
        String str7;
        int i14;
        int i15;
        Uri m10;
        HashMap hashMap2;
        ArrayList arrayList8;
        String[] b02;
        String sb2;
        String str8 = str;
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
        boolean z11 = false;
        boolean z12 = false;
        while (true) {
            boolean F2 = tVar.F();
            Pattern pattern = i0;
            ArrayList arrayList17 = arrayList13;
            boolean z13 = z11;
            Pattern pattern2 = n0;
            boolean z14 = z12;
            if (!F2) {
                ArrayList arrayList18 = arrayList14;
                ArrayList arrayList19 = arrayList10;
                ArrayList arrayList20 = arrayList11;
                ArrayList arrayList21 = arrayList12;
                ArrayList arrayList22 = arrayList16;
                ArrayList arrayList23 = arrayList15;
                HashMap hashMap5 = hashMap3;
                ArrayList arrayList24 = new ArrayList();
                HashSet hashSet = new HashSet();
                int i16 = 0;
                while (i16 < arrayList9.size()) {
                    n nVar4 = (n) arrayList9.get(i16);
                    Uri uri = nVar4.a;
                    b2.s sVar = nVar4.b;
                    if (hashSet.add(uri)) {
                        e2.d.g(sVar.l == null);
                        ArrayList arrayList25 = (ArrayList) hashMap5.get(nVar4.a);
                        arrayList25.getClass();
                        hashMap = hashMap5;
                        p0 p0Var = new p0(new o2.s(null, null, arrayList25));
                        b2.r a2 = sVar.a();
                        a2.k = p0Var;
                        arrayList24.add(new n(nVar4.a, new b2.s(a2), nVar4.c, nVar4.d, nVar4.e, nVar4.f));
                    } else {
                        hashMap = hashMap5;
                    }
                    i16++;
                    hashMap5 = hashMap;
                }
                int i17 = 0;
                List list = null;
                b2.s sVar2 = null;
                while (i17 < arrayList18.size()) {
                    ArrayList arrayList26 = arrayList18;
                    String str9 = (String) arrayList26.get(i17);
                    String j3 = j(str9, o0, hashMap4);
                    String j10 = j(str9, pattern2, hashMap4);
                    b2.r rVar = new b2.r();
                    ArrayList arrayList27 = arrayList24;
                    rVar.a = a4.a.C(j3, ":", j10);
                    rVar.b = j10;
                    rVar.p = r0.n("application/x-mpegURL");
                    boolean f7 = f(str9, s0);
                    ?? r26 = f7;
                    if (f(str9, t0)) {
                        r26 = (f7 ? 1 : 0) | 2;
                    }
                    rVar.e = f(str9, r0) ? r26 | 4 : r26;
                    int i18 = i17;
                    String i19 = i(str9, p0, null, hashMap4);
                    if (TextUtils.isEmpty(i19)) {
                        arrayList18 = arrayList26;
                        i10 = 0;
                    } else {
                        String str10 = d0.a;
                        String[] split = i19.split(",", -1);
                        i10 = d0.k(split, "public.accessibility.describes-video") ? 512 : 0;
                        arrayList18 = arrayList26;
                        if (d0.k(split, "public.accessibility.transcribes-spoken-dialog")) {
                            i10 |= 4096;
                        }
                        if (d0.k(split, "public.accessibility.describes-music-and-sound")) {
                            i10 |= 1024;
                        }
                        if (d0.k(split, "public.easy-to-read")) {
                            i10 |= 8192;
                        }
                    }
                    rVar.f = i10;
                    rVar.d = i(str9, m0, null, hashMap4);
                    String i20 = i(str9, pattern, null, hashMap4);
                    Uri m11 = i20 == null ? null : e2.a.m(str8, i20);
                    p0 p0Var2 = new p0(new o2.s(j3, j10, Collections.EMPTY_LIST));
                    String j11 = j(str9, k0, hashMap4);
                    switch (j11.hashCode()) {
                        case -959297733:
                            if (j11.equals("SUBTITLES")) {
                                c10 = 0;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case -333210994:
                            if (j11.equals("CLOSED-CAPTIONS")) {
                                c10 = 1;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 62628790:
                            if (j11.equals("AUDIO")) {
                                c10 = 2;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 81665115:
                            if (j11.equals("VIDEO")) {
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
                            int i21 = 0;
                            while (true) {
                                if (i21 < arrayList9.size()) {
                                    nVar = (n) arrayList9.get(i21);
                                    if (!j3.equals(nVar.e)) {
                                        i21++;
                                    }
                                } else {
                                    nVar = null;
                                }
                            }
                            if (nVar != null) {
                                String v10 = d0.v(3, nVar.b.k);
                                rVar.j = v10;
                                str2 = r0.d(v10);
                            } else {
                                str2 = null;
                            }
                            if (str2 == null) {
                                str2 = "text/vtt";
                            }
                            rVar.q = r0.n(str2);
                            rVar.k = p0Var2;
                            if (m11 == null) {
                                arrayList = arrayList21;
                                e2.a.n("HlsPlaylistParser", "EXT-X-MEDIA tag with missing mandatory URI attribute: skipping");
                                break;
                            } else {
                                m mVar = new m(m11, new b2.s(rVar), j10);
                                arrayList = arrayList21;
                                arrayList.add(mVar);
                                break;
                            }
                        case 1:
                            arrayList2 = arrayList20;
                            String j12 = j(str9, q0, hashMap4);
                            if (j12.startsWith("CC")) {
                                parseInt = Integer.parseInt(j12.substring(2));
                                str3 = "application/cea-608";
                            } else {
                                parseInt = Integer.parseInt(j12.substring(7));
                                str3 = "application/cea-708";
                            }
                            if (list == null) {
                                list = new ArrayList();
                            }
                            rVar.q = r0.n(str3);
                            rVar.N = parseInt;
                            list.add(new b2.s(rVar));
                            arrayList20 = arrayList2;
                            arrayList = arrayList21;
                            break;
                        case 2:
                            int i22 = 0;
                            while (true) {
                                if (i22 < arrayList9.size()) {
                                    nVar2 = (n) arrayList9.get(i22);
                                    int i23 = i22;
                                    if (!j3.equals(nVar2.d)) {
                                        i22 = i23 + 1;
                                    }
                                } else {
                                    nVar2 = null;
                                }
                            }
                            if (nVar2 != null) {
                                String v11 = d0.v(1, nVar2.b.k);
                                rVar.j = v11;
                                str4 = r0.d(v11);
                            } else {
                                str4 = null;
                            }
                            n nVar5 = nVar2;
                            String i24 = i(str9, r, null, hashMap4);
                            if (i24 != null) {
                                String str11 = d0.a;
                                rVar.I = Integer.parseInt(i24.split("/", 2)[0]);
                                if ("audio/eac3".equals(str4) && i24.endsWith("/JOC")) {
                                    rVar.j = "ec+3";
                                    str4 = "audio/eac3-joc";
                                }
                            }
                            rVar.q = r0.n(str4);
                            if (m11 != null) {
                                rVar.k = p0Var2;
                                arrayList20.add(new m(m11, new b2.s(rVar), j10));
                            } else {
                                arrayList2 = arrayList20;
                                if (nVar5 != null) {
                                    arrayList20 = arrayList2;
                                    sVar2 = new b2.s(rVar);
                                }
                                arrayList20 = arrayList2;
                            }
                            arrayList = arrayList21;
                            break;
                        case 3:
                            int i25 = 0;
                            while (true) {
                                if (i25 < arrayList9.size()) {
                                    nVar3 = (n) arrayList9.get(i25);
                                    if (!j3.equals(nVar3.c)) {
                                        i25++;
                                    }
                                } else {
                                    nVar3 = null;
                                }
                            }
                            if (nVar3 != null) {
                                b2.s sVar3 = nVar3.b;
                                String v12 = d0.v(2, sVar3.k);
                                rVar.j = v12;
                                rVar.q = r0.n(r0.d(v12));
                                rVar.x = sVar3.y;
                                rVar.y = sVar3.z;
                                rVar.B = sVar3.C;
                            }
                            if (m11 != null) {
                                rVar.k = p0Var2;
                                arrayList19.add(new m(m11, new b2.s(rVar), j10));
                            }
                            arrayList = arrayList21;
                            break;
                        default:
                            arrayList = arrayList21;
                            break;
                    }
                    i17 = i18 + 1;
                    str8 = str;
                    arrayList21 = arrayList;
                    arrayList24 = arrayList27;
                }
                ArrayList arrayList28 = arrayList24;
                ArrayList arrayList29 = arrayList21;
                if (z13) {
                    list = Collections.EMPTY_LIST;
                }
                return new o(str, arrayList22, arrayList28, arrayList19, arrayList20, arrayList29, arrayList17, sVar2, list, z14, hashMap4, arrayList23);
            }
            String K2 = tVar.K();
            if (K2.startsWith("#EXT")) {
                arrayList16.add(K2);
            }
            boolean startsWith = K2.startsWith("#EXT-X-I-FRAME-STREAM-INF");
            ArrayList arrayList30 = arrayList16;
            if (K2.startsWith("#EXT-X-DEFINE")) {
                hashMap4.put(j(K2, pattern2, hashMap4), j(K2, x0, hashMap4));
            } else if (K2.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                arrayList7 = arrayList14;
                arrayList6 = arrayList10;
                arrayList5 = arrayList11;
                arrayList4 = arrayList12;
                arrayList3 = arrayList15;
                z11 = z13;
                z12 = true;
                hashMap2 = hashMap3;
                hashMap3 = hashMap2;
                arrayList13 = arrayList17;
                arrayList16 = arrayList30;
                arrayList15 = arrayList3;
                arrayList12 = arrayList4;
                arrayList11 = arrayList5;
                arrayList10 = arrayList6;
                arrayList14 = arrayList7;
            } else if (K2.startsWith("#EXT-X-MEDIA")) {
                arrayList14.add(K2);
            } else if (K2.startsWith("#EXT-X-SESSION-KEY")) {
                b2.n c11 = c(K2, i(K2, g0, "identity", hashMap4), hashMap4);
                if (c11 != null) {
                    String j13 = j(K2, f0, hashMap4);
                    arrayList15.add(new b2.o(("SAMPLE-AES-CENC".equals(j13) || "SAMPLE-AES-CTR".equals(j13)) ? "cenc" : "cbcs", true, c11));
                }
            } else if (K2.startsWith("#EXT-X-STREAM-INF") || startsWith) {
                boolean contains = z13 | K2.contains("CLOSED-CAPTIONS=NONE");
                int i26 = startsWith ? 16384 : 0;
                arrayList3 = arrayList15;
                int parseInt2 = Integer.parseInt(j(K2, n, Collections.EMPTY_MAP));
                Matcher matcher = c.matcher(K2);
                if (matcher.find()) {
                    z10 = startsWith;
                    String group = matcher.group(1);
                    group.getClass();
                    i11 = Integer.parseInt(group);
                } else {
                    z10 = startsWith;
                    i11 = -1;
                }
                arrayList4 = arrayList12;
                String i27 = i(K2, s, null, hashMap4);
                arrayList5 = arrayList11;
                String i28 = i(K2, v, null, hashMap4);
                arrayList6 = arrayList10;
                String i29 = i(K2, w, null, hashMap4);
                if (i29 != null) {
                    String str12 = d0.a;
                    String[] split2 = i29.split(",", 2)[0].split("/", -1);
                    str5 = split2[0];
                    if (split2.length > 1) {
                        str6 = split2[1];
                        arrayList7 = arrayList14;
                        i12 = 2;
                        v9 = d0.v(i12, i28);
                        if (r0.j(v9, str5) && (str5 == null || (i27 != null && str6 != null && ((!i27.equals("PQ") || str6.equals("db1p")) && ((!i27.equals("SDR") || str6.equals("db2g")) && (!i27.equals("HLG") || str6.startsWith("db4"))))))) {
                            if (str5 == null) {
                                str5 = v9;
                            }
                            b02 = d0.b0(i28);
                            if (b02.length != 0) {
                                StringBuilder sb3 = new StringBuilder();
                                int length = b02.length;
                                int i30 = 0;
                                while (i30 < length) {
                                    String str13 = b02[i30];
                                    String[] strArr = b02;
                                    int i31 = length;
                                    if (2 != r0.h(r0.d(str13))) {
                                        if (sb3.length() > 0) {
                                            sb3.append(",");
                                        }
                                        sb3.append(str13);
                                    }
                                    i30++;
                                    length = i31;
                                    b02 = strArr;
                                }
                                if (sb3.length() > 0) {
                                    sb2 = sb3.toString();
                                    i28 = sb2 != null ? a4.a.C(str5, ",", sb2) : str5;
                                }
                            }
                            sb2 = null;
                            if (sb2 != null) {
                            }
                        }
                        String i32 = i(K2, x, null, hashMap4);
                        boolean equals = TextUtils.equals(i(K2, y, null, hashMap4), "true");
                        String i33 = i(K2, E, null, hashMap4);
                        String i34 = i(K2, F, null, hashMap4);
                        String i35 = i(K2, G, null, hashMap4);
                        i13 = i(K2, H, null, hashMap4);
                        if (i13 == null) {
                            str7 = i33;
                            String[] split3 = i13.split("x", -1);
                            i15 = Integer.parseInt(split3[0]);
                            i14 = Integer.parseInt(split3[1]);
                            if (i15 > 0) {
                            }
                        } else {
                            str7 = i33;
                        }
                        i14 = -1;
                        i15 = -1;
                        String i36 = i(K2, I, null, hashMap4);
                        float parseFloat = i36 == null ? Float.parseFloat(i36) : -1.0f;
                        HashMap hashMap6 = hashMap3;
                        String i37 = i(K2, d, null, hashMap4);
                        String i38 = i(K2, e, null, hashMap4);
                        String i39 = i(K2, f, null, hashMap4);
                        String i40 = i(K2, h, null, hashMap4);
                        if (!z10) {
                            m10 = e2.a.m(str8, j(K2, pattern, hashMap4));
                        } else {
                            if (!tVar.F()) {
                                throw s0.b("#EXT-X-STREAM-INF must be followed by another line", null);
                            }
                            m10 = e2.a.m(str8, k(tVar.K(), hashMap4));
                        }
                        Uri uri2 = m10;
                        b2.r rVar2 = new b2.r();
                        rVar2.a = Integer.toString(arrayList9.size());
                        rVar2.p = r0.n("application/x-mpegURL");
                        rVar2.j = i28;
                        rVar2.q = r0.n(i32);
                        rVar2.h = i11;
                        rVar2.i = parseInt2;
                        rVar2.x = i15;
                        rVar2.y = i14;
                        rVar2.B = parseFloat;
                        rVar2.f = i26;
                        rVar2.l = equals;
                        rVar2.m = Long.parseLong(str7);
                        rVar2.n = i34;
                        rVar2.o = Integer.parseInt(i35);
                        arrayList9.add(new n(uri2, new b2.s(rVar2), i37, i38, i39, i40));
                        hashMap2 = hashMap6;
                        arrayList8 = (ArrayList) hashMap2.get(uri2);
                        if (arrayList8 == null) {
                            arrayList8 = new ArrayList();
                            hashMap2.put(uri2, arrayList8);
                        }
                        arrayList8.add(new o2.r(i11, i37, parseInt2, i38, i39, i40));
                        z11 = contains;
                        z12 = z14;
                        hashMap3 = hashMap2;
                        arrayList13 = arrayList17;
                        arrayList16 = arrayList30;
                        arrayList15 = arrayList3;
                        arrayList12 = arrayList4;
                        arrayList11 = arrayList5;
                        arrayList10 = arrayList6;
                        arrayList14 = arrayList7;
                    } else {
                        arrayList7 = arrayList14;
                        i12 = 2;
                    }
                } else {
                    arrayList7 = arrayList14;
                    i12 = 2;
                    str5 = null;
                }
                str6 = null;
                v9 = d0.v(i12, i28);
                if (r0.j(v9, str5)) {
                    if (str5 == null) {
                    }
                    b02 = d0.b0(i28);
                    if (b02.length != 0) {
                    }
                    sb2 = null;
                    if (sb2 != null) {
                    }
                }
                String i322 = i(K2, x, null, hashMap4);
                boolean equals2 = TextUtils.equals(i(K2, y, null, hashMap4), "true");
                String i332 = i(K2, E, null, hashMap4);
                String i342 = i(K2, F, null, hashMap4);
                String i352 = i(K2, G, null, hashMap4);
                i13 = i(K2, H, null, hashMap4);
                if (i13 == null) {
                }
                i14 = -1;
                i15 = -1;
                String i362 = i(K2, I, null, hashMap4);
                if (i362 == null) {
                }
                HashMap hashMap62 = hashMap3;
                String i372 = i(K2, d, null, hashMap4);
                String i382 = i(K2, e, null, hashMap4);
                String i392 = i(K2, f, null, hashMap4);
                String i402 = i(K2, h, null, hashMap4);
                if (!z10) {
                }
                Uri uri22 = m10;
                b2.r rVar22 = new b2.r();
                rVar22.a = Integer.toString(arrayList9.size());
                rVar22.p = r0.n("application/x-mpegURL");
                rVar22.j = i28;
                rVar22.q = r0.n(i322);
                rVar22.h = i11;
                rVar22.i = parseInt2;
                rVar22.x = i15;
                rVar22.y = i14;
                rVar22.B = parseFloat;
                rVar22.f = i26;
                rVar22.l = equals2;
                rVar22.m = Long.parseLong(str7);
                rVar22.n = i342;
                rVar22.o = Integer.parseInt(i352);
                arrayList9.add(new n(uri22, new b2.s(rVar22), i372, i382, i392, i402));
                hashMap2 = hashMap62;
                arrayList8 = (ArrayList) hashMap2.get(uri22);
                if (arrayList8 == null) {
                }
                arrayList8.add(new o2.r(i11, i372, parseInt2, i382, i392, i402));
                z11 = contains;
                z12 = z14;
                hashMap3 = hashMap2;
                arrayList13 = arrayList17;
                arrayList16 = arrayList30;
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
            z11 = z13;
            z12 = z14;
            hashMap2 = hashMap3;
            hashMap3 = hashMap2;
            arrayList13 = arrayList17;
            arrayList16 = arrayList30;
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

    public static double g(String str, Pattern pattern, double d10) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return d10;
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
        throw s0.b("Couldn't match " + pattern.pattern() + " in " + str, null);
    }

    public static String k(String str, Map map) {
        Matcher matcher = P0.matcher(str);
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
    @Override // y2.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f2(Uri uri, g2.k kVar) {
        String trim;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(kVar));
        ArrayDeque arrayDeque = new ArrayDeque();
        try {
            int read = bufferedReader.read();
            boolean z10 = false;
            if (read == 239) {
                if (bufferedReader.read() == 187 && bufferedReader.read() == 191) {
                    read = bufferedReader.read();
                }
                if (z10) {
                    throw s0.b("Input does not start with the #EXTM3U header.", null);
                }
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException unused) {
                        }
                        throw s0.b("Failed to parse the playlist, could not identify any tags.", null);
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
                            o e7 = e(new m2.t(arrayDeque, bufferedReader), uri.toString());
                            try {
                                bufferedReader.close();
                            } catch (IOException unused2) {
                            }
                            return e7;
                        }
                    }
                }
                arrayDeque.add(trim);
                l d10 = d(this.a, this.b, new m2.t(arrayDeque, bufferedReader), uri.toString());
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
                    while (read != -1 && Character.isWhitespace(read) && !d0.M(read)) {
                        read = bufferedReader.read();
                    }
                    z10 = d0.M(read);
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
            String str = d0.a;
            try {
                bufferedReader.close();
            } catch (IOException unused4) {
            }
        }
    }
}
