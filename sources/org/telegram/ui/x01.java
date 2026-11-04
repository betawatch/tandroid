package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.PopupWindow;
import java.lang.reflect.Field;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class x01 extends PopupWindow {
    public static final Field c;
    public static final org.telegram.ui.ActionBar.z0 d = new org.telegram.ui.ActionBar.z0(2);
    public final ViewTreeObserver.OnScrollChangedListener a;
    public ViewTreeObserver b;

    static {
        Field field = null;
        try {
            field = PopupWindow.class.getDeclaredField("mOnScrollChangedListener");
            field.setAccessible(true);
        } catch (NoSuchFieldException unused) {
        }
        c = field;
    }

    public x01(g11 g11Var) {
        super(g11Var, -2, -2);
        setFocusable(true);
        setAnimationStyle(0);
        setOutsideTouchable(true);
        setClippingEnabled(true);
        setInputMethodMode(0);
        setSoftInputMode(4);
        Field field = c;
        if (field != null) {
            try {
                this.a = (ViewTreeObserver.OnScrollChangedListener) field.get(this);
                field.set(this, d);
            } catch (Exception unused) {
                this.a = null;
            }
        }
    }

    public final void b() {
        View rootView = getContentView().getRootView();
        WindowManager windowManager = (WindowManager) getContentView().getContext().getSystemService("window");
        WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) rootView.getLayoutParams();
        layoutParams.flags |= 2;
        layoutParams.dimAmount = 0.2f;
        windowManager.updateViewLayout(rootView, layoutParams);
    }

    public final void c(View view) {
        if (getContentView() instanceof g11) {
            ((g11) getContentView()).s(new w01(this, 1));
        }
        if (this.a != null) {
            ViewTreeObserver viewTreeObserver = view.getWindowToken() != null ? view.getViewTreeObserver() : null;
            ViewTreeObserver viewTreeObserver2 = this.b;
            if (viewTreeObserver != viewTreeObserver2) {
                if (viewTreeObserver2 != null && viewTreeObserver2.isAlive()) {
                    this.b.removeOnScrollChangedListener(this.a);
                }
                this.b = viewTreeObserver;
                if (viewTreeObserver != null) {
                    viewTreeObserver.addOnScrollChangedListener(this.a);
                }
            }
        }
    }

    @Override // android.widget.PopupWindow
    public void dismiss() {
        if (!(getContentView() instanceof g11)) {
            super.dismiss();
            return;
        }
        g11 g11Var = (g11) getContentView();
        w01 w01Var = new w01(this, 0);
        Integer num = g11Var.a2;
        if (num != null) {
            g11.e2.put(num, g11Var.s0.e0());
        }
        ValueAnimator valueAnimator = g11Var.X1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            g11Var.X1 = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        g11Var.X1 = ofFloat;
        ofFloat.addUpdateListener(new jz0(g11Var, 3));
        g11Var.X1.addListener(new org.telegram.ui.Components.ri0(14, g11Var, w01Var));
        g11Var.X1.setDuration(200L);
        g11Var.X1.setInterpolator(org.telegram.ui.Components.xq.h);
        g11Var.X1.start();
        yz0 yz0Var = g11Var.g0;
        if (yz0Var != null) {
            org.telegram.messenger.g0.v1(yz0Var.h);
        }
        View rootView = getContentView().getRootView();
        WindowManager windowManager = (WindowManager) getContentView().getContext().getSystemService("window");
        if (rootView.getLayoutParams() == null || !(rootView.getLayoutParams() instanceof WindowManager.LayoutParams)) {
            return;
        }
        WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) rootView.getLayoutParams();
        try {
            int i3 = layoutParams.flags;
            if ((i3 & 2) != 0) {
                layoutParams.flags = i3 & (-3);
                layoutParams.dimAmount = 0.0f;
                windowManager.updateViewLayout(rootView, layoutParams);
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.widget.PopupWindow
    public final void showAsDropDown(View view) {
        super.showAsDropDown(view);
        c(view);
    }

    @Override // android.widget.PopupWindow
    public final void showAtLocation(View view, int i3, int i10, int i11) {
        ViewTreeObserver viewTreeObserver;
        super.showAtLocation(view, i3, i10, i11);
        if (this.a == null || (viewTreeObserver = this.b) == null) {
            return;
        }
        if (viewTreeObserver.isAlive()) {
            this.b.removeOnScrollChangedListener(this.a);
        }
        this.b = null;
    }

    @Override // android.widget.PopupWindow
    public final void showAsDropDown(View view, int i3, int i10) {
        super.showAsDropDown(view, i3, i10);
        c(view);
    }

    @Override // android.widget.PopupWindow
    public final void showAsDropDown(View view, int i3, int i10, int i11) {
        super.showAsDropDown(view, i3, i10, i11);
        c(view);
    }
}
