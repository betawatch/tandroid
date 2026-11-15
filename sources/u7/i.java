package u7;

import a8.p0;
import android.content.Context;
import android.graphics.Point;
import android.location.Location;
import androidx.lifecycle.m0;
import androidx.lifecycle.s0;
import com.google.android.gms.location.LocationResult;
import java.util.List;
import org.telegram.messenger.g0;
import org.telegram.messenger.qa;
import org.telegram.messenger.rd;
import org.telegram.messenger.t0;
import org.telegram.messenger.y9;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class i implements com.google.android.gms.common.api.internal.n, v0.g, q5.b, s0 {
    public static i b;
    public Object a;

    public /* synthetic */ i(Object obj) {
        this.a = obj;
    }

    public static i b() {
        if (b == null) {
            Point point = g0.q;
            int i7 = point.x;
            int i10 = point.y;
            i iVar = new i();
            iVar.a = t0.b.getSharedPreferences(p0.m(i7, i10, "pip_floating_", "_"), 0);
            b = iVar;
        }
        return b;
    }

    @Override // v0.g
    public void a(Object obj) {
        w0.d e10 = (w0.d) obj;
        kotlin.jvm.internal.j.e(e10, "e");
        zd.m mVar = (zd.m) this.a;
        if (mVar.w()) {
            mVar.resumeWith(af.b.b(e10));
        }
    }

    @Override // androidx.lifecycle.s0
    public androidx.lifecycle.p0 d(Class cls) {
        throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
    }

    @Override // androidx.lifecycle.s0
    public androidx.lifecycle.p0 e(Class cls, y1.b bVar) {
        m0 m0Var = null;
        for (y1.c cVar : (y1.c[]) this.a) {
            if (cVar.a.equals(cls)) {
                m0Var = new m0();
            }
        }
        if (m0Var != null) {
            return m0Var;
        }
        throw new IllegalArgumentException("No initializer set for given class ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.common.api.internal.n
    public void g(Object obj) {
        LocationResult locationResult = (LocationResult) this.a;
        qa qaVar = ((y9) obj).a;
        List list = locationResult.a;
        int size = list.size();
        Location location = size == 0 ? null : (Location) list.get(size - 1);
        ia.d dVar = (ia.d) qaVar;
        if (location == null) {
            dVar.getClass();
        } else {
            ((rd) dVar.b).m(location);
        }
    }

    @Override // fd.a
    public Object get() {
        String packageName = ((Context) ((fd.a) this.a).get()).getPackageName();
        if (packageName != null) {
            return packageName;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // v0.g
    public void onResult(Object obj) {
        v0.c result = (v0.c) obj;
        kotlin.jvm.internal.j.e(result, "result");
        zd.m mVar = (zd.m) this.a;
        if (mVar.w()) {
            mVar.resumeWith(result);
        }
    }
}
