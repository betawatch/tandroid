package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class u50 extends org.telegram.ui.Components.vk0 {
    public ChatObject.Call c;
    public final int d;
    public ArrayList f;
    public g30 h;
    public final o50 n;
    public final ArrayList e = new ArrayList();
    public boolean r = false;

    public u50(ChatObject.Call call, int i9, o50 o50Var) {
        this.c = call;
        this.d = i9;
        this.n = o50Var;
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        return false;
    }

    public final void E(org.telegram.ui.Components.voip.l lVar, boolean z10) {
        if (z10 && lVar.getRenderer() == null) {
            lVar.setRenderer(org.telegram.ui.Components.voip.t.c(this.f, this.h, null, null, lVar, lVar.getParticipant(), this.c, this.n));
        } else {
            if (z10 || lVar.getRenderer() == null) {
                return;
            }
            lVar.getRenderer().setTabletGridView(null);
            lVar.setRenderer(null);
        }
    }

    public final int F() {
        org.telegram.ui.Components.wk0 wk0Var = this.n.j2;
        int size = this.e.size();
        return size <= 1 ? wk0Var.getMeasuredHeight() : size <= 4 ? wk0Var.getMeasuredHeight() / 2 : (int) (wk0Var.getMeasuredHeight() / 2.5f);
    }

    public final void G(ArrayList arrayList, g30 g30Var) {
        this.f = arrayList;
        this.h = g30Var;
    }

    public final void H(org.telegram.ui.Components.wk0 wk0Var, boolean z10, boolean z11) {
        this.r = z10;
        if (z11) {
            for (int i9 = 0; i9 < wk0Var.getChildCount(); i9++) {
                View childAt = wk0Var.getChildAt(i9);
                if (childAt instanceof org.telegram.ui.Components.voip.l) {
                    org.telegram.ui.Components.voip.l lVar = (org.telegram.ui.Components.voip.l) childAt;
                    if (lVar.getParticipant() != null) {
                        E(lVar, z10);
                    }
                }
            }
        }
    }

    public final void I(org.telegram.ui.Components.wk0 wk0Var, boolean z10) {
        if (this.c == null) {
            return;
        }
        ArrayList arrayList = this.e;
        if (!z10) {
            arrayList.clear();
            arrayList.addAll(this.c.visibleVideoParticipants);
            l();
        } else {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(arrayList);
            arrayList.clear();
            arrayList.addAll(this.c.visibleVideoParticipants);
            f2.s.c(new t50(this, arrayList2), true).b(this);
            AndroidUtilities.updateVisibleRows(wk0Var);
        }
    }

    @Override // f2.r0
    public final int h() {
        return this.e.size();
    }

    @Override // f2.r0
    public final void v(f2.q1 q1Var, int i9) {
        org.telegram.ui.Components.voip.l lVar = (org.telegram.ui.Components.voip.l) q1Var.a;
        ChatObject.VideoParticipant participant = lVar.getParticipant();
        ArrayList arrayList = this.e;
        ChatObject.VideoParticipant videoParticipant = (ChatObject.VideoParticipant) arrayList.get(i9);
        TLRPC.GroupCallParticipant groupCallParticipant = ((ChatObject.VideoParticipant) arrayList.get(i9)).participant;
        int size = arrayList.size();
        int i10 = 6;
        if (size > 1 && size != 2 && (size != 3 || i9 == 0 || i9 == 1)) {
            i10 = 3;
        }
        lVar.a = i10;
        lVar.b = this;
        if (lVar.getMeasuredHeight() != F()) {
            lVar.requestLayout();
        }
        AccountInstance.getInstance(this.d);
        MessageObject.getPeerId(this.c.selfPeer);
        lVar.d = videoParticipant;
        if (participant != null && !participant.equals(videoParticipant) && lVar.e && lVar.getRenderer() != null) {
            E(lVar, false);
            E(lVar, true);
        } else if (lVar.getRenderer() != null) {
            lVar.getRenderer().j(true);
        }
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        return new org.telegram.ui.Components.ik0(new s50(this, viewGroup.getContext()));
    }
}
