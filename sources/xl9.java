// default package

import android.content.SharedPreferences;
import java.lang.reflect.Array;
import org.telegram.messenger.a;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public abstract class xl9 {
    public static final String[] a = {"round_video_switch_back_to_front_ms", "round_video_switch_front_to_back_ms"};
    public static final int[][] b = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 2, 8);
    public static final int[] c = new int[2];
    public static final int[] d = new int[2];
    public static boolean e;

    public static int a(int i) {
        int i2 = c[i];
        if (i2 == 0) {
            return i == 0 ? 680 : 630;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 += b[i][i4];
        }
        return Math.round(i3 / i2);
    }

    public static void b() {
        int[] iArr = c;
        if (e) {
            return;
        }
        e = true;
        SharedPreferences sharedPreferences = a.b.getSharedPreferences("mainconfig", 0);
        int i = 0;
        while (true) {
            String[] strArr = a;
            if (i >= 2) {
                return;
            }
            String string = sharedPreferences.getString(strArr[i], null);
            if (string != null && !string.isEmpty()) {
                String[] split = string.split(",");
                for (int max = Math.max(0, split.length - 8); max < split.length; max++) {
                    try {
                        int max2 = Math.max(kk7.d3, Math.min(2000, Integer.parseInt(split[max])));
                        int[] iArr2 = b[i];
                        int i2 = iArr[i];
                        iArr[i] = i2 + 1;
                        iArr2[i2] = max2;
                    } catch (NumberFormatException unused) {
                    }
                }
                d[i] = iArr[i] % 8;
            }
            i++;
        }
    }

    public static void c(int i) {
        int i2 = c[i];
        int i3 = i2 == 8 ? d[i] : 0;
        StringBuilder sb = new StringBuilder(i2 * 5);
        for (int i4 = 0; i4 < i2; i4++) {
            if (i4 > 0) {
                sb.append(',');
            }
            sb.append(b[i][(i3 + i4) % 8]);
        }
        a.b.getSharedPreferences("mainconfig", 0).edit().putString(a[i], sb.toString()).apply();
    }

    public static synchronized int d(nl9 nl9Var, nl9 nl9Var2, int i) {
        int a2;
        synchronized (xl9.class) {
            b();
            if (nl9Var == nl9Var2) {
                throw new IllegalArgumentException("Camera switch direction must change");
            }
            int i2 = nl9Var == nl9.b ? 0 : 1;
            int max = Math.max(kk7.d3, Math.min(2000, i));
            int[] iArr = b[i2];
            int[] iArr2 = d;
            iArr[iArr2[i2]] = max;
            iArr2[i2] = (iArr2[i2] + 1) % 8;
            int[] iArr3 = c;
            int i3 = iArr3[i2];
            if (i3 < 8) {
                iArr3[i2] = i3 + 1;
            }
            c(i2);
            a2 = a(i2);
        }
        return a2;
    }
}
