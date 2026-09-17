package wh;

import android.content.Context;
import android.view.TextureView;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
