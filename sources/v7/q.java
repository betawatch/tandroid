package v7;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import b8.ng;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class q {
    public static ng a;

    public static synchronized p f(o oVar) {
        p pVar;
        synchronized (q.class) {
            try {
                if (a == null) {
                    a = new ng(1);
                }
                pVar = (p) a.R0(oVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return pVar;
    }

    public abstract void a(Rect rect, RectF rectF);

    public abstract void b();

    public abstract void c(Canvas canvas);

    public abstract boolean d();

    public abstract void e(float f10);
}
