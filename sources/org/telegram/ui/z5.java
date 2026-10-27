package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.CacheByChatsController;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z5 implements a80 {
    public final /* synthetic */ int a;
    public final /* synthetic */ c6 b;
    public final /* synthetic */ CacheByChatsController.KeepMediaException c;

    public /* synthetic */ z5(c6 c6Var, CacheByChatsController.KeepMediaException keepMediaException, int i10) {
        this.a = i10;
        this.b = c6Var;
        this.c = keepMediaException;
    }

    @Override // org.telegram.ui.a80
    public final void a(int i10) {
        switch (this.a) {
            case 0:
                int i11 = CacheByChatsController.KEEP_MEDIA_DELETE;
                c6 c6Var = this.b;
                CacheByChatsController.KeepMediaException keepMediaException = this.c;
                if (i10 == i11) {
                    c6Var.d.remove(keepMediaException);
                    c6Var.V();
                } else {
                    keepMediaException.keepMedia = i10;
                    AndroidUtilities.updateVisibleRows(c6Var.b);
                }
                c6Var.getMessagesController().getCacheByChatsController().saveKeepMediaExceptions(c6Var.e, c6Var.d);
                break;
            default:
                this.c.keepMedia = i10;
                c6 c6Var2 = this.b;
                c6Var2.getMessagesController().getCacheByChatsController().saveKeepMediaExceptions(c6Var2.e, c6Var2.d);
                AndroidUtilities.updateVisibleRows(c6Var2.b);
                break;
        }
    }
}
