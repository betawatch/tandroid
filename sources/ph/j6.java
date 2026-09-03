package ph;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class j6 implements TextWatcher {
    public final /* synthetic */ l6 a;

    public j6(l6 l6Var) {
        this.a = l6Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int i10;
        String obj = editable.toString();
        l6 l6Var = this.a;
        l6Var.p0 = obj;
        if (!l6Var.W) {
            String str = l6Var.u0;
            if (obj == null) {
                obj = "";
            }
            boolean equals = TextUtils.equals(str, obj);
            boolean z4 = false;
            if (!equals) {
                l6Var.Z();
                String str2 = l6Var.p0;
                l6Var.t0 = str2 != null && str2.length() > 0;
            }
            String str3 = l6Var.F0;
            String str4 = l6Var.p0;
            if (!TextUtils.equals(str3, str4 != null ? str4 : "")) {
                l6Var.Y();
                String str5 = l6Var.p0;
                if (str5 != null && str5.length() > 3) {
                    i10 = ((org.telegram.ui.ActionBar.g3) l6Var).currentAccount;
                    if (!TextUtils.isEmpty(MessagesController.getInstance(i10).config.musicSearchUsername.get())) {
                        z4 = true;
                    }
                }
                l6Var.A0 = z4;
            }
            f6 f6Var = l6Var.w0;
            AndroidUtilities.cancelRunOnUIThread(f6Var);
            AndroidUtilities.runOnUIThread(f6Var, 400L);
            f6 f6Var2 = l6Var.H0;
            AndroidUtilities.cancelRunOnUIThread(f6Var2);
            AndroidUtilities.runOnUIThread(f6Var2, 400L);
        }
        l6Var.n0.N(true);
    }

    @Override // android.text.TextWatcher
    public final /* synthetic */ void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final /* synthetic */ void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
