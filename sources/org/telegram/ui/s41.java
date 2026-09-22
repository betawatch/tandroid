package org.telegram.ui;

import j$.util.Objects;
import org.telegram.messenger.SaveToGallerySettingsHelper;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class s41 extends og.a {
    public final SaveToGallerySettingsHelper.DialogException c;
    public final String d;

    public s41(int i10) {
        super(i10, false);
        this.c = null;
    }

    public final boolean equals(Object obj) {
        SaveToGallerySettingsHelper.DialogException dialogException;
        if (this == obj) {
            return true;
        }
        if (obj == null || s41.class != obj.getClass()) {
            return false;
        }
        s41 s41Var = (s41) obj;
        if (this.a != s41Var.a) {
            return false;
        }
        String str = this.d;
        if (str != null) {
            return Objects.equals(str, s41Var.d);
        }
        SaveToGallerySettingsHelper.DialogException dialogException2 = this.c;
        return dialogException2 == null || (dialogException = s41Var.c) == null || dialogException2.dialogId == dialogException.dialogId;
    }

    public s41(SaveToGallerySettingsHelper.DialogException dialogException) {
        super(2, false);
        this.c = dialogException;
    }

    public s41(int i10, String str) {
        super(i10, false);
        this.d = str;
        this.c = null;
    }
}
