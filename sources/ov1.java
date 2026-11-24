// default package

import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class ov1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ChatActivityEnterView b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ ov1(ChatActivityEnterView chatActivityEnterView, boolean z, byte b) {
        this.a = b;
        this.b = chatActivityEnterView;
        this.c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        j47 j47Var;
        byte b = this.a;
        ChatActivityEnterView chatActivityEnterView = this.b;
        boolean z = this.c;
        switch (b) {
            case 0:
                int i = ChatActivityEnterView.r7;
                if (!z) {
                    chatActivityEnterView.j2.setVisibility(8);
                    break;
                }
                break;
            case 1:
                int i2 = ChatActivityEnterView.r7;
                if (!z) {
                    chatActivityEnterView.k2.setVisibility(8);
                    break;
                }
                break;
            default:
                int i3 = ChatActivityEnterView.r7;
                ChatActivityEnterView chatActivityEnterView2 = this.b;
                uv1 uv1Var = chatActivityEnterView2.e6;
                chatActivityEnterView2.N0 = System.currentTimeMillis();
                boolean v1 = chatActivityEnterView2.v1(false, 0, 0, 0L, true);
                if (!z && (j47Var = chatActivityEnterView2.M0) != null) {
                    j47Var.f(!v1);
                    chatActivityEnterView2.M0 = null;
                    break;
                } else {
                    chatActivityEnterView2.d6 = !v1;
                    gl.r(uv1Var);
                    gl.d3(uv1Var, 500L);
                    break;
                }
                break;
        }
    }
}
