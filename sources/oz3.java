// default package

import android.content.Context;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
