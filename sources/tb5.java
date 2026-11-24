// default package

import android.content.Context;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class tb5 extends lka {
    public float N0;
    public final /* synthetic */ int O0;
    public final /* synthetic */ wb5 P0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tb5(wb5 wb5Var, Context context, int i) {
        super(context);
        this.P0 = wb5Var;
        this.O0 = i;
    }

    @Override // android.view.View
    public final float getAlpha() {
        return this.N0;
    }

    @Override // android.view.View
    public final void setAlpha(float f) {
        this.N0 = f;
        wb5 wb5Var = this.P0;
        lka[] lkaVarArr = wb5Var.d;
        if (this.O0 != 4) {
            super.setAlpha((1.0f - lkaVarArr[4].getFullAlpha()) * f);
            return;
        }
        float fullAlpha = lkaVarArr[4].getFullAlpha();
        if (wb5Var.c()) {
            float f2 = wb5Var.f0;
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

    @Override // lka
    public final void setFullAlpha(float f) {
        super.setFullAlpha(f);
        int i = 0;
        while (true) {
            lka[] lkaVarArr = this.P0.d;
            if (i >= lkaVarArr.length) {
                return;
            }
            lka lkaVar = lkaVarArr[i];
            lkaVar.setAlpha(lkaVar.getAlpha());
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
