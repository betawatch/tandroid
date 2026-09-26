package zg;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.d6;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class o extends d0 {
    public final /* synthetic */ q h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(q qVar, Context context, d6 d6Var, int i10) {
        super(context, i10, d6Var);
        this.h = qVar;
    }

    @Override // org.telegram.ui.Components.cu
    public final void onLineCountChanged(int i10, int i11) {
        if (i11 > i10) {
            this.h.y.smoothScrollBy(0, AndroidUtilities.dp(30.0f));
        }
    }

    @Override // org.telegram.ui.Components.cu, android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i10) {
        if (i10 == R.id.menu_delete || i10 == 16908320) {
            return this.h.a0();
        }
        if (i10 == 16908322 || i10 == 16908321) {
            return false;
        }
        return super.onTextContextMenuItem(i10);
    }
}
