package ph;

import android.view.View;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final /* synthetic */ class u6 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ c7 b;

    public /* synthetic */ u6(c7 c7Var, int i10) {
        this.a = i10;
        this.b = c7Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.U();
                break;
            default:
                this.b.X();
                break;
        }
    }
}
