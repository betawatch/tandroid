// default package

import android.view.View;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class q52 implements gk, h59, a1d {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ChatAttachAlertPhotoLayout b;

    public /* synthetic */ q52(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, byte b) {
        this.a = b;
        this.b = chatAttachAlertPhotoLayout;
    }

    @Override // a1d
    public final void b(float f) {
        boolean z = ChatAttachAlertPhotoLayout.r1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        m62 m62Var = chatAttachAlertPhotoLayout.Q;
        if (m62Var != null) {
            chatAttachAlertPhotoLayout.C0 = f;
            m62Var.setZoom(f);
        }
        chatAttachAlertPhotoLayout.w0(true);
    }

    @Override // h59
    public final boolean g(int i, View view) {
        boolean z = ChatAttachAlertPhotoLayout.r1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        i22 i22Var = chatAttachAlertPhotoLayout.b;
        if (!i22Var.Q2) {
            if (i == 0 && chatAttachAlertPhotoLayout.U0 == chatAttachAlertPhotoLayout.V0) {
                g22 g22Var = i22Var.W3;
                if (g22Var != null) {
                    g22Var.E0(0, false, true, 0, 0, 0L, i22Var.a1(), false, 0L);
                }
                return true;
            }
            if (view instanceof q68) {
                y69 y69Var = chatAttachAlertPhotoLayout.J;
                boolean z2 = !((q68) view).a();
                chatAttachAlertPhotoLayout.L = z2;
                y69Var.d(i, view, z2);
            }
        }
        return false;
    }

    @Override // gk
    public final void y(int i, int i2, boolean z) {
        byte b = this.a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        switch (b) {
            case 0:
                boolean z2 = ChatAttachAlertPhotoLayout.r1;
                i22 i22Var = chatAttachAlertPhotoLayout.b;
                i22Var.E0();
                i22Var.W3.E0(7, false, z, i, 0, 0L, i22Var.a1(), false, 0L);
                break;
            default:
                boolean z3 = ChatAttachAlertPhotoLayout.r1;
                i22 i22Var2 = chatAttachAlertPhotoLayout.b;
                i22Var2.E0();
                i22Var2.W3.E0(4, true, z, i, 0, 0L, i22Var2.a1(), false, 0L);
                break;
        }
    }
}
