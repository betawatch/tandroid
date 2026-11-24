// default package

import android.content.ComponentName;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import j$.util.Objects;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class t27 implements Menu {
    public final bu5 a;
    public final ew0 b;
    public final Runnable c;
    public final wg0 d;

    public t27(bu5 bu5Var, qu3 qu3Var) {
        Objects.requireNonNull(qu3Var);
        ew0 ew0Var = new ew0(qu3Var, (byte) 1);
        Runnable onPremiumMenuLockClickListener = qu3Var.getOnPremiumMenuLockClickListener();
        wg0 wg0Var = new wg0(qu3Var, (byte) 3);
        this.a = bu5Var;
        this.b = ew0Var;
        this.c = onPremiumMenuLockClickListener;
        this.d = wg0Var;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        if (i2 != R.id.menu_quote || ((Boolean) this.d.run()).booleanValue()) {
            Runnable runnable = this.c;
            if ((i2 != R.id.menu_regular || runnable == null) && (runnable == null || !hm4.r.contains(Integer.valueOf(i2)) || !oc7.r1(z8c.t0).H3())) {
                bm3 bm3Var = new bm3(this, i2, (byte) 24);
                bu5 bu5Var = this.a;
                bu5Var.b(0, charSequence, bm3Var, false);
                if (runnable != null && hm4.r.contains(Integer.valueOf(i2))) {
                    bu5Var.N(runnable);
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
        add(i, i2, i3, jb6.M0(i4, null));
        return null;
    }
}
