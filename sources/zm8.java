// default package

import android.content.Context;
import android.os.Process;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class zm8 {
    public final Context a;
    public final zeb b;
    public final int c;
    public final zeb d;
    public final zeb e;
    public boolean f;

    public zm8(Context context, wac wacVar) {
        context.getClass();
        wacVar.getClass();
        this.a = context;
        final byte b = 0;
        this.b = new zeb(new pr4(this) { // from class: ym8
            public final /* synthetic */ zm8 b;

            {
                this.b = this;
            }

            @Override // pr4
            public final Object invoke() {
                byte b2 = b;
                zm8 zm8Var = this.b;
                switch (b2) {
                    case 0:
                        return ((bn8) zm8Var.e.getValue()).a;
                    default:
                        return s4.f(zm8Var.a);
                }
            }
        });
        this.c = Process.myPid();
        this.d = new zeb(new yq2(wacVar, (byte) 2));
        final byte b2 = 1;
        this.e = new zeb(new pr4(this) { // from class: ym8
            public final /* synthetic */ zm8 b;

            {
                this.b = this;
            }

            @Override // pr4
            public final Object invoke() {
                byte b22 = b2;
                zm8 zm8Var = this.b;
                switch (b22) {
                    case 0:
                        return ((bn8) zm8Var.e.getValue()).a;
                    default:
                        return s4.f(zm8Var.a);
                }
            }
        });
    }

    public final String a() {
        return (String) this.b.getValue();
    }

    public final Map b(Map map) {
        zeb zebVar = this.d;
        if (map == null) {
            Map singletonMap = Collections.singletonMap(a(), new xm8(Process.myPid(), (String) zebVar.getValue()));
            singletonMap.getClass();
            return singletonMap;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(a(), new xm8(Process.myPid(), (String) zebVar.getValue()));
        int size = linkedHashMap.size();
        if (size == 0) {
            return o34.a;
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
