package t1;

import android.text.InputFilter;
import android.widget.TextView;
import androidx.emoji2.text.l;
import c8.gc;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class g extends gc {
    public final f a;

    public g(TextView textView) {
        this.a = new f(textView);
    }

    @Override // c8.gc
    public final InputFilter[] a(InputFilter[] inputFilterArr) {
        return !(l.j != null) ? inputFilterArr : this.a.a(inputFilterArr);
    }

    @Override // c8.gc
    public final void b(boolean z9) {
        if (l.j != null) {
            this.a.b(z9);
        }
    }

    @Override // c8.gc
    public final void c(boolean z9) {
        f fVar = this.a;
        if (l.j != null) {
            fVar.c(z9);
        } else {
            fVar.c = z9;
        }
    }
}
