package org.telegram.ui;

import android.view.View;
import j$.util.Objects;
import java.util.Locale;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yh implements Utilities.CallbackReturn {
    public final /* synthetic */ int a;

    public /* synthetic */ yh(int i10) {
        this.a = i10;
    }

    @Override // org.telegram.messenger.Utilities.CallbackReturn
    public final Object run(Object obj) {
        switch (this.a) {
            case 0:
                MessageObject messageObject = (MessageObject) obj;
                return Boolean.valueOf((messageObject == null || messageObject.getFactCheck() == null) ? false : true);
            case 1:
                MessageObject messageObject2 = (MessageObject) obj;
                return Boolean.valueOf((messageObject2 == null || messageObject2.getEffect() == null) ? false : true);
            case 2:
                return LocaleController.formatPluralString("Hours", ((Integer) obj).intValue(), new Object[0]);
            case 3:
                return LocaleController.formatPluralString("Minutes", ((Integer) obj).intValue(), new Object[0]);
            case 4:
                View view = (View) obj;
                return Boolean.valueOf(((view instanceof org.telegram.ui.Cells.z8) || (view instanceof org.telegram.ui.Cells.y6) || (view instanceof y10) || (view instanceof org.telegram.ui.Cells.t3) || (view instanceof org.telegram.ui.Cells.z1) || Objects.equals(view.getTag(), -33024)) ? false : true);
            case 5:
                return Boolean.valueOf(org.telegram.ui.Components.w51.K(((Integer) obj).intValue()));
            default:
                return String.format(Locale.US, "%.1f%%", Float.valueOf(((Integer) obj).intValue() / 10.0f));
        }
    }
}
