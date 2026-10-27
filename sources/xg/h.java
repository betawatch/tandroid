package xg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Date;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.kb1;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class h extends FrameLayout {
    public final b6 a;
    public long b;

    public h(Context context, u6 u6Var) {
        super(context);
        b6 b6Var = new b6(context);
        b6Var.setTextSize(16);
        f7.Y(b6Var, y6.j5, u6Var);
        b6Var.setGravity(LocaleController.isRTL ? 5 : 3);
        addView(b6Var);
        b6 b6Var2 = new b6(context);
        this.a = b6Var2;
        b6Var2.setTextSize(16);
        f7.Y(b6Var2, y6.L6, u6Var);
        b6Var2.setGravity(LocaleController.isRTL ? 3 : 5);
        addView(b6Var2);
        b6Var.l(LocaleController.formatString("BoostingDateAndTime", R.string.BoostingDateAndTime, new Object[0]), false);
        boolean z10 = LocaleController.isRTL;
        b6Var.setLayoutParams(kb1.h(-1, -2.0f, (z10 ? 5 : 3) | 16, z10 ? 0.0f : 21.0f, 0.0f, z10 ? 21.0f : 0.0f, 0.0f));
        boolean z11 = LocaleController.isRTL;
        b6Var2.setLayoutParams(kb1.h(-1, -2.0f, (z11 ? 3 : 5) | 16, z11 ? 21.0f : 0.0f, 0.0f, z11 ? 0.0f : 21.0f, 0.0f));
        f7.i(y6.h5, this, u6Var);
    }

    public long getSelectedTime() {
        return this.b;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), TLObject.FLAG_30));
    }

    public void setDate(long j10) {
        this.b = j10;
        Date date = new Date(j10);
        this.a.l(LocaleController.formatString("formatDateAtTime", R.string.formatDateAtTime, LocaleController.getInstance().getFormatterDayMonth().format(date), LocaleController.getInstance().getFormatterDay().format(date)), false);
    }
}
