package rh;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.q20;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
        q20 q20Var;
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
                if (f4Var.r && (q20Var = f4Var.f) != null) {
                    q20Var.a(Integer.valueOf(this.b));
                    break;
                }
                break;
        }
    }
}
