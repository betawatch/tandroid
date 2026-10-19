package zh;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.df0;
import org.telegram.ui.n9;
import org.telegram.ui.v9;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final class h0 implements v9 {
    public final /* synthetic */ int a;
    public final /* synthetic */ n2 b;

    public h0(int i10, n2 n2Var) {
        this.a = i10;
        this.b = n2Var;
    }

    @Override // org.telegram.ui.v9
    public final void E(String str) {
        String b10 = pf.d.b(str);
        if (TextUtils.isEmpty(b10)) {
            AndroidUtilities.runOnUIThread(new df0(25));
            return;
        }
        MessagesController.getInstance(this.a).getUserNameResolver().resolve(b10, new g(this.b, 1));
    }

    @Override // org.telegram.ui.v9
    public final /* synthetic */ boolean U0(String str, n9 n9Var) {
        return false;
    }

    @Override // org.telegram.ui.v9
    public final /* synthetic */ String p0() {
        return null;
    }

    @Override // org.telegram.ui.v9
    public final /* synthetic */ void F0(MrzRecognizer.Result result) {
    }

    @Override // org.telegram.ui.v9
    public final /* synthetic */ void onDismiss() {
    }
}
