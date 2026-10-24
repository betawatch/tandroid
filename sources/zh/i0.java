package zh;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.if0;
import org.telegram.ui.n9;
import org.telegram.ui.v9;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final class i0 implements v9 {
    public final /* synthetic */ int a;
    public final /* synthetic */ o2 b;

    public i0(int i10, o2 o2Var) {
        this.a = i10;
        this.b = o2Var;
    }

    @Override // org.telegram.ui.v9
    public final void E(String str) {
        String b10 = pf.d.b(str);
        if (TextUtils.isEmpty(b10)) {
            AndroidUtilities.runOnUIThread(new if0(25));
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
