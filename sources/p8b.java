// default package

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class p8b extends hb6 {
    public final /* synthetic */ q8b R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p8b(q8b q8bVar, Context context, float f) {
        super(context, f);
        this.R = q8bVar;
    }

    @Override // android.view.View
    public final void invalidate() {
        View view = this.R.c;
        if (view != null) {
            view.invalidate();
        }
    }
}
