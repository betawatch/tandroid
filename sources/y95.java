// default package

import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.messenger.voip.GroupCallMessagesController;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
