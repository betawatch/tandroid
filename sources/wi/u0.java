package wi;

import android.content.SharedPreferences;
import java.lang.reflect.Array;
import org.telegram.messenger.qs;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes4.dex */
public abstract class u0 {
    public static final String[] a = {"round_video_switch_back_to_front_ms", "round_video_switch_front_to_back_ms"};
    public static final int[][] b = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 2, 8);
    public static final int[] c = new int[2];
    public static final int[] d = new int[2];
    public static boolean e;

    public static int a(int i7) {
        int i10 = c[i7];
        if (i10 == 0) {
            return i7 == 0 ? 680 : 630;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 += b[i7][i12];
        }
        return Math.round(i11 / i10);
    }

    public static void b() {
        int[] iArr = c;
        if (e) {
            return;
        }
        e = true;
        SharedPreferences sharedPreferences = org.telegram.messenger.t0.b.getSharedPreferences("mainconfig", 0);
        int i7 = 0;
        while (true) {
            String[] strArr = a;
            if (i7 >= 2) {
                return;
            }
            String string = sharedPreferences.getString(strArr[i7], null);
            if (string != null && !string.isEmpty()) {
                String[] split = string.split(",");
                for (int max = Math.max(0, split.length - 8); max < split.length; max++) {
                    try {
                        int max2 = Math.max(qs.e3, Math.min(2000, Integer.parseInt(split[max])));
                        int[] iArr2 = b[i7];
                        int i10 = iArr[i7];
                        iArr[i7] = i10 + 1;
                        iArr2[i10] = max2;
                    } catch (NumberFormatException unused) {
                    }
                }
                d[i7] = iArr[i7] % 8;
            }
            i7++;
        }
    }

    public static void c(int i7) {
        int i10 = c[i7];
        int i11 = i10 == 8 ? d[i7] : 0;
        StringBuilder sb2 = new StringBuilder(i10 * 5);
        for (int i12 = 0; i12 < i10; i12++) {
            if (i12 > 0) {
                sb2.append(',');
            }
            sb2.append(b[i7][(i11 + i12) % 8]);
        }
        org.telegram.messenger.t0.b.getSharedPreferences("mainconfig", 0).edit().putString(a[i7], sb2.toString()).apply();
    }

    public static synchronized int d(m0 m0Var, m0 m0Var2, int i7) {
        int a10;
        synchronized (u0.class) {
            try {
                b();
                if (m0Var == m0Var2) {
                    throw new IllegalArgumentException("Camera switch direction must change");
                }
                int i10 = m0Var == m0.b ? 0 : 1;
                int max = Math.max(qs.e3, Math.min(2000, i7));
                int[] iArr = b[i10];
                int[] iArr2 = d;
                iArr[iArr2[i10]] = max;
                iArr2[i10] = (iArr2[i10] + 1) % 8;
                int[] iArr3 = c;
                int i11 = iArr3[i10];
                if (i11 < 8) {
                    iArr3[i10] = i11 + 1;
                }
                c(i10);
                a10 = a(i10);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return a10;
    }
}
