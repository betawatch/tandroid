package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class zm extends org.telegram.ui.Components.dq0 {
    public final /* synthetic */ MessageObject X0;
    public final /* synthetic */ fn Y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zm(fn fnVar, Activity activity, tn tnVar, ArrayList arrayList, boolean z10, boolean z11, org.telegram.ui.ActionBar.c6 c6Var, boolean z12, MessageObject messageObject) {
        super(activity, tnVar, arrayList, null, null, z10, null, null, false, false, z11, null, c6Var);
        this.Y0 = fnVar;
        this.X0 = messageObject;
        this.W = z12;
    }

    @Override // org.telegram.ui.Components.dq0
    public final void R0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        fn fnVar = this.Y0;
        tn tnVar = fnVar.a;
        int i11 = tn.Dc;
        tnVar.Q7();
        if (fnVar.a.u3 == null || !z10) {
            return;
        }
        if (hVar.m() != 1) {
            fnVar.a.u3.k(0L, 53, Integer.valueOf(i10), Integer.valueOf(hVar.m()), null, null);
        } else {
            if (((TLRPC.Dialog) hVar.n(0)).id == fnVar.a.getUserConfig().getClientUserId() && org.telegram.ui.Components.tc.a0(fnVar.a).e0(i10, ((TLRPC.Dialog) hVar.n(0)).id)) {
                return;
            }
            fnVar.a.u3.k(((TLRPC.Dialog) hVar.n(0)).id, 53, Integer.valueOf(i10), tL_forumTopic, null, null);
        }
    }

    @Override // org.telegram.ui.Components.dq0
    public final void S0(final View view) {
        tn tnVar = this.Y0.a;
        nh.za b10 = view instanceof org.telegram.ui.Cells.c7 ? nh.bb.b((org.telegram.ui.Cells.c7) view) : null;
        ArrayList arrayList = new ArrayList();
        MessageObject messageObject = this.X0;
        MessageObject.GroupedMessages groupedMessages = messageObject.getGroupId() != 0 ? (MessageObject.GroupedMessages) tnVar.t6.f(messageObject.getGroupId()) : null;
        if (groupedMessages != null) {
            arrayList.addAll(groupedMessages.messages);
        } else {
            arrayList.add(messageObject);
        }
        final nh.gb E = nh.gb.E(tnVar.getParentActivity(), this.currentAccount);
        E.N = new Utilities.Callback4() { // from class: org.telegram.ui.um
            @Override // org.telegram.messenger.Utilities.Callback4
            public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
                Runnable runnable = (Runnable) obj2;
                Long l10 = (Long) obj4;
                boolean booleanValue = ((Boolean) obj3).booleanValue();
                nh.gb gbVar = E;
                nh.za zaVar = null;
                if (booleanValue) {
                    zm zmVar = zm.this;
                    AndroidUtilities.runOnUIThread(new vf(16, zmVar, l10));
                    zmVar.dismiss();
                    gbVar.Y(null);
                } else {
                    View view2 = view;
                    if ((view2 instanceof org.telegram.ui.Cells.c7) && view2.isAttachedToWindow()) {
                        zaVar = nh.bb.b((org.telegram.ui.Cells.c7) view2);
                    }
                    gbVar.Y(zaVar);
                }
                AndroidUtilities.runOnUIThread(runnable);
            }
        };
        E.U(b10, nh.o7.y(arrayList));
    }

    @Override // org.telegram.ui.Components.dq0, org.telegram.ui.ActionBar.f3
    public final void dismissInternal() {
        int i10;
        tn tnVar = this.Y0.a;
        Activity parentActivity = tnVar.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.o2) tnVar).classGuid;
        AndroidUtilities.requestAdjustResize(parentActivity, i10);
        super.dismissInternal();
        if (tnVar.U.getVisibility() == 0) {
            tnVar.fragmentView.requestLayout();
        }
    }
}
