package q1;

import android.text.InputFilter;
import android.widget.TextView;
import androidx.emoji2.text.l;
import k7.l6;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class g extends l6 {
    public final f a;

    public g(TextView textView) {
        this.a = new f(textView);
    }

    @Override // k7.l6
    public final InputFilter[] a(InputFilter[] inputFilterArr) {
        return !(l.j != null) ? inputFilterArr : this.a.a(inputFilterArr);
    }

    @Override // k7.l6
    public final void b(boolean z4) {
        if (l.j != null) {
            this.a.b(z4);
        }
    }

    @Override // k7.l6
    public final void c(boolean z4) {
        f fVar = this.a;
        if (l.j != null) {
            fVar.c(z4);
        } else {
            fVar.c = z4;
        }
    }
}
