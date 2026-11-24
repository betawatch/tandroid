// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.TextureView;
import android.view.WindowManager;
import org.telegram.ui.Components.UndoView;
import org.webrtc.OrientationHelper;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class q7b extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ q7b(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                ((v7b) this.b).O = false;
                break;
            case 1:
                t7b t7bVar = (t7b) this.b;
                t7bVar.setTranslationY(0.0f);
                t7bVar.d = null;
                break;
            case 2:
                ((kcb) this.b).e = false;
                break;
            case 3:
                ((ukb) this.b).setVisibility(4);
                break;
            case 4:
                rob robVar = ((gob) this.b).a;
                if (!robVar.r1.a()) {
                    robVar.T1.setVisibility(8);
                    break;
                }
                break;
            case 5:
                super.onAnimationEnd(animator);
                rm3 rm3Var = (rm3) ((fb) this.b).b;
                ((tob) rm3Var.b).getTransitionParams().e();
                ((tob) rm3Var.b).getTransitionParams().h = false;
                ((tob) rm3Var.b).getTransitionParams().L1 = 1.0f;
                break;
            case 6:
                ((kvb) this.b).setVisibility(8);
                break;
            case 7:
                super.onAnimationEnd(animator);
                ((uvb) this.b).d = null;
                break;
            case 8:
                super.onAnimationEnd(animator);
                ((qxb) this.b).setScrollEnabled(true);
                break;
            case 9:
                yc ycVar = ((hzb) this.b).f;
                ycVar.setScaleX(1.0f);
                ycVar.setScaleY(1.0f);
                ycVar.invalidate();
                break;
            case 10:
                lzb lzbVar = (lzb) this.b;
                lzbVar.M = 1.0f;
                lzbVar.h.invalidate();
                break;
            case 11:
                ((m0c) this.b).L = null;
                break;
            case 12:
                ((d4c) this.b).M = null;
                break;
            case 13:
                p5c p5cVar = ((o5c) this.b).d;
                if (animator.equals(p5cVar.L)) {
                    p5cVar.L = null;
                    break;
                }
                break;
            case 14:
                UndoView undoView = (UndoView) this.b;
                undoView.setVisibility(4);
                undoView.setScaleX(1.0f);
                undoView.setScaleY(1.0f);
                undoView.setAlpha(1.0f);
                break;
            case 15:
                l8c l8cVar = (l8c) this.b;
                if (l8cVar.a.getTag() == null) {
                    l8cVar.a.setVisibility(4);
                    break;
                }
                break;
            case 16:
                super.onAnimationEnd(animator);
                w9c w9cVar = (w9c) this.b;
                w9cVar.b = 0.0f;
                w9cVar.setTranslationY(0.0f);
                w9cVar.a = null;
                break;
            case 17:
                dac dacVar = (dac) this.b;
                dacVar.d = null;
                dacVar.a = null;
                dacVar.b = false;
                dacVar.f.c.setAllowDrawCursor(true);
                break;
            case 18:
                bec becVar = (bec) ((am2) this.b).b;
                becVar.G = true;
                becVar.invalidate();
                break;
            case 19:
                vgc vgcVar = (vgc) this.b;
                vgcVar.K = false;
                vgcVar.setEnabled(true);
                ugc ugcVar = vgcVar.E;
                if (ugcVar != null) {
                    ugcVar.g(1.0f);
                }
                vgcVar.invalidate();
                break;
            case 20:
                lhc lhcVar = (lhc) this.b;
                lhcVar.i = false;
                lhcVar.l.setAlpha(35);
                lhcVar.k.setAlpha(nm7.m1);
                lhcVar.j.setAlpha(35);
                lhcVar.c();
                break;
            case 21:
                phc phcVar = ((nhc) this.b).c;
                phcVar.P = false;
                phcVar.requestLayout();
                break;
            case 22:
                akc akcVar = (akc) this.b;
                akcVar.O = 0.0f;
                akcVar.P = 0.0f;
                zjc zjcVar = akcVar.d;
                zjcVar.setScaleX(akcVar.U);
                zjcVar.setScaleY(akcVar.U);
                TextureView textureView = akcVar.e;
                if (textureView != null) {
                    textureView.setScaleX(akcVar.V);
                    textureView.setScaleY(akcVar.V);
                }
                akcVar.setTranslationY(0.0f);
                akcVar.setTranslationX(0.0f);
                akcVar.a0 = akcVar.W;
                akcVar.c0 = null;
                break;
            case 23:
                dkc dkcVar = (dkc) this.b;
                dkcVar.R = dkcVar.Q ? 1.0f : 0.0f;
                dkcVar.a(dkcVar.S, dkcVar.T);
                break;
            case 24:
                ((ekc) this.b).c.e();
                gm.K3(((ekc) this.b).a);
                if (((ekc) this.b).getParent() != null) {
                    WindowManager windowManager = (WindowManager) ((ekc) this.b).a.getSystemService("window");
                    ((ekc) this.b).setVisibility(8);
                    try {
                        windowManager.removeView((ekc) this.b);
                    } catch (Exception unused) {
                    }
                    OrientationHelper.cameraRotationDisabled = false;
                    break;
                }
                break;
            case 25:
                kkc kkcVar = (kkc) this.b;
                AnimatorSet animatorSet = kkcVar.R;
                kkcVar.K = false;
                kkcVar.U.e = false;
                if (kkcVar.V && animatorSet != null) {
                    animatorSet.cancel();
                    animatorSet.start();
                }
                kkcVar.c();
                break;
            case 26:
                ((rkc) this.b).e.setVisibility(8);
                break;
            case 27:
                ((mmc) this.b).f();
                break;
            case 28:
                goc gocVar = (goc) this.b;
                if (gocVar.N0 == animator) {
                    gocVar.N0 = null;
                    break;
                }
                break;
            default:
                eoc eocVar = (eoc) this.b;
                eocVar.n = false;
                eocVar.r = null;
                eocVar.c.setLayerType(0, null);
                break;
        }
    }
}
