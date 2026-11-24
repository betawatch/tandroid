// default package

import android.content.Context;
import android.os.Process;
import android.util.Log;
import java.util.LinkedHashSet;
import java.util.List;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class wu5 {
    public static final /* synthetic */ bx5[] d;
    public final String a;
    public final ThreadLocal b;
    public final li8 c;

    static {
        zu8 zu8Var = new zu8(sa1.NO_RECEIVER, wu5.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0);
        h79.a.getClass();
        d = new bx5[]{zu8Var};
    }

    public wu5(Context context, String str) {
        li8 li8Var;
        context.getClass();
        this.a = str;
        this.b = new ThreadLocal();
        final byte b = 0;
        ai4 ai4Var = new ai4((Object) new rr4(this) { // from class: tu5
            public final /* synthetic */ wu5 b;

            {
                this.b = this;
            }

            @Override // rr4
            public final Object invoke(Object obj) {
                byte b2 = b;
                wu5 wu5Var = this.b;
                switch (b2) {
                    case 0:
                        py2 py2Var = (py2) obj;
                        py2Var.getClass();
                        Log.w(h79.a(wu5.class).b(), "CorruptionException in " + wu5Var.a + " DataStore running in process " + Process.myPid(), py2Var);
                        return new lj7(true);
                    default:
                        Context context2 = (Context) obj;
                        context2.getClass();
                        String str2 = wu5Var.a;
                        LinkedHashSet linkedHashSet = zha.a;
                        linkedHashSet.getClass();
                        return lm2.a(new xha(context2, str2, aia.a, new p83(linkedHashSet, null, (byte) 3), new yha(3, null)));
                }
            }
        }, (byte) 28);
        final byte b2 = 1;
        rr4 rr4Var = new rr4(this) { // from class: tu5
            public final /* synthetic */ wu5 b;

            {
                this.b = this;
            }

            @Override // rr4
            public final Object invoke(Object obj) {
                byte b22 = b2;
                wu5 wu5Var = this.b;
                switch (b22) {
                    case 0:
                        py2 py2Var = (py2) obj;
                        py2Var.getClass();
                        Log.w(h79.a(wu5.class).b(), "CorruptionException in " + wu5Var.a + " DataStore running in process " + Process.myPid(), py2Var);
                        return new lj7(true);
                    default:
                        Context context2 = (Context) obj;
                        context2.getClass();
                        String str2 = wu5Var.a;
                        LinkedHashSet linkedHashSet = zha.a;
                        linkedHashSet.getClass();
                        return lm2.a(new xha(context2, str2, aia.a, new p83(linkedHashSet, null, (byte) 3), new yha(3, null)));
                }
            }
        };
        jd3 jd3Var = up3.a;
        jc3 jc3Var = jc3.c;
        rdb rdbVar = new rdb();
        jc3Var.getClass();
        nx2 a = ibe.a(nwd.c(jc3Var, rdbVar));
        f26 f26Var = new f26(str, ai4Var, rr4Var, a);
        d[0].getClass();
        li8 li8Var2 = (li8) f26Var.c;
        if (li8Var2 == null) {
            synchronized (f26Var.b) {
                if (((li8) f26Var.c) == null) {
                    Context applicationContext = context.getApplicationContext();
                    applicationContext.getClass();
                    List list = (List) rr4Var.invoke(applicationContext);
                    mi8 mi8Var = new mi8((byte) 0, applicationContext, f26Var);
                    f26Var.c = new li8(new li8(new h93(new ed4(fgf.d, cd4.c, new dd4(mi8Var, (byte) 2)), lm2.a(new hj1(list, null, (byte) 3)), ai4Var, a)));
                }
                li8Var = (li8) f26Var.c;
                li8Var.getClass();
            }
            li8Var2 = li8Var;
        }
        this.c = li8Var2;
    }

    public final void a(rr4 rr4Var) {
    }

    public final Object b(ni8 ni8Var, Long l) {
        ni8Var.getClass();
        return lrd.a(new uu5(this, ni8Var, l, null, (byte) 0));
    }
}
