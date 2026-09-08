package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.CacheByChatsController;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class x5 implements n80 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a6 b;
    public final /* synthetic */ CacheByChatsController.KeepMediaException c;

    public /* synthetic */ x5(a6 a6Var, CacheByChatsController.KeepMediaException keepMediaException, int i10) {
        this.a = i10;
        this.b = a6Var;
        this.c = keepMediaException;
    }

    @Override // org.telegram.ui.n80
    public final void a(int i10) {
        switch (this.a) {
            case 0:
                int i11 = CacheByChatsController.KEEP_MEDIA_DELETE;
                a6 a6Var = this.b;
                CacheByChatsController.KeepMediaException keepMediaException = this.c;
                if (i10 == i11) {
                    a6Var.d.remove(keepMediaException);
                    a6Var.U();
                } else {
                    keepMediaException.keepMedia = i10;
                    AndroidUtilities.updateVisibleRows(a6Var.b);
                }
                a6Var.getMessagesController().getCacheByChatsController().saveKeepMediaExceptions(a6Var.e, a6Var.d);
                break;
            default:
                this.c.keepMedia = i10;
                a6 a6Var2 = this.b;
                a6Var2.getMessagesController().getCacheByChatsController().saveKeepMediaExceptions(a6Var2.e, a6Var2.d);
                AndroidUtilities.updateVisibleRows(a6Var2.b);
                break;
        }
    }
}
