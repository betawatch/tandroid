package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class wm extends org.telegram.ui.Components.rp0 {
    public final /* synthetic */ MessageObject X0;
    public final /* synthetic */ cn Y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wm(cn cnVar, Activity activity, qn qnVar, ArrayList arrayList, boolean z10, boolean z11, org.telegram.ui.ActionBar.b6 b6Var, boolean z12, MessageObject messageObject) {
        super(activity, qnVar, arrayList, null, null, z10, null, null, false, false, z11, null, b6Var);
        this.Y0 = cnVar;
        this.X0 = messageObject;
        this.W = z12;
    }

    @Override // org.telegram.ui.Components.rp0
    public final void R0(a0.h hVar, int i9, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        cn cnVar = this.Y0;
        qn qnVar = cnVar.a;
        int i10 = qn.Dc;
        qnVar.Q7();
        if (cnVar.a.u3 == null || !z10) {
            return;
        }
        if (hVar.m() != 1) {
            cnVar.a.u3.k(0L, 53, Integer.valueOf(i9), Integer.valueOf(hVar.m()), null, null);
        } else {
            if (((TLRPC.Dialog) hVar.n(0)).id == cnVar.a.getUserConfig().getClientUserId() && org.telegram.ui.Components.oc.a0(cnVar.a).e0(i9, ((TLRPC.Dialog) hVar.n(0)).id)) {
                return;
            }
            cnVar.a.u3.k(((TLRPC.Dialog) hVar.n(0)).id, 53, Integer.valueOf(i9), tL_forumTopic, null, null);
        }
    }

    @Override // org.telegram.ui.Components.rp0
    public final void S0(final View view) {
        qn qnVar = this.Y0.a;
        kh.pb b10 = view instanceof org.telegram.ui.Cells.e7 ? kh.rb.b((org.telegram.ui.Cells.e7) view) : null;
        ArrayList arrayList = new ArrayList();
        MessageObject messageObject = this.X0;
        MessageObject.GroupedMessages groupedMessages = messageObject.getGroupId() != 0 ? (MessageObject.GroupedMessages) qnVar.t6.f(messageObject.getGroupId()) : null;
        if (groupedMessages != null) {
            arrayList.addAll(groupedMessages.messages);
        } else {
            arrayList.add(messageObject);
        }
        final kh.wb E = kh.wb.E(qnVar.getParentActivity(), this.currentAccount);
        E.N = new Utilities.Callback4() { // from class: org.telegram.ui.rm
            @Override // org.telegram.messenger.Utilities.Callback4
            public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
                Runnable runnable = (Runnable) obj2;
                Long l10 = (Long) obj4;
                boolean booleanValue = ((Boolean) obj3).booleanValue();
                kh.wb wbVar = E;
                kh.pb pbVar = null;
                if (booleanValue) {
                    wm wmVar = wm.this;
                    AndroidUtilities.runOnUIThread(new rd(19, wmVar, l10));
                    wmVar.dismiss();
                    wbVar.Y(null);
                } else {
                    View view2 = view;
                    if ((view2 instanceof org.telegram.ui.Cells.e7) && view2.isAttachedToWindow()) {
                        pbVar = kh.rb.b((org.telegram.ui.Cells.e7) view2);
                    }
                    wbVar.Y(pbVar);
                }
                AndroidUtilities.runOnUIThread(runnable);
            }
        };
        E.U(b10, kh.a8.y(arrayList));
    }

    @Override // org.telegram.ui.Components.rp0, org.telegram.ui.ActionBar.f3
    public final void dismissInternal() {
        int i9;
        qn qnVar = this.Y0.a;
        Activity parentActivity = qnVar.getParentActivity();
        i9 = ((org.telegram.ui.ActionBar.o2) qnVar).classGuid;
        AndroidUtilities.requestAdjustResize(parentActivity, i9);
        super.dismissInternal();
        if (qnVar.U.getVisibility() == 0) {
            qnVar.fragmentView.requestLayout();
        }
    }
}
