// default package

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Iterator;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class pfd extends BasePendingResult {
    public oo8 o;
    public final boolean p;
    public final /* synthetic */ k89 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pfd(k89 k89Var, boolean z) {
        super(null);
        this.q = k89Var;
        this.p = z;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ uc9 d(Status status) {
        return new xed(status, (byte) 1);
    }

    public abstract void n();

    public final hbd o() {
        oo8 oo8Var = this.o;
        if (oo8Var != null) {
            return oo8Var;
        }
        oo8 oo8Var2 = new oo8(this, (byte) 29);
        this.o = oo8Var2;
        return oo8Var2;
    }

    public final void p() {
        if (!this.p) {
            Iterator it = this.q.h.iterator();
            if (it.hasNext()) {
                throw kt6.l(it);
            }
            Iterator it2 = this.q.i.iterator();
            while (it2.hasNext()) {
                ((j89) it2.next()).f();
            }
        }
        try {
            synchronized (this.q.a) {
                n();
            }
        } catch (oad unused) {
            a(new xed(new Status(2100, null, null, null), (byte) 1));
        }
    }
}
