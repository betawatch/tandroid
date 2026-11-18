package t1;

import android.text.InputFilter;
import android.widget.TextView;
import androidx.emoji2.text.l;
import c8.lc;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class g extends lc {
    public final f a;

    public g(TextView textView) {
        this.a = new f(textView);
    }

    @Override // c8.lc
    public final InputFilter[] a(InputFilter[] inputFilterArr) {
        return !(l.j != null) ? inputFilterArr : this.a.a(inputFilterArr);
    }

    @Override // c8.lc
    public final void b(boolean z10) {
        if (l.j != null) {
            this.a.b(z10);
        }
    }

    @Override // c8.lc
    public final void c(boolean z10) {
        f fVar = this.a;
        if (l.j != null) {
            fVar.c(z10);
        } else {
            fVar.c = z10;
        }
    }
}
