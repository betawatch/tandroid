package yh;

import android.view.View;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ s3 b;
    public final /* synthetic */ int c;

    public /* synthetic */ d1(s3 s3Var, int i10, int i11) {
        this.a = i11;
        this.b = s3Var;
        this.c = i10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                s3 s3Var = this.b;
                int i10 = this.c;
                s3Var.S0 = i10;
                d2 d2Var = s3Var.Z;
                d2Var.D(d2Var.getCurrentPosition() + (i10 > s3Var.H1() ? 1 : -1));
                break;
            case 1:
                s3 s3Var2 = this.b;
                int i11 = this.c;
                s3Var2.S0 = i11;
                d2 d2Var2 = s3Var2.Z;
                d2Var2.D(d2Var2.getCurrentPosition() + (i11 > s3Var2.H1() ? 1 : -1));
                break;
            case 2:
                s3 s3Var3 = this.b;
                int i12 = this.c;
                s3Var3.S0 = i12;
                d2 d2Var3 = s3Var3.Z;
                d2Var3.D(d2Var3.getCurrentPosition() + (i12 > s3Var3.H1() ? 1 : -1));
                break;
            default:
                s3 s3Var4 = this.b;
                int i13 = this.c;
                s3Var4.S0 = i13;
                d2 d2Var4 = s3Var4.Z;
                d2Var4.D(d2Var4.getCurrentPosition() + (i13 > s3Var4.H1() ? 1 : -1));
                break;
        }
    }
}
