package wg;

import android.os.CountDownTimer;
import android.view.View;
import fi.u3;
import java.util.ArrayList;
import java.util.Date;
import org.telegram.messenger.gd;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.n5;
import org.telegram.ui.Components.ek0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class k0 extends CountDownTimer {
    public final /* synthetic */ p0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(p0 p0Var) {
        super(Long.MAX_VALUE, 1000L);
        this.a = p0Var;
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j3) {
        p0 p0Var = this.a;
        ek0 ek0Var = p0Var.o1;
        ArrayList arrayList = p0Var.U1;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
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
        for (int i10 = 0; i10 < ek0Var.getChildCount(); i10++) {
            View childAt = ek0Var.getChildAt(i10);
            if (childAt instanceof ah.r) {
                ah.r rVar = (ah.r) childAt;
                if (arrayList2.contains(rVar.getBoost())) {
                    n5 n5Var = rVar.e;
                    u3 u3Var = rVar.d;
                    int i11 = rVar.K.cooldown_until_date;
                    if (i11 > 0) {
                        rVar.setSubtitle(gd.a0(null, null, 2131753591, ah.r.f((i11 * 1000) - System.currentTimeMillis())));
                        u3Var.setAlpha(0.65f);
                        n5Var.setAlpha(0.65f);
                        rVar.i(false, 0.3f);
                    } else {
                        rVar.setSubtitle(gd.a0(null, null, 2131753658, gd.E0().o0().format(new Date(rVar.K.expires * 1000))));
                        if (u3Var.getAlpha() < 1.0f) {
                            u3Var.animate().alpha(1.0f).start();
                            n5Var.animate().alpha(1.0f).start();
                            rVar.i(true, 1.0f);
                        } else {
                            u3Var.setAlpha(1.0f);
                            n5Var.setAlpha(1.0f);
                            rVar.i(false, 1.0f);
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
