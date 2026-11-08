package zh;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.ea;
import bi.v9;
import c8.ha;
import c8.qa;
import org.telegram.messenger.id;
import org.telegram.messenger.u10;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class c2 extends org.telegram.ui.ActionBar.v2 {
    public long i1;

    public c2(Context context, long j3, TL_stars.SavedStarGift savedStarGift, f6 f6Var, u10 u10Var) {
        super(1, context, f6Var, false);
        this.i1 = 0L;
        N();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        TextView b10 = qa.b(context, 20.0f, k6.G6, true, f6Var);
        b10.setText(id.M0(2131749882, null));
        linearLayout.addView(b10, ha.k(22.0f, 12.0f, 22.0f, 0.0f, -1, -2));
        TextView b11 = qa.b(context, 14.0f, k6.y6, false, f6Var);
        b11.setText(id.M0(2131749883, null));
        linearLayout.addView(b11, ha.k(22.0f, 4.33f, 22.0f, 10.0f, -1, -2));
        fi.d dVar = new fi.d(context, f6Var, true);
        v9 G = ea.y(this.a, false).G(j3, true);
        b2 b2Var = new b2(context, this.a, 0, false, new org.telegram.ui.Wallet.u1(6, this, G), new org.telegram.ui.web.a0(29, this, dVar), null, f6Var);
        b2Var.setSpanCount(3);
        b2Var.setOverScrollMode(2);
        b2Var.setScrollEnabled(false);
        linearLayout.addView(b2Var, ha.k(11.0f, 0.0f, 11.0f, 0.0f, -1, -2));
        dVar.i(id.M0(2131749884, null), false, true);
        linearLayout.addView(dVar, ha.k(22.0f, 9.0f, 22.0f, 9.0f, -1, 48));
        dVar.setEnabled(false);
        dVar.setOnClickListener(new di.u3(this, G, savedStarGift, u10Var, 16));
        this.N = linearLayout;
    }
}
