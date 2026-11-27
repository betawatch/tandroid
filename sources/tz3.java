// default package

import android.content.Context;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class tz3 extends c24 {
    public final /* synthetic */ o24 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tz3(o24 o24Var, Context context) {
        super(o24Var, context, 2);
        this.I = o24Var;
    }

    @Override // android.view.View
    public final void setTranslationY(float f) {
        if (getTranslationY() != f) {
            super.setTranslationY(f);
            this.I.h0.invalidate();
        }
    }
}
