package zh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class d4 extends z4.a {
    public final /* synthetic */ u7 c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ g4 e;

    public d4(Context context, g4 g4Var, u7 u7Var) {
        this.e = g4Var;
        this.c = u7Var;
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
        g4 g4Var = this.e;
        c4 c4Var = new c4(this, this.c, this.d, g4Var.H, new bi.i5(this, 10));
        c4Var.setTag(Integer.valueOf(i10));
        c4Var.setShadowDrawable(g4Var.s);
        c4Var.setPadding(0, AndroidUtilities.dp(16.0f), 0, 0);
        c4Var.g(g4Var.y, (f4) g4Var.F.get(i10));
        c4Var.setListBottomPadding(g4Var.d);
        gVar.addView(c4Var);
        g4Var.G.add(c4Var);
        return c4Var;
    }

    @Override // z4.a
    public final boolean f(View view, Object obj) {
        return view == obj;
    }
}
