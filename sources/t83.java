// default package

import java.io.File;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class t83 extends eeb implements fs4 {
    public final /* synthetic */ byte a;
    public byte b;
    public /* synthetic */ Object c;
    public Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t83(Object obj, px2 px2Var, byte b) {
        super(2, px2Var);
        this.a = b;
        this.e = obj;
    }

    @Override // og0
    public final px2 create(Object obj, px2 px2Var) {
        byte b = this.a;
        Object obj2 = this.e;
        switch (b) {
            case 0:
                t83 t83Var = new t83((h93) obj2, px2Var, (byte) 0);
                t83Var.c = obj;
                return t83Var;
            default:
                t83 t83Var2 = new t83((File) obj2, px2Var, (byte) 1);
                t83Var2.c = obj;
                return t83Var2;
        }
    }

    @Override // fs4
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        g7c g7cVar = g7c.a;
        switch (b) {
            case 0:
                return ((t83) create((jm4) obj, (px2) obj2)).invokeSuspend(g7cVar);
            default:
                return ((t83) create((hn8) obj, (px2) obj2)).invokeSuspend(g7cVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x009b, code lost:
    
        if (qte.a(r5, r13, r12) == r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0161, code lost:
    
        if (r12 == r6) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x010e, code lost:
    
        if (r9.c(r10, r12) == r6) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x011b, code lost:
    
        if ((r7 instanceof vh4) == false) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0165  */
    @Override // og0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        jm4 jm4Var;
        Object obj2;
        hn8 hn8Var;
        he5 he5Var;
        byte b = 2;
        byte b2 = 0;
        px2 px2Var = null;
        byte b3 = 1;
        switch (this.a) {
            case 0:
                g7c g7cVar = g7c.a;
                h93 h93Var = (h93) this.e;
                ly2 ly2Var = ly2.a;
                byte b4 = this.b;
                if (b4 == 0) {
                    tue.b(obj);
                    jm4 jm4Var2 = (jm4) this.c;
                    this.c = jm4Var2;
                    this.b = (byte) 1;
                    Object c = srd.c(h93Var.c.c(), new x83(h93Var, px2Var, b3), this);
                    if (c != ly2Var) {
                        jm4Var = jm4Var2;
                        obj = c;
                    }
                    return ly2Var;
                }
                if (b4 == 1) {
                    jm4 jm4Var3 = (jm4) this.c;
                    tue.b(obj);
                    jm4Var = jm4Var3;
                } else {
                    if (b4 != 2) {
                        if (b4 == 3) {
                            tue.b(obj);
                            return g7cVar;
                        }
                        dq9.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj2 = (e73) this.d;
                    jm4Var = (jm4) this.c;
                    tue.b(obj);
                    nm4 nm4Var = new nm4(new sz4(new mj4(new wm4(new mj4(new n83(h93Var, px2Var, b2), (kya) h93Var.h.b, b3), new o83(2, null, (byte) 0), b2), new p83(obj2, px2Var, b2), b)), new q83(h93Var, (px2) null));
                    this.c = null;
                    this.d = null;
                    this.b = (byte) 3;
                    if (!(jm4Var instanceof jpb)) {
                        throw ((jpb) jm4Var).a;
                    }
                    Object g = nm4Var.g(jm4Var, this);
                    if (g != ly2Var) {
                        g = g7cVar;
                        break;
                    }
                }
                obj2 = (iya) obj;
                if (obj2 instanceof e73) {
                    e73 e73Var = (e73) obj2;
                    Object obj3 = e73Var.b;
                    this.c = jm4Var;
                    this.d = e73Var;
                    this.b = (byte) 2;
                    break;
                } else {
                    if (obj2 instanceof o6c) {
                        dq9.m("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                        return null;
                    }
                    if (!(obj2 instanceof o39)) {
                        break;
                    } else {
                        throw ((o39) obj2).b;
                    }
                }
                nm4 nm4Var2 = new nm4(new sz4(new mj4(new wm4(new mj4(new n83(h93Var, px2Var, b2), (kya) h93Var.h.b, b3), new o83(2, null, (byte) 0), b2), new p83(obj2, px2Var, b2), b)), new q83(h93Var, (px2) null));
                this.c = null;
                this.d = null;
                this.b = (byte) 3;
                if (!(jm4Var instanceof jpb)) {
                }
                break;
            default:
                ly2 ly2Var2 = ly2.a;
                byte b5 = this.b;
                if (b5 == 0) {
                    tue.b(obj);
                    hn8Var = (hn8) this.c;
                    File file = (File) this.e;
                    wi7 wi7Var = new wi7(file, hn8Var, (byte) 0);
                    Object obj4 = xi7.b;
                    File parentFile = file.getParentFile();
                    parentFile.getClass();
                    String path = parentFile.getCanonicalFile().getPath();
                    synchronized (xi7.b) {
                        LinkedHashMap linkedHashMap = xi7.c;
                        path.getClass();
                        Object obj5 = linkedHashMap.get(path);
                        if (obj5 == null) {
                            obj5 = new xi7(path);
                            linkedHashMap.put(path, obj5);
                        }
                        xi7 xi7Var = (xi7) obj5;
                        xi7Var.a.add(wi7Var);
                        if (xi7Var.a.size() == 1) {
                            xi7Var.startWatching();
                        }
                    }
                    he5 he5Var2 = new he5(path, wi7Var, (byte) 1);
                    g7c g7cVar2 = g7c.a;
                    this.c = hn8Var;
                    this.d = he5Var2;
                    this.b = (byte) 1;
                    if (hn8Var.e.a(this, g7cVar2) != ly2Var2) {
                        he5Var = he5Var2;
                    }
                    return ly2Var2;
                }
                if (b5 != 1) {
                    if (b5 == 2) {
                        tue.b(obj);
                        return g7c.a;
                    }
                    dq9.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                he5Var = (he5) this.d;
                hn8Var = (hn8) this.c;
                tue.b(obj);
                dd4 dd4Var = new dd4(he5Var, b3);
                this.c = null;
                this.d = null;
                this.b = (byte) 2;
                break;
        }
    }
}
