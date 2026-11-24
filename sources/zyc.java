// default package

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class zyc extends f9 implements w17 {
    public final Context c;
    public final y17 d;
    public lx6 e;
    public WeakReference f;
    public final /* synthetic */ azc h;

    public zyc(azc azcVar, Context context, lx6 lx6Var) {
        this.h = azcVar;
        this.c = context;
        this.e = lx6Var;
        y17 y17Var = new y17(context);
        y17Var.l = true;
        this.d = y17Var;
        y17Var.e = this;
    }

    @Override // w17
    public final boolean B(y17 y17Var, MenuItem menuItem) {
        lx6 lx6Var = this.e;
        if (lx6Var != null) {
            return ((e7a) lx6Var.b).B(this, menuItem);
        }
        return false;
    }

    @Override // w17
    public final void T1(y17 y17Var) {
        if (this.e != null) {
            h();
            b9 b9Var = this.h.f.d;
            if (b9Var != null) {
                b9Var.l();
            }
        }
    }

    @Override // f9
    public final void b() {
        azc azcVar = this.h;
        if (azcVar.i != this) {
            return;
        }
        if (azcVar.p) {
            azcVar.j = this;
            azcVar.k = this.e;
        } else {
            this.e.B(this);
        }
        this.e = null;
        azcVar.a(false);
        ActionBarContextView actionBarContextView = azcVar.f;
        if (actionBarContextView.w == null) {
            actionBarContextView.e();
        }
        azcVar.c.setHideOnContentScrollEnabled(azcVar.t);
        azcVar.i = null;
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
        return this.d;
    }

    @Override // f9
    public final zdb e() {
        return new zdb(this.c);
    }

    @Override // f9
    public final CharSequence f() {
        return this.h.f.getSubtitle();
    }

    @Override // f9
    public final CharSequence g() {
        return this.h.f.getTitle();
    }

    @Override // f9
    public final void h() {
        if (this.h.i != this) {
            return;
        }
        y17 y17Var = this.d;
        y17Var.w();
        try {
            this.e.J(this, y17Var);
        } finally {
            y17Var.v();
        }
    }

    @Override // f9
    public final boolean i() {
        return this.h.f.J;
    }

    @Override // f9
    public final void l(View view) {
        this.h.f.setCustomView(view);
        this.f = new WeakReference(view);
    }

    @Override // f9
    public final void m(int i) {
        n(this.h.a.getResources().getString(i));
    }

    @Override // f9
    public final void n(CharSequence charSequence) {
        this.h.f.setSubtitle(charSequence);
    }

    @Override // f9
    public final void o(int i) {
        p(this.h.a.getResources().getString(i));
    }

    @Override // f9
    public final void p(CharSequence charSequence) {
        this.h.f.setTitle(charSequence);
    }

    @Override // f9
    public final void q(boolean z) {
        this.a = z;
        this.h.f.setTitleOptional(z);
    }
}
