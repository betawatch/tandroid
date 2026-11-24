// default package

import android.os.CountDownTimer;
import android.view.View;
import java.util.ArrayList;
import java.util.Date;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class t39 extends CountDownTimer {
    public final /* synthetic */ y39 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t39(y39 y39Var) {
        super(Long.MAX_VALUE, 1000L);
        this.a = y39Var;
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
        y39 y39Var = this.a;
        r59 r59Var = y39Var.n1;
        ArrayList arrayList = y39Var.T1;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
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
        for (int i2 = 0; i2 < r59Var.getChildCount(); i2++) {
            View childAt = r59Var.getChildAt(i2);
            if (childAt instanceof m1a) {
                m1a m1aVar = (m1a) childAt;
                if (arrayList2.contains(m1aVar.getBoost())) {
                    lka lkaVar = m1aVar.e;
                    dg0 dg0Var = m1aVar.d;
                    int i3 = m1aVar.K.cooldown_until_date;
                    if (i3 > 0) {
                        m1aVar.setSubtitle(jb6.a0(null, null, 2131753559, m1a.f((i3 * 1000) - System.currentTimeMillis())));
                        dg0Var.setAlpha(0.65f);
                        lkaVar.setAlpha(0.65f);
                        m1aVar.i(false, 0.3f);
                    } else {
                        m1aVar.setSubtitle(jb6.a0(null, null, 2131753626, jb6.D0().n0().format(new Date(m1aVar.K.expires * 1000))));
                        if (dg0Var.getAlpha() < 1.0f) {
                            dg0Var.animate().alpha(1.0f).start();
                            lkaVar.animate().alpha(1.0f).start();
                            m1aVar.i(true, 1.0f);
                        } else {
                            dg0Var.setAlpha(1.0f);
                            lkaVar.setAlpha(1.0f);
                            m1aVar.i(false, 1.0f);
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
