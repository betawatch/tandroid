// default package

import android.content.Context;
import android.os.Process;
import android.util.Log;
import java.util.LinkedHashSet;
import java.util.List;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class xs5 {
    public static final /* synthetic */ bv5[] d;
    public final String a;
    public final ThreadLocal b;
    public final jg8 c;

    static {
        ys8 ys8Var = new ys8(j91.NO_RECEIVER, xs5.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0);
        f59.a.getClass();
        d = new bv5[]{ys8Var};
    }

    public xs5(Context context, String str) {
        jg8 jg8Var;
        context.getClass();
        this.a = str;
        this.b = new ThreadLocal();
        final byte b = 0;
        ln8 ln8Var = new ln8((Object) new qp4(this) { // from class: us5
            public final /* synthetic */ xs5 b;

            {
                this.b = this;
            }

            @Override // qp4
            public final Object invoke(Object obj) {
                byte b2 = b;
                xs5 xs5Var = this.b;
                switch (b2) {
                    case 0:
                        fx2 fx2Var = (fx2) obj;
                        fx2Var.getClass();
                        Log.w(f59.a(xs5.class).b(), "CorruptionException in " + xs5Var.a + " DataStore running in process " + Process.myPid(), fx2Var);
                        return new ih7(true);
                    default:
                        Context context2 = (Context) obj;
                        context2.getClass();
                        String str2 = xs5Var.a;
                        LinkedHashSet linkedHashSet = xfa.a;
                        linkedHashSet.getClass();
                        return zk2.a(new vfa(context2, str2, yfa.a, new d73(linkedHashSet, null, (byte) 3), new wfa(3, null)));
                }
            }
        }, (byte) 5);
        final byte b2 = 1;
        qp4 qp4Var = new qp4(this) { // from class: us5
            public final /* synthetic */ xs5 b;

            {
                this.b = this;
            }

            @Override // qp4
            public final Object invoke(Object obj) {
                byte b22 = b2;
                xs5 xs5Var = this.b;
                switch (b22) {
                    case 0:
                        fx2 fx2Var = (fx2) obj;
                        fx2Var.getClass();
                        Log.w(f59.a(xs5.class).b(), "CorruptionException in " + xs5Var.a + " DataStore running in process " + Process.myPid(), fx2Var);
                        return new ih7(true);
                    default:
                        Context context2 = (Context) obj;
                        context2.getClass();
                        String str2 = xs5Var.a;
                        LinkedHashSet linkedHashSet = xfa.a;
                        linkedHashSet.getClass();
                        return zk2.a(new vfa(context2, str2, yfa.a, new d73(linkedHashSet, null, (byte) 3), new wfa(3, null)));
                }
            }
        };
        xb3 xb3Var = ko3.a;
        xa3 xa3Var = xa3.c;
        pbb pbbVar = new pbb();
        xa3Var.getClass();
        dw2 a = h9e.a(kud.c(xa3Var, pbbVar));
        f06 f06Var = new f06(str, ln8Var, qp4Var, a);
        d[0].getClass();
        jg8 jg8Var2 = (jg8) f06Var.c;
        if (jg8Var2 == null) {
            synchronized (f06Var.b) {
                if (((jg8) f06Var.c) == null) {
                    Context applicationContext = context.getApplicationContext();
                    applicationContext.getClass();
                    List list = (List) qp4Var.invoke(applicationContext);
                    kg8 kg8Var = new kg8((byte) 0, applicationContext, f06Var);
                    f06Var.c = new jg8(new jg8(new v73(new eb4(eef.d, cb4.c, new db4(kg8Var, (byte) 2)), zk2.a(new ai1(list, null, (byte) 3)), ln8Var, a)));
                }
                jg8Var = (jg8) f06Var.c;
                jg8Var.getClass();
            }
            jg8Var2 = jg8Var;
        }
        this.c = jg8Var2;
    }

    public final void a(qp4 qp4Var) {
    }

    public final Object b(lg8 lg8Var, Long l) {
        lg8Var.getClass();
        return ipd.a(new vs5(this, lg8Var, l, null, (byte) 0));
    }
}
