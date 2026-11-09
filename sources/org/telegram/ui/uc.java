package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class uc implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ bd b;

    public /* synthetic */ uc(bd bdVar, int i7) {
        this.a = i7;
        this.b = bdVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                bd.c0(this.b, view);
                break;
            case 1:
                bd bdVar = this.b;
                bdVar.x.n(bdVar.D != null, new sc(bdVar, 2), new q5(bdVar, 2), 0);
                bdVar.K.M(0);
                bdVar.K.P(43);
                bdVar.n.d();
                break;
            case 2:
                bd bdVar2 = this.b;
                if (!bdVar2.k0) {
                    bdVar2.l0();
                    break;
                } else if (bdVar2.b0) {
                    bdVar2.b0 = false;
                    bdVar2.n0();
                    break;
                }
                break;
            default:
                bd bdVar3 = this.b;
                if (!bdVar3.b0) {
                    bdVar3.b0 = true;
                    bdVar3.n0();
                    break;
                }
                break;
        }
    }
}
