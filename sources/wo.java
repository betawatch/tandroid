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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class wo implements Window.Callback {
    public final Window.Callback a;
    public boolean b;
    public boolean c;
    public boolean d;
    public final /* synthetic */ bp e;

    public wo(bp bpVar, Window.Callback callback) {
        this.e = bpVar;
        if (callback != null) {
            this.a = callback;
        } else {
            w26.j("Window callback may not be null");
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
        vwc.a(this.a, list, menu, i);
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
        yz6 yz6Var;
        if (!this.a.dispatchKeyShortcutEvent(keyEvent)) {
            int keyCode = keyEvent.getKeyCode();
            bp bpVar = this.e;
            zwc p = bpVar.p();
            if (p != null) {
                ywc ywcVar = p.i;
                if (ywcVar == null || (yz6Var = ywcVar.d) == null) {
                    z = false;
                } else {
                    yz6Var.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
                    z = yz6Var.performShortcut(keyCode, keyEvent, 0);
                }
            }
            ap apVar = bpVar.W;
            if (apVar == null || !bpVar.t(apVar, keyEvent.getKeyCode(), keyEvent)) {
                if (bpVar.W == null) {
                    ap o = bpVar.o(0);
                    bpVar.u(o, keyEvent);
                    boolean t = bpVar.t(o, keyEvent.getKeyCode(), keyEvent);
                    o.k = false;
                    if (!t) {
                    }
                }
                return false;
            }
            ap apVar2 = bpVar.W;
            if (apVar2 != null) {
                apVar2.l = true;
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
        if (i != 0 || (menu instanceof yz6)) {
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
        zwc p;
        b(i, menu);
        if (i == 108 && (p = this.e.p()) != null) {
            ArrayList arrayList = p.m;
            if (true != p.l) {
                p.l = true;
                if (arrayList.size() > 0) {
                    arrayList.get(0).getClass();
                    fyb.g();
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
        bp bpVar = this.e;
        if (i != 108) {
            if (i == 0) {
                ap o = bpVar.o(i);
                if (o.m) {
                    bpVar.h(o, false);
                    return;
                }
                return;
            }
            return;
        }
        zwc p = bpVar.p();
        if (p != null) {
            ArrayList arrayList = p.m;
            if (p.l) {
                p.l = false;
                if (arrayList.size() > 0) {
                    arrayList.get(0).getClass();
                    fyb.g();
                }
            }
        }
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z) {
        wwc.a(this.a, z);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        yz6 yz6Var = menu instanceof yz6 ? (yz6) menu : null;
        if (i == 0 && yz6Var == null) {
            return false;
        }
        if (yz6Var != null) {
            yz6Var.x = true;
        }
        boolean onPreparePanel = this.a.onPreparePanel(i, view, menu);
        if (yz6Var != null) {
            yz6Var.x = false;
        }
        return onPreparePanel;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        yz6 yz6Var = this.e.o(0).h;
        if (yz6Var != null) {
            d(list, yz6Var, i);
        } else {
            d(list, menu, i);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return uwc.a(this.a, searchEvent);
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
        bp bpVar = this.e;
        Context context = bpVar.e;
        if (!bpVar.I || i != 0) {
            return uwc.b(this.a, callback, i);
        }
        wtc wtcVar = new wtc();
        wtcVar.b = context;
        wtcVar.a = callback;
        wtcVar.c = new ArrayList();
        boolean z2 = false;
        wtcVar.d = new aia(0);
        f9 f9Var = bpVar.y;
        if (f9Var != null) {
            f9Var.b();
        }
        tg2 tg2Var = new tg2(bpVar, wtcVar, z2, (byte) 5);
        zwc p = bpVar.p();
        if (p != null) {
            ywc ywcVar = p.i;
            if (ywcVar != null) {
                ywcVar.b();
            }
            p.c.setHideOnContentScrollEnabled(false);
            p.f.e();
            ywc ywcVar2 = new ywc(p, p.f.getContext(), tg2Var);
            yz6 yz6Var = ywcVar2.d;
            yz6Var.w();
            try {
                if (((wtc) ywcVar2.e.b).x(ywcVar2, yz6Var)) {
                    p.i = ywcVar2;
                    ywcVar2.h();
                    p.f.c(ywcVar2);
                    p.a(true);
                } else {
                    ywcVar2 = null;
                }
                bpVar.y = ywcVar2;
            } finally {
                yz6Var.v();
            }
        }
        if (bpVar.y == null) {
            afc afcVar = bpVar.H;
            if (afcVar != null) {
                afcVar.b();
            }
            f9 f9Var2 = bpVar.y;
            if (f9Var2 != null) {
                f9Var2.b();
            }
            if (bpVar.E == null) {
                if (bpVar.S) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = context.getTheme();
                    theme.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme newTheme = context.getResources().newTheme();
                        newTheme.setTo(theme);
                        newTheme.applyStyle(typedValue.resourceId, true);
                        ew2 ew2Var = new ew2(context, 0);
                        ew2Var.getTheme().setTo(newTheme);
                        context = ew2Var;
                    }
                    bpVar.E = new ActionBarContextView(context);
                    PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, R.attr.actionModePopupWindowStyle);
                    bpVar.F = popupWindow;
                    popupWindow.setWindowLayoutType(2);
                    bpVar.F.setContentView(bpVar.E);
                    bpVar.F.setWidth(-1);
                    context.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true);
                    bpVar.E.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                    bpVar.F.setHeight(-2);
                    bpVar.G = new qo(bpVar, (byte) 1);
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) bpVar.K.findViewById(R.id.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(bpVar.m()));
                        bpVar.E = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (bpVar.E != null) {
                afc afcVar2 = bpVar.H;
                if (afcVar2 != null) {
                    afcVar2.b();
                }
                bpVar.E.e();
                Context context2 = bpVar.E.getContext();
                ActionBarContextView actionBarContextView = bpVar.E;
                wma wmaVar = new wma();
                wmaVar.c = context2;
                wmaVar.d = actionBarContextView;
                wmaVar.e = tg2Var;
                yz6 yz6Var2 = new yz6(actionBarContextView.getContext());
                yz6Var2.l = true;
                wmaVar.n = yz6Var2;
                yz6Var2.e = wmaVar;
                if (wtcVar.x(wmaVar, yz6Var2)) {
                    wmaVar.h();
                    bpVar.E.c(wmaVar);
                    bpVar.y = wmaVar;
                    if (bpVar.J && (viewGroup = bpVar.K) != null) {
                        WeakHashMap weakHashMap = jdc.a;
                        if (viewGroup.isLaidOut()) {
                            z = true;
                            ActionBarContextView actionBarContextView2 = bpVar.E;
                            if (z) {
                                actionBarContextView2.setAlpha(1.0f);
                                bpVar.E.setVisibility(0);
                                if (bpVar.E.getParent() instanceof View) {
                                    View view = (View) bpVar.E.getParent();
                                    WeakHashMap weakHashMap2 = jdc.a;
                                    zcc.c(view);
                                }
                            } else {
                                actionBarContextView2.setAlpha(0.0f);
                                afc a = jdc.a(bpVar.E);
                                a.a(1.0f);
                                bpVar.H = a;
                                a.d(new ro(bpVar, (byte) 1));
                            }
                            if (bpVar.F != null) {
                                bpVar.f.getDecorView().post(bpVar.G);
                            }
                        }
                    }
                    z = false;
                    ActionBarContextView actionBarContextView22 = bpVar.E;
                    if (z) {
                    }
                    if (bpVar.F != null) {
                    }
                } else {
                    bpVar.y = null;
                }
            }
            bpVar.w();
            bpVar.y = bpVar.y;
        }
        bpVar.w();
        f9 f9Var3 = bpVar.y;
        if (f9Var3 != null) {
            return wtcVar.p(f9Var3);
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
