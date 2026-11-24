// default package

import android.content.DialogInterface;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class pw1 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ChatActivityEnterView b;

    public /* synthetic */ pw1(ChatActivityEnterView chatActivityEnterView, byte b) {
        this.a = b;
        this.b = chatActivityEnterView;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        byte b = this.a;
        ChatActivityEnterView chatActivityEnterView = this.b;
        switch (b) {
            case 0:
                int i = ChatActivityEnterView.z7;
                chatActivityEnterView.M0 = null;
                break;
            default:
                int i2 = ChatActivityEnterView.z7;
                chatActivityEnterView.M0 = null;
                break;
        }
    }
}
