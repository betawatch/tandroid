// default package

import java.lang.reflect.Modifier;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public abstract class yq7 {
    public static final Logger a = Logger.getLogger(yq7.class.getName());
    public static final HashMap b = new HashMap();

    static {
        HashSet hashSet = new HashSet();
        hashSet.add(x93.class);
        hashSet.add(zr9.class);
        hashSet.add(tf0.class);
        hashSet.add(s74.class);
        hashSet.add(xq7.class);
        hashSet.add(pu8.class);
        hashSet.add(z30.class);
        hashSet.add(t74.class);
        hashSet.add(at3.class);
        hashSet.add(o93.class);
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Class cls = (Class) it.next();
            se3 se3Var = (se3) cls.getAnnotation(se3.class);
            int[] tags = se3Var.tags();
            int objectTypeIndication = se3Var.objectTypeIndication();
            Map map = (Map) b.get(Integer.valueOf(objectTypeIndication));
            if (map == null) {
                map = new HashMap();
            }
            for (int i : tags) {
                map.put(Integer.valueOf(i), cls);
            }
            b.put(Integer.valueOf(objectTypeIndication), map);
        }
    }

    public static tf0 a(int i, ByteBuffer byteBuffer) {
        tf0 r9cVar;
        int i2 = zpe.i(byteBuffer);
        Integer valueOf = Integer.valueOf(i);
        HashMap hashMap = b;
        Map map = (Map) hashMap.get(valueOf);
        if (map == null) {
            map = (Map) hashMap.get(-1);
        }
        Class cls = (Class) map.get(Integer.valueOf(i2));
        Logger logger = a;
        if (cls == null || cls.isInterface() || Modifier.isAbstract(cls.getModifiers())) {
            logger.warning("No ObjectDescriptor found for objectTypeIndication " + Integer.toHexString(i) + " and tag " + Integer.toHexString(i2) + " found: " + cls);
            r9cVar = new r9c();
        } else {
            try {
                r9cVar = (tf0) cls.newInstance();
            } catch (Exception e) {
                logger.log(Level.SEVERE, "Couldn't instantiate BaseDescriptor class " + cls + " for objectTypeIndication " + i + " and tag " + i2, (Throwable) e);
                grb.m(e);
                return null;
            }
        }
        r9cVar.a = i2;
        int a2 = zpe.a(byteBuffer.get());
        r9cVar.b = a2 & jn7.K1;
        int i3 = 1;
        while ((a2 >>> 7) == 1) {
            a2 = zpe.a(byteBuffer.get());
            i3++;
            r9cVar.b = (r9cVar.b << 7) | (a2 & jn7.K1);
        }
        r9cVar.c = i3;
        ByteBuffer slice = byteBuffer.slice();
        slice.limit(r9cVar.b);
        r9cVar.b(slice);
        byteBuffer.position(byteBuffer.position() + r9cVar.b);
        return r9cVar;
    }
}
