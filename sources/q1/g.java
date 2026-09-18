package q1;

import android.text.InputFilter;
import android.widget.TextView;
import androidx.emoji2.text.l;
import w7.o6;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final class g extends o6 {
    public final f a;

    public g(TextView textView) {
        this.a = new f(textView);
    }

    @Override // w7.o6
    public final InputFilter[] a(InputFilter[] inputFilterArr) {
        return !(l.j != null) ? inputFilterArr : this.a.a(inputFilterArr);
    }

    @Override // w7.o6
    public final void b(boolean z10) {
        if (l.j != null) {
            this.a.b(z10);
        }
    }

    @Override // w7.o6
    public final void c(boolean z10) {
        f fVar = this.a;
        if (l.j != null) {
            fVar.c(z10);
        } else {
            fVar.c = z10;
        }
    }
}
