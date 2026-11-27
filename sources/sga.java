// default package

import android.content.Context;
import org.telegram.ui.Components.ClippingImageView;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
