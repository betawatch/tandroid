package zh;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.zc0;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes4.dex */
public final class w6 implements TextWatcher {
    public boolean a;
    public int b = 2;
    public final /* synthetic */ EditTextBoldCursor c;
    public final /* synthetic */ zc0 d;
    public final /* synthetic */ long e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ di.d h;
    public final /* synthetic */ TextView n;

    public w6(EditTextBoldCursor editTextBoldCursor, zc0 zc0Var, long j3, boolean z10, di.d dVar, TextView textView) {
        this.c = editTextBoldCursor;
        this.d = zc0Var;
        this.e = j3;
        this.f = z10;
        this.h = dVar;
        this.n = textView;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a8  */
    @Override // android.text.TextWatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void afterTextChanged(Editable editable) {
        long j3;
        zc0 zc0Var = this.d;
        EditTextBoldCursor editTextBoldCursor = this.c;
        if (this.a) {
            return;
        }
        try {
            j3 = TextUtils.isEmpty(editable) ? 0L : Long.parseLong(editable.toString());
        } catch (Exception unused) {
            j3 = 0;
        }
        try {
            if (j3 > MessagesController.getInstance(UserConfig.selectedAccount).starsPaidPostAmountMax) {
                this.a = true;
                j3 = MessagesController.getInstance(UserConfig.selectedAccount).starsPaidPostAmountMax;
                editTextBoldCursor.setText(Long.toString(j3));
                editTextBoldCursor.setSelection(editTextBoldCursor.getText().length());
                int i10 = -this.b;
                this.b = i10;
                AndroidUtilities.shakeViewSpring(zc0Var, i10);
            }
        } catch (Exception unused2) {
            this.a = true;
            long j10 = this.e;
            editTextBoldCursor.setText(j10 <= 0 ? "" : Long.toString(j10));
            editTextBoldCursor.setSelection(editTextBoldCursor.getText().length());
            this.a = false;
            if (!this.f) {
            }
            zc0Var.c(editTextBoldCursor.isFocused(), !TextUtils.isEmpty(editTextBoldCursor.getText()));
            TextView textView = this.n;
            if (j3 != 0) {
            }
        }
        this.a = false;
        if (!this.f) {
            this.h.setEnabled(j3 > 0);
        }
        zc0Var.c(editTextBoldCursor.isFocused(), !TextUtils.isEmpty(editTextBoldCursor.getText()));
        TextView textView2 = this.n;
        if (j3 != 0) {
            textView2.animate().alpha(0.0f).start();
            textView2.setText("");
        } else {
            textView2.animate().alpha(1.0f).start();
            textView2.setText("≈" + BillingController.getInstance().formatCurrency((long) ((j3 / 1000.0d) * MessagesController.getInstance(UserConfig.selectedAccount).starsUsdWithdrawRate1000), "USD"));
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
