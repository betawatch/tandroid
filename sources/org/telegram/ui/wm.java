package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class wm extends org.telegram.ui.Components.fr0 {
    public final /* synthetic */ MessageObject c1;
    public final /* synthetic */ cn d1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wm(cn cnVar, Activity activity, qn qnVar, ArrayList arrayList, boolean z10, boolean z11, org.telegram.ui.ActionBar.d6 d6Var, boolean z12, MessageObject messageObject) {
        super(activity, qnVar, arrayList, null, null, z10, null, null, false, false, z11, null, d6Var);
        this.d1 = cnVar;
        this.c1 = messageObject;
        this.b0 = z12;
    }

    @Override // org.telegram.ui.Components.fr0
    public final void T0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        cn cnVar = this.d1;
        qn qnVar = cnVar.a;
        int i11 = qn.Ic;
        qnVar.T7();
        if (cnVar.a.y3 == null || !z10) {
            return;
        }
        if (hVar.m() != 1) {
            cnVar.a.y3.k(0L, 53, Integer.valueOf(i10), Integer.valueOf(hVar.m()), null, null);
        } else {
            if (((TLRPC.Dialog) hVar.n(0)).id == cnVar.a.getUserConfig().getClientUserId() && org.telegram.ui.Components.xc.a0(cnVar.a).g0(i10, ((TLRPC.Dialog) hVar.n(0)).id)) {
                return;
            }
            cnVar.a.y3.k(((TLRPC.Dialog) hVar.n(0)).id, 53, Integer.valueOf(i10), tL_forumTopic, null, null);
        }
    }

    @Override // org.telegram.ui.Components.fr0
    public final void U0(final View view) {
        qn qnVar = this.d1.a;
        ei.ob b10 = view instanceof org.telegram.ui.Cells.e7 ? ei.qb.b((org.telegram.ui.Cells.e7) view) : null;
        ArrayList arrayList = new ArrayList();
        MessageObject messageObject = this.c1;
        MessageObject.GroupedMessages groupedMessages = messageObject.getGroupId() != 0 ? (MessageObject.GroupedMessages) qnVar.x6.f(messageObject.getGroupId()) : null;
        if (groupedMessages != null) {
            arrayList.addAll(groupedMessages.messages);
        } else {
            arrayList.add(messageObject);
        }
        final ei.vb D = ei.vb.D(qnVar.getParentActivity(), this.currentAccount);
        D.R = new Utilities.Callback4() { // from class: org.telegram.ui.rm
            @Override // org.telegram.messenger.Utilities.Callback4
            public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
                Runnable runnable = (Runnable) obj2;
                Long l4 = (Long) obj4;
                boolean booleanValue = ((Boolean) obj3).booleanValue();
                ei.vb vbVar = D;
                ei.ob obVar = null;
                if (booleanValue) {
                    wm wmVar = wm.this;
                    AndroidUtilities.runOnUIThread(new eh(10, wmVar, l4));
                    wmVar.dismiss();
                    vbVar.X(null);
                } else {
                    View view2 = view;
                    if ((view2 instanceof org.telegram.ui.Cells.e7) && view2.isAttachedToWindow()) {
                        obVar = ei.qb.b((org.telegram.ui.Cells.e7) view2);
                    }
                    vbVar.X(obVar);
                }
                AndroidUtilities.runOnUIThread(runnable);
            }
        };
        D.T(b10, ei.a8.y(arrayList));
    }

    @Override // org.telegram.ui.Components.fr0, org.telegram.ui.ActionBar.f3
    public final void dismissInternal() {
        int i10;
        qn qnVar = this.d1.a;
        Activity parentActivity = qnVar.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.n2) qnVar).classGuid;
        AndroidUtilities.requestAdjustResize(parentActivity, i10);
        super.dismissInternal();
        if (qnVar.Y.getVisibility() == 0) {
            qnVar.fragmentView.requestLayout();
        }
    }
}
