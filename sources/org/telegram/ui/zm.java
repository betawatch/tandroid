package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class zm extends org.telegram.ui.Components.op0 {
    public final /* synthetic */ org.telegram.messenger.jj R2;
    public final /* synthetic */ fn S2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zm(fn fnVar, Activity activity, un unVar, ArrayList arrayList, boolean z10, boolean z11, org.telegram.ui.ActionBar.p6 p6Var, boolean z12, org.telegram.messenger.jj jjVar) {
        super(activity, unVar, arrayList, null, null, z10, null, null, false, false, z11, null, p6Var);
        this.S2 = fnVar;
        this.R2 = jjVar;
        this.S1 = z12;
    }

    @Override // org.telegram.ui.Components.op0, org.telegram.ui.ActionBar.z2
    public final void L() {
        int i10;
        un unVar = this.S2.a;
        Activity parentActivity = unVar.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.k2) unVar).classGuid;
        org.telegram.messenger.i0.Z2(parentActivity, i10);
        super.L();
        if (unVar.Z.getVisibility() == 0) {
            unVar.fragmentView.requestLayout();
        }
    }

    @Override // org.telegram.ui.Components.op0
    public final void R0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        fn fnVar = this.S2;
        un unVar = fnVar.a;
        int i11 = un.ad;
        unVar.Y7();
        if (fnVar.a.M3 == null || !z10) {
            return;
        }
        if (hVar.m() != 1) {
            fnVar.a.M3.k(0L, 53, Integer.valueOf(i10), Integer.valueOf(hVar.m()), null, null);
        } else {
            if (((TLRPC.Dialog) hVar.n(0)).id == fnVar.a.getUserConfig().e() && org.telegram.ui.Components.cc.a0(fnVar.a).g0(i10, ((TLRPC.Dialog) hVar.n(0)).id)) {
                return;
            }
            fnVar.a.M3.k(((TLRPC.Dialog) hVar.n(0)).id, 53, Integer.valueOf(i10), tL_forumTopic, null, null);
        }
    }

    @Override // org.telegram.ui.Components.op0
    public final void S0(final View view) {
        un unVar = this.S2.a;
        vh.h8 b10 = view instanceof org.telegram.ui.Cells.h7 ? vh.j8.b((org.telegram.ui.Cells.h7) view) : null;
        ArrayList arrayList = new ArrayList();
        org.telegram.messenger.jj jjVar = this.R2;
        org.telegram.messenger.ej ejVar = jjVar.d1() != 0 ? (org.telegram.messenger.ej) unVar.N6.f(jjVar.d1()) : null;
        if (ejVar != null) {
            arrayList.addAll(ejVar.d);
        } else {
            arrayList.add(jjVar);
        }
        final vh.o8 D = vh.o8.D(unVar.getParentActivity(), this.a);
        D.R = new org.telegram.messenger.n20() { // from class: org.telegram.ui.um
            @Override // org.telegram.messenger.n20
            public final void a(Object obj, Object obj2, Object obj3, Object obj4) {
                Runnable runnable = (Runnable) obj2;
                Long l4 = (Long) obj4;
                boolean booleanValue = ((Boolean) obj3).booleanValue();
                vh.o8 o8Var = D;
                vh.h8 h8Var = null;
                if (booleanValue) {
                    zm zmVar = zm.this;
                    org.telegram.messenger.i0.g3(new zg(12, zmVar, l4));
                    zmVar.dismiss();
                    o8Var.X(null);
                } else {
                    View view2 = view;
                    if ((view2 instanceof org.telegram.ui.Cells.h7) && view2.isAttachedToWindow()) {
                        h8Var = vh.j8.b((org.telegram.ui.Cells.h7) view2);
                    }
                    o8Var.X(h8Var);
                }
                org.telegram.messenger.i0.g3(runnable);
            }
        };
        D.T(b10, vh.n5.y(arrayList));
    }
}
