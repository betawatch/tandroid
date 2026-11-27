// default package

import android.text.InputFilter;
import android.widget.TextView;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class zy3 extends vje {
    public final yy3 a;

    public zy3(TextView textView) {
        this.a = new yy3(textView);
    }

    @Override // vje
    public final InputFilter[] a(InputFilter[] inputFilterArr) {
        return !(gx3.j != null) ? inputFilterArr : this.a.a(inputFilterArr);
    }

    @Override // vje
    public final void b(boolean z) {
        if (gx3.j != null) {
            this.a.b(z);
        }
    }

    @Override // vje
    public final void c(boolean z) {
        boolean z2 = gx3.j != null;
        yy3 yy3Var = this.a;
        if (z2) {
            yy3Var.c(z);
        } else {
            yy3Var.c = z;
        }
    }
}
