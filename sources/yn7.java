// default package

import java.lang.reflect.Modifier;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public abstract class yn7 {
    public static final Logger a = Logger.getLogger(yn7.class.getName());
    public static final HashMap b = new HashMap();

    static {
        HashSet hashSet = new HashSet();
        hashSet.add(e93.class);
        hashSet.add(fo9.class);
        hashSet.add(rf0.class);
        hashSet.add(y64.class);
        hashSet.add(xn7.class);
        hashSet.add(fr8.class);
        hashSet.add(y30.class);
        hashSet.add(z64.class);
        hashSet.add(is3.class);
        hashSet.add(v83.class);
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Class cls = (Class) it.next();
            yd3 yd3Var = (yd3) cls.getAnnotation(yd3.class);
            int[] tags = yd3Var.tags();
            int objectTypeIndication = yd3Var.objectTypeIndication();
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

    public static rf0 a(int i, ByteBuffer byteBuffer) {
        rf0 r5cVar;
        int i2 = hle.i(byteBuffer);
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
            r5cVar = new r5c();
        } else {
            try {
                r5cVar = (rf0) cls.newInstance();
            } catch (Exception e) {
                logger.log(Level.SEVERE, "Couldn't instantiate BaseDescriptor class " + cls + " for objectTypeIndication " + i + " and tag " + i2, (Throwable) e);
                sdb.b(e);
                return null;
            }
        }
        r5cVar.a = i2;
        int a2 = hle.a(byteBuffer.get());
        r5cVar.b = a2 & kk7.K1;
        int i3 = 1;
        while ((a2 >>> 7) == 1) {
            a2 = hle.a(byteBuffer.get());
            i3++;
            r5cVar.b = (r5cVar.b << 7) | (a2 & kk7.K1);
        }
        r5cVar.c = i3;
        ByteBuffer slice = byteBuffer.slice();
        slice.limit(r5cVar.b);
        r5cVar.b(slice);
        byteBuffer.position(byteBuffer.position() + r5cVar.b);
        return r5cVar;
    }
}
