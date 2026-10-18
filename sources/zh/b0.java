package zh;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.ff0;
import org.telegram.ui.n9;
import org.telegram.ui.x9;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final class b0 implements x9 {
    public final /* synthetic */ int a;
    public final /* synthetic */ n2 b;

    public b0(int i10, n2 n2Var) {
        this.a = i10;
        this.b = n2Var;
    }

    @Override // org.telegram.ui.x9
    public final void E(String str) {
        String b10 = pf.d.b(str);
        if (TextUtils.isEmpty(b10)) {
            AndroidUtilities.runOnUIThread(new ff0(24));
            return;
        }
        MessagesController.getInstance(this.a).getUserNameResolver().resolve(b10, new g(this.b, 2));
    }

    @Override // org.telegram.ui.x9
    public final /* synthetic */ boolean U0(String str, n9 n9Var) {
        return false;
    }

    @Override // org.telegram.ui.x9
    public final /* synthetic */ String p0() {
        return null;
    }

    @Override // org.telegram.ui.x9
    public final /* synthetic */ void F0(MrzRecognizer.Result result) {
    }

    @Override // org.telegram.ui.x9
    public final /* synthetic */ void onDismiss() {
    }
}
