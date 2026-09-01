package org.telegram.ui;

import j$.util.Objects;
import org.telegram.messenger.SaveToGallerySettingsHelper;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class z31 extends cg.b {
    public final SaveToGallerySettingsHelper.DialogException c;
    public final String d;

    public z31(int i10) {
        super(i10, false);
        this.c = null;
    }

    public final boolean equals(Object obj) {
        SaveToGallerySettingsHelper.DialogException dialogException;
        if (this == obj) {
            return true;
        }
        if (obj == null || z31.class != obj.getClass()) {
            return false;
        }
        z31 z31Var = (z31) obj;
        if (this.a != z31Var.a) {
            return false;
        }
        String str = this.d;
        if (str != null) {
            return Objects.equals(str, z31Var.d);
        }
        SaveToGallerySettingsHelper.DialogException dialogException2 = this.c;
        return dialogException2 == null || (dialogException = z31Var.c) == null || dialogException2.dialogId == dialogException.dialogId;
    }

    public z31(SaveToGallerySettingsHelper.DialogException dialogException) {
        super(2, false);
        this.c = dialogException;
    }

    public z31(int i10, String str) {
        super(i10, false);
        this.d = str;
        this.c = null;
    }
}
