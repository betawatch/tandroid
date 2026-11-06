package zh;

import android.view.View;
import org.telegram.messenger.b20;
import org.telegram.messenger.k9;
import org.telegram.ui.Components.x31;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h implements org.telegram.ui.ActionBar.r1, b20, k9 {
    public final /* synthetic */ int a;

    public /* synthetic */ h(int i7) {
        this.a = i7;
    }

    @Override // org.telegram.messenger.b20
    public Boolean a(x31 x31Var, View view, Integer num, Float f10, Float f11) {
        return Boolean.FALSE;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.a) {
            case 0:
                u1Var.dismiss();
                break;
            default:
                u1Var.dismiss();
                break;
        }
    }

    @Override // org.telegram.messenger.k9
    public Object j(Object obj) {
        int i7 = l3.c2;
        return 0;
    }

    public /* synthetic */ h(m3 m3Var) {
        this.a = 2;
    }
}
