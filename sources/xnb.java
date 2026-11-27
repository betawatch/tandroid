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

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class xnb {
    public static int A(int i, int i2, int i3) {
        return coe.t(i) + i2 + i3;
    }

    public static float B(float f, float f2, float f3, float f4) {
        return (f3 - (f * f2)) * f4;
    }

    public static float C(float f, float f2, float f3, float f4) {
        return f * f2 * f3 * f4;
    }

    public static nhc a(qhc qhcVar, ki2 ki2Var, e23 e23Var) {
        e23Var.getClass();
        Class a = ki2Var.a();
        a.getClass();
        return qhcVar.g(a, e23Var);
    }

    public static void b(x1c x1cVar, ey7 ey7Var, int i) {
        x1cVar.b(ey7Var, i, 0);
    }

    public static final void c(int i, Runnable runnable) {
        ((b99) ri6.v().b).post(runnable);
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
            case jn7.S /* 30 */:
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
            case jn7.n0 /* 51 */:
                return 52;
            case jn7.o0 /* 52 */:
                return 53;
            case jn7.p0 /* 53 */:
                return 54;
            case jn7.q0 /* 54 */:
                return 55;
            case jn7.r0 /* 55 */:
                return 56;
            case 56:
                return 57;
            case jn7.t0 /* 57 */:
                return 58;
            case jn7.u0 /* 58 */:
                return 59;
            case jn7.v0 /* 59 */:
                return 60;
            case jn7.w0 /* 60 */:
                return 61;
            case jn7.x0 /* 61 */:
                return 62;
            case jn7.y0 /* 62 */:
                return 63;
            case jn7.z0 /* 63 */:
                return 64;
            case 64:
                return 65;
            case 65:
                return 66;
            case jn7.C0 /* 66 */:
                return 67;
            case jn7.D0 /* 67 */:
                return 68;
            case jn7.E0 /* 68 */:
                return 69;
            case jn7.F0 /* 69 */:
                return 70;
            case jn7.G0 /* 70 */:
                return 71;
            case jn7.H0 /* 71 */:
                return 72;
            case jn7.I0 /* 72 */:
                return 73;
            case jn7.J0 /* 73 */:
                return 74;
            case jn7.K0 /* 74 */:
                return 75;
            case jn7.L0 /* 75 */:
                return 76;
            case jn7.M0 /* 76 */:
                return 77;
            case jn7.N0 /* 77 */:
                return 78;
            case jn7.O0 /* 78 */:
                return 79;
            case jn7.P0 /* 79 */:
                return 80;
            default:
                switch (i) {
                    case 96:
                        return 87;
                    case jn7.h1 /* 97 */:
                        return 88;
                    case jn7.i1 /* 98 */:
                        return 89;
                    case jn7.j1 /* 99 */:
                        return 90;
                    case jn7.k1 /* 100 */:
                        return 91;
                    case 101:
                        return 92;
                    case jn7.m1 /* 102 */:
                        return 83;
                    case jn7.n1 /* 103 */:
                        return 86;
                    case jn7.o1 /* 104 */:
                        return 93;
                    case jn7.p1 /* 105 */:
                        return 94;
                    case jn7.q1 /* 106 */:
                        return 95;
                    case jn7.r1 /* 107 */:
                        return 96;
                    case jn7.s1 /* 108 */:
                        return 97;
                    case jn7.t1 /* 109 */:
                        return 98;
                    case jn7.u1 /* 110 */:
                        return 99;
                    case jn7.v1 /* 111 */:
                        return 100;
                    case jn7.w1 /* 112 */:
                        return 101;
                    case jn7.x1 /* 113 */:
                        return jn7.m1;
                    case jn7.y1 /* 114 */:
                        return jn7.n1;
                    case jn7.z1 /* 115 */:
                        return jn7.o1;
                    case jn7.A1 /* 116 */:
                        return jn7.p1;
                    case jn7.B1 /* 117 */:
                        return jn7.q1;
                    case jn7.C1 /* 118 */:
                        return jn7.r1;
                    case jn7.D1 /* 119 */:
                        return jn7.s1;
                    case jn7.E1 /* 120 */:
                        return jn7.t1;
                    case 121:
                        return jn7.u1;
                    case jn7.F1 /* 122 */:
                        return jn7.v1;
                    case jn7.G1 /* 123 */:
                        return jn7.w1;
                    case jn7.H1 /* 124 */:
                        return jn7.x1;
                    case jn7.I1 /* 125 */:
                        return jn7.y1;
                    case jn7.J1 /* 126 */:
                        return jn7.B1;
                    case jn7.K1 /* 127 */:
                        return jn7.D1;
                    case 128:
                        return jn7.E1;
                    case jn7.M1 /* 129 */:
                        return 121;
                    case jn7.N1 /* 130 */:
                        return jn7.F1;
                    case jn7.O1 /* 131 */:
                        return jn7.G1;
                    case jn7.P1 /* 132 */:
                        return jn7.H1;
                    case jn7.Q1 /* 133 */:
                        return jn7.I1;
                    case 134:
                        return jn7.J1;
                    case 135:
                        return jn7.K1;
                    case jn7.R1 /* 136 */:
                        return 128;
                    case jn7.S1 /* 137 */:
                        return jn7.M1;
                    case jn7.T1 /* 138 */:
                        return jn7.N1;
                    case jn7.U1 /* 139 */:
                        return jn7.O1;
                    case jn7.V1 /* 140 */:
                        return jn7.P1;
                    case jn7.W1 /* 141 */:
                        return jn7.Q1;
                    case jn7.X1 /* 142 */:
                        return 134;
                    case jn7.Y1 /* 143 */:
                        return 135;
                    case jn7.Z1 /* 144 */:
                        return jn7.R1;
                    case jn7.a2 /* 145 */:
                        return jn7.z1;
                    case jn7.b2 /* 146 */:
                        return jn7.A1;
                    case jn7.c2 /* 147 */:
                        return jn7.C1;
                    case jn7.d2 /* 148 */:
                        return jn7.S1;
                    case jn7.e2 /* 149 */:
                        return jn7.T1;
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
            case jn7.S /* 30 */:
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
            case jn7.n0 /* 51 */:
                return (short) 50;
            case jn7.o0 /* 52 */:
                return (short) 51;
            case jn7.p0 /* 53 */:
                return (short) 52;
            case jn7.q0 /* 54 */:
                return (short) 53;
            case jn7.r0 /* 55 */:
                return (short) 54;
            case 56:
                return (short) 55;
            case jn7.t0 /* 57 */:
                return (short) 56;
            case jn7.u0 /* 58 */:
                return (short) 57;
            case jn7.v0 /* 59 */:
                return (short) 58;
            case jn7.w0 /* 60 */:
                return (short) 59;
            case jn7.x0 /* 61 */:
                return (short) 60;
            case jn7.y0 /* 62 */:
                return (short) 61;
            case jn7.z0 /* 63 */:
                return (short) 62;
            case 64:
                return (short) 63;
            case 65:
                return (short) 64;
            case jn7.C0 /* 66 */:
                return (short) 65;
            case jn7.D0 /* 67 */:
                return (short) 66;
            case jn7.E0 /* 68 */:
                return (short) 67;
            case jn7.F0 /* 69 */:
                return (short) 68;
            case jn7.G0 /* 70 */:
                return (short) 69;
            case jn7.H0 /* 71 */:
                return (short) 70;
            case jn7.I0 /* 72 */:
                return (short) 71;
            case jn7.J0 /* 73 */:
                return (short) 72;
            case jn7.K0 /* 74 */:
                return (short) 73;
            case jn7.L0 /* 75 */:
                return (short) 74;
            case jn7.M0 /* 76 */:
                return (short) 75;
            case jn7.N0 /* 77 */:
                return (short) 76;
            case jn7.O0 /* 78 */:
                return (short) 77;
            case jn7.P0 /* 79 */:
                return (short) 78;
            case 80:
                return (short) 79;
            case jn7.R0 /* 81 */:
                return (short) 90;
            case jn7.S0 /* 82 */:
                return (short) 91;
            case jn7.T0 /* 83 */:
                return (short) 102;
            case jn7.U0 /* 84 */:
                return (short) 93;
            case jn7.V0 /* 85 */:
                return (short) 94;
            case jn7.W0 /* 86 */:
                return (short) 103;
            case jn7.X0 /* 87 */:
                return (short) 96;
            case jn7.Y0 /* 88 */:
                return (short) 97;
            case jn7.Z0 /* 89 */:
                return (short) 98;
            case jn7.a1 /* 90 */:
                return (short) 99;
            case jn7.b1 /* 91 */:
                return (short) 100;
            case jn7.c1 /* 92 */:
                return (short) 101;
            case jn7.d1 /* 93 */:
                return (short) 104;
            case jn7.e1 /* 94 */:
                return (short) 105;
            case jn7.f1 /* 95 */:
                return (short) 106;
            case 96:
                return (short) 107;
            case jn7.h1 /* 97 */:
                return (short) 108;
            case jn7.i1 /* 98 */:
                return (short) 109;
            case jn7.j1 /* 99 */:
                return (short) 110;
            case jn7.k1 /* 100 */:
                return (short) 111;
            case 101:
                return (short) 112;
            case jn7.m1 /* 102 */:
                return (short) 113;
            case jn7.n1 /* 103 */:
                return (short) 114;
            case jn7.o1 /* 104 */:
                return (short) 115;
            case jn7.p1 /* 105 */:
                return (short) 116;
            case jn7.q1 /* 106 */:
                return (short) 117;
            case jn7.r1 /* 107 */:
                return (short) 118;
            case jn7.s1 /* 108 */:
                return (short) 119;
            case jn7.t1 /* 109 */:
                return (short) 120;
            case jn7.u1 /* 110 */:
                return (short) 121;
            case jn7.v1 /* 111 */:
                return (short) 122;
            case jn7.w1 /* 112 */:
                return (short) 123;
            case jn7.x1 /* 113 */:
                return (short) 124;
            case jn7.y1 /* 114 */:
                return (short) 125;
            case jn7.z1 /* 115 */:
                return (short) 145;
            case jn7.A1 /* 116 */:
                return (short) 146;
            case jn7.B1 /* 117 */:
                return (short) 126;
            case jn7.C1 /* 118 */:
                return (short) 147;
            case jn7.D1 /* 119 */:
                return (short) 127;
            case jn7.E1 /* 120 */:
                return (short) 128;
            case 121:
                return (short) 129;
            case jn7.F1 /* 122 */:
                return (short) 130;
            case jn7.G1 /* 123 */:
                return (short) 131;
            case jn7.H1 /* 124 */:
                return (short) 132;
            case jn7.I1 /* 125 */:
                return (short) 133;
            case jn7.J1 /* 126 */:
                return (short) 134;
            case jn7.K1 /* 127 */:
                return (short) 135;
            case 128:
                return (short) 136;
            case jn7.M1 /* 129 */:
                return (short) 137;
            case jn7.N1 /* 130 */:
                return (short) 138;
            case jn7.O1 /* 131 */:
                return (short) 139;
            case jn7.P1 /* 132 */:
                return (short) 140;
            case jn7.Q1 /* 133 */:
                return (short) 141;
            case 134:
                return (short) 142;
            case 135:
                return (short) 143;
            case jn7.R1 /* 136 */:
                return (short) 144;
            case jn7.S1 /* 137 */:
                return (short) 148;
            case jn7.T1 /* 138 */:
                return (short) 149;
            default:
                throw null;
        }
    }

    public static float f(float f, float f2, float f3, float f4) {
        return Math.max(f4, Math.min(f3, f + f2));
    }

    public static int g(int i, int i2, int i3) {
        return s0e.b(i) + i2 + i3;
    }

    public static int h(int i, int i2, int i3, int i4) {
        return s0e.b(i) + i2 + i3 + i4;
    }

    public static c51 i(int i, vnb vnbVar, Context context, boolean z) {
        c51 c51Var = new c51(vnbVar, context, z);
        c51Var.setRoundRadius(i);
        return c51Var;
    }

    public static sa4 j(int i, lh2 lh2Var) {
        skd skdVar = new skd(i);
        HashMap hashMap = (HashMap) lh2Var.c;
        if (hashMap == null) {
            hashMap = new HashMap();
            lh2Var.c = hashMap;
        }
        hashMap.put(xmd.class, skdVar);
        return new sa4((String) lh2Var.b, ((HashMap) lh2Var.c) == null ? Collections.EMPTY_MAP : DesugarCollections.unmodifiableMap(new HashMap((HashMap) lh2Var.c)));
    }

    public static String k(StringBuilder sb, String str, f78 f78Var) {
        sb.append(str);
        return f78Var.e(sb.toString());
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
        sld.b(parcel);
        return new UnsupportedOperationException();
    }

    public static HashMap n(Class cls, wad wadVar) {
        HashMap hashMap = new HashMap();
        hashMap.put(cls, wadVar);
        return hashMap;
    }

    public static HashMap o(Class cls, ubd ubdVar) {
        HashMap hashMap = new HashMap();
        hashMap.put(cls, ubdVar);
        return hashMap;
    }

    public static HashMap p(Class cls, skd skdVar) {
        HashMap hashMap = new HashMap();
        hashMap.put(cls, skdVar);
        return hashMap;
    }

    public static HashMap q(Class cls, tnd tndVar) {
        HashMap hashMap = new HashMap();
        hashMap.put(cls, tndVar);
        return hashMap;
    }

    public static wad r(HashMap hashMap, int i) {
        DesugarCollections.unmodifiableMap(new HashMap(hashMap));
        return new wad(i);
    }

    public static ubd s(HashMap hashMap, int i) {
        DesugarCollections.unmodifiableMap(new HashMap(hashMap));
        return new ubd(i);
    }

    public static skd t(HashMap hashMap, int i) {
        DesugarCollections.unmodifiableMap(new HashMap(hashMap));
        return new skd(i);
    }

    public static tnd u(HashMap hashMap, int i) {
        DesugarCollections.unmodifiableMap(new HashMap(hashMap));
        return new tnd(i);
    }

    public static void v(jo4 jo4Var, x1c x1cVar) {
        x1cVar.g(new ko4(jo4Var));
    }

    public static /* synthetic */ void w(AutoCloseable autoCloseable) {
        if (autoCloseable instanceof AutoCloseable) {
            autoCloseable.close();
            return;
        }
        if (autoCloseable instanceof ExecutorService) {
            a3.k((ExecutorService) autoCloseable);
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
            iy8.d();
        }
    }

    public static void x(String str, int i, d31 d31Var, vnb vnbVar) {
        d31Var.t(ob6.M0(i, str), vnbVar).j();
    }

    public static void y(HashMap hashMap) {
        DesugarCollections.unmodifiableMap(new HashMap(hashMap));
    }

    public static float z(float f, float f2, float f3, float f4) {
        return ((f * f2) + f3) * f4;
    }
}
