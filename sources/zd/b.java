package zd;

import com.google.android.exoplayer2.upstream.r0;
import com.google.android.gms.internal.cast.z4;
import m4.g;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class b implements r0 {
    public final /* synthetic */ int a = 0;
    public Object b;

    public /* synthetic */ b() {
    }

    @Override // com.google.android.exoplayer2.upstream.r0
    public void a() {
        g gVar = (g) this.b;
        gVar.A.a();
        z4 z4Var = gVar.C;
        if (z4Var != null) {
            throw z4Var;
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                c cVar = c.e;
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("method-execution".substring(7));
                stringBuffer.append("(");
                stringBuffer.append(((f2.b) this.b).n());
                stringBuffer.append(")");
                return stringBuffer.toString();
            default:
                return super.toString();
        }
    }

    public b(g gVar) {
        this.b = gVar;
    }
}
