package org.telegram.ui;

import j$.util.Objects;
import org.telegram.messenger.SaveToGallerySettingsHelper;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class v41 extends ng.a {
    public final SaveToGallerySettingsHelper.DialogException c;
    public final String d;

    public v41(int i10) {
        super(i10, false);
        this.c = null;
    }

    public final boolean equals(Object obj) {
        SaveToGallerySettingsHelper.DialogException dialogException;
        if (this == obj) {
            return true;
        }
        if (obj == null || v41.class != obj.getClass()) {
            return false;
        }
        v41 v41Var = (v41) obj;
        if (this.a != v41Var.a) {
            return false;
        }
        String str = this.d;
        if (str != null) {
            return Objects.equals(str, v41Var.d);
        }
        SaveToGallerySettingsHelper.DialogException dialogException2 = this.c;
        return dialogException2 == null || (dialogException = v41Var.c) == null || dialogException2.dialogId == dialogException.dialogId;
    }

    public v41(SaveToGallerySettingsHelper.DialogException dialogException) {
        super(2, false);
        this.c = dialogException;
    }

    public v41(int i10, String str) {
        super(i10, false);
        this.d = str;
        this.c = null;
    }
}
