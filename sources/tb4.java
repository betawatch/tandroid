// default package

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract /* synthetic */ class tb4 {
    public static float A(float f, float f2, float f3, float f4) {
        return ((f - f2) * f3) + f4;
    }

    public static /* synthetic */ String B(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "FROSTED_FILTERED" : "FROSTED_GLASS" : "GLASS" : "BLURRED";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(bs5 bs5Var, boolean z) {
        ((View) bs5Var).setVisibility(z ? 4 : 0);
    }

    public static int b(int i) {
        int[] G = ug8.G(kk7.J1);
        if (i < 0 || i >= G.length) {
            return 0;
        }
        return G[i];
    }

    public static final boolean c(int i) {
        return i == 3 || i == 4;
    }

    public static /* synthetic */ String d(int i) {
        switch (i) {
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
            case kk7.S /* 30 */:
                return "Jazz+Funk";
            case 31:
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
            case kk7.n0 /* 51 */:
                return "Darkwave";
            case kk7.o0 /* 52 */:
                return "Techno-Industrial";
            case kk7.p0 /* 53 */:
                return "Electronic";
            case kk7.q0 /* 54 */:
                return "Pop-Folk";
            case kk7.r0 /* 55 */:
                return "Eurodance";
            case 56:
                return "Dream";
            case kk7.t0 /* 57 */:
                return "Southern Rock";
            case kk7.u0 /* 58 */:
                return "Comedy";
            case kk7.v0 /* 59 */:
                return "Cult";
            case kk7.w0 /* 60 */:
                return "Gangsta";
            case kk7.x0 /* 61 */:
                return "Top 40";
            case kk7.y0 /* 62 */:
                return "Christian Rap";
            case kk7.z0 /* 63 */:
                return "Pop/Funk";
            case 64:
                return "Jungle";
            case 65:
                return "Native American";
            case kk7.C0 /* 66 */:
                return "Cabaret";
            case kk7.D0 /* 67 */:
                return "New Wave";
            case kk7.E0 /* 68 */:
                return "Psychadelic";
            case kk7.F0 /* 69 */:
                return "Rave";
            case kk7.G0 /* 70 */:
                return "Showtunes";
            case kk7.H0 /* 71 */:
                return "Trailer";
            case kk7.I0 /* 72 */:
                return "Lo-Fi";
            case kk7.J0 /* 73 */:
                return "Tribal";
            case kk7.K0 /* 74 */:
                return "Acid Punk";
            case kk7.L0 /* 75 */:
                return "Acid Jazz";
            case kk7.M0 /* 76 */:
                return "Polka";
            case kk7.N0 /* 77 */:
                return "Retro";
            case kk7.O0 /* 78 */:
                return "Musical";
            case kk7.P0 /* 79 */:
                return "Rock & Roll";
            case 80:
                return "Hard Rock";
            case kk7.R0 /* 81 */:
                return "Folk";
            case kk7.S0 /* 82 */:
                return "Folk-Rock";
            case kk7.T0 /* 83 */:
                return "National Folk";
            case kk7.U0 /* 84 */:
                return "Swing";
            case kk7.V0 /* 85 */:
                return "Fast Fusion";
            case kk7.W0 /* 86 */:
                return "Bebop";
            case kk7.X0 /* 87 */:
                return "Latin";
            case kk7.Y0 /* 88 */:
                return "Revival";
            case kk7.Z0 /* 89 */:
                return "Celtic";
            case kk7.a1 /* 90 */:
                return "Bluegrass";
            case kk7.b1 /* 91 */:
                return "Avantgarde";
            case kk7.c1 /* 92 */:
                return "Gothic Rock";
            case kk7.d1 /* 93 */:
                return "Progressive Rock";
            case kk7.e1 /* 94 */:
                return "Psychedelic Rock";
            case kk7.f1 /* 95 */:
                return "Symphonic Rock";
            case 96:
                return "Slow Rock";
            case kk7.h1 /* 97 */:
                return "Big Band";
            case kk7.i1 /* 98 */:
                return "Chorus";
            case kk7.j1 /* 99 */:
                return "Easy Listening";
            case kk7.k1 /* 100 */:
                return "Acoustic";
            case 101:
                return "Humour";
            case kk7.m1 /* 102 */:
                return "Speech";
            case kk7.n1 /* 103 */:
                return "Chanson";
            case kk7.o1 /* 104 */:
                return "Opera";
            case kk7.p1 /* 105 */:
                return "Chamber Music";
            case kk7.q1 /* 106 */:
                return "Sonata";
            case kk7.r1 /* 107 */:
                return "Symphony";
            case kk7.s1 /* 108 */:
                return "Booty Bass";
            case kk7.t1 /* 109 */:
                return "Primus";
            case kk7.u1 /* 110 */:
                return "Porn Groove";
            case kk7.v1 /* 111 */:
                return "Satire";
            case kk7.w1 /* 112 */:
                return "Slow Jam";
            case kk7.x1 /* 113 */:
                return "Club";
            case kk7.y1 /* 114 */:
                return "Tango";
            case kk7.z1 /* 115 */:
                return "Samba";
            case kk7.A1 /* 116 */:
                return "Folklore";
            case kk7.B1 /* 117 */:
                return "Ballad";
            case kk7.C1 /* 118 */:
                return "Power Ballad";
            case kk7.D1 /* 119 */:
                return "Rhythmic Soul";
            case 120:
                return "Freestyle";
            case kk7.E1 /* 121 */:
                return "Duet";
            case kk7.F1 /* 122 */:
                return "Punk Rock";
            case kk7.G1 /* 123 */:
                return "Drum Solo";
            case kk7.H1 /* 124 */:
                return "A capella";
            case kk7.I1 /* 125 */:
                return "Euro-House";
            case kk7.J1 /* 126 */:
                return "Dance Hall";
            default:
                throw null;
        }
    }

    public static float e(float f, float f2, float f3, float f4) {
        return ((f + f2) / f3) + f4;
    }

    public static int f(int i, int i2, int i3, int i4) {
        return ((i - i2) - i3) - i4;
    }

    public static int g(int i, int i2, int i3, ArrayList arrayList) {
        arrayList.add(Integer.valueOf(i));
        return i2 + i3;
    }

    public static int h(pi4 pi4Var, int i) {
        return pi4Var.c(pi4Var.getMeasuredWidth()) + i;
    }

    public static int i(Float f, float f2) {
        return gl.L(f.floatValue() * f2);
    }

    public static Bundle j(int i, String str, String str2, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean(str, z);
        bundle.putInt(str2, i);
        return bundle;
    }

    public static ImageView k(Context context, int i) {
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(i);
        return imageView;
    }

    public static Object l(int i, ArrayList arrayList) {
        return arrayList.remove(arrayList.size() - i);
    }

    public static String m(int i, int i2, String str) {
        return i + str + i2;
    }

    public static String n(int i, String str, String str2) {
        return str + i + str2;
    }

    public static String o(String str, String str2) {
        return str + str2;
    }

    public static String p(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String q(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    public static StringBuilder r(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb;
    }

    public static ArrayList s(vf6 vf6Var, long j) {
        ArrayList arrayList = new ArrayList();
        vf6Var.k(arrayList, j);
        return arrayList;
    }

    public static ArrayList t(k27 k27Var) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(k27Var);
        return arrayList;
    }

    public static void u(float f, int i, int i2, TextView textView, String str) {
        textView.setText(k96.M0(i, str));
        textView.setTextSize(i2, f);
    }

    public static void v(int i, ArrayList arrayList) {
        arrayList.remove(arrayList.size() - i);
    }

    public static void w(TextView textView, int i, wjb wjbVar, int i2, float f) {
        zkb.X(textView, i, wjbVar);
        textView.setTextSize(i2, f);
        textView.setTypeface(gl.o());
    }

    public static float x(float f, float f2, float f3, float f4) {
        return f4 - ((f - f2) / f3);
    }

    public static String y(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static float z(float f, float f2, float f3, float f4) {
        return (f - f2) * f3 * f4;
    }
}
