package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class ym extends org.telegram.ui.Components.dr0 {
    public final /* synthetic */ MessageObject b1;
    public final /* synthetic */ en c1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ym(en enVar, Activity activity, sn snVar, ArrayList arrayList, boolean z10, boolean z11, org.telegram.ui.ActionBar.d6 d6Var, boolean z12, MessageObject messageObject) {
        super(activity, snVar, arrayList, null, null, z10, null, null, false, false, z11, null, d6Var);
        this.c1 = enVar;
        this.b1 = messageObject;
        this.a0 = z12;
    }

    @Override // org.telegram.ui.Components.dr0
    public final void S0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        en enVar = this.c1;
        sn snVar = enVar.a;
        int i11 = sn.Ic;
        snVar.T7();
        if (enVar.a.y3 == null || !z10) {
            return;
        }
        if (hVar.m() != 1) {
            enVar.a.y3.k(0L, 53, Integer.valueOf(i10), Integer.valueOf(hVar.m()), null, null);
        } else {
            if (((TLRPC.Dialog) hVar.n(0)).id == enVar.a.getUserConfig().getClientUserId() && org.telegram.ui.Components.xc.a0(enVar.a).g0(i10, ((TLRPC.Dialog) hVar.n(0)).id)) {
                return;
            }
            enVar.a.y3.k(((TLRPC.Dialog) hVar.n(0)).id, 53, Integer.valueOf(i10), tL_forumTopic, null, null);
        }
    }

    @Override // org.telegram.ui.Components.dr0
    public final void T0(final View view) {
        sn snVar = this.c1.a;
        ei.ob b10 = view instanceof org.telegram.ui.Cells.e7 ? ei.qb.b((org.telegram.ui.Cells.e7) view) : null;
        ArrayList arrayList = new ArrayList();
        MessageObject messageObject = this.b1;
        MessageObject.GroupedMessages groupedMessages = messageObject.getGroupId() != 0 ? (MessageObject.GroupedMessages) snVar.x6.f(messageObject.getGroupId()) : null;
        if (groupedMessages != null) {
            arrayList.addAll(groupedMessages.messages);
        } else {
            arrayList.add(messageObject);
        }
        final ei.vb D = ei.vb.D(snVar.getParentActivity(), this.currentAccount);
        D.R = new Utilities.Callback4() { // from class: org.telegram.ui.tm
            @Override // org.telegram.messenger.Utilities.Callback4
            public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
                Runnable runnable = (Runnable) obj2;
                Long l4 = (Long) obj4;
                boolean booleanValue = ((Boolean) obj3).booleanValue();
                ei.vb vbVar = D;
                ei.ob obVar = null;
                if (booleanValue) {
                    ym ymVar = ym.this;
                    AndroidUtilities.runOnUIThread(new gh(10, ymVar, l4));
                    ymVar.dismiss();
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

    @Override // org.telegram.ui.Components.dr0, org.telegram.ui.ActionBar.f3
    public final void dismissInternal() {
        int i10;
        sn snVar = this.c1.a;
        Activity parentActivity = snVar.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.n2) snVar).classGuid;
        AndroidUtilities.requestAdjustResize(parentActivity, i10);
        super.dismissInternal();
        if (snVar.Y.getVisibility() == 0) {
            snVar.fragmentView.requestLayout();
        }
    }
}
