package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.CacheByChatsController;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y5 implements p80 {
    public final /* synthetic */ int a;
    public final /* synthetic */ b6 b;
    public final /* synthetic */ CacheByChatsController.KeepMediaException c;

    public /* synthetic */ y5(b6 b6Var, CacheByChatsController.KeepMediaException keepMediaException, int i10) {
        this.a = i10;
        this.b = b6Var;
        this.c = keepMediaException;
    }

    @Override // org.telegram.ui.p80
    public final void a(int i10) {
        switch (this.a) {
            case 0:
                int i11 = CacheByChatsController.KEEP_MEDIA_DELETE;
                b6 b6Var = this.b;
                CacheByChatsController.KeepMediaException keepMediaException = this.c;
                if (i10 == i11) {
                    b6Var.d.remove(keepMediaException);
                    b6Var.U();
                } else {
                    keepMediaException.keepMedia = i10;
                    AndroidUtilities.updateVisibleRows(b6Var.b);
                }
                b6Var.getMessagesController().getCacheByChatsController().saveKeepMediaExceptions(b6Var.e, b6Var.d);
                break;
            default:
                this.c.keepMedia = i10;
                b6 b6Var2 = this.b;
                b6Var2.getMessagesController().getCacheByChatsController().saveKeepMediaExceptions(b6Var2.e, b6Var2.d);
                AndroidUtilities.updateVisibleRows(b6Var2.b);
                break;
        }
    }
}
