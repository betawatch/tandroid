package r0;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class w0 extends a1 {
    public static Field e = null;
    public static boolean f = false;
    public static Constructor g = null;
    public static boolean h = false;
    public WindowInsets c;
    public i0.c d;

    public w0() {
        this.c = j();
    }

    private static WindowInsets j() {
        if (!f) {
            try {
                e = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e10) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e10);
            }
            f = true;
        }
        Field field = e;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException e11) {
                Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e11);
            }
        }
        if (!h) {
            try {
                g = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e12) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e12);
            }
            h = true;
        }
        Constructor constructor = g;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e13) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e13);
            }
        }
        return null;
    }

    @Override // r0.a1
    public k1 b() {
        a();
        k1 h7 = k1.h(null, this.c);
        i0.c[] cVarArr = this.b;
        h1 h1Var = h7.a;
        h1Var.q(cVarArr);
        h1Var.s(this.d);
        return h7;
    }

    @Override // r0.a1
    public void e(i0.c cVar) {
        this.d = cVar;
    }

    @Override // r0.a1
    public void g(i0.c cVar) {
        WindowInsets windowInsets = this.c;
        if (windowInsets != null) {
            this.c = windowInsets.replaceSystemWindowInsets(cVar.a, cVar.b, cVar.c, cVar.d);
        }
    }

    public w0(k1 k1Var) {
        super(k1Var);
        this.c = k1Var.g();
    }
}
