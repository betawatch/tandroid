package org.telegram.ui;

import android.animation.AnimatorSet;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class tj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wm b;

    public /* synthetic */ tj(wm wmVar, int i3) {
        this.a = i3;
        this.b = wmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Components.jg jgVar;
        FrameLayout frameLayout;
        switch (this.a) {
            case 0:
                wm wmVar = this.b;
                AnimatorSet animatorSet = wmVar.pa;
                if (animatorSet != null && !animatorSet.isRunning()) {
                    wmVar.pa.start();
                    break;
                }
                break;
            default:
                wm wmVar2 = this.b;
                if (wmVar2.d3 == this && (jgVar = wmVar2.b1) != null && (frameLayout = wmVar2.c3) != null) {
                    jgVar.i(frameLayout, false, true);
                    break;
                }
                break;
        }
    }
}
