package zg;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.d6;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class o extends d0 {
    public final /* synthetic */ q h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(q qVar, Context context, d6 d6Var, int i10) {
        super(context, i10, d6Var);
        this.h = qVar;
    }

    @Override // org.telegram.ui.Components.du
    public final void onLineCountChanged(int i10, int i11) {
        if (i11 > i10) {
            this.h.y.smoothScrollBy(0, AndroidUtilities.dp(30.0f));
        }
    }

    @Override // org.telegram.ui.Components.du, android.widget.EditText, android.widget.TextView
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
