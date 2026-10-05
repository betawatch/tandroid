package zg;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.d6;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class l extends b0 {
    public final /* synthetic */ o h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(o oVar, Context context, d6 d6Var, int i10) {
        super(context, i10, d6Var);
        this.h = oVar;
    }

    @Override // org.telegram.ui.Components.eu
    public final void onLineCountChanged(int i10, int i11) {
        if (i11 > i10) {
            this.h.E.w0(0, AndroidUtilities.dp(30.0f), null);
        }
    }

    @Override // org.telegram.ui.Components.eu, android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i10) {
        if (i10 == R.id.menu_delete || i10 == 16908320) {
            return this.h.b0();
        }
        if (i10 == 16908322 || i10 == 16908321) {
            return false;
        }
        return super.onTextContextMenuItem(i10);
    }
}
