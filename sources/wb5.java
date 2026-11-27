// default package

import android.content.Context;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class wb5 extends ema {
    public float N0;
    public final /* synthetic */ int O0;
    public final /* synthetic */ zb5 P0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wb5(zb5 zb5Var, Context context, int i) {
        super(context);
        this.P0 = zb5Var;
        this.O0 = i;
    }

    @Override // android.view.View
    public final float getAlpha() {
        return this.N0;
    }

    @Override // android.view.View
    public final void setAlpha(float f) {
        this.N0 = f;
        zb5 zb5Var = this.P0;
        ema[] emaVarArr = zb5Var.d;
        if (this.O0 != 4) {
            super.setAlpha((1.0f - emaVarArr[4].getFullAlpha()) * f);
            return;
        }
        float fullAlpha = emaVarArr[4].getFullAlpha();
        if (zb5Var.c()) {
            float f2 = zb5Var.f0;
            if (f2 > 0.0f) {
                super.setAlpha(1.0f - f2);
                return;
            }
        }
        if (fullAlpha > 0.0f) {
            super.setAlpha(Math.max(f, fullAlpha));
        } else {
            super.setAlpha(f);
        }
    }

    @Override // ema
    public final void setFullAlpha(float f) {
        super.setFullAlpha(f);
        int i = 0;
        while (true) {
            ema[] emaVarArr = this.P0.d;
            if (i >= emaVarArr.length) {
                return;
            }
            ema emaVar = emaVarArr[i];
            emaVar.setAlpha(emaVar.getAlpha());
            i++;
        }
    }

    @Override // android.view.View
    public final void setTranslationY(float f) {
        if (this.O0 == 4 && getFullAlpha() > 0.0f) {
            f = 0.0f;
        }
        super.setTranslationY(f);
    }
}
