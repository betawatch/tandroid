package ph;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.c81;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class h7 extends c81 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ f8 c;

    public /* synthetic */ h7(f8 f8Var, Context context, int i10) {
        this.a = i10;
        this.c = f8Var;
        this.b = context;
    }

    @Override // org.telegram.ui.Components.c81
    public final void b(View view, int i10, int i11) {
        switch (this.a) {
            case 0:
                ((z7) view).b(i11);
                break;
            default:
                ((z7) view).b(i11);
                break;
        }
    }

    @Override // org.telegram.ui.Components.c81
    public final View d(int i10) {
        switch (this.a) {
        }
        return new z7(this.c, this.b);
    }

    @Override // org.telegram.ui.Components.c81
    public final int e() {
        switch (this.a) {
            case 0:
                return 2;
            default:
                return 1;
        }
    }

    @Override // org.telegram.ui.Components.c81
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
