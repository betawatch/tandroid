package q1;

import android.text.InputFilter;
import android.widget.TextView;
import androidx.emoji2.text.l;
import w7.l6;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class g extends l6 {
    public final f a;

    public g(TextView textView) {
        this.a = new f(textView);
    }

    @Override // w7.l6
    public final InputFilter[] a(InputFilter[] inputFilterArr) {
        return !(l.j != null) ? inputFilterArr : this.a.a(inputFilterArr);
    }

    @Override // w7.l6
    public final void b(boolean z10) {
        if (l.j != null) {
            this.a.b(z10);
        }
    }

    @Override // w7.l6
    public final void c(boolean z10) {
        f fVar = this.a;
        if (l.j != null) {
            fVar.c(z10);
        } else {
            fVar.c = z10;
        }
    }
}
