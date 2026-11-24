// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class ra7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ oc7 b;
    public final /* synthetic */ TLRPC.Dialog c;

    public /* synthetic */ ra7(oc7 oc7Var, TLRPC.Dialog dialog, byte b) {
        this.a = b;
        this.b = oc7Var;
        this.c = dialog;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        TLRPC.Dialog dialog = this.c;
        oc7 oc7Var = this.b;
        switch (b) {
            case 0:
                if (e21.a) {
                    fc4.b("checkLastDialogMessage for " + dialog.id + " has not message");
                }
                if (oc7Var.getMediaDataController().T(dialog.id, 0L) == null) {
                    TLRPC.Dialog dialog2 = (TLRPC.Dialog) oc7Var.R.f(dialog.id);
                    if (dialog2 != null) {
                        if (e21.a) {
                            StringBuilder sb = new StringBuilder("checkLastDialogMessage for ");
                            sb.append(dialog.id);
                            sb.append(" current dialog top message ");
                            b10.p(dialog2.top_message, sb);
                        }
                        if (dialog2.top_message == 0) {
                            oc7Var.T(3, dialog.id, false);
                            break;
                        }
                    } else {
                        if (e21.a) {
                            fc4.b("checkLastDialogMessage for " + dialog.id + " current dialog not found");
                        }
                        cf7 messagesStorage = oc7Var.getMessagesStorage();
                        messagesStorage.a.c(new hq6((Object) messagesStorage, dialog.id, (Object) new ra7(oc7Var, dialog, (byte) 2), (byte) 18));
                        break;
                    }
                }
                break;
            case 1:
                oc7Var.U0.e(dialog.id);
                break;
            default:
                oc7Var.T(3, dialog.id, false);
                break;
        }
    }
}
