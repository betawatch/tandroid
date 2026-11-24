// default package

import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import j$.util.Objects;
import java.util.WeakHashMap;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public class u31 {
    public static u31 x;
    public int a;
    public int b;
    public i21 c;
    public zna d;
    public final y21 e;
    public final k21 f;
    public final d g;
    public final FrameLayout h;
    public final Runnable i;
    public int j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public int p;
    public q21 q;
    public x21 r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public Runnable w;

    public u31(d dVar, FrameLayout frameLayout, y21 y21Var, int i) {
        this.i = new h21(this, (byte) 0);
        this.s = true;
        this.v = true;
        this.e = y21Var;
        this.o = !(y21Var instanceof z21);
        this.f = new k21(this, y21Var, frameLayout);
        this.g = dVar;
        this.h = frameLayout;
        this.j = i;
    }

    public static void a(FrameLayout frameLayout, q21 q21Var) {
        if (frameLayout != null) {
            frameLayout.setTag(R.id.bulletin_delegate_tag, q21Var);
        }
    }

    public static void d(FrameLayout frameLayout) {
        u31 u31Var;
        int childCount = frameLayout.getChildCount();
        int i = 0;
        while (true) {
            if (i >= childCount) {
                u31Var = null;
                break;
            }
            View childAt = frameLayout.getChildAt(i);
            if (childAt instanceof y21) {
                u31Var = ((y21) childAt).bulletin;
                break;
            }
            i++;
        }
        if (u31Var != null) {
            u31Var.c(0L, oc7.d1().getBoolean("view_animations", true));
        }
    }

    public static void e() {
        u31 u31Var = x;
        if (u31Var != null) {
            u31Var.b();
        }
    }

    public static u31 f(FrameLayout frameLayout, y21 y21Var, int i) {
        return frameLayout == null ? new r21() : new u31(null, frameLayout, y21Var, i);
    }

    public static u31 g(d dVar, y21 y21Var, int i) {
        if (dVar == null) {
            return new r21();
        }
        if (dVar instanceof yv1) {
            y21.access$000(y21Var, -2, 1);
        } else if (dVar instanceof nk3) {
            y21.access$000(y21Var, -1, 0);
        }
        return new u31(dVar, dVar.getBulletinLayoutContainer(), y21Var, i);
    }

    public static void h(FrameLayout frameLayout) {
        if (frameLayout != null) {
            frameLayout.setTag(R.id.bulletin_delegate_tag, null);
        }
    }

    public final void b() {
        c(0L, oc7.d1().getBoolean("view_animations", true));
    }

    public final void c(long j, boolean z) {
        y21 y21Var = this.e;
        if (y21Var == null || !this.m) {
            return;
        }
        byte b = 0;
        this.m = false;
        if (x == this) {
            x = null;
        }
        WeakHashMap weakHashMap = kfc.a;
        byte b2 = 2;
        if (y21Var.isLaidOut() || this.u) {
            y21Var.removeCallbacks(this.i);
            if (z) {
                byte b3 = 1;
                y21Var.transitionRunningExit = true;
                y21Var.delegate = this.q;
                y21Var.invalidate();
                if (j >= 0 && !this.l) {
                    u21 u21Var = new u21();
                    u21Var.a = j;
                    this.r = u21Var;
                } else if (y21Var != null && this.r == null) {
                    this.r = y21Var.createTransition();
                }
                x21 x21Var = this.r;
                Objects.requireNonNull(y21Var);
                x21Var.b0(y21Var, new j21(y21Var, b), new h21(this, b3), new gx(this, b2));
                return;
            }
        }
        q21 q21Var = this.q;
        if (q21Var != null && !y21Var.top) {
            q21Var.b(0.0f);
            this.q.c(this);
        }
        y21Var.onExitTransitionStart();
        y21Var.onExitTransitionEnd();
        y21Var.onHide();
        if (this.h != null) {
            gm.c3(new h21(this, b2));
        }
        y21Var.onDetach();
        Runnable runnable = this.w;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void i(boolean z) {
        y21 y21Var;
        boolean z2 = z && this.o;
        if (this.n == z2 || (y21Var = this.e) == null) {
            return;
        }
        this.n = z2;
        Runnable runnable = this.i;
        if (!z2) {
            y21Var.removeCallbacks(runnable);
            return;
        }
        int i = this.j;
        if (i >= 0) {
            y21Var.postDelayed(runnable, i);
        }
    }

    public u31 j() {
        k(false);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.view.View$OnLayoutChangeListener, i21] */
    public final void k(final boolean z) {
        FrameLayout frameLayout;
        if (this.m || (frameLayout = this.h) == 0) {
            return;
        }
        this.m = true;
        y21 y21Var = this.e;
        y21Var.setTop(z);
        CharSequence accessibilityText = y21Var.getAccessibilityText();
        if (accessibilityText != null) {
            gm.g2(accessibilityText);
        }
        ViewParent parent = y21Var.getParent();
        k21 k21Var = this.f;
        if (parent != k21Var) {
            dq9.m("Layout has incorrect parent");
            return;
        }
        u31 u31Var = x;
        if (u31Var != null) {
            u31Var.b();
        }
        x = this;
        y21Var.onAttach(this);
        ?? r2 = new View.OnLayoutChangeListener() { // from class: i21
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                u31 u31Var2 = u31.this;
                q21 q21Var = u31Var2.q;
                if ((q21Var == null || q21Var.a()) && !z) {
                    q21 q21Var2 = u31Var2.q;
                    int e = q21Var2 != null ? q21Var2.e(u31Var2.a) : 0;
                    int i9 = u31Var2.p;
                    if (i9 != e) {
                        zna znaVar = u31Var2.d;
                        if (znaVar == null || !znaVar.f) {
                            zna znaVar2 = new zna(new xk4(i9));
                            aoa aoaVar = new aoa();
                            aoaVar.i = e;
                            aoaVar.b(900.0f);
                            aoaVar.a(1.0f);
                            znaVar2.m = aoaVar;
                            u31Var2.d = znaVar2;
                            byte b = 1;
                            znaVar2.b(new h20(u31Var2, b));
                            u31Var2.d.a(new hx0(u31Var2, b));
                        } else {
                            znaVar.m.i = e;
                        }
                        u31Var2.d.h();
                    }
                }
            }
        };
        this.c = r2;
        frameLayout.addOnLayoutChangeListener(r2);
        y21Var.addOnLayoutChangeListener(new l21(this, z));
        if (!this.u) {
            y21Var.addOnAttachStateChangeListener(new wd(this, (byte) 4));
        }
        frameLayout.addView(k21Var);
    }

    public final void l() {
        y21 y21Var = this.e;
        if (y21Var != null) {
            y21Var.updatePosition();
        }
    }

    public u31() {
        this.i = new h21(this, (byte) 0);
        this.o = true;
        this.s = true;
        this.v = true;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
    }
}
