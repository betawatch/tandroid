// default package

import android.media.MediaFormat;
import j$.util.DesugarCollections;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class uj2 {
    public static final uj2 b = new uj2(new HashMap());
    public final Map a;

    public uj2(HashMap hashMap) {
        this.a = DesugarCollections.unmodifiableMap(hashMap);
    }

    public static tj2 a(MediaFormat mediaFormat, Set set) {
        tj2 tj2Var = new tj2((byte) 0);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (mediaFormat.containsKey(str)) {
                int valueTypeForKey = mediaFormat.getValueTypeForKey(str);
                HashMap hashMap = tj2Var.a;
                if (valueTypeForKey == 1) {
                    hashMap.put(str, Integer.valueOf(mediaFormat.getInteger(str)));
                } else if (valueTypeForKey == 2) {
                    hashMap.put(str, Long.valueOf(mediaFormat.getLong(str)));
                } else if (valueTypeForKey == 3) {
                    hashMap.put(str, Float.valueOf(mediaFormat.getFloat(str)));
                } else if (valueTypeForKey == 4) {
                    hashMap.put(str, mediaFormat.getString(str));
                } else if (valueTypeForKey == 5) {
                    ByteBuffer byteBuffer = mediaFormat.getByteBuffer(str);
                    if (byteBuffer == null) {
                        hashMap.put(str, null);
                    } else {
                        ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
                        allocate.put(byteBuffer.duplicate());
                        allocate.flip();
                        hashMap.put(str, allocate);
                    }
                }
            }
        }
        return tj2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof uj2) {
            return this.a.equals(((uj2) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
