// default package

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final class z8b extends nic {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ w9b c;

    public /* synthetic */ z8b(w9b w9bVar, Context context, byte b) {
        this.a = b;
        this.c = w9bVar;
        this.b = context;
    }

    @Override // nic
    public final void b(View view, int i, int i2) {
        switch (this.a) {
            case 0:
                ((r9b) view).b(i2);
                break;
            default:
                ((r9b) view).b(i2);
                break;
        }
    }

    @Override // nic
    public final View d(int i) {
        byte b = this.a;
        Context context = this.b;
        w9b w9bVar = this.c;
        switch (b) {
        }
        return new r9b(w9bVar, context);
    }

    @Override // nic
    public final int e() {
        switch (this.a) {
            case 0:
                return 2;
            default:
                return 1;
        }
    }

    @Override // nic
    public final int h(int i) {
        switch (this.a) {
            case 0:
                if (i == 0) {
                    return 0;
                }
                return this.c.G1;
            default:
                return 5;
        }
    }
}
