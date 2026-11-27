// default package

import android.content.Context;
import org.telegram.ui.Components.ClippingImageView;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class sga extends ClippingImageView {
    public final /* synthetic */ jga S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sga(Context context, jga jgaVar) {
        super(context);
        this.S = jgaVar;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        this.S.invalidate();
    }
}
