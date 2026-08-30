package vh;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import ru.noties.jlatexmath.JLatexMathAndroid;
import ru.noties.jlatexmath.JLatexMathDrawable;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class q {
    public static volatile boolean e = false;
    public final Bitmap a;
    public final int b;
    public final int c;
    public final int d;

    public q(Bitmap bitmap, int i10, int i11, int i12) {
        this.a = bitmap;
        this.b = i10;
        this.c = i11;
        this.d = i12;
    }

    public static q a(String str, float f10, boolean z4) {
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
                    int i10 = 0;
                    build.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
                    build.draw(new Canvas(createBitmap));
                    if (z4) {
                        try {
                            i10 = build.icon().getIconDepth();
                        } catch (Throwable th2) {
                            FileLog.e(th2);
                        }
                    }
                    return new q(createBitmap, intrinsicWidth, intrinsicHeight, i10);
                }
            } catch (Throwable th3) {
                FileLog.e(th3);
            }
        }
        return null;
    }
}
