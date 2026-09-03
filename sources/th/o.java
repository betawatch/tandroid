package th;

import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.h51;
import r0.m1;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class o implements Utilities.Callback5, Utilities.Callback5Return, r0.o {
    public final /* synthetic */ q a;

    @Override // r0.o
    public m1 M0(View view, m1 m1Var) {
        this.a.V(m1Var.a.f(519).d);
        return m1.b;
    }

    @Override // org.telegram.messenger.Utilities.Callback5Return
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).intValue();
        ((Float) obj4).floatValue();
        ((Float) obj5).floatValue();
        this.a.getClass();
        return Boolean.FALSE;
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        q.U(this.a, (h51) obj);
    }
}
