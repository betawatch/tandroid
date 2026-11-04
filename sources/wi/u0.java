package wi;

import android.content.SharedPreferences;
import java.lang.reflect.Array;
import org.telegram.messenger.hs;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public abstract class u0 {
    public static final String[] a = {"round_video_switch_back_to_front_ms", "round_video_switch_front_to_back_ms"};
    public static final int[][] b = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 2, 8);
    public static final int[] c = new int[2];
    public static final int[] d = new int[2];
    public static boolean e;

    public static int a(int i3) {
        int i10 = c[i3];
        if (i10 == 0) {
            return i3 == 0 ? 680 : 630;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 += b[i3][i12];
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
        int i3 = 0;
        while (true) {
            String[] strArr = a;
            if (i3 >= 2) {
                return;
            }
            String string = sharedPreferences.getString(strArr[i3], null);
            if (string != null && !string.isEmpty()) {
                String[] split = string.split(",");
                for (int max = Math.max(0, split.length - 8); max < split.length; max++) {
                    try {
                        int max2 = Math.max(hs.e3, Math.min(2000, Integer.parseInt(split[max])));
                        int[] iArr2 = b[i3];
                        int i10 = iArr[i3];
                        iArr[i3] = i10 + 1;
                        iArr2[i10] = max2;
                    } catch (NumberFormatException unused) {
                    }
                }
                d[i3] = iArr[i3] % 8;
            }
            i3++;
        }
    }

    public static void c(int i3) {
        int i10 = c[i3];
        int i11 = i10 == 8 ? d[i3] : 0;
        StringBuilder sb2 = new StringBuilder(i10 * 5);
        for (int i12 = 0; i12 < i10; i12++) {
            if (i12 > 0) {
                sb2.append(',');
            }
            sb2.append(b[i3][(i11 + i12) % 8]);
        }
        org.telegram.messenger.t0.b.getSharedPreferences("mainconfig", 0).edit().putString(a[i3], sb2.toString()).apply();
    }

    public static synchronized int d(m0 m0Var, m0 m0Var2, int i3) {
        int a10;
        synchronized (u0.class) {
            try {
                b();
                if (m0Var == m0Var2) {
                    throw new IllegalArgumentException("Camera switch direction must change");
                }
                int i10 = m0Var == m0.b ? 0 : 1;
                int max = Math.max(hs.e3, Math.min(2000, i3));
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
