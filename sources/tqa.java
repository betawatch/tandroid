// default package

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class tqa extends g9 implements d27 {
    public Context c;
    public ActionBarContextView d;
    public lh2 e;
    public WeakReference f;
    public boolean h;
    public f27 n;

    @Override // d27
    public final boolean B(f27 f27Var, MenuItem menuItem) {
        return ((u8a) this.e.b).B(this, menuItem);
    }

    @Override // d27
    public final void Q1(f27 f27Var) {
        h();
        c9 c9Var = this.d.d;
        if (c9Var != null) {
            c9Var.l();
        }
    }

    @Override // g9
    public final void b() {
        if (this.h) {
            return;
        }
        this.h = true;
        this.e.F(this);
    }

    @Override // g9
    public final View c() {
        WeakReference weakReference = this.f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // g9
    public final f27 d() {
        return this.n;
    }

    @Override // g9
    public final tfb e() {
        return new tfb(this.d.getContext());
    }

    @Override // g9
    public final CharSequence f() {
        return this.d.getSubtitle();
    }

    @Override // g9
    public final CharSequence g() {
        return this.d.getTitle();
    }

    @Override // g9
    public final void h() {
        this.e.M(this, this.n);
    }

    @Override // g9
    public final boolean i() {
        return this.d.J;
    }

    @Override // g9
    public final void l(View view) {
        this.d.setCustomView(view);
        this.f = view != null ? new WeakReference(view) : null;
    }

    @Override // g9
    public final void m(int i) {
        n(this.c.getString(i));
    }

    @Override // g9
    public final void n(CharSequence charSequence) {
        this.d.setSubtitle(charSequence);
    }

    @Override // g9
    public final void o(int i) {
        p(this.c.getString(i));
    }

    @Override // g9
    public final void p(CharSequence charSequence) {
        this.d.setTitle(charSequence);
    }

    @Override // g9
    public final void q(boolean z) {
        this.a = z;
        this.d.setTitleOptional(z);
    }
}
