// default package

import android.content.ComponentName;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import j$.util.Objects;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class t07 implements Menu {
    public final cs5 a;
    public final uu0 b;
    public final Runnable c;
    public final wf0 d;

    public t07(cs5 cs5Var, gt3 gt3Var) {
        Objects.requireNonNull(gt3Var);
        uu0 uu0Var = new uu0(gt3Var, (byte) 1);
        Runnable onPremiumMenuLockClickListener = gt3Var.getOnPremiumMenuLockClickListener();
        wf0 wf0Var = new wf0(gt3Var, (byte) 3);
        this.a = cs5Var;
        this.b = uu0Var;
        this.c = onPremiumMenuLockClickListener;
        this.d = wf0Var;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        if (i2 != R.id.menu_quote || ((Boolean) this.d.run()).booleanValue()) {
            Runnable runnable = this.c;
            if ((i2 != R.id.menu_regular || runnable == null) && (runnable == null || !gk4.r.contains(Integer.valueOf(i2)) || !na7.q1(y6c.t0).E3())) {
                sm3 sm3Var = new sm3(this, i2, (byte) 22);
                cs5 cs5Var = this.a;
                cs5Var.b(0, charSequence, sm3Var, false);
                if (runnable != null && gk4.r.contains(Integer.valueOf(i2))) {
                    cs5Var.N(runnable);
                }
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        return 0;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return null;
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        return false;
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return false;
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i2) {
        return false;
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return false;
    }

    @Override // android.view.Menu
    public final int size() {
        return 0;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return null;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return null;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return null;
    }

    @Override // android.view.Menu
    public final void clear() {
    }

    @Override // android.view.Menu
    public final void close() {
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
    }

    @Override // android.view.Menu
    public final void setQwertyMode(boolean z) {
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z) {
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z) {
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z, boolean z2) {
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, int i4) {
        add(i, i2, i3, k96.M0(i4, null));
        return null;
    }
}
