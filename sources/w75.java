// default package

import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.messenger.voip.GroupCallMessagesController;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class w75 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ GroupCallMessage b;

    public /* synthetic */ w75(GroupCallMessage groupCallMessage, byte b) {
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
