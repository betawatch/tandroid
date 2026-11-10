package z3;

import android.view.View;
import org.telegram.messenger.b20;
import org.telegram.messenger.k9;
import org.telegram.ui.ActionBar.r1;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.Components.x31;
import zh.l3;
import zh.m3;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final /* synthetic */ class j implements g9.k, r1, b20, k9 {
    public final /* synthetic */ int a;

    public /* synthetic */ j(int i7) {
        this.a = i7;
    }

    @Override // org.telegram.messenger.b20
    public Boolean a(x31 x31Var, View view, Integer num, Float f10, Float f11) {
        return Boolean.FALSE;
    }

    @Override // g9.k, l5.e
    public Object apply(Object obj) {
        return (r) obj;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(u1 u1Var, int i7) {
        switch (this.a) {
            case 1:
                u1Var.dismiss();
                break;
            default:
                u1Var.dismiss();
                break;
        }
    }

    @Override // org.telegram.messenger.k9
    public Object j(Object obj) {
        int i7 = l3.f2;
        return 0;
    }

    public /* synthetic */ j(m3 m3Var) {
        this.a = 3;
    }
}
