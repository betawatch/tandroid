package x6;

import android.app.Application;
import android.os.Build;
import android.os.Process;
import android.os.StrictMode;
import androidx.car.app.j;
import c8.hb;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import q6.m;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public abstract class d {
    public static String a;
    public static int b;
    public static Boolean c;

    public static String a() {
        BufferedReader bufferedReader;
        if (a == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                a = Application.getProcessName();
            } else {
                int i7 = b;
                if (i7 == 0) {
                    i7 = Process.myPid();
                    b = i7;
                }
                String str = null;
                str = null;
                str = null;
                BufferedReader bufferedReader2 = null;
                if (i7 > 0) {
                    try {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(i7).length() + 14);
                        sb2.append("/proc/");
                        sb2.append(i7);
                        sb2.append("/cmdline");
                        String sb3 = sb2.toString();
                        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            bufferedReader = new BufferedReader(new FileReader(sb3));
                        } finally {
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                        }
                    } catch (IOException unused) {
                        bufferedReader = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    try {
                        String readLine = bufferedReader.readLine();
                        m.g(readLine);
                        str = readLine.trim();
                    } catch (IOException unused2) {
                    } catch (Throwable th3) {
                        th = th3;
                        bufferedReader2 = bufferedReader;
                        b.a(bufferedReader2);
                        throw th;
                    }
                    b.a(bufferedReader);
                }
                a = str;
            }
        }
        return a;
    }

    public static boolean b() {
        Boolean bool = c;
        if (bool == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                bool = Boolean.valueOf(Process.isIsolated());
            } else {
                try {
                    Object invoke = Process.class.getDeclaredMethod("isIsolated", null).invoke(null, null);
                    Object[] objArr = new Object[0];
                    if (invoke == null) {
                        throw new j(hb.a("expected a non-null reference", objArr));
                    }
                    bool = (Boolean) invoke;
                } catch (ReflectiveOperationException unused) {
                    bool = Boolean.FALSE;
                }
            }
            c = bool;
        }
        return bool.booleanValue();
    }
}
