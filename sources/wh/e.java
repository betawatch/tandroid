package wh;

import android.content.Context;
import android.view.TextureView;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
