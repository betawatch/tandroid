package t1;

import android.text.InputFilter;
import android.widget.TextView;
import androidx.emoji2.text.l;
import c8.fc;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class g extends fc {
    public final f a;

    public g(TextView textView) {
        this.a = new f(textView);
    }

    @Override // c8.fc
    public final InputFilter[] a(InputFilter[] inputFilterArr) {
        return !(l.j != null) ? inputFilterArr : this.a.a(inputFilterArr);
    }

    @Override // c8.fc
    public final void b(boolean z9) {
        if (l.j != null) {
            this.a.b(z9);
        }
    }

    @Override // c8.fc
    public final void c(boolean z9) {
        f fVar = this.a;
        if (l.j != null) {
            fVar.c(z9);
        } else {
            fVar.c = z9;
        }
    }
}
