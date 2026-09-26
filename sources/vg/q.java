package vg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.yf0;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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
        yf0 yf0Var = rVar.a;
        yf0Var.b.i = AndroidUtilities.lerp(this.b, this.c, 1.0f);
        sg.a aVar = yf0Var.b;
        aVar.f = (f7 * 360.0f * (this.d ? 1 : -1)) + aVar.f;
        aVar.b();
        rVar.a(yf0Var.b.i);
        yf0Var.h(750L);
    }
}
