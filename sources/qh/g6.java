package qh;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class g6 implements TextWatcher {
    public final /* synthetic */ i6 a;

    public g6(i6 i6Var) {
        this.a = i6Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int i10;
        String obj = editable.toString();
        i6 i6Var = this.a;
        i6Var.p0 = obj;
        if (!i6Var.W) {
            String str = i6Var.u0;
            if (obj == null) {
                obj = "";
            }
            boolean equals = TextUtils.equals(str, obj);
            boolean z4 = false;
            if (!equals) {
                i6Var.Z();
                String str2 = i6Var.p0;
                i6Var.t0 = str2 != null && str2.length() > 0;
            }
            String str3 = i6Var.F0;
            String str4 = i6Var.p0;
            if (!TextUtils.equals(str3, str4 != null ? str4 : "")) {
                i6Var.Y();
                String str5 = i6Var.p0;
                if (str5 != null && str5.length() > 3) {
                    i10 = ((org.telegram.ui.ActionBar.h3) i6Var).currentAccount;
                    if (!TextUtils.isEmpty(MessagesController.getInstance(i10).config.musicSearchUsername.get())) {
                        z4 = true;
                    }
                }
                i6Var.A0 = z4;
            }
            c6 c6Var = i6Var.w0;
            AndroidUtilities.cancelRunOnUIThread(c6Var);
            AndroidUtilities.runOnUIThread(c6Var, 400L);
            c6 c6Var2 = i6Var.H0;
            AndroidUtilities.cancelRunOnUIThread(c6Var2);
            AndroidUtilities.runOnUIThread(c6Var2, 400L);
        }
        i6Var.n0.N(true);
    }

    @Override // android.text.TextWatcher
    public final /* synthetic */ void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final /* synthetic */ void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
