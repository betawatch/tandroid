package rh;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.r20;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ View c;

    public /* synthetic */ r0(View view, int i10, int i11) {
        this.a = i11;
        this.c = view;
        this.b = i10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        r20 r20Var;
        switch (this.a) {
            case 0:
                ((s0) this.c).a(this.b);
                break;
            case 1:
                vh.k7 k7Var = (vh.k7) this.c;
                ArrayList arrayList = k7Var.e;
                int i10 = this.b;
                if (!arrayList.contains(Integer.valueOf(i10))) {
                    k7Var.e.add(Integer.valueOf(i10));
                } else if (k7Var.e.size() > 1) {
                    k7Var.e.remove(Integer.valueOf(i10));
                }
                org.telegram.messenger.i0.d0(k7Var.b, new ph.h1(k7Var, 24));
                break;
            default:
                vh.f4 f4Var = ((vh.d4) this.c).b;
                if (f4Var.r && (r20Var = f4Var.f) != null) {
                    r20Var.a(Integer.valueOf(this.b));
                    break;
                }
                break;
        }
    }
}
