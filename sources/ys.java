// default package

import android.view.KeyEvent;
import android.view.View;
import org.telegram.ui.o;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class ys implements la8, e39, k8 {
    public final /* synthetic */ o a;

    public /* synthetic */ ys(o oVar) {
        this.a = oVar;
    }

    @Override // la8
    public final void a(float[] fArr) {
        o oVar = this.a;
        fArr[0] = oVar.K0;
        fArr[1] = oVar.v0[0].b.getMeasuredHeight();
    }

    @Override // e39
    public final boolean d(int i, View view) {
        if (!(view instanceof iv)) {
            return false;
        }
        zw zwVar = ((iv) view).n;
        this.a.X(zwVar.a.articles.get(zwVar.b).url);
        return true;
    }

    @Override // k8
    public final void r(KeyEvent keyEvent) {
        o oVar;
        m8 m8Var;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (m8Var = (oVar = this.a).I) != null && m8Var.isShowing()) {
            oVar.I.d(true);
        }
    }
}
