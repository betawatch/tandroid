package q1;

import android.text.InputFilter;
import android.widget.TextView;
import androidx.emoji2.text.k;
import g7.q6;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class g extends q6 {
    public final f a;

    public g(TextView textView) {
        this.a = new f(textView);
    }

    @Override // g7.q6
    public final InputFilter[] a(InputFilter[] inputFilterArr) {
        return !(k.j != null) ? inputFilterArr : this.a.a(inputFilterArr);
    }

    @Override // g7.q6
    public final void b(boolean z10) {
        if (k.j != null) {
            this.a.b(z10);
        }
    }

    @Override // g7.q6
    public final void c(boolean z10) {
        f fVar = this.a;
        if (k.j != null) {
            fVar.c(z10);
        } else {
            fVar.c = z10;
        }
    }
}
