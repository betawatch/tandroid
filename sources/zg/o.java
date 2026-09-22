package zg;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.e6;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class o extends e0 {
    public final /* synthetic */ q h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(q qVar, Context context, e6 e6Var, int i10) {
        super(context, i10, e6Var);
        this.h = qVar;
    }

    @Override // org.telegram.ui.Components.bu
    public final void onLineCountChanged(int i10, int i11) {
        if (i11 > i10) {
            this.h.y.smoothScrollBy(0, AndroidUtilities.dp(30.0f));
        }
    }

    @Override // org.telegram.ui.Components.bu, android.widget.EditText, android.widget.TextView
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
