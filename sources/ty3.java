// default package

import android.content.Context;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
