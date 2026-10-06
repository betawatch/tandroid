package qi;

import android.util.Base64;
import b5.m;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes4.dex */
public final /* synthetic */ class g implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j b;

    public /* synthetic */ g(j jVar, int i10) {
        this.a = i10;
        this.b = jVar;
    }

    private final void a() {
        j jVar = this.b;
        jVar.e();
        synchronized (jVar.a) {
            try {
                if (jVar.u) {
                    return;
                }
                AndroidUtilities.runOnUIThread(new g(jVar, 2), 1000L);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0089, code lost:
    
        return;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        switch (this.a) {
            case 0:
                j jVar = this.b;
                b5.h hVar = jVar.p;
                if (hVar != null) {
                    try {
                        if (!m.c.b()) {
                            throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
                        }
                        hVar.a.postMessage("{\"t\":\"close\"}");
                    } catch (Exception unused) {
                    }
                }
                jVar.e();
                return;
            case 1:
                j.b(this.b);
                return;
            case 2:
                j.a(this.b);
                return;
            case 3:
                a();
                return;
            default:
                j jVar2 = this.b;
                while (true) {
                    synchronized (jVar2.a) {
                        b5.h hVar2 = jVar2.p;
                        if (!jVar2.u && hVar2 != null && jVar2.r && !jVar2.n.isEmpty()) {
                            byte[] bArr = (byte[]) jVar2.n.removeFirst();
                            jVar2.w -= bArr.length;
                            try {
                                if (!jVar2.q) {
                                    String str = "tproxy-base64:" + Base64.encodeToString(bArr, 2);
                                    if (!m.c.b()) {
                                        throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
                                    }
                                    hVar2.a.postMessage(str);
                                } else {
                                    if (!m.a.b()) {
                                        throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
                                    }
                                    hVar2.a.postMessageWithPayload(new se.a(new b5.j(bArr)));
                                }
                            } catch (Exception e7) {
                                FileLog.e(e7);
                                jVar2.f();
                                return;
                            }
                        }
                    }
                }
                break;
        }
    }
}
