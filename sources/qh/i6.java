package qh;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class i6 implements TextWatcher {
    public final /* synthetic */ k6 a;

    public i6(k6 k6Var) {
        this.a = k6Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int i10;
        String obj = editable.toString();
        k6 k6Var = this.a;
        k6Var.p0 = obj;
        if (!k6Var.W) {
            String str = k6Var.u0;
            if (obj == null) {
                obj = "";
            }
            boolean equals = TextUtils.equals(str, obj);
            boolean z4 = false;
            if (!equals) {
                k6Var.Z();
                String str2 = k6Var.p0;
                k6Var.t0 = str2 != null && str2.length() > 0;
            }
            String str3 = k6Var.F0;
            String str4 = k6Var.p0;
            if (!TextUtils.equals(str3, str4 != null ? str4 : "")) {
                k6Var.Y();
                String str5 = k6Var.p0;
                if (str5 != null && str5.length() > 3) {
                    i10 = ((org.telegram.ui.ActionBar.h3) k6Var).currentAccount;
                    if (!TextUtils.isEmpty(MessagesController.getInstance(i10).config.musicSearchUsername.get())) {
                        z4 = true;
                    }
                }
                k6Var.A0 = z4;
            }
            e6 e6Var = k6Var.w0;
            AndroidUtilities.cancelRunOnUIThread(e6Var);
            AndroidUtilities.runOnUIThread(e6Var, 400L);
            e6 e6Var2 = k6Var.H0;
            AndroidUtilities.cancelRunOnUIThread(e6Var2);
            AndroidUtilities.runOnUIThread(e6Var2, 400L);
        }
        k6Var.n0.N(true);
    }

    @Override // android.text.TextWatcher
    public final /* synthetic */ void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final /* synthetic */ void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
