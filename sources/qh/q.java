package qh;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import ru.noties.jlatexmath.JLatexMathAndroid;
import ru.noties.jlatexmath.JLatexMathDrawable;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class q {
    public static volatile boolean e = false;
    public final Bitmap a;
    public final int b;
    public final int c;
    public final int d;

    public q(Bitmap bitmap, int i9, int i10, int i11) {
        this.a = bitmap;
        this.b = i9;
        this.c = i10;
        this.d = i11;
    }

    public static q a(String str, float f10, boolean z10) {
        if (str != null && !str.isEmpty()) {
            try {
                if (!e) {
                    synchronized (q.class) {
                        try {
                            if (!e) {
                                JLatexMathAndroid.init(ApplicationLoader.applicationContext);
                                e = true;
                            }
                        } finally {
                        }
                    }
                }
                JLatexMathDrawable build = JLatexMathDrawable.builder(str).textSize(f10).build();
                int intrinsicWidth = build.getIntrinsicWidth();
                int intrinsicHeight = build.getIntrinsicHeight();
                if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                    Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ALPHA_8);
                    int i9 = 0;
                    build.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
                    build.draw(new Canvas(createBitmap));
                    if (z10) {
                        try {
                            i9 = build.icon().getIconDepth();
                        } catch (Throwable th) {
                            FileLog.e(th);
                        }
                    }
                    return new q(createBitmap, intrinsicWidth, intrinsicHeight, i9);
                }
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        }
        return null;
    }
}
