// default package

import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.messenger.voip.GroupCallMessagesController;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final /* synthetic */ class x95 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ GroupCallMessagesController b;
    public final /* synthetic */ long c;
    public final /* synthetic */ GroupCallMessage d;

    public /* synthetic */ x95(GroupCallMessagesController groupCallMessagesController, long j, GroupCallMessage groupCallMessage, byte b) {
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
