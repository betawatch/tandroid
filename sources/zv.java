// default package

import android.text.TextUtils;
import org.telegram.ui.l;
import org.telegram.ui.m;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class zv extends px0 {
    @Override // px0
    public final String b() {
        cv0 cv0Var = this.b;
        return (cv0Var == null || TextUtils.isEmpty(cv0Var.getTitle())) ? super.b() : this.b.getTitle();
    }

    public final void c(m mVar) {
        if (mVar != null) {
            l lVar = mVar.f;
            lVar.J();
            this.b = lVar.getWebView();
            this.d = lVar.getProxy();
            cv0 cv0Var = this.b;
            if (cv0Var != null) {
                cv0Var.onPause();
                this.E = this.b.getTitle();
                this.F = this.b.getFavicon();
                this.x = this.b.getUrl();
                this.q = mVar.x;
                this.r = mVar.y;
            }
        }
    }
}
