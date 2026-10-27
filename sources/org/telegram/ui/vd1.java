package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class vd1 extends org.telegram.ui.Components.ww0 {
    public boolean l0;

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        Q();
        if (getKeyboardHeight() != 0 || this.l0) {
            this.l0 = true;
            setPadding(0, 0, 0, 0);
        } else {
            int i12 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
            this.f = i12;
            setPadding(0, 0, 0, i12);
        }
        super.onMeasure(i10, i11);
    }
}
