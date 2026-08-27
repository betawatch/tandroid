package zf;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import lh.p6;
import lh.r5;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.lk0;
import org.telegram.ui.Components.yk0;
import org.telegram.ui.Components.z9;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class a1 extends yk0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ z9 d;
    public final /* synthetic */ p6 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ r5 h;

    public a1(r5 r5Var, Context context, z9 z9Var, p6 p6Var, boolean z10) {
        this.h = r5Var;
        this.c = context;
        this.d = z9Var;
        this.e = p6Var;
        this.f = z10;
    }

    @Override // org.telegram.ui.Components.yk0
    public final boolean D(f2.o1 o1Var) {
        return true;
    }

    @Override // f2.q0
    public final int h() {
        return this.h.o0.size();
    }

    @Override // f2.q0
    public final int j(int i10) {
        return ((MessageObject) this.h.o0.get((r0.size() - 1) - i10)).contentType;
    }

    @Override // f2.q0
    public final void v(f2.o1 o1Var, int i10) {
        boolean z10;
        MessageObject.GroupedMessagePosition position;
        r5 r5Var = this.h;
        ArrayList arrayList = r5Var.o0;
        MessageObject messageObject = (MessageObject) arrayList.get((arrayList.size() - 1) - i10);
        View view = o1Var.a;
        if (!(view instanceof org.telegram.ui.Cells.s1)) {
            if (view instanceof org.telegram.ui.Cells.v0) {
                ((org.telegram.ui.Cells.v0) view).setMessageObject(messageObject);
                return;
            }
            return;
        }
        org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) view;
        MessageObject.GroupedMessages groupedMessages = r5Var.p0;
        if (groupedMessages == null || (position = groupedMessages.getPosition(messageObject)) == null) {
            z10 = false;
        } else {
            z10 = position.minY != 0;
        }
        MessageObject.GroupedMessages groupedMessages2 = r5Var.p0;
        s1Var.W3(messageObject, groupedMessages2, groupedMessages2 != null, z10, false, false);
    }

    @Override // f2.q0
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        com.google.firebase.messaging.m mVar = this.h.z0;
        Context context = this.c;
        if (i10 == 1) {
            return new lk0(new y0(this, context, mVar));
        }
        z0 z0Var = new z0(this, context, UserConfig.selectedAccount, mVar);
        z0Var.J7 = true;
        return new lk0(z0Var);
    }
}
