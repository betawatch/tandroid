// default package

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class wm1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yv1 b;
    public final /* synthetic */ boolean c;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ wm1(yv1 yv1Var, int i) {
        this.a = (byte) 2;
        this.b = yv1Var;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rc2 rc2Var;
        k47 messageObject;
        byte b = this.a;
        boolean z = this.c;
        yv1 yv1Var = this.b;
        switch (b) {
            case 0:
                yv1Var.e = yv1Var.getMessagesController().L0(Long.valueOf(yv1Var.e.id));
                if (yv1Var.Z7()) {
                    TLRPC.Chat chat = yv1Var.e;
                    if (chat.in_news || !sd2.r0(chat)) {
                        yv1Var.sb = false;
                        if (z && !yv1Var.e.in_news) {
                            yv1Var.P4(true, false, true);
                            break;
                        } else {
                            yv1Var.Yb(yv1Var.e.in_news ? 2131752468 : 2131752470);
                        }
                    }
                }
                yv1Var.Pc(false);
                break;
            case 1:
                yv1Var.presentFragment(new PremiumPreviewFragment(0, z ? "upload_speed" : "download_speed"));
                break;
            case 2:
                vr1 vr1Var = yv1Var.A0;
                if (vr1Var != null) {
                    int childCount = vr1Var.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        View childAt = yv1Var.A0.getChildAt(i);
                        if ((childAt instanceof rc2) && (messageObject = (rc2Var = (rc2) childAt).getMessageObject()) != null && messageObject.T(yv1Var.V3)) {
                            rc2Var.J3(z ? 1 : 0, true, true);
                        }
                    }
                }
                yv1Var.V3 = null;
                break;
            case 3:
                yv1Var.getNotificationsController().G(yv1Var.l6, 0L, !z);
                yv1Var.Pc(false);
                yv1Var.Yb(z ? 2131752282 : 2131752360);
                break;
            case 4:
                yv1Var.getMessagesController().b(!z ? 1 : 0, 0, yv1Var.l6);
                yv1Var.Yb(z ? 2131752212 : 2131752405);
                break;
            default:
                yv1Var.gd(0, z);
                break;
        }
    }

    public /* synthetic */ wm1(yv1 yv1Var, boolean z, byte b) {
        this.a = b;
        this.b = yv1Var;
        this.c = z;
    }
}
