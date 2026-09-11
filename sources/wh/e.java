package wh;

import android.content.Context;
import android.view.TextureView;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
