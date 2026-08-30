package sh;

import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.i51;
import r0.m1;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final /* synthetic */ class o implements Utilities.Callback5, Utilities.Callback5Return, r0.o {
    public final /* synthetic */ q a;

    @Override // r0.o
    public m1 N0(View view, m1 m1Var) {
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
        q.U(this.a, (i51) obj);
    }
}
