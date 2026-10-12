package rg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import di.a6;
import di.z6;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.la;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.wl0;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class c1 extends lm0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ la d;
    public final /* synthetic */ z6 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ a6 h;

    public c1(a6 a6Var, Context context, la laVar, z6 z6Var, boolean z10) {
        this.h = a6Var;
        this.c = context;
        this.d = laVar;
        this.e = z6Var;
        this.f = z10;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.b1 b1Var) {
        return true;
    }

    @Override // s4.g0
    public final int h() {
        return this.h.s0.size();
    }

    @Override // s4.g0
    public final int j(int i10) {
        return ((MessageObject) this.h.s0.get((r0.size() - 1) - i10)).contentType;
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        boolean z10;
        MessageObject.GroupedMessagePosition position;
        a6 a6Var = this.h;
        ArrayList arrayList = a6Var.s0;
        MessageObject messageObject = (MessageObject) arrayList.get((arrayList.size() - 1) - i10);
        View view = b1Var.a;
        if (!(view instanceof org.telegram.ui.Cells.u1)) {
            if (view instanceof org.telegram.ui.Cells.x0) {
                ((org.telegram.ui.Cells.x0) view).setMessageObject(messageObject);
                return;
            }
            return;
        }
        org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) view;
        MessageObject.GroupedMessages groupedMessages = a6Var.t0;
        if (groupedMessages == null || (position = groupedMessages.getPosition(messageObject)) == null) {
            z10 = false;
        } else {
            z10 = position.minY != 0;
        }
        MessageObject.GroupedMessages groupedMessages2 = a6Var.t0;
        u1Var.X3(messageObject, groupedMessages2, groupedMessages2 != null, z10, false, false);
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        com.google.firebase.messaging.m mVar = this.h.D0;
        Context context = this.c;
        if (i10 == 1) {
            return new wl0(new a1(this, context, mVar));
        }
        b1 b1Var = new b1(this, context, UserConfig.selectedAccount, mVar);
        b1Var.N7 = true;
        return new wl0(b1Var);
    }
}
