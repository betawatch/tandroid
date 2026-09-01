package q5;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.cast.MediaInfo;
import j7.g5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import k7.f8;
import oh.h4;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class q extends c6.a {
    public static final Parcelable.Creator<q> CREATOR;
    public JSONObject B;
    public int C;
    public boolean E;
    public c F;
    public u G;
    public j H;
    public n I;
    public boolean J;
    public MediaInfo a;
    public long b;
    public int c;
    public double d;
    public int e;
    public int f;
    public long h;
    public long n;
    public double r;
    public boolean s;
    public long[] v;
    public int w;
    public int x;
    public String y;
    public final ArrayList D = new ArrayList();
    public final SparseArray K = new SparseArray();

    static {
        b6.m.g("MediaStatus", "The log tag cannot be null or empty.");
        TextUtils.isEmpty(null);
        CREATOR = new v(15);
    }

    public q(MediaInfo mediaInfo, long j10, int i10, double d, int i11, int i12, long j11, long j12, double d10, boolean z4, long[] jArr, int i13, int i14, String str, int i15, ArrayList arrayList, boolean z10, c cVar, u uVar, j jVar, n nVar) {
        this.a = mediaInfo;
        this.b = j10;
        this.c = i10;
        this.d = d;
        this.e = i11;
        this.f = i12;
        this.h = j11;
        this.n = j12;
        this.r = d10;
        this.s = z4;
        this.v = jArr;
        this.w = i13;
        this.x = i14;
        this.y = str;
        if (str != null) {
            try {
                this.B = new JSONObject(this.y);
            } catch (JSONException unused) {
                this.B = null;
                this.y = null;
            }
        } else {
            this.B = null;
        }
        this.C = i15;
        if (arrayList != null && !arrayList.isEmpty()) {
            f(arrayList);
        }
        this.E = z10;
        this.F = cVar;
        this.G = uVar;
        this.H = jVar;
        this.I = nVar;
        boolean z11 = false;
        if (nVar != null && nVar.s) {
            z11 = true;
        }
        this.J = z11;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0248, code lost:
    
        if (r12 != 3) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x024b, code lost:
    
        if (r2 != 2) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x024e, code lost:
    
        if (r13 == 0) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:378:0x01b6, code lost:
    
        if (r34.v != null) goto L111;
     */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x03b8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x045e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x048a  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x065f  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x06bc  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0563  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x059e  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x05a7  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0592  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0653  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x03e4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:314:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0396 A[Catch: JSONException -> 0x03a2, TryCatch #0 {JSONException -> 0x03a2, blocks: (B:319:0x036f, B:321:0x0396, B:322:0x0398), top: B:318:0x036f }] */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int e(int i10, JSONObject jSONObject) {
        JSONObject jSONObject2;
        long j10;
        int i11;
        double d;
        JSONArray jSONArray;
        long[] jArr;
        int optInt;
        int optInt2;
        int i12;
        boolean z4;
        int i13;
        MediaInfo mediaInfo;
        int i14;
        JSONObject optJSONObject;
        long optLong;
        c cVar;
        c cVar2;
        JSONObject optJSONObject2;
        u uVar;
        int i15;
        u uVar2;
        int i16;
        int i17;
        j jVar;
        int i18;
        String a2;
        String str;
        String str2;
        int i19;
        m mVar;
        ArrayList arrayList;
        boolean optBoolean;
        ArrayList arrayList2;
        int i20;
        int i21;
        String str3;
        String str4;
        int i22;
        JSONArray optJSONArray;
        ArrayList arrayList3;
        JSONArray optJSONArray2;
        ArrayList arrayList4;
        String str5;
        MediaInfo mediaInfo2;
        int i23;
        JSONObject optJSONObject3 = jSONObject.optJSONObject("extendedStatus");
        if (optJSONObject3 != null) {
            try {
                ArrayList arrayList5 = new ArrayList();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    arrayList5.add(keys.next());
                }
                jSONObject2 = new JSONObject(jSONObject, (String[]) arrayList5.toArray(new String[0]));
                Iterator<String> keys2 = optJSONObject3.keys();
                while (keys2.hasNext()) {
                    String next = keys2.next();
                    jSONObject2.put(next, optJSONObject3.get(next));
                }
                jSONObject2.remove("extendedStatus");
            } catch (JSONException unused) {
            }
            j10 = jSONObject2.getLong("mediaSessionId");
            if (j10 == this.b) {
                this.b = j10;
                i11 = 1;
            } else {
                i11 = 0;
            }
            if (jSONObject2.has("playerState")) {
                String string = jSONObject2.getString("playerState");
                int i24 = string.equals("IDLE") ? 1 : string.equals("PLAYING") ? 2 : string.equals("PAUSED") ? 3 : string.equals("BUFFERING") ? 4 : string.equals("LOADING") ? 5 : 0;
                if (i24 != this.e) {
                    this.e = i24;
                    i11 |= 2;
                }
                if (i24 == 1 && jSONObject2.has("idleReason")) {
                    String string2 = jSONObject2.getString("idleReason");
                    int i25 = string2.equals("CANCELLED") ? 2 : string2.equals("INTERRUPTED") ? 3 : string2.equals("FINISHED") ? 1 : string2.equals("ERROR") ? 4 : 0;
                    if (i25 != this.f) {
                        this.f = i25;
                        i11 |= 2;
                    }
                }
            }
            if (jSONObject2.has("playbackRate")) {
                double d10 = jSONObject2.getDouble("playbackRate");
                if (this.d != d10) {
                    this.d = d10;
                    i11 |= 2;
                }
            }
            if (jSONObject2.has("currentTime")) {
                double d11 = jSONObject2.getDouble("currentTime");
                Pattern pattern = u5.a.a;
                long j11 = (long) (d11 * 1000.0d);
                if (j11 != this.h) {
                    this.h = j11;
                    i11 |= 2;
                }
                i11 |= 128;
            }
            if (jSONObject2.has("supportedMediaCommands")) {
                long j12 = jSONObject2.getLong("supportedMediaCommands");
                if (j12 != this.n) {
                    this.n = j12;
                    i11 |= 2;
                }
            }
            if (jSONObject2.has("volume") || i10 != 0) {
                d = 1000.0d;
            } else {
                JSONObject jSONObject3 = jSONObject2.getJSONObject("volume");
                double d12 = jSONObject3.getDouble("level");
                d = 1000.0d;
                if (d12 != this.r) {
                    this.r = d12;
                    i11 |= 2;
                }
                boolean z10 = jSONObject3.getBoolean("muted");
                if (z10 != this.s) {
                    this.s = z10;
                    i11 |= 2;
                }
            }
            jSONArray = !jSONObject2.has("activeTrackIds") ? jSONObject2.getJSONArray("activeTrackIds") : null;
            Pattern pattern2 = u5.a.a;
            if (jSONArray != null) {
                jArr = null;
            } else {
                jArr = new long[jSONArray.length()];
                for (int i26 = 0; i26 < jSONArray.length(); i26++) {
                    jArr[i26] = jSONArray.getLong(i26);
                }
            }
            if (jArr == null) {
                long[] jArr2 = this.v;
                if (jArr2 != null && jArr2.length == jArr.length) {
                    for (int i27 = 0; i27 < jArr.length; i27++) {
                        if (this.v[i27] == jArr[i27]) {
                        }
                    }
                }
                this.v = jArr;
                i11 |= 2;
                break;
            }
            if (jSONObject2.has("customData")) {
                this.B = jSONObject2.getJSONObject("customData");
                this.y = null;
                i11 |= 2;
            }
            if (jSONObject2.has("media")) {
                JSONObject jSONObject4 = jSONObject2.getJSONObject("media");
                MediaInfo mediaInfo3 = new MediaInfo(jSONObject4);
                MediaInfo mediaInfo4 = this.a;
                if (mediaInfo4 == null || !mediaInfo4.equals(mediaInfo3)) {
                    this.a = mediaInfo3;
                    i11 |= 2;
                }
                if (jSONObject4.has("metadata")) {
                    i11 |= 4;
                }
            }
            if (jSONObject2.has("currentItemId") && this.c != (i23 = jSONObject2.getInt("currentItemId"))) {
                this.c = i23;
                i11 |= 2;
            }
            optInt = jSONObject2.optInt("preloadedItemId", 0);
            if (this.x != optInt) {
                this.x = optInt;
                i11 |= 16;
            }
            optInt2 = jSONObject2.optInt("loadingItemId", 0);
            if (this.w != optInt2) {
                this.w = optInt2;
                i11 |= 2;
            }
            MediaInfo mediaInfo5 = this.a;
            int i28 = mediaInfo5 != null ? -1 : mediaInfo5.b;
            i12 = this.e;
            int i29 = this.f;
            int i30 = this.w;
            SparseArray sparseArray = this.K;
            ArrayList arrayList6 = this.D;
            double d13 = d;
            if (i12 == 1) {
                if (i29 != 1) {
                    if (i29 != 2) {
                    }
                    this.c = 0;
                    this.w = 0;
                    this.x = 0;
                    if (arrayList6.isEmpty()) {
                        i14 = i11;
                        optJSONObject = jSONObject2.optJSONObject("breakStatus");
                        Parcelable.Creator<c> creator = c.CREATOR;
                        long j13 = -1;
                        if (optJSONObject != null) {
                            long j14 = optJSONObject.getLong("currentBreakTime");
                            Pattern pattern3 = u5.a.a;
                            long j15 = j14 * 1000;
                            long j16 = optJSONObject.getLong("currentBreakClipTime") * 1000;
                            String a10 = u5.a.a("breakId", optJSONObject);
                            String a11 = u5.a.a("breakClipId", optJSONObject);
                            optLong = optJSONObject.optLong("whenSkippable", -1L);
                            if (optLong != -1) {
                            }
                            cVar = new c(j15, j16, a10, a11, optLong);
                            cVar2 = this.F;
                            if (cVar2 == null) {
                            }
                            this.E = cVar == null && !(cVar.c == null && cVar.d == null);
                            this.F = cVar;
                            i14 |= 32;
                            optJSONObject2 = jSONObject2.optJSONObject("videoInfo");
                            u5.b bVar = u.d;
                            if (optJSONObject2 != null) {
                            }
                            uVar2 = this.G;
                            if (uVar2 == null) {
                            }
                            this.G = uVar;
                            i14 |= 64;
                            if (jSONObject2.has("breakInfo")) {
                            }
                            if (jSONObject2.has("queueData")) {
                            }
                            i17 = i16;
                            if (jSONObject2.has("liveSeekableRange")) {
                            }
                            return i17;
                        }
                        cVar = null;
                        cVar2 = this.F;
                        if (cVar2 == null) {
                        }
                        this.E = cVar == null && !(cVar.c == null && cVar.d == null);
                        this.F = cVar;
                        i14 |= 32;
                        optJSONObject2 = jSONObject2.optJSONObject("videoInfo");
                        u5.b bVar2 = u.d;
                        if (optJSONObject2 != null) {
                        }
                        uVar2 = this.G;
                        if (uVar2 == null) {
                        }
                        this.G = uVar;
                        i14 |= 64;
                        if (jSONObject2.has("breakInfo")) {
                        }
                        if (jSONObject2.has("queueData")) {
                        }
                        i17 = i16;
                        if (jSONObject2.has("liveSeekableRange")) {
                        }
                        return i17;
                    }
                    this.C = 0;
                    arrayList6.clear();
                    sparseArray.clear();
                    i14 = i11 | 8;
                    optJSONObject = jSONObject2.optJSONObject("breakStatus");
                    Parcelable.Creator<c> creator2 = c.CREATOR;
                    long j132 = -1;
                    if (optJSONObject != null && optJSONObject.has("currentBreakTime") && optJSONObject.has("currentBreakClipTime")) {
                        try {
                            long j142 = optJSONObject.getLong("currentBreakTime");
                            Pattern pattern32 = u5.a.a;
                            long j152 = j142 * 1000;
                            long j162 = optJSONObject.getLong("currentBreakClipTime") * 1000;
                            String a102 = u5.a.a("breakId", optJSONObject);
                            String a112 = u5.a.a("breakClipId", optJSONObject);
                            optLong = optJSONObject.optLong("whenSkippable", -1L);
                            if (optLong != -1) {
                                optLong *= 1000;
                            }
                            cVar = new c(j152, j162, a102, a112, optLong);
                        } catch (JSONException e6) {
                            u5.b bVar3 = c.f;
                            Log.e(bVar3.a, bVar3.d("Error while creating an AdBreakClipInfo from JSON", new Object[0]), e6);
                        }
                        cVar2 = this.F;
                        if ((cVar2 == null && cVar != null) || (cVar2 != null && !cVar2.equals(cVar))) {
                            this.E = cVar == null && !(cVar.c == null && cVar.d == null);
                            this.F = cVar;
                            i14 |= 32;
                        }
                        optJSONObject2 = jSONObject2.optJSONObject("videoInfo");
                        u5.b bVar22 = u.d;
                        if (optJSONObject2 != null) {
                            uVar = null;
                        } else {
                            try {
                                String string3 = optJSONObject2.getString("hdrType");
                                int hashCode = string3.hashCode();
                                if (hashCode == 3218) {
                                    if (string3.equals("dv")) {
                                        i15 = 3;
                                        uVar = new u(optJSONObject2.getInt("width"), optJSONObject2.getInt("height"), i15);
                                    }
                                    bVar22.b("Unknown HDR type: %s", string3);
                                    i15 = 0;
                                    uVar = new u(optJSONObject2.getInt("width"), optJSONObject2.getInt("height"), i15);
                                } else if (hashCode == 103158) {
                                    if (string3.equals("hdr")) {
                                        i15 = 4;
                                        uVar = new u(optJSONObject2.getInt("width"), optJSONObject2.getInt("height"), i15);
                                    }
                                    bVar22.b("Unknown HDR type: %s", string3);
                                    i15 = 0;
                                    uVar = new u(optJSONObject2.getInt("width"), optJSONObject2.getInt("height"), i15);
                                } else if (hashCode != 113729) {
                                    try {
                                        if (hashCode == 99136405 && string3.equals("hdr10")) {
                                            i15 = 2;
                                            uVar = new u(optJSONObject2.getInt("width"), optJSONObject2.getInt("height"), i15);
                                        }
                                        bVar22.b("Unknown HDR type: %s", string3);
                                        i15 = 0;
                                        uVar = new u(optJSONObject2.getInt("width"), optJSONObject2.getInt("height"), i15);
                                    } catch (JSONException e10) {
                                        e = e10;
                                        bVar22.a(e, "Error while creating a VideoInfo instance from JSON", new Object[0]);
                                        uVar = null;
                                        uVar2 = this.G;
                                        if (uVar2 == null) {
                                        }
                                        this.G = uVar;
                                        i14 |= 64;
                                        if (jSONObject2.has("breakInfo")) {
                                        }
                                        if (jSONObject2.has("queueData")) {
                                        }
                                        i17 = i16;
                                        if (jSONObject2.has("liveSeekableRange")) {
                                        }
                                        return i17;
                                    }
                                } else {
                                    if (string3.equals("sdr")) {
                                        i15 = 1;
                                        uVar = new u(optJSONObject2.getInt("width"), optJSONObject2.getInt("height"), i15);
                                    }
                                    bVar22.b("Unknown HDR type: %s", string3);
                                    i15 = 0;
                                    uVar = new u(optJSONObject2.getInt("width"), optJSONObject2.getInt("height"), i15);
                                }
                            } catch (JSONException e11) {
                                e = e11;
                            }
                        }
                        uVar2 = this.G;
                        if ((uVar2 == null && uVar != null) || (uVar2 != null && !uVar2.equals(uVar))) {
                            this.G = uVar;
                            i14 |= 64;
                        }
                        if (jSONObject2.has("breakInfo") && (mediaInfo2 = this.a) != null) {
                            mediaInfo2.f(jSONObject2.getJSONObject("breakInfo"));
                            i14 |= 2;
                        }
                        if (jSONObject2.has("queueData")) {
                            i16 = i14;
                        } else {
                            JSONObject jSONObject5 = jSONObject2.getJSONObject("queueData");
                            if (jSONObject5 == null) {
                                i16 = i14;
                                arrayList2 = null;
                                mVar = null;
                                str4 = null;
                                str3 = null;
                                i21 = 0;
                                i20 = 0;
                                optBoolean = false;
                                a2 = null;
                                i19 = 0;
                            } else {
                                String a12 = u5.a.a("id", jSONObject5);
                                String a13 = u5.a.a("entity", jSONObject5);
                                String optString = jSONObject5.optString("queueType");
                                switch (optString.hashCode()) {
                                    case -1803151310:
                                        if (optString.equals("PODCAST_SERIES")) {
                                            i18 = 5;
                                            break;
                                        }
                                        i18 = 0;
                                        break;
                                    case -1758903120:
                                        if (optString.equals("RADIO_STATION")) {
                                            i18 = 4;
                                            break;
                                        }
                                        i18 = 0;
                                        break;
                                    case -1632865838:
                                        if (optString.equals("PLAYLIST")) {
                                            i18 = 2;
                                            break;
                                        }
                                        i18 = 0;
                                        break;
                                    case -1319760993:
                                        if (optString.equals("AUDIOBOOK")) {
                                            i18 = 3;
                                            break;
                                        }
                                        i18 = 0;
                                        break;
                                    case -1088524588:
                                        if (optString.equals("TV_SERIES")) {
                                            i18 = 6;
                                            break;
                                        }
                                        i18 = 0;
                                        break;
                                    case 62359119:
                                        if (optString.equals("ALBUM")) {
                                            i18 = 1;
                                            break;
                                        }
                                        i18 = 0;
                                        break;
                                    case 73549584:
                                        if (optString.equals("MOVIE")) {
                                            i18 = 9;
                                            break;
                                        }
                                        i18 = 0;
                                        break;
                                    case 393100598:
                                        if (optString.equals("VIDEO_PLAYLIST")) {
                                            i18 = 7;
                                            break;
                                        }
                                        i18 = 0;
                                        break;
                                    case 902303413:
                                        if (optString.equals("LIVE_TV")) {
                                            i18 = 8;
                                            break;
                                        }
                                        i18 = 0;
                                        break;
                                    default:
                                        i18 = 0;
                                        break;
                                }
                                a2 = u5.a.a("name", jSONObject5);
                                JSONObject optJSONObject4 = jSONObject5.has("containerMetadata") ? jSONObject5.optJSONObject("containerMetadata") : null;
                                if (optJSONObject4 != null) {
                                    String optString2 = optJSONObject4.optString("containerType", "");
                                    int hashCode2 = optString2.hashCode();
                                    if (hashCode2 != 6924225) {
                                        if (hashCode2 == 828666841) {
                                            optString2.equals("GENERIC_CONTAINER");
                                        }
                                    } else if (optString2.equals("AUDIOBOOK_CONTAINER")) {
                                        i22 = 1;
                                        String a14 = u5.a.a("title", optJSONObject4);
                                        optJSONArray = optJSONObject4.optJSONArray("sections");
                                        if (optJSONArray == null) {
                                            arrayList3 = new ArrayList();
                                            i16 = i14;
                                            int i31 = 0;
                                            while (i31 < optJSONArray.length()) {
                                                JSONObject optJSONObject5 = optJSONArray.optJSONObject(i31);
                                                int i32 = i31;
                                                if (optJSONObject5 != null) {
                                                    str5 = a12;
                                                    l lVar = new l(0);
                                                    lVar.h(optJSONObject5);
                                                    arrayList3.add(lVar);
                                                } else {
                                                    str5 = a12;
                                                }
                                                i31 = i32 + 1;
                                                a12 = str5;
                                            }
                                        } else {
                                            i16 = i14;
                                            arrayList3 = null;
                                        }
                                        str = a12;
                                        optJSONArray2 = optJSONObject4.optJSONArray("containerImages");
                                        if (optJSONArray2 == null) {
                                            arrayList4 = new ArrayList();
                                            v5.a.c(arrayList4, optJSONArray2);
                                        } else {
                                            arrayList4 = null;
                                        }
                                        str2 = a13;
                                        i19 = i18;
                                        double optDouble = optJSONObject4.optDouble("containerDuration", 0.0d);
                                        mVar = new m();
                                        mVar.a = i22;
                                        mVar.b = a14;
                                        mVar.c = arrayList3;
                                        mVar.d = arrayList4;
                                        mVar.e = optDouble;
                                    }
                                    i22 = 0;
                                    String a142 = u5.a.a("title", optJSONObject4);
                                    optJSONArray = optJSONObject4.optJSONArray("sections");
                                    if (optJSONArray == null) {
                                    }
                                    str = a12;
                                    optJSONArray2 = optJSONObject4.optJSONArray("containerImages");
                                    if (optJSONArray2 == null) {
                                    }
                                    str2 = a13;
                                    i19 = i18;
                                    double optDouble2 = optJSONObject4.optDouble("containerDuration", 0.0d);
                                    mVar = new m();
                                    mVar.a = i22;
                                    mVar.b = a142;
                                    mVar.c = arrayList3;
                                    mVar.d = arrayList4;
                                    mVar.e = optDouble2;
                                } else {
                                    i16 = i14;
                                    str = a12;
                                    str2 = a13;
                                    i19 = i18;
                                    mVar = null;
                                }
                                Integer a15 = f8.a(jSONObject5.optString("repeatMode"));
                                int intValue = a15 != null ? a15.intValue() : 0;
                                JSONArray optJSONArray3 = jSONObject5.optJSONArray("items");
                                if (optJSONArray3 != null) {
                                    arrayList = new ArrayList();
                                    for (int i33 = 0; i33 < optJSONArray3.length(); i33++) {
                                        JSONObject optJSONObject6 = optJSONArray3.optJSONObject(i33);
                                        if (optJSONObject6 != null) {
                                            try {
                                                arrayList.add(new o(optJSONObject6));
                                            } catch (JSONException unused2) {
                                            }
                                        }
                                    }
                                } else {
                                    arrayList = null;
                                }
                                int optInt3 = jSONObject5.optInt("startIndex", 0);
                                long optDouble3 = jSONObject5.has("startTime") ? (long) (jSONObject5.optDouble("startTime", -1L) * d13) : -1L;
                                optBoolean = jSONObject5.optBoolean("shuffle");
                                arrayList2 = arrayList;
                                long j17 = optDouble3;
                                i20 = optInt3;
                                i21 = intValue;
                                j132 = j17;
                                str3 = str2;
                                str4 = str;
                            }
                            n nVar = new n();
                            nVar.a = str4;
                            nVar.b = str3;
                            nVar.c = i19;
                            nVar.d = a2;
                            nVar.e = mVar;
                            nVar.f = i21;
                            nVar.h = arrayList2;
                            nVar.n = i20;
                            nVar.r = j132;
                            nVar.s = optBoolean;
                            this.I = nVar;
                            if (this.J != optBoolean) {
                                this.J = optBoolean;
                                i17 = i16 | 8;
                                if (jSONObject2.has("liveSeekableRange")) {
                                    i17 |= 2;
                                    JSONObject optJSONObject7 = jSONObject2.optJSONObject("liveSeekableRange");
                                    Parcelable.Creator<j> creator3 = j.CREATOR;
                                    if (optJSONObject7 != null && optJSONObject7.has("start") && optJSONObject7.has("end")) {
                                        try {
                                            double d14 = optJSONObject7.getDouble("start");
                                            Pattern pattern4 = u5.a.a;
                                            jVar = new j((long) (d14 * d13), (long) (optJSONObject7.getDouble("end") * d13), optJSONObject7.optBoolean("isMovingWindow"), optJSONObject7.optBoolean("isLiveDone"));
                                        } catch (JSONException unused3) {
                                            u5.b bVar4 = j.e;
                                            Log.e(bVar4.a, bVar4.d("Ignoring Malformed MediaLiveSeekableRange: ".concat(optJSONObject7.toString()), new Object[0]));
                                        }
                                        this.H = jVar;
                                    }
                                    jVar = null;
                                    this.H = jVar;
                                } else {
                                    if (this.H != null) {
                                        i17 |= 2;
                                    }
                                    this.H = null;
                                }
                                return i17;
                            }
                        }
                        i17 = i16;
                        if (jSONObject2.has("liveSeekableRange")) {
                        }
                        return i17;
                    }
                    cVar = null;
                    cVar2 = this.F;
                    if (cVar2 == null) {
                        this.E = cVar == null && !(cVar.c == null && cVar.d == null);
                        this.F = cVar;
                        i14 |= 32;
                        optJSONObject2 = jSONObject2.optJSONObject("videoInfo");
                        u5.b bVar222 = u.d;
                        if (optJSONObject2 != null) {
                        }
                        uVar2 = this.G;
                        if (uVar2 == null) {
                            this.G = uVar;
                            i14 |= 64;
                            if (jSONObject2.has("breakInfo")) {
                                mediaInfo2.f(jSONObject2.getJSONObject("breakInfo"));
                                i14 |= 2;
                            }
                            if (jSONObject2.has("queueData")) {
                            }
                            i17 = i16;
                            if (jSONObject2.has("liveSeekableRange")) {
                            }
                            return i17;
                        }
                        this.G = uVar;
                        i14 |= 64;
                        if (jSONObject2.has("breakInfo")) {
                        }
                        if (jSONObject2.has("queueData")) {
                        }
                        i17 = i16;
                        if (jSONObject2.has("liveSeekableRange")) {
                        }
                        return i17;
                    }
                    this.E = cVar == null && !(cVar.c == null && cVar.d == null);
                    this.F = cVar;
                    i14 |= 32;
                    optJSONObject2 = jSONObject2.optJSONObject("videoInfo");
                    u5.b bVar2222 = u.d;
                    if (optJSONObject2 != null) {
                    }
                    uVar2 = this.G;
                    if (uVar2 == null) {
                    }
                    this.G = uVar;
                    i14 |= 64;
                    if (jSONObject2.has("breakInfo")) {
                    }
                    if (jSONObject2.has("queueData")) {
                    }
                    i17 = i16;
                    if (jSONObject2.has("liveSeekableRange")) {
                    }
                    return i17;
                }
            }
            if (jSONObject2.has("repeatMode")) {
                Integer a16 = f8.a(jSONObject2.getString("repeatMode"));
                int intValue2 = a16 == null ? this.C : a16.intValue();
                if (this.C != intValue2) {
                    this.C = intValue2;
                    z4 = true;
                    if (jSONObject2.has("items")) {
                        JSONArray jSONArray2 = jSONObject2.getJSONArray("items");
                        int length = jSONArray2.length();
                        SparseArray sparseArray2 = new SparseArray();
                        for (int i34 = 0; i34 < length; i34++) {
                            sparseArray2.put(i34, Integer.valueOf(jSONArray2.getJSONObject(i34).getInt("itemId")));
                        }
                        ArrayList arrayList7 = new ArrayList();
                        while (i13 < length) {
                            Integer num = (Integer) sparseArray2.get(i13);
                            JSONObject jSONObject6 = jSONArray2.getJSONObject(i13);
                            Integer num2 = (Integer) sparseArray.get(num.intValue());
                            o oVar = num2 == null ? null : (o) arrayList6.get(num2.intValue());
                            if (oVar != null) {
                                z4 |= oVar.e(jSONObject6);
                                arrayList7.add(oVar);
                                i13 = i13 == ((Integer) sparseArray.get(num.intValue())).intValue() ? i13 + 1 : 0;
                            } else if (num.intValue() != this.c || (mediaInfo = this.a) == null) {
                                arrayList7.add(new o(jSONObject6));
                            } else {
                                o M = new h4(mediaInfo).M();
                                M.e(jSONObject6);
                                arrayList7.add(M);
                            }
                            z4 = true;
                        }
                        z4 |= !(arrayList6.size() == length);
                        f(arrayList7);
                    }
                    if (z4) {
                        i11 |= 8;
                    }
                    i14 = i11;
                    optJSONObject = jSONObject2.optJSONObject("breakStatus");
                    Parcelable.Creator<c> creator22 = c.CREATOR;
                    long j1322 = -1;
                    if (optJSONObject != null) {
                    }
                    cVar = null;
                    cVar2 = this.F;
                    if (cVar2 == null) {
                    }
                    this.E = cVar == null && !(cVar.c == null && cVar.d == null);
                    this.F = cVar;
                    i14 |= 32;
                    optJSONObject2 = jSONObject2.optJSONObject("videoInfo");
                    u5.b bVar22222 = u.d;
                    if (optJSONObject2 != null) {
                    }
                    uVar2 = this.G;
                    if (uVar2 == null) {
                    }
                    this.G = uVar;
                    i14 |= 64;
                    if (jSONObject2.has("breakInfo")) {
                    }
                    if (jSONObject2.has("queueData")) {
                    }
                    i17 = i16;
                    if (jSONObject2.has("liveSeekableRange")) {
                    }
                    return i17;
                }
            }
            z4 = false;
            if (jSONObject2.has("items")) {
            }
            if (z4) {
            }
            i14 = i11;
            optJSONObject = jSONObject2.optJSONObject("breakStatus");
            Parcelable.Creator<c> creator222 = c.CREATOR;
            long j13222 = -1;
            if (optJSONObject != null) {
            }
            cVar = null;
            cVar2 = this.F;
            if (cVar2 == null) {
            }
            this.E = cVar == null && !(cVar.c == null && cVar.d == null);
            this.F = cVar;
            i14 |= 32;
            optJSONObject2 = jSONObject2.optJSONObject("videoInfo");
            u5.b bVar222222 = u.d;
            if (optJSONObject2 != null) {
            }
            uVar2 = this.G;
            if (uVar2 == null) {
            }
            this.G = uVar;
            i14 |= 64;
            if (jSONObject2.has("breakInfo")) {
            }
            if (jSONObject2.has("queueData")) {
            }
            i17 = i16;
            if (jSONObject2.has("liveSeekableRange")) {
            }
            return i17;
        }
        jSONObject2 = jSONObject;
        j10 = jSONObject2.getLong("mediaSessionId");
        if (j10 == this.b) {
        }
        if (jSONObject2.has("playerState")) {
        }
        if (jSONObject2.has("playbackRate")) {
        }
        if (jSONObject2.has("currentTime")) {
        }
        if (jSONObject2.has("supportedMediaCommands")) {
        }
        if (jSONObject2.has("volume")) {
        }
        d = 1000.0d;
        if (!jSONObject2.has("activeTrackIds")) {
        }
        Pattern pattern22 = u5.a.a;
        if (jSONArray != null) {
        }
        if (jArr == null) {
        }
        if (jSONObject2.has("customData")) {
        }
        if (jSONObject2.has("media")) {
        }
        if (jSONObject2.has("currentItemId")) {
            this.c = i23;
            i11 |= 2;
        }
        optInt = jSONObject2.optInt("preloadedItemId", 0);
        if (this.x != optInt) {
        }
        optInt2 = jSONObject2.optInt("loadingItemId", 0);
        if (this.w != optInt2) {
        }
        MediaInfo mediaInfo52 = this.a;
        if (mediaInfo52 != null) {
        }
        i12 = this.e;
        int i292 = this.f;
        int i302 = this.w;
        SparseArray sparseArray3 = this.K;
        ArrayList arrayList62 = this.D;
        double d132 = d;
        if (i12 == 1) {
        }
        if (jSONObject2.has("repeatMode")) {
        }
        z4 = false;
        if (jSONObject2.has("items")) {
        }
        if (z4) {
        }
        i14 = i11;
        optJSONObject = jSONObject2.optJSONObject("breakStatus");
        Parcelable.Creator<c> creator2222 = c.CREATOR;
        long j132222 = -1;
        if (optJSONObject != null) {
        }
        cVar = null;
        cVar2 = this.F;
        if (cVar2 == null) {
        }
        this.E = cVar == null && !(cVar.c == null && cVar.d == null);
        this.F = cVar;
        i14 |= 32;
        optJSONObject2 = jSONObject2.optJSONObject("videoInfo");
        u5.b bVar2222222 = u.d;
        if (optJSONObject2 != null) {
        }
        uVar2 = this.G;
        if (uVar2 == null) {
        }
        this.G = uVar;
        i14 |= 64;
        if (jSONObject2.has("breakInfo")) {
        }
        if (jSONObject2.has("queueData")) {
        }
        i17 = i16;
        if (jSONObject2.has("liveSeekableRange")) {
        }
        return i17;
    }

    public final boolean equals(Object obj) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        if (this != obj) {
            if (obj instanceof q) {
                q qVar = (q) obj;
                if ((this.B == null) == (qVar.B == null) && this.b == qVar.b && this.c == qVar.c && this.d == qVar.d && this.e == qVar.e && this.f == qVar.f && this.h == qVar.h && this.r == qVar.r && this.s == qVar.s && this.w == qVar.w && this.x == qVar.x && this.C == qVar.C && Arrays.equals(this.v, qVar.v) && u5.a.d(Long.valueOf(this.n), Long.valueOf(qVar.n)) && u5.a.d(this.D, qVar.D) && u5.a.d(this.a, qVar.a) && (((jSONObject = this.B) == null || (jSONObject2 = qVar.B) == null || i6.c.a(jSONObject, jSONObject2)) && this.E == qVar.E && u5.a.d(this.F, qVar.F) && u5.a.d(this.G, qVar.G) && u5.a.d(this.H, qVar.H) && b6.m.l(this.I, qVar.I) && this.J == qVar.J)) {
                }
            }
            return false;
        }
        return true;
    }

    public final void f(List list) {
        ArrayList arrayList = this.D;
        arrayList.clear();
        SparseArray sparseArray = this.K;
        sparseArray.clear();
        if (list != null) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                o oVar = (o) list.get(i10);
                arrayList.add(oVar);
                sparseArray.put(oVar.b, Integer.valueOf(i10));
            }
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Long.valueOf(this.b), Integer.valueOf(this.c), Double.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(this.f), Long.valueOf(this.h), Long.valueOf(this.n), Double.valueOf(this.r), Boolean.valueOf(this.s), Integer.valueOf(Arrays.hashCode(this.v)), Integer.valueOf(this.w), Integer.valueOf(this.x), String.valueOf(this.B), Integer.valueOf(this.C), this.D, Boolean.valueOf(this.E), this.F, this.G, this.H, this.I});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        JSONObject jSONObject = this.B;
        this.y = jSONObject == null ? null : jSONObject.toString();
        int q10 = g5.q(parcel, 20293);
        g5.k(parcel, 2, this.a, i10);
        long j10 = this.b;
        g5.s(parcel, 3, 8);
        parcel.writeLong(j10);
        int i11 = this.c;
        g5.s(parcel, 4, 4);
        parcel.writeInt(i11);
        double d = this.d;
        g5.s(parcel, 5, 8);
        parcel.writeDouble(d);
        int i12 = this.e;
        g5.s(parcel, 6, 4);
        parcel.writeInt(i12);
        int i13 = this.f;
        g5.s(parcel, 7, 4);
        parcel.writeInt(i13);
        long j11 = this.h;
        g5.s(parcel, 8, 8);
        parcel.writeLong(j11);
        long j12 = this.n;
        g5.s(parcel, 9, 8);
        parcel.writeLong(j12);
        double d10 = this.r;
        g5.s(parcel, 10, 8);
        parcel.writeDouble(d10);
        boolean z4 = this.s;
        g5.s(parcel, 11, 4);
        parcel.writeInt(z4 ? 1 : 0);
        g5.j(parcel, 12, this.v);
        int i14 = this.w;
        g5.s(parcel, 13, 4);
        parcel.writeInt(i14);
        int i15 = this.x;
        g5.s(parcel, 14, 4);
        parcel.writeInt(i15);
        g5.l(parcel, 15, this.y);
        int i16 = this.C;
        g5.s(parcel, 16, 4);
        parcel.writeInt(i16);
        g5.p(parcel, 17, this.D);
        boolean z10 = this.E;
        g5.s(parcel, 18, 4);
        parcel.writeInt(z10 ? 1 : 0);
        g5.k(parcel, 19, this.F, i10);
        g5.k(parcel, 20, this.G, i10);
        g5.k(parcel, 21, this.H, i10);
        g5.k(parcel, 22, this.I, i10);
        g5.r(parcel, q10);
    }
}
