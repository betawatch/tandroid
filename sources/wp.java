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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class wp implements Window.Callback {
    public final Window.Callback a;
    public boolean b;
    public boolean c;
    public boolean d;
    public final /* synthetic */ bq e;

    public wp(bq bqVar, Window.Callback callback) {
        this.e = bqVar;
        if (callback != null) {
            this.a = callback;
        } else {
            u36.j("Window callback may not be null");
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
        wyc.a(this.a, list, menu, i);
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
        y17 y17Var;
        if (!this.a.dispatchKeyShortcutEvent(keyEvent)) {
            int keyCode = keyEvent.getKeyCode();
            bq bqVar = this.e;
            azc p = bqVar.p();
            if (p != null) {
                zyc zycVar = p.i;
                if (zycVar == null || (y17Var = zycVar.d) == null) {
                    z = false;
                } else {
                    y17Var.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
                    z = y17Var.performShortcut(keyCode, keyEvent, 0);
                }
            }
            aq aqVar = bqVar.W;
            if (aqVar == null || !bqVar.t(aqVar, keyEvent.getKeyCode(), keyEvent)) {
                if (bqVar.W == null) {
                    aq o = bqVar.o(0);
                    bqVar.u(o, keyEvent);
                    boolean t = bqVar.t(o, keyEvent.getKeyCode(), keyEvent);
                    o.k = false;
                    if (!t) {
                    }
                }
                return false;
            }
            aq aqVar2 = bqVar.W;
            if (aqVar2 != null) {
                aqVar2.l = true;
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
        if (i != 0 || (menu instanceof y17)) {
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
        azc p;
        b(i, menu);
        if (i == 108 && (p = this.e.p()) != null) {
            ArrayList arrayList = p.m;
            if (true != p.l) {
                p.l = true;
                if (arrayList.size() > 0) {
                    arrayList.get(0).getClass();
                    rjb.p();
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
        bq bqVar = this.e;
        if (i != 108) {
            if (i == 0) {
                aq o = bqVar.o(i);
                if (o.m) {
                    bqVar.h(o, false);
                    return;
                }
                return;
            }
            return;
        }
        azc p = bqVar.p();
        if (p != null) {
            ArrayList arrayList = p.m;
            if (p.l) {
                p.l = false;
                if (arrayList.size() > 0) {
                    arrayList.get(0).getClass();
                    rjb.p();
                }
            }
        }
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z) {
        xyc.a(this.a, z);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        y17 y17Var = menu instanceof y17 ? (y17) menu : null;
        if (i == 0 && y17Var == null) {
            return false;
        }
        if (y17Var != null) {
            y17Var.x = true;
        }
        boolean onPreparePanel = this.a.onPreparePanel(i, view, menu);
        if (y17Var != null) {
            y17Var.x = false;
        }
        return onPreparePanel;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        y17 y17Var = this.e.o(0).h;
        if (y17Var != null) {
            d(list, y17Var, i);
        } else {
            d(list, menu, i);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return vyc.a(this.a, searchEvent);
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
        bq bqVar = this.e;
        Context context = bqVar.e;
        if (!bqVar.I || i != 0) {
            return vyc.b(this.a, callback, i);
        }
        e7a e7aVar = new e7a();
        e7aVar.b = context;
        e7aVar.a = callback;
        e7aVar.c = new ArrayList();
        boolean z2 = false;
        e7aVar.d = new cka(0);
        f9 f9Var = bqVar.y;
        if (f9Var != null) {
            f9Var.b();
        }
        lx6 lx6Var = new lx6(bqVar, e7aVar, z2, (byte) 4);
        azc p = bqVar.p();
        if (p != null) {
            zyc zycVar = p.i;
            if (zycVar != null) {
                zycVar.b();
            }
            p.c.setHideOnContentScrollEnabled(false);
            p.f.e();
            zyc zycVar2 = new zyc(p, p.f.getContext(), lx6Var);
            y17 y17Var = zycVar2.d;
            y17Var.w();
            try {
                if (((e7a) zycVar2.e.b).C(zycVar2, y17Var)) {
                    p.i = zycVar2;
                    zycVar2.h();
                    p.f.c(zycVar2);
                    p.a(true);
                } else {
                    zycVar2 = null;
                }
                bqVar.y = zycVar2;
            } finally {
                y17Var.v();
            }
        }
        if (bqVar.y == null) {
            ahc ahcVar = bqVar.H;
            if (ahcVar != null) {
                ahcVar.b();
            }
            f9 f9Var2 = bqVar.y;
            if (f9Var2 != null) {
                f9Var2.b();
            }
            if (bqVar.E == null) {
                if (bqVar.S) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = context.getTheme();
                    theme.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme newTheme = context.getResources().newTheme();
                        newTheme.setTo(theme);
                        newTheme.applyStyle(typedValue.resourceId, true);
                        ox2 ox2Var = new ox2(context, 0);
                        ox2Var.getTheme().setTo(newTheme);
                        context = ox2Var;
                    }
                    bqVar.E = new ActionBarContextView(context);
                    PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, R.attr.actionModePopupWindowStyle);
                    bqVar.F = popupWindow;
                    popupWindow.setWindowLayoutType(2);
                    bqVar.F.setContentView(bqVar.E);
                    bqVar.F.setWidth(-1);
                    context.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true);
                    bqVar.E.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                    bqVar.F.setHeight(-2);
                    bqVar.G = new qp(bqVar, (byte) 1);
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) bqVar.K.findViewById(R.id.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(bqVar.m()));
                        bqVar.E = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (bqVar.E != null) {
                ahc ahcVar2 = bqVar.H;
                if (ahcVar2 != null) {
                    ahcVar2.b();
                }
                bqVar.E.e();
                Context context2 = bqVar.E.getContext();
                ActionBarContextView actionBarContextView = bqVar.E;
                xoa xoaVar = new xoa();
                xoaVar.c = context2;
                xoaVar.d = actionBarContextView;
                xoaVar.e = lx6Var;
                y17 y17Var2 = new y17(actionBarContextView.getContext());
                y17Var2.l = true;
                xoaVar.n = y17Var2;
                y17Var2.e = xoaVar;
                if (e7aVar.C(xoaVar, y17Var2)) {
                    xoaVar.h();
                    bqVar.E.c(xoaVar);
                    bqVar.y = xoaVar;
                    if (bqVar.J && (viewGroup = bqVar.K) != null) {
                        WeakHashMap weakHashMap = kfc.a;
                        if (viewGroup.isLaidOut()) {
                            z = true;
                            ActionBarContextView actionBarContextView2 = bqVar.E;
                            if (z) {
                                actionBarContextView2.setAlpha(1.0f);
                                bqVar.E.setVisibility(0);
                                if (bqVar.E.getParent() instanceof View) {
                                    View view = (View) bqVar.E.getParent();
                                    WeakHashMap weakHashMap2 = kfc.a;
                                    afc.c(view);
                                }
                            } else {
                                actionBarContextView2.setAlpha(0.0f);
                                ahc a = kfc.a(bqVar.E);
                                a.a(1.0f);
                                bqVar.H = a;
                                a.d(new rp(bqVar, (byte) 1));
                            }
                            if (bqVar.F != null) {
                                bqVar.f.getDecorView().post(bqVar.G);
                            }
                        }
                    }
                    z = false;
                    ActionBarContextView actionBarContextView22 = bqVar.E;
                    if (z) {
                    }
                    if (bqVar.F != null) {
                    }
                } else {
                    bqVar.y = null;
                }
            }
            bqVar.w();
            bqVar.y = bqVar.y;
        }
        bqVar.w();
        f9 f9Var3 = bqVar.y;
        if (f9Var3 != null) {
            return e7aVar.q(f9Var3);
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
