package ph;

import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.z20;
import org.telegram.ui.Components.cc;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class g implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ m b;

    public /* synthetic */ g(m mVar, int i10) {
        this.a = i10;
        this.b = mVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.a;
        m mVar = this.b;
        switch (i10) {
            case 0:
                mVar.dismiss();
                break;
            case 1:
                int value = mVar.U1.getValue();
                int e = (int) mVar.d2.e();
                if (value >= e) {
                    mVar.g1(value);
                    break;
                } else {
                    org.telegram.messenger.i0.E3(mVar.S1);
                    z20.s(cd.G(e, "Gift2AuctionMinimumBidIncreased", new Object[0]), new cc(mVar.c, mVar.I0), R.raw.info, 36);
                    break;
                }
            default:
                mVar.U1.setValueAnimated((int) mVar.d2.e());
                break;
        }
    }
}
