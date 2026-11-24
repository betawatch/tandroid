// default package

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class sq8 extends fx0 {
    public long l1;

    public sq8(Context context, long j, TL_stars.SavedStarGift savedStarGift, wjb wjbVar, h8c h8cVar) {
        super(1, wjbVar, context, false);
        this.l1 = 0L;
        K();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        TextView b = hve.b(context, 20.0f, bkb.F6, true, wjbVar);
        b.setText(k96.M0(2131749865, null));
        linearLayout.addView(b, nme.k(22.0f, 12.0f, 22.0f, 0.0f, -1, -2));
        TextView b2 = hve.b(context, 14.0f, bkb.x6, false, wjbVar);
        b2.setText(k96.M0(2131749866, null));
        linearLayout.addView(b2, nme.k(22.0f, 4.33f, 22.0f, 10.0f, -1, -2));
        u41 u41Var = new u41(wjbVar, context, true);
        xsa D = gta.v(this.a, false).D(j, true);
        rq8 rq8Var = new rq8(context, this.a, 0, false, new w77(this, D, (byte) 8), new kq8(this, u41Var, (byte) 1), null, wjbVar);
        rq8Var.setSpanCount(3);
        rq8Var.setOverScrollMode(2);
        rq8Var.setScrollEnabled(false);
        linearLayout.addView(rq8Var, nme.k(11.0f, 0.0f, 11.0f, 0.0f, -1, -2));
        u41Var.i(k96.M0(2131749867, null), false, true);
        linearLayout.addView(u41Var, nme.k(22.0f, 9.0f, 22.0f, 9.0f, -1, 48));
        u41Var.setEnabled(false);
        u41Var.setOnClickListener(new ee((Object) this, (Object) D, (Object) savedStarGift, (Object) h8cVar, (byte) 14));
        this.O = linearLayout;
    }
}
