// default package

import android.view.View;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class p2a implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ t2a b;

    public /* synthetic */ p2a(t2a t2aVar, byte b) {
        this.a = b;
        this.b = t2aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        t2a t2aVar = this.b;
        switch (b) {
            case 0:
                t2aVar.Z1.clear();
                t2aVar.T1.d.b(true);
                t2aVar.j1(true, false);
                break;
            default:
                t2aVar.e1(false);
                break;
        }
    }
}
