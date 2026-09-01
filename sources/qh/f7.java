package qh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.e81;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class f7 extends e81 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ d8 c;

    public /* synthetic */ f7(d8 d8Var, Context context, int i10) {
        this.a = i10;
        this.c = d8Var;
        this.b = context;
    }

    @Override // org.telegram.ui.Components.e81
    public final void b(View view, int i10, int i11) {
        switch (this.a) {
            case 0:
                ((x7) view).b(i11);
                break;
            default:
                ((x7) view).b(i11);
                break;
        }
    }

    @Override // org.telegram.ui.Components.e81
    public final View d(int i10) {
        switch (this.a) {
        }
        return new x7(this.c, this.b);
    }

    @Override // org.telegram.ui.Components.e81
    public final int e() {
        switch (this.a) {
            case 0:
                return 2;
            default:
                return 1;
        }
    }

    @Override // org.telegram.ui.Components.e81
    public final int h(int i10) {
        switch (this.a) {
            case 0:
                if (i10 == 0) {
                    return 0;
                }
                return this.c.J;
            default:
                return 5;
        }
    }
}
