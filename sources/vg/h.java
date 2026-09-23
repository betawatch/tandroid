package vg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Date;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.i5;
import w7.x5;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class h extends FrameLayout {
    public final i5 a;
    public long b;

    public h(Context context, d6 d6Var) {
        super(context);
        i5 i5Var = new i5(context);
        i5Var.setTextSize(16);
        i5Var.setTextColor(h6.v0(h6.j5, d6Var));
        i5Var.setGravity(LocaleController.isRTL ? 5 : 3);
        addView(i5Var);
        i5 i5Var2 = new i5(context);
        this.a = i5Var2;
        i5Var2.setTextSize(16);
        i5Var2.setTextColor(h6.v0(h6.L6, d6Var));
        i5Var2.setGravity(LocaleController.isRTL ? 3 : 5);
        addView(i5Var2);
        i5Var.l(LocaleController.formatString("BoostingDateAndTime", R.string.BoostingDateAndTime, new Object[0]), false);
        boolean z10 = LocaleController.isRTL;
        i5Var.setLayoutParams(x5.d(-1, -2.0f, (z10 ? 5 : 3) | 16, z10 ? 0.0f : 21.0f, 0.0f, z10 ? 21.0f : 0.0f, 0.0f));
        boolean z11 = LocaleController.isRTL;
        i5Var2.setLayoutParams(x5.d(-1, -2.0f, (z11 ? 3 : 5) | 16, z11 ? 21.0f : 0.0f, 0.0f, z11 ? 0.0f : 21.0f, 0.0f));
        setBackgroundColor(h6.v0(h6.h5, d6Var));
    }

    public long getSelectedTime() {
        return this.b;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), TLObject.FLAG_30));
    }

    public void setDate(long j3) {
        this.b = j3;
        Date date = new Date(j3);
        this.a.l(LocaleController.formatString("formatDateAtTime", R.string.formatDateAtTime, LocaleController.getInstance().getFormatterDayMonth().format(date), LocaleController.getInstance().getFormatterDay().format(date)), false);
    }
}
