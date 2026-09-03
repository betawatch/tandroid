package qh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.d81;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class e7 extends d81 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ c8 c;

    public /* synthetic */ e7(c8 c8Var, Context context, int i10) {
        this.a = i10;
        this.c = c8Var;
        this.b = context;
    }

    @Override // org.telegram.ui.Components.d81
    public final void b(View view, int i10, int i11) {
        switch (this.a) {
            case 0:
                ((w7) view).b(i11);
                break;
            default:
                ((w7) view).b(i11);
                break;
        }
    }

    @Override // org.telegram.ui.Components.d81
    public final View d(int i10) {
        switch (this.a) {
        }
        return new w7(this.c, this.b);
    }

    @Override // org.telegram.ui.Components.d81
    public final int e() {
        switch (this.a) {
            case 0:
                return 2;
            default:
                return 1;
        }
    }

    @Override // org.telegram.ui.Components.d81
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
