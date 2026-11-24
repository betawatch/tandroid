// default package

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract /* synthetic */ class td4 {
    public static float A(float f, float f2, float f3, float f4) {
        return ((f - f2) * f3) + f4;
    }

    public static /* synthetic */ String B(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "FROSTED_FILTERED" : "FROSTED_GLASS" : "GLASS" : "BLURRED";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(au5 au5Var, boolean z) {
        ((View) au5Var).setVisibility(z ? 4 : 0);
    }

    public static int b(int i) {
        int[] G = wi8.G(nm7.J1);
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
            case nm7.S /* 30 */:
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
            case nm7.n0 /* 51 */:
                return "Darkwave";
            case nm7.o0 /* 52 */:
                return "Techno-Industrial";
            case nm7.p0 /* 53 */:
                return "Electronic";
            case nm7.q0 /* 54 */:
                return "Pop-Folk";
            case nm7.r0 /* 55 */:
                return "Eurodance";
            case 56:
                return "Dream";
            case nm7.t0 /* 57 */:
                return "Southern Rock";
            case nm7.u0 /* 58 */:
                return "Comedy";
            case nm7.v0 /* 59 */:
                return "Cult";
            case nm7.w0 /* 60 */:
                return "Gangsta";
            case nm7.x0 /* 61 */:
                return "Top 40";
            case nm7.y0 /* 62 */:
                return "Christian Rap";
            case nm7.z0 /* 63 */:
                return "Pop/Funk";
            case 64:
                return "Jungle";
            case 65:
                return "Native American";
            case nm7.C0 /* 66 */:
                return "Cabaret";
            case nm7.D0 /* 67 */:
                return "New Wave";
            case nm7.E0 /* 68 */:
                return "Psychadelic";
            case nm7.F0 /* 69 */:
                return "Rave";
            case nm7.G0 /* 70 */:
                return "Showtunes";
            case nm7.H0 /* 71 */:
                return "Trailer";
            case nm7.I0 /* 72 */:
                return "Lo-Fi";
            case nm7.J0 /* 73 */:
                return "Tribal";
            case nm7.K0 /* 74 */:
                return "Acid Punk";
            case nm7.L0 /* 75 */:
                return "Acid Jazz";
            case nm7.M0 /* 76 */:
                return "Polka";
            case nm7.N0 /* 77 */:
                return "Retro";
            case nm7.O0 /* 78 */:
                return "Musical";
            case nm7.P0 /* 79 */:
                return "Rock & Roll";
            case 80:
                return "Hard Rock";
            case nm7.R0 /* 81 */:
                return "Folk";
            case nm7.S0 /* 82 */:
                return "Folk-Rock";
            case nm7.T0 /* 83 */:
                return "National Folk";
            case nm7.U0 /* 84 */:
                return "Swing";
            case nm7.V0 /* 85 */:
                return "Fast Fusion";
            case nm7.W0 /* 86 */:
                return "Bebop";
            case nm7.X0 /* 87 */:
                return "Latin";
            case nm7.Y0 /* 88 */:
                return "Revival";
            case nm7.Z0 /* 89 */:
                return "Celtic";
            case nm7.a1 /* 90 */:
                return "Bluegrass";
            case nm7.b1 /* 91 */:
                return "Avantgarde";
            case nm7.c1 /* 92 */:
                return "Gothic Rock";
            case nm7.d1 /* 93 */:
                return "Progressive Rock";
            case nm7.e1 /* 94 */:
                return "Psychedelic Rock";
            case nm7.f1 /* 95 */:
                return "Symphonic Rock";
            case 96:
                return "Slow Rock";
            case nm7.h1 /* 97 */:
                return "Big Band";
            case nm7.i1 /* 98 */:
                return "Chorus";
            case nm7.j1 /* 99 */:
                return "Easy Listening";
            case nm7.k1 /* 100 */:
                return "Acoustic";
            case 101:
                return "Humour";
            case nm7.m1 /* 102 */:
                return "Speech";
            case nm7.n1 /* 103 */:
                return "Chanson";
            case nm7.o1 /* 104 */:
                return "Opera";
            case nm7.p1 /* 105 */:
                return "Chamber Music";
            case nm7.q1 /* 106 */:
                return "Sonata";
            case nm7.r1 /* 107 */:
                return "Symphony";
            case nm7.s1 /* 108 */:
                return "Booty Bass";
            case nm7.t1 /* 109 */:
                return "Primus";
            case nm7.u1 /* 110 */:
                return "Porn Groove";
            case nm7.v1 /* 111 */:
                return "Satire";
            case nm7.w1 /* 112 */:
                return "Slow Jam";
            case nm7.x1 /* 113 */:
                return "Club";
            case nm7.y1 /* 114 */:
                return "Tango";
            case nm7.z1 /* 115 */:
                return "Samba";
            case nm7.A1 /* 116 */:
                return "Folklore";
            case nm7.B1 /* 117 */:
                return "Ballad";
            case nm7.C1 /* 118 */:
                return "Power Ballad";
            case nm7.D1 /* 119 */:
                return "Rhythmic Soul";
            case nm7.E1 /* 120 */:
                return "Freestyle";
            case 121:
                return "Duet";
            case nm7.F1 /* 122 */:
                return "Punk Rock";
            case nm7.G1 /* 123 */:
                return "Drum Solo";
            case nm7.H1 /* 124 */:
                return "A capella";
            case nm7.I1 /* 125 */:
                return "Euro-House";
            case nm7.J1 /* 126 */:
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
        return gm.L(f.floatValue() * f2);
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

    public static LinearLayout l(Activity activity, int i) {
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(i);
        return linearLayout;
    }

    public static Object m(int i, ArrayList arrayList) {
        return arrayList.remove(arrayList.size() - i);
    }

    public static String n(int i, int i2, String str) {
        return i + str + i2;
    }

    public static String o(int i, String str, String str2) {
        return str + i + str2;
    }

    public static String p(String str, String str2) {
        return str + str2;
    }

    public static String q(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String r(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    public static StringBuilder s(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb;
    }

    public static ArrayList t(vh6 vh6Var, long j) {
        ArrayList arrayList = new ArrayList();
        vh6Var.k(arrayList, j);
        return arrayList;
    }

    public static ArrayList u(k47 k47Var) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(k47Var);
        return arrayList;
    }

    public static void v(float f, int i, int i2, TextView textView, String str) {
        textView.setText(jb6.M0(i, str));
        textView.setTextSize(i2, f);
    }

    public static void w(int i, ArrayList arrayList) {
        arrayList.remove(arrayList.size() - i);
    }

    public static void x(TextView textView, int i, ylb ylbVar, int i2, float f) {
        anb.X(textView, i, ylbVar);
        textView.setTextSize(i2, f);
        textView.setTypeface(gm.o());
    }

    public static float y(float f, float f2, float f3, float f4) {
        return f4 - ((f - f2) / f3);
    }

    public static float z(float f, float f2, float f3, float f4) {
        return (f - f2) * f3 * f4;
    }
}
