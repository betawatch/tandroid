package th;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class c4 extends z4.a {
    public final /* synthetic */ o7 c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ f4 e;

    public c4(Context context, f4 f4Var, o7 o7Var) {
        this.e = f4Var;
        this.c = o7Var;
        this.d = context;
    }

    @Override // z4.a
    public final void a(z4.g gVar, Object obj) {
        gVar.removeView((View) obj);
        this.e.G.remove(obj);
    }

    @Override // z4.a
    public final int b() {
        return this.e.F.size();
    }

    @Override // z4.a
    public final Object e(z4.g gVar, int i10) {
        f4 f4Var = this.e;
        b4 b4Var = new b4(this, this.c, this.d, f4Var.H, new ph.h1(this, 16));
        b4Var.setTag(Integer.valueOf(i10));
        b4Var.setShadowDrawable(f4Var.s);
        b4Var.setPadding(0, org.telegram.messenger.i0.L(16.0f), 0, 0);
        b4Var.g(f4Var.D, (e4) f4Var.F.get(i10));
        b4Var.setListBottomPadding(f4Var.d);
        gVar.addView(b4Var);
        f4Var.G.add(b4Var);
        return b4Var;
    }

    @Override // z4.a
    public final boolean f(View view, Object obj) {
        return view == obj;
    }
}
