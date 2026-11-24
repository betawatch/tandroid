// default package

import android.content.Context;
import android.widget.TextView;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class r02 extends s02 {
    public byte b;
    public final /* synthetic */ x02 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r02(x02 x02Var, Context context) {
        super(context);
        this.c = x02Var;
        setWillNotDraw(false);
        setFocusable(true);
        int i = x02.G4;
        wjb wjbVar = x02Var.J0;
        ox4 ox4Var = new ox4(context);
        ox4Var.d = wjbVar;
        ox4Var.R = true;
        TextView textView = ox4Var.a;
        textView.setTextSize(1, 11.0f);
        textView.setPadding(gl.L(8.0f), 0, gl.L(8.0f), 0);
        ox4Var.b(false);
        ox4Var.b.setLayoutParams(nme.d(24, 24.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        ox4Var.x = bkb.v0(bkb.Sl, wjbVar);
        ox4Var.s = bkb.v0(bkb.Ql, wjbVar);
        ox4Var.w = bkb.v0(bkb.Rl, wjbVar);
        ox4Var.a();
        this.a = ox4Var;
        addView(ox4Var, nme.c(-1.0f, -1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(int i, String str, nx4 nx4Var) {
        this.a.setText(str);
        this.a.setTabAnimation(nx4Var);
        this.b = i;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a.f(((long) this.b) == this.c.T2, false);
    }
}
