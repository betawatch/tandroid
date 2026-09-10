package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class vy extends FrameLayout {
    public static final /* synthetic */ int L = 0;
    public boolean E;
    public ox F;
    public fg.m G;
    public boolean H;
    public final yw I;
    public final yw J;
    public final /* synthetic */ wy K;
    public sy a;
    public a5.a b;
    public zw c;
    public dx d;
    public s4.y e;
    public uy f;
    public int h;
    public cx n;
    public org.telegram.ui.Components.yk0 r;
    public int s;
    public int v;
    public org.telegram.ui.Components.a10 w;
    public xw x;
    public org.telegram.ui.Components.zk0 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vy(Context context, wy wyVar) {
        super(context);
        this.K = wyVar;
        this.I = new yw(this, 1);
        this.J = new yw(this, 2);
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
        if (((org.telegram.ui.ActionBar.p2) this.K).isPaused) {
            return;
        }
        yw ywVar = this.J;
        if (z10) {
            AndroidUtilities.cancelRunOnUIThread(ywVar);
            this.a.setItemAnimator(this.x);
            ywVar.run();
        } else {
            if (this.H) {
                return;
            }
            this.H = true;
            if (!this.x.k()) {
                this.a.setItemAnimator(null);
            }
            AndroidUtilities.runOnUIThread(ywVar, 36L);
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f7) {
        vy vyVar;
        if (getTranslationX() != f7) {
            super.setTranslationX(f7);
            wy wyVar = this.K;
            if (wyVar.g3 && (vyVar = wyVar.e0[0]) == this) {
                wyVar.z0.g(Math.abs(vyVar.getTranslationX()) / wyVar.e0[0].getMeasuredWidth(), wyVar.e0[1].h);
            }
            wyVar.m3();
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
