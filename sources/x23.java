// default package

import android.os.Bundle;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class x23 {
    public Object a;

    public x23(byte b) {
        switch (b) {
            case 2:
                this.a = new Object();
                break;
            case 3:
            default:
                this.a = new LinkedHashMap();
                break;
            case 4:
                this.a = new HashMap();
                break;
        }
    }

    public abstract Object a(Object obj);

    public Object b(w23 w23Var) {
        return null;
    }

    public final Object c(Object obj) {
        synchronized (((HashMap) this.a)) {
            if (((HashMap) this.a).containsKey(obj)) {
                return ((HashMap) this.a).get(obj);
            }
            Object a = a(obj);
            ((HashMap) this.a).put(obj, a);
            return a;
        }
    }

    public void d() {
        synchronized (this.a) {
        }
    }

    public final void e() {
        synchronized (this) {
        }
    }

    public final void f() {
        synchronized (this) {
        }
        e();
    }

    public final void g() {
        synchronized (this) {
        }
    }

    public /* synthetic */ x23(Object obj) {
        this.a = obj;
    }

    public x23(String str, Bundle bundle) {
        bundle.getClass();
        this.a = bundle;
    }

    public x23(cwc cwcVar, String str, nf5 nf5Var) {
        this.a = cwcVar;
    }
}
