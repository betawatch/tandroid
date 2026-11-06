package v4;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import org.telegram.messenger.r2;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public abstract class d1 {
    public static final List u = Collections.EMPTY_LIST;
    public final View a;
    public WeakReference b;
    public int l;
    public RecyclerView t;
    public int c = -1;
    public int d = -1;
    public long e = -1;
    public int f = -1;
    public int g = -1;
    public int h = -1;
    public int i = -1;
    public d1 j = null;
    public d1 k = null;
    public ArrayList m = null;
    public List n = null;
    public int o = 0;
    public v0 p = null;
    public boolean q = false;
    public int r = 0;
    public int s = -1;

    public d1(View view) {
        if (view == null) {
            throw new IllegalArgumentException("itemView may not be null");
        }
        this.a = view;
    }

    public final void a(int i7) {
        this.l = i7 | this.l;
    }

    public final int b() {
        RecyclerView recyclerView = this.t;
        if (recyclerView == null) {
            return -1;
        }
        return recyclerView.N(this);
    }

    public final int c() {
        int i7 = this.g;
        return i7 == -1 ? this.c : i7;
    }

    public final List d() {
        ArrayList arrayList;
        return ((this.l & 1024) != 0 || (arrayList = this.m) == null || arrayList.size() == 0) ? u : this.n;
    }

    public final boolean e(int i7) {
        return (i7 & this.l) != 0;
    }

    public final boolean f() {
        View view = this.a;
        return (view.getParent() == null || view.getParent() == this.t) ? false : true;
    }

    public final boolean g() {
        return (this.l & 1) != 0;
    }

    public final boolean h() {
        return (this.l & 4) != 0;
    }

    public final boolean i() {
        if ((this.l & 16) != 0) {
            return false;
        }
        WeakHashMap weakHashMap = r0.i0.a;
        return !this.a.hasTransientState();
    }

    public final boolean j() {
        return (this.l & 8) != 0;
    }

    public final boolean k() {
        return this.p != null;
    }

    public final boolean l() {
        return (this.l & 256) != 0;
    }

    public final boolean m() {
        return (this.l & 2) != 0;
    }

    public final void n(int i7, boolean z9) {
        if (this.d == -1) {
            this.d = this.c;
        }
        if (this.g == -1) {
            this.g = this.c;
        }
        if (z9) {
            this.g += i7;
        }
        this.c += i7;
        View view = this.a;
        if (view.getLayoutParams() != null) {
            ((o0) view.getLayoutParams()).c = true;
        }
    }

    public final void o() {
        this.l = 0;
        int i7 = this.c;
        if (i7 != -1) {
            this.h = i7;
        }
        this.c = -1;
        this.d = -1;
        this.e = -1L;
        this.g = -1;
        this.o = 0;
        this.j = null;
        this.k = null;
        ArrayList arrayList = this.m;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.l &= -1025;
        this.r = 0;
        this.s = -1;
        RecyclerView.m(this);
    }

    public final void p(int i7, int i10) {
        this.l = (i7 & i10) | (this.l & (~i10));
    }

    public final void q(boolean z9) {
        int i7 = this.o;
        int i10 = z9 ? i7 - 1 : i7 + 1;
        this.o = i10;
        if (i10 < 0) {
            this.o = 0;
            boolean z10 = r2.a;
            throw new RuntimeException("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
        }
        if (!z9 && i10 == 1) {
            this.l |= 16;
        } else if (z9 && i10 == 0) {
            this.l &= -17;
        }
    }

    public final boolean r() {
        return (this.l & 128) != 0;
    }

    public final boolean s() {
        return (this.l & 32) != 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ViewHolder{" + Integer.toHexString(hashCode()) + " position=" + this.c + " id=" + this.e + ", oldPos=" + this.d + ", pLpos:" + this.g);
        if (k()) {
            sb2.append(" scrap ");
            sb2.append(this.q ? "[changeScrap]" : "[attachedScrap]");
        }
        if (h()) {
            sb2.append(" invalid");
        }
        if (!g()) {
            sb2.append(" unbound");
        }
        if ((this.l & 2) != 0) {
            sb2.append(" update");
        }
        if (j()) {
            sb2.append(" removed");
        }
        if (r()) {
            sb2.append(" ignored");
        }
        if (l()) {
            sb2.append(" tmpDetached");
        }
        if (!i()) {
            sb2.append(" not recyclable(" + this.o + ")");
        }
        if ((this.l & 512) != 0 || h()) {
            sb2.append(" undefined adapter position");
        }
        if (this.a.getParent() == null) {
            sb2.append(" no parent");
        }
        sb2.append("}");
        return sb2.toString();
    }
}
