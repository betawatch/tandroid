package org.telegram.ui;

import android.animation.AnimatorSet;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
        org.telegram.ui.Components.lg lgVar;
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
                if (cnVar2.c3 == this && (lgVar = cnVar2.a1) != null && (frameLayout = cnVar2.b3) != null) {
                    lgVar.i(frameLayout, false, true);
                    break;
                }
                break;
        }
    }
}
