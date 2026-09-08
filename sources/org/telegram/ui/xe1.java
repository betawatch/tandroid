package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class xe1 extends org.telegram.ui.Components.ov0 {
    public boolean w0;

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        R();
        if (getKeyboardHeight() != 0 || this.w0) {
            this.w0 = true;
            setPadding(0, 0, 0, 0);
        } else {
            int i12 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
            this.f = i12;
            setPadding(0, 0, 0, i12);
        }
        super.onMeasure(i10, i11);
    }
}
