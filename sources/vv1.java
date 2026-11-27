// default package

import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class vv1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ChatActivityEnterView b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ vv1(ChatActivityEnterView chatActivityEnterView, boolean z, byte b) {
        this.a = b;
        this.b = chatActivityEnterView;
        this.c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        q67 q67Var;
        byte b = this.a;
        ChatActivityEnterView chatActivityEnterView = this.b;
        boolean z = this.c;
        switch (b) {
            case 0:
                int i = ChatActivityEnterView.X7;
                chatActivityEnterView.e2(z);
                break;
            case 1:
                int i2 = ChatActivityEnterView.X7;
                if (!z) {
                    chatActivityEnterView.i2.setVisibility(8);
                    break;
                }
                break;
            case 2:
                int i3 = ChatActivityEnterView.X7;
                if (!z) {
                    chatActivityEnterView.j2.setVisibility(8);
                    break;
                }
                break;
            default:
                int i4 = ChatActivityEnterView.X7;
                ChatActivityEnterView chatActivityEnterView2 = this.b;
                mv1 mv1Var = chatActivityEnterView2.p6;
                chatActivityEnterView2.N0 = System.currentTimeMillis();
                boolean F1 = chatActivityEnterView2.F1(false, 0, 0, 0L, true);
                if (!z && (q67Var = chatActivityEnterView2.M0) != null) {
                    q67Var.f(!F1);
                    chatActivityEnterView2.M0 = null;
                    break;
                } else {
                    chatActivityEnterView2.o6 = !F1;
                    hl.r(mv1Var);
                    hl.d3(mv1Var, 500L);
                    break;
                }
                break;
        }
    }
}
