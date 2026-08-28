package org.telegram.ui;

import org.telegram.messenger.CacheByChatsController;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class y5 extends wf.a {
    public final CacheByChatsController.KeepMediaException c;

    public y5(int i9, CacheByChatsController.KeepMediaException keepMediaException) {
        super(i9, false);
        this.c = keepMediaException;
    }

    public final boolean equals(Object obj) {
        CacheByChatsController.KeepMediaException keepMediaException;
        if (this == obj) {
            return true;
        }
        if (obj == null || y5.class != obj.getClass()) {
            return false;
        }
        y5 y5Var = (y5) obj;
        if (this.a != y5Var.a) {
            return false;
        }
        CacheByChatsController.KeepMediaException keepMediaException2 = this.c;
        return keepMediaException2 == null || (keepMediaException = y5Var.c) == null || keepMediaException2.dialogId == keepMediaException.dialogId;
    }
}
