// default package

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
