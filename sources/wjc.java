// default package

import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class wjc implements fd, tjc, nr7, bnc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mkc b;

    public /* synthetic */ wjc(mkc mkcVar, byte b) {
        this.a = b;
        this.b = mkcVar;
    }

    @Override // nr7
    public final l2d S(View view, l2d l2dVar) {
        WindowInsets g = l2dVar.g();
        mkc mkcVar = this.b;
        mkcVar.r0 = g;
        ((FrameLayout.LayoutParams) mkcVar.j0.getLayoutParams()).bottomMargin = mkcVar.r0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) mkcVar.f0.getLayoutParams()).bottomMargin = mkcVar.r0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) mkcVar.I.getLayoutParams()).topMargin = mkcVar.r0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) mkcVar.J.getLayoutParams()).topMargin = mkcVar.r0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) mkcVar.L.getLayoutParams()).topMargin = mkcVar.r0.getSystemWindowInsetTop() + hl.L(56.0f);
        ((FrameLayout.LayoutParams) mkcVar.Y.getLayoutParams()).topMargin = mkcVar.r0.getSystemWindowInsetTop() + hl.L(135.0f);
        ((FrameLayout.LayoutParams) mkcVar.O.getLayoutParams()).topMargin = mkcVar.r0.getSystemWindowInsetTop() + hl.L(17.0f);
        ((FrameLayout.LayoutParams) mkcVar.E.getLayoutParams()).topMargin = mkcVar.r0.getSystemWindowInsetTop() + hl.L(93.0f);
        ((FrameLayout.LayoutParams) mkcVar.P.getLayoutParams()).topMargin = mkcVar.r0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) mkcVar.S.getLayoutParams()).topMargin = mkcVar.r0.getSystemWindowInsetTop() + hl.L(118.0f);
        ((FrameLayout.LayoutParams) mkcVar.R.getLayoutParams()).topMargin = mkcVar.r0.getSystemWindowInsetTop() + hl.L(380.0f);
        ((FrameLayout.LayoutParams) mkcVar.a0.getLayoutParams()).bottomMargin = mkcVar.r0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) mkcVar.M0.getLayoutParams()).bottomMargin = mkcVar.r0.getSystemWindowInsetBottom();
        mkcVar.Z.setInsets(mkcVar.r0);
        mkcVar.a0.setInsets(mkcVar.r0);
        mkcVar.s.requestLayout();
        gkc gkcVar = mkcVar.o0;
        if (gkcVar != null) {
            gkcVar.setBottomPadding(mkcVar.r0.getSystemWindowInsetBottom());
        }
        return l2d.b;
    }

    @Override // bnc
    public final void c(cnc cncVar) {
        byte b = this.a;
        mkc mkcVar = this.b;
        switch (b) {
            case 4:
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    hl.r(mkcVar.S0);
                    mkcVar.R0 = false;
                    boolean isMicMute = sharedInstance.isMicMute();
                    boolean z = !isMicMute;
                    if (mkcVar.w0.isTouchExplorationEnabled()) {
                        cncVar.announceForAccessibility(ob6.M0(!isMicMute ? 2131754724 : 2131754723, null));
                    }
                    sharedInstance.setMicMute(z, false, true);
                    mkcVar.q0 = mkcVar.p0;
                    mkcVar.y();
                    break;
                }
                break;
            default:
                hl.r(mkcVar.S0);
                mkcVar.R0 = false;
                if (mkcVar.b.checkSelfPermission("android.permission.CAMERA") == 0) {
                    mkcVar.t();
                    break;
                } else {
                    mkcVar.b.requestPermissions(new String[]{"android.permission.CAMERA"}, jn7.m1);
                    break;
                }
        }
    }

    @Override // fd
    public final void w(id idVar, int i) {
        this.b.u0.b();
    }
}
