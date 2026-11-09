package rf;

import android.media.MediaMetadataRetriever;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.internal.cast.f4;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutorService;
import org.telegram.messenger.g0;
import org.telegram.messenger.qs;
import p1.g;
import y7.e;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public abstract /* synthetic */ class b {
    public static int a(int i7) {
        int[] d = g.d(qs.K1);
        if (i7 < 0 || i7 >= d.length) {
            return 0;
        }
        return d[i7];
    }

    public static int b(String str) {
        if (str == null) {
            return 0;
        }
        try {
            return v(str);
        } catch (IllegalArgumentException unused) {
            return 0;
        }
    }

    public static /* synthetic */ String c(int i7) {
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
            case qs.T /* 30 */:
                return "Jazz+Funk";
            case qs.U /* 31 */:
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
            case qs.o0 /* 51 */:
                return "Darkwave";
            case qs.p0 /* 52 */:
                return "Techno-Industrial";
            case qs.q0 /* 53 */:
                return "Electronic";
            case qs.r0 /* 54 */:
                return "Pop-Folk";
            case qs.s0 /* 55 */:
                return "Eurodance";
            case qs.t0 /* 56 */:
                return "Dream";
            case qs.u0 /* 57 */:
                return "Southern Rock";
            case qs.v0 /* 58 */:
                return "Comedy";
            case qs.w0 /* 59 */:
                return "Cult";
            case qs.x0 /* 60 */:
                return "Gangsta";
            case qs.y0 /* 61 */:
                return "Top 40";
            case qs.z0 /* 62 */:
                return "Christian Rap";
            case qs.A0 /* 63 */:
                return "Pop/Funk";
            case 64:
                return "Jungle";
            case 65:
                return "Native American";
            case qs.D0 /* 66 */:
                return "Cabaret";
            case qs.E0 /* 67 */:
                return "New Wave";
            case qs.F0 /* 68 */:
                return "Psychadelic";
            case qs.G0 /* 69 */:
                return "Rave";
            case qs.H0 /* 70 */:
                return "Showtunes";
            case qs.I0 /* 71 */:
                return "Trailer";
            case qs.J0 /* 72 */:
                return "Lo-Fi";
            case qs.K0 /* 73 */:
                return "Tribal";
            case qs.L0 /* 74 */:
                return "Acid Punk";
            case qs.M0 /* 75 */:
                return "Acid Jazz";
            case qs.N0 /* 76 */:
                return "Polka";
            case qs.O0 /* 77 */:
                return "Retro";
            case qs.P0 /* 78 */:
                return "Musical";
            case qs.Q0 /* 79 */:
                return "Rock & Roll";
            case 80:
                return "Hard Rock";
            case qs.S0 /* 81 */:
                return "Folk";
            case qs.T0 /* 82 */:
                return "Folk-Rock";
            case qs.U0 /* 83 */:
                return "National Folk";
            case qs.V0 /* 84 */:
                return "Swing";
            case qs.W0 /* 85 */:
                return "Fast Fusion";
            case qs.X0 /* 86 */:
                return "Bebop";
            case qs.Y0 /* 87 */:
                return "Latin";
            case qs.Z0 /* 88 */:
                return "Revival";
            case qs.a1 /* 89 */:
                return "Celtic";
            case qs.b1 /* 90 */:
                return "Bluegrass";
            case qs.c1 /* 91 */:
                return "Avantgarde";
            case qs.d1 /* 92 */:
                return "Gothic Rock";
            case qs.e1 /* 93 */:
                return "Progressive Rock";
            case qs.f1 /* 94 */:
                return "Psychedelic Rock";
            case qs.g1 /* 95 */:
                return "Symphonic Rock";
            case 96:
                return "Slow Rock";
            case qs.i1 /* 97 */:
                return "Big Band";
            case qs.j1 /* 98 */:
                return "Chorus";
            case qs.k1 /* 99 */:
                return "Easy Listening";
            case qs.l1 /* 100 */:
                return "Acoustic";
            case 101:
                return "Humour";
            case qs.n1 /* 102 */:
                return "Speech";
            case qs.o1 /* 103 */:
                return "Chanson";
            case qs.p1 /* 104 */:
                return "Opera";
            case qs.q1 /* 105 */:
                return "Chamber Music";
            case qs.r1 /* 106 */:
                return "Sonata";
            case qs.s1 /* 107 */:
                return "Symphony";
            case qs.t1 /* 108 */:
                return "Booty Bass";
            case qs.u1 /* 109 */:
                return "Primus";
            case qs.v1 /* 110 */:
                return "Porn Groove";
            case qs.w1 /* 111 */:
                return "Satire";
            case qs.x1 /* 112 */:
                return "Slow Jam";
            case qs.y1 /* 113 */:
                return "Club";
            case qs.z1 /* 114 */:
                return "Tango";
            case qs.A1 /* 115 */:
                return "Samba";
            case qs.B1 /* 116 */:
                return "Folklore";
            case qs.C1 /* 117 */:
                return "Ballad";
            case qs.D1 /* 118 */:
                return "Power Ballad";
            case qs.E1 /* 119 */:
                return "Rhythmic Soul";
            case 120:
                return "Freestyle";
            case qs.F1 /* 121 */:
                return "Duet";
            case qs.G1 /* 122 */:
                return "Punk Rock";
            case qs.H1 /* 123 */:
                return "Drum Solo";
            case qs.I1 /* 124 */:
                return "A capella";
            case qs.J1 /* 125 */:
                return "Euro-House";
            case qs.K1 /* 126 */:
                return "Dance Hall";
            default:
                throw null;
        }
    }

    public static float d(float f10, float f11, float f12, float f13) {
        return (f10 * f11) + f12 + f13;
    }

    public static int e(Float f10, float f11) {
        return g0.L(f10.floatValue() * f11);
    }

    public static Bundle f(int i7, String str) {
        Bundle bundle = new Bundle();
        bundle.putInt(str, i7);
        return bundle;
    }

    public static Object g(int i7, List list) {
        return list.get(list.size() - i7);
    }

    public static String h(long j3, String str, String str2) {
        return str + j3 + str2;
    }

    public static String i(String str, String str2) {
        return str + str2;
    }

    public static StringBuilder j(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(str2);
        return sb2;
    }

    public static HashMap k(Class cls, e eVar) {
        HashMap hashMap = new HashMap();
        hashMap.put(cls, eVar);
        return hashMap;
    }

    public static HashMap l(Class cls, z7.a aVar) {
        HashMap hashMap = new HashMap();
        hashMap.put(cls, aVar);
        return hashMap;
    }

    public static e m(HashMap hashMap, int i7) {
        DesugarCollections.unmodifiableMap(new HashMap(hashMap));
        return new e(i7);
    }

    public static z7.a n(HashMap hashMap, int i7) {
        DesugarCollections.unmodifiableMap(new HashMap(hashMap));
        return new z7.a(i7);
    }

    public static /* synthetic */ void o(MediaMetadataRetriever mediaMetadataRetriever) {
        if (mediaMetadataRetriever instanceof AutoCloseable) {
            mediaMetadataRetriever.close();
        } else if (mediaMetadataRetriever instanceof ExecutorService) {
            f4.b();
        } else {
            if (!com.google.android.recaptcha.internal.a.u(mediaMetadataRetriever)) {
                throw new IllegalArgumentException();
            }
            mediaMetadataRetriever.release();
        }
    }

    public static void p(StringBuilder sb2, String str, String str2) {
        sb2.append(str);
        Log.d(str2, sb2.toString());
    }

    public static void q(HashMap hashMap) {
        DesugarCollections.unmodifiableMap(new HashMap(hashMap));
    }

    public static String r(String str, String str2) {
        return str + str2;
    }

    public static /* synthetic */ String s(int i7) {
        switch (i7) {
            case 1:
                return "IDLE";
            case 2:
                return "STARTING";
            case 3:
                return "RECORDING";
            case 4:
                return "PAUSING";
            case 5:
                return "PREVIEWING";
            case 6:
                return "RESUMING";
            case 7:
                return "FINISHING";
            case 8:
                return "COMPLETED";
            case 9:
                return "ERROR";
            case 10:
                return "RELEASED";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String t(int i7) {
        return i7 != 1 ? i7 != 2 ? i7 != 3 ? i7 != 4 ? "null" : "ERROR" : "CANCELLED" : "AUDIO_REMOVED" : "TRIMMED";
    }

    public static /* synthetic */ String u(int i7) {
        switch (i7) {
            case 1:
                return "IDLE";
            case 2:
                return "STARTING";
            case 3:
                return "RECORDING";
            case 4:
                return "PAUSING";
            case 5:
                return "PREVIEWING";
            case 6:
                return "RESUMING";
            case 7:
                return "FINISHING";
            case 8:
                return "COMPLETED";
            case 9:
                return "ERROR";
            case 10:
                return "RELEASED";
            default:
                return "null";
        }
    }

    public static /* synthetic */ int v(String str) {
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
