package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class xm extends org.telegram.ui.Components.sp0 {
    public final /* synthetic */ MessageObject X0;
    public final /* synthetic */ dn Y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xm(dn dnVar, Activity activity, rn rnVar, ArrayList arrayList, boolean z10, boolean z11, org.telegram.ui.ActionBar.c6 c6Var, boolean z12, MessageObject messageObject) {
        super(activity, rnVar, arrayList, null, null, z10, null, null, false, false, z11, null, c6Var);
        this.Y0 = dnVar;
        this.X0 = messageObject;
        this.W = z12;
    }

    @Override // org.telegram.ui.Components.sp0
    public final void R0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        dn dnVar = this.Y0;
        rn rnVar = dnVar.a;
        int i11 = rn.Dc;
        rnVar.Q7();
        if (dnVar.a.u3 == null || !z10) {
            return;
        }
        if (hVar.m() != 1) {
            dnVar.a.u3.k(0L, 53, Integer.valueOf(i10), Integer.valueOf(hVar.m()), null, null);
        } else {
            if (((TLRPC.Dialog) hVar.n(0)).id == dnVar.a.getUserConfig().getClientUserId() && org.telegram.ui.Components.mc.a0(dnVar.a).e0(i10, ((TLRPC.Dialog) hVar.n(0)).id)) {
                return;
            }
            dnVar.a.u3.k(((TLRPC.Dialog) hVar.n(0)).id, 53, Integer.valueOf(i10), tL_forumTopic, null, null);
        }
    }

    @Override // org.telegram.ui.Components.sp0
    public final void S0(final View view) {
        rn rnVar = this.Y0.a;
        lh.lb b10 = view instanceof org.telegram.ui.Cells.b7 ? lh.nb.b((org.telegram.ui.Cells.b7) view) : null;
        ArrayList arrayList = new ArrayList();
        MessageObject messageObject = this.X0;
        MessageObject.GroupedMessages groupedMessages = messageObject.getGroupId() != 0 ? (MessageObject.GroupedMessages) rnVar.t6.f(messageObject.getGroupId()) : null;
        if (groupedMessages != null) {
            arrayList.addAll(groupedMessages.messages);
        } else {
            arrayList.add(messageObject);
        }
        final lh.sb E = lh.sb.E(rnVar.getParentActivity(), this.currentAccount);
        E.N = new Utilities.Callback4() { // from class: org.telegram.ui.sm
            @Override // org.telegram.messenger.Utilities.Callback4
            public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
                Runnable runnable = (Runnable) obj2;
                Long l10 = (Long) obj4;
                boolean booleanValue = ((Boolean) obj3).booleanValue();
                lh.sb sbVar = E;
                lh.lb lbVar = null;
                if (booleanValue) {
                    xm xmVar = xm.this;
                    AndroidUtilities.runOnUIThread(new rd(19, xmVar, l10));
                    xmVar.dismiss();
                    sbVar.Y(null);
                } else {
                    View view2 = view;
                    if ((view2 instanceof org.telegram.ui.Cells.b7) && view2.isAttachedToWindow()) {
                        lbVar = lh.nb.b((org.telegram.ui.Cells.b7) view2);
                    }
                    sbVar.Y(lbVar);
                }
                AndroidUtilities.runOnUIThread(runnable);
            }
        };
        E.U(b10, lh.z7.y(arrayList));
    }

    @Override // org.telegram.ui.Components.sp0, org.telegram.ui.ActionBar.e3
    public final void dismissInternal() {
        int i10;
        rn rnVar = this.Y0.a;
        Activity parentActivity = rnVar.getParentActivity();
        i10 = ((org.telegram.ui.ActionBar.n2) rnVar).classGuid;
        AndroidUtilities.requestAdjustResize(parentActivity, i10);
        super.dismissInternal();
        if (rnVar.U.getVisibility() == 0) {
            rnVar.fragmentView.requestLayout();
        }
    }
}
