package org.telegram.ui;

import android.animation.AnimatorSet;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class zj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ cn b;

    public /* synthetic */ zj(cn cnVar, int i7) {
        this.a = i7;
        this.b = cnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Components.kg kgVar;
        FrameLayout frameLayout;
        switch (this.a) {
            case 0:
                cn cnVar = this.b;
                AnimatorSet animatorSet = cnVar.qa;
                if (animatorSet != null && !animatorSet.isRunning()) {
                    cnVar.qa.start();
                    break;
                }
                break;
            default:
                cn cnVar2 = this.b;
                if (cnVar2.c3 == this && (kgVar = cnVar2.a1) != null && (frameLayout = cnVar2.b3) != null) {
                    kgVar.i(frameLayout, false, true);
                    break;
                }
                break;
        }
    }
}
