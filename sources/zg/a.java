package zg;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.kj;
import org.telegram.ui.vj;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class a {
    public RecyclerView a;
    public int b;
    public long c;
    public int d;
    public boolean e;

    public final boolean a(kj kjVar) {
        if (kjVar == null) {
            return false;
        }
        if (kjVar.f1() != this.b) {
            return this.c != 0 && kjVar.d1() == this.c;
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
