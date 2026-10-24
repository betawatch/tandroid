package yh;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.bb;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final /* synthetic */ class n implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ n(Context context, g6 g6Var, long j10, TL_stars.StarGift starGift, ArrayList arrayList) {
        this.a = 2;
        this.c = context;
        this.d = g6Var;
        this.b = j10;
        this.f = starGift;
        this.e = arrayList;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                v.Q((v) this.f, this.b, this.c, (g6) this.d, (Runnable) this.e);
                break;
            case 1:
                c0 c0Var = (c0) this.f;
                g6 g6Var = (g6) this.d;
                Runnable runnable = (Runnable) this.e;
                c0Var.getClass();
                m mVar = new m(this.c, g6Var, new l(this.b, true, null), c0Var.d0);
                mVar.show();
                mVar.n0 = runnable;
                c0Var.dismiss();
                break;
            case 2:
                new c0(this.c, (g6) this.d, this.b, (TL_stars.StarGift) this.f, (ArrayList) this.e, null, true).show();
                break;
            default:
                x4.S((x4) this.f, this.b, this.c, (Runnable) this.e, (TL_stars.StarGift) this.d);
                break;
        }
    }

    public /* synthetic */ n(bb bbVar, long j10, Context context, g6 g6Var, Runnable runnable, int i10) {
        this.a = i10;
        this.f = bbVar;
        this.b = j10;
        this.c = context;
        this.d = g6Var;
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
