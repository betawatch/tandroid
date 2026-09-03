package ph;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.c81;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class g7 extends c81 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ e8 c;

    public /* synthetic */ g7(e8 e8Var, Context context, int i10) {
        this.a = i10;
        this.c = e8Var;
        this.b = context;
    }

    @Override // org.telegram.ui.Components.c81
    public final void b(View view, int i10, int i11) {
        switch (this.a) {
            case 0:
                ((y7) view).b(i11);
                break;
            default:
                ((y7) view).b(i11);
                break;
        }
    }

    @Override // org.telegram.ui.Components.c81
    public final View d(int i10) {
        switch (this.a) {
        }
        return new y7(this.c, this.b);
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
