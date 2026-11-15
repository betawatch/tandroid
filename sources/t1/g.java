package t1;

import android.text.InputFilter;
import android.widget.TextView;
import androidx.emoji2.text.l;
import c8.ic;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class g extends ic {
    public final f a;

    public g(TextView textView) {
        this.a = new f(textView);
    }

    @Override // c8.ic
    public final InputFilter[] a(InputFilter[] inputFilterArr) {
        return !(l.j != null) ? inputFilterArr : this.a.a(inputFilterArr);
    }

    @Override // c8.ic
    public final void b(boolean z10) {
        if (l.j != null) {
            this.a.b(z10);
        }
    }

    @Override // c8.ic
    public final void c(boolean z10) {
        f fVar = this.a;
        if (l.j != null) {
            fVar.c(z10);
        } else {
            fVar.c = z10;
        }
    }
}
