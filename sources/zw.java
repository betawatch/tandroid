// default package

import android.text.TextUtils;
import org.telegram.ui.l;
import org.telegram.ui.m;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class zw extends wy0 {
    @Override // wy0
    public final String b() {
        mw0 mw0Var = this.b;
        return (mw0Var == null || TextUtils.isEmpty(mw0Var.getTitle())) ? super.b() : this.b.getTitle();
    }

    public final void c(m mVar) {
        if (mVar != null) {
            l lVar = mVar.f;
            lVar.J();
            this.b = lVar.getWebView();
            this.d = lVar.getProxy();
            mw0 mw0Var = this.b;
            if (mw0Var != null) {
                mw0Var.onPause();
                this.E = this.b.getTitle();
                this.F = this.b.getFavicon();
                this.x = this.b.getUrl();
                this.q = mVar.x;
                this.r = mVar.y;
            }
        }
    }
}
