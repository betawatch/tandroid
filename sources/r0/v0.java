package r0;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class v0 extends z0 {
    public static Field e = null;
    public static boolean f = false;
    public static Constructor g = null;
    public static boolean h = false;
    public WindowInsets c;
    public i0.c d;

    public v0() {
        this.c = j();
    }

    private static WindowInsets j() {
        if (!f) {
            try {
                e = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e7) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e7);
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
            } catch (ReflectiveOperationException e10) {
                Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e10);
            }
        }
        if (!h) {
            try {
                g = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e11) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e11);
            }
            h = true;
        }
        Constructor constructor = g;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e12) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e12);
            }
        }
        return null;
    }

    @Override // r0.z0
    public j1 b() {
        a();
        j1 h10 = j1.h(null, this.c);
        i0.c[] cVarArr = this.b;
        g1 g1Var = h10.a;
        g1Var.q(cVarArr);
        g1Var.s(this.d);
        return h10;
    }

    @Override // r0.z0
    public void e(i0.c cVar) {
        this.d = cVar;
    }

    @Override // r0.z0
    public void g(i0.c cVar) {
        WindowInsets windowInsets = this.c;
        if (windowInsets != null) {
            this.c = windowInsets.replaceSystemWindowInsets(cVar.a, cVar.b, cVar.c, cVar.d);
        }
    }

    public v0(j1 j1Var) {
        super(j1Var);
        this.c = j1Var.g();
    }
}
