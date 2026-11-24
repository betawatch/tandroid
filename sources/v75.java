// default package

import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.messenger.voip.GroupCallMessagesController;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class v75 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ GroupCallMessagesController b;
    public final /* synthetic */ long c;
    public final /* synthetic */ GroupCallMessage d;

    public /* synthetic */ v75(GroupCallMessagesController groupCallMessagesController, long j, GroupCallMessage groupCallMessage, byte b) {
        this.a = b;
        this.b = groupCallMessagesController;
        this.c = j;
        this.d = groupCallMessage;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        GroupCallMessage groupCallMessage = this.d;
        long j = this.c;
        GroupCallMessagesController groupCallMessagesController = this.b;
        switch (b) {
            case 0:
                groupCallMessagesController.lambda$processUpdate$0(j, groupCallMessage);
                break;
            case 1:
                groupCallMessagesController.lambda$processUpdate$1(j, groupCallMessage);
                break;
            default:
                groupCallMessagesController.lambda$processUpdate$2(j, groupCallMessage);
                break;
        }
    }
}
