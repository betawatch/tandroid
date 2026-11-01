package org.telegram.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class wy0 extends org.telegram.ui.Components.x71 {
    public final /* synthetic */ int V;
    public Object W;
    public final /* synthetic */ FrameLayout a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wy0(FrameLayout frameLayout, Context context, Object obj, int i10) {
        super(context, null);
        this.V = i10;
        this.a0 = frameLayout;
        this.W = obj;
    }

    @Override // org.telegram.ui.Components.x71
    public final void A(int i10) {
        switch (this.V) {
            case 0:
                org.telegram.ui.Components.zq0 zq0Var = (org.telegram.ui.Components.zq0) this.W;
                ((org.telegram.ui.Components.ar0) this.a0).b.b0.get(i10, -1);
                zq0Var.d.S0(1.0f);
                break;
            case 1:
                ((org.telegram.ui.Components.wq0) this.a0).l();
                org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) this.W;
                if (k2Var instanceof ProfileActivity) {
                    ((ProfileActivity) k2Var).W();
                    break;
                }
                break;
            default:
                org.telegram.ui.Components.vq0 vq0Var = (org.telegram.ui.Components.vq0) this.a0;
                String currentLang = vq0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.W, currentLang)) {
                    this.W = currentLang;
                    vq0Var.G.U0();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.x71
    public void h() {
        switch (this.V) {
            case 1:
                org.telegram.ui.Components.wq0 wq0Var = (org.telegram.ui.Components.wq0) this.a0;
                org.telegram.ui.Components.w71 w71Var = wq0Var.n;
                if (wq0Var.b() && w71Var != null) {
                    if (wq0Var.J == null) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(a1.g.m(null, 2131750107, new StringBuilder("+ ")));
                        org.telegram.ui.Components.dq dqVar = new org.telegram.ui.Components.dq(R.drawable.poll_add_plus, 0);
                        dqVar.G = 0.8f;
                        spannableStringBuilder.setSpan(dqVar, 0, 1, 33);
                        wq0Var.J = spannableStringBuilder;
                    }
                    w71Var.a(-1, wq0Var.J);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.x71
    public boolean i(MotionEvent motionEvent) {
        boolean g10;
        switch (this.V) {
            case 1:
                g10 = ((org.telegram.ui.Components.wq0) this.a0).g();
                break;
            case 2:
                g10 = ((org.telegram.ui.Components.vq0) this.a0).G.E1;
                break;
            default:
                return super.i(motionEvent);
        }
        return !g10;
    }

    @Override // org.telegram.ui.Components.x71
    public final void w(boolean z10) {
        switch (this.V) {
            case 0:
                org.telegram.ui.Components.zq0 zq0Var = (org.telegram.ui.Components.zq0) this.W;
                zq0Var.d.S0(((org.telegram.ui.Components.ar0) this.a0).b.getAnimatingIndicatorProgress());
                break;
            case 1:
                org.telegram.ui.Components.wq0 wq0Var = (org.telegram.ui.Components.wq0) this.a0;
                wq0Var.l();
                org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) this.W;
                if (k2Var instanceof ProfileActivity) {
                    ((ProfileActivity) k2Var).W();
                    View fragmentView = k2Var.getFragmentView();
                    if (fragmentView != null) {
                        fragmentView.invalidate();
                    }
                }
                wq0Var.p();
                break;
            default:
                org.telegram.ui.Components.vq0 vq0Var = (org.telegram.ui.Components.vq0) this.a0;
                String currentLang = vq0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.W, currentLang)) {
                    this.W = currentLang;
                    vq0Var.G.U0();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.x71
    public void y(int i10) {
        switch (this.V) {
            case 2:
                org.telegram.ui.Components.vq0 vq0Var = (org.telegram.ui.Components.vq0) this.a0;
                String currentLang = vq0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.W, currentLang)) {
                    this.W = currentLang;
                    vq0Var.G.U0();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.x71
    public void z(int i10, boolean z10) {
        switch (this.V) {
            case 0:
                org.telegram.ui.Components.zq0 zq0Var = (org.telegram.ui.Components.zq0) this.W;
                int i11 = ((org.telegram.ui.Components.ar0) this.a0).b.b0.get(i10, -1);
                org.telegram.ui.Components.au0 au0Var = zq0Var.d;
                if (i11 > 0) {
                    org.telegram.ui.Components.au0.s(au0Var, au0Var.t1(i11).a, z10);
                    break;
                } else {
                    org.telegram.ui.Components.au0.s(au0Var, 8, z10);
                    break;
                }
            default:
                super.z(i10, z10);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wy0(org.telegram.ui.Components.vq0 vq0Var, Context context) {
        super(context, null);
        this.V = 2;
        this.a0 = vq0Var;
    }
}
