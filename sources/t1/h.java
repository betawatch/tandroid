package t1;

import android.text.InputFilter;
import android.widget.TextView;
import androidx.emoji2.text.l;
import c8.mc;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class h extends mc {
    public final g a;

    public h(TextView textView) {
        this.a = new g(textView);
    }

    @Override // c8.mc
    public final InputFilter[] a(InputFilter[] inputFilterArr) {
        return !(l.j != null) ? inputFilterArr : this.a.a(inputFilterArr);
    }

    @Override // c8.mc
    public final void b(boolean z10) {
        if (l.j != null) {
            this.a.b(z10);
        }
    }

    @Override // c8.mc
    public final void c(boolean z10) {
        g gVar = this.a;
        if (l.j != null) {
            gVar.c(z10);
        } else {
            gVar.c = z10;
        }
    }
}
