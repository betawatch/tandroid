package uh;

import android.content.Context;
import android.view.TextureView;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
