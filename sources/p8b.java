// default package

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
