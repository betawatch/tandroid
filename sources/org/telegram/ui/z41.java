package org.telegram.ui;

import j$.util.Objects;
import org.telegram.messenger.SaveToGallerySettingsHelper;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class z41 extends pg.a {
    public final SaveToGallerySettingsHelper.DialogException c;
    public final String d;

    public z41(int i10) {
        super(i10, false);
        this.c = null;
    }

    public final boolean equals(Object obj) {
        SaveToGallerySettingsHelper.DialogException dialogException;
        if (this == obj) {
            return true;
        }
        if (obj == null || z41.class != obj.getClass()) {
            return false;
        }
        z41 z41Var = (z41) obj;
        if (this.a != z41Var.a) {
            return false;
        }
        String str = this.d;
        if (str != null) {
            return Objects.equals(str, z41Var.d);
        }
        SaveToGallerySettingsHelper.DialogException dialogException2 = this.c;
        return dialogException2 == null || (dialogException = z41Var.c) == null || dialogException2.dialogId == dialogException.dialogId;
    }

    public z41(SaveToGallerySettingsHelper.DialogException dialogException) {
        super(2, false);
        this.c = dialogException;
    }

    public z41(int i10, String str) {
        super(i10, false);
        this.d = str;
        this.c = null;
    }
}
