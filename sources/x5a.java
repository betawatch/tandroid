// default package

import java.util.List;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class x5a implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ r7a b;
    public final /* synthetic */ String c;
    public final /* synthetic */ List d;

    public /* synthetic */ x5a(r7a r7aVar, String str, List list, byte b) {
        this.a = b;
        this.b = r7aVar;
        this.c = str;
        this.d = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        List list = this.d;
        String str = this.c;
        r7a r7aVar = this.b;
        switch (b) {
            case 0:
                r7aVar.r.remove(str);
                list.remove(str);
                break;
            default:
                r7aVar.r.remove(str);
                list.remove(str);
                break;
        }
    }
}
