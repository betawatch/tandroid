// default package

import android.view.KeyEvent;
import android.view.View;
import org.telegram.ui.o;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class zt implements oc8, h59, k8 {
    public final /* synthetic */ o a;

    public /* synthetic */ zt(o oVar) {
        this.a = oVar;
    }

    @Override // oc8
    public final void a(float[] fArr) {
        o oVar = this.a;
        fArr[0] = oVar.K0;
        fArr[1] = oVar.v0[0].b.getMeasuredHeight();
    }

    @Override // h59
    public final boolean g(int i, View view) {
        if (!(view instanceof iw)) {
            return false;
        }
        zx zxVar = ((iw) view).n;
        this.a.X(zxVar.a.articles.get(zxVar.b).url);
        return true;
    }

    @Override // k8
    public final void q(KeyEvent keyEvent) {
        o oVar;
        m8 m8Var;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (m8Var = (oVar = this.a).I) != null && m8Var.isShowing()) {
            oVar.I.d(true);
        }
    }
}
