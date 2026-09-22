package vg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Date;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.j5;
import w7.x5;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class h extends FrameLayout {
    public final j5 a;
    public long b;

    public h(Context context, e6 e6Var) {
        super(context);
        j5 j5Var = new j5(context);
        j5Var.setTextSize(16);
        j5Var.setTextColor(i6.v0(i6.j5, e6Var));
        j5Var.setGravity(LocaleController.isRTL ? 5 : 3);
        addView(j5Var);
        j5 j5Var2 = new j5(context);
        this.a = j5Var2;
        j5Var2.setTextSize(16);
        j5Var2.setTextColor(i6.v0(i6.L6, e6Var));
        j5Var2.setGravity(LocaleController.isRTL ? 3 : 5);
        addView(j5Var2);
        j5Var.l(LocaleController.formatString("BoostingDateAndTime", R.string.BoostingDateAndTime, new Object[0]), false);
        boolean z10 = LocaleController.isRTL;
        j5Var.setLayoutParams(x5.d(-1, -2.0f, (z10 ? 5 : 3) | 16, z10 ? 0.0f : 21.0f, 0.0f, z10 ? 21.0f : 0.0f, 0.0f));
        boolean z11 = LocaleController.isRTL;
        j5Var2.setLayoutParams(x5.d(-1, -2.0f, (z11 ? 3 : 5) | 16, z11 ? 21.0f : 0.0f, 0.0f, z11 ? 0.0f : 21.0f, 0.0f));
        setBackgroundColor(i6.v0(i6.h5, e6Var));
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
