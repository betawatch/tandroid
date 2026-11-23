package org.telegram.utils.twidget;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class s0 implements p0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ x0 b;
    public final /* synthetic */ byte[] c;

    public /* synthetic */ s0(x0 x0Var, byte[] bArr, int i7) {
        this.a = i7;
        this.b = x0Var;
        this.c = bArr;
    }

    @Override // org.telegram.utils.twidget.p0
    public final Object run() {
        switch (this.a) {
            case 0:
                x0 x0Var = this.b;
                x0Var.b.selectableText(x0Var.i1(this.c));
                return null;
            default:
                x0 x0Var2 = this.b;
                byte[] bArr = this.c;
                synchronized (x0Var2) {
                    if (bArr != null) {
                        try {
                            if (x0Var2.d.size() + bArr.length <= 16777216) {
                                x0Var2.d.write(bArr, 0, bArr.length);
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    x0Var2.d.reset();
                    throw new IllegalStateException("Widget engine: argument too large");
                }
                return null;
        }
    }
}
