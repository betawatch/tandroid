package r0;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import j$.util.Objects;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import k7.r6;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public abstract class d1 extends j1 {
    public static boolean i = false;
    public static Method j;
    public static Class k;
    public static Field l;
    public static Field m;
    public final WindowInsets c;
    public i0.b[] d;
    public i0.b e;
    public m1 f;
    public i0.b g;
    public int h;

    public d1(m1 m1Var, WindowInsets windowInsets) {
        super(m1Var);
        this.e = null;
        this.c = windowInsets;
    }

    public static boolean B(int i10, int i11) {
        return (i10 & 6) == (i11 & 6);
    }

    private i0.b u(int i10, boolean z4) {
        i0.b bVar = i0.b.e;
        for (int i11 = 1; i11 <= 512; i11 <<= 1) {
            if ((i10 & i11) != 0) {
                bVar = i0.b.a(bVar, v(i11, z4));
            }
        }
        return bVar;
    }

    private i0.b w() {
        m1 m1Var = this.f;
        return m1Var != null ? m1Var.a.i() : i0.b.e;
    }

    private i0.b x(View view) {
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
                    return i0.b.b(rect.left, rect.top, rect.right, rect.bottom);
                }
            } catch (ReflectiveOperationException e6) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e6.getMessage(), e6);
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
        } catch (ReflectiveOperationException e6) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e6.getMessage(), e6);
        }
        i = true;
    }

    public void A(i0.b bVar) {
        this.g = bVar;
    }

    @Override // r0.j1
    public void d(View view) {
        i0.b x10 = x(view);
        if (x10 == null) {
            x10 = i0.b.e;
        }
        A(x10);
    }

    @Override // r0.j1
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        d1 d1Var = (d1) obj;
        return Objects.equals(this.g, d1Var.g) && B(this.h, d1Var.h);
    }

    @Override // r0.j1
    public i0.b f(int i10) {
        return u(i10, false);
    }

    @Override // r0.j1
    public i0.b g(int i10) {
        return u(i10, true);
    }

    @Override // r0.j1
    public final i0.b k() {
        if (this.e == null) {
            WindowInsets windowInsets = this.c;
            this.e = i0.b.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.e;
    }

    @Override // r0.j1
    public m1 m(int i10, int i11, int i12, int i13) {
        m1 h = m1.h(null, this.c);
        int i14 = Build.VERSION.SDK_INT;
        c1 b1Var = i14 >= 34 ? new b1(h) : i14 >= 30 ? new a1(h) : i14 >= 29 ? new z0(h) : new y0(h);
        b1Var.g(m1.e(k(), i10, i11, i12, i13));
        b1Var.e(m1.e(i(), i10, i11, i12, i13));
        return b1Var.b();
    }

    @Override // r0.j1
    public boolean o() {
        return this.c.isRound();
    }

    @Override // r0.j1
    public boolean p(int i10) {
        for (int i11 = 1; i11 <= 512; i11 <<= 1) {
            if ((i10 & i11) != 0 && !y(i11)) {
                return false;
            }
        }
        return true;
    }

    @Override // r0.j1
    public void q(i0.b[] bVarArr) {
        this.d = bVarArr;
    }

    @Override // r0.j1
    public void r(m1 m1Var) {
        this.f = m1Var;
    }

    @Override // r0.j1
    public void t(int i10) {
        this.h = i10;
    }

    public i0.b v(int i10, boolean z4) {
        i0.b i11;
        int i12;
        i0.b bVar = i0.b.e;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 8) {
                    i0.b[] bVarArr = this.d;
                    i11 = bVarArr != null ? bVarArr[r6.a(8)] : null;
                    if (i11 != null) {
                        return i11;
                    }
                    i0.b k10 = k();
                    i0.b w10 = w();
                    int i13 = k10.d;
                    if (i13 > w10.d) {
                        return i0.b.b(0, 0, 0, i13);
                    }
                    i0.b bVar2 = this.g;
                    if (bVar2 != null && !bVar2.equals(bVar) && (i12 = this.g.d) > w10.d) {
                        return i0.b.b(0, 0, 0, i12);
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
                        m1 m1Var = this.f;
                        j e6 = m1Var != null ? m1Var.a.e() : e();
                        if (e6 != null) {
                            int i14 = Build.VERSION.SDK_INT;
                            return i0.b.b(i14 >= 28 ? d1.f.l(e6.a) : 0, i14 >= 28 ? d1.f.n(e6.a) : 0, i14 >= 28 ? d1.f.m(e6.a) : 0, i14 >= 28 ? d1.f.k(e6.a) : 0);
                        }
                    }
                }
            } else {
                if (z4) {
                    i0.b w11 = w();
                    i0.b i15 = i();
                    return i0.b.b(Math.max(w11.a, i15.a), 0, Math.max(w11.c, i15.c), Math.max(w11.d, i15.d));
                }
                if ((this.h & 2) == 0) {
                    i0.b k11 = k();
                    m1 m1Var2 = this.f;
                    i11 = m1Var2 != null ? m1Var2.a.i() : null;
                    int i16 = k11.d;
                    if (i11 != null) {
                        i16 = Math.min(i16, i11.d);
                    }
                    return i0.b.b(k11.a, 0, k11.c, i16);
                }
            }
        } else {
            if (z4) {
                return i0.b.b(0, Math.max(w().b, k().b), 0, 0);
            }
            if ((this.h & 4) == 0) {
                return i0.b.b(0, k().b, 0, 0);
            }
        }
        return bVar;
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
        return !v(i10, false).equals(i0.b.e);
    }
}
