package r0;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import j$.util.Objects;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import w7.w6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class a1 extends g1 {
    public static boolean i = false;
    public static Method j;
    public static Class k;
    public static Field l;
    public static Field m;
    public final WindowInsets c;
    public i0.c[] d;
    public i0.c e;
    public j1 f;
    public i0.c g;
    public int h;

    public a1(j1 j1Var, WindowInsets windowInsets) {
        super(j1Var);
        this.e = null;
        this.c = windowInsets;
    }

    public static boolean B(int i10, int i11) {
        return (i10 & 6) == (i11 & 6);
    }

    private i0.c u(int i10, boolean z10) {
        i0.c cVar = i0.c.e;
        for (int i11 = 1; i11 <= 512; i11 <<= 1) {
            if ((i10 & i11) != 0) {
                cVar = i0.c.a(cVar, v(i11, z10));
            }
        }
        return cVar;
    }

    private i0.c w() {
        j1 j1Var = this.f;
        return j1Var != null ? j1Var.a.i() : i0.c.e;
    }

    private i0.c x(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!i) {
            z();
        }
        Method method = j;
        if (method != null && k != null && l != null) {
            try {
                Object invoke = method.invoke(view, null);
                if (invoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) l.get(m.get(invoke));
                if (rect != null) {
                    return i0.c.b(rect.left, rect.top, rect.right, rect.bottom);
                }
            } catch (ReflectiveOperationException e) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
            }
        }
        return null;
    }

    private static void z() {
        try {
            j = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            k = cls;
            l = cls.getDeclaredField("mVisibleInsets");
            m = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            l.setAccessible(true);
            m.setAccessible(true);
        } catch (ReflectiveOperationException e) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
        }
        i = true;
    }

    public void A(i0.c cVar) {
        this.g = cVar;
    }

    @Override // r0.g1
    public void d(View view) {
        i0.c x10 = x(view);
        if (x10 == null) {
            x10 = i0.c.e;
        }
        A(x10);
    }

    @Override // r0.g1
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        a1 a1Var = (a1) obj;
        return Objects.equals(this.g, a1Var.g) && B(this.h, a1Var.h);
    }

    @Override // r0.g1
    public i0.c f(int i10) {
        return u(i10, false);
    }

    @Override // r0.g1
    public i0.c g(int i10) {
        return u(i10, true);
    }

    @Override // r0.g1
    public final i0.c k() {
        if (this.e == null) {
            WindowInsets windowInsets = this.c;
            this.e = i0.c.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.e;
    }

    @Override // r0.g1
    public j1 m(int i10, int i11, int i12, int i13) {
        j1 h = j1.h(null, this.c);
        int i14 = Build.VERSION.SDK_INT;
        z0 y0Var = i14 >= 34 ? new y0(h) : i14 >= 30 ? new x0(h) : i14 >= 29 ? new w0(h) : new v0(h);
        y0Var.g(j1.e(k(), i10, i11, i12, i13));
        y0Var.e(j1.e(i(), i10, i11, i12, i13));
        return y0Var.b();
    }

    @Override // r0.g1
    public boolean o() {
        return this.c.isRound();
    }

    @Override // r0.g1
    public boolean p(int i10) {
        for (int i11 = 1; i11 <= 512; i11 <<= 1) {
            if ((i10 & i11) != 0 && !y(i11)) {
                return false;
            }
        }
        return true;
    }

    @Override // r0.g1
    public void q(i0.c[] cVarArr) {
        this.d = cVarArr;
    }

    @Override // r0.g1
    public void r(j1 j1Var) {
        this.f = j1Var;
    }

    @Override // r0.g1
    public void t(int i10) {
        this.h = i10;
    }

    public i0.c v(int i10, boolean z10) {
        i0.c i11;
        int i12;
        i0.c cVar = i0.c.e;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 8) {
                    i0.c[] cVarArr = this.d;
                    i11 = cVarArr != null ? cVarArr[w6.a(8)] : null;
                    if (i11 != null) {
                        return i11;
                    }
                    i0.c k10 = k();
                    i0.c w9 = w();
                    int i13 = k10.d;
                    if (i13 > w9.d) {
                        return i0.c.b(0, 0, 0, i13);
                    }
                    i0.c cVar2 = this.g;
                    if (cVar2 != null && !cVar2.equals(cVar) && (i12 = this.g.d) > w9.d) {
                        return i0.c.b(0, 0, 0, i12);
                    }
                } else {
                    if (i10 == 16) {
                        return j();
                    }
                    if (i10 == 32) {
                        return h();
                    }
                    if (i10 == 64) {
                        return l();
                    }
                    if (i10 == 128) {
                        j1 j1Var = this.f;
                        h e = j1Var != null ? j1Var.a.e() : e();
                        if (e != null) {
                            int i14 = Build.VERSION.SDK_INT;
                            return i0.c.b(i14 >= 28 ? b5.d.l(e.a) : 0, i14 >= 28 ? b5.d.n(e.a) : 0, i14 >= 28 ? b5.d.m(e.a) : 0, i14 >= 28 ? b5.d.k(e.a) : 0);
                        }
                    }
                }
            } else {
                if (z10) {
                    i0.c w10 = w();
                    i0.c i15 = i();
                    return i0.c.b(Math.max(w10.a, i15.a), 0, Math.max(w10.c, i15.c), Math.max(w10.d, i15.d));
                }
                if ((this.h & 2) == 0) {
                    i0.c k11 = k();
                    j1 j1Var2 = this.f;
                    i11 = j1Var2 != null ? j1Var2.a.i() : null;
                    int i16 = k11.d;
                    if (i11 != null) {
                        i16 = Math.min(i16, i11.d);
                    }
                    return i0.c.b(k11.a, 0, k11.c, i16);
                }
            }
        } else {
            if (z10) {
                return i0.c.b(0, Math.max(w().b, k().b), 0, 0);
            }
            if ((this.h & 4) == 0) {
                return i0.c.b(0, k().b, 0, 0);
            }
        }
        return cVar;
    }

    public boolean y(int i10) {
        if (i10 != 1 && i10 != 2) {
            if (i10 == 4) {
                return false;
            }
            if (i10 != 8 && i10 != 128) {
                return true;
            }
        }
        return !v(i10, false).equals(i0.c.e);
    }
}
