package org.telegram.ui;

import j$.util.Objects;
import org.telegram.messenger.SaveToGallerySettingsHelper;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class x31 extends bg.b {
    public final SaveToGallerySettingsHelper.DialogException c;
    public final String d;

    public x31(int i10) {
        super(i10, false);
        this.c = null;
    }

    public final boolean equals(Object obj) {
        SaveToGallerySettingsHelper.DialogException dialogException;
        if (this == obj) {
            return true;
        }
        if (obj == null || x31.class != obj.getClass()) {
            return false;
        }
        x31 x31Var = (x31) obj;
        if (this.a != x31Var.a) {
            return false;
        }
        String str = this.d;
        if (str != null) {
            return Objects.equals(str, x31Var.d);
        }
        SaveToGallerySettingsHelper.DialogException dialogException2 = this.c;
        return dialogException2 == null || (dialogException = x31Var.c) == null || dialogException2.dialogId == dialogException.dialogId;
    }

    public x31(SaveToGallerySettingsHelper.DialogException dialogException) {
        super(2, false);
        this.c = dialogException;
    }

    public x31(int i10, String str) {
        super(i10, false);
        this.d = str;
        this.c = null;
    }
}
