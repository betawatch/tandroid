package ub;

import java.lang.reflect.Modifier;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class k {
    public static final Logger a = Logger.getLogger(k.class.getName());
    public static final HashMap b = new HashMap();

    static {
        HashSet hashSet = new HashSet();
        hashSet.add(e.class);
        hashSet.add(m.class);
        hashSet.add(b.class);
        hashSet.add(h.class);
        hashSet.add(j.class);
        hashSet.add(l.class);
        hashSet.add(a.class);
        hashSet.add(i.class);
        hashSet.add(g.class);
        hashSet.add(d.class);
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Class cls = (Class) it.next();
            f fVar = (f) cls.getAnnotation(f.class);
            int[] tags = fVar.tags();
            int objectTypeIndication = fVar.objectTypeIndication();
            Map map = (Map) b.get(Integer.valueOf(objectTypeIndication));
            if (map == null) {
                map = new HashMap();
            }
            for (int i9 : tags) {
                map.put(Integer.valueOf(i9), cls);
            }
            b.put(Integer.valueOf(objectTypeIndication), map);
        }
    }

    public static b a(int i9, ByteBuffer byteBuffer) {
        b nVar;
        int k10 = p2.b.k(byteBuffer);
        Integer valueOf = Integer.valueOf(i9);
        HashMap hashMap = b;
        Map map = (Map) hashMap.get(valueOf);
        if (map == null) {
            map = (Map) hashMap.get(-1);
        }
        Class cls = (Class) map.get(Integer.valueOf(k10));
        Logger logger = a;
        if (cls == null || cls.isInterface() || Modifier.isAbstract(cls.getModifiers())) {
            logger.warning("No ObjectDescriptor found for objectTypeIndication " + Integer.toHexString(i9) + " and tag " + Integer.toHexString(k10) + " found: " + cls);
            nVar = new n();
        } else {
            try {
                nVar = (b) cls.newInstance();
            } catch (Exception e10) {
                logger.log(Level.SEVERE, "Couldn't instantiate BaseDescriptor class " + cls + " for objectTypeIndication " + i9 + " and tag " + k10, (Throwable) e10);
                throw new RuntimeException(e10);
            }
        }
        nVar.a = k10;
        int a2 = p2.b.a(byteBuffer.get());
        nVar.b = a2 & 127;
        int i10 = 1;
        while ((a2 >>> 7) == 1) {
            a2 = p2.b.a(byteBuffer.get());
            i10++;
            nVar.b = (nVar.b << 7) | (a2 & 127);
        }
        nVar.c = i10;
        ByteBuffer slice = byteBuffer.slice();
        slice.limit(nVar.b);
        nVar.b(slice);
        byteBuffer.position(byteBuffer.position() + nVar.b);
        return nVar;
    }
}
