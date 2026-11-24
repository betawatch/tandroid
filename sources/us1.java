// default package

import android.view.View;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class us1 extends qn {
    public final /* synthetic */ byte b;
    public final /* synthetic */ ts1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public us1(ts1 ts1Var, byte b) {
        super("p2", (byte) 0);
        this.b = b;
        switch (b) {
            case 1:
                this.c = ts1Var;
                super("progress", (byte) 0);
                break;
            case 2:
                this.c = ts1Var;
                super("alpha", (byte) 0);
                break;
            default:
                this.c = ts1Var;
                break;
        }
    }

    @Override // qn
    public final void c(Object obj, float f) {
        byte b = this.b;
        ts1 ts1Var = this.c;
        switch (b) {
            case 0:
                ((g27) obj).e = f;
                View view = ts1Var.c.R.fragmentView;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            case 1:
                ((g27) obj).g = f;
                View view2 = ts1Var.c.R.fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    break;
                }
                break;
            default:
                ((g27) obj).f = f;
                View view3 = ts1Var.c.R.fragmentView;
                if (view3 != null) {
                    view3.invalidate();
                    break;
                }
                break;
        }
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.b) {
            case 0:
                return Float.valueOf(((g27) obj).e);
            case 1:
                return Float.valueOf(((g27) obj).g);
            default:
                return Float.valueOf(((g27) obj).f);
        }
    }
}
