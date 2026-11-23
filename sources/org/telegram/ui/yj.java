package org.telegram.ui;

import android.animation.AnimatorSet;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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
        org.telegram.ui.Components.ch chVar;
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
                if (bnVar2.d3 == this && (chVar = bnVar2.b1) != null && (frameLayout = bnVar2.c3) != null) {
                    chVar.j(frameLayout, false, true);
                    break;
                }
                break;
        }
    }
}
