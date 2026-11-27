// default package

import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final class s25 implements Runnable {
    public volatile boolean a;
    public Runnable b;
    public final /* synthetic */ String c;
    public final /* synthetic */ long d;
    public final /* synthetic */ String e;
    public final /* synthetic */ byte[] f;
    public final /* synthetic */ icc h;
    public final /* synthetic */ c n;

    public s25(c cVar, String str, long j, String str2, byte[] bArr, icc iccVar) {
        this.n = cVar;
        this.c = str;
        this.d = j;
        this.e = str2;
        this.f = bArr;
        this.h = iccVar;
    }

    @Override // java.lang.Runnable
    public final synchronized void run() {
        if (this.a) {
            return;
        }
        this.b = this.n.b.emulateSend(this.c, this.d, this.e, this.f, new qe2((Object) this, (Object) this.h, (byte) 20));
    }
}
