// default package

import android.util.Pair;
import java.util.HashMap;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class t61 {
    public final long a;
    public HashMap b;
    public HashMap c;
    public HashMap d;

    public t61() {
        this(240000);
    }

    public final void a(Pair pair, Object obj) {
        if (j(pair.second)) {
            HashMap hashMap = this.b;
            if (hashMap == null) {
                hashMap = new HashMap();
                this.b = hashMap;
            }
            hashMap.put(pair, obj);
        }
    }

    public boolean b(Object obj) {
        return false;
    }

    public final void c(int i, Object obj, p8c p8cVar) {
        Pair pair = new Pair(Integer.valueOf(i), obj);
        HashMap hashMap = this.c;
        byte b = 9;
        if (hashMap != null && hashMap.get(pair) != null) {
            gl.c3(new fv0(this, pair, p8cVar, b));
            return;
        }
        HashMap hashMap2 = this.b;
        Object obj2 = hashMap2 == null ? null : hashMap2.get(pair);
        if (obj2 != null && !i(pair)) {
            p8cVar.a(obj2);
        } else {
            gl.c3(new fv0(this, pair, p8cVar, b));
            e(i, obj, new e((Object) this, (Object) pair, obj, i, (byte) 4));
        }
    }

    public final void d(int i, Integer num) {
        if (this.d != null) {
            Pair pair = new Pair(Integer.valueOf(i), num);
            this.d.remove(pair);
            if (this instanceof n97) {
                h(pair.hashCode(), 0L);
            }
        }
    }

    public void e(int i, Object obj, i8c i8cVar) {
        ((e) i8cVar).a(0L, null);
    }

    public void f(int i, Object obj, long j, s61 s61Var) {
        TLRPC.TL_messages_searchCustomEmoji tL_messages_searchCustomEmoji = new TLRPC.TL_messages_searchCustomEmoji();
        tL_messages_searchCustomEmoji.emoticon = (String) obj;
        tL_messages_searchCustomEmoji.hash = j;
        ConnectionsManager.getInstance(i).sendRequest(tL_messages_searchCustomEmoji, new k97(s61Var, (byte) 3));
    }

    public final boolean i(Pair pair) {
        HashMap hashMap = this.d;
        Long l = hashMap != null ? (Long) hashMap.get(pair) : null;
        if ((this instanceof n97) && l == null) {
            int hashCode = pair.hashCode();
            l = Long.valueOf(((n97) this).e.X3.getLong("effects_last_" + hashCode, 0L));
        }
        return l == null || System.currentTimeMillis() - l.longValue() >= this.a;
    }

    public boolean j(Object obj) {
        return true;
    }

    public t61(int i) {
        this.a = i;
    }

    public void h(int i, long j) {
    }

    public void g(int i, Object obj, Object obj2) {
    }
}
