package sf;

import o2.k;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j b;

    public /* synthetic */ f(j jVar, int i10) {
        this.a = i10;
        this.b = jVar;
    }

    private final void a() {
        j jVar = this.b;
        jVar.e();
        synchronized (jVar.a) {
            try {
                if (jVar.p) {
                    return;
                }
                AndroidUtilities.runOnUIThread(new f(jVar, 1), 1000L);
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
                j jVar = this.b;
                o2.f fVar2 = jVar.n;
                if (fVar2 != null) {
                    try {
                        if (!k.c.b()) {
                            throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
                        }
                        fVar2.a.postMessage("{\"t\":\"close\"}");
                    } catch (Exception unused) {
                    }
                }
                jVar.e();
                return;
            case 1:
                j.a(this.b);
                return;
            case 2:
                j.b(this.b);
                return;
            case 3:
                a();
                return;
            default:
                j jVar2 = this.b;
                while (true) {
                    synchronized (jVar2.a) {
                        fVar = jVar2.n;
                        if (!jVar2.p && fVar != null && !jVar2.l.isEmpty()) {
                            bArr = (byte[]) jVar2.l.removeFirst();
                            jVar2.r -= bArr.length;
                        }
                    }
                    try {
                        if (!k.a.b()) {
                            throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
                        }
                        fVar.a.postMessageWithPayload(new ee.a(new o2.h(bArr)));
                    } catch (Exception e6) {
                        FileLog.e(e6);
                        jVar2.f();
                        return;
                    }
                }
                return;
        }
    }
}
