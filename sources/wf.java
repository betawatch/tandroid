// default package

import java.util.HashMap;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class wf implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ p8c b;
    public final /* synthetic */ HashMap c;

    public /* synthetic */ wf(p8c p8cVar, HashMap hashMap, byte b) {
        this.a = b;
        this.b = p8cVar;
        this.c = hashMap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        HashMap hashMap = this.c;
        p8c p8cVar = this.b;
        switch (b) {
            case 0:
                p8cVar.a(hashMap);
                break;
            default:
                p8cVar.a(hashMap);
                break;
        }
    }
}
