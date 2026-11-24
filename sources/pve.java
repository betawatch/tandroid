// default package

import android.content.SharedPreferences;
import android.util.LongSparseArray;
import org.telegram.messenger.a;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class pve {
    public static tr9 a;
    public static tr9 b;
    public static tr9 c;

    public static tr9 a(int i) {
        if (i == 1) {
            return a;
        }
        if (i == 2) {
            return b;
        }
        if (i == 4) {
            return c;
        }
        return null;
    }

    public static void b(SharedPreferences sharedPreferences) {
        int i = (sharedPreferences.getBoolean("save_gallery", false) && e21.b) ? 7 : sharedPreferences.getInt("save_gallery_flags", -1);
        if (i != -1) {
            sharedPreferences.edit().remove("save_gallery").remove("save_gallery_flags").apply();
            tr9 tr9Var = new tr9();
            a = tr9Var;
            boolean z = (i & 1) != 0;
            tr9Var.b = z;
            tr9Var.a = z;
            tr9Var.c = 104857600L;
            tr9Var.e("user", sharedPreferences);
            tr9 tr9Var2 = new tr9();
            b = tr9Var2;
            tr9 tr9Var3 = a;
            boolean z2 = (i & 2) != 0;
            tr9Var3.b = z2;
            tr9Var2.a = z2;
            tr9Var2.c = 104857600L;
            tr9Var2.e("groups", sharedPreferences);
            tr9 tr9Var4 = new tr9();
            c = tr9Var4;
            boolean z3 = (i & 4) != 0;
            tr9Var4.b = z3;
            tr9Var4.a = z3;
            tr9Var4.c = 104857600L;
            tr9Var4.e("channels", sharedPreferences);
        } else {
            a = tr9.d("user", sharedPreferences);
            b = tr9.d("groups", sharedPreferences);
            c = tr9.d("channels", sharedPreferences);
        }
        a.d = (byte) 1;
        b.d = (byte) 2;
        c.d = (byte) 4;
    }

    public static LongSparseArray c(SharedPreferences sharedPreferences) {
        LongSparseArray longSparseArray = new LongSparseArray();
        int i = sharedPreferences.getInt("count", 0);
        for (int i2 = 0; i2 < i; i2++) {
            rr9 rr9Var = new rr9();
            rr9Var.d = sharedPreferences.getLong(i2 + "_dialog_id", 0L);
            rr9Var.a = sharedPreferences.getBoolean(i2 + "_photo", false);
            rr9Var.b = sharedPreferences.getBoolean(i2 + "_video", false);
            rr9Var.c = sharedPreferences.getLong(i2 + "_limitVideo", 104857600L);
            long j = rr9Var.d;
            if (j != 0) {
                longSparseArray.put(j, rr9Var);
            }
        }
        return longSparseArray;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003b, code lost:
    
        if (k47.K4(r9.k) == false) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean d(int i, kc4 kc4Var, k47 k47Var, int i2) {
        tr9 tr9Var;
        boolean z;
        if (i == 1) {
            tr9Var = a;
        } else {
            if (i != 4) {
                if (i == 2) {
                    tr9Var = b;
                }
            }
            tr9Var = c;
        }
        tr9Var.getClass();
        rr9 rr9Var = (rr9) z8c.h(i2).l(tr9Var.d).get(kc4Var.a);
        if (k47Var != null) {
            if (!k47Var.O3() && !k47Var.k4()) {
            }
        }
        if (kc4Var.c != 3) {
            z = false;
            long S1 = k47Var == null ? k47Var.S1() : kc4Var.d;
            boolean z2 = tr9Var.b;
            boolean z3 = tr9Var.a;
            long j = tr9Var.c;
            if (rr9Var != null) {
                z2 = rr9Var.b;
                z3 = rr9Var.a;
                j = rr9Var.c;
            }
            return z ? z3 : !(!z2 || (j != -1 && S1 >= j));
        }
        z = true;
        if (k47Var == null) {
        }
        boolean z22 = tr9Var.b;
        boolean z32 = tr9Var.a;
        long j2 = tr9Var.c;
        if (rr9Var != null) {
        }
        if (z) {
        }
    }

    public static void e(SharedPreferences sharedPreferences, LongSparseArray longSparseArray) {
        sharedPreferences.edit().clear().apply();
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putInt("count", longSparseArray.size());
        for (int i = 0; i < longSparseArray.size(); i++) {
            rr9 rr9Var = (rr9) longSparseArray.valueAt(i);
            edit.putLong(aq1.n(i, "_dialog_id"), rr9Var.d);
            edit.putBoolean(i + "_photo", rr9Var.a);
            edit.putBoolean(i + "_video", rr9Var.b);
            edit.putLong(i + "_limitVideo", rr9Var.c);
        }
        edit.apply();
    }

    public static void f(int i) {
        SharedPreferences sharedPreferences = a.b.getSharedPreferences("mainconfig", 0);
        if (i == 1) {
            a.e("user", sharedPreferences);
        } else if (i == 2) {
            b.e("groups", sharedPreferences);
        } else if (i == 4) {
            c.e("channels", sharedPreferences);
        }
    }
}
