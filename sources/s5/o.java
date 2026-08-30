package s5;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Iterator;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public abstract class o extends BasePendingResult {
    public o2.o o;
    public final boolean p;
    public final /* synthetic */ h q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(h hVar, boolean z4) {
        super(null);
        this.q = hVar;
        this.p = z4;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ com.google.android.gms.common.api.q d(Status status) {
        return new n(status, 1);
    }

    public abstract void n();

    public final u5.o o() {
        if (this.o == null) {
            this.o = new o2.o(this, 21);
        }
        return this.o;
    }

    public final void p() {
        if (!this.p) {
            Iterator it = this.q.h.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
            Iterator it2 = this.q.i.iterator();
            while (it2.hasNext()) {
                ((g) it2.next()).f();
            }
        }
        try {
            synchronized (this.q.a) {
                n();
            }
        } catch (u5.l unused) {
            a(new n(new Status(2100, null, null, null), 1));
        }
    }
}
