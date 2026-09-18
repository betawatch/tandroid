package org.telegram.ui;

import j$.util.Objects;
import org.telegram.messenger.SaveToGallerySettingsHelper;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class r41 extends og.a {
    public final SaveToGallerySettingsHelper.DialogException c;
    public final String d;

    public r41(int i10) {
        super(i10, false);
        this.c = null;
    }

    public final boolean equals(Object obj) {
        SaveToGallerySettingsHelper.DialogException dialogException;
        if (this == obj) {
            return true;
        }
        if (obj == null || r41.class != obj.getClass()) {
            return false;
        }
        r41 r41Var = (r41) obj;
        if (this.a != r41Var.a) {
            return false;
        }
        String str = this.d;
        if (str != null) {
            return Objects.equals(str, r41Var.d);
        }
        SaveToGallerySettingsHelper.DialogException dialogException2 = this.c;
        return dialogException2 == null || (dialogException = r41Var.c) == null || dialogException2.dialogId == dialogException.dialogId;
    }

    public r41(SaveToGallerySettingsHelper.DialogException dialogException) {
        super(2, false);
        this.c = dialogException;
    }

    public r41(int i10, String str) {
        super(i10, false);
        this.d = str;
        this.c = null;
    }
}
