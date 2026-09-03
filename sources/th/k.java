package th;

import android.view.View;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.h51;
import r0.m1;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class k implements Utilities.Callback5, Utilities.Callback5Return, r0.o, MessagesStorage.BooleanCallback {
    public final /* synthetic */ n a;

    public /* synthetic */ k(n nVar) {
        this.a = nVar;
    }

    @Override // r0.o
    public m1 M0(View view, m1 m1Var) {
        i0.b f10 = m1Var.a.f(519);
        this.a.d.setPadding(0, f10.b, 0, f10.d);
        return m1.b;
    }

    @Override // org.telegram.messenger.Utilities.Callback5Return
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        return Boolean.valueOf(n.U(this.a, (h51) obj, (View) obj2));
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        n.V(this.a, (h51) obj);
    }

    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public void run(boolean z4) {
        n nVar = this.a;
        nVar.finishFragment();
        nVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(-nVar.b), null, nVar.E, Boolean.valueOf(z4));
    }
}
