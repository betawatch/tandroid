package r0;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import c8.wb;
import j$.util.Objects;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public abstract class b1 extends h1 {
    public static boolean i = false;
    public static Method j;
    public static Class k;
    public static Field l;
    public static Field m;
    public final WindowInsets c;
    public i0.c[] d;
    public i0.c e;
    public k1 f;
    public i0.c g;
    public int h;

    public b1(k1 k1Var, WindowInsets windowInsets) {
        super(k1Var);
        this.e = null;
        this.c = windowInsets;
    }

    public static boolean B(int i7, int i10) {
        return (i7 & 6) == (i10 & 6);
    }

    private i0.c u(int i7, boolean z10) {
        i0.c cVar = i0.c.e;
        for (int i10 = 1; i10 <= 512; i10 <<= 1) {
            if ((i7 & i10) != 0) {
                cVar = i0.c.a(cVar, v(i10, z10));
            }
        }
        return cVar;
    }

    private i0.c w() {
        k1 k1Var = this.f;
        return k1Var != null ? k1Var.a.i() : i0.c.e;
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
            } catch (ReflectiveOperationException e10) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e10.getMessage(), e10);
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
        } catch (ReflectiveOperationException e10) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e10.getMessage(), e10);
        }
        i = true;
    }

    public void A(i0.c cVar) {
        this.g = cVar;
    }

    @Override // r0.h1
    public void d(View view) {
        i0.c x10 = x(view);
        if (x10 == null) {
            x10 = i0.c.e;
        }
        A(x10);
    }

    @Override // r0.h1
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        b1 b1Var = (b1) obj;
        return Objects.equals(this.g, b1Var.g) && B(this.h, b1Var.h);
    }

    @Override // r0.h1
    public i0.c f(int i7) {
        return u(i7, false);
    }

    @Override // r0.h1
    public i0.c g(int i7) {
        return u(i7, true);
    }

    @Override // r0.h1
    public final i0.c k() {
        if (this.e == null) {
            WindowInsets windowInsets = this.c;
            this.e = i0.c.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.e;
    }

    @Override // r0.h1
    public k1 m(int i7, int i10, int i11, int i12) {
        k1 h = k1.h(null, this.c);
        int i13 = Build.VERSION.SDK_INT;
        a1 z0Var = i13 >= 34 ? new z0(h) : i13 >= 30 ? new y0(h) : i13 >= 29 ? new x0(h) : new w0(h);
        z0Var.g(k1.e(k(), i7, i10, i11, i12));
        z0Var.e(k1.e(i(), i7, i10, i11, i12));
        return z0Var.b();
    }

    @Override // r0.h1
    public boolean o() {
        return this.c.isRound();
    }

    @Override // r0.h1
    public boolean p(int i7) {
        for (int i10 = 1; i10 <= 512; i10 <<= 1) {
            if ((i7 & i10) != 0 && !y(i10)) {
                return false;
            }
        }
        return true;
    }

    @Override // r0.h1
    public void q(i0.c[] cVarArr) {
        this.d = cVarArr;
    }

    @Override // r0.h1
    public void r(k1 k1Var) {
        this.f = k1Var;
    }

    @Override // r0.h1
    public void t(int i7) {
        this.h = i7;
    }

    public i0.c v(int i7, boolean z10) {
        i0.c i10;
        int i11;
        i0.c cVar = i0.c.e;
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 == 8) {
                    i0.c[] cVarArr = this.d;
                    i10 = cVarArr != null ? cVarArr[wb.a(8)] : null;
                    if (i10 != null) {
                        return i10;
                    }
                    i0.c k10 = k();
                    i0.c w10 = w();
                    int i12 = k10.d;
                    if (i12 > w10.d) {
                        return i0.c.b(0, 0, 0, i12);
                    }
                    i0.c cVar2 = this.g;
                    if (cVar2 != null && !cVar2.equals(cVar) && (i11 = this.g.d) > w10.d) {
                        return i0.c.b(0, 0, 0, i11);
                    }
                } else {
                    if (i7 == 16) {
                        return j();
                    }
                    if (i7 == 32) {
                        return h();
                    }
                    if (i7 == 64) {
                        return l();
                    }
                    if (i7 == 128) {
                        k1 k1Var = this.f;
                        h e10 = k1Var != null ? k1Var.a.e() : e();
                        if (e10 != null) {
                            int i13 = Build.VERSION.SDK_INT;
                            return i0.c.b(i13 >= 28 ? d1.f.l(e10.a) : 0, i13 >= 28 ? d1.f.n(e10.a) : 0, i13 >= 28 ? d1.f.m(e10.a) : 0, i13 >= 28 ? d1.f.k(e10.a) : 0);
                        }
                    }
                }
            } else {
                if (z10) {
                    i0.c w11 = w();
                    i0.c i14 = i();
                    return i0.c.b(Math.max(w11.a, i14.a), 0, Math.max(w11.c, i14.c), Math.max(w11.d, i14.d));
                }
                if ((this.h & 2) == 0) {
                    i0.c k11 = k();
                    k1 k1Var2 = this.f;
                    i10 = k1Var2 != null ? k1Var2.a.i() : null;
                    int i15 = k11.d;
                    if (i10 != null) {
                        i15 = Math.min(i15, i10.d);
                    }
                    return i0.c.b(k11.a, 0, k11.c, i15);
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

    public boolean y(int i7) {
        if (i7 != 1 && i7 != 2) {
            if (i7 == 4) {
                return false;
            }
            if (i7 != 8 && i7 != 128) {
                return true;
            }
        }
        return !v(i7, false).equals(i0.c.e);
    }
}
