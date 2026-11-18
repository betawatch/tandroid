package p5;

import a8.la;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.internal.cast.f4;
import com.google.android.gms.internal.vision.e2;
import e2.t;
import e2.u;
import f3.i0;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutorService;
import org.telegram.messenger.a8;
import org.telegram.messenger.ks;
import p1.g;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public abstract /* synthetic */ class c {
    public static boolean a(int i7) {
        if (i7 != 0) {
            return i7 == 3 || i7 == 4;
        }
        throw null;
    }

    public static int b(int i7) {
        int[] d = g.d(ks.K1);
        if (i7 < 0 || i7 >= d.length) {
            return 0;
        }
        return d[i7];
    }

    public static int c(String str) {
        if (str == null) {
            return 0;
        }
        try {
            return y(str);
        } catch (IllegalArgumentException unused) {
            return 0;
        }
    }

    public static /* synthetic */ String d(int i7) {
        switch (i7) {
            case 1:
                return "Blues";
            case 2:
                return "Classic Rock";
            case 3:
                return "Country";
            case 4:
                return "Dance";
            case 5:
                return "Disco";
            case 6:
                return "Funk";
            case 7:
                return "Grunge";
            case 8:
                return "Hip-Hop";
            case 9:
                return "Jazz";
            case 10:
                return "Metal";
            case 11:
                return "New Age";
            case 12:
                return "Oldies";
            case 13:
                return "Other";
            case 14:
                return "Pop";
            case 15:
                return "R&B";
            case 16:
                return "Rap";
            case 17:
                return "Reggae";
            case 18:
                return "Rock";
            case 19:
                return "Techno";
            case 20:
                return "Industrial";
            case 21:
                return "Alternative";
            case 22:
                return "Ska";
            case 23:
                return "Death Metal";
            case 24:
                return "Pranks";
            case 25:
                return "Soundtrack";
            case 26:
                return "Euro-Techno";
            case 27:
                return "Ambient";
            case 28:
                return "Trip-Hop";
            case 29:
                return "Vocal";
            case ks.T /* 30 */:
                return "Jazz+Funk";
            case ks.U /* 31 */:
                return "Fusion";
            case 32:
                return "Trance";
            case 33:
                return "Classical";
            case 34:
                return "Instrumental";
            case 35:
                return "Acid";
            case 36:
                return "House";
            case 37:
                return "Game";
            case 38:
                return "Sound Clip";
            case 39:
                return "Gospel";
            case 40:
                return "Noise";
            case 41:
                return "AlternRock";
            case 42:
                return "Bass";
            case 43:
                return "Soul";
            case 44:
                return "Punk";
            case 45:
                return "Space";
            case 46:
                return "Meditative";
            case 47:
                return "Instrumental Pop";
            case 48:
                return "Instrumental Rock";
            case 49:
                return "Ethnic";
            case 50:
                return "Gothic";
            case ks.o0 /* 51 */:
                return "Darkwave";
            case ks.p0 /* 52 */:
                return "Techno-Industrial";
            case ks.q0 /* 53 */:
                return "Electronic";
            case ks.r0 /* 54 */:
                return "Pop-Folk";
            case ks.s0 /* 55 */:
                return "Eurodance";
            case ks.t0 /* 56 */:
                return "Dream";
            case ks.u0 /* 57 */:
                return "Southern Rock";
            case ks.v0 /* 58 */:
                return "Comedy";
            case ks.w0 /* 59 */:
                return "Cult";
            case ks.x0 /* 60 */:
                return "Gangsta";
            case ks.y0 /* 61 */:
                return "Top 40";
            case ks.z0 /* 62 */:
                return "Christian Rap";
            case ks.A0 /* 63 */:
                return "Pop/Funk";
            case 64:
                return "Jungle";
            case 65:
                return "Native American";
            case ks.D0 /* 66 */:
                return "Cabaret";
            case ks.E0 /* 67 */:
                return "New Wave";
            case ks.F0 /* 68 */:
                return "Psychadelic";
            case ks.G0 /* 69 */:
                return "Rave";
            case ks.H0 /* 70 */:
                return "Showtunes";
            case ks.I0 /* 71 */:
                return "Trailer";
            case ks.J0 /* 72 */:
                return "Lo-Fi";
            case ks.K0 /* 73 */:
                return "Tribal";
            case ks.L0 /* 74 */:
                return "Acid Punk";
            case ks.M0 /* 75 */:
                return "Acid Jazz";
            case ks.N0 /* 76 */:
                return "Polka";
            case ks.O0 /* 77 */:
                return "Retro";
            case ks.P0 /* 78 */:
                return "Musical";
            case ks.Q0 /* 79 */:
                return "Rock & Roll";
            case 80:
                return "Hard Rock";
            case ks.S0 /* 81 */:
                return "Folk";
            case ks.T0 /* 82 */:
                return "Folk-Rock";
            case ks.U0 /* 83 */:
                return "National Folk";
            case ks.V0 /* 84 */:
                return "Swing";
            case ks.W0 /* 85 */:
                return "Fast Fusion";
            case ks.X0 /* 86 */:
                return "Bebop";
            case ks.Y0 /* 87 */:
                return "Latin";
            case ks.Z0 /* 88 */:
                return "Revival";
            case ks.a1 /* 89 */:
                return "Celtic";
            case ks.b1 /* 90 */:
                return "Bluegrass";
            case ks.c1 /* 91 */:
                return "Avantgarde";
            case ks.d1 /* 92 */:
                return "Gothic Rock";
            case ks.e1 /* 93 */:
                return "Progressive Rock";
            case ks.f1 /* 94 */:
                return "Psychedelic Rock";
            case ks.g1 /* 95 */:
                return "Symphonic Rock";
            case 96:
                return "Slow Rock";
            case ks.i1 /* 97 */:
                return "Big Band";
            case ks.j1 /* 98 */:
                return "Chorus";
            case ks.k1 /* 99 */:
                return "Easy Listening";
            case ks.l1 /* 100 */:
                return "Acoustic";
            case 101:
                return "Humour";
            case ks.n1 /* 102 */:
                return "Speech";
            case ks.o1 /* 103 */:
                return "Chanson";
            case ks.p1 /* 104 */:
                return "Opera";
            case ks.q1 /* 105 */:
                return "Chamber Music";
            case ks.r1 /* 106 */:
                return "Sonata";
            case ks.s1 /* 107 */:
                return "Symphony";
            case ks.t1 /* 108 */:
                return "Booty Bass";
            case ks.u1 /* 109 */:
                return "Primus";
            case ks.v1 /* 110 */:
                return "Porn Groove";
            case ks.w1 /* 111 */:
                return "Satire";
            case ks.x1 /* 112 */:
                return "Slow Jam";
            case ks.y1 /* 113 */:
                return "Club";
            case ks.z1 /* 114 */:
                return "Tango";
            case ks.A1 /* 115 */:
                return "Samba";
            case ks.B1 /* 116 */:
                return "Folklore";
            case ks.C1 /* 117 */:
                return "Ballad";
            case ks.D1 /* 118 */:
                return "Power Ballad";
            case ks.E1 /* 119 */:
                return "Rhythmic Soul";
            case 120:
                return "Freestyle";
            case ks.F1 /* 121 */:
                return "Duet";
            case ks.G1 /* 122 */:
                return "Punk Rock";
            case ks.H1 /* 123 */:
                return "Drum Solo";
            case ks.I1 /* 124 */:
                return "A capella";
            case ks.J1 /* 125 */:
                return "Euro-House";
            case ks.K1 /* 126 */:
                return "Dance Hall";
            default:
                throw null;
        }
    }

    public static float e(float f10, float f11, float f12, float f13) {
        return (f10 * f11) + f12 + f13;
    }

    public static Bundle f(int i7, String str) {
        Bundle bundle = new Bundle();
        bundle.putInt(str, i7);
        return bundle;
    }

    public static Object g(int i7, ArrayList arrayList) {
        return arrayList.remove(arrayList.size() - i7);
    }

    public static Object h(int i7, List list) {
        return list.get(list.size() - i7);
    }

    public static Object i(HashMap hashMap, Uri uri, Uri uri2) {
        la.p(hashMap.containsKey(uri));
        return hashMap.get(uri2);
    }

    public static String j(long j3, String str, String str2) {
        return str + j3 + str2;
    }

    public static String k(String str, String str2) {
        return str + str2;
    }

    public static String l(String str, String str2, String str3, String str4, String str5) {
        return str + str2 + str3 + str4 + str5;
    }

    public static String m(String str, String str2, String str3, StringBuilder sb2) {
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
        return sb2.toString();
    }

    public static StringBuilder n(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(str2);
        return sb2;
    }

    public static HashMap o(Class cls, y7.e eVar) {
        HashMap hashMap = new HashMap();
        hashMap.put(cls, eVar);
        return hashMap;
    }

    public static y7.e p(HashMap hashMap, int i7) {
        DesugarCollections.unmodifiableMap(new HashMap(hashMap));
        return new y7.e(i7);
    }

    public static /* synthetic */ void q(MediaMetadataRetriever mediaMetadataRetriever) {
        if (mediaMetadataRetriever instanceof AutoCloseable) {
            mediaMetadataRetriever.close();
        } else if (mediaMetadataRetriever instanceof ExecutorService) {
            f4.b();
        } else {
            if (!e2.s(mediaMetadataRetriever)) {
                throw new IllegalArgumentException();
            }
            mediaMetadataRetriever.release();
        }
    }

    public static void r(t tVar, i0 i0Var) {
        i0Var.g(new u(tVar));
    }

    public static void s(String str, StringBuilder sb2) {
        sb2.append(str);
        a8.b(sb2.toString());
    }

    public static void t(StringBuilder sb2, String str, String str2) {
        sb2.append(str);
        Log.d(str2, sb2.toString());
    }

    public static void u(HashMap hashMap) {
        DesugarCollections.unmodifiableMap(new HashMap(hashMap));
    }

    public static String v(String str, String str2) {
        return str + str2;
    }

    public static void w(q2.g gVar, q2.g gVar2) {
        if (gVar == gVar2) {
            return;
        }
        if (gVar2 != null) {
            gVar2.b(null);
        }
        if (gVar != null) {
            gVar.c(null);
        }
    }

    public static /* synthetic */ String x(int i7) {
        return i7 != 1 ? i7 != 2 ? i7 != 3 ? i7 != 4 ? "null" : "FROSTED_FILTERED" : "FROSTED_GLASS" : "GLASS" : "BLURRED";
    }

    public static /* synthetic */ int y(String str) {
        if (str == null) {
            throw new NullPointerException("Name is null");
        }
        if (str.equals("GET")) {
            return 1;
        }
        if (str.equals("PUT")) {
            return 2;
        }
        if (str.equals("POST")) {
            return 3;
        }
        if (str.equals("DELETE")) {
            return 4;
        }
        if (str.equals("HEAD")) {
            return 5;
        }
        if (str.equals("OPTIONS")) {
            return 6;
        }
        if (str.equals("TRACE")) {
            return 7;
        }
        if (str.equals("CONNECT")) {
            return 8;
        }
        if (str.equals("PATCH")) {
            return 9;
        }
        if (str.equals("PROPFIND")) {
            return 10;
        }
        if (str.equals("PROPPATCH")) {
            return 11;
        }
        if (str.equals("MKCOL")) {
            return 12;
        }
        if (str.equals("MOVE")) {
            return 13;
        }
        if (str.equals("COPY")) {
            return 14;
        }
        if (str.equals("LOCK")) {
            return 15;
        }
        if (str.equals("UNLOCK")) {
            return 16;
        }
        throw new IllegalArgumentException("No enum constant fi.iki.elonen.NanoHTTPD.Method.".concat(str));
    }
}
