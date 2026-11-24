// default package

import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class tj8 implements f59 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ d c;
    public final /* synthetic */ Object d;

    public /* synthetic */ tj8(Object obj, int i, d dVar, byte b) {
        this.a = b;
        this.d = obj;
        this.b = i;
        this.c = dVar;
    }

    @Override // f59
    public final void g(int i, View view) {
        byte b = this.a;
        d dVar = this.c;
        int i2 = this.b;
        Object obj = this.d;
        switch (b) {
            case 0:
                yj8 yj8Var = (yj8) obj;
                if (view instanceof lj8) {
                    lj8 lj8Var = (lj8) view;
                    PremiumPreviewFragment.v0(i2, lj8Var.f.a);
                    yj8Var.t(new kj8(dVar, (int) lj8Var.f.a, false));
                    break;
                }
                break;
            default:
                xu9 xu9Var = (xu9) obj;
                ArrayList arrayList = xu9Var.r;
                pu9 pu9Var = xu9Var.d;
                if (i >= 0 && i < arrayList.size()) {
                    if (!z8c.h(i2).p()) {
                        new kj8(dVar, 24, true).show();
                        break;
                    } else {
                        long j = ((uu9) arrayList.get(i)).a.h;
                        if (xu9Var.f(xu9Var.h == j ? null : ((uu9) arrayList.get(i)).a)) {
                            int i3 = 0;
                            while (i3 < pu9Var.getChildCount()) {
                                if (pu9Var.getChildAt(i3) == view) {
                                    if (i3 <= 1) {
                                        pu9Var.x0(-gm.L(i3 == 0 ? 90.0f : 50.0f), 0, null);
                                    } else if (i3 >= pu9Var.getChildCount() - 2) {
                                        pu9Var.x0(gm.L(i3 == pu9Var.getChildCount() - 1 ? 80.0f : 50.0f), 0, null);
                                    }
                                }
                                i3++;
                            }
                            pu9Var.M(new o52((byte) 3));
                            if (xu9Var.h != j) {
                                xu9Var.h = j;
                                ((wu9) view).a(true, true);
                                break;
                            } else {
                                xu9Var.h = 0L;
                                break;
                            }
                        }
                    }
                }
                break;
        }
    }
}
