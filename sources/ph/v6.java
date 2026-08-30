package ph;

import android.view.View;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final /* synthetic */ class v6 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ d7 b;

    public /* synthetic */ v6(d7 d7Var, int i10) {
        this.a = i10;
        this.b = d7Var;
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
