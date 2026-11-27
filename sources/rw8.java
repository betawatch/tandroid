// default package

import java.io.ByteArrayOutputStream;
import java.util.HashMap;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class rw8 implements m34 {
    public final /* synthetic */ byte a;
    public final HashMap b;
    public final HashMap c;

    public rw8(byte b) {
        this.a = b;
        switch (b) {
            case 2:
                this.b = new HashMap();
                this.c = new HashMap();
                break;
            case 3:
                this.b = new HashMap();
                this.c = new HashMap();
                break;
            default:
                this.b = new HashMap();
                this.c = new HashMap();
                break;
        }
    }

    @Override // m34
    public final /* bridge */ /* synthetic */ m34 a(Class cls, zq7 zq7Var) {
        byte b = this.a;
        HashMap hashMap = this.c;
        HashMap hashMap2 = this.b;
        switch (b) {
            case 1:
                hashMap2.put(cls, zq7Var);
                hashMap.remove(cls);
                break;
            case 2:
                hashMap2.put(cls, zq7Var);
                hashMap.remove(cls);
                break;
            default:
                hashMap2.put(cls, zq7Var);
                hashMap.remove(cls);
                break;
        }
        return this;
    }

    public final void b(Object obj, ByteArrayOutputStream byteArrayOutputStream) {
        HashMap hashMap = this.c;
        HashMap hashMap2 = this.b;
        qw8 qw8Var = new qw8(byteArrayOutputStream, hashMap2, hashMap);
        if (obj == null) {
            return;
        }
        zq7 zq7Var = (zq7) hashMap2.get(obj.getClass());
        if (zq7Var != null) {
            zq7Var.a(obj, qw8Var);
            return;
        }
        throw new o34("No encoder for " + obj.getClass());
    }

    public rw8(HashMap hashMap, HashMap hashMap2) {
        this.a = (byte) 0;
        this.b = hashMap;
        this.c = hashMap2;
    }
}
