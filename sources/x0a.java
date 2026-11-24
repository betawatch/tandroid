// default package

import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class x0a implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ b1a b;

    public /* synthetic */ x0a(b1a b1aVar, byte b) {
        this.a = b;
        this.b = b1aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        b1a b1aVar = this.b;
        switch (b) {
            case 0:
                b1aVar.Z1.clear();
                b1aVar.T1.d.b(true);
                b1aVar.i1(true, false);
                break;
            default:
                b1aVar.d1(false);
                break;
        }
    }
}
