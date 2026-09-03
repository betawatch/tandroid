package qh;

import android.view.View;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class s6 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ a7 b;

    public /* synthetic */ s6(a7 a7Var, int i10) {
        this.a = i10;
        this.b = a7Var;
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
