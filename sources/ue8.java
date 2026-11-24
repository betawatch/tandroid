// default package

import android.os.Handler;
import android.os.Message;
import java.util.TreeMap;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ue8 implements Handler.Callback {
    public final mx6 a;
    public final sz4 b;
    public t63 f;
    public boolean h;
    public boolean n;
    public boolean r;
    public final TreeMap e = new TreeMap();
    public final Handler d = hac.q(this);
    public final qs c = new qs((byte) 1);

    public ue8(t63 t63Var, sz4 sz4Var, mx6 mx6Var) {
        this.f = t63Var;
        this.b = sz4Var;
        this.a = mx6Var;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (!this.r) {
            if (message.what != 1) {
                return false;
            }
            se8 se8Var = (se8) message.obj;
            long j = se8Var.a;
            long j2 = se8Var.b;
            Long valueOf = Long.valueOf(j2);
            TreeMap treeMap = this.e;
            Long l = (Long) treeMap.get(valueOf);
            if (l == null) {
                treeMap.put(Long.valueOf(j2), Long.valueOf(j));
                return true;
            }
            if (l.longValue() > j) {
                treeMap.put(Long.valueOf(j2), Long.valueOf(j));
            }
        }
        return true;
    }
}
