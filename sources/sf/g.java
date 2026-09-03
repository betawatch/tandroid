package sf;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k b;

    public /* synthetic */ g(k kVar, int i10) {
        this.a = i10;
        this.b = kVar;
    }

    private final void a() {
        k kVar = this.b;
        kVar.e();
        synchronized (kVar.a) {
            try {
                if (kVar.p) {
                    return;
                }
                AndroidUtilities.runOnUIThread(new g(kVar, 1), 1000L);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        o2.f fVar;
        byte[] bArr;
        switch (this.a) {
            case 0:
                k kVar = this.b;
                o2.f fVar2 = kVar.n;
                if (fVar2 != null) {
                    try {
                        if (!o2.k.c.b()) {
                            throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
                        }
                        fVar2.a.postMessage("{\"t\":\"close\"}");
                    } catch (Exception unused) {
                    }
                }
                kVar.e();
                return;
            case 1:
                k.a(this.b);
                return;
            case 2:
                k.b(this.b);
                return;
            case 3:
                a();
                return;
            default:
                k kVar2 = this.b;
                while (true) {
                    synchronized (kVar2.a) {
                        fVar = kVar2.n;
                        if (!kVar2.p && fVar != null && !kVar2.l.isEmpty()) {
                            bArr = (byte[]) kVar2.l.removeFirst();
                            kVar2.r -= bArr.length;
                        }
                    }
                    try {
                        if (!o2.k.a.b()) {
                            throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
                        }
                        fVar.a.postMessageWithPayload(new ee.a(new o2.h(bArr)));
                    } catch (Exception e6) {
                        FileLog.e(e6);
                        kVar2.f();
                        return;
                    }
                }
                return;
        }
    }
}
