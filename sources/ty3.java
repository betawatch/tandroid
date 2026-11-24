// default package

import android.content.Context;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class ty3 extends h14 {
    public final /* synthetic */ t14 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ty3(t14 t14Var, Context context) {
        super(t14Var, context, 1);
        this.I = t14Var;
    }

    @Override // android.view.View
    public final void setTranslationY(float f) {
        if (f != getTranslationY()) {
            super.setTranslationY(f);
            this.I.K.invalidate();
        }
    }
}
