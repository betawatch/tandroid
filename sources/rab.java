// default package

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class rab extends gd6 {
    public final /* synthetic */ sab R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rab(sab sabVar, Context context, float f) {
        super(context, f);
        this.R = sabVar;
    }

    @Override // android.view.View
    public final void invalidate() {
        View view = this.R.c;
        if (view != null) {
            view.invalidate();
        }
    }
}
