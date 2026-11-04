package ui;

import android.util.Base64;
import d5.l;
import org.telegram.messenger.a8;
import org.telegram.messenger.g0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j b;

    public /* synthetic */ g(j jVar, int i3) {
        this.a = i3;
        this.b = jVar;
    }

    private final void a() {
        j jVar = this.b;
        jVar.g();
        synchronized (jVar.a) {
            try {
                if (jVar.u) {
                    return;
                }
                g0.i3(new g(jVar, 2), 1000L);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x008a, code lost:
    
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
                d5.g gVar = jVar.p;
                if (gVar != null) {
                    try {
                        if (!l.c.b()) {
                            throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
                        }
                        gVar.a.postMessage("{\"t\":\"close\"}");
                    } catch (Exception unused) {
                    }
                }
                jVar.g();
                return;
            case 1:
                j.d(this.b);
                return;
            case 2:
                j.c(this.b);
                return;
            case 3:
                a();
                return;
            default:
                j jVar2 = this.b;
                while (true) {
                    synchronized (jVar2.a) {
                        d5.g gVar2 = jVar2.p;
                        if (!jVar2.u && gVar2 != null && jVar2.r && !jVar2.n.isEmpty()) {
                            byte[] bArr = (byte[]) jVar2.n.removeFirst();
                            jVar2.w -= bArr.length;
                            try {
                                if (!jVar2.q) {
                                    String str = "tproxy-base64:" + Base64.encodeToString(bArr, 2);
                                    if (!l.c.b()) {
                                        throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
                                    }
                                    gVar2.a.postMessage(str);
                                } else {
                                    if (!l.a.b()) {
                                        throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
                                    }
                                    gVar2.a.postMessageWithPayload(new xe.a(new d5.i(bArr)));
                                }
                            } catch (Exception e10) {
                                a8.g(e10, true);
                                jVar2.h();
                                return;
                            }
                        }
                    }
                }
                break;
        }
    }
}
