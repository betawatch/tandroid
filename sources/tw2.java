// default package

import android.util.Log;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class tw2 implements qp4 {
    public final /* synthetic */ byte a;

    public /* synthetic */ tw2(td5 td5Var) {
        this.a = (byte) 2;
    }

    @Override // qp4
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                qw2 qw2Var = (qw2) obj;
                if (qw2Var instanceof vw2) {
                    return (vw2) qw2Var;
                }
                return null;
            case 1:
                fx2 fx2Var = (fx2) obj;
                fx2Var.getClass();
                Log.w("FirebaseSessions", "CorruptionException in session configs DataStore", fx2Var);
                return cff.e;
            default:
                ih7 ih7Var = (ih7) obj;
                Map a = ih7Var.a();
                LinkedHashMap linkedHashMap = ih7Var.a;
                Iterator it = a.entrySet().iterator();
                long j = 0;
                while (true) {
                    if (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        if (entry.getValue() instanceof Set) {
                            lg8 lg8Var = (lg8) entry.getKey();
                            Set set = (Set) entry.getValue();
                            String c = td5.c(System.currentTimeMillis());
                            if (set.contains(c)) {
                                Object[] objArr = {c};
                                HashSet hashSet = new HashSet(1);
                                Object obj2 = objArr[0];
                                Objects.requireNonNull(obj2);
                                if (hashSet.add(obj2)) {
                                    ih7Var.c(lg8Var, DesugarCollections.unmodifiableSet(hashSet));
                                    j++;
                                } else {
                                    w26.i(obj2, "duplicate element: ");
                                }
                            } else {
                                lg8Var.getClass();
                                ih7Var.b();
                                linkedHashMap.remove(lg8Var);
                            }
                        }
                    } else {
                        lg8 lg8Var2 = td5.c;
                        if (j == 0) {
                            lg8Var2.getClass();
                            ih7Var.b();
                            linkedHashMap.remove(lg8Var2);
                        } else {
                            ih7Var.c(lg8Var2, Long.valueOf(j));
                        }
                    }
                }
                return null;
        }
    }

    public /* synthetic */ tw2(byte b) {
        this.a = b;
    }
}
