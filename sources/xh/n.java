package xh;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.bb;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes.dex */
public final /* synthetic */ class n implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ n(Context context, e6 e6Var, long j3, TL_stars.StarGift starGift, ArrayList arrayList) {
        this.a = 2;
        this.c = context;
        this.d = e6Var;
        this.b = j3;
        this.f = starGift;
        this.e = arrayList;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                v.Q((v) this.f, this.b, this.c, (e6) this.d, (Runnable) this.e);
                break;
            case 1:
                c0 c0Var = (c0) this.f;
                e6 e6Var = (e6) this.d;
                Runnable runnable = (Runnable) this.e;
                c0Var.getClass();
                m mVar = new m(this.c, e6Var, new l(this.b, true, null), c0Var.d0);
                mVar.show();
                mVar.n0 = runnable;
                c0Var.dismiss();
                break;
            case 2:
                new c0(this.c, (e6) this.d, this.b, (TL_stars.StarGift) this.f, (ArrayList) this.e, null, true).show();
                break;
            default:
                z4.S((z4) this.f, this.b, this.c, (Runnable) this.e, (TL_stars.StarGift) this.d);
                break;
        }
    }

    public /* synthetic */ n(bb bbVar, long j3, Context context, e6 e6Var, Runnable runnable, int i10) {
        this.a = i10;
        this.f = bbVar;
        this.b = j3;
        this.c = context;
        this.d = e6Var;
        this.e = runnable;
    }

    public /* synthetic */ n(z4 z4Var, long j3, Context context, Runnable runnable, TL_stars.StarGift starGift) {
        this.a = 3;
        this.f = z4Var;
        this.b = j3;
        this.c = context;
        this.e = runnable;
        this.d = starGift;
    }
}
