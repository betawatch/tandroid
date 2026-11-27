// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class rua extends AnimatorListenerAdapter {
    public final /* synthetic */ sua a;

    public rua(sua suaVar) {
        this.a = suaVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        sua suaVar = this.a;
        uoa uoaVar = suaVar.p0;
        suaVar.z0 = suaVar.y0;
        suaVar.d(suaVar.b0);
        TL_stars.starGiftAttributeModel[] stargiftattributemodelArr = suaVar.e;
        int i = 2 - suaVar.y0;
        stargiftattributemodelArr[i] = (TL_stars.starGiftAttributeModel) suaVar.d0.f;
        nza.e1(suaVar.d[i].getImageReceiver(), stargiftattributemodelArr[2 - suaVar.y0].document, jn7.p2);
        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) suaVar.e0.f;
        if (stargiftattributepattern != null) {
            wl l = wl.l(yac.t0, 7, stargiftattributepattern.document);
            l.m = true;
            l.u();
        }
        hl.r(uoaVar);
        hl.d3(uoaVar, 2500L);
    }
}
