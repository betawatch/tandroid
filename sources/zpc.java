// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class zpc extends b6c {
    public static final /* synthetic */ int b = 0;

    static {
        b6c.h(new zpc());
    }

    @Override // b6c
    public final void b(View view, c6c c6cVar, boolean z, l7c l7cVar, q7c q7cVar) {
        aqc aqcVar = (aqc) view;
        mqc mqcVar = aqcVar.y0;
        if (mqcVar != null) {
            mqcVar.h.remove(aqcVar);
        }
        ValueAnimator valueAnimator = aqcVar.B0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        aqcVar.z0 = 1.0f;
        aqcVar.E.setAlpha(1.0f);
        aqcVar.x0 = (TL_wallet.nftItem) c6cVar.H;
        aqcVar.y0 = (mqc) c6cVar.I;
        TL_stars.SavedStarGift savedStarGift = new TL_stars.SavedStarGift();
        savedStarGift.gift = aqcVar.x0.gift;
        aqcVar.k(false, true, 0.0f);
        aqcVar.i(savedStarGift, true, false);
        mqc mqcVar2 = aqcVar.y0;
        if (mqcVar2 != null) {
            mqcVar2.i(aqcVar);
        }
    }

    @Override // b6c
    public final View d(Context context, r59 r59Var, int i, ylb ylbVar) {
        aqc aqcVar = new aqc(i, ylbVar, context);
        aqcVar.z0 = 1.0f;
        aqcVar.setStateListAnimator(null);
        aqcVar.setWillNotDraw(false);
        return aqcVar;
    }

    @Override // b6c
    public final boolean e(c6c c6cVar, c6c c6cVar2) {
        return TextUtils.equals(((TL_wallet.nftItem) c6cVar.H).address, ((TL_wallet.nftItem) c6cVar2.H).address);
    }

    @Override // b6c
    public final boolean f() {
        return true;
    }
}
