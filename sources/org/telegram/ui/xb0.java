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

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class xb0 extends org.telegram.ui.Cells.k3 {
    public boolean x;
    public final /* synthetic */ zb0 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xb0(zb0 zb0Var, Context context, String str, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, str, false, false, -1, f6Var);
        this.y = zb0Var;
    }

    @Override // org.telegram.ui.Cells.k3
    public final void b(Editable editable) {
        int i10;
        if (this.x) {
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(editable);
        zb0 zb0Var = this.y;
        if (isEmpty) {
            zb0Var.s.setText("");
            return;
        }
        try {
            long parseLong = Long.parseLong(editable.toString());
            if (parseLong > zb0Var.getMessagesController().starsSubscriptionAmountMax) {
                this.x = true;
                parseLong = zb0Var.getMessagesController().starsSubscriptionAmountMax;
                setText(Long.toString(parseLong));
                this.x = false;
            }
            TextView textView = zb0Var.s;
            int i11 = zb0Var.getConnectionsManager().isTestBackend() ? R.string.RequireMonthlyFeePriceTest5Minutes : R.string.RequireMonthlyFeePrice;
            BillingController billingController = BillingController.getInstance();
            i10 = ((org.telegram.ui.ActionBar.n2) zb0Var).currentAccount;
            textView.setText(LocaleController.formatString(i11, billingController.formatCurrency((long) ((parseLong / 1000.0d) * MessagesController.getInstance(i10).starsUsdWithdrawRate1000), "USD")));
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
