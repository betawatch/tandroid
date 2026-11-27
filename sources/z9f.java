// default package

import android.content.SharedPreferences;
import android.os.Looper;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class z9f {
    public static final he6 i = new he6("FeatureUsageAnalytics", null);
    public static final String j = "21.4.0";
    public static z9f k;
    public final wae a;
    public final SharedPreferences b;
    public final String c;
    public long h;
    public final HashSet f = new HashSet();
    public final HashSet g = new HashSet();
    public final b99 e = new b99(Looper.getMainLooper(), (byte) 3);
    public final dhe d = new dhe(this, (byte) 1);

    public z9f(SharedPreferences sharedPreferences, wae waeVar, String str) {
        this.b = sharedPreferences;
        this.a = waeVar;
        this.c = str;
    }

    public static void a(b6f b6fVar) {
        z9f z9fVar;
        if (!wae.j || (z9fVar = k) == null) {
            return;
        }
        SharedPreferences sharedPreferences = z9fVar.b;
        String num = Integer.toString(b6fVar.a);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        String i2 = c00.i("feature_usage_timestamp_reported_feature_", num);
        if (!sharedPreferences.contains(i2)) {
            i2 = c00.i("feature_usage_timestamp_detected_feature_", num);
        }
        edit.putLong(i2, System.currentTimeMillis()).apply();
        z9fVar.f.add(b6fVar);
        z9fVar.e.post(z9fVar.d);
    }

    public static b6f b(String str) {
        switch (Integer.parseInt(str)) {
            case 0:
                return b6f.b;
            case 1:
                return b6f.c;
            case 2:
                return b6f.d;
            case 3:
                return b6f.e;
            case 4:
                return b6f.f;
            case 5:
                return b6f.h;
            case 6:
                return b6f.n;
            case 7:
                return b6f.r;
            case 8:
                return b6f.s;
            case 9:
                return b6f.w;
            case 10:
                return b6f.x;
            case 11:
                return b6f.y;
            case 12:
                return b6f.E;
            case 13:
                return b6f.F;
            case 14:
                return b6f.G;
            case 15:
                return b6f.H;
            case 16:
                return b6f.I;
            case 17:
                return b6f.J;
            case 18:
                return b6f.K;
            case 19:
                return b6f.L;
            case 20:
                return b6f.M;
            case 21:
                return b6f.N;
            case 22:
                return b6f.O;
            case 23:
                return b6f.P;
            case 24:
                return b6f.Q;
            case 25:
                return b6f.R;
            case 26:
                return b6f.S;
            case 27:
                return b6f.T;
            case 28:
                return b6f.U;
            case 29:
                return b6f.V;
            case jn7.S /* 30 */:
                return b6f.W;
            case 31:
                return b6f.X;
            case 32:
                return b6f.Y;
            case 33:
                return b6f.Z;
            case 34:
                return b6f.a0;
            case 35:
                return b6f.b0;
            case 36:
                return b6f.c0;
            case 37:
                return b6f.d0;
            case 38:
                return b6f.e0;
            case 39:
                return b6f.f0;
            case 40:
                return b6f.g0;
            case 41:
                return b6f.h0;
            case 42:
                return b6f.i0;
            case 43:
                return b6f.j0;
            case 44:
                return b6f.k0;
            case 45:
                return b6f.l0;
            case 46:
                return b6f.m0;
            case 47:
                return b6f.n0;
            case 48:
                return b6f.o0;
            case 49:
                return b6f.p0;
            case 50:
                return b6f.q0;
            case jn7.n0 /* 51 */:
                return b6f.r0;
            case jn7.o0 /* 52 */:
                return b6f.s0;
            case jn7.p0 /* 53 */:
                return b6f.t0;
            case jn7.q0 /* 54 */:
                return b6f.u0;
            case jn7.r0 /* 55 */:
                return b6f.v0;
            default:
                return null;
        }
    }

    public final void c(HashSet hashSet) {
        if (hashSet.isEmpty()) {
            return;
        }
        SharedPreferences.Editor edit = this.b.edit();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            edit.remove((String) it.next());
        }
        edit.apply();
    }
}
