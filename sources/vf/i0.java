package vf;

import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.Components.h51;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i0 implements c2, Utilities.Callback5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ l0 b;

    public /* synthetic */ i0(l0 l0Var, int i10) {
        this.a = i10;
        this.b = l0Var;
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void j(d2 d2Var, int i10) {
        switch (this.a) {
            case 0:
                this.b.a0();
                break;
            case 1:
                this.b.finishFragment();
                break;
            default:
                this.b.a0();
                break;
        }
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        l0.W(this.b, (h51) obj, (View) obj2);
    }
}
