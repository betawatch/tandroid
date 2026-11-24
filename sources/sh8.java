// default package

import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class sh8 implements c39 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ d c;
    public final /* synthetic */ Object d;

    public /* synthetic */ sh8(Object obj, int i, d dVar, byte b) {
        this.a = b;
        this.d = obj;
        this.b = i;
        this.c = dVar;
    }

    @Override // c39
    public final void d(int i, View view) {
        byte b = this.a;
        d dVar = this.c;
        int i2 = this.b;
        Object obj = this.d;
        switch (b) {
            case 0:
                xh8 xh8Var = (xh8) obj;
                if (view instanceof kh8) {
                    kh8 kh8Var = (kh8) view;
                    PremiumPreviewFragment.u0(i2, kh8Var.f.a);
                    xh8Var.u(new jh8(dVar, (int) kh8Var.f.a, false));
                    break;
                }
                break;
            default:
                vs9 vs9Var = (vs9) obj;
                ArrayList arrayList = vs9Var.r;
                ns9 ns9Var = vs9Var.d;
                if (i >= 0 && i < arrayList.size()) {
                    if (!y6c.h(i2).p()) {
                        new jh8(dVar, 24, true).show();
                        break;
                    } else {
                        long j = ((ss9) arrayList.get(i)).a.h;
                        if (vs9Var.f(vs9Var.h == j ? null : ((ss9) arrayList.get(i)).a)) {
                            int i3 = 0;
                            while (i3 < ns9Var.getChildCount()) {
                                if (ns9Var.getChildAt(i3) == view) {
                                    if (i3 <= 1) {
                                        ns9Var.x0(-gl.L(i3 == 0 ? 90.0f : 50.0f), 0, null);
                                    } else if (i3 >= ns9Var.getChildCount() - 2) {
                                        ns9Var.x0(gl.L(i3 == ns9Var.getChildCount() - 1 ? 80.0f : 50.0f), 0, null);
                                    }
                                }
                                i3++;
                            }
                            ns9Var.M(new d42((byte) 3));
                            if (vs9Var.h != j) {
                                vs9Var.h = j;
                                ((us9) view).a(true, true);
                                break;
                            } else {
                                vs9Var.h = 0L;
                                break;
                            }
                        }
                    }
                }
                break;
        }
    }
}
