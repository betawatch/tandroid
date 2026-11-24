// default package

import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.l;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
        gl.e3(jcVar, 300L);
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
