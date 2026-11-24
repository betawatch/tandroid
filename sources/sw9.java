// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class sw9 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ sw9(byte b, Object obj, boolean z) {
        this.a = b;
        this.c = obj;
        this.b = z;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 2:
                ((daa) obj).n = null;
                break;
            case 3:
                ((nha) obj).R1 = null;
                break;
            case 13:
                p5c p5cVar = (p5c) obj;
                AnimatorSet animatorSet = p5cVar.J;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    p5cVar.J = null;
                    break;
                }
                break;
            case 14:
                k8c k8cVar = (k8c) obj;
                AnimatorSet animatorSet2 = k8cVar.n1;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    k8cVar.n1 = null;
                    break;
                }
                break;
            case 15:
                y9c y9cVar = (y9c) obj;
                AnimatorSet animatorSet3 = y9cVar.s1;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    y9cVar.s1 = null;
                    break;
                }
                break;
            case 17:
                rsc rscVar = (rsc) obj;
                AnimatorSet animatorSet4 = rscVar.f;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    rscVar.f = null;
                    break;
                }
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        sb5 sb5Var;
        Drawable[] drawableArr;
        Drawable drawable;
        float f;
        byte b = this.a;
        boolean z = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                tw9 tw9Var = (tw9) obj;
                tw9Var.w = z ? 1.0f : 0.0f;
                if (tw9Var.T) {
                    tw9Var.O.invalidate();
                    break;
                }
                break;
            case 1:
                rz9 rz9Var = (rz9) obj;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = rz9Var.w;
                float f2 = z ? 1.0f : 0.0f;
                rz9Var.M = f2;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(f2);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(d53.g.getInterpolation(rz9Var.M));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i = 0; i < itemsCount; i++) {
                    float s = gm.s(rz9Var.M, i, itemsCount, 4.0f);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(i).setTranslationY((1.0f - s) * gm.L(-12.0f));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(i).setAlpha(s);
                }
                rz9Var.O = null;
                break;
            case 2:
                daa daaVar = (daa) obj;
                if (daaVar.n != null && (sb5Var = daaVar.r) != null) {
                    if (!z) {
                        sb5Var.setVisibility(4);
                    }
                    daaVar.n = null;
                    break;
                }
                break;
            case 3:
                nha nhaVar = (nha) obj;
                if (nhaVar.R1 != null) {
                    nhaVar.R1 = null;
                    if (!z) {
                        nhaVar.E0.setVisibility(4);
                        break;
                    }
                }
                break;
            case 4:
                sha shaVar = (sha) obj;
                ValueAnimator valueAnimator = shaVar.B0;
                if (valueAnimator != null && valueAnimator.equals(animator)) {
                    shaVar.C0 = z ? 1.0f : 0.0f;
                    shaVar.B0 = null;
                    break;
                }
                break;
            case 5:
                t7b t7bVar = (t7b) obj;
                if (z) {
                    t7bVar.setVisibility(8);
                }
                t7bVar.c = null;
                break;
            case 6:
                v9b v9bVar = (v9b) obj;
                if (!z) {
                    v9bVar.W0.setVisibility(8);
                }
                v9bVar.g2 = null;
                break;
            case 7:
                oab oabVar = (oab) obj;
                oabVar.J0.e();
                oabVar.f0 = z ? oabVar.x.c : 0.0f;
                a58 currentPeerView = oabVar.o0.getCurrentPeerView();
                if (currentPeerView != null) {
                    currentPeerView.invalidate();
                }
                oabVar.w.invalidate();
                oabVar.v1 = null;
                break;
            case 8:
                super.onAnimationEnd(animator);
                bpb bpbVar = (bpb) obj;
                bpbVar.N = z ? 1.0f : 0.0f;
                bpbVar.invalidate();
                break;
            case 9:
                ((krb) obj).E = z ? 1.0f : 0.0f;
                break;
            case 10:
                mzb mzbVar = (mzb) obj;
                long j = mzbVar.f;
                if (mzbVar.e0 == animator) {
                    mzbVar.V = z ? 1.0f : 0.0f;
                    mzbVar.m();
                    mzbVar.W = false;
                    ImageView imageView = mzbVar.I;
                    boolean z2 = mzbVar.T;
                    int i2 = R.drawable.menu_sidebar_top;
                    imageView.setImageResource(z2 ? R.drawable.menu_sidebar_top : R.drawable.menu_sidebar_bottom);
                    ImageView imageView2 = mzbVar.H;
                    if (!mzbVar.T) {
                        i2 = R.drawable.menu_sidebar_left;
                    }
                    imageView2.setImageResource(i2);
                    mzbVar.e0 = null;
                    oc7.r1(mzbVar.e).X3.edit().putBoolean(kt6.n(j, "topicssidetabs"), mzbVar.U).putBoolean(kt6.n(j, "topicssidetabsb"), mzbVar.T).apply();
                    Boolean bool = mzbVar.d0;
                    if (bool != null && z != bool.booleanValue()) {
                        boolean booleanValue = mzbVar.d0.booleanValue();
                        mzbVar.d0 = null;
                        mzbVar.a(booleanValue);
                    }
                    gm.c3(new zcb(this, (byte) 22));
                    break;
                }
                break;
            case 11:
                hzb hzbVar = (hzb) obj;
                hzbVar.G = z ? 1.0f : 0.0f;
                hzbVar.h();
                break;
            case 12:
                lzb lzbVar = (lzb) obj;
                lzbVar.V = z ? 1.0f : 0.0f;
                lzbVar.h();
                lzbVar.g();
                break;
            case 13:
                p5c p5cVar = (p5c) obj;
                AnimatorSet animatorSet = p5cVar.J;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (z) {
                        p5cVar.e.setVisibility(4);
                        break;
                    } else {
                        p5cVar.b.setVisibility(4);
                        break;
                    }
                }
                break;
            case 14:
                k8c k8cVar = (k8c) obj;
                AnimatorSet animatorSet2 = k8cVar.n1;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!z) {
                        k8cVar.o1.setVisibility(4);
                    }
                    k8cVar.n1 = null;
                    break;
                }
                break;
            case 15:
                y9c y9cVar = (y9c) obj;
                AnimatorSet animatorSet3 = y9cVar.s1;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    if (!z) {
                        y9cVar.r1.setVisibility(4);
                    }
                    y9cVar.s1 = null;
                    break;
                }
                break;
            case 16:
                dkc dkcVar = (dkc) obj;
                dkcVar.w = null;
                if (z) {
                    TextView[] textViewArr = dkcVar.h;
                    TextView textView = textViewArr[0];
                    textViewArr[0] = textViewArr[1];
                    textViewArr[1] = textView;
                    textView.setVisibility(8);
                }
                if (!dkcVar.H && (drawable = (drawableArr = dkcVar.e)[1]) != null) {
                    drawableArr[0] = drawable;
                    drawableArr[1] = null;
                }
                dkcVar.H = false;
                if (!dkcVar.P) {
                    dkcVar.n = dkcVar.r;
                }
                dkcVar.s = 0.0f;
                dkcVar.invalidate();
                break;
            case 17:
                rsc rscVar = (rsc) obj;
                AnimatorSet animatorSet4 = rscVar.f;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    rscVar.f = null;
                    if (!z) {
                        rscVar.setBackgroundColor(0);
                        break;
                    }
                }
                break;
            case 18:
                puc pucVar = (puc) obj;
                vc vcVar = pucVar.W;
                if (!pucVar.U) {
                    vcVar.setVisibility(8);
                    vcVar.setText("");
                }
                f = z ? 1.0f : 0.0f;
                pucVar.V = f;
                vcVar.setAlpha(f);
                pucVar.invalidate();
                if (pucVar.U) {
                    vcVar.requestFocus();
                    gm.E3(vcVar);
                    break;
                } else {
                    vcVar.clearFocus();
                    gm.t1(vcVar);
                    break;
                }
            default:
                wu wuVar = (wu) obj;
                vc vcVar2 = wuVar.c0;
                if (!wuVar.a0) {
                    vcVar2.setVisibility(8);
                }
                f = z ? 1.0f : 0.0f;
                wuVar.b0 = f;
                vcVar2.setAlpha(f);
                wuVar.j(wuVar.b0);
                wuVar.S.setTranslationX(gm.L(56.0f) * wuVar.b0);
                wuVar.P.setTranslationX(gm.L(112.0f) * wuVar.b0);
                wuVar.invalidate();
                break;
        }
    }
}
