package q1;

import android.text.InputFilter;
import android.widget.TextView;
import androidx.emoji2.text.l;
import w7.r6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class g extends r6 {
    public final f a;

    public g(TextView textView) {
        this.a = new f(textView);
    }

    @Override // w7.r6
    public final InputFilter[] a(InputFilter[] inputFilterArr) {
        return !(l.j != null) ? inputFilterArr : this.a.a(inputFilterArr);
    }

    @Override // w7.r6
    public final void b(boolean z10) {
        if (l.j != null) {
            this.a.b(z10);
        }
    }

    @Override // w7.r6
    public final void c(boolean z10) {
        f fVar = this.a;
        if (l.j != null) {
            fVar.c(z10);
        } else {
            fVar.c = z10;
        }
    }
}
