package org.telegram.ui;

import android.animation.AnimatorSet;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
        org.telegram.ui.Components.rg rgVar;
        FrameLayout frameLayout;
        switch (this.a) {
            case 0:
                an anVar = this.b;
                AnimatorSet animatorSet = anVar.ra;
                if (animatorSet != null && !animatorSet.isRunning()) {
                    anVar.ra.start();
                    break;
                }
                break;
            default:
                an anVar2 = this.b;
                if (anVar2.d3 == this && (rgVar = anVar2.b1) != null && (frameLayout = anVar2.c3) != null) {
                    rgVar.i(frameLayout, false, true);
                    break;
                }
                break;
        }
    }
}
