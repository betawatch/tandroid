package wb;

import java.lang.reflect.Modifier;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
            for (int i10 : tags) {
                map.put(Integer.valueOf(i10), cls);
            }
            b.put(Integer.valueOf(objectTypeIndication), map);
        }
    }

    public static b a(int i10, ByteBuffer byteBuffer) {
        b nVar;
        int k9 = r2.b.k(byteBuffer);
        Integer valueOf = Integer.valueOf(i10);
        HashMap hashMap = b;
        Map map = (Map) hashMap.get(valueOf);
        if (map == null) {
            map = (Map) hashMap.get(-1);
        }
        Class cls = (Class) map.get(Integer.valueOf(k9));
        Logger logger = a;
        if (cls == null || cls.isInterface() || Modifier.isAbstract(cls.getModifiers())) {
            logger.warning("No ObjectDescriptor found for objectTypeIndication " + Integer.toHexString(i10) + " and tag " + Integer.toHexString(k9) + " found: " + cls);
            nVar = new n();
        } else {
            try {
                nVar = (b) cls.newInstance();
            } catch (Exception e10) {
                logger.log(Level.SEVERE, "Couldn't instantiate BaseDescriptor class " + cls + " for objectTypeIndication " + i10 + " and tag " + k9, (Throwable) e10);
                throw new RuntimeException(e10);
            }
        }
        nVar.a = k9;
        int a2 = r2.b.a(byteBuffer.get());
        nVar.b = a2 & 127;
        int i11 = 1;
        while ((a2 >>> 7) == 1) {
            a2 = r2.b.a(byteBuffer.get());
            i11++;
            nVar.b = (nVar.b << 7) | (a2 & 127);
        }
        nVar.c = i11;
        ByteBuffer slice = byteBuffer.slice();
        slice.limit(nVar.b);
        nVar.b(slice);
        byteBuffer.position(byteBuffer.position() + nVar.b);
        return nVar;
    }
}
