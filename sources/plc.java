// default package

import android.view.View;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class plc implements View.OnAttachStateChangeListener {
    public final /* synthetic */ be5 a;
    public final /* synthetic */ TL_wallet.walletTransaction[] b;
    public final /* synthetic */ olc c;
    public final /* synthetic */ int d;
    public final /* synthetic */ i8c e;
    public final /* synthetic */ cj7[] f;
    public final /* synthetic */ String[] h;
    public final /* synthetic */ boolean[] n;

    public plc(be5 be5Var, TL_wallet.walletTransaction[] wallettransactionArr, olc olcVar, int i, i8c i8cVar, cj7[] cj7VarArr, String[] strArr, boolean[] zArr) {
        this.a = be5Var;
        this.b = wallettransactionArr;
        this.c = olcVar;
        this.d = i;
        this.e = i8cVar;
        this.f = cj7VarArr;
        this.h = strArr;
        this.n = zArr;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.a.a(this.b[0]);
        olc olcVar = this.c;
        if (olcVar != null) {
            int i = this.d;
            kk7.f(i).b(olcVar, kk7.c4);
            kk7.f(i).b(olcVar, kk7.d4);
        }
        i8c i8cVar = this.e;
        if (i8cVar != null) {
            this.f[0].n(new wbc(i8cVar, this.h, this.n, (byte) 11));
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        olc olcVar = this.c;
        if (olcVar != null) {
            int i = this.d;
            kk7.f(i).n(olcVar, kk7.c4);
            kk7.f(i).n(olcVar, kk7.d4);
        }
    }
}
