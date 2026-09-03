package wh;

import org.telegram.messenger.voip.GroupCallMessage;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class v1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ v1(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((w1) this.b).invalidateSelf();
                break;
            case 1:
                ((d2) this.b).c();
                break;
            case 2:
                ((yg.b) this.b).invalidate();
                break;
            default:
                zg.c cVar = (zg.c) this.b;
                GroupCallMessage groupCallMessage = cVar.E;
                if (groupCallMessage != null) {
                    cVar.a.a(groupCallMessage.isSendDelayed(), true);
                    cVar.b.a(cVar.E.isSendError(), true);
                    break;
                }
                break;
        }
    }
}
