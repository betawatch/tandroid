package ui;

import android.util.Base64;
import e5.k;
import org.telegram.messenger.a8;
import org.telegram.messenger.g0;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes4.dex */
public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i b;

    public /* synthetic */ f(i iVar, int i7) {
        this.a = i7;
        this.b = iVar;
    }

    private final void a() {
        i iVar = this.b;
        iVar.g();
        synchronized (iVar.a) {
            try {
                if (iVar.u) {
                    return;
                }
                g0.i3(new f(iVar, 2), 1000L);
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
                i iVar = this.b;
                e5.f fVar = iVar.p;
                if (fVar != null) {
                    try {
                        if (!k.c.b()) {
                            throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
                        }
                        fVar.a.postMessage("{\"t\":\"close\"}");
                    } catch (Exception unused) {
                    }
                }
                iVar.g();
                return;
            case 1:
                i.d(this.b);
                return;
            case 2:
                i.c(this.b);
                return;
            case 3:
                a();
                return;
            default:
                i iVar2 = this.b;
                while (true) {
                    synchronized (iVar2.a) {
                        e5.f fVar2 = iVar2.p;
                        if (!iVar2.u && fVar2 != null && iVar2.r && !iVar2.n.isEmpty()) {
                            byte[] bArr = (byte[]) iVar2.n.removeFirst();
                            iVar2.w -= bArr.length;
                            try {
                                if (!iVar2.q) {
                                    String str = "tproxy-base64:" + Base64.encodeToString(bArr, 2);
                                    if (!k.c.b()) {
                                        throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
                                    }
                                    fVar2.a.postMessage(str);
                                } else {
                                    if (!k.a.b()) {
                                        throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
                                    }
                                    fVar2.a.postMessageWithPayload(new af.a(new e5.h(bArr)));
                                }
                            } catch (Exception e10) {
                                a8.g(e10, true);
                                iVar2.h();
                                return;
                            }
                        }
                    }
                }
                break;
        }
    }
}
