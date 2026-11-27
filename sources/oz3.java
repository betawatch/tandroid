// default package

import android.content.Context;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class oz3 extends c24 {
    public final /* synthetic */ o24 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oz3(o24 o24Var, Context context) {
        super(o24Var, context, 1);
        this.I = o24Var;
    }

    @Override // android.view.View
    public final void setTranslationY(float f) {
        if (f != getTranslationY()) {
            super.setTranslationY(f);
            this.I.K.invalidate();
        }
    }
}
