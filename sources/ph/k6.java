package ph;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class k6 implements TextWatcher {
    public final /* synthetic */ m6 a;

    public k6(m6 m6Var) {
        this.a = m6Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int i10;
        String obj = editable.toString();
        m6 m6Var = this.a;
        m6Var.p0 = obj;
        if (!m6Var.W) {
            String str = m6Var.u0;
            if (obj == null) {
                obj = "";
            }
            boolean equals = TextUtils.equals(str, obj);
            boolean z4 = false;
            if (!equals) {
                m6Var.Z();
                String str2 = m6Var.p0;
                m6Var.t0 = str2 != null && str2.length() > 0;
            }
            String str3 = m6Var.F0;
            String str4 = m6Var.p0;
            if (!TextUtils.equals(str3, str4 != null ? str4 : "")) {
                m6Var.Y();
                String str5 = m6Var.p0;
                if (str5 != null && str5.length() > 3) {
                    i10 = ((org.telegram.ui.ActionBar.g3) m6Var).currentAccount;
                    if (!TextUtils.isEmpty(MessagesController.getInstance(i10).config.musicSearchUsername.get())) {
                        z4 = true;
                    }
                }
                m6Var.A0 = z4;
            }
            g6 g6Var = m6Var.w0;
            AndroidUtilities.cancelRunOnUIThread(g6Var);
            AndroidUtilities.runOnUIThread(g6Var, 400L);
            g6 g6Var2 = m6Var.H0;
            AndroidUtilities.cancelRunOnUIThread(g6Var2);
            AndroidUtilities.runOnUIThread(g6Var2, 400L);
        }
        m6Var.n0.N(true);
    }

    @Override // android.text.TextWatcher
    public final /* synthetic */ void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final /* synthetic */ void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
