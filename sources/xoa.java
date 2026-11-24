// default package

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class xoa extends f9 implements w17 {
    public Context c;
    public ActionBarContextView d;
    public lx6 e;
    public WeakReference f;
    public boolean h;
    public y17 n;

    @Override // w17
    public final boolean B(y17 y17Var, MenuItem menuItem) {
        return ((e7a) this.e.b).B(this, menuItem);
    }

    @Override // w17
    public final void T1(y17 y17Var) {
        h();
        b9 b9Var = this.d.d;
        if (b9Var != null) {
            b9Var.l();
        }
    }

    @Override // f9
    public final void b() {
        if (this.h) {
            return;
        }
        this.h = true;
        this.e.B(this);
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
    public final y17 d() {
        return this.n;
    }

    @Override // f9
    public final zdb e() {
        return new zdb(this.d.getContext());
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
        this.e.J(this, this.n);
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
