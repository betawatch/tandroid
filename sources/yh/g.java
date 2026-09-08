package yh;

import android.view.View;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
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
