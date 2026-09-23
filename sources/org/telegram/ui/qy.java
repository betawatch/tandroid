package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class qy extends FrameLayout {
    public static final /* synthetic */ int L = 0;
    public boolean E;
    public jx F;
    public gg.m G;
    public boolean H;
    public final tw I;
    public final tw J;
    public final /* synthetic */ ry K;
    public ny a;
    public a5.a b;
    public uw c;
    public yw d;
    public s4.y e;
    public py f;
    public int h;
    public xw n;
    public org.telegram.ui.Components.pk0 r;
    public int s;
    public int v;
    public org.telegram.ui.Components.u00 w;
    public sw x;
    public org.telegram.ui.Components.rk0 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qy(Context context, ry ryVar) {
        super(context);
        this.K = ryVar;
        this.I = new tw(this, 1);
        this.J = new tw(this, 2);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        ((FrameLayout.LayoutParams) this.a.getLayoutParams()).bottomMargin = 0;
        super.onMeasure(i10, i11);
    }

    public final boolean p() {
        int i10 = this.s;
        return i10 == 0 || i10 == 7 || i10 == 8;
    }

    public final void q(boolean z10) {
        if (((org.telegram.ui.ActionBar.n2) this.K).isPaused) {
            return;
        }
        tw twVar = this.J;
        if (z10) {
            AndroidUtilities.cancelRunOnUIThread(twVar);
            this.a.setItemAnimator(this.x);
            twVar.run();
        } else {
            if (this.H) {
                return;
            }
            this.H = true;
            if (!this.x.k()) {
                this.a.setItemAnimator(null);
            }
            AndroidUtilities.runOnUIThread(twVar, 36L);
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f7) {
        qy qyVar;
        if (getTranslationX() != f7) {
            super.setTranslationX(f7);
            ry ryVar = this.K;
            if (ryVar.g3 && (qyVar = ryVar.e0[0]) == this) {
                ryVar.z0.g(Math.abs(qyVar.getTranslationX()) / ryVar.e0[0].getMeasuredWidth(), ryVar.e0[1].h);
            }
            ryVar.m3();
        }
    }

    @Override // android.view.View
    public void setTranslationY(float f7) {
        if (getTranslationY() != f7) {
            this.K.m3();
        }
        super.setTranslationY(f7);
    }
}
