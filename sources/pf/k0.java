package pf;

import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.Components.l41;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k0 implements b2, Utilities.Callback5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ m0 b;

    public /* synthetic */ k0(m0 m0Var, int i9) {
        this.a = i9;
        this.b = m0Var;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void f(c2 c2Var, int i9) {
        switch (this.a) {
            case 0:
                this.b.Z();
                break;
            case 1:
                this.b.finishFragment();
                break;
            default:
                this.b.Z();
                break;
        }
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        m0.V(this.b, (l41) obj, (View) obj2);
    }
}
