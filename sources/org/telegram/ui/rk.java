package org.telegram.ui;

import android.animation.AnimatorSet;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class rk implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wn b;

    public /* synthetic */ rk(wn wnVar, int i10) {
        this.a = i10;
        this.b = wnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Components.ch chVar;
        FrameLayout frameLayout;
        switch (this.a) {
            case 0:
                wn wnVar = this.b;
                AnimatorSet animatorSet = wnVar.la;
                if (animatorSet != null && !animatorSet.isRunning()) {
                    wnVar.la.start();
                    break;
                }
                break;
            default:
                wn wnVar2 = this.b;
                if (wnVar2.a3 == this && (chVar = wnVar2.Y0) != null && (frameLayout = wnVar2.Z2) != null) {
                    chVar.i(frameLayout, false, true);
                    break;
                }
                break;
        }
    }
}
