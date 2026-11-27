// default package

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class zdb extends f27 implements SubMenu {
    public final j27 A;
    public final f27 z;

    public zdb(Context context, f27 f27Var, j27 j27Var) {
        super(context);
        this.z = f27Var;
        this.A = j27Var;
    }

    @Override // f27
    public final boolean d(j27 j27Var) {
        return this.z.d(j27Var);
    }

    @Override // f27
    public final boolean e(f27 f27Var, MenuItem menuItem) {
        return super.e(f27Var, menuItem) || this.z.e(f27Var, menuItem);
    }

    @Override // f27
    public final boolean f(j27 j27Var) {
        return this.z.f(j27Var);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.A;
    }

    @Override // f27
    public final String j() {
        int i = this.A.a;
        if (i == 0) {
            return null;
        }
        return uh9.k(i, "android:menu:actionviewstates:");
    }

    @Override // f27
    public final f27 k() {
        return this.z.k();
    }

    @Override // f27
    public final boolean m() {
        return this.z.m();
    }

    @Override // f27
    public final boolean n() {
        return this.z.n();
    }

    @Override // f27
    public final boolean o() {
        return this.z.o();
    }

    @Override // f27, android.view.Menu
    public final void setGroupDividerEnabled(boolean z) {
        this.z.setGroupDividerEnabled(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        u(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        u(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        u(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.A.setIcon(drawable);
        return this;
    }

    @Override // f27, android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.z.setQwertyMode(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        this.A.setIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i) {
        u(0, null, i, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i) {
        u(i, null, 0, null, null);
        return this;
    }
}
