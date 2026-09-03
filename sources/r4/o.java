package r4;

import android.os.Handler;
import android.os.Message;
import g5.q;
import h5.d0;
import java.util.TreeMap;
import org.telegram.ui.Components.zz;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class o implements Handler.Callback {
    public final q a;
    public final zz b;
    public s4.c f;
    public boolean h;
    public boolean n;
    public boolean r;
    public final TreeMap e = new TreeMap();
    public final Handler d = d0.l(this);
    public final f4.b c = new f4.b(1);

    public o(s4.c cVar, zz zzVar, q qVar) {
        this.f = cVar;
        this.b = zzVar;
        this.a = qVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (!this.r) {
            if (message.what != 1) {
                return false;
            }
            m mVar = (m) message.obj;
            long j10 = mVar.a;
            long j11 = mVar.b;
            Long valueOf = Long.valueOf(j11);
            TreeMap treeMap = this.e;
            Long l10 = (Long) treeMap.get(valueOf);
            if (l10 == null) {
                treeMap.put(Long.valueOf(j11), Long.valueOf(j10));
                return true;
            }
            if (l10.longValue() > j10) {
                treeMap.put(Long.valueOf(j11), Long.valueOf(j10));
            }
        }
        return true;
    }
}
