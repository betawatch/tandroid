// default package

import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class p6b implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ u6b b;

    public /* synthetic */ p6b(u6b u6bVar, byte b) {
        this.a = b;
        this.b = u6bVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        u6b u6bVar = this.b;
        switch (b) {
            case 0:
                u6bVar.Z0();
                break;
            default:
                u6bVar.c1();
                break;
        }
    }
}
