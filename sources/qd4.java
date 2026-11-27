// default package

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class qd4 {
    public static float A(float f, float f2, float f3, float f4) {
        return ((f - f2) * f3) + f4;
    }

    public static /* synthetic */ String B(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "FROSTED_FILTERED" : "FROSTED_GLASS" : "GLASS" : "BLURRED";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(eu5 eu5Var, boolean z) {
        ((View) eu5Var).setVisibility(z ? 4 : 0);
    }

    public static int b(int i) {
        int[] G = ik8.G(jn7.J1);
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
            case jn7.S /* 30 */:
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
            case jn7.n0 /* 51 */:
                return "Darkwave";
            case jn7.o0 /* 52 */:
                return "Techno-Industrial";
            case jn7.p0 /* 53 */:
                return "Electronic";
            case jn7.q0 /* 54 */:
                return "Pop-Folk";
            case jn7.r0 /* 55 */:
                return "Eurodance";
            case 56:
                return "Dream";
            case jn7.t0 /* 57 */:
                return "Southern Rock";
            case jn7.u0 /* 58 */:
                return "Comedy";
            case jn7.v0 /* 59 */:
                return "Cult";
            case jn7.w0 /* 60 */:
                return "Gangsta";
            case jn7.x0 /* 61 */:
                return "Top 40";
            case jn7.y0 /* 62 */:
                return "Christian Rap";
            case jn7.z0 /* 63 */:
                return "Pop/Funk";
            case 64:
                return "Jungle";
            case 65:
                return "Native American";
            case jn7.C0 /* 66 */:
                return "Cabaret";
            case jn7.D0 /* 67 */:
                return "New Wave";
            case jn7.E0 /* 68 */:
                return "Psychadelic";
            case jn7.F0 /* 69 */:
                return "Rave";
            case jn7.G0 /* 70 */:
                return "Showtunes";
            case jn7.H0 /* 71 */:
                return "Trailer";
            case jn7.I0 /* 72 */:
                return "Lo-Fi";
            case jn7.J0 /* 73 */:
                return "Tribal";
            case jn7.K0 /* 74 */:
                return "Acid Punk";
            case jn7.L0 /* 75 */:
                return "Acid Jazz";
            case jn7.M0 /* 76 */:
                return "Polka";
            case jn7.N0 /* 77 */:
                return "Retro";
            case jn7.O0 /* 78 */:
                return "Musical";
            case jn7.P0 /* 79 */:
                return "Rock & Roll";
            case 80:
                return "Hard Rock";
            case jn7.R0 /* 81 */:
                return "Folk";
            case jn7.S0 /* 82 */:
                return "Folk-Rock";
            case jn7.T0 /* 83 */:
                return "National Folk";
            case jn7.U0 /* 84 */:
                return "Swing";
            case jn7.V0 /* 85 */:
                return "Fast Fusion";
            case jn7.W0 /* 86 */:
                return "Bebop";
            case jn7.X0 /* 87 */:
                return "Latin";
            case jn7.Y0 /* 88 */:
                return "Revival";
            case jn7.Z0 /* 89 */:
                return "Celtic";
            case jn7.a1 /* 90 */:
                return "Bluegrass";
            case jn7.b1 /* 91 */:
                return "Avantgarde";
            case jn7.c1 /* 92 */:
                return "Gothic Rock";
            case jn7.d1 /* 93 */:
                return "Progressive Rock";
            case jn7.e1 /* 94 */:
                return "Psychedelic Rock";
            case jn7.f1 /* 95 */:
                return "Symphonic Rock";
            case 96:
                return "Slow Rock";
            case jn7.h1 /* 97 */:
                return "Big Band";
            case jn7.i1 /* 98 */:
                return "Chorus";
            case jn7.j1 /* 99 */:
                return "Easy Listening";
            case jn7.k1 /* 100 */:
                return "Acoustic";
            case 101:
                return "Humour";
            case jn7.m1 /* 102 */:
                return "Speech";
            case jn7.n1 /* 103 */:
                return "Chanson";
            case jn7.o1 /* 104 */:
                return "Opera";
            case jn7.p1 /* 105 */:
                return "Chamber Music";
            case jn7.q1 /* 106 */:
                return "Sonata";
            case jn7.r1 /* 107 */:
                return "Symphony";
            case jn7.s1 /* 108 */:
                return "Booty Bass";
            case jn7.t1 /* 109 */:
                return "Primus";
            case jn7.u1 /* 110 */:
                return "Porn Groove";
            case jn7.v1 /* 111 */:
                return "Satire";
            case jn7.w1 /* 112 */:
                return "Slow Jam";
            case jn7.x1 /* 113 */:
                return "Club";
            case jn7.y1 /* 114 */:
                return "Tango";
            case jn7.z1 /* 115 */:
                return "Samba";
            case jn7.A1 /* 116 */:
                return "Folklore";
            case jn7.B1 /* 117 */:
                return "Ballad";
            case jn7.C1 /* 118 */:
                return "Power Ballad";
            case jn7.D1 /* 119 */:
                return "Rhythmic Soul";
            case jn7.E1 /* 120 */:
                return "Freestyle";
            case 121:
                return "Duet";
            case jn7.F1 /* 122 */:
                return "Punk Rock";
            case jn7.G1 /* 123 */:
                return "Drum Solo";
            case jn7.H1 /* 124 */:
                return "A capella";
            case jn7.I1 /* 125 */:
                return "Euro-House";
            case jn7.J1 /* 126 */:
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

    public static int h(tk4 tk4Var, int i) {
        return tk4Var.c(tk4Var.getMeasuredWidth()) + i;
    }

    public static int i(Float f, float f2) {
        return hl.L(f.floatValue() * f2);
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

    public static ArrayList s(zh6 zh6Var, long j) {
        ArrayList arrayList = new ArrayList();
        zh6Var.k(j, arrayList);
        return arrayList;
    }

    public static ArrayList t(r47 r47Var) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(r47Var);
        return arrayList;
    }

    public static void u(float f, int i, int i2, TextView textView, String str) {
        textView.setText(ob6.M0(i, str));
        textView.setTextSize(i2, f);
    }

    public static void v(int i, ArrayList arrayList) {
        arrayList.remove(arrayList.size() - i);
    }

    public static void w(TextView textView, int i, vnb vnbVar, int i2, float f) {
        yob.X(textView, i, vnbVar);
        textView.setTextSize(i2, f);
        textView.setTypeface(hl.o());
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
