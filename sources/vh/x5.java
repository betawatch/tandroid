package vh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.p71;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class x5 extends p71 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ w6 c;

    public /* synthetic */ x5(w6 w6Var, Context context, int i10) {
        this.a = i10;
        this.c = w6Var;
        this.b = context;
    }

    @Override // org.telegram.ui.Components.p71
    public final void b(View view, int i10, int i11) {
        switch (this.a) {
            case 0:
                ((r6) view).b(i11);
                break;
            default:
                ((r6) view).b(i11);
                break;
        }
    }

    @Override // org.telegram.ui.Components.p71
    public final View d(int i10) {
        switch (this.a) {
        }
        return new r6(this.c, this.b);
    }

    @Override // org.telegram.ui.Components.p71
    public final int e() {
        switch (this.a) {
            case 0:
                return 2;
            default:
                return 1;
        }
    }

    @Override // org.telegram.ui.Components.p71
    public final int h(int i10) {
        switch (this.a) {
            case 0:
                if (i10 == 0) {
                    return 0;
                }
                return this.c.D1;
            default:
                return 5;
        }
    }
}
