// default package

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class vw1 implements ViewTreeObserver.OnDrawListener {
    public final /* synthetic */ bia a;
    public final /* synthetic */ i4a b;

    public vw1(bia biaVar, i4a i4aVar) {
        this.a = biaVar;
        this.b = i4aVar;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        bia biaVar = this.a;
        biaVar.post(new jn1(this, biaVar, this.b, (byte) 8));
    }
}
