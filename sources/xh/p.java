package xh;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.eb;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final /* synthetic */ class p implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ p(Context context, e6 e6Var, long j3, TL_stars.StarGift starGift, ArrayList arrayList) {
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
                x.R((x) this.f, this.b, this.c, (e6) this.d, (Runnable) this.e);
                break;
            case 1:
                e0 e0Var = (e0) this.f;
                e6 e6Var = (e6) this.d;
                Runnable runnable = (Runnable) this.e;
                e0Var.getClass();
                o oVar = new o(this.c, e6Var, new n(this.b, true, null), e0Var.d0);
                oVar.show();
                oVar.n0 = runnable;
                e0Var.dismiss();
                break;
            case 2:
                new e0(this.c, (e6) this.d, this.b, (TL_stars.StarGift) this.f, (ArrayList) this.e, null, true).show();
                break;
            default:
                z4.T((z4) this.f, this.b, this.c, (Runnable) this.e, (TL_stars.StarGift) this.d);
                break;
        }
    }

    public /* synthetic */ p(eb ebVar, long j3, Context context, e6 e6Var, Runnable runnable, int i10) {
        this.a = i10;
        this.f = ebVar;
        this.b = j3;
        this.c = context;
        this.d = e6Var;
        this.e = runnable;
    }

    public /* synthetic */ p(z4 z4Var, long j3, Context context, Runnable runnable, TL_stars.StarGift starGift) {
        this.a = 3;
        this.f = z4Var;
        this.b = j3;
        this.c = context;
        this.e = runnable;
        this.d = starGift;
    }
}
