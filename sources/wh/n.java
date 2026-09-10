package wh;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.ab;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final /* synthetic */ class n implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ n(Context context, f6 f6Var, long j3, TL_stars.StarGift starGift, ArrayList arrayList) {
        this.a = 2;
        this.c = context;
        this.d = f6Var;
        this.b = j3;
        this.f = starGift;
        this.e = arrayList;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                w.Q((w) this.f, this.b, this.c, (f6) this.d, (Runnable) this.e);
                break;
            case 1:
                d0 d0Var = (d0) this.f;
                f6 f6Var = (f6) this.d;
                Runnable runnable = (Runnable) this.e;
                d0Var.getClass();
                m mVar = new m(this.c, f6Var, new l(this.b, true, null), d0Var.d0);
                mVar.show();
                mVar.n0 = runnable;
                d0Var.dismiss();
                break;
            case 2:
                new d0(this.c, (f6) this.d, this.b, (TL_stars.StarGift) this.f, (ArrayList) this.e, null, true).show();
                break;
            default:
                y4.S((y4) this.f, this.b, this.c, (Runnable) this.e, (TL_stars.StarGift) this.d);
                break;
        }
    }

    public /* synthetic */ n(ab abVar, long j3, Context context, f6 f6Var, Runnable runnable, int i10) {
        this.a = i10;
        this.f = abVar;
        this.b = j3;
        this.c = context;
        this.d = f6Var;
        this.e = runnable;
    }

    public /* synthetic */ n(y4 y4Var, long j3, Context context, Runnable runnable, TL_stars.StarGift starGift) {
        this.a = 3;
        this.f = y4Var;
        this.b = j3;
        this.c = context;
        this.e = runnable;
        this.d = starGift;
    }
}
