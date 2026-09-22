package vg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.gg0;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class q extends AnimatorListenerAdapter {
    public final /* synthetic */ float[] a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ r e;

    public q(r rVar, float[] fArr, float f7, float f10, boolean z10) {
        this.e = rVar;
        this.a = fArr;
        this.b = f7;
        this.c = f10;
        this.d = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        float[] fArr = this.a;
        float f7 = 1.0f - fArr[0];
        fArr[0] = 1.0f;
        r rVar = this.e;
        gg0 gg0Var = rVar.a;
        gg0Var.b.i = AndroidUtilities.lerp(this.b, this.c, 1.0f);
        sg.a aVar = gg0Var.b;
        aVar.f = (f7 * 360.0f * (this.d ? 1 : -1)) + aVar.f;
        aVar.b();
        rVar.a(gg0Var.b.i);
        gg0Var.h(750L);
    }
}
