package org.telegram.ui;

import android.animation.AnimatorSet;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class xj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ an b;

    public /* synthetic */ xj(an anVar, int i7) {
        this.a = i7;
        this.b = anVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Components.lg lgVar;
        FrameLayout frameLayout;
        switch (this.a) {
            case 0:
                an anVar = this.b;
                AnimatorSet animatorSet = anVar.oa;
                if (animatorSet != null && !animatorSet.isRunning()) {
                    anVar.oa.start();
                    break;
                }
                break;
            default:
                an anVar2 = this.b;
                if (anVar2.c3 == this && (lgVar = anVar2.a1) != null && (frameLayout = anVar2.b3) != null) {
                    lgVar.i(frameLayout, false, true);
                    break;
                }
                break;
        }
    }
}
