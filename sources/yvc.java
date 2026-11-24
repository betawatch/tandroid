// default package

import android.util.Base64;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class yvc implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bwc b;

    public /* synthetic */ yvc(bwc bwcVar, byte b) {
        this.a = b;
        this.b = bwcVar;
    }

    private final void a() {
        bwc bwcVar = this.b;
        bwcVar.g();
        synchronized (bwcVar.a) {
            if (bwcVar.u) {
                return;
            }
            gm.d3(new yvc(bwcVar, (byte) 2), 1000L);
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
                bwc bwcVar = this.b;
                yu5 yu5Var = bwcVar.p;
                if (yu5Var != null) {
                    try {
                        if (!nwc.c.b()) {
                            throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
                        }
                        yu5Var.a.postMessage("{\"t\":\"close\"}");
                    } catch (Exception unused) {
                    }
                }
                bwcVar.g();
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
                bwc bwcVar2 = this.b;
                while (true) {
                    synchronized (bwcVar2.a) {
                        yu5 yu5Var2 = bwcVar2.p;
                        if (!bwcVar2.u && yu5Var2 != null && bwcVar2.r && !bwcVar2.n.isEmpty()) {
                            byte[] bArr = (byte[]) bwcVar2.n.removeFirst();
                            bwcVar2.w -= bArr.length;
                            try {
                                if (!bwcVar2.q) {
                                    String str = "tproxy-base64:" + Base64.encodeToString(bArr, 2);
                                    if (!nwc.c.b()) {
                                        throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
                                    }
                                    yu5Var2.a.postMessage(str);
                                } else {
                                    if (!nwc.a.b()) {
                                        throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
                                    }
                                    yu5Var2.a.postMessageWithPayload(new nz0(new evc(bArr)));
                                }
                            } catch (Exception e) {
                                fc4.g(e, true);
                                bwcVar2.h();
                                return;
                            }
                        }
                    }
                }
                break;
        }
    }
}
