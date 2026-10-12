package yh;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.db;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final /* synthetic */ class o implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ o(Context context, c6 c6Var, long j10, TL_stars.StarGift starGift, ArrayList arrayList) {
        this.a = 2;
        this.c = context;
        this.d = c6Var;
        this.b = j10;
        this.f = starGift;
        this.e = arrayList;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                w.R((w) this.f, this.b, this.c, (c6) this.d, (Runnable) this.e);
                break;
            case 1:
                d0 d0Var = (d0) this.f;
                c6 c6Var = (c6) this.d;
                Runnable runnable = (Runnable) this.e;
                d0Var.getClass();
                n nVar = new n(this.c, c6Var, new m(this.b, true, null), d0Var.d0);
                nVar.show();
                nVar.n0 = runnable;
                d0Var.dismiss();
                break;
            case 2:
                new d0(this.c, (c6) this.d, this.b, (TL_stars.StarGift) this.f, (ArrayList) this.e, null, true).show();
                break;
            default:
                x4.T((x4) this.f, this.b, this.c, (Runnable) this.e, (TL_stars.StarGift) this.d);
                break;
        }
    }

    public /* synthetic */ o(db dbVar, long j10, Context context, c6 c6Var, Runnable runnable, int i10) {
        this.a = i10;
        this.f = dbVar;
        this.b = j10;
        this.c = context;
        this.d = c6Var;
        this.e = runnable;
    }

    public /* synthetic */ o(x4 x4Var, long j10, Context context, Runnable runnable, TL_stars.StarGift starGift) {
        this.a = 3;
        this.f = x4Var;
        this.b = j10;
        this.c = context;
        this.e = runnable;
        this.d = starGift;
    }
}
