// default package

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.widget.PopupWindow;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ViewStubCompat;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class xo implements Window.Callback {
    public final Window.Callback a;
    public boolean b;
    public boolean c;
    public boolean d;
    public final /* synthetic */ cp e;

    public xo(cp cpVar, Window.Callback callback) {
        this.e = cpVar;
        if (callback != null) {
            this.a = callback;
        } else {
            lq5.j("Window callback may not be null");
            throw null;
        }
    }

    public final void a(Window.Callback callback) {
        try {
            this.b = true;
            callback.onContentChanged();
        } finally {
            this.b = false;
        }
    }

    public final boolean b(int i, Menu menu) {
        return this.a.onMenuOpened(i, menu);
    }

    public final void c(int i, Menu menu) {
        this.a.onPanelClosed(i, menu);
    }

    public final void d(List list, Menu menu, int i) {
        l1d.a(this.a, list, menu, i);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.a.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z = this.c;
        Window.Callback callback = this.a;
        return z ? callback.dispatchKeyEvent(keyEvent) : this.e.i(keyEvent) || callback.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0038, code lost:
    
        if (r0 == false) goto L17;
     */
    @Override // android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        boolean z;
        f27 f27Var;
        if (!this.a.dispatchKeyShortcutEvent(keyEvent)) {
            int keyCode = keyEvent.getKeyCode();
            cp cpVar = this.e;
            p1d p = cpVar.p();
            if (p != null) {
                o1d o1dVar = p.i;
                if (o1dVar == null || (f27Var = o1dVar.d) == null) {
                    z = false;
                } else {
                    f27Var.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
                    z = f27Var.performShortcut(keyCode, keyEvent, 0);
                }
            }
            bp bpVar = cpVar.W;
            if (bpVar == null || !cpVar.t(bpVar, keyEvent.getKeyCode(), keyEvent)) {
                if (cpVar.W == null) {
                    bp o = cpVar.o(0);
                    cpVar.u(o, keyEvent);
                    boolean t = cpVar.t(o, keyEvent.getKeyCode(), keyEvent);
                    o.k = false;
                    if (!t) {
                    }
                }
                return false;
            }
            bp bpVar2 = cpVar.W;
            if (bpVar2 != null) {
                bpVar2.l = true;
                return true;
            }
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.a.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.a.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.a.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.a.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.a.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.b) {
            this.a.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0 || (menu instanceof f27)) {
            return this.a.onCreatePanelMenu(i, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i) {
        return this.a.onCreatePanelView(i);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.a.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.a.onMenuItemSelected(i, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        p1d p;
        b(i, menu);
        if (i == 108 && (p = this.e.p()) != null) {
            ArrayList arrayList = p.m;
            if (true != p.l) {
                p.l = true;
                if (arrayList.size() > 0) {
                    arrayList.get(0).getClass();
                    grb.o();
                    return false;
                }
            }
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        if (this.d) {
            this.a.onPanelClosed(i, menu);
            return;
        }
        c(i, menu);
        cp cpVar = this.e;
        if (i != 108) {
            if (i == 0) {
                bp o = cpVar.o(i);
                if (o.m) {
                    cpVar.h(o, false);
                    return;
                }
                return;
            }
            return;
        }
        p1d p = cpVar.p();
        if (p != null) {
            ArrayList arrayList = p.m;
            if (p.l) {
                p.l = false;
                if (arrayList.size() > 0) {
                    arrayList.get(0).getClass();
                    grb.o();
                }
            }
        }
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z) {
        m1d.a(this.a, z);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        f27 f27Var = menu instanceof f27 ? (f27) menu : null;
        if (i == 0 && f27Var == null) {
            return false;
        }
        if (f27Var != null) {
            f27Var.x = true;
        }
        boolean onPreparePanel = this.a.onPreparePanel(i, view, menu);
        if (f27Var != null) {
            f27Var.x = false;
        }
        return onPreparePanel;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        f27 f27Var = this.e.o(0).h;
        if (f27Var != null) {
            d(list, f27Var, i);
        } else {
            d(list, menu, i);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return k1d.a(this.a, searchEvent);
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.a.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        this.a.onWindowFocusChanged(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01a8  */
    @Override // android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        boolean z;
        ViewGroup viewGroup;
        cp cpVar = this.e;
        Context context = cpVar.e;
        if (!cpVar.I || i != 0) {
            return k1d.b(this.a, callback, i);
        }
        u8a u8aVar = new u8a();
        u8aVar.b = context;
        u8aVar.a = callback;
        u8aVar.c = new ArrayList();
        boolean z2 = false;
        u8aVar.d = new vla(0);
        g9 g9Var = cpVar.y;
        if (g9Var != null) {
            g9Var.b();
        }
        lh2 lh2Var = new lh2(cpVar, u8aVar, z2, (byte) 5);
        p1d p = cpVar.p();
        if (p != null) {
            o1d o1dVar = p.i;
            if (o1dVar != null) {
                o1dVar.b();
            }
            p.c.setHideOnContentScrollEnabled(false);
            p.f.e();
            o1d o1dVar2 = new o1d(p, p.f.getContext(), lh2Var);
            f27 f27Var = o1dVar2.d;
            f27Var.w();
            try {
                if (((u8a) o1dVar2.e.b).C(o1dVar2, f27Var)) {
                    p.i = o1dVar2;
                    o1dVar2.h();
                    p.f.c(o1dVar2);
                    p.a(true);
                } else {
                    o1dVar2 = null;
                }
                cpVar.y = o1dVar2;
            } finally {
                f27Var.v();
            }
        }
        if (cpVar.y == null) {
            zic zicVar = cpVar.H;
            if (zicVar != null) {
                zicVar.b();
            }
            g9 g9Var2 = cpVar.y;
            if (g9Var2 != null) {
                g9Var2.b();
            }
            if (cpVar.E == null) {
                if (cpVar.S) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = context.getTheme();
                    theme.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme newTheme = context.getResources().newTheme();
                        newTheme.setTo(theme);
                        newTheme.applyStyle(typedValue.resourceId, true);
                        yw2 yw2Var = new yw2(context, 0);
                        yw2Var.getTheme().setTo(newTheme);
                        context = yw2Var;
                    }
                    cpVar.E = new ActionBarContextView(context);
                    PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, R.attr.actionModePopupWindowStyle);
                    cpVar.F = popupWindow;
                    popupWindow.setWindowLayoutType(2);
                    cpVar.F.setContentView(cpVar.E);
                    cpVar.F.setWidth(-1);
                    context.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true);
                    cpVar.E.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                    cpVar.F.setHeight(-2);
                    cpVar.G = new ro(cpVar, (byte) 1);
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) cpVar.K.findViewById(R.id.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(cpVar.m()));
                        cpVar.E = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (cpVar.E != null) {
                zic zicVar2 = cpVar.H;
                if (zicVar2 != null) {
                    zicVar2.b();
                }
                cpVar.E.e();
                Context context2 = cpVar.E.getContext();
                ActionBarContextView actionBarContextView = cpVar.E;
                tqa tqaVar = new tqa();
                tqaVar.c = context2;
                tqaVar.d = actionBarContextView;
                tqaVar.e = lh2Var;
                f27 f27Var2 = new f27(actionBarContextView.getContext());
                f27Var2.l = true;
                tqaVar.n = f27Var2;
                f27Var2.e = tqaVar;
                if (u8aVar.C(tqaVar, f27Var2)) {
                    tqaVar.h();
                    cpVar.E.c(tqaVar);
                    cpVar.y = tqaVar;
                    if (cpVar.J && (viewGroup = cpVar.K) != null) {
                        WeakHashMap weakHashMap = ihc.a;
                        if (viewGroup.isLaidOut()) {
                            z = true;
                            ActionBarContextView actionBarContextView2 = cpVar.E;
                            if (z) {
                                actionBarContextView2.setAlpha(1.0f);
                                cpVar.E.setVisibility(0);
                                if (cpVar.E.getParent() instanceof View) {
                                    View view = (View) cpVar.E.getParent();
                                    WeakHashMap weakHashMap2 = ihc.a;
                                    ygc.c(view);
                                }
                            } else {
                                actionBarContextView2.setAlpha(0.0f);
                                zic a = ihc.a(cpVar.E);
                                a.a(1.0f);
                                cpVar.H = a;
                                a.d(new so(cpVar, (byte) 1));
                            }
                            if (cpVar.F != null) {
                                cpVar.f.getDecorView().post(cpVar.G);
                            }
                        }
                    }
                    z = false;
                    ActionBarContextView actionBarContextView22 = cpVar.E;
                    if (z) {
                    }
                    if (cpVar.F != null) {
                    }
                } else {
                    cpVar.y = null;
                }
            }
            cpVar.w();
            cpVar.y = cpVar.y;
        }
        cpVar.w();
        g9 g9Var3 = cpVar.y;
        if (g9Var3 != null) {
            return u8aVar.q(g9Var3);
        }
        return null;
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.a.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }
}
