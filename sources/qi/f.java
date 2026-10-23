package qi;

import android.util.Base64;
import b5.j;
import b5.m;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i b;

    public /* synthetic */ f(i iVar, int i10) {
        this.a = i10;
        this.b = iVar;
    }

    private final void a() {
        i iVar = this.b;
        iVar.e();
        synchronized (iVar.a) {
            try {
                if (iVar.u) {
                    return;
                }
                AndroidUtilities.runOnUIThread(new f(iVar, 2), 1000L);
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
                i iVar = this.b;
                b5.h hVar = iVar.p;
                if (hVar != null) {
                    try {
                        if (!m.c.b()) {
                            throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
                        }
                        hVar.a.postMessage("{\"t\":\"close\"}");
                    } catch (Exception unused) {
                    }
                }
                iVar.e();
                return;
            case 1:
                i.b(this.b);
                return;
            case 2:
                i.a(this.b);
                return;
            case 3:
                a();
                return;
            default:
                i iVar2 = this.b;
                while (true) {
                    synchronized (iVar2.a) {
                        b5.h hVar2 = iVar2.p;
                        if (!iVar2.u && hVar2 != null && iVar2.r && !iVar2.n.isEmpty()) {
                            byte[] bArr = (byte[]) iVar2.n.removeFirst();
                            iVar2.w -= bArr.length;
                            try {
                                if (!iVar2.q) {
                                    String str = "tproxy-base64:" + Base64.encodeToString(bArr, 2);
                                    if (!m.c.b()) {
                                        throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
                                    }
                                    hVar2.a.postMessage(str);
                                } else {
                                    if (!m.a.b()) {
                                        throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
                                    }
                                    hVar2.a.postMessageWithPayload(new ue.a(new j(bArr)));
                                }
                            } catch (Exception e) {
                                FileLog.e(e);
                                iVar2.f();
                                return;
                            }
                        }
                    }
                }
                break;
        }
    }
}
