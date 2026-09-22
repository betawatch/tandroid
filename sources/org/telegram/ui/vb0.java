package org.telegram.ui;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class vb0 extends org.telegram.ui.Cells.i3 {
    public boolean x;
    public final /* synthetic */ xb0 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vb0(xb0 xb0Var, Context context, String str, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, str, false, false, -1, e6Var);
        this.y = xb0Var;
    }

    @Override // org.telegram.ui.Cells.i3
    public final void b(Editable editable) {
        int i10;
        if (this.x) {
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(editable);
        xb0 xb0Var = this.y;
        if (isEmpty) {
            xb0Var.s.setText("");
            return;
        }
        try {
            long parseLong = Long.parseLong(editable.toString());
            if (parseLong > xb0Var.getMessagesController().starsSubscriptionAmountMax) {
                this.x = true;
                parseLong = xb0Var.getMessagesController().starsSubscriptionAmountMax;
                setText(Long.toString(parseLong));
                this.x = false;
            }
            TextView textView = xb0Var.s;
            int i11 = xb0Var.getConnectionsManager().isTestBackend() ? R.string.RequireMonthlyFeePriceTest5Minutes : R.string.RequireMonthlyFeePrice;
            BillingController billingController = BillingController.getInstance();
            i10 = ((org.telegram.ui.ActionBar.n2) xb0Var).currentAccount;
            textView.setText(LocaleController.formatString(i11, billingController.formatCurrency((long) ((parseLong / 1000.0d) * MessagesController.getInstance(i10).starsUsdWithdrawRate1000), "USD")));
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
