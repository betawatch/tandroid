// default package

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import java.util.WeakHashMap;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class zoa extends i27 implements PopupWindow.OnDismissListener, View.OnKeyListener {
    public r27 E;
    public ViewTreeObserver F;
    public boolean G;
    public boolean H;
    public int I;
    public boolean K;
    public final Context b;
    public final y17 c;
    public final v17 d;
    public final boolean e;
    public final int f;
    public final int h;
    public final q27 n;
    public j27 w;
    public View x;
    public View y;
    public final uq r = new uq(this, 6);
    public final wd s = new wd(this, 18);
    public int J = 0;

    public zoa(Context context, y17 y17Var, View view, int i, boolean z) {
        this.b = context;
        this.c = y17Var;
        this.e = z;
        this.d = new v17(y17Var, LayoutInflater.from(context), z, R.layout.abc_popup_menu_item_layout);
        this.h = i;
        Resources resources = context.getResources();
        this.f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.x = view;
        this.n = new q27(context, null, i);
        y17Var.b(this, context);
    }

    @Override // xia
    public final boolean a() {
        return !this.G && this.n.P.isShowing();
    }

    @Override // s27
    public final boolean b(dcb dcbVar) {
        boolean z;
        if (dcbVar.hasVisibleItems()) {
            l27 l27Var = new l27(this.b, dcbVar, this.y, this.e, this.h, 0);
            r27 r27Var = this.E;
            l27Var.h = r27Var;
            i27 i27Var = l27Var.i;
            if (i27Var != null) {
                i27Var.h(r27Var);
            }
            int size = dcbVar.f.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    z = false;
                    break;
                }
                MenuItem item = dcbVar.getItem(i);
                if (item.isVisible() && item.getIcon() != null) {
                    z = true;
                    break;
                }
                i++;
            }
            l27Var.g = z;
            i27 i27Var2 = l27Var.i;
            if (i27Var2 != null) {
                i27Var2.o(z);
            }
            l27Var.j = this.w;
            this.w = null;
            this.c.c(false);
            q27 q27Var = this.n;
            int i2 = q27Var.f;
            int m = q27Var.m();
            int i3 = this.J;
            View view = this.x;
            WeakHashMap weakHashMap = kfc.a;
            if ((Gravity.getAbsoluteGravity(i3, view.getLayoutDirection()) & 7) == 5) {
                i2 += this.x.getWidth();
            }
            if (!l27Var.b()) {
                if (l27Var.e != null) {
                    l27Var.d(i2, m, true, true);
                }
            }
            r27 r27Var2 = this.E;
            if (r27Var2 != null) {
                r27Var2.w0(dcbVar);
            }
            return true;
        }
        return false;
    }

    @Override // s27
    public final boolean c() {
        return false;
    }

    @Override // s27
    public final void d(y17 y17Var, boolean z) {
        if (y17Var == this.c) {
            dismiss();
            r27 r27Var = this.E;
            if (r27Var != null) {
                r27Var.d(y17Var, z);
            }
        }
    }

    @Override // xia
    public final void dismiss() {
        if (a()) {
            this.n.dismiss();
        }
    }

    @Override // xia
    public final os3 e() {
        return this.n.c;
    }

    @Override // xia
    public final void f() {
        View view;
        if (a()) {
            return;
        }
        if (this.G || (view = this.x) == null) {
            dq9.m("StandardMenuPopup cannot be used without an anchor");
            return;
        }
        this.y = view;
        q27 q27Var = this.n;
        nq nqVar = q27Var.P;
        nq nqVar2 = q27Var.P;
        nqVar.setOnDismissListener(this);
        q27Var.G = this;
        q27Var.O = true;
        nqVar2.setFocusable(true);
        View view2 = this.y;
        boolean z = this.F == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.F = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.r);
        }
        view2.addOnAttachStateChangeListener(this.s);
        q27Var.F = view2;
        q27Var.x = this.J;
        boolean z2 = this.H;
        Context context = this.b;
        v17 v17Var = this.d;
        if (!z2) {
            this.I = i27.m(v17Var, context, this.f);
            this.H = true;
        }
        q27Var.p(this.I);
        nqVar2.setInputMethodMode(2);
        Rect rect = this.a;
        q27Var.N = rect != null ? new Rect(rect) : null;
        q27Var.f();
        os3 os3Var = q27Var.c;
        os3Var.setOnKeyListener(this);
        if (this.K) {
            y17 y17Var = this.c;
            if (y17Var.m != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) os3Var, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(y17Var.m);
                }
                frameLayout.setEnabled(false);
                os3Var.addHeaderView(frameLayout, null, false);
            }
        }
        q27Var.n(v17Var);
        q27Var.f();
    }

    @Override // s27
    public final void h(r27 r27Var) {
        this.E = r27Var;
    }

    @Override // s27
    public final void j() {
        this.H = false;
        v17 v17Var = this.d;
        if (v17Var != null) {
            v17Var.notifyDataSetChanged();
        }
    }

    @Override // i27
    public final void n(View view) {
        this.x = view;
    }

    @Override // i27
    public final void o(boolean z) {
        this.d.c = z;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.G = true;
        this.c.c(true);
        ViewTreeObserver viewTreeObserver = this.F;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.F = this.y.getViewTreeObserver();
            }
            this.F.removeGlobalOnLayoutListener(this.r);
            this.F = null;
        }
        this.y.removeOnAttachStateChangeListener(this.s);
        j27 j27Var = this.w;
        if (j27Var != null) {
            j27Var.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // i27
    public final void p(int i) {
        this.J = i;
    }

    @Override // i27
    public final void q(int i) {
        this.n.f = i;
    }

    @Override // i27
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.w = (j27) onDismissListener;
    }

    @Override // i27
    public final void s(boolean z) {
        this.K = z;
    }

    @Override // i27
    public final void t(int i) {
        this.n.j(i);
    }
}
