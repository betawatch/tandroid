package yh;

import android.view.View;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ m b;

    public /* synthetic */ g(m mVar, int i10) {
        this.a = i10;
        this.b = mVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.dismiss();
                break;
            case 1:
                m.Q(this.b);
                break;
            default:
                m mVar = this.b;
                mVar.c0.setValueAnimated((int) mVar.l0.getMinimumBid());
                break;
        }
    }
}
