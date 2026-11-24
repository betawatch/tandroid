// default package

import android.content.Context;
import android.os.Process;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class xk8 {
    public final Context a;
    public final ycb b;
    public final int c;
    public final ycb d;
    public final ycb e;
    public boolean f;

    public xk8(Context context, v8c v8cVar) {
        context.getClass();
        v8cVar.getClass();
        this.a = context;
        final byte b = 0;
        this.b = new ycb(new op4(this) { // from class: wk8
            public final /* synthetic */ xk8 b;

            {
                this.b = this;
            }

            @Override // op4
            public final Object invoke() {
                byte b2 = b;
                xk8 xk8Var = this.b;
                switch (b2) {
                    case 0:
                        return ((zk8) xk8Var.e.getValue()).a;
                    default:
                        return s4.f(xk8Var.a);
                }
            }
        });
        this.c = Process.myPid();
        this.d = new ycb(new np2(v8cVar, (byte) 2));
        final byte b2 = 1;
        this.e = new ycb(new op4(this) { // from class: wk8
            public final /* synthetic */ xk8 b;

            {
                this.b = this;
            }

            @Override // op4
            public final Object invoke() {
                byte b22 = b2;
                xk8 xk8Var = this.b;
                switch (b22) {
                    case 0:
                        return ((zk8) xk8Var.e.getValue()).a;
                    default:
                        return s4.f(xk8Var.a);
                }
            }
        });
    }

    public final String a() {
        return (String) this.b.getValue();
    }

    public final Map b(Map map) {
        ycb ycbVar = this.d;
        if (map == null) {
            Map singletonMap = Collections.singletonMap(a(), new vk8(Process.myPid(), (String) ycbVar.getValue()));
            singletonMap.getClass();
            return singletonMap;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(a(), new vk8(Process.myPid(), (String) ycbVar.getValue()));
        int size = linkedHashMap.size();
        if (size == 0) {
            return d24.a;
        }
        if (size != 1) {
            return new LinkedHashMap(linkedHashMap);
        }
        Map.Entry entry = (Map.Entry) linkedHashMap.entrySet().iterator().next();
        Map singletonMap2 = Collections.singletonMap(entry.getKey(), entry.getValue());
        singletonMap2.getClass();
        return singletonMap2;
    }
}
