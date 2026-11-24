// default package

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Trace;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public abstract class vl4 {
    public static final fg6 a = new fg6(16);
    public static final ThreadPoolExecutor b;
    public static final Object c;
    public static final aia d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000L, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new k89());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        b = threadPoolExecutor;
        c = new Object();
        d = new aia(0);
    }

    public static String a(int i, List list) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < list.size(); i2++) {
            sb.append(((pl4) list.get(i2)).e);
            sb.append("-");
            sb.append(i);
            if (i2 < list.size() - 1) {
                sb.append(";");
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004a A[Catch: all -> 0x00a8, TryCatch #0 {all -> 0x00a8, blocks: (B:3:0x0007, B:5:0x000f, B:10:0x0016, B:11:0x001a, B:16:0x004a, B:17:0x0050, B:19:0x0056, B:21:0x005c, B:24:0x0069, B:26:0x008a, B:27:0x0093, B:30:0x006e, B:31:0x0071, B:32:0x0072, B:35:0x0085, B:38:0x009a, B:39:0x009d, B:41:0x0027, B:43:0x002f, B:45:0x0032, B:47:0x0036, B:49:0x0042, B:57:0x009e, B:34:0x007f, B:23:0x0063), top: B:2:0x0007, inners: #1, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0050 A[Catch: all -> 0x00a8, TryCatch #0 {all -> 0x00a8, blocks: (B:3:0x0007, B:5:0x000f, B:10:0x0016, B:11:0x001a, B:16:0x004a, B:17:0x0050, B:19:0x0056, B:21:0x005c, B:24:0x0069, B:26:0x008a, B:27:0x0093, B:30:0x006e, B:31:0x0071, B:32:0x0072, B:35:0x0085, B:38:0x009a, B:39:0x009d, B:41:0x0027, B:43:0x002f, B:45:0x0032, B:47:0x0036, B:49:0x0042, B:57:0x009e, B:34:0x007f, B:23:0x0063), top: B:2:0x0007, inners: #1, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008a A[Catch: all -> 0x00a8, TryCatch #0 {all -> 0x00a8, blocks: (B:3:0x0007, B:5:0x000f, B:10:0x0016, B:11:0x001a, B:16:0x004a, B:17:0x0050, B:19:0x0056, B:21:0x005c, B:24:0x0069, B:26:0x008a, B:27:0x0093, B:30:0x006e, B:31:0x0071, B:32:0x0072, B:35:0x0085, B:38:0x009a, B:39:0x009d, B:41:0x0027, B:43:0x002f, B:45:0x0032, B:47:0x0036, B:49:0x0042, B:57:0x009e, B:34:0x007f, B:23:0x0063), top: B:2:0x0007, inners: #1, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0093 A[Catch: all -> 0x00a8, TryCatch #0 {all -> 0x00a8, blocks: (B:3:0x0007, B:5:0x000f, B:10:0x0016, B:11:0x001a, B:16:0x004a, B:17:0x0050, B:19:0x0056, B:21:0x005c, B:24:0x0069, B:26:0x008a, B:27:0x0093, B:30:0x006e, B:31:0x0071, B:32:0x0072, B:35:0x0085, B:38:0x009a, B:39:0x009d, B:41:0x0027, B:43:0x002f, B:45:0x0032, B:47:0x0036, B:49:0x0042, B:57:0x009e, B:34:0x007f, B:23:0x0063), top: B:2:0x0007, inners: #1, #2, #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ul4 b(String str, Context context, List list, int i) {
        ul4 ul4Var;
        int i2;
        Typeface b2;
        fg6 fg6Var = a;
        wve.a("getFontSync");
        try {
            Typeface typeface = (Typeface) fg6Var.a(str);
            if (typeface != null) {
                ul4Var = new ul4(typeface);
            } else {
                try {
                    am4 a2 = ol4.a(context, list);
                    List list2 = a2.b;
                    boolean z = a2.c;
                    if (z) {
                        if (z) {
                            i2 = -2;
                            if (i2 != 0) {
                                ul4Var = new ul4(i2);
                            } else if (list2.size() <= 1 || Build.VERSION.SDK_INT < 29) {
                                bm4[] bm4VarArr = (bm4[]) list2.get(0);
                                vwe vweVar = s3c.a;
                                wve.a("TypefaceCompat.createFromFontInfo");
                                try {
                                    b2 = s3c.a.b(context, bm4VarArr, i);
                                    Trace.endSection();
                                    if (b2 == null) {
                                        fg6Var.b(str, b2);
                                        ul4Var = new ul4(b2);
                                    } else {
                                        ul4Var = new ul4(-3);
                                    }
                                } finally {
                                }
                            } else {
                                vwe vweVar2 = s3c.a;
                                wve.a("TypefaceCompat.createFromFontInfoWithFallback");
                                try {
                                    b2 = s3c.a.c(context, list2, i);
                                    Trace.endSection();
                                    if (b2 == null) {
                                    }
                                } finally {
                                }
                            }
                        }
                        i2 = -3;
                        if (i2 != 0) {
                        }
                    } else {
                        bm4[] bm4VarArr2 = (bm4[]) list2.get(0);
                        if (bm4VarArr2 == null || bm4VarArr2.length == 0) {
                            i2 = 1;
                        } else {
                            int length = bm4VarArr2.length;
                            int i3 = 0;
                            while (true) {
                                if (i3 >= length) {
                                    i2 = 0;
                                    break;
                                }
                                int i4 = bm4VarArr2[i3].e;
                                if (i4 == 0) {
                                    i3++;
                                } else if (i4 >= 0) {
                                    i2 = i4;
                                }
                            }
                            i2 = -3;
                        }
                        if (i2 != 0) {
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    ul4Var = new ul4(-1);
                }
            }
            return ul4Var;
        } catch (Throwable th) {
            throw th;
        }
    }
}
