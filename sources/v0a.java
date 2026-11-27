// default package

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class v0a extends cl8 {
    public final /* synthetic */ w0a N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0a(w0a w0aVar, Context context) {
        super(2, null, context);
        this.N = w0aVar;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        w0a w0aVar = this.N;
        if (w0aVar.getParent() instanceof View) {
            ((View) w0aVar.getParent()).invalidate();
        }
    }
}
