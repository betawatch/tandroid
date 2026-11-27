// default package

import android.graphics.Bitmap;
import android.graphics.Canvas;
import org.telegram.messenger.a;
import ru.noties.jlatexmath.JLatexMathAndroid;
import ru.noties.jlatexmath.JLatexMathDrawable;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final class qz5 {
    public static volatile boolean e = false;
    public final Bitmap a;
    public final int b;
    public final int c;
    public final int d;

    public qz5(Bitmap bitmap, int i, int i2, int i3) {
        this.a = bitmap;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public static qz5 a(String str, float f, boolean z) {
        if (str != null && !str.isEmpty()) {
            try {
                if (!e) {
                    synchronized (qz5.class) {
                        try {
                            if (!e) {
                                JLatexMathAndroid.init(a.b);
                                e = true;
                            }
                        } finally {
                        }
                    }
                }
                JLatexMathDrawable build = JLatexMathDrawable.builder(str).textSize(f).build();
                int intrinsicWidth = build.getIntrinsicWidth();
                int intrinsicHeight = build.getIntrinsicHeight();
                if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                    Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ALPHA_8);
                    int i = 0;
                    build.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
                    build.draw(new Canvas(createBitmap));
                    if (z) {
                        try {
                            i = build.icon().getIconDepth();
                        } catch (Throwable th) {
                            cc4.g(th, true);
                        }
                    }
                    return new qz5(createBitmap, intrinsicWidth, intrinsicHeight, i);
                }
            } catch (Throwable th2) {
                cc4.g(th2, true);
            }
        }
        return null;
    }
}
