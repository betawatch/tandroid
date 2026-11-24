// default package

import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.l;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class tw1 implements h29, gj {
    public final /* synthetic */ ChatActivityEnterView a;

    public /* synthetic */ tw1(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    public final void a(boolean z) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        jc jcVar = chatActivityEnterView.X1;
        l lVar = chatActivityEnterView.E2;
        if (lVar != null) {
            lVar.invalidate();
        }
        if (z) {
            return;
        }
        ojc ojcVar = chatActivityEnterView.T1;
        if (ojcVar != null) {
            i29 i29Var = chatActivityEnterView.i1;
            ojcVar.c(Math.round(Math.max(1.0f, (i29Var.w - i29Var.s) * i29Var.r)));
        }
        gl.r(jcVar);
        gl.d3(jcVar, 300L);
    }

    @Override // gj
    public final void s(int i, int i2, boolean z) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        chatActivityEnterView.v1(z, i, i2, 0L, true);
        j47 j47Var = chatActivityEnterView.M0;
        if (j47Var != null) {
            j47Var.g();
            chatActivityEnterView.M0 = null;
        }
    }
}
