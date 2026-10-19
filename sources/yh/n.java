package yh;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.bb;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final /* synthetic */ class n implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ n(Context context, d6 d6Var, long j10, TL_stars.StarGift starGift, ArrayList arrayList) {
        this.a = 2;
        this.c = context;
        this.d = d6Var;
        this.b = j10;
        this.f = starGift;
        this.e = arrayList;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                v.R((v) this.f, this.b, this.c, (d6) this.d, (Runnable) this.e);
                break;
            case 1:
                c0 c0Var = (c0) this.f;
                d6 d6Var = (d6) this.d;
                Runnable runnable = (Runnable) this.e;
                c0Var.getClass();
                m mVar = new m(this.c, d6Var, new l(this.b, true, null), c0Var.d0);
                mVar.show();
                mVar.n0 = runnable;
                c0Var.dismiss();
                break;
            case 2:
                new c0(this.c, (d6) this.d, this.b, (TL_stars.StarGift) this.f, (ArrayList) this.e, null, true).show();
                break;
            default:
                x4.T((x4) this.f, this.b, this.c, (Runnable) this.e, (TL_stars.StarGift) this.d);
                break;
        }
    }

    public /* synthetic */ n(bb bbVar, long j10, Context context, d6 d6Var, Runnable runnable, int i10) {
        this.a = i10;
        this.f = bbVar;
        this.b = j10;
        this.c = context;
        this.d = d6Var;
        this.e = runnable;
    }

    public /* synthetic */ n(x4 x4Var, long j10, Context context, Runnable runnable, TL_stars.StarGift starGift) {
        this.a = 3;
        this.f = x4Var;
        this.b = j10;
        this.c = context;
        this.e = runnable;
        this.d = starGift;
    }
}
