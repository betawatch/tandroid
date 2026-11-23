package p4;

import a8.ma;
import android.os.Bundle;
import android.text.TextUtils;
import e2.q1;
import h9.s1;
import j$.util.Objects;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class d {
    public static final String h;
    public static final String i;
    public static final String j;
    public static final String k;
    public static final String l;
    public static final String m;
    public static final String n;
    public final j1 a;
    public final int b;
    public final int c;
    public final Bundle d;
    public final l9.a e;
    public final boolean f;
    public final Object g;

    static {
        String str = h2.l0.a;
        h = Integer.toString(0, 36);
        i = Integer.toString(1, 36);
        j = Integer.toString(2, 36);
        Integer.toString(3, 36);
        k = Integer.toString(4, 36);
        l = Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
        m = Integer.toString(8, 36);
        n = Integer.toString(9, 36);
    }

    public d(j1 j1Var, int i7, int i10, Bundle bundle, boolean z10, l9.a aVar, Object obj) {
        this.a = j1Var;
        this.b = i7;
        this.c = i10;
        this.d = new Bundle(bundle);
        this.f = z10;
        this.e = aVar;
        this.g = obj;
    }

    public static Object a(int i7, Object obj) {
        if (obj == null) {
            return null;
        }
        switch (i7) {
            case 1:
                if (obj instanceof Integer) {
                    obj = Long.valueOf(((Integer) obj).longValue());
                }
                ma.e("Parameter has incorrect type.", obj instanceof Long);
                break;
            case 2:
                ma.e("Parameter has incorrect type.", obj instanceof Integer);
                break;
            case 3:
                ma.e("Parameter has incorrect type.", obj instanceof Boolean);
                break;
            case 4:
                if (obj instanceof Double) {
                    obj = Float.valueOf(((Double) obj).floatValue());
                }
                ma.e("Parameter has incorrect type.", obj instanceof Float);
                break;
            case 5:
                ma.e("Parameter has incorrect type.", obj instanceof e2.d1);
                break;
            case 6:
                ma.e("Parameter has incorrect type.", obj instanceof e2.l0);
                break;
            case 7:
                ma.e("Parameter has incorrect type.", obj instanceof e2.o0);
                break;
            case 8:
                ma.e("Parameter has incorrect type.", obj instanceof q1);
                break;
        }
        return obj;
    }

    public static boolean c(int i7, List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (((d) list.get(i10)).e.b(0) == i7) {
                return true;
            }
        }
        return false;
    }

    public static d d(j1 j1Var) {
        String str = j1Var.b;
        Bundle bundle = j1Var.c;
        if (str.startsWith("androidx.media3.session.PLAYER_COMMAND_")) {
            int parseInt = Integer.parseInt(str.substring(39));
            Object h7 = h(i(parseInt), bundle);
            c cVar = new c();
            ma.e("sessionCommand is already set. Only one of sessionCommand and playerCommand should be set.", ((j1) cVar.d) == null);
            cVar.a = parseInt;
            cVar.g = a(i(parseInt), h7);
            return cVar.a();
        }
        int parseInt2 = Integer.parseInt(str.substring(40));
        Object h10 = h(parseInt2 == 40010 ? 5 : 0, bundle);
        c cVar2 = new c();
        j1 j1Var2 = new j1(parseInt2);
        ma.e("playerCommands is already set. Only one of sessionCommand and playerCommand should be set.", cVar2.a == -1);
        cVar2.d = j1Var2;
        cVar2.g = a(j1Var2.a == 40010 ? 5 : 0, h10);
        return cVar2.a();
    }

    public static s1 g(List list) {
        int b10;
        if (list.isEmpty()) {
            h9.g0 g0Var = h9.i0.b;
            return s1.e;
        }
        int i7 = -1;
        int i10 = -1;
        for (int i11 = 0; i11 < list.size(); i11++) {
            d dVar = (d) list.get(i11);
            boolean z10 = dVar.f;
            l9.a aVar = dVar.e;
            if (z10 && dVar.b()) {
                int i12 = 0;
                while (true) {
                    if (i12 < aVar.b && (b10 = aVar.b(i12)) != 6) {
                        if (i7 == -1 && b10 == 2) {
                            i7 = i11;
                            break;
                        }
                        if (i10 == -1 && b10 == 3) {
                            i10 = i11;
                            break;
                        }
                        i12++;
                    }
                }
            }
        }
        h9.f0 p10 = h9.i0.p();
        if (i7 != -1) {
            p10.c(((d) list.get(i7)).e(2));
        }
        if (i10 != -1) {
            p10.c(((d) list.get(i10)).e(3));
        }
        for (int i13 = 0; i13 < list.size(); i13++) {
            d dVar2 = (d) list.get(i13);
            if (dVar2.f && dVar2.b() && i13 != i7 && i13 != i10 && dVar2.e.a(6)) {
                p10.c(dVar2.e(6));
            }
        }
        return p10.f();
    }

    public static Object h(int i7, Bundle bundle) {
        if (!bundle.containsKey("androidx.media3.session.CUSTOM_COMMAND_PARAMETER")) {
            return null;
        }
        switch (i7) {
            case 1:
                return Long.valueOf(bundle.getLong("androidx.media3.session.CUSTOM_COMMAND_PARAMETER"));
            case 2:
                return Integer.valueOf(bundle.getInt("androidx.media3.session.CUSTOM_COMMAND_PARAMETER"));
            case 3:
                return Boolean.valueOf(bundle.getBoolean("androidx.media3.session.CUSTOM_COMMAND_PARAMETER"));
            case 4:
                return Float.valueOf(bundle.getFloat("androidx.media3.session.CUSTOM_COMMAND_PARAMETER"));
            case 5:
                Bundle bundle2 = bundle.getBundle("androidx.media3.session.CUSTOM_COMMAND_PARAMETER");
                bundle2.getClass();
                return e2.d1.a(bundle2);
            case 6:
                Bundle bundle3 = bundle.getBundle("androidx.media3.session.CUSTOM_COMMAND_PARAMETER");
                bundle3.getClass();
                return e2.l0.a(9, bundle3);
            case 7:
                Bundle bundle4 = bundle.getBundle("androidx.media3.session.CUSTOM_COMMAND_PARAMETER");
                bundle4.getClass();
                return e2.o0.b(9, bundle4);
            case 8:
                Bundle bundle5 = bundle.getBundle("androidx.media3.session.CUSTOM_COMMAND_PARAMETER");
                bundle5.getClass();
                return q1.b(bundle5);
            default:
                return null;
        }
    }

    public static int i(int i7) {
        if (i7 == 1) {
            return 3;
        }
        if (i7 == 5) {
            return 1;
        }
        if (i7 == 10) {
            return 2;
        }
        if (i7 == 19) {
            return 7;
        }
        if (i7 == 24) {
            return 4;
        }
        if (i7 == 29) {
            return 8;
        }
        if (i7 == 31) {
            return 6;
        }
        switch (i7) {
            case 13:
                return 4;
            case 14:
                return 3;
            case 15:
                return 2;
            default:
                return 0;
        }
    }

    public static boolean j(String str) {
        return str.startsWith("androidx.media3.session.PLAYER_COMMAND_") || str.startsWith("androidx.media3.session.SESSION_COMMAND_");
    }

    public final boolean b() {
        Object obj = this.g;
        j1 j1Var = this.a;
        if (j1Var != null) {
            int i7 = j1Var.a;
            if (i7 != 0) {
                return i7 == 40010 && obj != null;
            }
            return true;
        }
        int i10 = this.b;
        if (i10 != 19) {
            if (i10 != 24) {
                if (i10 != 29 && i10 != 31) {
                    switch (i10) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 11:
                        case 12:
                        case 14:
                            break;
                        case 5:
                        case 10:
                        case 13:
                        case 15:
                            break;
                        default:
                            return false;
                    }
                }
            }
            return true;
        }
        return obj != null;
    }

    public final d e(int i7) {
        String str;
        j1 j1Var = this.a;
        if (j1Var != null && j1Var.a == 0) {
            l9.a aVar = new l9.a(new int[]{i7});
            if (this.e.equals(aVar)) {
                return this;
            }
            return new d(this.a, this.b, this.c, new Bundle(this.d), this.f, aVar, this.g);
        }
        Bundle bundle = Bundle.EMPTY;
        if (this.g != null) {
            bundle = new Bundle();
            l("androidx.media3.session.CUSTOM_COMMAND_PARAMETER", 9, bundle);
        }
        if (j1Var != null) {
            str = "androidx.media3.session.SESSION_COMMAND_" + j1Var.a;
        } else {
            str = "androidx.media3.session.PLAYER_COMMAND_" + this.b;
        }
        return new d(new j1(str, bundle), -1, this.c, this.d, this.f, new l9.a(new int[]{i7}), null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Objects.equals(this.a, dVar.a) && this.b == dVar.b && this.c == dVar.c && TextUtils.equals("", "") && this.f == dVar.f && this.e.equals(dVar.e) && Objects.equals(this.g, dVar.g);
    }

    public final void f(e2.c1 c1Var) {
        if (this.f) {
            Object obj = this.g;
            int i7 = this.b;
            if (i7 == 19) {
                if (obj != null) {
                    c1Var.L0((e2.o0) obj);
                    return;
                }
                return;
            }
            if (i7 == 24) {
                if (obj != null) {
                    c1Var.U(((Float) obj).floatValue());
                    return;
                } else if (c1Var.G() == 0.0f) {
                    c1Var.d0();
                    return;
                } else {
                    c1Var.C0();
                    return;
                }
            }
            if (i7 == 29) {
                if (obj != null) {
                    c1Var.r0((q1) obj);
                    return;
                }
                return;
            }
            if (i7 == 31) {
                if (obj != null) {
                    c1Var.n0((e2.l0) obj);
                    return;
                }
                return;
            }
            switch (i7) {
                case 1:
                    if (obj == null) {
                        c1Var.Y(!c1Var.v());
                        break;
                    } else {
                        c1Var.Y(((Boolean) obj).booleanValue());
                        break;
                    }
                case 2:
                    c1Var.a();
                    break;
                case 3:
                    c1Var.stop();
                    break;
                case 4:
                    c1Var.H();
                    break;
                case 5:
                    if (obj != null) {
                        c1Var.c(((Long) obj).longValue());
                        break;
                    }
                    break;
                case 6:
                    c1Var.F();
                    break;
                case 7:
                    c1Var.V();
                    break;
                case 8:
                    c1Var.h0();
                    break;
                case 9:
                    c1Var.I0();
                    break;
                case 10:
                    if (obj != null) {
                        c1Var.Z(((Integer) obj).intValue());
                        break;
                    }
                    break;
                case 11:
                    c1Var.M0();
                    break;
                case 12:
                    c1Var.K0();
                    break;
                case 13:
                    if (obj != null) {
                        c1Var.d(((Float) obj).floatValue());
                        break;
                    }
                    break;
                case 14:
                    if (obj == null) {
                        c1Var.y(!c1Var.E0());
                        break;
                    } else {
                        c1Var.y(((Boolean) obj).booleanValue());
                        break;
                    }
                case 15:
                    if (obj != null) {
                        c1Var.k(((Integer) obj).intValue());
                        break;
                    }
                    break;
            }
        }
    }

    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(this.b), 0, Integer.valueOf(this.c), "", Boolean.valueOf(this.f), null, this.e, this.g);
    }

    public final Bundle k(int i7) {
        Bundle bundle = new Bundle();
        j1 j1Var = this.a;
        if (j1Var != null) {
            bundle.putBundle(h, j1Var.a());
        }
        int i10 = this.b;
        if (i10 != -1) {
            bundle.putInt(i, i10);
        }
        int i11 = this.c;
        if (i11 != 0) {
            bundle.putInt(j, i11);
        }
        Bundle bundle2 = this.d;
        if (!bundle2.isEmpty()) {
            bundle.putBundle(k, bundle2);
        }
        boolean z10 = this.f;
        if (!z10) {
            bundle.putBoolean(l, z10);
        }
        l9.a aVar = this.e;
        if (aVar.b != 1 || aVar.b(0) != 6) {
            bundle.putIntArray(m, Arrays.copyOfRange(aVar.a, 0, aVar.b));
        }
        if (this.g != null) {
            l(n, i7, bundle);
        }
        return bundle;
    }

    public final void l(String str, int i7, Bundle bundle) {
        j1 j1Var = this.a;
        int i10 = j1Var != null ? j1Var.a == 40010 ? 5 : 0 : i(this.b);
        Object obj = this.g;
        switch (i10) {
            case 1:
                bundle.putLong(str, ((Long) obj).longValue());
                break;
            case 2:
                bundle.putInt(str, ((Integer) obj).intValue());
                break;
            case 3:
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
                break;
            case 4:
                bundle.putFloat(str, ((Float) obj).floatValue());
                break;
            case 5:
                bundle.putBundle(str, ((e2.d1) obj).c());
                break;
            case 6:
                bundle.putBundle(str, ((e2.l0) obj).c(i7, false));
                break;
            case 7:
                bundle.putBundle(str, ((e2.o0) obj).c(i7));
                break;
            case 8:
                bundle.putBundle(str, ((q1) obj).c());
                break;
        }
    }
}
