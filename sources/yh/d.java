package yh;

import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.v51;
import org.telegram.ui.zg1;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d implements org.telegram.ui.ActionBar.z1, Utilities.Callback5, Utilities.Callback5Return {
    public final /* synthetic */ g a;

    public /* synthetic */ d(g gVar) {
        this.a = gVar;
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        g gVar = this.a;
        gVar.getClass();
        gVar.presentFragment(new zg1(6, null));
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
        g.W(this.a, (v51) obj);
    }
}
