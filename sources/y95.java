// default package

import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.messenger.voip.GroupCallMessagesController;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final /* synthetic */ class y95 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ GroupCallMessage b;

    public /* synthetic */ y95(GroupCallMessage groupCallMessage, byte b) {
        this.a = b;
        this.b = groupCallMessage;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        GroupCallMessage groupCallMessage = this.b;
        switch (b) {
            case 0:
                groupCallMessage.notifyStateUpdate();
                break;
            default:
                GroupCallMessagesController.lambda$sendCallMessage$4(groupCallMessage);
                break;
        }
    }
}
