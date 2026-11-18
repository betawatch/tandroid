package org.telegram.ui;

import android.animation.AnimatorSet;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class yj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bn b;

    public /* synthetic */ yj(bn bnVar, int i7) {
        this.a = i7;
        this.b = bnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Components.ah ahVar;
        FrameLayout frameLayout;
        switch (this.a) {
            case 0:
                bn bnVar = this.b;
                AnimatorSet animatorSet = bnVar.sa;
                if (animatorSet != null && !animatorSet.isRunning()) {
                    bnVar.sa.start();
                    break;
                }
                break;
            default:
                bn bnVar2 = this.b;
                if (bnVar2.d3 == this && (ahVar = bnVar2.b1) != null && (frameLayout = bnVar2.c3) != null) {
                    ahVar.j(frameLayout, false, true);
                    break;
                }
                break;
        }
    }
}
