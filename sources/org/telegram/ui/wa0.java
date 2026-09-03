package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class wa0 implements View.OnLayoutChangeListener {
    public boolean a;

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        boolean z4 = i13 - i11 > i12 - i10;
        if (z4 != this.a) {
            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.jc(this, 26));
            this.a = z4;
        }
    }
}
