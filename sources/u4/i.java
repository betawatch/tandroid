package u4;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import c0.m;
import java.io.File;
import java.io.IOException;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public abstract class i {
    public static final m a = new m();
    public static final Object b = new Object();
    public static nb.a c = null;

    public static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? g.a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static nb.a b() {
        nb.a aVar = new nb.a(26);
        c = aVar;
        a.k(aVar);
        return c;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(21:14|(1:80)(1:18)|19|(1:79)(1:23)|24|25|26|(2:64|65)(1:28)|29|(9:36|(1:40)|(1:47)|48|(2:56|57)|52|53|54|55)|(1:63)|(1:40)|(3:42|45|47)|48|(1:50)|56|57|52|53|54|55) */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x009e, code lost:
    
        r6 = 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void c(Context context, boolean z9) {
        h a10;
        h hVar;
        int i7;
        if (z9 || c == null) {
            synchronized (b) {
                if (!z9) {
                    try {
                        if (c != null) {
                            return;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 28 && i10 != 30) {
                    File file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                    long length = file.length();
                    int i11 = 0;
                    boolean z10 = file.exists() && length > 0;
                    File file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                    long length2 = file2.length();
                    boolean z11 = file2.exists() && length2 > 0;
                    try {
                        long a11 = a(context);
                        File file3 = new File(context.getFilesDir(), "profileInstalled");
                        if (file3.exists()) {
                            try {
                                a10 = h.a(file3);
                            } catch (IOException unused) {
                                b();
                                return;
                            }
                        } else {
                            a10 = null;
                        }
                        if (a10 != null && a10.c == a11 && (i7 = a10.b) != 2) {
                            i11 = i7;
                            if (z9 && z11 && i11 != 1) {
                                i11 = 2;
                            }
                            if (a10 != null && a10.b == 2 && i11 == 1 && length < a10.d) {
                                i11 = 3;
                            }
                            hVar = new h(a11, length2, 1, i11);
                            if (a10 != null || !a10.equals(hVar)) {
                                hVar.b(file3);
                            }
                            b();
                            return;
                        }
                        if (z11) {
                            i11 = 2;
                        }
                        if (z9) {
                            i11 = 2;
                        }
                        if (a10 != null) {
                            i11 = 3;
                        }
                        hVar = new h(a11, length2, 1, i11);
                        if (a10 != null) {
                        }
                        hVar.b(file3);
                        b();
                        return;
                    } catch (PackageManager.NameNotFoundException unused2) {
                        b();
                        return;
                    }
                }
                b();
            }
        }
    }
}
