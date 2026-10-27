package zh;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.bb;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class n implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ n(Context context, u6 u6Var, long j10, TL_stars.StarGift starGift, ArrayList arrayList) {
        this.a = 2;
        this.c = context;
        this.d = u6Var;
        this.b = j10;
        this.f = starGift;
        this.e = arrayList;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                v.Q((v) this.f, this.b, this.c, (u6) this.d, (Runnable) this.e);
                break;
            case 1:
                c0 c0Var = (c0) this.f;
                u6 u6Var = (u6) this.d;
                Runnable runnable = (Runnable) this.e;
                c0Var.getClass();
                m mVar = new m(this.c, u6Var, new l(this.b, true, null), c0Var.d0);
                mVar.show();
                mVar.n0 = runnable;
                c0Var.dismiss();
                break;
            case 2:
                new c0(this.c, (u6) this.d, this.b, (TL_stars.StarGift) this.f, (ArrayList) this.e, null, true).show();
                break;
            default:
                y4.S((y4) this.f, this.b, this.c, (Runnable) this.e, (TL_stars.StarGift) this.d);
                break;
        }
    }

    public /* synthetic */ n(bb bbVar, long j10, Context context, u6 u6Var, Runnable runnable, int i10) {
        this.a = i10;
        this.f = bbVar;
        this.b = j10;
        this.c = context;
        this.d = u6Var;
        this.e = runnable;
    }

    public /* synthetic */ n(y4 y4Var, long j10, Context context, Runnable runnable, TL_stars.StarGift starGift) {
        this.a = 3;
        this.f = y4Var;
        this.b = j10;
        this.c = context;
        this.e = runnable;
        this.d = starGift;
    }
}
