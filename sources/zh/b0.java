package zh;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.mj0;
import org.telegram.ui.n9;
import org.telegram.ui.x9;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
            AndroidUtilities.runOnUIThread(new mj0(24));
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
