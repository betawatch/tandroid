package ug;

import android.os.CountDownTimer;
import android.view.View;
import bi.l5;
import java.util.ArrayList;
import java.util.Date;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.Components.mm0;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class l0 extends CountDownTimer {
    public final /* synthetic */ s0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(s0 s0Var) {
        super(Long.MAX_VALUE, 1000L);
        this.a = s0Var;
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j10) {
        s0 s0Var = this.a;
        mm0 mm0Var = s0Var.d;
        ArrayList arrayList = s0Var.Y;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            TL_stories.TL_myBoost tL_myBoost = (TL_stories.TL_myBoost) obj;
            if (tL_myBoost.cooldown_until_date > 0) {
                arrayList2.add(tL_myBoost);
            }
            if (tL_myBoost.cooldown_until_date * 1000 < System.currentTimeMillis()) {
                tL_myBoost.cooldown_until_date = 0;
            }
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        for (int i11 = 0; i11 < mm0Var.getChildCount(); i11++) {
            View childAt = mm0Var.getChildAt(i11);
            if (childAt instanceof yg.l) {
                yg.l lVar = (yg.l) childAt;
                if (arrayList2.contains(lVar.getBoost())) {
                    h5 h5Var = lVar.e;
                    l5 l5Var = lVar.d;
                    int i12 = lVar.J.cooldown_until_date;
                    if (i12 > 0) {
                        lVar.setSubtitle(LocaleController.formatString(R.string.BoostingAvailableIn, yg.l.f((i12 * 1000) - System.currentTimeMillis())));
                        l5Var.setAlpha(0.65f);
                        h5Var.setAlpha(0.65f);
                        lVar.i(0.3f, false);
                    } else {
                        lVar.setSubtitle(LocaleController.formatString(R.string.BoostExpireOn, LocaleController.getInstance().getFormatterBoostExpired().format(new Date(lVar.J.expires * 1000))));
                        if (l5Var.getAlpha() < 1.0f) {
                            l5Var.animate().alpha(1.0f).start();
                            h5Var.animate().alpha(1.0f).start();
                            lVar.i(1.0f, true);
                        } else {
                            l5Var.setAlpha(1.0f);
                            h5Var.setAlpha(1.0f);
                            lVar.i(1.0f, false);
                        }
                    }
                }
            }
        }
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
    }
}
