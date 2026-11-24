// default package

import android.content.ContentProviderClient;
import android.content.Context;
import android.content.res.TypedArray;
import android.drm.DrmManagerClient;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.os.Parcel;
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract /* synthetic */ class yjb {
    public static int A(int i, int i2, int i3) {
        return lje.t(i) + i2 + i3;
    }

    public static float B(float f, float f2, float f3, float f4) {
        return (f3 - (f * f2)) * f4;
    }

    public static float C(float f, float f2, float f3, float f4) {
        return f * f2 * f3 * f4;
    }

    public static odc a(rdc rdcVar, oh2 oh2Var, l13 l13Var) {
        l13Var.getClass();
        Class a = oh2Var.a();
        a.getClass();
        return rdcVar.e(a, l13Var);
    }

    public static void b(wxb wxbVar, xu7 xu7Var, int i) {
        wxbVar.b(xu7Var, i, 0);
    }

    public static final void c(int i, Runnable runnable) {
        ((o59) l69.x().b).post(runnable);
    }

    public static int d(int i) {
        if (i == 90) {
            return 81;
        }
        if (i == 91) {
            return 82;
        }
        if (i == 93) {
            return 84;
        }
        if (i == 94) {
            return 85;
        }
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            case 15:
                return 16;
            case 16:
                return 17;
            case 17:
                return 18;
            case 18:
                return 19;
            case 19:
                return 20;
            case 20:
                return 21;
            case 21:
                return 22;
            case 22:
                return 23;
            case 23:
                return 24;
            case 24:
                return 25;
            case 25:
                return 26;
            case 26:
                return 27;
            case 27:
                return 28;
            case 28:
                return 29;
            case 29:
                return 30;
            case kk7.S /* 30 */:
                return 31;
            case 31:
                return 32;
            case 32:
                return 33;
            case 33:
                return 34;
            case 34:
                return 35;
            case 35:
                return 36;
            case 36:
                return 37;
            case 37:
                return 38;
            case 38:
                return 39;
            case 39:
                return 40;
            case 40:
                return 41;
            case 41:
                return 42;
            case 42:
                return 43;
            case 43:
                return 44;
            case 44:
                return 45;
            case 45:
                return 46;
            case 46:
                return 47;
            case 47:
                return 48;
            case 48:
                return 49;
            case 49:
                return 50;
            case 50:
                return 51;
            case kk7.n0 /* 51 */:
                return 52;
            case kk7.o0 /* 52 */:
                return 53;
            case kk7.p0 /* 53 */:
                return 54;
            case kk7.q0 /* 54 */:
                return 55;
            case kk7.r0 /* 55 */:
                return 56;
            case 56:
                return 57;
            case kk7.t0 /* 57 */:
                return 58;
            case kk7.u0 /* 58 */:
                return 59;
            case kk7.v0 /* 59 */:
                return 60;
            case kk7.w0 /* 60 */:
                return 61;
            case kk7.x0 /* 61 */:
                return 62;
            case kk7.y0 /* 62 */:
                return 63;
            case kk7.z0 /* 63 */:
                return 64;
            case 64:
                return 65;
            case 65:
                return 66;
            case kk7.C0 /* 66 */:
                return 67;
            case kk7.D0 /* 67 */:
                return 68;
            case kk7.E0 /* 68 */:
                return 69;
            case kk7.F0 /* 69 */:
                return 70;
            case kk7.G0 /* 70 */:
                return 71;
            case kk7.H0 /* 71 */:
                return 72;
            case kk7.I0 /* 72 */:
                return 73;
            case kk7.J0 /* 73 */:
                return 74;
            case kk7.K0 /* 74 */:
                return 75;
            case kk7.L0 /* 75 */:
                return 76;
            case kk7.M0 /* 76 */:
                return 77;
            case kk7.N0 /* 77 */:
                return 78;
            case kk7.O0 /* 78 */:
                return 79;
            case kk7.P0 /* 79 */:
                return 80;
            default:
                switch (i) {
                    case 96:
                        return 87;
                    case kk7.h1 /* 97 */:
                        return 88;
                    case kk7.i1 /* 98 */:
                        return 89;
                    case kk7.j1 /* 99 */:
                        return 90;
                    case kk7.k1 /* 100 */:
                        return 91;
                    case 101:
                        return 92;
                    case kk7.m1 /* 102 */:
                        return 83;
                    case kk7.n1 /* 103 */:
                        return 86;
                    case kk7.o1 /* 104 */:
                        return 93;
                    case kk7.p1 /* 105 */:
                        return 94;
                    case kk7.q1 /* 106 */:
                        return 95;
                    case kk7.r1 /* 107 */:
                        return 96;
                    case kk7.s1 /* 108 */:
                        return 97;
                    case kk7.t1 /* 109 */:
                        return 98;
                    case kk7.u1 /* 110 */:
                        return 99;
                    case kk7.v1 /* 111 */:
                        return 100;
                    case kk7.w1 /* 112 */:
                        return 101;
                    case kk7.x1 /* 113 */:
                        return kk7.m1;
                    case kk7.y1 /* 114 */:
                        return kk7.n1;
                    case kk7.z1 /* 115 */:
                        return kk7.o1;
                    case kk7.A1 /* 116 */:
                        return kk7.p1;
                    case kk7.B1 /* 117 */:
                        return kk7.q1;
                    case kk7.C1 /* 118 */:
                        return kk7.r1;
                    case kk7.D1 /* 119 */:
                        return kk7.s1;
                    case 120:
                        return kk7.t1;
                    case kk7.E1 /* 121 */:
                        return kk7.u1;
                    case kk7.F1 /* 122 */:
                        return kk7.v1;
                    case kk7.G1 /* 123 */:
                        return kk7.w1;
                    case kk7.H1 /* 124 */:
                        return kk7.x1;
                    case kk7.I1 /* 125 */:
                        return kk7.y1;
                    case kk7.J1 /* 126 */:
                        return kk7.B1;
                    case kk7.K1 /* 127 */:
                        return kk7.D1;
                    case 128:
                        return 120;
                    case kk7.M1 /* 129 */:
                        return kk7.E1;
                    case kk7.N1 /* 130 */:
                        return kk7.F1;
                    case kk7.O1 /* 131 */:
                        return kk7.G1;
                    case kk7.P1 /* 132 */:
                        return kk7.H1;
                    case 133:
                        return kk7.I1;
                    case 134:
                        return kk7.J1;
                    case kk7.Q1 /* 135 */:
                        return kk7.K1;
                    case kk7.R1 /* 136 */:
                        return 128;
                    case kk7.S1 /* 137 */:
                        return kk7.M1;
                    case kk7.T1 /* 138 */:
                        return kk7.N1;
                    case kk7.U1 /* 139 */:
                        return kk7.O1;
                    case kk7.V1 /* 140 */:
                        return kk7.P1;
                    case kk7.W1 /* 141 */:
                        return 133;
                    case kk7.X1 /* 142 */:
                        return 134;
                    case kk7.Y1 /* 143 */:
                        return kk7.Q1;
                    case kk7.Z1 /* 144 */:
                        return kk7.R1;
                    case kk7.a2 /* 145 */:
                        return kk7.z1;
                    case kk7.b2 /* 146 */:
                        return kk7.A1;
                    case kk7.c2 /* 147 */:
                        return kk7.C1;
                    case kk7.d2 /* 148 */:
                        return kk7.S1;
                    case kk7.e2 /* 149 */:
                        return kk7.T1;
                    default:
                        return 0;
                }
        }
    }

    public static /* synthetic */ short e(int i) {
        switch (i) {
            case 1:
                return (short) 0;
            case 2:
                return (short) 1;
            case 3:
                return (short) 2;
            case 4:
                return (short) 3;
            case 5:
                return (short) 4;
            case 6:
                return (short) 5;
            case 7:
                return (short) 6;
            case 8:
                return (short) 7;
            case 9:
                return (short) 8;
            case 10:
                return (short) 9;
            case 11:
                return (short) 10;
            case 12:
                return (short) 11;
            case 13:
                return (short) 12;
            case 14:
                return (short) 13;
            case 15:
                return (short) 14;
            case 16:
                return (short) 15;
            case 17:
                return (short) 16;
            case 18:
                return (short) 17;
            case 19:
                return (short) 18;
            case 20:
                return (short) 19;
            case 21:
                return (short) 20;
            case 22:
                return (short) 21;
            case 23:
                return (short) 22;
            case 24:
                return (short) 23;
            case 25:
                return (short) 24;
            case 26:
                return (short) 25;
            case 27:
                return (short) 26;
            case 28:
                return (short) 27;
            case 29:
                return (short) 28;
            case kk7.S /* 30 */:
                return (short) 29;
            case 31:
                return (short) 30;
            case 32:
                return (short) 31;
            case 33:
                return (short) 32;
            case 34:
                return (short) 33;
            case 35:
                return (short) 34;
            case 36:
                return (short) 35;
            case 37:
                return (short) 36;
            case 38:
                return (short) 37;
            case 39:
                return (short) 38;
            case 40:
                return (short) 39;
            case 41:
                return (short) 40;
            case 42:
                return (short) 41;
            case 43:
                return (short) 42;
            case 44:
                return (short) 43;
            case 45:
                return (short) 44;
            case 46:
                return (short) 45;
            case 47:
                return (short) 46;
            case 48:
                return (short) 47;
            case 49:
                return (short) 48;
            case 50:
                return (short) 49;
            case kk7.n0 /* 51 */:
                return (short) 50;
            case kk7.o0 /* 52 */:
                return (short) 51;
            case kk7.p0 /* 53 */:
                return (short) 52;
            case kk7.q0 /* 54 */:
                return (short) 53;
            case kk7.r0 /* 55 */:
                return (short) 54;
            case 56:
                return (short) 55;
            case kk7.t0 /* 57 */:
                return (short) 56;
            case kk7.u0 /* 58 */:
                return (short) 57;
            case kk7.v0 /* 59 */:
                return (short) 58;
            case kk7.w0 /* 60 */:
                return (short) 59;
            case kk7.x0 /* 61 */:
                return (short) 60;
            case kk7.y0 /* 62 */:
                return (short) 61;
            case kk7.z0 /* 63 */:
                return (short) 62;
            case 64:
                return (short) 63;
            case 65:
                return (short) 64;
            case kk7.C0 /* 66 */:
                return (short) 65;
            case kk7.D0 /* 67 */:
                return (short) 66;
            case kk7.E0 /* 68 */:
                return (short) 67;
            case kk7.F0 /* 69 */:
                return (short) 68;
            case kk7.G0 /* 70 */:
                return (short) 69;
            case kk7.H0 /* 71 */:
                return (short) 70;
            case kk7.I0 /* 72 */:
                return (short) 71;
            case kk7.J0 /* 73 */:
                return (short) 72;
            case kk7.K0 /* 74 */:
                return (short) 73;
            case kk7.L0 /* 75 */:
                return (short) 74;
            case kk7.M0 /* 76 */:
                return (short) 75;
            case kk7.N0 /* 77 */:
                return (short) 76;
            case kk7.O0 /* 78 */:
                return (short) 77;
            case kk7.P0 /* 79 */:
                return (short) 78;
            case 80:
                return (short) 79;
            case kk7.R0 /* 81 */:
                return (short) 90;
            case kk7.S0 /* 82 */:
                return (short) 91;
            case kk7.T0 /* 83 */:
                return (short) 102;
            case kk7.U0 /* 84 */:
                return (short) 93;
            case kk7.V0 /* 85 */:
                return (short) 94;
            case kk7.W0 /* 86 */:
                return (short) 103;
            case kk7.X0 /* 87 */:
                return (short) 96;
            case kk7.Y0 /* 88 */:
                return (short) 97;
            case kk7.Z0 /* 89 */:
                return (short) 98;
            case kk7.a1 /* 90 */:
                return (short) 99;
            case kk7.b1 /* 91 */:
                return (short) 100;
            case kk7.c1 /* 92 */:
                return (short) 101;
            case kk7.d1 /* 93 */:
                return (short) 104;
            case kk7.e1 /* 94 */:
                return (short) 105;
            case kk7.f1 /* 95 */:
                return (short) 106;
            case 96:
                return (short) 107;
            case kk7.h1 /* 97 */:
                return (short) 108;
            case kk7.i1 /* 98 */:
                return (short) 109;
            case kk7.j1 /* 99 */:
                return (short) 110;
            case kk7.k1 /* 100 */:
                return (short) 111;
            case 101:
                return (short) 112;
            case kk7.m1 /* 102 */:
                return (short) 113;
            case kk7.n1 /* 103 */:
                return (short) 114;
            case kk7.o1 /* 104 */:
                return (short) 115;
            case kk7.p1 /* 105 */:
                return (short) 116;
            case kk7.q1 /* 106 */:
                return (short) 117;
            case kk7.r1 /* 107 */:
                return (short) 118;
            case kk7.s1 /* 108 */:
                return (short) 119;
            case kk7.t1 /* 109 */:
                return (short) 120;
            case kk7.u1 /* 110 */:
                return (short) 121;
            case kk7.v1 /* 111 */:
                return (short) 122;
            case kk7.w1 /* 112 */:
                return (short) 123;
            case kk7.x1 /* 113 */:
                return (short) 124;
            case kk7.y1 /* 114 */:
                return (short) 125;
            case kk7.z1 /* 115 */:
                return (short) 145;
            case kk7.A1 /* 116 */:
                return (short) 146;
            case kk7.B1 /* 117 */:
                return (short) 126;
            case kk7.C1 /* 118 */:
                return (short) 147;
            case kk7.D1 /* 119 */:
                return (short) 127;
            case 120:
                return (short) 128;
            case kk7.E1 /* 121 */:
                return (short) 129;
            case kk7.F1 /* 122 */:
                return (short) 130;
            case kk7.G1 /* 123 */:
                return (short) 131;
            case kk7.H1 /* 124 */:
                return (short) 132;
            case kk7.I1 /* 125 */:
                return (short) 133;
            case kk7.J1 /* 126 */:
                return (short) 134;
            case kk7.K1 /* 127 */:
                return (short) 135;
            case 128:
                return (short) 136;
            case kk7.M1 /* 129 */:
                return (short) 137;
            case kk7.N1 /* 130 */:
                return (short) 138;
            case kk7.O1 /* 131 */:
                return (short) 139;
            case kk7.P1 /* 132 */:
                return (short) 140;
            case 133:
                return (short) 141;
            case 134:
                return (short) 142;
            case kk7.Q1 /* 135 */:
                return (short) 143;
            case kk7.R1 /* 136 */:
                return (short) 144;
            case kk7.S1 /* 137 */:
                return (short) 148;
            case kk7.T1 /* 138 */:
                return (short) 149;
            default:
                throw null;
        }
    }

    public static float f(float f, float f2, float f3, float f4) {
        return Math.max(f4, Math.min(f3, f + f2));
    }

    public static int g(int i, int i2, int i3) {
        return cwd.b(i) + i2 + i3;
    }

    public static int h(int i, int i2, int i3, int i4) {
        return cwd.b(i) + i2 + i3 + i4;
    }

    public static u41 i(int i, wjb wjbVar, Context context, boolean z) {
        u41 u41Var = new u41(wjbVar, context, z);
        u41Var.setRoundRadius(i);
        return u41Var;
    }

    public static w84 j(int i, lv6 lv6Var) {
        bgd bgdVar = new bgd(i);
        HashMap hashMap = (HashMap) lv6Var.c;
        if (hashMap == null) {
            hashMap = new HashMap();
            lv6Var.c = hashMap;
        }
        hashMap.put(gid.class, bgdVar);
        return new w84((String) lv6Var.b, ((HashMap) lv6Var.c) == null ? Collections.EMPTY_MAP : DesugarCollections.unmodifiableMap(new HashMap((HashMap) lv6Var.c)));
    }

    public static String k(StringBuilder sb, String str, p38 p38Var) {
        sb.append(str);
        return p38Var.e(sb.toString());
    }

    public static StringBuilder l(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        sb.append(str5);
        return sb;
    }

    public static UnsupportedOperationException m(Parcel parcel) {
        bhd.b(parcel);
        return new UnsupportedOperationException();
    }

    public static HashMap n(Class cls, d6d d6dVar) {
        HashMap hashMap = new HashMap();
        hashMap.put(cls, d6dVar);
        return hashMap;
    }

    public static HashMap o(Class cls, b7d b7dVar) {
        HashMap hashMap = new HashMap();
        hashMap.put(cls, b7dVar);
        return hashMap;
    }

    public static HashMap p(Class cls, bgd bgdVar) {
        HashMap hashMap = new HashMap();
        hashMap.put(cls, bgdVar);
        return hashMap;
    }

    public static HashMap q(Class cls, cjd cjdVar) {
        HashMap hashMap = new HashMap();
        hashMap.put(cls, cjdVar);
        return hashMap;
    }

    public static d6d r(HashMap hashMap, int i) {
        DesugarCollections.unmodifiableMap(new HashMap(hashMap));
        return new d6d(i);
    }

    public static b7d s(HashMap hashMap, int i) {
        DesugarCollections.unmodifiableMap(new HashMap(hashMap));
        return new b7d(i);
    }

    public static bgd t(HashMap hashMap, int i) {
        DesugarCollections.unmodifiableMap(new HashMap(hashMap));
        return new bgd(i);
    }

    public static cjd u(HashMap hashMap, int i) {
        DesugarCollections.unmodifiableMap(new HashMap(hashMap));
        return new cjd(i);
    }

    public static void v(em4 em4Var, wxb wxbVar) {
        wxbVar.g(new fm4(em4Var));
    }

    public static /* synthetic */ void w(AutoCloseable autoCloseable) {
        if (autoCloseable instanceof AutoCloseable) {
            autoCloseable.close();
            return;
        }
        if (autoCloseable instanceof ExecutorService) {
            z2.k((ExecutorService) autoCloseable);
            return;
        }
        if (autoCloseable instanceof TypedArray) {
            ((TypedArray) autoCloseable).recycle();
            return;
        }
        if (autoCloseable instanceof MediaMetadataRetriever) {
            ((MediaMetadataRetriever) autoCloseable).release();
            return;
        }
        if (autoCloseable instanceof MediaDrm) {
            ((MediaDrm) autoCloseable).release();
            return;
        }
        if (autoCloseable instanceof DrmManagerClient) {
            ((DrmManagerClient) autoCloseable).release();
        } else if (autoCloseable instanceof ContentProviderClient) {
            ((ContentProviderClient) autoCloseable).release();
        } else {
            sc8.e();
        }
    }

    public static void x(String str, int i, u21 u21Var, wjb wjbVar) {
        u21Var.t(k96.M0(i, str), wjbVar).j();
    }

    public static void y(HashMap hashMap) {
        DesugarCollections.unmodifiableMap(new HashMap(hashMap));
    }

    public static float z(float f, float f2, float f3, float f4) {
        return ((f * f2) + f3) * f4;
    }
}
