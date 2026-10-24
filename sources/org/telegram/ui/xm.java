package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class xm extends org.telegram.ui.Components.ir0 {
    public final /* synthetic */ MessageObject e1;
    public final /* synthetic */ dn f1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xm(dn dnVar, Activity activity, sn snVar, ArrayList arrayList, boolean z10, boolean z11, org.telegram.ui.ActionBar.g6 g6Var, boolean z12, MessageObject messageObject) {
        super(activity, snVar, arrayList, null, null, z10, null, null, false, false, z11, null, g6Var);
        this.f1 = dnVar;
        this.e1 = messageObject;
        this.b0 = z12;
    }

    @Override // org.telegram.ui.Components.ir0
    public final void W0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        dn dnVar = this.f1;
        sn snVar = dnVar.a;
        int i11 = sn.Vc;
        snVar.T7();
        if (dnVar.a.K3 == null || !z10) {
            return;
        }
        if (hVar.m() != 1) {
            dnVar.a.K3.k(0L, 53, Integer.valueOf(i10), Integer.valueOf(hVar.m()), null, null);
        } else {
            if (((TLRPC.Dialog) hVar.n(0)).id == dnVar.a.getUserConfig().getClientUserId() && org.telegram.ui.Components.xc.a0(dnVar.a).g0(i10, ((TLRPC.Dialog) hVar.n(0)).id)) {
                return;
            }
            dnVar.a.K3.k(((TLRPC.Dialog) hVar.n(0)).id, 53, Integer.valueOf(i10), tL_forumTopic, null, null);
        }
    }

    @Override // org.telegram.ui.Components.ir0
    public final void X0(final View view) {
        sn snVar = this.f1.a;
        ei.ob b10 = view instanceof org.telegram.ui.Cells.g7 ? ei.qb.b((org.telegram.ui.Cells.g7) view) : null;
        ArrayList arrayList = new ArrayList();
        MessageObject messageObject = this.e1;
        MessageObject.GroupedMessages groupedMessages = messageObject.getGroupId() != 0 ? (MessageObject.GroupedMessages) snVar.J6.f(messageObject.getGroupId()) : null;
        if (groupedMessages != null) {
            arrayList.addAll(groupedMessages.messages);
        } else {
            arrayList.add(messageObject);
        }
        final ei.vb D = ei.vb.D(snVar.getParentActivity(), this.currentAccount);
        D.R = new Utilities.Callback4() { // from class: org.telegram.ui.sm
            @Override // org.telegram.messenger.Utilities.Callback4
            public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
                Runnable runnable = (Runnable) obj2;
                Long l4 = (Long) obj4;
                boolean booleanValue = ((Boolean) obj3).booleanValue();
                ei.vb vbVar = D;
                ei.ob obVar = null;
                if (booleanValue) {
                    xm xmVar = xm.this;
                    AndroidUtilities.runOnUIThread(new eh(10, xmVar, l4));
                    xmVar.dismiss();
                    vbVar.X(null);
                } else {
                    View view2 = view;
                    if ((view2 instanceof org.telegram.ui.Cells.g7) && view2.isAttachedToWindow()) {
                        obVar = ei.qb.b((org.telegram.ui.Cells.g7) view2);
                    }
                    vbVar.X(obVar);
                }
                AndroidUtilities.runOnUIThread(runnable);
            }
        };
        D.T(b10, ei.a8.y(arrayList));
    }

    @Override // org.telegram.ui.Components.ir0, org.telegram.ui.ActionBar.h3
    public final void dismissInternal() {
        int i10;
        sn snVar = this.f1.a;
        Activity parentActivity = snVar.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.o2) snVar).classGuid;
        AndroidUtilities.requestAdjustResize(parentActivity, i10);
        super.dismissInternal();
        if (snVar.Y.getVisibility() == 0) {
            snVar.fragmentView.requestLayout();
        }
    }
}
