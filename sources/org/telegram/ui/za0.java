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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class za0 extends org.telegram.ui.Cells.j3 {
    public boolean x;
    public final /* synthetic */ bb0 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public za0(bb0 bb0Var, Context context, String str, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, str, false, false, -1, b6Var);
        this.y = bb0Var;
    }

    @Override // org.telegram.ui.Cells.j3
    public final void b(Editable editable) {
        int i9;
        if (this.x) {
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(editable);
        bb0 bb0Var = this.y;
        if (isEmpty) {
            bb0Var.s.setText("");
            return;
        }
        try {
            long parseLong = Long.parseLong(editable.toString());
            if (parseLong > bb0Var.getMessagesController().starsSubscriptionAmountMax) {
                this.x = true;
                parseLong = bb0Var.getMessagesController().starsSubscriptionAmountMax;
                setText(Long.toString(parseLong));
                this.x = false;
            }
            TextView textView = bb0Var.s;
            int i10 = bb0Var.getConnectionsManager().isTestBackend() ? R.string.RequireMonthlyFeePriceTest5Minutes : R.string.RequireMonthlyFeePrice;
            BillingController billingController = BillingController.getInstance();
            i9 = ((org.telegram.ui.ActionBar.o2) bb0Var).currentAccount;
            textView.setText(LocaleController.formatString(i10, billingController.formatCurrency((long) ((parseLong / 1000.0d) * MessagesController.getInstance(i9).starsUsdWithdrawRate1000), "USD")));
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }
}
