package org.telegram.ui;

import android.animation.AnimatorSet;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
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
