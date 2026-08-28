package yf;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import kh.q6;
import kh.s5;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.ba;
import org.telegram.ui.Components.ik0;
import org.telegram.ui.Components.vk0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class a1 extends vk0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ ba d;
    public final /* synthetic */ q6 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ s5 h;

    public a1(s5 s5Var, Context context, ba baVar, q6 q6Var, boolean z10) {
        this.h = s5Var;
        this.c = context;
        this.d = baVar;
        this.e = q6Var;
        this.f = z10;
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        return true;
    }

    @Override // f2.r0
    public final int h() {
        return this.h.o0.size();
    }

    @Override // f2.r0
    public final int j(int i9) {
        return ((MessageObject) this.h.o0.get((r0.size() - 1) - i9)).contentType;
    }

    @Override // f2.r0
    public final void v(f2.q1 q1Var, int i9) {
        boolean z10;
        MessageObject.GroupedMessagePosition position;
        s5 s5Var = this.h;
        ArrayList arrayList = s5Var.o0;
        MessageObject messageObject = (MessageObject) arrayList.get((arrayList.size() - 1) - i9);
        View view = q1Var.a;
        if (!(view instanceof org.telegram.ui.Cells.t1)) {
            if (view instanceof org.telegram.ui.Cells.w0) {
                ((org.telegram.ui.Cells.w0) view).setMessageObject(messageObject);
                return;
            }
            return;
        }
        org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) view;
        MessageObject.GroupedMessages groupedMessages = s5Var.p0;
        if (groupedMessages == null || (position = groupedMessages.getPosition(messageObject)) == null) {
            z10 = false;
        } else {
            z10 = position.minY != 0;
        }
        MessageObject.GroupedMessages groupedMessages2 = s5Var.p0;
        t1Var.X3(messageObject, groupedMessages2, groupedMessages2 != null, z10, false, false);
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        com.google.firebase.messaging.m mVar = this.h.z0;
        Context context = this.c;
        if (i9 == 1) {
            return new ik0(new y0(this, context, mVar));
        }
        z0 z0Var = new z0(this, context, UserConfig.selectedAccount, mVar);
        z0Var.J7 = true;
        return new ik0(z0Var);
    }
}
