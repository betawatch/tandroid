// default package

import android.view.KeyEvent;
import android.view.View;
import org.telegram.ui.o;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class xs implements ce8, t69, l8 {
    public final /* synthetic */ o a;

    public /* synthetic */ xs(o oVar) {
        this.a = oVar;
    }

    @Override // ce8
    public final void a(float[] fArr) {
        o oVar = this.a;
        fArr[0] = oVar.K0;
        fArr[1] = oVar.v0[0].b.getMeasuredHeight();
    }

    @Override // t69
    public final boolean e(int i, View view) {
        if (!(view instanceof jv)) {
            return false;
        }
        ax axVar = ((jv) view).n;
        this.a.X(axVar.a.articles.get(axVar.b).url);
        return true;
    }

    @Override // l8
    public final void o(KeyEvent keyEvent) {
        o oVar;
        n8 n8Var;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (n8Var = (oVar = this.a).I) != null && n8Var.isShowing()) {
            oVar.I.d(true);
        }
    }
}
