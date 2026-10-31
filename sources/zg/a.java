package zg;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.jj;
import org.telegram.ui.vj;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class a {
    public RecyclerView a;
    public int b;
    public long c;
    public int d;
    public boolean e;

    public final boolean a(jj jjVar) {
        if (jjVar == null) {
            return false;
        }
        if (jjVar.f1() != this.b) {
            return this.c != 0 && jjVar.d1() == this.c;
        }
        return true;
    }

    public final boolean b() {
        return this.e;
    }

    public final boolean c(int i10, long j10) {
        if (this.b == i10 && this.c == j10) {
            return false;
        }
        this.b = i10;
        this.c = j10;
        if (i10 != 0) {
            return true;
        }
        this.e = false;
        return true;
    }

    public final void d(int i10) {
        this.d = i10;
    }

    public final void e(vj vjVar) {
        this.a = vjVar;
    }
}
