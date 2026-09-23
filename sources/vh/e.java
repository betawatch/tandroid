package vh;

import android.content.Context;
import android.view.TextureView;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class e extends TextureView {
    public final /* synthetic */ g a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, Context context) {
        super(context);
        this.a = gVar;
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        g gVar = this.a;
        setMeasuredDimension(gVar.g, gVar.h);
    }
}
