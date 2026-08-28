package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public abstract class s51 extends PopupWindow {
    public static final Field c;
    public static final org.telegram.ui.ActionBar.h1 d = new org.telegram.ui.ActionBar.h1(2);
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

    public s51(b61 b61Var) {
        super(b61Var, -2, -2);
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
        if (getContentView() instanceof b61) {
            ((b61) getContentView()).s(new r51(this, 1));
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
        if (!(getContentView() instanceof b61)) {
            super.dismiss();
            return;
        }
        b61 b61Var = (b61) getContentView();
        r51 r51Var = new r51(this, 0);
        Integer num = b61Var.U1;
        if (num != null) {
            b61.Y1.put(num, b61Var.n0.e0());
        }
        ValueAnimator valueAnimator = b61Var.R1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            b61Var.R1 = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        b61Var.R1 = ofFloat;
        ofFloat.addUpdateListener(new e41(b61Var, 3));
        b61Var.R1.addListener(new org.telegram.ui.Components.su0(13, b61Var, r51Var));
        b61Var.R1.setDuration(200L);
        b61Var.R1.setInterpolator(org.telegram.ui.Components.gr.h);
        b61Var.R1.start();
        s41 s41Var = b61Var.b0;
        if (s41Var != null) {
            AndroidUtilities.hideKeyboard(s41Var.h);
        }
        View rootView = getContentView().getRootView();
        WindowManager windowManager = (WindowManager) getContentView().getContext().getSystemService("window");
        if (rootView.getLayoutParams() == null || !(rootView.getLayoutParams() instanceof WindowManager.LayoutParams)) {
            return;
        }
        WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) rootView.getLayoutParams();
        try {
            int i9 = layoutParams.flags;
            if ((i9 & 2) != 0) {
                layoutParams.flags = i9 & (-3);
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
    public final void showAtLocation(View view, int i9, int i10, int i11) {
        ViewTreeObserver viewTreeObserver;
        super.showAtLocation(view, i9, i10, i11);
        if (this.a == null || (viewTreeObserver = this.b) == null) {
            return;
        }
        if (viewTreeObserver.isAlive()) {
            this.b.removeOnScrollChangedListener(this.a);
        }
        this.b = null;
    }

    @Override // android.widget.PopupWindow
    public final void showAsDropDown(View view, int i9, int i10) {
        super.showAsDropDown(view, i9, i10);
        c(view);
    }

    @Override // android.widget.PopupWindow
    public final void showAsDropDown(View view, int i9, int i10, int i11) {
        super.showAsDropDown(view, i9, i10, i11);
        c(view);
    }
}
