package t1;

import android.text.InputFilter;
import android.widget.TextView;
import androidx.emoji2.text.l;
import c8.gc;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
