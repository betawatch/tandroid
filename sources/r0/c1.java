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

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public abstract class c1 extends i1 {
    public static boolean i = false;
    public static Method j;
    public static Class k;
    public static Field l;
    public static Field m;
    public final WindowInsets c;
    public i0.c[] d;
    public i0.c e;
    public l1 f;
    public i0.c g;
    public int h;

    public c1(l1 l1Var, WindowInsets windowInsets) {
        super(l1Var);
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
        l1 l1Var = this.f;
        return l1Var != null ? l1Var.a.i() : i0.c.e;
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
            } catch (ReflectiveOperationException e7) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e7.getMessage(), e7);
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
        } catch (ReflectiveOperationException e7) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e7.getMessage(), e7);
        }
        i = true;
    }

    public void A(i0.c cVar) {
        this.g = cVar;
    }

    @Override // r0.i1
    public void d(View view) {
        i0.c x10 = x(view);
        if (x10 == null) {
            x10 = i0.c.e;
        }
        A(x10);
    }

    @Override // r0.i1
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        c1 c1Var = (c1) obj;
        return Objects.equals(this.g, c1Var.g) && B(this.h, c1Var.h);
    }

    @Override // r0.i1
    public i0.c f(int i10) {
        return u(i10, false);
    }

    @Override // r0.i1
    public i0.c g(int i10) {
        return u(i10, true);
    }

    @Override // r0.i1
    public final i0.c k() {
        if (this.e == null) {
            WindowInsets windowInsets = this.c;
            this.e = i0.c.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.e;
    }

    @Override // r0.i1
    public l1 m(int i10, int i11, int i12, int i13) {
        l1 h = l1.h(null, this.c);
        int i14 = Build.VERSION.SDK_INT;
        b1 a1Var = i14 >= 34 ? new a1(h) : i14 >= 30 ? new z0(h) : i14 >= 29 ? new y0(h) : new x0(h);
        a1Var.g(l1.e(k(), i10, i11, i12, i13));
        a1Var.e(l1.e(i(), i10, i11, i12, i13));
        return a1Var.b();
    }

    @Override // r0.i1
    public boolean o() {
        return this.c.isRound();
    }

    @Override // r0.i1
    public boolean p(int i10) {
        for (int i11 = 1; i11 <= 512; i11 <<= 1) {
            if ((i10 & i11) != 0 && !y(i11)) {
                return false;
            }
        }
        return true;
    }

    @Override // r0.i1
    public void q(i0.c[] cVarArr) {
        this.d = cVarArr;
    }

    @Override // r0.i1
    public void r(l1 l1Var) {
        this.f = l1Var;
    }

    @Override // r0.i1
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
                    i0.c w10 = w();
                    int i13 = k10.d;
                    if (i13 > w10.d) {
                        return i0.c.b(0, 0, 0, i13);
                    }
                    i0.c cVar2 = this.g;
                    if (cVar2 != null && !cVar2.equals(cVar) && (i12 = this.g.d) > w10.d) {
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
                        l1 l1Var = this.f;
                        i e7 = l1Var != null ? l1Var.a.e() : e();
                        if (e7 != null) {
                            int i14 = Build.VERSION.SDK_INT;
                            return i0.c.b(i14 >= 28 ? b5.d.l(e7.a) : 0, i14 >= 28 ? b5.d.n(e7.a) : 0, i14 >= 28 ? b5.d.m(e7.a) : 0, i14 >= 28 ? b5.d.k(e7.a) : 0);
                        }
                    }
                }
            } else {
                if (z10) {
                    i0.c w11 = w();
                    i0.c i15 = i();
                    return i0.c.b(Math.max(w11.a, i15.a), 0, Math.max(w11.c, i15.c), Math.max(w11.d, i15.d));
                }
                if ((this.h & 2) == 0) {
                    i0.c k11 = k();
                    l1 l1Var2 = this.f;
                    i11 = l1Var2 != null ? l1Var2.a.i() : null;
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
