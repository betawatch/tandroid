package zh;

import android.content.Context;
import android.widget.FrameLayout;
import c8.ha;
import java.util.List;
import org.telegram.messenger.id;
import org.telegram.messenger.s9;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.g7;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.na;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.qj0;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class d extends na {
    public static final /* synthetic */ int S1 = 0;
    public final List P1;
    public final s9 Q1;
    public m41 R1;

    public d(Context context, g6 g6Var, s9 s9Var, List list) {
        super(context, null, false, false, 2, g6Var);
        this.Q1 = s9Var;
        this.P1 = list;
        this.r1 = 0.2f;
        this.C1 = false;
        this.B1 = org.telegram.messenger.g0.L(12.0f);
        this.l1.setTitle(O0());
        N();
        this.k1.setPadding(this.t0, org.telegram.messenger.g0.L(9.0f), this.t0, org.telegram.messenger.g0.L(64.0f));
        this.k1.setOnItemClickListener(new g7(3));
        this.k1.setOverScrollMode(2);
        fi.d dVar = new fi.d(context, g6Var, true);
        dVar.setOnClickListener(new a(this, 0));
        dVar.i(id.M0(2131747831, null), false, true);
        FrameLayout.LayoutParams d = ha.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f);
        int i7 = d.leftMargin;
        int i10 = this.t0;
        d.leftMargin = i7 + i10;
        d.rightMargin += i10;
        this.b.addView(dVar, d);
        this.R1.O(false);
    }

    @Override // org.telegram.ui.Components.na
    public final pj0 L0(qj0 qj0Var) {
        m41 m41Var = new m41(this.k1, getContext(), this.a, 0, true, new hi.u1(this, 25), this.I0);
        this.R1 = m41Var;
        m41Var.r = false;
        return m41Var;
    }

    @Override // org.telegram.ui.Components.na
    public final CharSequence O0() {
        List list = this.P1;
        if (list == null) {
            return null;
        }
        return id.G(list.size(), "Gift2AuctionsAcquiredGifts", new Object[0]);
    }
}
