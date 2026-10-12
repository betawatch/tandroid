package org.telegram.ui;

import j$.util.Objects;
import org.telegram.messenger.SaveToGallerySettingsHelper;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
