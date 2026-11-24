// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class rsa extends AnimatorListenerAdapter {
    public final /* synthetic */ ssa a;

    public rsa(ssa ssaVar) {
        this.a = ssaVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ssa ssaVar = this.a;
        nsa nsaVar = ssaVar.p0;
        ssaVar.z0 = ssaVar.y0;
        ssaVar.d(ssaVar.b0);
        TL_stars.starGiftAttributeModel[] stargiftattributemodelArr = ssaVar.e;
        int i = 2 - ssaVar.y0;
        stargiftattributemodelArr[i] = (TL_stars.starGiftAttributeModel) ssaVar.d0.f;
        nxa.e1(ssaVar.d[i].getImageReceiver(), stargiftattributemodelArr[2 - ssaVar.y0].document, nm7.p2);
        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) ssaVar.e0.f;
        if (stargiftattributepattern != null) {
            vm l = vm.l(z8c.t0, 7, stargiftattributepattern.document);
            l.m = true;
            l.u();
        }
        gm.r(nsaVar);
        gm.d3(nsaVar, 2500L);
    }
}
