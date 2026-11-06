package t1;

import android.text.InputFilter;
import android.widget.TextView;
import androidx.emoji2.text.l;
import c8.gc;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
