package vf;

import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.h51;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d1 implements Utilities.Callback5, Utilities.Callback5Return {
    public final /* synthetic */ m1 a;

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        m1.W(this.a, (h51) obj, (View) obj2);
    }

    @Override // org.telegram.messenger.Utilities.Callback5Return
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean z4;
        h51 h51Var = (h51) obj;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        if (h51Var.a == 16) {
            Object obj6 = h51Var.G;
            if (!(obj6 instanceof o1) || !((o1) obj6).g) {
                this.a.e0(h51Var, view);
                z4 = true;
                return Boolean.valueOf(z4);
            }
        }
        z4 = false;
        return Boolean.valueOf(z4);
    }
}
