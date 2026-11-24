// default package

import android.text.InputFilter;
import android.widget.TextView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class oz3 extends fhe {
    public final nz3 a;

    public oz3(TextView textView) {
        this.a = new nz3(textView);
    }

    @Override // fhe
    public final InputFilter[] a(InputFilter[] inputFilterArr) {
        return !(wx3.j != null) ? inputFilterArr : this.a.a(inputFilterArr);
    }

    @Override // fhe
    public final void b(boolean z) {
        if (wx3.j != null) {
            this.a.b(z);
        }
    }

    @Override // fhe
    public final void c(boolean z) {
        boolean z2 = wx3.j != null;
        nz3 nz3Var = this.a;
        if (z2) {
            nz3Var.c(z);
        } else {
            nz3Var.c = z;
        }
    }
}
