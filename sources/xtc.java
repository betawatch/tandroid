// default package

import android.util.Base64;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class xtc implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ auc b;

    public /* synthetic */ xtc(auc aucVar, byte b) {
        this.a = b;
        this.b = aucVar;
    }

    private final void a() {
        auc aucVar = this.b;
        aucVar.g();
        synchronized (aucVar.a) {
            if (aucVar.u) {
                return;
            }
            gl.d3(new xtc(aucVar, (byte) 2), 1000L);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0087, code lost:
    
        return;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        switch (this.a) {
            case 0:
                auc aucVar = this.b;
                zs5 zs5Var = aucVar.p;
                if (zs5Var != null) {
                    try {
                        if (!muc.c.b()) {
                            throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
                        }
                        zs5Var.a.postMessage("{\"t\":\"close\"}");
                    } catch (Exception unused) {
                    }
                }
                aucVar.g();
                return;
            case 1:
                this.b.c();
                return;
            case 2:
                this.b.e();
                return;
            case 3:
                a();
                return;
            default:
                auc aucVar2 = this.b;
                while (true) {
                    synchronized (aucVar2.a) {
                        zs5 zs5Var2 = aucVar2.p;
                        if (!aucVar2.u && zs5Var2 != null && aucVar2.r && !aucVar2.n.isEmpty()) {
                            byte[] bArr = (byte[]) aucVar2.n.removeFirst();
                            aucVar2.w -= bArr.length;
                            try {
                                if (!aucVar2.q) {
                                    String str = "tproxy-base64:" + Base64.encodeToString(bArr, 2);
                                    if (!muc.c.b()) {
                                        throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
                                    }
                                    zs5Var2.a.postMessage(str);
                                } else {
                                    if (!muc.a.b()) {
                                        throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
                                    }
                                    zs5Var2.a.postMessageWithPayload(new gy0(new dtc(bArr)));
                                }
                            } catch (Exception e) {
                                fa4.g(e, true);
                                aucVar2.h();
                                return;
                            }
                        }
                    }
                }
                break;
        }
    }
}
