// default package

import android.view.View;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
