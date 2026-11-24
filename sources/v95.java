// default package

import android.content.Context;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class v95 extends jia {
    public float N0;
    public final /* synthetic */ int O0;
    public final /* synthetic */ y95 P0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v95(y95 y95Var, Context context, int i) {
        super(context);
        this.P0 = y95Var;
        this.O0 = i;
    }

    @Override // android.view.View
    public final float getAlpha() {
        return this.N0;
    }

    @Override // android.view.View
    public final void setAlpha(float f) {
        this.N0 = f;
        y95 y95Var = this.P0;
        jia[] jiaVarArr = y95Var.d;
        if (this.O0 != 4) {
            super.setAlpha((1.0f - jiaVarArr[4].getFullAlpha()) * f);
            return;
        }
        float fullAlpha = jiaVarArr[4].getFullAlpha();
        if (y95Var.c()) {
            float f2 = y95Var.f0;
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

    @Override // jia
    public final void setFullAlpha(float f) {
        super.setFullAlpha(f);
        int i = 0;
        while (true) {
            jia[] jiaVarArr = this.P0.d;
            if (i >= jiaVarArr.length) {
                return;
            }
            jia jiaVar = jiaVarArr[i];
            jiaVar.setAlpha(jiaVar.getAlpha());
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
