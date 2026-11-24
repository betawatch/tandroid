// default package

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class wma extends f9 implements wz6 {
    public Context c;
    public ActionBarContextView d;
    public tg2 e;
    public WeakReference f;
    public boolean h;
    public yz6 n;

    @Override // wz6
    public final boolean B(yz6 yz6Var, MenuItem menuItem) {
        return ((wtc) this.e.b).w(this, menuItem);
    }

    @Override // f9
    public final void b() {
        if (this.h) {
            return;
        }
        this.h = true;
        this.e.S(this);
    }

    @Override // f9
    public final View c() {
        WeakReference weakReference = this.f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // f9
    public final yz6 d() {
        return this.n;
    }

    @Override // f9
    public final xbb e() {
        return new xbb(this.d.getContext());
    }

    @Override // f9
    public final CharSequence f() {
        return this.d.getSubtitle();
    }

    @Override // f9
    public final CharSequence g() {
        return this.d.getTitle();
    }

    @Override // f9
    public final void h() {
        this.e.W(this, this.n);
    }

    @Override // f9
    public final boolean i() {
        return this.d.J;
    }

    @Override // f9
    public final void l(View view) {
        this.d.setCustomView(view);
        this.f = view != null ? new WeakReference(view) : null;
    }

    @Override // f9
    public final void m(int i) {
        n(this.c.getString(i));
    }

    @Override // f9
    public final void n(CharSequence charSequence) {
        this.d.setSubtitle(charSequence);
    }

    @Override // f9
    public final void o(int i) {
        p(this.c.getString(i));
    }

    @Override // wz6
    public final void o1(yz6 yz6Var) {
        h();
        b9 b9Var = this.d.d;
        if (b9Var != null) {
            b9Var.l();
        }
    }

    @Override // f9
    public final void p(CharSequence charSequence) {
        this.d.setTitle(charSequence);
    }

    @Override // f9
    public final void q(boolean z) {
        this.a = z;
        this.d.setTitleOptional(z);
    }
}
