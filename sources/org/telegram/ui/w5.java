package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.CacheByChatsController;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w5 implements s70 {
    public final /* synthetic */ int a;
    public final /* synthetic */ z5 b;
    public final /* synthetic */ CacheByChatsController.KeepMediaException c;

    public /* synthetic */ w5(z5 z5Var, CacheByChatsController.KeepMediaException keepMediaException, int i9) {
        this.a = i9;
        this.b = z5Var;
        this.c = keepMediaException;
    }

    @Override // org.telegram.ui.s70
    public final void a(int i9) {
        switch (this.a) {
            case 0:
                int i10 = CacheByChatsController.KEEP_MEDIA_DELETE;
                z5 z5Var = this.b;
                CacheByChatsController.KeepMediaException keepMediaException = this.c;
                if (i9 == i10) {
                    z5Var.d.remove(keepMediaException);
                    z5Var.T();
                } else {
                    keepMediaException.keepMedia = i9;
                    AndroidUtilities.updateVisibleRows(z5Var.b);
                }
                z5Var.getMessagesController().getCacheByChatsController().saveKeepMediaExceptions(z5Var.e, z5Var.d);
                break;
            default:
                this.c.keepMedia = i9;
                z5 z5Var2 = this.b;
                z5Var2.getMessagesController().getCacheByChatsController().saveKeepMediaExceptions(z5Var2.e, z5Var2.d);
                AndroidUtilities.updateVisibleRows(z5Var2.b);
                break;
        }
    }
}
